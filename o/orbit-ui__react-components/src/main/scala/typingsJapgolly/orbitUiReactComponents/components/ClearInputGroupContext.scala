package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distInputGroupSrcInputGroupContextMod.ClearInputGroupContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearInputGroupContext {
  
  @JSImport("@orbit-ui/react-components", "ClearInputGroupContext")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClearInputGroupContext.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClearInputGroupContextProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
