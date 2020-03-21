package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.resizeSensorMod.IResizeEntry
import typingsJapgolly.blueprintjsCore.resizeSensorMod.IResizeSensorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResizeSensor {
  def apply(
    onResize: js.Array[IResizeEntry] => Callback,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IResizeSensorProps, 
    typingsJapgolly.blueprintjsCore.mod.ResizeSensor, 
    Unit, 
    IResizeSensorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.blueprintjsCore.resizeSensorMod.IResizeEntry]) => onResize(t0).runNow()))
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.resizeSensorMod.IResizeSensorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.ResizeSensor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.resizeSensorMod.IResizeSensorProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "ResizeSensor")
  @js.native
  object componentImport extends js.Object
  
}

