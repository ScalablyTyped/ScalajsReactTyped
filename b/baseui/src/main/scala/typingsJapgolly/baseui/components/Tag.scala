package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.tagTypesMod.TagKind
import typingsJapgolly.baseui.tagTypesMod.TagOverrides
import typingsJapgolly.baseui.tagTypesMod.TagProps
import typingsJapgolly.baseui.tagTypesMod.TagSize
import typingsJapgolly.baseui.tagTypesMod.TagVariant
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  @JSImport("baseui/tag", "Tag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLSpanElement] {
    
    inline def closeable(value: Boolean): this.type = set("closeable", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    inline def isHovered(value: Boolean): this.type = set("isHovered", value.asInstanceOf[js.Any])
    
    inline def kind(value: TagKind): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def onActionClick(value: (/* e */ Event, /* children */ js.UndefOr[Node]) => Any): this.type = set("onActionClick", js.Any.fromFunction2(value))
    
    inline def onActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[Node]) => Any): this.type = set("onActionKeyDown", js.Any.fromFunction2(value))
    
    inline def onClick(value: /* event */ Event => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onClickNull: this.type = set("onClick", null)
    
    inline def onKeyDown(value: /* event */ Event => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onKeyDownNull: this.type = set("onKeyDown", null)
    
    inline def overrides(value: TagOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: TagSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: ComponentType[js.Object]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def variant(value: TagVariant): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TagProps & RefAttributes[HTMLSpanElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
