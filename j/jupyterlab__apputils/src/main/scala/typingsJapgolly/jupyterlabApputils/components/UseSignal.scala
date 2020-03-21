package typingsJapgolly.jupyterlabApputils.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabApputils.vdomMod.IUseSignalProps
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UseSignal {
  def apply[SENDER, ARGS](
    signal: ISignal[SENDER, ARGS],
    initialArgs: ARGS = null,
    initialSender: SENDER = null,
    shouldUpdate: (SENDER, ARGS) => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.UndefOr[SENDER], js.UndefOr[ARGS]) => CallbackTo[Node]
  ): UnmountedWithRoot[
    IUseSignalProps[SENDER, ARGS], 
    typingsJapgolly.jupyterlabApputils.mod.UseSignal[SENDER, ARGS], 
    Unit, 
    IUseSignalProps[SENDER, ARGS]
  ] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.UndefOr[SENDER], t1: js.UndefOr[ARGS]) => children(t0, t1).runNow()))
    if (initialArgs != null) __obj.updateDynamic("initialArgs")(initialArgs.asInstanceOf[js.Any])
    if (initialSender != null) __obj.updateDynamic("initialSender")(initialSender.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2((t0: SENDER, t1: ARGS) => shouldUpdate(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.jupyterlabApputils.vdomMod.IUseSignalProps[SENDER, ARGS], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.jupyterlabApputils.mod.UseSignal[SENDER, ARGS]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabApputils.vdomMod.IUseSignalProps[SENDER, ARGS]])
  }
  @JSImport("@jupyterlab/apputils", "UseSignal")
  @js.native
  object componentImport extends js.Object
  
}

