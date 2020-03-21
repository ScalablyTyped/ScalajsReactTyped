package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.growlMod.GrowlMessage
import typingsJapgolly.primereact.growlMod.GrowlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Growl {
  def apply(
    baseZIndex: Int | Double = null,
    className: String = null,
    id: String = null,
    onClick: /* message */ GrowlMessage => Callback = null,
    onClose: /* message */ GrowlMessage => Callback = null,
    onRemove: /* message */ GrowlMessage => Callback = null,
    position: String = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GrowlProps, typingsJapgolly.primereact.primereactGrowlMod.Growl, Unit, GrowlProps] = {
    val __obj = js.Dynamic.literal()
  
      if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onClick(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onClose(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.growlMod.GrowlMessage) => onRemove(t0).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.growlMod.GrowlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactGrowlMod.Growl](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.growlMod.GrowlProps])(children: _*)
  }
  @JSImport("primereact/growl", "Growl")
  @js.native
  object componentImport extends js.Object
  
}

