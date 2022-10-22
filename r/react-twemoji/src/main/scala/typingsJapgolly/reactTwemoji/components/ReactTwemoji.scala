package typingsJapgolly.reactTwemoji.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTwemoji.mod.TwemojiProps
import typingsJapgolly.reactTwemoji.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTwemoji {
  
  @JSImport("react-twemoji", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def noWrapper(value: Boolean): this.type = set("noWrapper", value.asInstanceOf[js.Any])
    
    inline def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactTwemoji.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TwemojiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
