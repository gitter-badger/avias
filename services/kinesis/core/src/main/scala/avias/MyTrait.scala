package avias.kinesis
trait Amazonkinesis[F[_]] {
  def putRecord(input: avias.kinesis.models.PutRecordInput): F[avias.kinesis.models.PutRecordOutput]
  def describeStream(input: avias.kinesis.models.DescribeStreamInput): F[avias.kinesis.models.DescribeStreamOutput]
  def addTagsToStream(input: avias.kinesis.models.AddTagsToStreamInput): F[scala.Unit]
  def getShardIterator(input: avias.kinesis.models.GetShardIteratorInput): F[avias.kinesis.models.GetShardIteratorOutput]
  def listTagsForStream(input: avias.kinesis.models.ListTagsForStreamInput): F[avias.kinesis.models.ListTagsForStreamOutput]
  def startStreamEncryption(input: avias.kinesis.models.StartStreamEncryptionInput): F[scala.Unit]
  def putRecords(input: avias.kinesis.models.PutRecordsInput): F[avias.kinesis.models.PutRecordsOutput]
  def enableEnhancedMonitoring(input: avias.kinesis.models.EnableEnhancedMonitoringInput): F[avias.kinesis.models.EnhancedMonitoringOutput]
  def stopStreamEncryption(input: avias.kinesis.models.StopStreamEncryptionInput): F[scala.Unit]
  def describeLimits: F[avias.kinesis.models.DescribeLimitsOutput]
  def getRecords(input: avias.kinesis.models.GetRecordsInput): F[avias.kinesis.models.GetRecordsOutput]
  def mergeShards(input: avias.kinesis.models.MergeShardsInput): F[scala.Unit]
  def createStream(input: avias.kinesis.models.CreateStreamInput): F[scala.Unit]
  def listStreams(input: avias.kinesis.models.ListStreamsInput): F[avias.kinesis.models.ListStreamsOutput]
  def increaseStreamRetentionPeriod(input: avias.kinesis.models.IncreaseStreamRetentionPeriodInput): F[scala.Unit]
  def describeStreamSummary(input: avias.kinesis.models.DescribeStreamSummaryInput): F[avias.kinesis.models.DescribeStreamSummaryOutput]
  def disableEnhancedMonitoring(input: avias.kinesis.models.DisableEnhancedMonitoringInput): F[avias.kinesis.models.EnhancedMonitoringOutput]
  def deleteStream(input: avias.kinesis.models.DeleteStreamInput): F[scala.Unit]
  def removeTagsFromStream(input: avias.kinesis.models.RemoveTagsFromStreamInput): F[scala.Unit]
  def splitShard(input: avias.kinesis.models.SplitShardInput): F[scala.Unit]
  def decreaseStreamRetentionPeriod(input: avias.kinesis.models.DecreaseStreamRetentionPeriodInput): F[scala.Unit]
  def updateShardCount(input: avias.kinesis.models.UpdateShardCountInput): F[avias.kinesis.models.UpdateShardCountOutput]
}