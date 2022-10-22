package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.BigPlayButtonProps
import typingsJapgolly.videoReact.videoReactStrings.`left-bottom`
import typingsJapgolly.videoReact.videoReactStrings.`left-top`
import typingsJapgolly.videoReact.videoReactStrings.`right-bottom`
import typingsJapgolly.videoReact.videoReactStrings.`right-top`
import typingsJapgolly.videoReact.videoReactStrings.center
import typingsJapgolly.videoReact.videoReactStrings.left
import typingsJapgolly.videoReact.videoReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BigPlayButton {
  
  @JSImport("video-react", "BigPlayButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def position(value: center | left | `left-top` | `left-bottom` | right | `right-top` | `right-bottom`): this.type = set("position", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BigPlayButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BigPlayButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
