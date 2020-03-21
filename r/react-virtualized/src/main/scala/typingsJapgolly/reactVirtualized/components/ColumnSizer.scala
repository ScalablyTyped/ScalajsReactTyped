package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualized.esColumnSizerMod.ColumnSizerProps
import typingsJapgolly.reactVirtualized.esColumnSizerMod.SizedColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ColumnSizer {
  def apply(
    width: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    columnCount: Int | Double = null,
    columnMaxWidth: Int | Double = null,
    columnMinWidth: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: SizedColumnProps => CallbackTo[Node]
  ): UnmountedWithRoot[
    ColumnSizerProps, 
    typingsJapgolly.reactVirtualized.mod.ColumnSizer, 
    Unit, 
    ColumnSizerProps
  ] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esColumnSizerMod.SizedColumnProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnMaxWidth != null) __obj.updateDynamic("columnMaxWidth")(columnMaxWidth.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esColumnSizerMod.ColumnSizerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactVirtualized.mod.ColumnSizer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esColumnSizerMod.ColumnSizerProps])
  }
  @JSImport("react-virtualized", "ColumnSizer")
  @js.native
  object componentImport extends js.Object
  
}

