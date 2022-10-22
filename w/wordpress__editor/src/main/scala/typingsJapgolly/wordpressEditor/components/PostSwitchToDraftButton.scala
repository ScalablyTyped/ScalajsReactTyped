package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressEditor.componentsPostSwitchToDraftButtonMod.PostSwitchToDraftButton.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PostSwitchToDraftButton {
  
  @JSImport("@wordpress/editor", "PostSwitchToDraftButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PostSwitchToDraftButton.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
