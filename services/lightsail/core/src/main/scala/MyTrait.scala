package org.lyranthe.araethura.lightsail
trait Amazonlightsail[F[_]] {
  def deleteInstance(input: models.DeleteInstanceRequest): F[models.DeleteInstanceResult]
  def deleteDomainEntry(input: models.DeleteDomainEntryRequest): F[models.DeleteDomainEntryResult]
  def createDomainEntry(input: models.CreateDomainEntryRequest): F[models.CreateDomainEntryResult]
  def allocateStaticIp(input: models.AllocateStaticIpRequest): F[models.AllocateStaticIpResult]
  def attachDisk(input: models.AttachDiskRequest): F[models.AttachDiskResult]
  def createDiskFromSnapshot(input: models.CreateDiskFromSnapshotRequest): F[models.CreateDiskFromSnapshotResult]
  def createInstancesFromSnapshot(input: models.CreateInstancesFromSnapshotRequest): F[models.CreateInstancesFromSnapshotResult]
  def getInstanceAccessDetails(input: models.GetInstanceAccessDetailsRequest): F[models.GetInstanceAccessDetailsResult]
  def getInstances(input: models.GetInstancesRequest): F[models.GetInstancesResult]
  def getKeyPair(input: models.GetKeyPairRequest): F[models.GetKeyPairResult]
  def unpeerVpc: F[models.UnpeerVpcResult]
  def getDomains(input: models.GetDomainsRequest): F[models.GetDomainsResult]
  def deleteDiskSnapshot(input: models.DeleteDiskSnapshotRequest): F[models.DeleteDiskSnapshotResult]
  def closeInstancePublicPorts(input: models.CloseInstancePublicPortsRequest): F[models.CloseInstancePublicPortsResult]
  def getDisks(input: models.GetDisksRequest): F[models.GetDisksResult]
  def putInstancePublicPorts(input: models.PutInstancePublicPortsRequest): F[models.PutInstancePublicPortsResult]
  def createDiskSnapshot(input: models.CreateDiskSnapshotRequest): F[models.CreateDiskSnapshotResult]
  def getInstanceSnapshot(input: models.GetInstanceSnapshotRequest): F[models.GetInstanceSnapshotResult]
  def updateDomainEntry(input: models.UpdateDomainEntryRequest): F[models.UpdateDomainEntryResult]
  def deleteDomain(input: models.DeleteDomainRequest): F[models.DeleteDomainResult]
  def getOperation(input: models.GetOperationRequest): F[models.GetOperationResult]
  def openInstancePublicPorts(input: models.OpenInstancePublicPortsRequest): F[models.OpenInstancePublicPortsResult]
  def getInstancePortStates(input: models.GetInstancePortStatesRequest): F[models.GetInstancePortStatesResult]
  def getOperationsForResource(input: models.GetOperationsForResourceRequest): F[models.GetOperationsForResourceResult]
  def peerVpc: F[models.PeerVpcResult]
  def createInstances(input: models.CreateInstancesRequest): F[models.CreateInstancesResult]
  def getOperations(input: models.GetOperationsRequest): F[models.GetOperationsResult]
  def getStaticIp(input: models.GetStaticIpRequest): F[models.GetStaticIpResult]
  def detachDisk(input: models.DetachDiskRequest): F[models.DetachDiskResult]
  def rebootInstance(input: models.RebootInstanceRequest): F[models.RebootInstanceResult]
  def createInstanceSnapshot(input: models.CreateInstanceSnapshotRequest): F[models.CreateInstanceSnapshotResult]
  def getDiskSnapshot(input: models.GetDiskSnapshotRequest): F[models.GetDiskSnapshotResult]
  def getKeyPairs(input: models.GetKeyPairsRequest): F[models.GetKeyPairsResult]
  def deleteDisk(input: models.DeleteDiskRequest): F[models.DeleteDiskResult]
  def getRegions(input: models.GetRegionsRequest): F[models.GetRegionsResult]
  def detachStaticIp(input: models.DetachStaticIpRequest): F[models.DetachStaticIpResult]
  def createKeyPair(input: models.CreateKeyPairRequest): F[models.CreateKeyPairResult]
  def isVpcPeered: F[models.IsVpcPeeredResult]
  def importKeyPair(input: models.ImportKeyPairRequest): F[models.ImportKeyPairResult]
  def deleteInstanceSnapshot(input: models.DeleteInstanceSnapshotRequest): F[models.DeleteInstanceSnapshotResult]
  def deleteKeyPair(input: models.DeleteKeyPairRequest): F[models.DeleteKeyPairResult]
  def getStaticIps(input: models.GetStaticIpsRequest): F[models.GetStaticIpsResult]
  def getInstanceState(input: models.GetInstanceStateRequest): F[models.GetInstanceStateResult]
  def getActiveNames(input: models.GetActiveNamesRequest): F[models.GetActiveNamesResult]
  def downloadDefaultKeyPair: F[models.DownloadDefaultKeyPairResult]
  def createDisk(input: models.CreateDiskRequest): F[models.CreateDiskResult]
  def getBundles(input: models.GetBundlesRequest): F[models.GetBundlesResult]
  def releaseStaticIp(input: models.ReleaseStaticIpRequest): F[models.ReleaseStaticIpResult]
  def getDiskSnapshots(input: models.GetDiskSnapshotsRequest): F[models.GetDiskSnapshotsResult]
  def getDomain(input: models.GetDomainRequest): F[models.GetDomainResult]
  def startInstance(input: models.StartInstanceRequest): F[models.StartInstanceResult]
  def stopInstance(input: models.StopInstanceRequest): F[models.StopInstanceResult]
  def getDisk(input: models.GetDiskRequest): F[models.GetDiskResult]
  def getInstanceSnapshots(input: models.GetInstanceSnapshotsRequest): F[models.GetInstanceSnapshotsResult]
  def createDomain(input: models.CreateDomainRequest): F[models.CreateDomainResult]
  def getInstanceMetricData(input: models.GetInstanceMetricDataRequest): F[models.GetInstanceMetricDataResult]
  def attachStaticIp(input: models.AttachStaticIpRequest): F[models.AttachStaticIpResult]
  def getInstance(input: models.GetInstanceRequest): F[models.GetInstanceResult]
  def getBlueprints(input: models.GetBlueprintsRequest): F[models.GetBlueprintsResult]
}