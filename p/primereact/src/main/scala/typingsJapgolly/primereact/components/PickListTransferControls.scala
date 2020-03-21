package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonTarget
import typingsJapgolly.primereact.pickListTransferControlsMod.PickListTransferControlsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickListTransferControls {
  def apply(
    onTransfer: /* e */ AnonTarget => Callback = null,
    source: js.Array[_] = null,
    sourceSelection: js.Array[_] = null,
    target: js.Array[_] = null,
    targetSelection: js.Array[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickListTransferControlsProps, 
    typingsJapgolly.primereact.pickListTransferControlsMod.PickListTransferControls, 
    Unit, 
    PickListTransferControlsProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (onTransfer != null) __obj.updateDynamic("onTransfer")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonTarget) => onTransfer(t0).runNow()))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceSelection != null) __obj.updateDynamic("sourceSelection")(sourceSelection.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetSelection != null) __obj.updateDynamic("targetSelection")(targetSelection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.pickListTransferControlsMod.PickListTransferControlsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.pickListTransferControlsMod.PickListTransferControls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.pickListTransferControlsMod.PickListTransferControlsProps])(children: _*)
  }
  @JSImport("primereact/components/picklist/PickListTransferControls", "PickListTransferControls")
  @js.native
  object componentImport extends js.Object
  
}

