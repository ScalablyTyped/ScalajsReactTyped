package typingsJapgolly.reactDayPicker.distIndexDotesmMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectSingleProviderInternal extends StObject {
  
  var children: Node
  
  var initialProps: DayPickerSingleProps
}
object SelectSingleProviderInternal {
  
  @JSImport("react-day-picker/dist/index.esm", "SelectSingleProviderInternal")
  @js.native
  def apply(hasInitialPropsChildren: SelectSingleProviderInternal): Element = js.native
  
  extension [Self <: SelectSingleProviderInternal](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setInitialProps(value: DayPickerSingleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
