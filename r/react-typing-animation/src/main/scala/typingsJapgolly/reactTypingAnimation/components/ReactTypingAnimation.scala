package typingsJapgolly.reactTypingAnimation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTypingAnimation.mod.TypingProps
import typingsJapgolly.reactTypingAnimation.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTypingAnimation {
  def apply(
    className: String = null,
    cursor: VdomNode = null,
    cursorClassName: String = null,
    hideCursor: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    onAfterType: js.UndefOr[Callback] = js.undefined,
    onBeforeType: js.UndefOr[Callback] = js.undefined,
    onFinishedTyping: js.UndefOr[Callback] = js.undefined,
    onStartedTyping: js.UndefOr[Callback] = js.undefined,
    speed: Int | Double = null,
    startDelay: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TypingProps, default, Unit, TypingProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.rawNode.asInstanceOf[js.Any])
    if (cursorClassName != null) __obj.updateDynamic("cursorClassName")(cursorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCursor)) __obj.updateDynamic("hideCursor")(hideCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    onAfterType.foreach(p => __obj.updateDynamic("onAfterType")(p.toJsFn))
    onBeforeType.foreach(p => __obj.updateDynamic("onBeforeType")(p.toJsFn))
    onFinishedTyping.foreach(p => __obj.updateDynamic("onFinishedTyping")(p.toJsFn))
    onStartedTyping.foreach(p => __obj.updateDynamic("onStartedTyping")(p.toJsFn))
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTypingAnimation.mod.TypingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTypingAnimation.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTypingAnimation.mod.TypingProps])(children: _*)
  }
  @JSImport("react-typing-animation", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

