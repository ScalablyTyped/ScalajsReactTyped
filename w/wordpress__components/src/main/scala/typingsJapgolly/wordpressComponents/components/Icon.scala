package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.iconMod.Icon.IconType
import typingsJapgolly.wordpressComponents.iconMod.Icon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply[P](): Builder[P] = {
    val __props = js.Dynamic.literal()
    new Builder[P](js.Array(this.component, __props.asInstanceOf[Props[P]]))
  }
  
  @JSImport("@wordpress/components", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def icon(value: IconType[P]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make[P](companion: Icon.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[P](p: Props[P]): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
}
