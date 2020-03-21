package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.antd.antdStrings.ltr
import typingsJapgolly.antd.antdStrings.rtl
import typingsJapgolly.antd.operationMod.TransferOperationProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TransferOperationProps1613396745 () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    direction: ltr | rtl = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    leftActive: js.UndefOr[Boolean] = js.undefined,
    leftArrowText: String = null,
    moveToLeft: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    moveToRight: ReactMouseEventFrom[HTMLButtonElement] => Callback = null,
    rightActive: js.UndefOr[Boolean] = js.undefined,
    rightArrowText: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TransferOperationProps, 
    MountedWithRawType[TransferOperationProps, js.Object, RawMounted[TransferOperationProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(leftActive)) __obj.updateDynamic("leftActive")(leftActive.asInstanceOf[js.Any])
    if (leftArrowText != null) __obj.updateDynamic("leftArrowText")(leftArrowText.asInstanceOf[js.Any])
    if (moveToLeft != null) __obj.updateDynamic("moveToLeft")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => moveToLeft(t0).runNow()))
    if (moveToRight != null) __obj.updateDynamic("moveToRight")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLButtonElement]) => moveToRight(t0).runNow()))
    if (!js.isUndefined(rightActive)) __obj.updateDynamic("rightActive")(rightActive.asInstanceOf[js.Any])
    if (rightArrowText != null) __obj.updateDynamic("rightArrowText")(rightArrowText.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.operationMod.TransferOperationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.operationMod.TransferOperationProps])(children: _*)
  }
}

