package typingsJapgolly.rcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcPicker.headerMod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    prefixCls: String,
    nextIcon: VdomNode = null,
    onNext: js.UndefOr[Callback] = js.undefined,
    onPrev: js.UndefOr[Callback] = js.undefined,
    onSuperNext: js.UndefOr[Callback] = js.undefined,
    onSuperPrev: js.UndefOr[Callback] = js.undefined,
    prevIcon: VdomNode = null,
    superNextIcon: VdomNode = null,
    superPrevIcon: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    HeaderProps, 
    MountedWithRawType[HeaderProps, js.Object, RawMounted[HeaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
  
      if (nextIcon != null) __obj.updateDynamic("nextIcon")(nextIcon.rawNode.asInstanceOf[js.Any])
    onNext.foreach(p => __obj.updateDynamic("onNext")(p.toJsFn))
    onPrev.foreach(p => __obj.updateDynamic("onPrev")(p.toJsFn))
    onSuperNext.foreach(p => __obj.updateDynamic("onSuperNext")(p.toJsFn))
    onSuperPrev.foreach(p => __obj.updateDynamic("onSuperPrev")(p.toJsFn))
    if (prevIcon != null) __obj.updateDynamic("prevIcon")(prevIcon.rawNode.asInstanceOf[js.Any])
    if (superNextIcon != null) __obj.updateDynamic("superNextIcon")(superNextIcon.rawNode.asInstanceOf[js.Any])
    if (superPrevIcon != null) __obj.updateDynamic("superPrevIcon")(superPrevIcon.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcPicker.headerMod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcPicker.headerMod.HeaderProps])(children: _*)
  }
  @JSImport("rc-picker/lib/panels/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

