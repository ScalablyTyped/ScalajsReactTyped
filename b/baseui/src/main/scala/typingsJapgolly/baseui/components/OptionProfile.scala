package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.ListItemProfile
import typingsJapgolly.baseui.menuTypesMod.OptionProfileProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptionProfile {
  
  inline def apply(
    getProfileItemImg: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => String | ComponentType[Any],
    getProfileItemImgText: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => String,
    getProfileItemLabels: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => typingsJapgolly.baseui.anon.Body,
    item: typingsJapgolly.baseui.menuTypesMod.Item
  ): Builder = {
    val __props = js.Dynamic.literal(getProfileItemImg = js.Any.fromFunction1(getProfileItemImg), getProfileItemImgText = js.Any.fromFunction1(getProfileItemImgText), getProfileItemLabels = js.Any.fromFunction1(getProfileItemLabels), item = item.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OptionProfileProps & RefAttributes[HTMLElement]]))
  }
  
  @JSImport("baseui/menu", "OptionProfile")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def $isHighlighted(value: Boolean): this.type = set("$isHighlighted", value.asInstanceOf[js.Any])
    
    inline def getChildMenu(value: /* item */ typingsJapgolly.baseui.menuTypesMod.Item => Node): this.type = set("getChildMenu", js.Any.fromFunction1(value))
    
    inline def overrides(value: ListItemProfile): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
    
    inline def resetMenu(value: Callback): this.type = set("resetMenu", value.toJsFn)
  }
  
  def withProps(p: OptionProfileProps & RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
