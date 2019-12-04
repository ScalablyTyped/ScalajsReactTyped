package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.antdStrings.alternate
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.libTimelineMod.default
import typingsJapgolly.antd.libTimelineTimelineMod.TimelineProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Timeline {
  def apply(
    className: String = null,
    mode: left | alternate | right = null,
    pending: VdomNode = null,
    pendingDot: VdomNode = null,
    prefixCls: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TimelineProps, default, Unit, TimelineProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.rawNode.asInstanceOf[js.Any])
    if (pendingDot != null) __obj.updateDynamic("pendingDot")(pendingDot.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTimelineTimelineMod.TimelineProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTimelineMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTimelineTimelineMod.TimelineProps])(children: _*)
  }
  @JSImport("antd/lib/timeline", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

