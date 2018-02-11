package org.lyranthe.araethura.mechanicalturkrequester
trait Amazonmechanicalturkrequester[F[_]] {
  def getFileUploadURL(input: models.GetFileUploadURLRequest): F[models.GetFileUploadURLResponse]
  def listHITs(input: models.ListHITsRequest): F[models.ListHITsResponse]
  def listWorkersWithQualificationType(input: models.ListWorkersWithQualificationTypeRequest): F[models.ListWorkersWithQualificationTypeResponse]
  def getAccountBalance: F[models.GetAccountBalanceResponse]
  def approveAssignment(input: models.ApproveAssignmentRequest): F[scala.Unit]
  def updateExpirationForHIT(input: models.UpdateExpirationForHITRequest): F[scala.Unit]
  def deleteWorkerBlock(input: models.DeleteWorkerBlockRequest): F[scala.Unit]
  def updateHITReviewStatus(input: models.UpdateHITReviewStatusRequest): F[scala.Unit]
  def listReviewPolicyResultsForHIT(input: models.ListReviewPolicyResultsForHITRequest): F[models.ListReviewPolicyResultsForHITResponse]
  def acceptQualificationRequest(input: models.AcceptQualificationRequestRequest): F[scala.Unit]
  def listWorkerBlocks(input: models.ListWorkerBlocksRequest): F[models.ListWorkerBlocksResponse]
  def updateNotificationSettings(input: models.UpdateNotificationSettingsRequest): F[scala.Unit]
  def updateQualificationType(input: models.UpdateQualificationTypeRequest): F[models.UpdateQualificationTypeResponse]
  def notifyWorkers(input: models.NotifyWorkersRequest): F[models.NotifyWorkersResponse]
  def getQualificationScore(input: models.GetQualificationScoreRequest): F[models.GetQualificationScoreResponse]
  def rejectAssignment(input: models.RejectAssignmentRequest): F[scala.Unit]
  def updateHITTypeOfHIT(input: models.UpdateHITTypeOfHITRequest): F[scala.Unit]
  def listQualificationTypes(input: models.ListQualificationTypesRequest): F[models.ListQualificationTypesResponse]
  def listAssignmentsForHIT(input: models.ListAssignmentsForHITRequest): F[models.ListAssignmentsForHITResponse]
  def createQualificationType(input: models.CreateQualificationTypeRequest): F[models.CreateQualificationTypeResponse]
  def createHITWithHITType(input: models.CreateHITWithHITTypeRequest): F[models.CreateHITWithHITTypeResponse]
  def getQualificationType(input: models.GetQualificationTypeRequest): F[models.GetQualificationTypeResponse]
  def deleteQualificationType(input: models.DeleteQualificationTypeRequest): F[scala.Unit]
  def listHITsForQualificationType(input: models.ListHITsForQualificationTypeRequest): F[models.ListHITsForQualificationTypeResponse]
  def sendTestEventNotification(input: models.SendTestEventNotificationRequest): F[scala.Unit]
  def associateQualificationWithWorker(input: models.AssociateQualificationWithWorkerRequest): F[scala.Unit]
  def createHITType(input: models.CreateHITTypeRequest): F[models.CreateHITTypeResponse]
  def listBonusPayments(input: models.ListBonusPaymentsRequest): F[models.ListBonusPaymentsResponse]
  def deleteHIT(input: models.DeleteHITRequest): F[scala.Unit]
  def listReviewableHITs(input: models.ListReviewableHITsRequest): F[models.ListReviewableHITsResponse]
  def rejectQualificationRequest(input: models.RejectQualificationRequestRequest): F[scala.Unit]
  def getHIT(input: models.GetHITRequest): F[models.GetHITResponse]
  def getAssignment(input: models.GetAssignmentRequest): F[models.GetAssignmentResponse]
  def listQualificationRequests(input: models.ListQualificationRequestsRequest): F[models.ListQualificationRequestsResponse]
  def createHIT(input: models.CreateHITRequest): F[models.CreateHITResponse]
  def createWorkerBlock(input: models.CreateWorkerBlockRequest): F[scala.Unit]
  def sendBonus(input: models.SendBonusRequest): F[scala.Unit]
  def disassociateQualificationFromWorker(input: models.DisassociateQualificationFromWorkerRequest): F[scala.Unit]
  def createAdditionalAssignmentsForHIT(input: models.CreateAdditionalAssignmentsForHITRequest): F[scala.Unit]
}