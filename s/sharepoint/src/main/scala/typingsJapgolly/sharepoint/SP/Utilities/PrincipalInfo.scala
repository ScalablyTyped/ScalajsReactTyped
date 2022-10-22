package typingsJapgolly.sharepoint.SP.Utilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalInfo
  extends StObject
     with ClientValueObject {
  
  def get_department(): String
  
  def get_displayName(): String
  
  def get_email(): String
  
  def get_jobTitle(): String
  
  def get_loginName(): String
  
  def get_mobile(): String
  
  def get_principalId(): Double
  
  def get_principalType(): PrincipalType
  
  def get_sIPAddress(): String
}
object PrincipalInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_department: CallbackTo[String],
    get_displayName: CallbackTo[String],
    get_email: CallbackTo[String],
    get_jobTitle: CallbackTo[String],
    get_loginName: CallbackTo[String],
    get_mobile: CallbackTo[String],
    get_principalId: CallbackTo[Double],
    get_principalType: CallbackTo[PrincipalType],
    get_sIPAddress: CallbackTo[String],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): PrincipalInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_department = get_department.toJsFn, get_displayName = get_displayName.toJsFn, get_email = get_email.toJsFn, get_jobTitle = get_jobTitle.toJsFn, get_loginName = get_loginName.toJsFn, get_mobile = get_mobile.toJsFn, get_principalId = get_principalId.toJsFn, get_principalType = get_principalType.toJsFn, get_sIPAddress = get_sIPAddress.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[PrincipalInfo]
  }
  
  extension [Self <: PrincipalInfo](x: Self) {
    
    inline def setGet_department(value: CallbackTo[String]): Self = StObject.set(x, "get_department", value.toJsFn)
    
    inline def setGet_displayName(value: CallbackTo[String]): Self = StObject.set(x, "get_displayName", value.toJsFn)
    
    inline def setGet_email(value: CallbackTo[String]): Self = StObject.set(x, "get_email", value.toJsFn)
    
    inline def setGet_jobTitle(value: CallbackTo[String]): Self = StObject.set(x, "get_jobTitle", value.toJsFn)
    
    inline def setGet_loginName(value: CallbackTo[String]): Self = StObject.set(x, "get_loginName", value.toJsFn)
    
    inline def setGet_mobile(value: CallbackTo[String]): Self = StObject.set(x, "get_mobile", value.toJsFn)
    
    inline def setGet_principalId(value: CallbackTo[Double]): Self = StObject.set(x, "get_principalId", value.toJsFn)
    
    inline def setGet_principalType(value: CallbackTo[PrincipalType]): Self = StObject.set(x, "get_principalType", value.toJsFn)
    
    inline def setGet_sIPAddress(value: CallbackTo[String]): Self = StObject.set(x, "get_sIPAddress", value.toJsFn)
  }
}
