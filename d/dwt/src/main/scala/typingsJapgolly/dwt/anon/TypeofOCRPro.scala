package typingsJapgolly.dwt.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dwt.addonDotOCRProMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOCRPro extends StObject {
  
  def NewSettings(): Settings
}
object TypeofOCRPro {
  
  inline def apply(NewSettings: CallbackTo[Settings]): TypeofOCRPro = {
    val __obj = js.Dynamic.literal(NewSettings = NewSettings.toJsFn)
    __obj.asInstanceOf[TypeofOCRPro]
  }
  
  extension [Self <: TypeofOCRPro](x: Self) {
    
    inline def setNewSettings(value: CallbackTo[Settings]): Self = StObject.set(x, "NewSettings", value.toJsFn)
  }
}
