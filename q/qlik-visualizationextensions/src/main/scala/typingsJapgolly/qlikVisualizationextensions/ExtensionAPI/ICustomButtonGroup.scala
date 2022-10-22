package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.buttongroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomButtonGroup
  extends StObject
     with ICustomControl {
  
  var component: buttongroup
  
  var defaultValue: String
  
  var options: valueOrfunc[ICustomControlOption]
}
object ICustomButtonGroup {
  
  inline def apply(
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomButtonGroup = {
    val __obj = js.Dynamic.literal(component = "buttongroup", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomButtonGroup]
  }
  
  extension [Self <: ICustomButtonGroup](x: Self) {
    
    inline def setComponent(value: buttongroup): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsCallbackTo(value: CallbackTo[ICustomControlOption]): Self = StObject.set(x, "options", value.toJsFn)
  }
}
