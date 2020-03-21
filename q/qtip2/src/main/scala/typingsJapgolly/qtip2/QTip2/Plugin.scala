package typingsJapgolly.qtip2.QTip2

import typingsJapgolly.qtip2.AnonText
import typingsJapgolly.qtip2.JQuery
import typingsJapgolly.qtip2.qtip2Strings.api
import typingsJapgolly.qtip2.qtip2Strings.blur
import typingsJapgolly.qtip2.qtip2Strings.content
import typingsJapgolly.qtip2.qtip2Strings.contentDotattr
import typingsJapgolly.qtip2.qtip2Strings.contentDotbutton
import typingsJapgolly.qtip2.qtip2Strings.contentDottext
import typingsJapgolly.qtip2.qtip2Strings.contentDottitle
import typingsJapgolly.qtip2.qtip2Strings.destroy
import typingsJapgolly.qtip2.qtip2Strings.disable
import typingsJapgolly.qtip2.qtip2Strings.enable
import typingsJapgolly.qtip2.qtip2Strings.events
import typingsJapgolly.qtip2.qtip2Strings.eventsDotblur
import typingsJapgolly.qtip2.qtip2Strings.eventsDotfocus
import typingsJapgolly.qtip2.qtip2Strings.eventsDothidden
import typingsJapgolly.qtip2.qtip2Strings.eventsDothide
import typingsJapgolly.qtip2.qtip2Strings.eventsDotmove
import typingsJapgolly.qtip2.qtip2Strings.eventsDotrender
import typingsJapgolly.qtip2.qtip2Strings.eventsDotshow
import typingsJapgolly.qtip2.qtip2Strings.eventsDottoggle
import typingsJapgolly.qtip2.qtip2Strings.eventsDotvisible
import typingsJapgolly.qtip2.qtip2Strings.focus
import typingsJapgolly.qtip2.qtip2Strings.hide
import typingsJapgolly.qtip2.qtip2Strings.hideDotdelay
import typingsJapgolly.qtip2.qtip2Strings.hideDotdistance
import typingsJapgolly.qtip2.qtip2Strings.hideDoteffect
import typingsJapgolly.qtip2.qtip2Strings.hideDotevent
import typingsJapgolly.qtip2.qtip2Strings.hideDotfixed
import typingsJapgolly.qtip2.qtip2Strings.hideDotinactive
import typingsJapgolly.qtip2.qtip2Strings.hideDotleave
import typingsJapgolly.qtip2.qtip2Strings.hideDottarget
import typingsJapgolly.qtip2.qtip2Strings.id
import typingsJapgolly.qtip2.qtip2Strings.metadata
import typingsJapgolly.qtip2.qtip2Strings.option
import typingsJapgolly.qtip2.qtip2Strings.overwrite
import typingsJapgolly.qtip2.qtip2Strings.position
import typingsJapgolly.qtip2.qtip2Strings.positionDotadjust
import typingsJapgolly.qtip2.qtip2Strings.positionDotat
import typingsJapgolly.qtip2.qtip2Strings.positionDotcontainer
import typingsJapgolly.qtip2.qtip2Strings.positionDoteffect
import typingsJapgolly.qtip2.qtip2Strings.positionDotmy
import typingsJapgolly.qtip2.qtip2Strings.positionDottarget
import typingsJapgolly.qtip2.qtip2Strings.positionDotviewport
import typingsJapgolly.qtip2.qtip2Strings.prerender
import typingsJapgolly.qtip2.qtip2Strings.reposition
import typingsJapgolly.qtip2.qtip2Strings.show
import typingsJapgolly.qtip2.qtip2Strings.showDotdelay
import typingsJapgolly.qtip2.qtip2Strings.showDoteffect
import typingsJapgolly.qtip2.qtip2Strings.showDotevent
import typingsJapgolly.qtip2.qtip2Strings.showDotmodal
import typingsJapgolly.qtip2.qtip2Strings.showDotready
import typingsJapgolly.qtip2.qtip2Strings.showDotsolo
import typingsJapgolly.qtip2.qtip2Strings.showDottarget
import typingsJapgolly.qtip2.qtip2Strings.style
import typingsJapgolly.qtip2.qtip2Strings.styleDotclasses
import typingsJapgolly.qtip2.qtip2Strings.styleDotdef
import typingsJapgolly.qtip2.qtip2Strings.styleDotheight
import typingsJapgolly.qtip2.qtip2Strings.styleDottip
import typingsJapgolly.qtip2.qtip2Strings.styleDotwidget
import typingsJapgolly.qtip2.qtip2Strings.styleDotwidth
import typingsJapgolly.qtip2.qtip2Strings.suppress
import typingsJapgolly.qtip2.qtip2Strings.toggle
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var defaults: QTipOptions = js.native
  def apply(): JQuery = js.native
  def apply(methodName: String): js.Any = js.native
  def apply(methodName: String, p1: js.Any): js.Any = js.native
  def apply(methodName: String, p1: js.Any, p2: js.Any): js.Any = js.native
  def apply(methodName: String, p1: js.Any, p2: js.Any, p3: js.Any): js.Any = js.native
  def apply(methodName: api): Api = js.native
  def apply(methodName: blur): JQuery = js.native
  def apply(methodName: blur, event: Event_): JQuery = js.native
  def apply(methodName: destroy): JQuery = js.native
  def apply(methodName: destroy, immediate: Boolean): JQuery = js.native
  def apply(methodName: disable): JQuery = js.native
  def apply(methodName: disable, state: Boolean): JQuery = js.native
  def apply(methodName: enable): JQuery = js.native
  def apply(methodName: focus): JQuery = js.native
  def apply(methodName: focus, event: Event_): JQuery = js.native
  def apply(methodName: hide): JQuery = js.native
  def apply(methodName: hide, event: Event_): JQuery = js.native
  def apply(methodName: option, properties: QTipOptions): Api = js.native
  def apply(methodName: option, propertyName: content): Content = js.native
  def apply(methodName: option, propertyName: contentDotattr): String = js.native
  def apply(methodName: option, propertyName: contentDotattr, value: String): Api = js.native
  def apply(methodName: option, propertyName: contentDotbutton): String | JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: contentDotbutton, value: String): Api = js.native
  def apply(methodName: option, propertyName: contentDotbutton, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: contentDotbutton, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: contentDottext): Text = js.native
  def apply(methodName: option, propertyName: contentDottext, value: Text): Api = js.native
  def apply(methodName: option, propertyName: contentDottitle): Title = js.native
  def apply(methodName: option, propertyName: contentDottitle, value: AnonText): Api = js.native
  def apply(methodName: option, propertyName: contentDottitle, value: Title): Api = js.native
  def apply(methodName: option, propertyName: content, value: Content): Api = js.native
  def apply(methodName: option, propertyName: content, value: Text): Api = js.native
  def apply(methodName: option, propertyName: events): Events = js.native
  def apply(methodName: option, propertyName: eventsDotblur): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotblur, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDotfocus): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotfocus, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDothidden): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDothidden, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDothide): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDothide, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDotmove): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotmove, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDotrender): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotrender, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDotshow): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotshow, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDottoggle): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDottoggle, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: eventsDotvisible): EventApiFunc = js.native
  def apply(methodName: option, propertyName: eventsDotvisible, value: EventApiFunc): Api = js.native
  def apply(methodName: option, propertyName: events, value: Events): Api = js.native
  def apply(methodName: option, propertyName: hide): Hide = js.native
  def apply(methodName: option, propertyName: hideDotdelay): Double = js.native
  def apply(methodName: option, propertyName: hideDotdistance): Double | Boolean = js.native
  def apply(methodName: option, propertyName: hideDotdistance, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDotdistance, value: Double): Api = js.native
  def apply(methodName: option, propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def apply(methodName: option, propertyName: hideDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def apply(methodName: option, propertyName: hideDoteffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDotevent): String | Boolean = js.native
  def apply(methodName: option, propertyName: hideDotevent, value: String): Api = js.native
  def apply(methodName: option, propertyName: hideDotevent, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDotfixed, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDotinactive, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDotinactive, value: Double): Api = js.native
  def apply(methodName: option, propertyName: hideDotleave): String | Boolean = js.native
  def apply(methodName: option, propertyName: hideDotleave, value: String): Api = js.native
  def apply(methodName: option, propertyName: hideDotleave, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDottarget): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: hideDottarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: hideDottarget, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: hide, value: Hide): Api = js.native
  def apply(methodName: option, propertyName: id): String | Boolean = js.native
  def apply(methodName: option, propertyName: id, value: String): Api = js.native
  def apply(methodName: option, propertyName: id, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: metadata): js.Any = js.native
  def apply(methodName: option, propertyName: metadata, value: js.Any): Api = js.native
  def apply(methodName: option, propertyName: overwrite): Boolean = js.native
  def apply(methodName: option, propertyName: overwrite, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: position): Position = js.native
  def apply(methodName: option, propertyName: positionDotadjust): PositionAdjust = js.native
  def apply(methodName: option, propertyName: positionDotadjust, value: PositionAdjust): Api = js.native
  def apply(methodName: option, propertyName: positionDotat): String | Boolean = js.native
  def apply(methodName: option, propertyName: positionDotat, value: String): Api = js.native
  def apply(methodName: option, propertyName: positionDotat, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDotcontainer): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: positionDotcontainer, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDotcontainer, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
  def apply(
    methodName: option,
    propertyName: positionDoteffect,
    value: js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]
  ): Api = js.native
  def apply(methodName: option, propertyName: positionDoteffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDotmy): String | Boolean = js.native
  def apply(methodName: option, propertyName: positionDotmy, value: String): Api = js.native
  def apply(methodName: option, propertyName: positionDotmy, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDottarget): Target | Boolean = js.native
  def apply(methodName: option, propertyName: positionDottarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDottarget, value: Target): Api = js.native
  def apply(methodName: option, propertyName: positionDotviewport): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: positionDotviewport, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: positionDotviewport, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: position, value: Position): Api = js.native
  def apply(methodName: option, propertyName: prerender): Boolean = js.native
  def apply(methodName: option, propertyName: prerender, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: show): Show = js.native
  def apply(methodName: option, propertyName: showDotdelay): Double = js.native
  def apply(methodName: option, propertyName: showDotdelay, value: Double): Api = js.native
  def apply(methodName: option, propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def apply(methodName: option, propertyName: showDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def apply(methodName: option, propertyName: showDoteffect, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDotevent): String | Boolean = js.native
  def apply(methodName: option, propertyName: showDotevent, value: String): Api = js.native
  def apply(methodName: option, propertyName: showDotevent, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDotmodal): Boolean | Modal = js.native
  def apply(methodName: option, propertyName: showDotmodal, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDotmodal, value: Modal): Api = js.native
  def apply(methodName: option, propertyName: showDotready): Boolean = js.native
  def apply(methodName: option, propertyName: showDotready, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDotsolo): JQuery | String | Boolean = js.native
  def apply(methodName: option, propertyName: showDotsolo, value: String): Api = js.native
  def apply(methodName: option, propertyName: showDotsolo, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDotsolo, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: showDottarget): JQuery | Boolean = js.native
  def apply(methodName: option, propertyName: showDottarget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: showDottarget, value: JQuery): Api = js.native
  def apply(methodName: option, propertyName: show, value: Show): Api = js.native
  def apply(methodName: option, propertyName: style): Style = js.native
  def apply(methodName: option, propertyName: styleDotclasses): String | Boolean = js.native
  def apply(methodName: option, propertyName: styleDotclasses, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDotclasses, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDotdef): Boolean = js.native
  def apply(methodName: option, propertyName: styleDotdef, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDotheight): String | Double | Boolean = js.native
  def apply(methodName: option, propertyName: styleDotheight, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDotheight, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDotheight, value: Double): Api = js.native
  def apply(methodName: option, propertyName: styleDottip): String | Boolean | Tip = js.native
  def apply(methodName: option, propertyName: styleDottip, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDottip, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDottip, value: Tip): Api = js.native
  def apply(methodName: option, propertyName: styleDotwidget): Boolean = js.native
  def apply(methodName: option, propertyName: styleDotwidget, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDotwidth): String | Double | Boolean = js.native
  def apply(methodName: option, propertyName: styleDotwidth, value: String): Api = js.native
  def apply(methodName: option, propertyName: styleDotwidth, value: Boolean): Api = js.native
  def apply(methodName: option, propertyName: styleDotwidth, value: Double): Api = js.native
  def apply(methodName: option, propertyName: style, value: Style): Api = js.native
  def apply(methodName: option, propertyName: suppress): Boolean = js.native
  def apply(methodName: option, propertyName: suppress, value: Boolean): Api = js.native
  def apply(methodName: reposition): JQuery = js.native
  def apply(methodName: reposition, event: Event_): JQuery = js.native
  def apply(methodName: reposition, event: Event_, effect: Boolean): JQuery = js.native
  def apply(methodName: show): JQuery = js.native
  def apply(methodName: show, event: Event_): JQuery = js.native
  def apply(methodName: toggle): JQuery = js.native
  def apply(methodName: toggle, state: Boolean): JQuery = js.native
  def apply(methodName: toggle, state: Boolean, event: Event_): JQuery = js.native
  def apply(options: QTipOptions): JQuery = js.native
}

