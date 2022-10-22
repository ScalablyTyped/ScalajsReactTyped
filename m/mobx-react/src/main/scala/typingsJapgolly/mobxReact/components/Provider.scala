package typingsJapgolly.mobxReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mobxReact.distProviderMod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("mobx-react", "Provider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Provider.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
