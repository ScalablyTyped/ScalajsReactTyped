package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps
import typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ChildProps
import typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ScrollIndices
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.cells
import typingsJapgolly.reactVirtualized.reactVirtualizedStrings.edges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ArrowKeyStepper {
  def apply(
    columnCount: Double,
    rowCount: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mode: edges | cells = null,
    onScrollToChange: /* params */ ScrollIndices => Callback = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildProps => CallbackTo[Node]
  ): UnmountedWithRoot[
    ArrowKeyStepperProps, 
    typingsJapgolly.reactVirtualized.mod.ArrowKeyStepper, 
    Unit, 
    ArrowKeyStepperProps
  ] = {
    val __obj = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ChildProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onScrollToChange != null) __obj.updateDynamic("onScrollToChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ScrollIndices) => onScrollToChange(t0).runNow()))
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.ArrowKeyStepper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esArrowKeyStepperMod.ArrowKeyStepperProps])
  }
  @JSImport("react-virtualized", "ArrowKeyStepper")
  @js.native
  object componentImport extends js.Object
  
}

