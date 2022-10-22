package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPickerProvider}. */
trait DayPickerProviderProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  /** The initial props from the DayPicker component. */
  var initialProps: DayPickerProps
}
object DayPickerProviderProps {
  
  inline def apply(initialProps: DayPickerProps): DayPickerProviderProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerProviderProps]
  }
  
  extension [Self <: DayPickerProviderProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInitialProps(value: DayPickerProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
