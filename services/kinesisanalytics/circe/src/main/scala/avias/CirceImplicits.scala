package avias.kinesisanalytics
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val InputProcessingConfigurationUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputProcessingConfigurationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("InputLambdaProcessorUpdate" -> o.inputLambdaProcessorUpdate.asJson)
  }
  final implicit val AddApplicationCloudWatchLoggingOptionRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "CloudWatchLoggingOption" -> o.cloudWatchLoggingOption.asJson)
  }
  final implicit val ListApplicationsRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ListApplicationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "ExclusiveStartApplicationName" -> o.exclusiveStartApplicationName.asJson)
  }
  final implicit val AddApplicationOutputRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationOutputRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "Output" -> o.output.asJson)
  }
  final implicit val InputLambdaProcessorUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputLambdaProcessorUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNUpdate" -> o.resourceARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val AddApplicationInputResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationInputResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationReferenceDataSourceResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InputProcessingConfigurationEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputProcessingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("InputLambdaProcessor" -> o.inputLambdaProcessor.asJson)
  }
  final implicit val SourceSchemaEncoder: io.circe.Encoder[avias.kinesisanalytics.models.SourceSchema] = io.circe.Encoder.instance { o => 
    Json.obj("RecordFormat" -> o.recordFormat.asJson, "RecordColumns" -> o.recordColumns.asJson, "RecordEncoding" -> o.recordEncoding.asJson)
  }
  final implicit val ResourceProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ResourceProvisionedThroughputExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KinesisStreamsOutputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsOutputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val KinesisFirehoseOutputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseOutputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val InvalidArgumentExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InvalidArgumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InputStartingPositionConfigurationEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputStartingPositionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("InputStartingPosition" -> o.inputStartingPosition.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddApplicationReferenceDataSourceRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationReferenceDataSourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "ReferenceDataSource" -> o.referenceDataSource.asJson)
  }
  final implicit val KinesisStreamsInputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsInputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val DeleteApplicationReferenceDataSourceRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "ReferenceId" -> o.referenceId.asJson)
  }
  final implicit val CSVMappingParametersEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CSVMappingParameters] = io.circe.Encoder.instance { o => 
    Json.obj("RecordRowDelimiter" -> o.recordRowDelimiter.asJson, "RecordColumnDelimiter" -> o.recordColumnDelimiter.asJson)
  }
  final implicit val ReferenceDataSourceUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ReferenceDataSourceUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ReferenceId" -> o.referenceId.asJson, "TableNameUpdate" -> o.tableNameUpdate.asJson, "S3ReferenceDataSourceUpdate" -> o.s3ReferenceDataSourceUpdate.asJson, "ReferenceSchemaUpdate" -> o.referenceSchemaUpdate.asJson)
  }
  final implicit val StopApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.StopApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson)
  }
  final implicit val ServiceUnavailableExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ServiceUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteApplicationOutputRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationOutputRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "OutputId" -> o.outputId.asJson)
  }
  final implicit val InputParallelismUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputParallelismUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("CountUpdate" -> o.countUpdate.asJson)
  }
  final implicit val KinesisFirehoseInputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val ListApplicationsResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ListApplicationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationSummaries" -> o.applicationSummaries.asJson, "HasMoreApplications" -> o.hasMoreApplications.asJson)
  }
  final implicit val InputConfigurationEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "InputStartingPositionConfiguration" -> o.inputStartingPositionConfiguration.asJson)
  }
  final implicit val DeleteApplicationInputProcessingConfigurationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AddApplicationInputProcessingConfigurationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationInputProcessingConfigurationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "InputId" -> o.inputId.asJson)
  }
  final implicit val OutputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.Output] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DestinationSchema" -> o.destinationSchema.asJson, "KinesisStreamsOutput" -> o.kinesisStreamsOutput.asJson, "KinesisFirehoseOutput" -> o.kinesisFirehoseOutput.asJson)
  }
  final implicit val S3ReferenceDataSourceUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.S3ReferenceDataSourceUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("BucketARNUpdate" -> o.bucketARNUpdate.asJson, "FileKeyUpdate" -> o.fileKeyUpdate.asJson, "ReferenceRoleARNUpdate" -> o.referenceRoleARNUpdate.asJson)
  }
  final implicit val OutputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.OutputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("OutputId" -> o.outputId.asJson, "NameUpdate" -> o.nameUpdate.asJson, "KinesisStreamsOutputUpdate" -> o.kinesisStreamsOutputUpdate.asJson, "KinesisFirehoseOutputUpdate" -> o.kinesisFirehoseOutputUpdate.asJson, "DestinationSchemaUpdate" -> o.destinationSchemaUpdate.asJson)
  }
  final implicit val JSONMappingParametersEncoder: io.circe.Encoder[avias.kinesisanalytics.models.JSONMappingParameters] = io.circe.Encoder.instance { o => 
    Json.obj("RecordRowPath" -> o.recordRowPath.asJson)
  }
  final implicit val StartApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.StartApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val KinesisStreamsInputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsInputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNUpdate" -> o.resourceARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val DeleteApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationDetailEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ApplicationDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationVersionId" -> o.applicationVersionId.asJson, "ApplicationStatus" -> o.applicationStatus.asJson, "ApplicationARN" -> o.applicationARN.asJson, "ApplicationName" -> o.applicationName.asJson, "CreateTimestamp" -> o.createTimestamp.asJson, "LastUpdateTimestamp" -> o.lastUpdateTimestamp.asJson, "InputDescriptions" -> o.inputDescriptions.asJson, "CloudWatchLoggingOptionDescriptions" -> o.cloudWatchLoggingOptionDescriptions.asJson, "OutputDescriptions" -> o.outputDescriptions.asJson, "ApplicationCode" -> o.applicationCode.asJson, "ReferenceDataSourceDescriptions" -> o.referenceDataSourceDescriptions.asJson, "ApplicationDescription" -> o.applicationDescription.asJson)
  }
  final implicit val DiscoverInputSchemaResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DiscoverInputSchemaResponse] = io.circe.Encoder.instance { o => 
    Json.obj("InputSchema" -> o.inputSchema.asJson, "ParsedInputRecords" -> o.parsedInputRecords.asJson, "ProcessedInputRecords" -> o.processedInputRecords.asJson, "RawInputRecords" -> o.rawInputRecords.asJson)
  }
  final implicit val KinesisStreamsOutputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsOutputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNUpdate" -> o.resourceARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val OutputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.OutputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "KinesisStreamsOutputDescription" -> o.kinesisStreamsOutputDescription.asJson, "KinesisFirehoseOutputDescription" -> o.kinesisFirehoseOutputDescription.asJson, "OutputId" -> o.outputId.asJson, "DestinationSchema" -> o.destinationSchema.asJson)
  }
  final implicit val DescribeApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DescribeApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson)
  }
  final implicit val UnableToDetectSchemaExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.UnableToDetectSchemaException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "RawInputRecords" -> o.rawInputRecords.asJson, "ProcessedInputRecords" -> o.processedInputRecords.asJson)
  }
  final implicit val UpdateApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.UpdateApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "ApplicationUpdate" -> o.applicationUpdate.asJson)
  }
  final implicit val AddApplicationInputRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationInputRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "Input" -> o.input.asJson)
  }
  final implicit val CloudWatchLoggingOptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CloudWatchLoggingOption] = io.circe.Encoder.instance { o => 
    Json.obj("LogStreamARN" -> o.logStreamARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val KinesisStreamsOutputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val DeleteApplicationOutputResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationOutputResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InputProcessingConfigurationDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputProcessingConfigurationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("InputLambdaProcessorDescription" -> o.inputLambdaProcessorDescription.asJson)
  }
  final implicit val AddApplicationInputProcessingConfigurationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "InputId" -> o.inputId.asJson, "InputProcessingConfiguration" -> o.inputProcessingConfiguration.asJson)
  }
  final implicit val ApplicationSummaryEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ApplicationSummary] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "ApplicationARN" -> o.applicationARN.asJson, "ApplicationStatus" -> o.applicationStatus.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CloudWatchLoggingOptionUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CloudWatchLoggingOptionUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("CloudWatchLoggingOptionId" -> o.cloudWatchLoggingOptionId.asJson, "LogStreamARNUpdate" -> o.logStreamARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val DiscoverInputSchemaRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DiscoverInputSchemaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InputProcessingConfiguration" -> o.inputProcessingConfiguration.asJson, "InputStartingPositionConfiguration" -> o.inputStartingPositionConfiguration.asJson, "S3Configuration" -> o.s3Configuration.asJson, "RoleARN" -> o.roleARN.asJson, "ResourceARN" -> o.resourceARN.asJson)
  }
  final implicit val S3ReferenceDataSourceDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.S3ReferenceDataSourceDescription] = io.circe.Encoder.instance { o => 
    Json.obj("BucketARN" -> o.bucketARN.asJson, "FileKey" -> o.fileKey.asJson, "ReferenceRoleARN" -> o.referenceRoleARN.asJson)
  }
  final implicit val CloudWatchLoggingOptionDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CloudWatchLoggingOptionDescription] = io.circe.Encoder.instance { o => 
    Json.obj("LogStreamARN" -> o.logStreamARN.asJson, "RoleARN" -> o.roleARN.asJson, "CloudWatchLoggingOptionId" -> o.cloudWatchLoggingOptionId.asJson)
  }
  final implicit val InputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("InputId" -> o.inputId.asJson, "InputProcessingConfigurationUpdate" -> o.inputProcessingConfigurationUpdate.asJson, "NamePrefixUpdate" -> o.namePrefixUpdate.asJson, "InputParallelismUpdate" -> o.inputParallelismUpdate.asJson, "KinesisStreamsInputUpdate" -> o.kinesisStreamsInputUpdate.asJson, "InputSchemaUpdate" -> o.inputSchemaUpdate.asJson, "KinesisFirehoseInputUpdate" -> o.kinesisFirehoseInputUpdate.asJson)
  }
  final implicit val S3ConfigurationEncoder: io.circe.Encoder[avias.kinesisanalytics.models.S3Configuration] = io.circe.Encoder.instance { o => 
    Json.obj("RoleARN" -> o.roleARN.asJson, "BucketARN" -> o.bucketARN.asJson, "FileKey" -> o.fileKey.asJson)
  }
  final implicit val CreateApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CreateApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "Outputs" -> o.outputs.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "Inputs" -> o.inputs.asJson, "ApplicationCode" -> o.applicationCode.asJson, "ApplicationDescription" -> o.applicationDescription.asJson)
  }
  final implicit val S3ReferenceDataSourceEncoder: io.circe.Encoder[avias.kinesisanalytics.models.S3ReferenceDataSource] = io.circe.Encoder.instance { o => 
    Json.obj("BucketARN" -> o.bucketARN.asJson, "FileKey" -> o.fileKey.asJson, "ReferenceRoleARN" -> o.referenceRoleARN.asJson)
  }
  final implicit val AddApplicationOutputResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationOutputResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RecordColumnEncoder: io.circe.Encoder[avias.kinesisanalytics.models.RecordColumn] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "SqlType" -> o.sqlType.asJson, "Mapping" -> o.mapping.asJson)
  }
  final implicit val InputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.Input] = io.circe.Encoder.instance { o => 
    Json.obj("NamePrefix" -> o.namePrefix.asJson, "InputSchema" -> o.inputSchema.asJson, "InputProcessingConfiguration" -> o.inputProcessingConfiguration.asJson, "KinesisFirehoseInput" -> o.kinesisFirehoseInput.asJson, "InputParallelism" -> o.inputParallelism.asJson, "KinesisStreamsInput" -> o.kinesisStreamsInput.asJson)
  }
  final implicit val StopApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.StopApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CreateTimestamp" -> o.createTimestamp.asJson)
  }
  final implicit val UpdateApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.UpdateApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CreateApplicationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationSummary" -> o.applicationSummary.asJson)
  }
  final implicit val KinesisFirehoseOutputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseOutputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNUpdate" -> o.resourceARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val InputLambdaProcessorDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputLambdaProcessorDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val InvalidApplicationConfigurationExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InvalidApplicationConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MappingParametersEncoder: io.circe.Encoder[avias.kinesisanalytics.models.MappingParameters] = io.circe.Encoder.instance { o => 
    Json.obj("JSONMappingParameters" -> o.jsonmappingParameters.asJson, "CSVMappingParameters" -> o.csvmappingParameters.asJson)
  }
  final implicit val ReferenceDataSourceDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ReferenceDataSourceDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ReferenceId" -> o.referenceId.asJson, "TableName" -> o.tableName.asJson, "S3ReferenceDataSourceDescription" -> o.s3ReferenceDataSourceDescription.asJson, "ReferenceSchema" -> o.referenceSchema.asJson)
  }
  final implicit val DeleteApplicationCloudWatchLoggingOptionResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InputLambdaProcessorEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputLambdaProcessor] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val AddApplicationReferenceDataSourceResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationReferenceDataSourceResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InputParallelismEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputParallelism] = io.circe.Encoder.instance { o => 
    Json.obj("Count" -> o.count.asJson)
  }
  final implicit val KinesisStreamsInputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisStreamsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val DestinationSchemaEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DestinationSchema] = io.circe.Encoder.instance { o => 
    Json.obj("RecordFormatType" -> o.recordFormatType.asJson)
  }
  final implicit val KinesisFirehoseInputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseInputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val CodeValidationExceptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.CodeValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KinesisFirehoseOutputEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val DeleteApplicationCloudWatchLoggingOptionRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "CurrentApplicationVersionId" -> o.currentApplicationVersionId.asJson, "CloudWatchLoggingOptionId" -> o.cloudWatchLoggingOptionId.asJson)
  }
  final implicit val ApplicationUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ApplicationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("InputUpdates" -> o.inputUpdates.asJson, "ReferenceDataSourceUpdates" -> o.referenceDataSourceUpdates.asJson, "CloudWatchLoggingOptionUpdates" -> o.cloudWatchLoggingOptionUpdates.asJson, "ApplicationCodeUpdate" -> o.applicationCodeUpdate.asJson, "OutputUpdates" -> o.outputUpdates.asJson)
  }
  final implicit val AddApplicationCloudWatchLoggingOptionResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InputSchemaUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputSchemaUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("RecordFormatUpdate" -> o.recordFormatUpdate.asJson, "RecordEncodingUpdate" -> o.recordEncodingUpdate.asJson, "RecordColumnUpdates" -> o.recordColumnUpdates.asJson)
  }
  final implicit val RecordFormatEncoder: io.circe.Encoder[avias.kinesisanalytics.models.RecordFormat] = io.circe.Encoder.instance { o => 
    Json.obj("RecordFormatType" -> o.recordFormatType.asJson, "MappingParameters" -> o.mappingParameters.asJson)
  }
  final implicit val InputDescriptionEncoder: io.circe.Encoder[avias.kinesisanalytics.models.InputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("NamePrefix" -> o.namePrefix.asJson, "InputSchema" -> o.inputSchema.asJson, "InputStartingPositionConfiguration" -> o.inputStartingPositionConfiguration.asJson, "KinesisStreamsInputDescription" -> o.kinesisStreamsInputDescription.asJson, "InAppStreamNames" -> o.inAppStreamNames.asJson, "InputProcessingConfigurationDescription" -> o.inputProcessingConfigurationDescription.asJson, "InputId" -> o.inputId.asJson, "InputParallelism" -> o.inputParallelism.asJson, "KinesisFirehoseInputDescription" -> o.kinesisFirehoseInputDescription.asJson)
  }
  final implicit val DescribeApplicationResponseEncoder: io.circe.Encoder[avias.kinesisanalytics.models.DescribeApplicationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationDetail" -> o.applicationDetail.asJson)
  }
  final implicit val StartApplicationRequestEncoder: io.circe.Encoder[avias.kinesisanalytics.models.StartApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ApplicationName" -> o.applicationName.asJson, "InputConfigurations" -> o.inputConfigurations.asJson)
  }
  final implicit val ReferenceDataSourceEncoder: io.circe.Encoder[avias.kinesisanalytics.models.ReferenceDataSource] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "ReferenceSchema" -> o.referenceSchema.asJson, "S3ReferenceDataSource" -> o.s3ReferenceDataSource.asJson)
  }
  final implicit val KinesisFirehoseInputUpdateEncoder: io.circe.Encoder[avias.kinesisanalytics.models.KinesisFirehoseInputUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNUpdate" -> o.resourceARNUpdate.asJson, "RoleARNUpdate" -> o.roleARNUpdate.asJson)
  }
  final implicit val InputProcessingConfigurationUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputProcessingConfigurationUpdate] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesisanalytics.models.InputLambdaProcessorUpdate]("InputLambdaProcessorUpdate").map(avias.kinesisanalytics.models.InputProcessingConfigurationUpdate.apply _)
  }
  final implicit val AddApplicationCloudWatchLoggingOptionRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[avias.kinesisanalytics.models.CloudWatchLoggingOption]("CloudWatchLoggingOption")).mapN(avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionRequest.apply _)
  }
  final implicit val ListApplicationsRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ListApplicationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartApplicationName")).mapN(avias.kinesisanalytics.models.ListApplicationsRequest.apply _)
  }
  final implicit val AddApplicationOutputRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationOutputRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[avias.kinesisanalytics.models.Output]("Output")).mapN(avias.kinesisanalytics.models.AddApplicationOutputRequest.apply _)
  }
  final implicit val InputLambdaProcessorUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputLambdaProcessorUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.InputLambdaProcessorUpdate.apply _)
  }
  final implicit val AddApplicationInputResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationInputResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.AddApplicationInputResponse)
  final implicit val DeleteApplicationReferenceDataSourceResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceResponse)
  final implicit val InputProcessingConfigurationDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputProcessingConfiguration] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesisanalytics.models.InputLambdaProcessor]("InputLambdaProcessor").map(avias.kinesisanalytics.models.InputProcessingConfiguration.apply _)
  }
  final implicit val SourceSchemaDecoder: io.circe.Decoder[avias.kinesisanalytics.models.SourceSchema] = io.circe.Decoder.instance { o => 
    (o.get[avias.kinesisanalytics.models.RecordFormat]("RecordFormat"), o.get[scala.List[avias.kinesisanalytics.models.RecordColumn]]("RecordColumns"), o.get[scala.Option[java.lang.String]]("RecordEncoding")).mapN(avias.kinesisanalytics.models.SourceSchema.apply _)
  }
  final implicit val ResourceProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ResourceProvisionedThroughputExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.ResourceProvisionedThroughputExceededException.apply _)
  }
  final implicit val KinesisStreamsOutputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsOutputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisStreamsOutputDescription.apply _)
  }
  final implicit val KinesisFirehoseOutputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseOutputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisFirehoseOutputDescription.apply _)
  }
  final implicit val InvalidArgumentExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InvalidArgumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.InvalidArgumentException.apply _)
  }
  final implicit val InputStartingPositionConfigurationDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputStartingPositionConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("InputStartingPosition").map(avias.kinesisanalytics.models.InputStartingPositionConfiguration.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.LimitExceededException.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.ConcurrentModificationException.apply _)
  }
  final implicit val AddApplicationReferenceDataSourceRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationReferenceDataSourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[avias.kinesisanalytics.models.ReferenceDataSource]("ReferenceDataSource")).mapN(avias.kinesisanalytics.models.AddApplicationReferenceDataSourceRequest.apply _)
  }
  final implicit val KinesisStreamsInputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsInputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisStreamsInputDescription.apply _)
  }
  final implicit val DeleteApplicationReferenceDataSourceRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[java.lang.String]("ReferenceId")).mapN(avias.kinesisanalytics.models.DeleteApplicationReferenceDataSourceRequest.apply _)
  }
  final implicit val CSVMappingParametersDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CSVMappingParameters] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RecordRowDelimiter"), o.get[java.lang.String]("RecordColumnDelimiter")).mapN(avias.kinesisanalytics.models.CSVMappingParameters.apply _)
  }
  final implicit val ReferenceDataSourceUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ReferenceDataSourceUpdate] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReferenceId"), o.get[scala.Option[java.lang.String]]("TableNameUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.S3ReferenceDataSourceUpdate]]("S3ReferenceDataSourceUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.SourceSchema]]("ReferenceSchemaUpdate")).mapN(avias.kinesisanalytics.models.ReferenceDataSourceUpdate.apply _)
  }
  final implicit val StopApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.StopApplicationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ApplicationName").map(avias.kinesisanalytics.models.StopApplicationRequest.apply _)
  }
  final implicit val ServiceUnavailableExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ServiceUnavailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.ServiceUnavailableException.apply _)
  }
  final implicit val DeleteApplicationOutputRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationOutputRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[java.lang.String]("OutputId")).mapN(avias.kinesisanalytics.models.DeleteApplicationOutputRequest.apply _)
  }
  final implicit val InputParallelismUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputParallelismUpdate] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("CountUpdate").map(avias.kinesisanalytics.models.InputParallelismUpdate.apply _)
  }
  final implicit val KinesisFirehoseInputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisFirehoseInput.apply _)
  }
  final implicit val ListApplicationsResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ListApplicationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.kinesisanalytics.models.ApplicationSummary]]("ApplicationSummaries"), o.get[scala.Boolean]("HasMoreApplications")).mapN(avias.kinesisanalytics.models.ListApplicationsResponse.apply _)
  }
  final implicit val InputConfigurationDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[avias.kinesisanalytics.models.InputStartingPositionConfiguration]("InputStartingPositionConfiguration")).mapN(avias.kinesisanalytics.models.InputConfiguration.apply _)
  }
  final implicit val DeleteApplicationInputProcessingConfigurationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationResponse)
  final implicit val AddApplicationInputProcessingConfigurationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationResponse)
  final implicit val DeleteApplicationInputProcessingConfigurationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[java.lang.String]("InputId")).mapN(avias.kinesisanalytics.models.DeleteApplicationInputProcessingConfigurationRequest.apply _)
  }
  final implicit val OutputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.Output] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[avias.kinesisanalytics.models.DestinationSchema]("DestinationSchema"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsOutput]]("KinesisStreamsOutput"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseOutput]]("KinesisFirehoseOutput")).mapN(avias.kinesisanalytics.models.Output.apply _)
  }
  final implicit val S3ReferenceDataSourceUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.S3ReferenceDataSourceUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BucketARNUpdate"), o.get[scala.Option[java.lang.String]]("FileKeyUpdate"), o.get[scala.Option[java.lang.String]]("ReferenceRoleARNUpdate")).mapN(avias.kinesisanalytics.models.S3ReferenceDataSourceUpdate.apply _)
  }
  final implicit val OutputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.OutputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OutputId"), o.get[scala.Option[java.lang.String]]("NameUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsOutputUpdate]]("KinesisStreamsOutputUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseOutputUpdate]]("KinesisFirehoseOutputUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.DestinationSchema]]("DestinationSchemaUpdate")).mapN(avias.kinesisanalytics.models.OutputUpdate.apply _)
  }
  final implicit val JSONMappingParametersDecoder: io.circe.Decoder[avias.kinesisanalytics.models.JSONMappingParameters] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RecordRowPath").map(avias.kinesisanalytics.models.JSONMappingParameters.apply _)
  }
  final implicit val StartApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.StartApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.StartApplicationResponse)
  final implicit val KinesisStreamsInputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsInputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.KinesisStreamsInputUpdate.apply _)
  }
  final implicit val DeleteApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.DeleteApplicationResponse)
  final implicit val ApplicationDetailDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ApplicationDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("ApplicationVersionId"), o.get[java.lang.String]("ApplicationStatus"), o.get[java.lang.String]("ApplicationARN"), o.get[java.lang.String]("ApplicationName"), o.get[scala.Option[java.time.Instant]]("CreateTimestamp"), o.get[scala.Option[java.time.Instant]]("LastUpdateTimestamp"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.InputDescription]]]("InputDescriptions"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.CloudWatchLoggingOptionDescription]]]("CloudWatchLoggingOptionDescriptions"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.OutputDescription]]]("OutputDescriptions"), o.get[scala.Option[java.lang.String]]("ApplicationCode"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.ReferenceDataSourceDescription]]]("ReferenceDataSourceDescriptions"), o.get[scala.Option[java.lang.String]]("ApplicationDescription")).mapN(avias.kinesisanalytics.models.ApplicationDetail.apply _)
  }
  final implicit val DiscoverInputSchemaResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DiscoverInputSchemaResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisanalytics.models.SourceSchema]]("InputSchema"), o.get[scala.Option[scala.List[scala.List[java.lang.String]]]]("ParsedInputRecords"), o.get[scala.Option[scala.List[java.lang.String]]]("ProcessedInputRecords"), o.get[scala.Option[scala.List[java.lang.String]]]("RawInputRecords")).mapN(avias.kinesisanalytics.models.DiscoverInputSchemaResponse.apply _)
  }
  final implicit val KinesisStreamsOutputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsOutputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.KinesisStreamsOutputUpdate.apply _)
  }
  final implicit val OutputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.OutputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsOutputDescription]]("KinesisStreamsOutputDescription"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseOutputDescription]]("KinesisFirehoseOutputDescription"), o.get[scala.Option[java.lang.String]]("OutputId"), o.get[scala.Option[avias.kinesisanalytics.models.DestinationSchema]]("DestinationSchema")).mapN(avias.kinesisanalytics.models.OutputDescription.apply _)
  }
  final implicit val DescribeApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DescribeApplicationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ApplicationName").map(avias.kinesisanalytics.models.DescribeApplicationRequest.apply _)
  }
  final implicit val UnableToDetectSchemaExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.UnableToDetectSchemaException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.List[java.lang.String]]]("RawInputRecords"), o.get[scala.Option[scala.List[java.lang.String]]]("ProcessedInputRecords")).mapN(avias.kinesisanalytics.models.UnableToDetectSchemaException.apply _)
  }
  final implicit val UpdateApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.UpdateApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[avias.kinesisanalytics.models.ApplicationUpdate]("ApplicationUpdate")).mapN(avias.kinesisanalytics.models.UpdateApplicationRequest.apply _)
  }
  final implicit val AddApplicationInputRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationInputRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[avias.kinesisanalytics.models.Input]("Input")).mapN(avias.kinesisanalytics.models.AddApplicationInputRequest.apply _)
  }
  final implicit val CloudWatchLoggingOptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CloudWatchLoggingOption] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LogStreamARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.CloudWatchLoggingOption.apply _)
  }
  final implicit val KinesisStreamsOutputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisStreamsOutput.apply _)
  }
  final implicit val DeleteApplicationOutputResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationOutputResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.DeleteApplicationOutputResponse)
  final implicit val InputProcessingConfigurationDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputProcessingConfigurationDescription] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.kinesisanalytics.models.InputLambdaProcessorDescription]]("InputLambdaProcessorDescription").map(avias.kinesisanalytics.models.InputProcessingConfigurationDescription.apply _)
  }
  final implicit val AddApplicationInputProcessingConfigurationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[java.lang.String]("InputId"), o.get[avias.kinesisanalytics.models.InputProcessingConfiguration]("InputProcessingConfiguration")).mapN(avias.kinesisanalytics.models.AddApplicationInputProcessingConfigurationRequest.apply _)
  }
  final implicit val ApplicationSummaryDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ApplicationSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[java.lang.String]("ApplicationARN"), o.get[java.lang.String]("ApplicationStatus")).mapN(avias.kinesisanalytics.models.ApplicationSummary.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.ResourceNotFoundException.apply _)
  }
  final implicit val CloudWatchLoggingOptionUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CloudWatchLoggingOptionUpdate] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CloudWatchLoggingOptionId"), o.get[scala.Option[java.lang.String]]("LogStreamARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.CloudWatchLoggingOptionUpdate.apply _)
  }
  final implicit val DiscoverInputSchemaRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DiscoverInputSchemaRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisanalytics.models.InputProcessingConfiguration]]("InputProcessingConfiguration"), o.get[scala.Option[avias.kinesisanalytics.models.InputStartingPositionConfiguration]]("InputStartingPositionConfiguration"), o.get[scala.Option[avias.kinesisanalytics.models.S3Configuration]]("S3Configuration"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("ResourceARN")).mapN(avias.kinesisanalytics.models.DiscoverInputSchemaRequest.apply _)
  }
  final implicit val S3ReferenceDataSourceDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.S3ReferenceDataSourceDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("FileKey"), o.get[java.lang.String]("ReferenceRoleARN")).mapN(avias.kinesisanalytics.models.S3ReferenceDataSourceDescription.apply _)
  }
  final implicit val CloudWatchLoggingOptionDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CloudWatchLoggingOptionDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("LogStreamARN"), o.get[java.lang.String]("RoleARN"), o.get[scala.Option[java.lang.String]]("CloudWatchLoggingOptionId")).mapN(avias.kinesisanalytics.models.CloudWatchLoggingOptionDescription.apply _)
  }
  final implicit val InputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InputId"), o.get[scala.Option[avias.kinesisanalytics.models.InputProcessingConfigurationUpdate]]("InputProcessingConfigurationUpdate"), o.get[scala.Option[java.lang.String]]("NamePrefixUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.InputParallelismUpdate]]("InputParallelismUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsInputUpdate]]("KinesisStreamsInputUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.InputSchemaUpdate]]("InputSchemaUpdate"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseInputUpdate]]("KinesisFirehoseInputUpdate")).mapN(avias.kinesisanalytics.models.InputUpdate.apply _)
  }
  final implicit val S3ConfigurationDecoder: io.circe.Decoder[avias.kinesisanalytics.models.S3Configuration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("FileKey")).mapN(avias.kinesisanalytics.models.S3Configuration.apply _)
  }
  final implicit val CreateApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CreateApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.Output]]]("Outputs"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.CloudWatchLoggingOption]]]("CloudWatchLoggingOptions"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.Input]]]("Inputs"), o.get[scala.Option[java.lang.String]]("ApplicationCode"), o.get[scala.Option[java.lang.String]]("ApplicationDescription")).mapN(avias.kinesisanalytics.models.CreateApplicationRequest.apply _)
  }
  final implicit val S3ReferenceDataSourceDecoder: io.circe.Decoder[avias.kinesisanalytics.models.S3ReferenceDataSource] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("FileKey"), o.get[java.lang.String]("ReferenceRoleARN")).mapN(avias.kinesisanalytics.models.S3ReferenceDataSource.apply _)
  }
  final implicit val AddApplicationOutputResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationOutputResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.AddApplicationOutputResponse)
  final implicit val RecordColumnDecoder: io.circe.Decoder[avias.kinesisanalytics.models.RecordColumn] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("SqlType"), o.get[scala.Option[java.lang.String]]("Mapping")).mapN(avias.kinesisanalytics.models.RecordColumn.apply _)
  }
  final implicit val InputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.Input] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NamePrefix"), o.get[avias.kinesisanalytics.models.SourceSchema]("InputSchema"), o.get[scala.Option[avias.kinesisanalytics.models.InputProcessingConfiguration]]("InputProcessingConfiguration"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseInput]]("KinesisFirehoseInput"), o.get[scala.Option[avias.kinesisanalytics.models.InputParallelism]]("InputParallelism"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsInput]]("KinesisStreamsInput")).mapN(avias.kinesisanalytics.models.Input.apply _)
  }
  final implicit val StopApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.StopApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.StopApplicationResponse)
  final implicit val DeleteApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[java.time.Instant]("CreateTimestamp")).mapN(avias.kinesisanalytics.models.DeleteApplicationRequest.apply _)
  }
  final implicit val UpdateApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.UpdateApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.UpdateApplicationResponse)
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.ResourceInUseException.apply _)
  }
  final implicit val CreateApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CreateApplicationResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesisanalytics.models.ApplicationSummary]("ApplicationSummary").map(avias.kinesisanalytics.models.CreateApplicationResponse.apply _)
  }
  final implicit val KinesisFirehoseOutputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseOutputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.KinesisFirehoseOutputUpdate.apply _)
  }
  final implicit val InputLambdaProcessorDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputLambdaProcessorDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("RoleARN")).mapN(avias.kinesisanalytics.models.InputLambdaProcessorDescription.apply _)
  }
  final implicit val InvalidApplicationConfigurationExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InvalidApplicationConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.InvalidApplicationConfigurationException.apply _)
  }
  final implicit val MappingParametersDecoder: io.circe.Decoder[avias.kinesisanalytics.models.MappingParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisanalytics.models.JSONMappingParameters]]("JSONMappingParameters"), o.get[scala.Option[avias.kinesisanalytics.models.CSVMappingParameters]]("CSVMappingParameters")).mapN(avias.kinesisanalytics.models.MappingParameters.apply _)
  }
  final implicit val ReferenceDataSourceDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ReferenceDataSourceDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ReferenceId"), o.get[java.lang.String]("TableName"), o.get[avias.kinesisanalytics.models.S3ReferenceDataSourceDescription]("S3ReferenceDataSourceDescription"), o.get[scala.Option[avias.kinesisanalytics.models.SourceSchema]]("ReferenceSchema")).mapN(avias.kinesisanalytics.models.ReferenceDataSourceDescription.apply _)
  }
  final implicit val DeleteApplicationCloudWatchLoggingOptionResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionResponse)
  final implicit val InputLambdaProcessorDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputLambdaProcessor] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.InputLambdaProcessor.apply _)
  }
  final implicit val AddApplicationReferenceDataSourceResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationReferenceDataSourceResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.AddApplicationReferenceDataSourceResponse)
  final implicit val InputParallelismDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputParallelism] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("Count").map(avias.kinesisanalytics.models.InputParallelism.apply _)
  }
  final implicit val KinesisStreamsInputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisStreamsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisStreamsInput.apply _)
  }
  final implicit val DestinationSchemaDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DestinationSchema] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("RecordFormatType").map(avias.kinesisanalytics.models.DestinationSchema.apply _)
  }
  final implicit val KinesisFirehoseInputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseInputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisFirehoseInputDescription.apply _)
  }
  final implicit val CodeValidationExceptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.CodeValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisanalytics.models.CodeValidationException.apply _)
  }
  final implicit val KinesisFirehoseOutputDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisanalytics.models.KinesisFirehoseOutput.apply _)
  }
  final implicit val DeleteApplicationCloudWatchLoggingOptionRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.Long]("CurrentApplicationVersionId"), o.get[java.lang.String]("CloudWatchLoggingOptionId")).mapN(avias.kinesisanalytics.models.DeleteApplicationCloudWatchLoggingOptionRequest.apply _)
  }
  final implicit val ApplicationUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ApplicationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.kinesisanalytics.models.InputUpdate]]]("InputUpdates"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.ReferenceDataSourceUpdate]]]("ReferenceDataSourceUpdates"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.CloudWatchLoggingOptionUpdate]]]("CloudWatchLoggingOptionUpdates"), o.get[scala.Option[java.lang.String]]("ApplicationCodeUpdate"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.OutputUpdate]]]("OutputUpdates")).mapN(avias.kinesisanalytics.models.ApplicationUpdate.apply _)
  }
  final implicit val AddApplicationCloudWatchLoggingOptionResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisanalytics.models.AddApplicationCloudWatchLoggingOptionResponse)
  final implicit val InputSchemaUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputSchemaUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisanalytics.models.RecordFormat]]("RecordFormatUpdate"), o.get[scala.Option[java.lang.String]]("RecordEncodingUpdate"), o.get[scala.Option[scala.List[avias.kinesisanalytics.models.RecordColumn]]]("RecordColumnUpdates")).mapN(avias.kinesisanalytics.models.InputSchemaUpdate.apply _)
  }
  final implicit val RecordFormatDecoder: io.circe.Decoder[avias.kinesisanalytics.models.RecordFormat] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RecordFormatType"), o.get[scala.Option[avias.kinesisanalytics.models.MappingParameters]]("MappingParameters")).mapN(avias.kinesisanalytics.models.RecordFormat.apply _)
  }
  final implicit val InputDescriptionDecoder: io.circe.Decoder[avias.kinesisanalytics.models.InputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamePrefix"), o.get[scala.Option[avias.kinesisanalytics.models.SourceSchema]]("InputSchema"), o.get[scala.Option[avias.kinesisanalytics.models.InputStartingPositionConfiguration]]("InputStartingPositionConfiguration"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisStreamsInputDescription]]("KinesisStreamsInputDescription"), o.get[scala.Option[scala.List[java.lang.String]]]("InAppStreamNames"), o.get[scala.Option[avias.kinesisanalytics.models.InputProcessingConfigurationDescription]]("InputProcessingConfigurationDescription"), o.get[scala.Option[java.lang.String]]("InputId"), o.get[scala.Option[avias.kinesisanalytics.models.InputParallelism]]("InputParallelism"), o.get[scala.Option[avias.kinesisanalytics.models.KinesisFirehoseInputDescription]]("KinesisFirehoseInputDescription")).mapN(avias.kinesisanalytics.models.InputDescription.apply _)
  }
  final implicit val DescribeApplicationResponseDecoder: io.circe.Decoder[avias.kinesisanalytics.models.DescribeApplicationResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesisanalytics.models.ApplicationDetail]("ApplicationDetail").map(avias.kinesisanalytics.models.DescribeApplicationResponse.apply _)
  }
  final implicit val StartApplicationRequestDecoder: io.circe.Decoder[avias.kinesisanalytics.models.StartApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ApplicationName"), o.get[scala.List[avias.kinesisanalytics.models.InputConfiguration]]("InputConfigurations")).mapN(avias.kinesisanalytics.models.StartApplicationRequest.apply _)
  }
  final implicit val ReferenceDataSourceDecoder: io.circe.Decoder[avias.kinesisanalytics.models.ReferenceDataSource] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[avias.kinesisanalytics.models.SourceSchema]("ReferenceSchema"), o.get[scala.Option[avias.kinesisanalytics.models.S3ReferenceDataSource]]("S3ReferenceDataSource")).mapN(avias.kinesisanalytics.models.ReferenceDataSource.apply _)
  }
  final implicit val KinesisFirehoseInputUpdateDecoder: io.circe.Decoder[avias.kinesisanalytics.models.KinesisFirehoseInputUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARNUpdate"), o.get[scala.Option[java.lang.String]]("RoleARNUpdate")).mapN(avias.kinesisanalytics.models.KinesisFirehoseInputUpdate.apply _)
  }
}