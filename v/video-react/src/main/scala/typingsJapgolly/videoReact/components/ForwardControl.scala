package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.ForwardControlProps
import typingsJapgolly.videoReact.videoReactInts.`10`
import typingsJapgolly.videoReact.videoReactInts.`30`
import typingsJapgolly.videoReact.videoReactInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ForwardControl {
  
  @JSImport("video-react", "ForwardControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def seconds(value: `5` | `10` | `30`): this.type = set("seconds", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ForwardControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ForwardControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
