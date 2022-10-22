package typingsJapgolly.cadesplugin.CAPICOM

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cadesplugin.CADESCommon.ValuesOf
import typingsJapgolly.cadesplugin.CADESCommon.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  def Display(): Unit
  
  def Export(EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]): String
  
  def ExtendedKeyUsage(): typingsJapgolly.cadesplugin.CAPICOM.ExtendedKeyUsage
  
  def GetInfo(infoType: CAPICOM_CERT_INFO_TYPE): String
  
  def HasPrivateKey(): Boolean
  
  def IsValid(): CertificateStatus
  
  val IssuerName: String
  
  var PrivateKey: typingsJapgolly.cadesplugin.CAPICOM.PrivateKey
  
  def PublicKey(): typingsJapgolly.cadesplugin.CAPICOM.PublicKey
  
  val SerialNumber: String
  
  val SubjectName: String
  
  val Thumbprint: String
  
  val ValidFromDate: VarDate
  
  val ValidToDate: VarDate
  
  val Version: Double
}
object Certificate {
  
  inline def apply(
    Display: Callback,
    Export: ValuesOf[CAPICOM_ENCODING_TYPE] => String,
    ExtendedKeyUsage: CallbackTo[ExtendedKeyUsage],
    GetInfo: CAPICOM_CERT_INFO_TYPE => String,
    HasPrivateKey: CallbackTo[Boolean],
    IsValid: CallbackTo[CertificateStatus],
    IssuerName: String,
    PrivateKey: PrivateKey,
    PublicKey: CallbackTo[PublicKey],
    SerialNumber: String,
    SubjectName: String,
    Thumbprint: String,
    ValidFromDate: VarDate,
    ValidToDate: VarDate,
    Version: Double
  ): Certificate = {
    val __obj = js.Dynamic.literal(Display = Display.toJsFn, Export = js.Any.fromFunction1(Export), ExtendedKeyUsage = ExtendedKeyUsage.toJsFn, GetInfo = js.Any.fromFunction1(GetInfo), HasPrivateKey = HasPrivateKey.toJsFn, IsValid = IsValid.toJsFn, IssuerName = IssuerName.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any], PublicKey = PublicKey.toJsFn, SerialNumber = SerialNumber.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], Thumbprint = Thumbprint.asInstanceOf[js.Any], ValidFromDate = ValidFromDate.asInstanceOf[js.Any], ValidToDate = ValidToDate.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  extension [Self <: Certificate](x: Self) {
    
    inline def setDisplay(value: Callback): Self = StObject.set(x, "Display", value.toJsFn)
    
    inline def setExport(value: ValuesOf[CAPICOM_ENCODING_TYPE] => String): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    inline def setExtendedKeyUsage(value: CallbackTo[ExtendedKeyUsage]): Self = StObject.set(x, "ExtendedKeyUsage", value.toJsFn)
    
    inline def setGetInfo(value: CAPICOM_CERT_INFO_TYPE => String): Self = StObject.set(x, "GetInfo", js.Any.fromFunction1(value))
    
    inline def setHasPrivateKey(value: CallbackTo[Boolean]): Self = StObject.set(x, "HasPrivateKey", value.toJsFn)
    
    inline def setIsValid(value: CallbackTo[CertificateStatus]): Self = StObject.set(x, "IsValid", value.toJsFn)
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "IssuerName", value.asInstanceOf[js.Any])
    
    inline def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: CallbackTo[PublicKey]): Self = StObject.set(x, "PublicKey", value.toJsFn)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "SubjectName", value.asInstanceOf[js.Any])
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    inline def setValidFromDate(value: VarDate): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    inline def setValidToDate(value: VarDate): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
