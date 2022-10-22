package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSetProperties extends StObject {
  
  def Clone(): IActionSetProperties
  
  var Properties: IDefaultProperties
}
object IActionSetProperties {
  
  inline def apply(Clone: CallbackTo[IActionSetProperties], Properties: IDefaultProperties): IActionSetProperties = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetProperties]
  }
  
  extension [Self <: IActionSetProperties](x: Self) {
    
    inline def setClone(value: CallbackTo[IActionSetProperties]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setProperties(value: IDefaultProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
