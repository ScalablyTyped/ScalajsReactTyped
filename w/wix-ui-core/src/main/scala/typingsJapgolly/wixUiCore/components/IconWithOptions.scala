package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownConstantsMod.OPEN_TRIGGER_TYPE
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsIconWithOptionsIconWithOptionsMod.IconWithOptionsProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsPopoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconWithOptions {
  
  inline def apply(iconUrl: String, options: js.Array[Option]): Builder = {
    val __props = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconWithOptionsProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "IconWithOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def fixedFooter(value: VdomNode): this.type = set("fixedFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedFooterNull: this.type = set("fixedFooter", null)
    
    inline def fixedFooterVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedFooter", js.Array(value*))
    
    inline def fixedFooterVdomElement(value: VdomElement): this.type = set("fixedFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def fixedHeader(value: VdomNode): this.type = set("fixedHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def fixedHeaderNull: this.type = set("fixedHeader", null)
    
    inline def fixedHeaderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("fixedHeader", js.Array(value*))
    
    inline def fixedHeaderVdomElement(value: VdomElement): this.type = set("fixedHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def initialSelectedIds(value: js.Array[String | Double]): this.type = set("initialSelectedIds", value.asInstanceOf[js.Any])
    
    inline def initialSelectedIdsVarargs(value: (String | Double)*): this.type = set("initialSelectedIds", js.Array(value*))
    
    inline def multi(value: Boolean): this.type = set("multi", value.asInstanceOf[js.Any])
    
    inline def onDeselect(value: /* option */ Option => Callback): this.type = set("onDeselect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
    
    inline def onSelect(value: /* option */ Option => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
    
    inline def openTrigger(value: OPEN_TRIGGER_TYPE): this.type = set("openTrigger", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconWithOptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
