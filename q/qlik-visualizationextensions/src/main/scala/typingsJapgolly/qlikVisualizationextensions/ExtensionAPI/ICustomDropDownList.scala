package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomDropDownList
  extends StObject
     with ICustomControl {
  
  var component: dropdown
  
  var defaultValue: String
  
  var options: valueOrfunc[ICustomControlOption]
}
object ICustomDropDownList {
  
  inline def apply(
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomDropDownList = {
    val __obj = js.Dynamic.literal(component = "dropdown", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomDropDownList]
  }
  
  extension [Self <: ICustomDropDownList](x: Self) {
    
    inline def setComponent(value: dropdown): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsCallbackTo(value: CallbackTo[ICustomControlOption]): Self = StObject.set(x, "options", value.toJsFn)
  }
}
