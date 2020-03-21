package typingsJapgolly.reactTooltip.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactTooltip.AnonLeft
import typingsJapgolly.reactTooltip.mod.Effect
import typingsJapgolly.reactTooltip.mod.ElementEvents
import typingsJapgolly.reactTooltip.mod.GetContent
import typingsJapgolly.reactTooltip.mod.Offset
import typingsJapgolly.reactTooltip.mod.Place
import typingsJapgolly.reactTooltip.mod.Props
import typingsJapgolly.reactTooltip.mod.SanitizeHtmlOptions
import typingsJapgolly.reactTooltip.mod.Type
import typingsJapgolly.reactTooltip.mod.WindowEvents
import typingsJapgolly.reactTooltip.mod.^
import typingsJapgolly.reactTooltip.reactTooltipStrings.div
import typingsJapgolly.reactTooltip.reactTooltipStrings.span
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactTooltip {
  def apply(
    afterHide: js.UndefOr[Callback] = js.undefined,
    afterShow: js.UndefOr[Callback] = js.undefined,
    border: js.UndefOr[Boolean] = js.undefined,
    `class`: String = null,
    className: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    delayHide: Int | Double = null,
    delayShow: Int | Double = null,
    delayUpdate: Int | Double = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    effect: Effect = null,
    event: ElementEvents = null,
    eventOff: ElementEvents = null,
    getContent: GetContent = null,
    globalEventOff: WindowEvents = null,
    html: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    insecure: js.UndefOr[Boolean] = js.undefined,
    isCapture: js.UndefOr[Boolean] = js.undefined,
    multiline: js.UndefOr[Boolean] = js.undefined,
    offset: Offset = null,
    overridePosition: (/* position */ AnonLeft, /* currentEvent */ Event_, /* currentTarget */ Element, /* node */ js.Any, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => CallbackTo[AnonLeft] = null,
    place: Place = null,
    resizeHide: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    sanitizeHtmlOptions: SanitizeHtmlOptions = null,
    scrollHide: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    watchWindow: js.UndefOr[Boolean] = js.undefined,
    wrapper: div | span = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      afterHide.foreach(p => __obj.updateDynamic("afterHide")(p.toJsFn))
    afterShow.foreach(p => __obj.updateDynamic("afterShow")(p.toJsFn))
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (delayHide != null) __obj.updateDynamic("delayHide")(delayHide.asInstanceOf[js.Any])
    if (delayShow != null) __obj.updateDynamic("delayShow")(delayShow.asInstanceOf[js.Any])
    if (delayUpdate != null) __obj.updateDynamic("delayUpdate")(delayUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (eventOff != null) __obj.updateDynamic("eventOff")(eventOff.asInstanceOf[js.Any])
    if (getContent != null) __obj.updateDynamic("getContent")(getContent.asInstanceOf[js.Any])
    if (globalEventOff != null) __obj.updateDynamic("globalEventOff")(globalEventOff.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (!js.isUndefined(isCapture)) __obj.updateDynamic("isCapture")(isCapture.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (overridePosition != null) __obj.updateDynamic("overridePosition")(js.Any.fromFunction8((t0: /* position */ typingsJapgolly.reactTooltip.AnonLeft, t1: /* currentEvent */ typingsJapgolly.std.Event_, t2: /* currentTarget */ org.scalajs.dom.raw.Element, t3: /* node */ js.Any, t4: /* place */ typingsJapgolly.reactTooltip.mod.Place, t5: /* desiredPlace */ typingsJapgolly.reactTooltip.mod.Place, t6: /* effect */ typingsJapgolly.reactTooltip.mod.Effect, t7: /* offset */ typingsJapgolly.reactTooltip.mod.Offset) => overridePosition(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeHide)) __obj.updateDynamic("resizeHide")(resizeHide.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sanitizeHtmlOptions != null) __obj.updateDynamic("sanitizeHtmlOptions")(sanitizeHtmlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHide)) __obj.updateDynamic("scrollHide")(scrollHide.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(watchWindow)) __obj.updateDynamic("watchWindow")(watchWindow.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTooltip.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTooltip.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTooltip.mod.Props])(children: _*)
  }
  @JSImport("react-tooltip", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

