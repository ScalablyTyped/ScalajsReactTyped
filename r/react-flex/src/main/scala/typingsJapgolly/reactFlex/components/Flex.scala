package typingsJapgolly.reactFlex.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlex.mod.FlexProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flex {
  def apply(
    alignContent: String = null,
    alignItems: String = null,
    column: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    flex: Double | String | Boolean = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    justifyContent: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    row: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    wrap: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FlexProps, typingsJapgolly.reactFlex.mod.Flex, Unit, FlexProps] = {
    val __obj = js.Dynamic.literal()
  
      if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlex.mod.FlexProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlex.mod.Flex](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlex.mod.FlexProps])(children: _*)
  }
  @JSImport("react-flex", "Flex")
  @js.native
  object componentImport extends js.Object
  
}

