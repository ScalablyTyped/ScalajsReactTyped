package typingsJapgolly.reactMentions.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MentionProps extends js.Object {
  var appendSpaceOnAdd: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.Array[SuggestionDataItem] | DataFunc
  var displayTransform: js.UndefOr[DisplayTransformFunc] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
  var markup: js.UndefOr[String] = js.undefined
  var onAdd: js.UndefOr[js.Function2[/* id */ String | Double, /* display */ String, Unit]] = js.undefined
  var regex: js.UndefOr[js.RegExp] = js.undefined
  var renderSuggestion: js.UndefOr[
    js.Function5[
      /* suggestion */ SuggestionDataItem, 
      /* search */ String, 
      /* highlightedDisplay */ Node, 
      /* index */ Double, 
      /* focused */ Boolean, 
      Node
    ]
  ] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var trigger: String | js.RegExp
}

object MentionProps {
  @scala.inline
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
    style: js.Any = null
  ): MentionProps = {
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
    __obj.asInstanceOf[MentionProps]
  }
}

