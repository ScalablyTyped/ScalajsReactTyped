package typingsJapgolly.reactTouch.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactTouch.mod.DraggableCallbackArgument
import typingsJapgolly.reactTouch.mod.DraggableProps
import typingsJapgolly.reactTouch.mod.DraggableStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Draggable {
  
  inline def apply(children: /* argument */ DraggableCallbackArgument => Element, style: DraggableStyle): Default[typingsJapgolly.reactTouch.mod.Draggable] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), style = style.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactTouch.mod.Draggable](js.Array(this.component, __props.asInstanceOf[DraggableProps]))
  }
  
  @JSImport("react-touch", "Draggable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DraggableProps): Default[typingsJapgolly.reactTouch.mod.Draggable] = new Default[typingsJapgolly.reactTouch.mod.Draggable](js.Array(this.component, p.asInstanceOf[js.Any]))
}
