package typingsJapgolly.reactLoadable.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactLoadable.LoadableExport.LoadableCaptureProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Capture {
  
  inline def apply(report: String => Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(report = js.Any.fromFunction1((t0: String) => report(t0).runNow()))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[LoadableCaptureProps]))
  }
  
  @JSImport("react-loadable", "Capture")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoadableCaptureProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
