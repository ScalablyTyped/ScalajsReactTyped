package typingsJapgolly.reactElemental.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.mod.TagProps
import typingsJapgolly.reactElemental.mod.TagSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagProps]))
  }
  
  @JSImport("react-elemental", "Tag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def dismissible(value: Boolean): this.type = set("dismissible", value.asInstanceOf[js.Any])
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def outlineColor(value: String): this.type = set("outlineColor", value.asInstanceOf[js.Any])
    
    inline def size(value: TagSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
