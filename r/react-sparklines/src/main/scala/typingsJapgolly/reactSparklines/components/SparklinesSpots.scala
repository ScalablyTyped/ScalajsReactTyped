package typingsJapgolly.reactSparklines.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSparklines.mod.SparklinesSpotsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SparklinesSpots {
  def apply(
    size: Int | Double = null,
    spotColors: StringDictionary[String] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SparklinesSpotsProps, 
    typingsJapgolly.reactSparklines.mod.SparklinesSpots, 
    Unit, 
    SparklinesSpotsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spotColors != null) __obj.updateDynamic("spotColors")(spotColors.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSparklines.mod.SparklinesSpotsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSparklines.mod.SparklinesSpots](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSparklines.mod.SparklinesSpotsProps])(children: _*)
  }
  @JSImport("react-sparklines", "SparklinesSpots")
  @js.native
  object componentImport extends js.Object
  
}

