package typingsJapgolly.reactMdList.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdList.typesListItemTextMod.ListItemTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemText {
  
  @JSImport("@react-md/list", "ListItemText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def secondaryText(value: VdomNode): this.type = set("secondaryText", value.rawNode.asInstanceOf[js.Any])
    
    inline def secondaryTextClassName(value: String): this.type = set("secondaryTextClassName", value.asInstanceOf[js.Any])
    
    inline def secondaryTextNull: this.type = set("secondaryText", null)
    
    inline def secondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("secondaryText", js.Array(value*))
    
    inline def secondaryTextVdomElement(value: VdomElement): this.type = set("secondaryText", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
