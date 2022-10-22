package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.shortcutMod.Shortcut.Props
import typingsJapgolly.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shortcut {
  
  @JSImport("@wordpress/components/shortcut", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def shortcut(value: ShortcutType): this.type = set("shortcut", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Shortcut.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
