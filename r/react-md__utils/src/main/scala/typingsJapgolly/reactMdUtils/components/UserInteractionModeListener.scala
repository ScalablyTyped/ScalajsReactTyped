package typingsJapgolly.reactMdUtils.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactMdUtils.typesModeUserInteractionModeListenerMod.UserInteractionModeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UserInteractionModeListener {
  
  @JSImport("@react-md/utils", "UserInteractionModeListener")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: UserInteractionModeListener.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: UserInteractionModeListenerProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
