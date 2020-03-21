package typingsJapgolly.jupyterlabStatusbar.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  def apply(
    percentage: Double,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[IProps, MountedWithRawType[IProps, js.Object, RawMounted[IProps, js.Object]]] = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps])(children: _*)
  }
  @JSImport("@jupyterlab/statusbar", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
}

