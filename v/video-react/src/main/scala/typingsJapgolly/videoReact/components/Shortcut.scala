package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.ShortcutItem
import typingsJapgolly.videoReact.mod.ShortcutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shortcut {
  
  @JSImport("video-react", "Shortcut")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    
    inline def dblclickable(value: Boolean): this.type = set("dblclickable", value.asInstanceOf[js.Any])
    
    inline def shortcuts(value: js.Array[ShortcutItem]): this.type = set("shortcuts", value.asInstanceOf[js.Any])
    
    inline def shortcutsVarargs(value: ShortcutItem*): this.type = set("shortcuts", js.Array(value*))
  }
  
  implicit def make(companion: Shortcut.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ShortcutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
