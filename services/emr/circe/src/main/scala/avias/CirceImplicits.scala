package avias.emr
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val PutAutoScalingPolicyOutputEncoder: io.circe.Encoder[avias.emr.models.PutAutoScalingPolicyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson)
  }
  final implicit val SupportedProductConfigEncoder: io.circe.Encoder[avias.emr.models.SupportedProductConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Args" -> o.args.asJson)
  }
  final implicit val InstanceTypeSpecificationEncoder: io.circe.Encoder[avias.emr.models.InstanceTypeSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("BidPrice" -> o.bidPrice.asJson, "InstanceType" -> o.instanceType.asJson, "EbsBlockDevices" -> o.ebsBlockDevices.asJson, "WeightedCapacity" -> o.weightedCapacity.asJson, "BidPriceAsPercentageOfOnDemandPrice" -> o.bidPriceAsPercentageOfOnDemandPrice.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val StepExecutionStatusDetailEncoder: io.circe.Encoder[avias.emr.models.StepExecutionStatusDetail] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson)
  }
  final implicit val ListBootstrapActionsInputEncoder: io.circe.Encoder[avias.emr.models.ListBootstrapActionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val CancelStepsInputEncoder: io.circe.Encoder[avias.emr.models.CancelStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepIds" -> o.stepIds.asJson)
  }
  final implicit val RemoveTagsInputEncoder: io.circe.Encoder[avias.emr.models.RemoveTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val CreateSecurityConfigurationOutputEncoder: io.circe.Encoder[avias.emr.models.CreateSecurityConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val InstanceResizePolicyEncoder: io.circe.Encoder[avias.emr.models.InstanceResizePolicy] = io.circe.Encoder.instance { o => 
    Json.obj("InstancesToTerminate" -> o.instancesToTerminate.asJson, "InstancesToProtect" -> o.instancesToProtect.asJson, "InstanceTerminationTimeout" -> o.instanceTerminationTimeout.asJson)
  }
  final implicit val BootstrapActionDetailEncoder: io.circe.Encoder[avias.emr.models.BootstrapActionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("BootstrapActionConfig" -> o.bootstrapActionConfig.asJson)
  }
  final implicit val CreateSecurityConfigurationInputEncoder: io.circe.Encoder[avias.emr.models.CreateSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson)
  }
  final implicit val DeleteSecurityConfigurationOutputEncoder: io.circe.Encoder[avias.emr.models.DeleteSecurityConfigurationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ModifyInstanceGroupsInputEncoder: io.circe.Encoder[avias.emr.models.ModifyInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroups" -> o.instanceGroups.asJson)
  }
  final implicit val ClusterSummaryEncoder: io.circe.Encoder[avias.emr.models.ClusterSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Status" -> o.status.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson)
  }
  final implicit val AutoScalingPolicyStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.AutoScalingPolicyStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListClustersOutputEncoder: io.circe.Encoder[avias.emr.models.ListClustersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Clusters" -> o.clusters.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val AddInstanceGroupsInputEncoder: io.circe.Encoder[avias.emr.models.AddInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroups" -> o.instanceGroups.asJson, "JobFlowId" -> o.jobFlowId.asJson)
  }
  final implicit val ScalingTriggerEncoder: io.circe.Encoder[avias.emr.models.ScalingTrigger] = io.circe.Encoder.instance { o => 
    Json.obj("CloudWatchAlarmDefinition" -> o.cloudWatchAlarmDefinition.asJson)
  }
  final implicit val InstanceTimelineEncoder: io.circe.Encoder[avias.emr.models.InstanceTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val InstanceGroupStatusEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val StepStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.StepStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ModifyInstanceFleetInputEncoder: io.circe.Encoder[avias.emr.models.ModifyInstanceFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleet" -> o.instanceFleet.asJson)
  }
  final implicit val HadoopJarStepConfigEncoder: io.circe.Encoder[avias.emr.models.HadoopJarStepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Jar" -> o.jar.asJson, "MainClass" -> o.mainClass.asJson, "Properties" -> o.properties.asJson, "Args" -> o.args.asJson)
  }
  final implicit val RemoveAutoScalingPolicyOutputEncoder: io.circe.Encoder[avias.emr.models.RemoveAutoScalingPolicyOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val Ec2InstanceAttributesEncoder: io.circe.Encoder[avias.emr.models.Ec2InstanceAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("IamInstanceProfile" -> o.iamInstanceProfile.asJson, "EmrManagedMasterSecurityGroup" -> o.emrManagedMasterSecurityGroup.asJson, "ServiceAccessSecurityGroup" -> o.serviceAccessSecurityGroup.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "Ec2AvailabilityZone" -> o.ec2AvailabilityZone.asJson, "EmrManagedSlaveSecurityGroup" -> o.emrManagedSlaveSecurityGroup.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "RequestedEc2SubnetIds" -> o.requestedEc2SubnetIds.asJson, "RequestedEc2AvailabilityZones" -> o.requestedEc2AvailabilityZones.asJson, "AdditionalMasterSecurityGroups" -> o.additionalMasterSecurityGroups.asJson, "AdditionalSlaveSecurityGroups" -> o.additionalSlaveSecurityGroups.asJson)
  }
  final implicit val DescribeJobFlowsOutputEncoder: io.circe.Encoder[avias.emr.models.DescribeJobFlowsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlows" -> o.jobFlows.asJson)
  }
  final implicit val ListInstanceGroupsOutputEncoder: io.circe.Encoder[avias.emr.models.ListInstanceGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroups" -> o.instanceGroups.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val RunJobFlowOutputEncoder: io.circe.Encoder[avias.emr.models.RunJobFlowOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson)
  }
  final implicit val SpotProvisioningSpecificationEncoder: io.circe.Encoder[avias.emr.models.SpotProvisioningSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("TimeoutDurationMinutes" -> o.timeoutDurationMinutes.asJson, "TimeoutAction" -> o.timeoutAction.asJson, "BlockDurationMinutes" -> o.blockDurationMinutes.asJson)
  }
  final implicit val ScalingConstraintsEncoder: io.circe.Encoder[avias.emr.models.ScalingConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("MinCapacity" -> o.minCapacity.asJson, "MaxCapacity" -> o.maxCapacity.asJson)
  }
  final implicit val InstanceFleetTimelineEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val AddInstanceGroupsOutputEncoder: io.circe.Encoder[avias.emr.models.AddInstanceGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "InstanceGroupIds" -> o.instanceGroupIds.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[avias.emr.models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("RepoUpgradeOnBoot" -> o.repoUpgradeOnBoot.asJson, "CustomAmiId" -> o.customAmiId.asJson, "Ec2InstanceAttributes" -> o.ec2InstanceAttributes.asJson, "RunningAmiVersion" -> o.runningAmiVersion.asJson, "RequestedAmiVersion" -> o.requestedAmiVersion.asJson, "LogUri" -> o.logUri.asJson, "ServiceRole" -> o.serviceRole.asJson, "ReleaseLabel" -> o.releaseLabel.asJson, "MasterPublicDnsName" -> o.masterPublicDnsName.asJson, "Name" -> o.name.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "Applications" -> o.applications.asJson, "Tags" -> o.tags.asJson, "Status" -> o.status.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "Id" -> o.id.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson, "EbsRootVolumeSize" -> o.ebsRootVolumeSize.asJson, "AutoTerminate" -> o.autoTerminate.asJson, "TerminationProtected" -> o.terminationProtected.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Configurations" -> o.configurations.asJson, "InstanceCollectionType" -> o.instanceCollectionType.asJson)
  }
  final implicit val InstanceGroupTimelineEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val AutoScalingPolicyEncoder: io.circe.Encoder[avias.emr.models.AutoScalingPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("Constraints" -> o.constraints.asJson, "Rules" -> o.rules.asJson)
  }
  final implicit val InstanceFleetProvisioningSpecificationsEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetProvisioningSpecifications] = io.circe.Encoder.instance { o => 
    Json.obj("SpotSpecification" -> o.spotSpecification.asJson)
  }
  final implicit val JobFlowInstancesDetailEncoder: io.circe.Encoder[avias.emr.models.JobFlowInstancesDetail] = io.circe.Encoder.instance { o => 
    Json.obj("MasterInstanceType" -> o.masterInstanceType.asJson, "SlaveInstanceType" -> o.slaveInstanceType.asJson, "InstanceCount" -> o.instanceCount.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "HadoopVersion" -> o.hadoopVersion.asJson, "InstanceGroups" -> o.instanceGroups.asJson, "Placement" -> o.placement.asJson, "MasterPublicDnsName" -> o.masterPublicDnsName.asJson, "MasterInstanceId" -> o.masterInstanceId.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson, "KeepJobFlowAliveWhenNoSteps" -> o.keepJobFlowAliveWhenNoSteps.asJson, "TerminationProtected" -> o.terminationProtected.asJson)
  }
  final implicit val ShrinkPolicyEncoder: io.circe.Encoder[avias.emr.models.ShrinkPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("DecommissionTimeout" -> o.decommissionTimeout.asJson, "InstanceResizePolicy" -> o.instanceResizePolicy.asJson)
  }
  final implicit val InstanceFleetEncoder: io.circe.Encoder[avias.emr.models.InstanceFleet] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetType" -> o.instanceFleetType.asJson, "Name" -> o.name.asJson, "LaunchSpecifications" -> o.launchSpecifications.asJson, "InstanceTypeSpecifications" -> o.instanceTypeSpecifications.asJson, "Id" -> o.id.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson, "ProvisionedOnDemandCapacity" -> o.provisionedOnDemandCapacity.asJson, "ProvisionedSpotCapacity" -> o.provisionedSpotCapacity.asJson, "Status" -> o.status.asJson)
  }
  final implicit val InstanceGroupStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AddTagsOutputEncoder: io.circe.Encoder[avias.emr.models.AddTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StepTimelineEncoder: io.circe.Encoder[avias.emr.models.StepTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val ListSecurityConfigurationsOutputEncoder: io.circe.Encoder[avias.emr.models.ListSecurityConfigurationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("SecurityConfigurations" -> o.securityConfigurations.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InstanceFleetConfigEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetType" -> o.instanceFleetType.asJson, "InstanceTypeConfigs" -> o.instanceTypeConfigs.asJson, "Name" -> o.name.asJson, "LaunchSpecifications" -> o.launchSpecifications.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson)
  }
  final implicit val AddJobFlowStepsOutputEncoder: io.circe.Encoder[avias.emr.models.AddJobFlowStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StepIds" -> o.stepIds.asJson)
  }
  final implicit val InstanceGroupEncoder: io.circe.Encoder[avias.emr.models.InstanceGroup] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "InstanceType" -> o.instanceType.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "InstanceGroupType" -> o.instanceGroupType.asJson, "ShrinkPolicy" -> o.shrinkPolicy.asJson, "Market" -> o.market.asJson, "Id" -> o.id.asJson, "EbsBlockDevices" -> o.ebsBlockDevices.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "RequestedInstanceCount" -> o.requestedInstanceCount.asJson, "RunningInstanceCount" -> o.runningInstanceCount.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val ListInstancesInputEncoder: io.circe.Encoder[avias.emr.models.ListInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupTypes" -> o.instanceGroupTypes.asJson, "InstanceFleetType" -> o.instanceFleetType.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "InstanceStates" -> o.instanceStates.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ScalingActionEncoder: io.circe.Encoder[avias.emr.models.ScalingAction] = io.circe.Encoder.instance { o => 
    Json.obj("SimpleScalingPolicyConfiguration" -> o.simpleScalingPolicyConfiguration.asJson, "Market" -> o.market.asJson)
  }
  final implicit val AddInstanceFleetOutputEncoder: io.circe.Encoder[avias.emr.models.AddInstanceFleetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson)
  }
  final implicit val InstanceFleetModifyConfigEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetModifyConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetId" -> o.instanceFleetId.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson)
  }
  final implicit val InstanceGroupConfigEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceRole" -> o.instanceRole.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceCount" -> o.instanceCount.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson, "Market" -> o.market.asJson, "EbsConfiguration" -> o.ebsConfiguration.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val CancelStepsInfoEncoder: io.circe.Encoder[avias.emr.models.CancelStepsInfo] = io.circe.Encoder.instance { o => 
    Json.obj("StepId" -> o.stepId.asJson, "Status" -> o.status.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val ClusterStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.ClusterStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ConfigurationEncoder: io.circe.Encoder[avias.emr.models.Configuration] = io.circe.Encoder.instance { o => 
    Json.obj("Classification" -> o.classification.asJson, "Configurations" -> o.configurations.asJson, "Properties" -> o.properties.asJson)
  }
  final implicit val DescribeStepOutputEncoder: io.circe.Encoder[avias.emr.models.DescribeStepOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Step" -> o.step.asJson)
  }
  final implicit val BootstrapActionConfigEncoder: io.circe.Encoder[avias.emr.models.BootstrapActionConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ScriptBootstrapAction" -> o.scriptBootstrapAction.asJson)
  }
  final implicit val EbsBlockDeviceEncoder: io.circe.Encoder[avias.emr.models.EbsBlockDevice] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSpecification" -> o.volumeSpecification.asJson, "Device" -> o.device.asJson)
  }
  final implicit val ListInstanceFleetsOutputEncoder: io.circe.Encoder[avias.emr.models.ListInstanceFleetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleets" -> o.instanceFleets.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val AutoScalingPolicyStatusEncoder: io.circe.Encoder[avias.emr.models.AutoScalingPolicyStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson)
  }
  final implicit val TerminateJobFlowsInputEncoder: io.circe.Encoder[avias.emr.models.TerminateJobFlowsInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson)
  }
  final implicit val MetricDimensionEncoder: io.circe.Encoder[avias.emr.models.MetricDimension] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val EbsVolumeEncoder: io.circe.Encoder[avias.emr.models.EbsVolume] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson, "VolumeId" -> o.volumeId.asJson)
  }
  final implicit val AddTagsInputEncoder: io.circe.Encoder[avias.emr.models.AddTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val PlacementTypeEncoder: io.circe.Encoder[avias.emr.models.PlacementType] = io.circe.Encoder.instance { o => 
    Json.obj("AvailabilityZone" -> o.availabilityZone.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val ListStepsInputEncoder: io.circe.Encoder[avias.emr.models.ListStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepStates" -> o.stepStates.asJson, "StepIds" -> o.stepIds.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepSummaryEncoder: io.circe.Encoder[avias.emr.models.StepSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson, "Status" -> o.status.asJson, "Config" -> o.config.asJson)
  }
  final implicit val InstanceStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.InstanceStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AutoScalingPolicyDescriptionEncoder: io.circe.Encoder[avias.emr.models.AutoScalingPolicyDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "Constraints" -> o.constraints.asJson, "Rules" -> o.rules.asJson)
  }
  final implicit val VolumeSpecificationEncoder: io.circe.Encoder[avias.emr.models.VolumeSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeType" -> o.volumeType.asJson, "SizeInGB" -> o.sizeInGB.asJson, "Iops" -> o.iops.asJson)
  }
  final implicit val ClusterStatusEncoder: io.circe.Encoder[avias.emr.models.ClusterStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val DescribeClusterOutputEncoder: io.circe.Encoder[avias.emr.models.DescribeClusterOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val JobFlowDetailEncoder: io.circe.Encoder[avias.emr.models.JobFlowDetail] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "Name" -> o.name.asJson, "Instances" -> o.instances.asJson, "ExecutionStatusDetail" -> o.executionStatusDetail.asJson, "AmiVersion" -> o.amiVersion.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "BootstrapActions" -> o.bootstrapActions.asJson, "LogUri" -> o.logUri.asJson, "JobFlowRole" -> o.jobFlowRole.asJson, "ServiceRole" -> o.serviceRole.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "SupportedProducts" -> o.supportedProducts.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Steps" -> o.steps.asJson)
  }
  final implicit val DescribeStepInputEncoder: io.circe.Encoder[avias.emr.models.DescribeStepInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepId" -> o.stepId.asJson)
  }
  final implicit val DescribeClusterInputEncoder: io.circe.Encoder[avias.emr.models.DescribeClusterInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson)
  }
  final implicit val ListStepsOutputEncoder: io.circe.Encoder[avias.emr.models.ListStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Steps" -> o.steps.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val JobFlowExecutionStatusDetailEncoder: io.circe.Encoder[avias.emr.models.JobFlowExecutionStatusDetail] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson)
  }
  final implicit val RemoveTagsOutputEncoder: io.circe.Encoder[avias.emr.models.RemoveTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceFleetStateChangeReasonEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AddJobFlowStepsInputEncoder: io.circe.Encoder[avias.emr.models.AddJobFlowStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "Steps" -> o.steps.asJson)
  }
  final implicit val ListInstanceFleetsInputEncoder: io.circe.Encoder[avias.emr.models.ListInstanceFleetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepEncoder: io.circe.Encoder[avias.emr.models.Step] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson, "Status" -> o.status.asJson, "Config" -> o.config.asJson)
  }
  final implicit val InstanceGroupDetailEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupDetail] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceRole" -> o.instanceRole.asJson, "InstanceType" -> o.instanceType.asJson, "Market" -> o.market.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "State" -> o.state.asJson, "InstanceRequestCount" -> o.instanceRequestCount.asJson, "InstanceRunningCount" -> o.instanceRunningCount.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson, "StartDateTime" -> o.startDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val InstanceStatusEncoder: io.circe.Encoder[avias.emr.models.InstanceStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val ListInstancesOutputEncoder: io.circe.Encoder[avias.emr.models.ListInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Instances" -> o.instances.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val SecurityConfigurationSummaryEncoder: io.circe.Encoder[avias.emr.models.SecurityConfigurationSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val DescribeJobFlowsInputEncoder: io.circe.Encoder[avias.emr.models.DescribeJobFlowsInput] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAfter" -> o.createdAfter.asJson, "CreatedBefore" -> o.createdBefore.asJson, "JobFlowIds" -> o.jobFlowIds.asJson, "JobFlowStates" -> o.jobFlowStates.asJson)
  }
  final implicit val CancelStepsOutputEncoder: io.circe.Encoder[avias.emr.models.CancelStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CancelStepsInfoList" -> o.cancelStepsInfoList.asJson)
  }
  final implicit val DescribeSecurityConfigurationInputEncoder: io.circe.Encoder[avias.emr.models.DescribeSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DescribeSecurityConfigurationOutputEncoder: io.circe.Encoder[avias.emr.models.DescribeSecurityConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val EbsBlockDeviceConfigEncoder: io.circe.Encoder[avias.emr.models.EbsBlockDeviceConfig] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSpecification" -> o.volumeSpecification.asJson, "VolumesPerInstance" -> o.volumesPerInstance.asJson)
  }
  final implicit val InstanceGroupModifyConfigEncoder: io.circe.Encoder[avias.emr.models.InstanceGroupModifyConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroupId" -> o.instanceGroupId.asJson, "InstanceCount" -> o.instanceCount.asJson, "EC2InstanceIdsToTerminate" -> o.ec2InstanceIdsToTerminate.asJson, "ShrinkPolicy" -> o.shrinkPolicy.asJson)
  }
  final implicit val ListInstanceGroupsInputEncoder: io.circe.Encoder[avias.emr.models.ListInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val SetVisibleToAllUsersInputEncoder: io.circe.Encoder[avias.emr.models.SetVisibleToAllUsersInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson)
  }
  final implicit val InstanceFleetStatusEncoder: io.circe.Encoder[avias.emr.models.InstanceFleetStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val ScalingRuleEncoder: io.circe.Encoder[avias.emr.models.ScalingRule] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Action" -> o.action.asJson, "Trigger" -> o.trigger.asJson, "Description" -> o.description.asJson)
  }
  final implicit val StepStatusEncoder: io.circe.Encoder[avias.emr.models.StepStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "FailureDetails" -> o.failureDetails.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val InstanceTypeConfigEncoder: io.circe.Encoder[avias.emr.models.InstanceTypeConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceType" -> o.instanceType.asJson, "BidPrice" -> o.bidPrice.asJson, "WeightedCapacity" -> o.weightedCapacity.asJson, "BidPriceAsPercentageOfOnDemandPrice" -> o.bidPriceAsPercentageOfOnDemandPrice.asJson, "EbsConfiguration" -> o.ebsConfiguration.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val KeyValueEncoder: io.circe.Encoder[avias.emr.models.KeyValue] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ApplicationEncoder: io.circe.Encoder[avias.emr.models.Application] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Version" -> o.version.asJson, "Args" -> o.args.asJson, "AdditionalInfo" -> o.additionalInfo.asJson)
  }
  final implicit val DeleteSecurityConfigurationInputEncoder: io.circe.Encoder[avias.emr.models.DeleteSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val HadoopStepConfigEncoder: io.circe.Encoder[avias.emr.models.HadoopStepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Jar" -> o.jar.asJson, "MainClass" -> o.mainClass.asJson, "Properties" -> o.properties.asJson, "Args" -> o.args.asJson)
  }
  final implicit val RunJobFlowInputEncoder: io.circe.Encoder[avias.emr.models.RunJobFlowInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Instances" -> o.instances.asJson, "RepoUpgradeOnBoot" -> o.repoUpgradeOnBoot.asJson, "AmiVersion" -> o.amiVersion.asJson, "ReleaseLabel" -> o.releaseLabel.asJson, "CustomAmiId" -> o.customAmiId.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "Applications" -> o.applications.asJson, "BootstrapActions" -> o.bootstrapActions.asJson, "Tags" -> o.tags.asJson, "LogUri" -> o.logUri.asJson, "JobFlowRole" -> o.jobFlowRole.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "AdditionalInfo" -> o.additionalInfo.asJson, "ServiceRole" -> o.serviceRole.asJson, "EbsRootVolumeSize" -> o.ebsRootVolumeSize.asJson, "SupportedProducts" -> o.supportedProducts.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Configurations" -> o.configurations.asJson, "Steps" -> o.steps.asJson, "NewSupportedProducts" -> o.newSupportedProducts.asJson)
  }
  final implicit val StepConfigEncoder: io.circe.Encoder[avias.emr.models.StepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "HadoopJarStep" -> o.hadoopJarStep.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson)
  }
  final implicit val SetTerminationProtectionInputEncoder: io.circe.Encoder[avias.emr.models.SetTerminationProtectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson, "TerminationProtected" -> o.terminationProtected.asJson)
  }
  final implicit val EbsConfigurationEncoder: io.circe.Encoder[avias.emr.models.EbsConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("EbsBlockDeviceConfigs" -> o.ebsBlockDeviceConfigs.asJson, "EbsOptimized" -> o.ebsOptimized.asJson)
  }
  final implicit val CommandEncoder: io.circe.Encoder[avias.emr.models.Command] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ScriptPath" -> o.scriptPath.asJson, "Args" -> o.args.asJson)
  }
  final implicit val ListSecurityConfigurationsInputEncoder: io.circe.Encoder[avias.emr.models.ListSecurityConfigurationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[avias.emr.models.InternalServerError.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SimpleScalingPolicyConfigurationEncoder: io.circe.Encoder[avias.emr.models.SimpleScalingPolicyConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingAdjustment" -> o.scalingAdjustment.asJson, "CoolDown" -> o.coolDown.asJson, "AdjustmentType" -> o.adjustmentType.asJson)
  }
  final implicit val ScriptBootstrapActionConfigEncoder: io.circe.Encoder[avias.emr.models.ScriptBootstrapActionConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Path" -> o.path.asJson, "Args" -> o.args.asJson)
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[avias.emr.models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutAutoScalingPolicyInputEncoder: io.circe.Encoder[avias.emr.models.PutAutoScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[avias.emr.models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("Reason" -> o.reason.asJson, "Message" -> o.message.asJson, "LogFile" -> o.logFile.asJson)
  }
  final implicit val AddInstanceFleetInputEncoder: io.circe.Encoder[avias.emr.models.AddInstanceFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleet" -> o.instanceFleet.asJson)
  }
  final implicit val ListClustersInputEncoder: io.circe.Encoder[avias.emr.models.ListClustersInput] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAfter" -> o.createdAfter.asJson, "CreatedBefore" -> o.createdBefore.asJson, "ClusterStates" -> o.clusterStates.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepDetailEncoder: io.circe.Encoder[avias.emr.models.StepDetail] = io.circe.Encoder.instance { o => 
    Json.obj("StepConfig" -> o.stepConfig.asJson, "ExecutionStatusDetail" -> o.executionStatusDetail.asJson)
  }
  final implicit val ClusterTimelineEncoder: io.circe.Encoder[avias.emr.models.ClusterTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val RemoveAutoScalingPolicyInputEncoder: io.circe.Encoder[avias.emr.models.RemoveAutoScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson)
  }
  final implicit val ListBootstrapActionsOutputEncoder: io.circe.Encoder[avias.emr.models.ListBootstrapActionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BootstrapActions" -> o.bootstrapActions.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[avias.emr.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("ErrorCode" -> o.errorCode.asJson, "Message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.emr.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[avias.emr.models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Ec2InstanceId" -> o.ec2InstanceId.asJson, "InstanceType" -> o.instanceType.asJson, "PrivateDnsName" -> o.privateDnsName.asJson, "PublicDnsName" -> o.publicDnsName.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "PublicIpAddress" -> o.publicIpAddress.asJson, "PrivateIpAddress" -> o.privateIpAddress.asJson, "EbsVolumes" -> o.ebsVolumes.asJson, "Market" -> o.market.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val CloudWatchAlarmDefinitionEncoder: io.circe.Encoder[avias.emr.models.CloudWatchAlarmDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("MetricName" -> o.metricName.asJson, "Threshold" -> o.threshold.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "Period" -> o.period.asJson, "Namespace" -> o.namespace.asJson, "Statistic" -> o.statistic.asJson, "Dimensions" -> o.dimensions.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val JobFlowInstancesConfigEncoder: io.circe.Encoder[avias.emr.models.JobFlowInstancesConfig] = io.circe.Encoder.instance { o => 
    Json.obj("EmrManagedMasterSecurityGroup" -> o.emrManagedMasterSecurityGroup.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "ServiceAccessSecurityGroup" -> o.serviceAccessSecurityGroup.asJson, "HadoopVersion" -> o.hadoopVersion.asJson, "EmrManagedSlaveSecurityGroup" -> o.emrManagedSlaveSecurityGroup.asJson, "InstanceFleets" -> o.instanceFleets.asJson, "MasterInstanceType" -> o.masterInstanceType.asJson, "SlaveInstanceType" -> o.slaveInstanceType.asJson, "Placement" -> o.placement.asJson, "AdditionalMasterSecurityGroups" -> o.additionalMasterSecurityGroups.asJson, "AdditionalSlaveSecurityGroups" -> o.additionalSlaveSecurityGroups.asJson, "InstanceCount" -> o.instanceCount.asJson, "Ec2SubnetIds" -> o.ec2SubnetIds.asJson, "KeepJobFlowAliveWhenNoSteps" -> o.keepJobFlowAliveWhenNoSteps.asJson, "TerminationProtected" -> o.terminationProtected.asJson, "InstanceGroups" -> o.instanceGroups.asJson)
  }
  final implicit val PutAutoScalingPolicyOutputDecoder: io.circe.Decoder[avias.emr.models.PutAutoScalingPolicyOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[avias.emr.models.AutoScalingPolicyDescription]]("AutoScalingPolicy")).mapN(avias.emr.models.PutAutoScalingPolicyOutput.apply _)
  }
  final implicit val SupportedProductConfigDecoder: io.circe.Decoder[avias.emr.models.SupportedProductConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(avias.emr.models.SupportedProductConfig.apply _)
  }
  final implicit val InstanceTypeSpecificationDecoder: io.circe.Decoder[avias.emr.models.InstanceTypeSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[scala.List[avias.emr.models.EbsBlockDevice]]]("EbsBlockDevices"), o.get[scala.Option[scala.Int]]("WeightedCapacity"), o.get[scala.Option[scala.Double]]("BidPriceAsPercentageOfOnDemandPrice"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations")).mapN(avias.emr.models.InstanceTypeSpecification.apply _)
  }
  final implicit val StepExecutionStatusDetailDecoder: io.circe.Decoder[avias.emr.models.StepExecutionStatusDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("State"), o.get[java.time.Instant]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason")).mapN(avias.emr.models.StepExecutionStatusDetail.apply _)
  }
  final implicit val ListBootstrapActionsInputDecoder: io.circe.Decoder[avias.emr.models.ListBootstrapActionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListBootstrapActionsInput.apply _)
  }
  final implicit val CancelStepsInputDecoder: io.circe.Decoder[avias.emr.models.CancelStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("StepIds")).mapN(avias.emr.models.CancelStepsInput.apply _)
  }
  final implicit val RemoveTagsInputDecoder: io.circe.Decoder[avias.emr.models.RemoveTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.emr.models.RemoveTagsInput.apply _)
  }
  final implicit val CreateSecurityConfigurationOutputDecoder: io.circe.Decoder[avias.emr.models.CreateSecurityConfigurationOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.time.Instant]("CreationDateTime")).mapN(avias.emr.models.CreateSecurityConfigurationOutput.apply _)
  }
  final implicit val InstanceResizePolicyDecoder: io.circe.Decoder[avias.emr.models.InstanceResizePolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("InstancesToTerminate"), o.get[scala.Option[scala.List[java.lang.String]]]("InstancesToProtect"), o.get[scala.Option[scala.Int]]("InstanceTerminationTimeout")).mapN(avias.emr.models.InstanceResizePolicy.apply _)
  }
  final implicit val BootstrapActionDetailDecoder: io.circe.Decoder[avias.emr.models.BootstrapActionDetail] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.emr.models.BootstrapActionConfig]]("BootstrapActionConfig").map(avias.emr.models.BootstrapActionDetail.apply _)
  }
  final implicit val CreateSecurityConfigurationInputDecoder: io.circe.Decoder[avias.emr.models.CreateSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("SecurityConfiguration")).mapN(avias.emr.models.CreateSecurityConfigurationInput.apply _)
  }
  final implicit val DeleteSecurityConfigurationOutputDecoder: io.circe.Decoder[avias.emr.models.DeleteSecurityConfigurationOutput.type] = io.circe.Decoder.decodeUnit.as(avias.emr.models.DeleteSecurityConfigurationOutput)
  final implicit val ModifyInstanceGroupsInputDecoder: io.circe.Decoder[avias.emr.models.ModifyInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[scala.List[avias.emr.models.InstanceGroupModifyConfig]]]("InstanceGroups")).mapN(avias.emr.models.ModifyInstanceGroupsInput.apply _)
  }
  final implicit val ClusterSummaryDecoder: io.circe.Decoder[avias.emr.models.ClusterSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.emr.models.ClusterStatus]]("Status"), o.get[scala.Option[scala.Int]]("NormalizedInstanceHours")).mapN(avias.emr.models.ClusterSummary.apply _)
  }
  final implicit val AutoScalingPolicyStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.AutoScalingPolicyStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.AutoScalingPolicyStateChangeReason.apply _)
  }
  final implicit val ListClustersOutputDecoder: io.circe.Decoder[avias.emr.models.ListClustersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.ClusterSummary]]]("Clusters"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListClustersOutput.apply _)
  }
  final implicit val AddInstanceGroupsInputDecoder: io.circe.Decoder[avias.emr.models.AddInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.emr.models.InstanceGroupConfig]]("InstanceGroups"), o.get[java.lang.String]("JobFlowId")).mapN(avias.emr.models.AddInstanceGroupsInput.apply _)
  }
  final implicit val ScalingTriggerDecoder: io.circe.Decoder[avias.emr.models.ScalingTrigger] = io.circe.Decoder.instance { o => 
    o.get[avias.emr.models.CloudWatchAlarmDefinition]("CloudWatchAlarmDefinition").map(avias.emr.models.ScalingTrigger.apply _)
  }
  final implicit val InstanceTimelineDecoder: io.circe.Decoder[avias.emr.models.InstanceTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.InstanceTimeline.apply _)
  }
  final implicit val InstanceGroupStatusDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.InstanceGroupStateChangeReason]]("StateChangeReason"), o.get[scala.Option[avias.emr.models.InstanceGroupTimeline]]("Timeline")).mapN(avias.emr.models.InstanceGroupStatus.apply _)
  }
  final implicit val StepStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.StepStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.StepStateChangeReason.apply _)
  }
  final implicit val ModifyInstanceFleetInputDecoder: io.circe.Decoder[avias.emr.models.ModifyInstanceFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[avias.emr.models.InstanceFleetModifyConfig]("InstanceFleet")).mapN(avias.emr.models.ModifyInstanceFleetInput.apply _)
  }
  final implicit val HadoopJarStepConfigDecoder: io.circe.Decoder[avias.emr.models.HadoopJarStepConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Jar"), o.get[scala.Option[java.lang.String]]("MainClass"), o.get[scala.Option[scala.List[avias.emr.models.KeyValue]]]("Properties"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(avias.emr.models.HadoopJarStepConfig.apply _)
  }
  final implicit val RemoveAutoScalingPolicyOutputDecoder: io.circe.Decoder[avias.emr.models.RemoveAutoScalingPolicyOutput.type] = io.circe.Decoder.decodeUnit.as(avias.emr.models.RemoveAutoScalingPolicyOutput)
  final implicit val Ec2InstanceAttributesDecoder: io.circe.Decoder[avias.emr.models.Ec2InstanceAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IamInstanceProfile"), o.get[scala.Option[java.lang.String]]("EmrManagedMasterSecurityGroup"), o.get[scala.Option[java.lang.String]]("ServiceAccessSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("Ec2AvailabilityZone"), o.get[scala.Option[java.lang.String]]("EmrManagedSlaveSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[scala.List[java.lang.String]]]("RequestedEc2SubnetIds"), o.get[scala.Option[scala.List[java.lang.String]]]("RequestedEc2AvailabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalMasterSecurityGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalSlaveSecurityGroups")).mapN(avias.emr.models.Ec2InstanceAttributes.apply _)
  }
  final implicit val DescribeJobFlowsOutputDecoder: io.circe.Decoder[avias.emr.models.DescribeJobFlowsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.emr.models.JobFlowDetail]]]("JobFlows").map(avias.emr.models.DescribeJobFlowsOutput.apply _)
  }
  final implicit val ListInstanceGroupsOutputDecoder: io.circe.Decoder[avias.emr.models.ListInstanceGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.InstanceGroup]]]("InstanceGroups"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstanceGroupsOutput.apply _)
  }
  final implicit val RunJobFlowOutputDecoder: io.circe.Decoder[avias.emr.models.RunJobFlowOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("JobFlowId").map(avias.emr.models.RunJobFlowOutput.apply _)
  }
  final implicit val SpotProvisioningSpecificationDecoder: io.circe.Decoder[avias.emr.models.SpotProvisioningSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("TimeoutDurationMinutes"), o.get[java.lang.String]("TimeoutAction"), o.get[scala.Option[scala.Int]]("BlockDurationMinutes")).mapN(avias.emr.models.SpotProvisioningSpecification.apply _)
  }
  final implicit val ScalingConstraintsDecoder: io.circe.Decoder[avias.emr.models.ScalingConstraints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MinCapacity"), o.get[scala.Int]("MaxCapacity")).mapN(avias.emr.models.ScalingConstraints.apply _)
  }
  final implicit val InstanceFleetTimelineDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.InstanceFleetTimeline.apply _)
  }
  final implicit val AddInstanceGroupsOutputDecoder: io.circe.Decoder[avias.emr.models.AddInstanceGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("JobFlowId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceGroupIds")).mapN(avias.emr.models.AddInstanceGroupsOutput.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[avias.emr.models.Cluster] = io.circe.Decoder.instance { o => 
    for (`repoUpgradeOnBoot` <- o.get[scala.Option[java.lang.String]]("RepoUpgradeOnBoot"); `customAmiId` <- o.get[scala.Option[java.lang.String]]("CustomAmiId"); `ec2InstanceAttributes` <- o.get[scala.Option[avias.emr.models.Ec2InstanceAttributes]]("Ec2InstanceAttributes"); `runningAmiVersion` <- o.get[scala.Option[java.lang.String]]("RunningAmiVersion"); `requestedAmiVersion` <- o.get[scala.Option[java.lang.String]]("RequestedAmiVersion"); `logUri` <- o.get[scala.Option[java.lang.String]]("LogUri"); `serviceRole` <- o.get[scala.Option[java.lang.String]]("ServiceRole"); `releaseLabel` <- o.get[scala.Option[java.lang.String]]("ReleaseLabel"); `masterPublicDnsName` <- o.get[scala.Option[java.lang.String]]("MasterPublicDnsName"); `name` <- o.get[scala.Option[java.lang.String]]("Name"); `scaleDownBehavior` <- o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"); `applications` <- o.get[scala.Option[scala.List[avias.emr.models.Application]]]("Applications"); `tags` <- o.get[scala.Option[scala.List[avias.emr.models.Tag]]]("Tags"); `status` <- o.get[scala.Option[avias.emr.models.ClusterStatus]]("Status"); `securityConfiguration` <- o.get[scala.Option[java.lang.String]]("SecurityConfiguration"); `autoScalingRole` <- o.get[scala.Option[java.lang.String]]("AutoScalingRole"); `id` <- o.get[scala.Option[java.lang.String]]("Id"); `normalizedInstanceHours` <- o.get[scala.Option[scala.Int]]("NormalizedInstanceHours"); `ebsRootVolumeSize` <- o.get[scala.Option[scala.Int]]("EbsRootVolumeSize"); `autoTerminate` <- o.get[scala.Option[scala.Boolean]]("AutoTerminate"); `terminationProtected` <- o.get[scala.Option[scala.Boolean]]("TerminationProtected"); `visibleToAllUsers` <- o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"); `configurations` <- o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations"); `instanceCollectionType` <- o.get[scala.Option[java.lang.String]]("InstanceCollectionType")) yield avias.emr.models.Cluster(repoUpgradeOnBoot, customAmiId, ec2InstanceAttributes, runningAmiVersion, requestedAmiVersion, logUri, serviceRole, releaseLabel, masterPublicDnsName, name, scaleDownBehavior, applications, tags, status, securityConfiguration, autoScalingRole, id, normalizedInstanceHours, ebsRootVolumeSize, autoTerminate, terminationProtected, visibleToAllUsers, configurations, instanceCollectionType)
  }
  final implicit val InstanceGroupTimelineDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.InstanceGroupTimeline.apply _)
  }
  final implicit val AutoScalingPolicyDecoder: io.circe.Decoder[avias.emr.models.AutoScalingPolicy] = io.circe.Decoder.instance { o => 
    (o.get[avias.emr.models.ScalingConstraints]("Constraints"), o.get[scala.List[avias.emr.models.ScalingRule]]("Rules")).mapN(avias.emr.models.AutoScalingPolicy.apply _)
  }
  final implicit val InstanceFleetProvisioningSpecificationsDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetProvisioningSpecifications] = io.circe.Decoder.instance { o => 
    o.get[avias.emr.models.SpotProvisioningSpecification]("SpotSpecification").map(avias.emr.models.InstanceFleetProvisioningSpecifications.apply _)
  }
  final implicit val JobFlowInstancesDetailDecoder: io.circe.Decoder[avias.emr.models.JobFlowInstancesDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MasterInstanceType"), o.get[java.lang.String]("SlaveInstanceType"), o.get[scala.Int]("InstanceCount"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[java.lang.String]]("HadoopVersion"), o.get[scala.Option[scala.List[avias.emr.models.InstanceGroupDetail]]]("InstanceGroups"), o.get[scala.Option[avias.emr.models.PlacementType]]("Placement"), o.get[scala.Option[java.lang.String]]("MasterPublicDnsName"), o.get[scala.Option[java.lang.String]]("MasterInstanceId"), o.get[scala.Option[scala.Int]]("NormalizedInstanceHours"), o.get[scala.Option[scala.Boolean]]("KeepJobFlowAliveWhenNoSteps"), o.get[scala.Option[scala.Boolean]]("TerminationProtected")).mapN(avias.emr.models.JobFlowInstancesDetail.apply _)
  }
  final implicit val ShrinkPolicyDecoder: io.circe.Decoder[avias.emr.models.ShrinkPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("DecommissionTimeout"), o.get[scala.Option[avias.emr.models.InstanceResizePolicy]]("InstanceResizePolicy")).mapN(avias.emr.models.ShrinkPolicy.apply _)
  }
  final implicit val InstanceFleetDecoder: io.circe.Decoder[avias.emr.models.InstanceFleet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceFleetType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.emr.models.InstanceFleetProvisioningSpecifications]]("LaunchSpecifications"), o.get[scala.Option[scala.List[avias.emr.models.InstanceTypeSpecification]]]("InstanceTypeSpecifications"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity"), o.get[scala.Option[scala.Int]]("ProvisionedOnDemandCapacity"), o.get[scala.Option[scala.Int]]("ProvisionedSpotCapacity"), o.get[scala.Option[avias.emr.models.InstanceFleetStatus]]("Status")).mapN(avias.emr.models.InstanceFleet.apply _)
  }
  final implicit val InstanceGroupStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.InstanceGroupStateChangeReason.apply _)
  }
  final implicit val AddTagsOutputDecoder: io.circe.Decoder[avias.emr.models.AddTagsOutput.type] = io.circe.Decoder.decodeUnit.as(avias.emr.models.AddTagsOutput)
  final implicit val StepTimelineDecoder: io.circe.Decoder[avias.emr.models.StepTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.StepTimeline.apply _)
  }
  final implicit val ListSecurityConfigurationsOutputDecoder: io.circe.Decoder[avias.emr.models.ListSecurityConfigurationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.SecurityConfigurationSummary]]]("SecurityConfigurations"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListSecurityConfigurationsOutput.apply _)
  }
  final implicit val InstanceFleetConfigDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceFleetType"), o.get[scala.Option[scala.List[avias.emr.models.InstanceTypeConfig]]]("InstanceTypeConfigs"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.emr.models.InstanceFleetProvisioningSpecifications]]("LaunchSpecifications"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity")).mapN(avias.emr.models.InstanceFleetConfig.apply _)
  }
  final implicit val AddJobFlowStepsOutputDecoder: io.circe.Decoder[avias.emr.models.AddJobFlowStepsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("StepIds").map(avias.emr.models.AddJobFlowStepsOutput.apply _)
  }
  final implicit val InstanceGroupDecoder: io.circe.Decoder[avias.emr.models.InstanceGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.emr.models.InstanceGroupStatus]]("Status"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("InstanceGroupType"), o.get[scala.Option[avias.emr.models.ShrinkPolicy]]("ShrinkPolicy"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[avias.emr.models.EbsBlockDevice]]]("EbsBlockDevices"), o.get[scala.Option[avias.emr.models.AutoScalingPolicyDescription]]("AutoScalingPolicy"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[scala.Int]]("RequestedInstanceCount"), o.get[scala.Option[scala.Int]]("RunningInstanceCount"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations")).mapN(avias.emr.models.InstanceGroup.apply _)
  }
  final implicit val ListInstancesInputDecoder: io.circe.Decoder[avias.emr.models.ListInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceGroupTypes"), o.get[scala.Option[java.lang.String]]("InstanceFleetType"), o.get[scala.Option[java.lang.String]]("InstanceFleetId"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceStates"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstancesInput.apply _)
  }
  final implicit val ScalingActionDecoder: io.circe.Decoder[avias.emr.models.ScalingAction] = io.circe.Decoder.instance { o => 
    (o.get[avias.emr.models.SimpleScalingPolicyConfiguration]("SimpleScalingPolicyConfiguration"), o.get[scala.Option[java.lang.String]]("Market")).mapN(avias.emr.models.ScalingAction.apply _)
  }
  final implicit val AddInstanceFleetOutputDecoder: io.circe.Decoder[avias.emr.models.AddInstanceFleetOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[java.lang.String]]("InstanceFleetId")).mapN(avias.emr.models.AddInstanceFleetOutput.apply _)
  }
  final implicit val InstanceFleetModifyConfigDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetModifyConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceFleetId"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity")).mapN(avias.emr.models.InstanceFleetModifyConfig.apply _)
  }
  final implicit val InstanceGroupConfigDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceRole"), o.get[java.lang.String]("InstanceType"), o.get[scala.Int]("InstanceCount"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[avias.emr.models.AutoScalingPolicy]]("AutoScalingPolicy"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[avias.emr.models.EbsConfiguration]]("EbsConfiguration"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations")).mapN(avias.emr.models.InstanceGroupConfig.apply _)
  }
  final implicit val CancelStepsInfoDecoder: io.circe.Decoder[avias.emr.models.CancelStepsInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StepId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.emr.models.CancelStepsInfo.apply _)
  }
  final implicit val ClusterStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.ClusterStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.ClusterStateChangeReason.apply _)
  }
  final implicit val ConfigurationDecoder: io.circe.Decoder[avias.emr.models.Configuration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Classification"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Properties")).mapN(avias.emr.models.Configuration.apply _)
  }
  final implicit val DescribeStepOutputDecoder: io.circe.Decoder[avias.emr.models.DescribeStepOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.emr.models.Step]]("Step").map(avias.emr.models.DescribeStepOutput.apply _)
  }
  final implicit val BootstrapActionConfigDecoder: io.circe.Decoder[avias.emr.models.BootstrapActionConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.emr.models.ScriptBootstrapActionConfig]("ScriptBootstrapAction")).mapN(avias.emr.models.BootstrapActionConfig.apply _)
  }
  final implicit val EbsBlockDeviceDecoder: io.circe.Decoder[avias.emr.models.EbsBlockDevice] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.emr.models.VolumeSpecification]]("VolumeSpecification"), o.get[scala.Option[java.lang.String]]("Device")).mapN(avias.emr.models.EbsBlockDevice.apply _)
  }
  final implicit val ListInstanceFleetsOutputDecoder: io.circe.Decoder[avias.emr.models.ListInstanceFleetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.InstanceFleet]]]("InstanceFleets"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstanceFleetsOutput.apply _)
  }
  final implicit val AutoScalingPolicyStatusDecoder: io.circe.Decoder[avias.emr.models.AutoScalingPolicyStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.AutoScalingPolicyStateChangeReason]]("StateChangeReason")).mapN(avias.emr.models.AutoScalingPolicyStatus.apply _)
  }
  final implicit val TerminateJobFlowsInputDecoder: io.circe.Decoder[avias.emr.models.TerminateJobFlowsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("JobFlowIds").map(avias.emr.models.TerminateJobFlowsInput.apply _)
  }
  final implicit val MetricDimensionDecoder: io.circe.Decoder[avias.emr.models.MetricDimension] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.emr.models.MetricDimension.apply _)
  }
  final implicit val EbsVolumeDecoder: io.circe.Decoder[avias.emr.models.EbsVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Device"), o.get[scala.Option[java.lang.String]]("VolumeId")).mapN(avias.emr.models.EbsVolume.apply _)
  }
  final implicit val AddTagsInputDecoder: io.circe.Decoder[avias.emr.models.AddTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[avias.emr.models.Tag]]("Tags")).mapN(avias.emr.models.AddTagsInput.apply _)
  }
  final implicit val PlacementTypeDecoder: io.circe.Decoder[avias.emr.models.PlacementType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(avias.emr.models.PlacementType.apply _)
  }
  final implicit val ListStepsInputDecoder: io.circe.Decoder[avias.emr.models.ListStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("StepStates"), o.get[scala.Option[scala.List[java.lang.String]]]("StepIds"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListStepsInput.apply _)
  }
  final implicit val StepSummaryDecoder: io.circe.Decoder[avias.emr.models.StepSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ActionOnFailure"), o.get[scala.Option[avias.emr.models.StepStatus]]("Status"), o.get[scala.Option[avias.emr.models.HadoopStepConfig]]("Config")).mapN(avias.emr.models.StepSummary.apply _)
  }
  final implicit val InstanceStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.InstanceStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.InstanceStateChangeReason.apply _)
  }
  final implicit val AutoScalingPolicyDescriptionDecoder: io.circe.Decoder[avias.emr.models.AutoScalingPolicyDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.emr.models.AutoScalingPolicyStatus]]("Status"), o.get[scala.Option[avias.emr.models.ScalingConstraints]]("Constraints"), o.get[scala.Option[scala.List[avias.emr.models.ScalingRule]]]("Rules")).mapN(avias.emr.models.AutoScalingPolicyDescription.apply _)
  }
  final implicit val VolumeSpecificationDecoder: io.circe.Decoder[avias.emr.models.VolumeSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeType"), o.get[scala.Int]("SizeInGB"), o.get[scala.Option[scala.Int]]("Iops")).mapN(avias.emr.models.VolumeSpecification.apply _)
  }
  final implicit val ClusterStatusDecoder: io.circe.Decoder[avias.emr.models.ClusterStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.ClusterStateChangeReason]]("StateChangeReason"), o.get[scala.Option[avias.emr.models.ClusterTimeline]]("Timeline")).mapN(avias.emr.models.ClusterStatus.apply _)
  }
  final implicit val DescribeClusterOutputDecoder: io.circe.Decoder[avias.emr.models.DescribeClusterOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.emr.models.Cluster]]("Cluster").map(avias.emr.models.DescribeClusterOutput.apply _)
  }
  final implicit val JobFlowDetailDecoder: io.circe.Decoder[avias.emr.models.JobFlowDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobFlowId"), o.get[java.lang.String]("Name"), o.get[avias.emr.models.JobFlowInstancesDetail]("Instances"), o.get[avias.emr.models.JobFlowExecutionStatusDetail]("ExecutionStatusDetail"), o.get[scala.Option[java.lang.String]]("AmiVersion"), o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"), o.get[scala.Option[scala.List[avias.emr.models.BootstrapActionDetail]]]("BootstrapActions"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[java.lang.String]]("JobFlowRole"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[java.lang.String]]("AutoScalingRole"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedProducts"), o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"), o.get[scala.Option[scala.List[avias.emr.models.StepDetail]]]("Steps")).mapN(avias.emr.models.JobFlowDetail.apply _)
  }
  final implicit val DescribeStepInputDecoder: io.circe.Decoder[avias.emr.models.DescribeStepInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("StepId")).mapN(avias.emr.models.DescribeStepInput.apply _)
  }
  final implicit val DescribeClusterInputDecoder: io.circe.Decoder[avias.emr.models.DescribeClusterInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClusterId").map(avias.emr.models.DescribeClusterInput.apply _)
  }
  final implicit val ListStepsOutputDecoder: io.circe.Decoder[avias.emr.models.ListStepsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.StepSummary]]]("Steps"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListStepsOutput.apply _)
  }
  final implicit val JobFlowExecutionStatusDetailDecoder: io.circe.Decoder[avias.emr.models.JobFlowExecutionStatusDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("State"), o.get[java.time.Instant]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason")).mapN(avias.emr.models.JobFlowExecutionStatusDetail.apply _)
  }
  final implicit val RemoveTagsOutputDecoder: io.circe.Decoder[avias.emr.models.RemoveTagsOutput.type] = io.circe.Decoder.decodeUnit.as(avias.emr.models.RemoveTagsOutput)
  final implicit val InstanceFleetStateChangeReasonDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.InstanceFleetStateChangeReason.apply _)
  }
  final implicit val AddJobFlowStepsInputDecoder: io.circe.Decoder[avias.emr.models.AddJobFlowStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobFlowId"), o.get[scala.List[avias.emr.models.StepConfig]]("Steps")).mapN(avias.emr.models.AddJobFlowStepsInput.apply _)
  }
  final implicit val ListInstanceFleetsInputDecoder: io.circe.Decoder[avias.emr.models.ListInstanceFleetsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstanceFleetsInput.apply _)
  }
  final implicit val StepDecoder: io.circe.Decoder[avias.emr.models.Step] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ActionOnFailure"), o.get[scala.Option[avias.emr.models.StepStatus]]("Status"), o.get[scala.Option[avias.emr.models.HadoopStepConfig]]("Config")).mapN(avias.emr.models.Step.apply _)
  }
  final implicit val InstanceGroupDetailDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceRole"), o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("Market"), o.get[java.time.Instant]("CreationDateTime"), o.get[java.lang.String]("State"), o.get[scala.Int]("InstanceRequestCount"), o.get[scala.Int]("InstanceRunningCount"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.InstanceGroupDetail.apply _)
  }
  final implicit val InstanceStatusDecoder: io.circe.Decoder[avias.emr.models.InstanceStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.InstanceStateChangeReason]]("StateChangeReason"), o.get[scala.Option[avias.emr.models.InstanceTimeline]]("Timeline")).mapN(avias.emr.models.InstanceStatus.apply _)
  }
  final implicit val ListInstancesOutputDecoder: io.circe.Decoder[avias.emr.models.ListInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.Instance]]]("Instances"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstancesOutput.apply _)
  }
  final implicit val SecurityConfigurationSummaryDecoder: io.circe.Decoder[avias.emr.models.SecurityConfigurationSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("CreationDateTime")).mapN(avias.emr.models.SecurityConfigurationSummary.apply _)
  }
  final implicit val DescribeJobFlowsInputDecoder: io.circe.Decoder[avias.emr.models.DescribeJobFlowsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAfter"), o.get[scala.Option[java.time.Instant]]("CreatedBefore"), o.get[scala.Option[scala.List[java.lang.String]]]("JobFlowIds"), o.get[scala.Option[scala.List[java.lang.String]]]("JobFlowStates")).mapN(avias.emr.models.DescribeJobFlowsInput.apply _)
  }
  final implicit val CancelStepsOutputDecoder: io.circe.Decoder[avias.emr.models.CancelStepsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.emr.models.CancelStepsInfo]]]("CancelStepsInfoList").map(avias.emr.models.CancelStepsOutput.apply _)
  }
  final implicit val DescribeSecurityConfigurationInputDecoder: io.circe.Decoder[avias.emr.models.DescribeSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.emr.models.DescribeSecurityConfigurationInput.apply _)
  }
  final implicit val DescribeSecurityConfigurationOutputDecoder: io.circe.Decoder[avias.emr.models.DescribeSecurityConfigurationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SecurityConfiguration"), o.get[scala.Option[java.time.Instant]]("CreationDateTime")).mapN(avias.emr.models.DescribeSecurityConfigurationOutput.apply _)
  }
  final implicit val EbsBlockDeviceConfigDecoder: io.circe.Decoder[avias.emr.models.EbsBlockDeviceConfig] = io.circe.Decoder.instance { o => 
    (o.get[avias.emr.models.VolumeSpecification]("VolumeSpecification"), o.get[scala.Option[scala.Int]]("VolumesPerInstance")).mapN(avias.emr.models.EbsBlockDeviceConfig.apply _)
  }
  final implicit val InstanceGroupModifyConfigDecoder: io.circe.Decoder[avias.emr.models.InstanceGroupModifyConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceGroupId"), o.get[scala.Option[scala.Int]]("InstanceCount"), o.get[scala.Option[scala.List[java.lang.String]]]("EC2InstanceIdsToTerminate"), o.get[scala.Option[avias.emr.models.ShrinkPolicy]]("ShrinkPolicy")).mapN(avias.emr.models.InstanceGroupModifyConfig.apply _)
  }
  final implicit val ListInstanceGroupsInputDecoder: io.circe.Decoder[avias.emr.models.ListInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListInstanceGroupsInput.apply _)
  }
  final implicit val SetVisibleToAllUsersInputDecoder: io.circe.Decoder[avias.emr.models.SetVisibleToAllUsersInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("JobFlowIds"), o.get[scala.Boolean]("VisibleToAllUsers")).mapN(avias.emr.models.SetVisibleToAllUsersInput.apply _)
  }
  final implicit val InstanceFleetStatusDecoder: io.circe.Decoder[avias.emr.models.InstanceFleetStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.InstanceFleetStateChangeReason]]("StateChangeReason"), o.get[scala.Option[avias.emr.models.InstanceFleetTimeline]]("Timeline")).mapN(avias.emr.models.InstanceFleetStatus.apply _)
  }
  final implicit val ScalingRuleDecoder: io.circe.Decoder[avias.emr.models.ScalingRule] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.emr.models.ScalingAction]("Action"), o.get[avias.emr.models.ScalingTrigger]("Trigger"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.emr.models.ScalingRule.apply _)
  }
  final implicit val StepStatusDecoder: io.circe.Decoder[avias.emr.models.StepStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.emr.models.StepStateChangeReason]]("StateChangeReason"), o.get[scala.Option[avias.emr.models.FailureDetails]]("FailureDetails"), o.get[scala.Option[avias.emr.models.StepTimeline]]("Timeline")).mapN(avias.emr.models.StepStatus.apply _)
  }
  final implicit val InstanceTypeConfigDecoder: io.circe.Decoder[avias.emr.models.InstanceTypeConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceType"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[scala.Int]]("WeightedCapacity"), o.get[scala.Option[scala.Double]]("BidPriceAsPercentageOfOnDemandPrice"), o.get[scala.Option[avias.emr.models.EbsConfiguration]]("EbsConfiguration"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations")).mapN(avias.emr.models.InstanceTypeConfig.apply _)
  }
  final implicit val KeyValueDecoder: io.circe.Decoder[avias.emr.models.KeyValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.emr.models.KeyValue.apply _)
  }
  final implicit val ApplicationDecoder: io.circe.Decoder[avias.emr.models.Application] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[scala.List[java.lang.String]]]("Args"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AdditionalInfo")).mapN(avias.emr.models.Application.apply _)
  }
  final implicit val DeleteSecurityConfigurationInputDecoder: io.circe.Decoder[avias.emr.models.DeleteSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.emr.models.DeleteSecurityConfigurationInput.apply _)
  }
  final implicit val HadoopStepConfigDecoder: io.circe.Decoder[avias.emr.models.HadoopStepConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Jar"), o.get[scala.Option[java.lang.String]]("MainClass"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Properties"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(avias.emr.models.HadoopStepConfig.apply _)
  }
  final implicit val RunJobFlowInputDecoder: io.circe.Decoder[avias.emr.models.RunJobFlowInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.emr.models.JobFlowInstancesConfig]("Instances"), o.get[scala.Option[java.lang.String]]("RepoUpgradeOnBoot"), o.get[scala.Option[java.lang.String]]("AmiVersion"), o.get[scala.Option[java.lang.String]]("ReleaseLabel"), o.get[scala.Option[java.lang.String]]("CustomAmiId"), o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"), o.get[scala.Option[scala.List[avias.emr.models.Application]]]("Applications"), o.get[scala.Option[scala.List[avias.emr.models.BootstrapActionConfig]]]("BootstrapActions"), o.get[scala.Option[scala.List[avias.emr.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[java.lang.String]]("JobFlowRole"), o.get[scala.Option[java.lang.String]]("AutoScalingRole"), o.get[scala.Option[java.lang.String]]("SecurityConfiguration"), o.get[scala.Option[java.lang.String]]("AdditionalInfo"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[scala.Int]]("EbsRootVolumeSize"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedProducts"), o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"), o.get[scala.Option[scala.List[avias.emr.models.Configuration]]]("Configurations"), o.get[scala.Option[scala.List[avias.emr.models.StepConfig]]]("Steps"), o.get[scala.Option[scala.List[avias.emr.models.SupportedProductConfig]]]("NewSupportedProducts")).mapN(avias.emr.models.RunJobFlowInput.apply _)
  }
  final implicit val StepConfigDecoder: io.circe.Decoder[avias.emr.models.StepConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.emr.models.HadoopJarStepConfig]("HadoopJarStep"), o.get[scala.Option[java.lang.String]]("ActionOnFailure")).mapN(avias.emr.models.StepConfig.apply _)
  }
  final implicit val SetTerminationProtectionInputDecoder: io.circe.Decoder[avias.emr.models.SetTerminationProtectionInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("JobFlowIds"), o.get[scala.Boolean]("TerminationProtected")).mapN(avias.emr.models.SetTerminationProtectionInput.apply _)
  }
  final implicit val EbsConfigurationDecoder: io.circe.Decoder[avias.emr.models.EbsConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.EbsBlockDeviceConfig]]]("EbsBlockDeviceConfigs"), o.get[scala.Option[scala.Boolean]]("EbsOptimized")).mapN(avias.emr.models.EbsConfiguration.apply _)
  }
  final implicit val CommandDecoder: io.circe.Decoder[avias.emr.models.Command] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ScriptPath"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(avias.emr.models.Command.apply _)
  }
  final implicit val ListSecurityConfigurationsInputDecoder: io.circe.Decoder[avias.emr.models.ListSecurityConfigurationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Marker").map(avias.emr.models.ListSecurityConfigurationsInput.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[avias.emr.models.InternalServerError.type] = io.circe.Decoder.decodeUnit.as(avias.emr.models.InternalServerError)
  final implicit val SimpleScalingPolicyConfigurationDecoder: io.circe.Decoder[avias.emr.models.SimpleScalingPolicyConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("ScalingAdjustment"), o.get[scala.Option[scala.Int]]("CoolDown"), o.get[scala.Option[java.lang.String]]("AdjustmentType")).mapN(avias.emr.models.SimpleScalingPolicyConfiguration.apply _)
  }
  final implicit val ScriptBootstrapActionConfigDecoder: io.circe.Decoder[avias.emr.models.ScriptBootstrapActionConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Path"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(avias.emr.models.ScriptBootstrapActionConfig.apply _)
  }
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[avias.emr.models.InternalServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.emr.models.InternalServerException.apply _)
  }
  final implicit val PutAutoScalingPolicyInputDecoder: io.circe.Decoder[avias.emr.models.PutAutoScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("InstanceGroupId"), o.get[avias.emr.models.AutoScalingPolicy]("AutoScalingPolicy")).mapN(avias.emr.models.PutAutoScalingPolicyInput.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[avias.emr.models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Reason"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("LogFile")).mapN(avias.emr.models.FailureDetails.apply _)
  }
  final implicit val AddInstanceFleetInputDecoder: io.circe.Decoder[avias.emr.models.AddInstanceFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[avias.emr.models.InstanceFleetConfig]("InstanceFleet")).mapN(avias.emr.models.AddInstanceFleetInput.apply _)
  }
  final implicit val ListClustersInputDecoder: io.circe.Decoder[avias.emr.models.ListClustersInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAfter"), o.get[scala.Option[java.time.Instant]]("CreatedBefore"), o.get[scala.Option[scala.List[java.lang.String]]]("ClusterStates"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListClustersInput.apply _)
  }
  final implicit val StepDetailDecoder: io.circe.Decoder[avias.emr.models.StepDetail] = io.circe.Decoder.instance { o => 
    (o.get[avias.emr.models.StepConfig]("StepConfig"), o.get[avias.emr.models.StepExecutionStatusDetail]("ExecutionStatusDetail")).mapN(avias.emr.models.StepDetail.apply _)
  }
  final implicit val ClusterTimelineDecoder: io.circe.Decoder[avias.emr.models.ClusterTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(avias.emr.models.ClusterTimeline.apply _)
  }
  final implicit val RemoveAutoScalingPolicyInputDecoder: io.circe.Decoder[avias.emr.models.RemoveAutoScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("InstanceGroupId")).mapN(avias.emr.models.RemoveAutoScalingPolicyInput.apply _)
  }
  final implicit val ListBootstrapActionsOutputDecoder: io.circe.Decoder[avias.emr.models.ListBootstrapActionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.emr.models.Command]]]("BootstrapActions"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(avias.emr.models.ListBootstrapActionsOutput.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[avias.emr.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.emr.models.InvalidRequestException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.emr.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.emr.models.Tag.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[avias.emr.models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Ec2InstanceId"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("PrivateDnsName"), o.get[scala.Option[java.lang.String]]("PublicDnsName"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[java.lang.String]]("PublicIpAddress"), o.get[scala.Option[java.lang.String]]("PrivateIpAddress"), o.get[scala.Option[scala.List[avias.emr.models.EbsVolume]]]("EbsVolumes"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[java.lang.String]]("InstanceFleetId"), o.get[scala.Option[avias.emr.models.InstanceStatus]]("Status")).mapN(avias.emr.models.Instance.apply _)
  }
  final implicit val CloudWatchAlarmDefinitionDecoder: io.circe.Decoder[avias.emr.models.CloudWatchAlarmDefinition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MetricName"), o.get[scala.Double]("Threshold"), o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Int]("Period"), o.get[scala.Option[java.lang.String]]("Namespace"), o.get[scala.Option[java.lang.String]]("Statistic"), o.get[scala.Option[scala.List[avias.emr.models.MetricDimension]]]("Dimensions"), o.get[scala.Option[scala.Int]]("EvaluationPeriods"), o.get[scala.Option[java.lang.String]]("Unit")).mapN(avias.emr.models.CloudWatchAlarmDefinition.apply _)
  }
  final implicit val JobFlowInstancesConfigDecoder: io.circe.Decoder[avias.emr.models.JobFlowInstancesConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EmrManagedMasterSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("ServiceAccessSecurityGroup"), o.get[scala.Option[java.lang.String]]("HadoopVersion"), o.get[scala.Option[java.lang.String]]("EmrManagedSlaveSecurityGroup"), o.get[scala.Option[scala.List[avias.emr.models.InstanceFleetConfig]]]("InstanceFleets"), o.get[scala.Option[java.lang.String]]("MasterInstanceType"), o.get[scala.Option[java.lang.String]]("SlaveInstanceType"), o.get[scala.Option[avias.emr.models.PlacementType]]("Placement"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalMasterSecurityGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalSlaveSecurityGroups"), o.get[scala.Option[scala.Int]]("InstanceCount"), o.get[scala.Option[scala.List[java.lang.String]]]("Ec2SubnetIds"), o.get[scala.Option[scala.Boolean]]("KeepJobFlowAliveWhenNoSteps"), o.get[scala.Option[scala.Boolean]]("TerminationProtected"), o.get[scala.Option[scala.List[avias.emr.models.InstanceGroupConfig]]]("InstanceGroups")).mapN(avias.emr.models.JobFlowInstancesConfig.apply _)
  }
}