package typingsJapgolly.reactToolbox.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactToolbox.componentsListListItemContentMod.ListItemContentProps
import typingsJapgolly.reactToolbox.componentsListListItemContentMod.ListItemContentTheme
import typingsJapgolly.reactToolbox.reactToolboxStrings.auto
import typingsJapgolly.reactToolbox.reactToolboxStrings.large
import typingsJapgolly.reactToolbox.reactToolboxStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemContent {
  
  @JSImport("react-toolbox/components/list", "ListItemContent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactToolbox.componentsListMod.ListItemContent] {
    
    inline def caption(value: VdomNode): this.type = set("caption", value.rawNode.asInstanceOf[js.Any])
    
    inline def captionNull: this.type = set("caption", null)
    
    inline def captionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("caption", js.Array(value*))
    
    inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def legend(value: String): this.type = set("legend", value.asInstanceOf[js.Any])
    
    inline def theme(value: ListItemContentTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def `type`(value: auto | normal | large): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ListItemContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemContentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
