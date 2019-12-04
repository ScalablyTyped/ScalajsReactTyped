package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.internalScaleInMod.ScaleInProps
import typingsJapgolly.materialDashUi.internalScaleInMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleIn {
  def apply(
    childStyle: CSSProperties = null,
    enterDelay: Int | Double = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScaleInProps, default, Unit, ScaleInProps] = {
    val __obj = js.Dynamic.literal()
  
      if (childStyle != null) __obj.updateDynamic("childStyle")(childStyle.asInstanceOf[js.Any])
    if (enterDelay != null) __obj.updateDynamic("enterDelay")(enterDelay.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.internalScaleInMod.ScaleInProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.internalScaleInMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.internalScaleInMod.ScaleInProps])(children: _*)
  }
  @JSImport("material-ui/internal/ScaleIn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

