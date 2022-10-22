package typingsJapgolly.reactOnsenui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.FixedWidth
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.mod.ModifiersNumber
import typingsJapgolly.reactOnsenui.mod.ModifiersString
import typingsJapgolly.reactOnsenui.reactOnsenuiInts.`180`
import typingsJapgolly.reactOnsenui.reactOnsenuiInts.`270`
import typingsJapgolly.reactOnsenui.reactOnsenuiInts.`90`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  @JSImport("react-onsenui", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Icon] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def fixedWidth(value: Boolean): this.type = set("fixedWidth", value.asInstanceOf[js.Any])
    
    inline def icon(value: String | ModifiersString): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def rotate(value: `90` | `180` | `270`): this.type = set("rotate", value.asInstanceOf[js.Any])
    
    inline def size(value: Double | ModifiersNumber): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def spin(value: Boolean): this.type = set("spin", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Icon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & FixedWidth): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
