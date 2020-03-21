package typingsJapgolly.hedron.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.hedron.hedronStrings.`inline-block`
import typingsJapgolly.hedron.hedronStrings.`inline-flex`
import typingsJapgolly.hedron.hedronStrings.`inline-grid`
import typingsJapgolly.hedron.hedronStrings.`inline-table`
import typingsJapgolly.hedron.hedronStrings.`inline`
import typingsJapgolly.hedron.hedronStrings.`list-item`
import typingsJapgolly.hedron.hedronStrings.`run-in`
import typingsJapgolly.hedron.hedronStrings.`table-caption`
import typingsJapgolly.hedron.hedronStrings.`table-cell`
import typingsJapgolly.hedron.hedronStrings.`table-column-group`
import typingsJapgolly.hedron.hedronStrings.`table-column`
import typingsJapgolly.hedron.hedronStrings.`table-footer-group`
import typingsJapgolly.hedron.hedronStrings.`table-header-group`
import typingsJapgolly.hedron.hedronStrings.`table-row-group`
import typingsJapgolly.hedron.hedronStrings.`table-row`
import typingsJapgolly.hedron.hedronStrings.block
import typingsJapgolly.hedron.hedronStrings.bottom
import typingsJapgolly.hedron.hedronStrings.center
import typingsJapgolly.hedron.hedronStrings.collapse
import typingsJapgolly.hedron.hedronStrings.contents
import typingsJapgolly.hedron.hedronStrings.flex
import typingsJapgolly.hedron.hedronStrings.grid
import typingsJapgolly.hedron.hedronStrings.hidden
import typingsJapgolly.hedron.hedronStrings.horizontal
import typingsJapgolly.hedron.hedronStrings.inherit
import typingsJapgolly.hedron.hedronStrings.initial
import typingsJapgolly.hedron.hedronStrings.left
import typingsJapgolly.hedron.hedronStrings.none
import typingsJapgolly.hedron.hedronStrings.right
import typingsJapgolly.hedron.hedronStrings.table
import typingsJapgolly.hedron.hedronStrings.top
import typingsJapgolly.hedron.hedronStrings.vertical
import typingsJapgolly.hedron.hedronStrings.visible
import typingsJapgolly.hedron.mod.BoundsProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bounds {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    StringDictionary: /**
    * Allow for customer props due to ability to add
    * custom breakpoints
    */
  /* x */ StringDictionary[js.Any] = null,
    background: String = null,
    border: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    direction: horizontal | vertical = null,
    display: `inline` | block | contents | flex | grid | `inline-block` | none | initial | inherit | `inline-flex` | `inline-grid` | `inline-table` | `list-item` | `run-in` | table | `table-caption` | `table-column-group` | `table-header-group` | `table-footer-group` | `table-row-group` | `table-cell` | `table-column` | `table-row` = null,
    flex: String = null,
    halign: left | center | right = null,
    height: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    margin: String = null,
    opacity: Int | Double = null,
    padding: String = null,
    valign: top | center | bottom = null,
    visibility: visible | hidden | collapse | initial | inherit = null,
    width: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BoundsProps with HTMLProps[HTMLElement], 
    typingsJapgolly.hedron.mod.Bounds, 
    Unit, 
    BoundsProps with HTMLProps[HTMLElement]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (halign != null) __obj.updateDynamic("halign")(halign.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.hedron.mod.BoundsProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLElement], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.hedron.mod.Bounds](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.hedron.mod.BoundsProps with typingsJapgolly.react.mod.HTMLProps[org.scalajs.dom.raw.HTMLElement]])(children: _*)
  }
  @JSImport("hedron", "Bounds")
  @js.native
  object componentImport extends js.Object
  
}

