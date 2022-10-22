package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexStdole.stdole.IPictureDisp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureInfo extends StObject {
  
  val Application: Any
  
  val CertificateVerificationResults: typingsJapgolly.activexOffice.Office.CertificateVerificationResults
  
  val ContentVerificationResults: typingsJapgolly.activexOffice.Office.ContentVerificationResults
  
  val Creator: Double
  
  def GetCertificateDetail(certdet: CertificateDetail): Any
  
  def GetSignatureDetail(sigdet: SignatureDetail): Any
  
  val IsCertificateExpired: Boolean
  
  val IsCertificateRevoked: Boolean
  
  val IsCertificateUntrusted: Boolean
  
  val IsValid: Boolean
  
  /* private */ @JSName("Office.SignatureInfo_typekey")
  var OfficeDotSignatureInfo_typekey: SignatureInfo
  
  val ReadOnly: Boolean
  
  def SelectCertificateDetailByThumbprint(bstrThumbprint: String): Unit
  
  def SelectSignatureCertificate(ParentWindow: Any): Unit
  
  def ShowSignatureCertificate(ParentWindow: Any): Unit
  
  var SignatureComment: String
  
  var SignatureImage: IPictureDisp
  
  val SignatureProvider: String
  
  var SignatureText: String
}
object SignatureInfo {
  
  inline def apply(
    Application: Any,
    CertificateVerificationResults: CertificateVerificationResults,
    ContentVerificationResults: ContentVerificationResults,
    Creator: Double,
    GetCertificateDetail: CertificateDetail => Any,
    GetSignatureDetail: SignatureDetail => Any,
    IsCertificateExpired: Boolean,
    IsCertificateRevoked: Boolean,
    IsCertificateUntrusted: Boolean,
    IsValid: Boolean,
    OfficeDotSignatureInfo_typekey: SignatureInfo,
    ReadOnly: Boolean,
    SelectCertificateDetailByThumbprint: String => Callback,
    SelectSignatureCertificate: Any => Callback,
    ShowSignatureCertificate: Any => Callback,
    SignatureComment: String,
    SignatureImage: IPictureDisp,
    SignatureProvider: String,
    SignatureText: String
  ): SignatureInfo = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CertificateVerificationResults = CertificateVerificationResults.asInstanceOf[js.Any], ContentVerificationResults = ContentVerificationResults.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], GetCertificateDetail = js.Any.fromFunction1(GetCertificateDetail), GetSignatureDetail = js.Any.fromFunction1(GetSignatureDetail), IsCertificateExpired = IsCertificateExpired.asInstanceOf[js.Any], IsCertificateRevoked = IsCertificateRevoked.asInstanceOf[js.Any], IsCertificateUntrusted = IsCertificateUntrusted.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SelectCertificateDetailByThumbprint = js.Any.fromFunction1((t0: String) => SelectCertificateDetailByThumbprint(t0).runNow()), SelectSignatureCertificate = js.Any.fromFunction1((t0: Any) => SelectSignatureCertificate(t0).runNow()), ShowSignatureCertificate = js.Any.fromFunction1((t0: Any) => ShowSignatureCertificate(t0).runNow()), SignatureComment = SignatureComment.asInstanceOf[js.Any], SignatureImage = SignatureImage.asInstanceOf[js.Any], SignatureProvider = SignatureProvider.asInstanceOf[js.Any], SignatureText = SignatureText.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SignatureInfo_typekey")(OfficeDotSignatureInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureInfo]
  }
  
  extension [Self <: SignatureInfo](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCertificateVerificationResults(value: CertificateVerificationResults): Self = StObject.set(x, "CertificateVerificationResults", value.asInstanceOf[js.Any])
    
    inline def setContentVerificationResults(value: ContentVerificationResults): Self = StObject.set(x, "ContentVerificationResults", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setGetCertificateDetail(value: CertificateDetail => Any): Self = StObject.set(x, "GetCertificateDetail", js.Any.fromFunction1(value))
    
    inline def setGetSignatureDetail(value: SignatureDetail => Any): Self = StObject.set(x, "GetSignatureDetail", js.Any.fromFunction1(value))
    
    inline def setIsCertificateExpired(value: Boolean): Self = StObject.set(x, "IsCertificateExpired", value.asInstanceOf[js.Any])
    
    inline def setIsCertificateRevoked(value: Boolean): Self = StObject.set(x, "IsCertificateRevoked", value.asInstanceOf[js.Any])
    
    inline def setIsCertificateUntrusted(value: Boolean): Self = StObject.set(x, "IsCertificateUntrusted", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "IsValid", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotSignatureInfo_typekey(value: SignatureInfo): Self = StObject.set(x, "Office.SignatureInfo_typekey", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSelectCertificateDetailByThumbprint(value: String => Callback): Self = StObject.set(x, "SelectCertificateDetailByThumbprint", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSelectSignatureCertificate(value: Any => Callback): Self = StObject.set(x, "SelectSignatureCertificate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShowSignatureCertificate(value: Any => Callback): Self = StObject.set(x, "ShowSignatureCertificate", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSignatureComment(value: String): Self = StObject.set(x, "SignatureComment", value.asInstanceOf[js.Any])
    
    inline def setSignatureImage(value: IPictureDisp): Self = StObject.set(x, "SignatureImage", value.asInstanceOf[js.Any])
    
    inline def setSignatureProvider(value: String): Self = StObject.set(x, "SignatureProvider", value.asInstanceOf[js.Any])
    
    inline def setSignatureText(value: String): Self = StObject.set(x, "SignatureText", value.asInstanceOf[js.Any])
  }
}
