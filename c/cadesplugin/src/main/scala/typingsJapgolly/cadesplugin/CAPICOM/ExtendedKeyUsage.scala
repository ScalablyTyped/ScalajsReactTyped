package typingsJapgolly.cadesplugin.CAPICOM

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedKeyUsage extends StObject {
  
  val EKUs: typingsJapgolly.cadesplugin.CAPICOM.EKUs
  
  def IsCritical(): Boolean
  
  def IsPresent(): Boolean
}
object ExtendedKeyUsage {
  
  inline def apply(EKUs: EKUs, IsCritical: CallbackTo[Boolean], IsPresent: CallbackTo[Boolean]): ExtendedKeyUsage = {
    val __obj = js.Dynamic.literal(EKUs = EKUs.asInstanceOf[js.Any], IsCritical = IsCritical.toJsFn, IsPresent = IsPresent.toJsFn)
    __obj.asInstanceOf[ExtendedKeyUsage]
  }
  
  extension [Self <: ExtendedKeyUsage](x: Self) {
    
    inline def setEKUs(value: EKUs): Self = StObject.set(x, "EKUs", value.asInstanceOf[js.Any])
    
    inline def setIsCritical(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsCritical", value.toJsFn)
    
    inline def setIsPresent(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsPresent", value.toJsFn)
  }
}
