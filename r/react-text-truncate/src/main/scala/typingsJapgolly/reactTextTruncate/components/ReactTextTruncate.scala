package typingsJapgolly.reactTextTruncate.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTextTruncate.mod.TextTruncateProps
import typingsJapgolly.reactTextTruncate.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTextTruncate {
  def apply(
    containerClassName: String = null,
    element: String = null,
    line: Double | Boolean = null,
    maxCalculateTimes: Int | Double = null,
    onCalculated: js.UndefOr[Callback] = js.undefined,
    onToggled: /* truncated */ Boolean => Callback = null,
    onTruncated: js.UndefOr[Callback] = js.undefined,
    text: String = null,
    textElement: VdomNode = null,
    textTruncateChild: VdomNode = null,
    truncateText: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TextTruncateProps, default, Unit, TextTruncateProps] = {
    val __obj = js.Dynamic.literal()
  
      if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (maxCalculateTimes != null) __obj.updateDynamic("maxCalculateTimes")(maxCalculateTimes.asInstanceOf[js.Any])
    onCalculated.foreach(p => __obj.updateDynamic("onCalculated")(p.toJsFn))
    if (onToggled != null) __obj.updateDynamic("onToggled")(js.Any.fromFunction1((t0: /* truncated */ scala.Boolean) => onToggled(t0).runNow()))
    onTruncated.foreach(p => __obj.updateDynamic("onTruncated")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textElement != null) __obj.updateDynamic("textElement")(textElement.rawNode.asInstanceOf[js.Any])
    if (textTruncateChild != null) __obj.updateDynamic("textTruncateChild")(textTruncateChild.rawNode.asInstanceOf[js.Any])
    if (truncateText != null) __obj.updateDynamic("truncateText")(truncateText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTextTruncate.mod.TextTruncateProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTextTruncate.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTextTruncate.mod.TextTruncateProps])(children: _*)
  }
  @JSImport("react-text-truncate", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

