package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBase16Styling.libTypesTypesMod.StylingFunction
import typingsJapgolly.reactJsonTree.libTypesJsonarrowMod.Props
import typingsJapgolly.reactJsonTree.reactJsonTreeStrings.double
import typingsJapgolly.reactJsonTree.reactJsonTreeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONArrow {
  
  inline def apply(
    expanded: Boolean,
    nodeType: String,
    onClick: ReactMouseEventFrom[HTMLDivElement & Element] => Callback,
    styling: StylingFunction
  ): Builder = {
    val __props = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => onClick(t0).runNow()), styling = styling.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-json-tree/lib/types/JSONArrow", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def arrowStyle(value: single | double): this.type = set("arrowStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
