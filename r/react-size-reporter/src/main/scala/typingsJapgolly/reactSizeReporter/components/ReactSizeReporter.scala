package typingsJapgolly.reactSizeReporter.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSizeReporter.anon.Children
import typingsJapgolly.reactSizeReporter.anon.Height
import typingsJapgolly.reactSizeReporter.mod.ReactSizeReporterRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSizeReporter {
  
  inline def apply(onSizeChange: Height => Callback): Default[ReactSizeReporterRef] = {
    val __props = js.Dynamic.literal(onSizeChange = js.Any.fromFunction1((t0: Height) => onSizeChange(t0).runNow()))
    new Default[ReactSizeReporterRef](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-size-reporter", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[ReactSizeReporterRef] = new Default[ReactSizeReporterRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
