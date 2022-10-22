package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import typingsJapgolly.wixUiCore.distEsSrcComponentsLabelWithOptionsLabelWithOptionsMod.LabelWithOptionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelWithOptions {
  
  inline def apply(options: js.Array[Option]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LabelWithOptionsProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "LabelWithOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.LabelWithOptions] {
    
    inline def checkbox(value: Boolean): this.type = set("checkbox", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def ellipsis(value: Boolean): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
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
    
    inline def onDeselect(value: /* option */ Option | Null => Callback): this.type = set("onDeselect", js.Any.fromFunction1((t0: /* option */ Option | Null) => value(t0).runNow()))
    
    inline def onSelect(value: /* option */ Option => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* option */ Option) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def renderSuffix(value: /* isError */ Boolean => Node): this.type = set("renderSuffix", js.Any.fromFunction1(value))
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LabelWithOptionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
