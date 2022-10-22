package typingsJapgolly.activexOffice.global.Office

import typingsJapgolly.activexOffice.Office.CertificateDetail
import typingsJapgolly.activexOffice.Office.SignatureDetail
import typingsJapgolly.activexStdole.stdole.IPictureDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.SignatureInfo")
@js.native
/* private */ open class SignatureInfo ()
  extends StObject
     with typingsJapgolly.activexOffice.Office.SignatureInfo {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  override val CertificateVerificationResults: typingsJapgolly.activexOffice.Office.CertificateVerificationResults = js.native
  
  /* CompleteClass */
  override val ContentVerificationResults: typingsJapgolly.activexOffice.Office.ContentVerificationResults = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def GetCertificateDetail(certdet: CertificateDetail): Any = js.native
  
  /* CompleteClass */
  override def GetSignatureDetail(sigdet: SignatureDetail): Any = js.native
  
  /* CompleteClass */
  override val IsCertificateExpired: Boolean = js.native
  
  /* CompleteClass */
  override val IsCertificateRevoked: Boolean = js.native
  
  /* CompleteClass */
  override val IsCertificateUntrusted: Boolean = js.native
  
  /* CompleteClass */
  override val IsValid: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: typingsJapgolly.activexOffice.Office.SignatureInfo = js.native
  
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit = js.native
  
  /* CompleteClass */
  override def SelectSignatureCertificate(ParentWindow: Any): Unit = js.native
  
  /* CompleteClass */
  override def ShowSignatureCertificate(ParentWindow: Any): Unit = js.native
  
  /* CompleteClass */
  var SignatureComment: String = js.native
  
  /* CompleteClass */
  var SignatureImage: IPictureDisp = js.native
  
  /* CompleteClass */
  override val SignatureProvider: String = js.native
  
  /* CompleteClass */
  var SignatureText: String = js.native
}
