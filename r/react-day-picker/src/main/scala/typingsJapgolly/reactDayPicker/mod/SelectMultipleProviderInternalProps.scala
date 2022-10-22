package typingsJapgolly.reactDayPicker.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMultipleProviderInternalProps extends StObject {
  
  var children: Node
  
  var initialProps: DayPickerMultipleProps
}
object SelectMultipleProviderInternalProps {
  
  inline def apply(initialProps: DayPickerMultipleProps): SelectMultipleProviderInternalProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[SelectMultipleProviderInternalProps]
  }
  
  extension [Self <: SelectMultipleProviderInternalProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInitialProps(value: DayPickerMultipleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
