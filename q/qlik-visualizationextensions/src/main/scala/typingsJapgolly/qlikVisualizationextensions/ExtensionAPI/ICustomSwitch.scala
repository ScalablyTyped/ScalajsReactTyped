package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomSwitch extends StObject {
  
  var component: switch
  
  var defaultValue: Boolean
  
  var options: valueOrfunc[ICustomControlOption]
}
object ICustomSwitch {
  
  inline def apply(defaultValue: Boolean, options: valueOrfunc[ICustomControlOption]): ICustomSwitch = {
    val __obj = js.Dynamic.literal(component = "switch", defaultValue = defaultValue.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSwitch]
  }
  
  extension [Self <: ICustomSwitch](x: Self) {
    
    inline def setComponent(value: switch): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsCallbackTo(value: CallbackTo[ICustomControlOption]): Self = StObject.set(x, "options", value.toJsFn)
  }
}
