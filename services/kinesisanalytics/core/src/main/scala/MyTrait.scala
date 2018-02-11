package org.lyranthe.araethura.kinesisanalytics
trait Amazonkinesisanalytics[F[_]] {
  def createApplication(input: models.CreateApplicationRequest): F[models.CreateApplicationResponse]
  def deleteApplicationInputProcessingConfiguration(input: models.DeleteApplicationInputProcessingConfigurationRequest): F[scala.Unit]
  def deleteApplicationOutput(input: models.DeleteApplicationOutputRequest): F[scala.Unit]
  def deleteApplicationReferenceDataSource(input: models.DeleteApplicationReferenceDataSourceRequest): F[scala.Unit]
  def listApplications(input: models.ListApplicationsRequest): F[models.ListApplicationsResponse]
  def deleteApplication(input: models.DeleteApplicationRequest): F[scala.Unit]
  def stopApplication(input: models.StopApplicationRequest): F[scala.Unit]
  def addApplicationOutput(input: models.AddApplicationOutputRequest): F[scala.Unit]
  def addApplicationReferenceDataSource(input: models.AddApplicationReferenceDataSourceRequest): F[scala.Unit]
  def updateApplication(input: models.UpdateApplicationRequest): F[scala.Unit]
  def describeApplication(input: models.DescribeApplicationRequest): F[models.DescribeApplicationResponse]
  def addApplicationInputProcessingConfiguration(input: models.AddApplicationInputProcessingConfigurationRequest): F[scala.Unit]
  def deleteApplicationCloudWatchLoggingOption(input: models.DeleteApplicationCloudWatchLoggingOptionRequest): F[scala.Unit]
  def startApplication(input: models.StartApplicationRequest): F[scala.Unit]
  def discoverInputSchema(input: models.DiscoverInputSchemaRequest): F[models.DiscoverInputSchemaResponse]
  def addApplicationInput(input: models.AddApplicationInputRequest): F[scala.Unit]
  def addApplicationCloudWatchLoggingOption(input: models.AddApplicationCloudWatchLoggingOptionRequest): F[scala.Unit]
}