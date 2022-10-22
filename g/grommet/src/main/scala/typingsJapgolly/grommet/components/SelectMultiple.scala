package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Bottom
import typingsJapgolly.grommet.anon.Key
import typingsJapgolly.grommet.anon.Multiple
import typingsJapgolly.grommet.es6ComponentsDropMod.DropProps
import typingsJapgolly.grommet.es6ComponentsSelectMultipleMod.SelectMultipleExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PlaceHolderType
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectMultiple {
  
  inline def apply(options: js.Array[String | Boolean | Double | Element | js.Object]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectMultipleExtendedProps]))
  }
  
  @JSImport("grommet/es6", "SelectMultiple")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def children(value: /* repeated */ Any => Any): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def defaultValue(value: js.Array[String | Double | js.Object]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: (String | Double | js.Object)*): this.type = set("defaultValue", js.Array(value*))
    
    inline def disabled(value: Boolean | (js.Array[Double | String | js.Object])): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledKey(value: String | (js.Function1[/* repeated */ Any, Any])): this.type = set("disabledKey", value.asInstanceOf[js.Any])
    
    inline def disabledKeyFunction1(value: /* repeated */ Any => Any): this.type = set("disabledKey", js.Any.fromFunction1(value))
    
    inline def disabledVarargs(value: (Double | String | js.Object)*): this.type = set("disabled", js.Array(value*))
    
    inline def dropAlign(value: Bottom): this.type = set("dropAlign", value.asInstanceOf[js.Any])
    
    inline def dropHeight(value: xsmall | small | medium | large | xlarge | String): this.type = set("dropHeight", value.asInstanceOf[js.Any])
    
    inline def dropProps(value: DropProps): this.type = set("dropProps", value.asInstanceOf[js.Any])
    
    inline def dropTarget(value: js.Object): this.type = set("dropTarget", value.asInstanceOf[js.Any])
    
    inline def emptySearchMessage(value: String | Node): this.type = set("emptySearchMessage", value.asInstanceOf[js.Any])
    
    inline def emptySearchMessageNull: this.type = set("emptySearchMessage", null)
    
    inline def emptySearchMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("emptySearchMessage", js.Array(value*))
    
    inline def emptySearchMessageVdomElement(value: VdomElement): this.type = set("emptySearchMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def focusIndicator(value: Boolean): this.type = set("focusIndicator", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def help(value: String | Node): this.type = set("help", value.asInstanceOf[js.Any])
    
    inline def helpNull: this.type = set("help", null)
    
    inline def helpVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("help", js.Array(value*))
    
    inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
    
    inline def icon(value: Boolean | (js.Function1[/* repeated */ Any, Any]) | Node | FC[js.Object]): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconFunction1(value: /* repeated */ Any => Any): this.type = set("icon", js.Any.fromFunction1(value))
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def labelKey(value: String | (js.Function1[/* repeated */ Any, String | Node])): this.type = set("labelKey", value.asInstanceOf[js.Any])
    
    inline def labelKeyFunction1(value: /* repeated */ Any => String | Node): this.type = set("labelKey", js.Any.fromFunction1(value))
    
    inline def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def messages(value: Multiple): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* repeated */ Any => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def onClose(value: /* repeated */ Any => Any): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def onMore(value: /* repeated */ Any => Any): this.type = set("onMore", js.Any.fromFunction1(value))
    
    inline def onOpen(value: /* repeated */ Any => Any): this.type = set("onOpen", js.Any.fromFunction1(value))
    
    inline def onSearch(value: /* search */ String => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* search */ String) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: PlaceHolderType): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def replace(value: Boolean): this.type = set("replace", value.asInstanceOf[js.Any])
    
    inline def searchPlaceholder(value: String): this.type = set("searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def showSelectedInline(value: Boolean): this.type = set("showSelectedInline", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large | xlarge | String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def sortSelectedOnClose(value: Boolean): this.type = set("sortSelectedOnClose", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Array[String | Double | js.Object]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueKey(value: String | Key | (js.Function1[/* repeated */ Any, String])): this.type = set("valueKey", value.asInstanceOf[js.Any])
    
    inline def valueKeyFunction1(value: /* repeated */ Any => String): this.type = set("valueKey", js.Any.fromFunction1(value))
    
    inline def valueLabel(value: Node | (js.Function1[/* repeated */ Any, String | Node])): this.type = set("valueLabel", value.asInstanceOf[js.Any])
    
    inline def valueLabelFunction1(value: /* repeated */ Any => String | Node): this.type = set("valueLabel", js.Any.fromFunction1(value))
    
    inline def valueLabelNull: this.type = set("valueLabel", null)
    
    inline def valueLabelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("valueLabel", js.Array(value*))
    
    inline def valueLabelVdomElement(value: VdomElement): this.type = set("valueLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: (String | Double | js.Object)*): this.type = set("value", js.Array(value*))
  }
  
  def withProps(p: SelectMultipleExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
