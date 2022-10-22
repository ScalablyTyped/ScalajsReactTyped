package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressEditor.componentsErrorBoundaryMod.ErrorBoundary.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  inline def apply(onError: Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(onError = onError.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "ErrorBoundary")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
