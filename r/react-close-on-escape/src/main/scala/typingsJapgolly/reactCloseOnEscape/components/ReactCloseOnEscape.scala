package typingsJapgolly.reactCloseOnEscape.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactCloseOnEscape.mod.CloseOnEscapeProps
import typingsJapgolly.reactCloseOnEscape.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCloseOnEscape {
  
  inline def apply(onEscape: Callback): Default[default] = {
    val __props = js.Dynamic.literal(onEscape = onEscape.toJsFn)
    new Default[default](js.Array(this.component, __props.asInstanceOf[CloseOnEscapeProps]))
  }
  
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CloseOnEscapeProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
