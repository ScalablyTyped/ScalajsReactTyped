package typingsJapgolly.orbitUiReactComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.orbitUiReactComponents.distAvatarSrcAvatarMod.AvatarTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarText {
  
  @JSImport("@orbit-ui/react-components", "AvatarText")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AvatarText.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AvatarTextProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
