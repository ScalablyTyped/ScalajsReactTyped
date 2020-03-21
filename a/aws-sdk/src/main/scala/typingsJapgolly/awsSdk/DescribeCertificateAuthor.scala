package typingsJapgolly.awsSdk

import typingsJapgolly.awsSdk.acmpcaMod.Arn
import typingsJapgolly.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/acmpca.DescribeCertificateAuthorityAuditReportRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCertificateAuthor extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The report ID returned by calling the CreateCertificateAuthorityAuditReport action.
    */
  var AuditReportId: typingsJapgolly.awsSdk.acmpcaMod.AuditReportId = js.native
  /**
    * The Amazon Resource Name (ARN) of the private CA. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
}

