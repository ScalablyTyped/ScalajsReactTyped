package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.mod.ToolBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolBar {
  
  @JSImport("django-bananas", "ToolBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.djangoBananas.mod.ToolBar] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ToolBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToolBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
