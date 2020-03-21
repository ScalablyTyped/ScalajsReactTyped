package typingsJapgolly.reactMentions.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMentions.mod.DataFunc
import typingsJapgolly.reactMentions.mod.MentionProps
import typingsJapgolly.reactMentions.mod.SuggestionDataItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mention {
  def apply(
    data: js.Array[SuggestionDataItem] | DataFunc,
    trigger: String | js.RegExp,
    appendSpaceOnAdd: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    displayTransform: (/* id */ String, /* display */ String) => CallbackTo[String] = null,
    isLoading: js.UndefOr[Boolean] = js.undefined,
    markup: String = null,
    onAdd: (/* id */ String | Double, /* display */ String) => Callback = null,
    regex: js.RegExp = null,
    renderSuggestion: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ Node, /* index */ Double, /* focused */ Boolean) => CallbackTo[Node] = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    MentionProps, 
    MountedWithRawType[MentionProps, js.Object, RawMounted[MentionProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
      if (!js.isUndefined(appendSpaceOnAdd)) __obj.updateDynamic("appendSpaceOnAdd")(appendSpaceOnAdd.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayTransform != null) __obj.updateDynamic("displayTransform")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* display */ java.lang.String) => displayTransform(t0, t1).runNow()))
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    if (markup != null) __obj.updateDynamic("markup")(markup.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(js.Any.fromFunction2((t0: /* id */ java.lang.String | scala.Double, t1: /* display */ java.lang.String) => onAdd(t0, t1).runNow()))
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (renderSuggestion != null) __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction5((t0: /* suggestion */ typingsJapgolly.reactMentions.mod.SuggestionDataItem, t1: /* search */ java.lang.String, t2: /* highlightedDisplay */ japgolly.scalajs.react.raw.React.Node, t3: /* index */ scala.Double, t4: /* focused */ scala.Boolean) => renderSuggestion(t0, t1, t2, t3, t4).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactMentions.mod.MentionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMentions.mod.MentionProps])(children: _*)
  }
  @JSImport("react-mentions", "Mention")
  @js.native
  object componentImport extends js.Object
  
}

