package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.AnonH
import typingsJapgolly.protonNative.AnonX
import typingsJapgolly.protonNative.mod.AreaPathProps
import typingsJapgolly.protonNative.protonNativeStrings.bevel
import typingsJapgolly.protonNative.protonNativeStrings.evenodd
import typingsJapgolly.protonNative.protonNativeStrings.flat
import typingsJapgolly.protonNative.protonNativeStrings.miter
import typingsJapgolly.protonNative.protonNativeStrings.nonzero
import typingsJapgolly.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AreaPath {
  def apply(
    d: String,
    fillMode: nonzero | evenodd,
    align: AnonH = null,
    column: Int | Double = null,
    expand: AnonH = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    label: String = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    transform: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AreaPathProps, typingsJapgolly.protonNative.mod.AreaPath, Unit, AreaPathProps] = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.AreaPathProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.protonNative.mod.AreaPath](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.AreaPathProps])(children: _*)
  }
  @JSImport("proton-native", "AreaPath")
  @js.native
  object componentImport extends js.Object
  
}

