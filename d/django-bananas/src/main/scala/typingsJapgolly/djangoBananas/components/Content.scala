package typingsJapgolly.djangoBananas.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.djangoBananas.mod.ContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Content {
  
  @JSImport("django-bananas", "Content")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.djangoBananas.mod.Content] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contained(value: Boolean): this.type = set("contained", value.asInstanceOf[js.Any])
    
    inline def disablePadding(value: Boolean): this.type = set("disablePadding", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Content.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
