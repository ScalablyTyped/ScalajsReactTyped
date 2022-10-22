package typingsJapgolly.reactRemoveScrollBar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRemoveScrollBar.distEs5ComponentMod.BodyScroll
import typingsJapgolly.reactRemoveScrollBar.distEs5UtilsMod.GapMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RemoveScrollBar {
  
  @JSImport("react-remove-scroll-bar", "RemoveScrollBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def gapMode(value: GapMode): this.type = set("gapMode", value.asInstanceOf[js.Any])
    
    inline def noImportant(value: Boolean): this.type = set("noImportant", value.asInstanceOf[js.Any])
    
    inline def noRelative(value: Boolean): this.type = set("noRelative", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RemoveScrollBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BodyScroll): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
