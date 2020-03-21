package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.appCanvasMod.AppCanvasProps
import typingsJapgolly.materialUi.appCanvasMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AppCanvas {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AppCanvasProps, default, Unit, AppCanvasProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.appCanvasMod.AppCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.appCanvasMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.appCanvasMod.AppCanvasProps])(children: _*)
  }
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

