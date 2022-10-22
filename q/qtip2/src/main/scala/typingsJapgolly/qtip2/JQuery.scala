package typingsJapgolly.qtip2

import org.scalajs.dom.Event
import typingsJapgolly.qtip2.QTip2.Api
import typingsJapgolly.qtip2.QTip2.Content
import typingsJapgolly.qtip2.QTip2.EventApiFunc
import typingsJapgolly.qtip2.QTip2.Events
import typingsJapgolly.qtip2.QTip2.Hide
import typingsJapgolly.qtip2.QTip2.Modal
import typingsJapgolly.qtip2.QTip2.Plugin
import typingsJapgolly.qtip2.QTip2.Position
import typingsJapgolly.qtip2.QTip2.PositionAdjust
import typingsJapgolly.qtip2.QTip2.QTipOptions
import typingsJapgolly.qtip2.QTip2.Show
import typingsJapgolly.qtip2.QTip2.Style
import typingsJapgolly.qtip2.QTip2.Target
import typingsJapgolly.qtip2.QTip2.Text
import typingsJapgolly.qtip2.QTip2.Tip
import typingsJapgolly.qtip2.QTip2.Title
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def qtip(): JQuery
  def qtip(methodName: String): Any
  def qtip(methodName: String, p1: Any): Any
  def qtip(methodName: String, p1: Any, p2: Any): Any
  def qtip(methodName: String, p1: Any, p2: Any, p3: Any): Any
  def qtip(methodName: String, p1: Any, p2: Unit, p3: Any): Any
  def qtip(methodName: String, p1: Unit, p2: Any): Any
  def qtip(methodName: String, p1: Unit, p2: Any, p3: Any): Any
  def qtip(methodName: String, p1: Unit, p2: Unit, p3: Any): Any
  def qtip(methodName: option, propertyName: content): Content
  def qtip(methodName: option, propertyName: contentDotattr): String
  def qtip(methodName: option, propertyName: contentDotattr, value: String): Api
  def qtip(methodName: option, propertyName: contentDotbutton): String | JQuery | Boolean
  def qtip(methodName: option, propertyName: contentDotbutton, value: String): Api
  def qtip(methodName: option, propertyName: contentDotbutton, value: Boolean): Api
  def qtip(methodName: option, propertyName: contentDotbutton, value: JQuery): Api
  def qtip(methodName: option, propertyName: contentDottext): Text
  def qtip(methodName: option, propertyName: contentDottext, value: Text): Api
  def qtip(methodName: option, propertyName: contentDottitle): Title
  def qtip(methodName: option, propertyName: contentDottitle, value: Title): Api
  def qtip(methodName: option, propertyName: contentDottitle, value: typingsJapgolly.qtip2.anon.Text): Api
  def qtip(methodName: option, propertyName: content, value: Content): Api
  def qtip(methodName: option, propertyName: content, value: Text): Api
  def qtip(methodName: option, propertyName: events): Events
  def qtip(methodName: option, propertyName: eventsDotblur): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotblur, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDotfocus): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotfocus, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDothidden): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDothidden, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDothide): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDothide, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDotmove): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotmove, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDotrender): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotrender, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDotshow): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotshow, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDottoggle): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDottoggle, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: eventsDotvisible): EventApiFunc
  def qtip(methodName: option, propertyName: eventsDotvisible, value: EventApiFunc): Api
  def qtip(methodName: option, propertyName: events, value: Events): Api
  def qtip(methodName: option, propertyName: hide): Hide
  def qtip(methodName: option, propertyName: hideDotdelay): Double
  def qtip(methodName: option, propertyName: hideDotdistance): Double | Boolean
  def qtip(methodName: option, propertyName: hideDotdistance, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDotdistance, value: Double): Api
  def qtip(methodName: option, propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit])
  def qtip(methodName: option, propertyName: hideDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api
  def qtip(methodName: option, propertyName: hideDoteffect, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDotevent): String | Boolean
  def qtip(methodName: option, propertyName: hideDotevent, value: String): Api
  def qtip(methodName: option, propertyName: hideDotevent, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDotfixed, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDotinactive, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDotinactive, value: Double): Api
  def qtip(methodName: option, propertyName: hideDotleave): String | Boolean
  def qtip(methodName: option, propertyName: hideDotleave, value: String): Api
  def qtip(methodName: option, propertyName: hideDotleave, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDottarget): JQuery | Boolean
  def qtip(methodName: option, propertyName: hideDottarget, value: Boolean): Api
  def qtip(methodName: option, propertyName: hideDottarget, value: JQuery): Api
  def qtip(methodName: option, propertyName: hide, value: Hide): Api
  def qtip(methodName: option, propertyName: id): String | Boolean
  def qtip(methodName: option, propertyName: id, value: String): Api
  def qtip(methodName: option, propertyName: id, value: Boolean): Api
  def qtip(methodName: option, propertyName: metadata): Any
  def qtip(methodName: option, propertyName: metadata, value: Any): Api
  def qtip(methodName: option, propertyName: overwrite): Boolean
  def qtip(methodName: option, propertyName: overwrite, value: Boolean): Api
  def qtip(methodName: option, propertyName: position): Position
  def qtip(methodName: option, propertyName: positionDotadjust): PositionAdjust
  def qtip(methodName: option, propertyName: positionDotadjust, value: PositionAdjust): Api
  def qtip(methodName: option, propertyName: positionDotat): String | Boolean
  def qtip(methodName: option, propertyName: positionDotat, value: String): Api
  def qtip(methodName: option, propertyName: positionDotat, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDotcontainer): JQuery | Boolean
  def qtip(methodName: option, propertyName: positionDotcontainer, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDotcontainer, value: JQuery): Api
  def qtip(methodName: option, propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit])
  def qtip(
    methodName: option,
    propertyName: positionDoteffect,
    value: js.Function3[/* api */ Api, /* pos */ Any, /* viewport */ Any, Unit]
  ): Api
  def qtip(methodName: option, propertyName: positionDoteffect, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDotmy): String | Boolean
  def qtip(methodName: option, propertyName: positionDotmy, value: String): Api
  def qtip(methodName: option, propertyName: positionDotmy, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDottarget): Target | Boolean
  def qtip(methodName: option, propertyName: positionDottarget, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDottarget, value: Target): Api
  def qtip(methodName: option, propertyName: positionDotviewport): JQuery | Boolean
  def qtip(methodName: option, propertyName: positionDotviewport, value: Boolean): Api
  def qtip(methodName: option, propertyName: positionDotviewport, value: JQuery): Api
  def qtip(methodName: option, propertyName: position, value: Position): Api
  def qtip(methodName: option, propertyName: prerender): Boolean
  def qtip(methodName: option, propertyName: prerender, value: Boolean): Api
  def qtip(methodName: option, propertyName: show): Show
  def qtip(methodName: option, propertyName: showDotdelay): Double
  def qtip(methodName: option, propertyName: showDotdelay, value: Double): Api
  def qtip(methodName: option, propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ Any, Unit])
  def qtip(methodName: option, propertyName: showDoteffect, value: js.Function1[/* offset */ Any, Unit]): Api
  def qtip(methodName: option, propertyName: showDoteffect, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDotevent): String | Boolean
  def qtip(methodName: option, propertyName: showDotevent, value: String): Api
  def qtip(methodName: option, propertyName: showDotevent, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDotmodal): Boolean | Modal
  def qtip(methodName: option, propertyName: showDotmodal, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDotmodal, value: Modal): Api
  def qtip(methodName: option, propertyName: showDotready): Boolean
  def qtip(methodName: option, propertyName: showDotready, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDotsolo): JQuery | String | Boolean
  def qtip(methodName: option, propertyName: showDotsolo, value: String): Api
  def qtip(methodName: option, propertyName: showDotsolo, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDotsolo, value: JQuery): Api
  def qtip(methodName: option, propertyName: showDottarget): JQuery | Boolean
  def qtip(methodName: option, propertyName: showDottarget, value: Boolean): Api
  def qtip(methodName: option, propertyName: showDottarget, value: JQuery): Api
  def qtip(methodName: option, propertyName: show, value: Show): Api
  def qtip(methodName: option, propertyName: style): Style
  def qtip(methodName: option, propertyName: styleDotclasses): String | Boolean
  def qtip(methodName: option, propertyName: styleDotclasses, value: String): Api
  def qtip(methodName: option, propertyName: styleDotclasses, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDotdef): Boolean
  def qtip(methodName: option, propertyName: styleDotdef, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDotheight): String | Double | Boolean
  def qtip(methodName: option, propertyName: styleDotheight, value: String): Api
  def qtip(methodName: option, propertyName: styleDotheight, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDotheight, value: Double): Api
  def qtip(methodName: option, propertyName: styleDottip): String | Boolean | Tip
  def qtip(methodName: option, propertyName: styleDottip, value: String): Api
  def qtip(methodName: option, propertyName: styleDottip, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDottip, value: Tip): Api
  def qtip(methodName: option, propertyName: styleDotwidget): Boolean
  def qtip(methodName: option, propertyName: styleDotwidget, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDotwidth): String | Double | Boolean
  def qtip(methodName: option, propertyName: styleDotwidth, value: String): Api
  def qtip(methodName: option, propertyName: styleDotwidth, value: Boolean): Api
  def qtip(methodName: option, propertyName: styleDotwidth, value: Double): Api
  def qtip(methodName: option, propertyName: style, value: Style): Api
  def qtip(methodName: option, propertyName: suppress): Boolean
  def qtip(methodName: option, propertyName: suppress, value: Boolean): Api
  def qtip(options: QTipOptions): JQuery
  @JSName("qtip")
  var qtip_Original: Plugin
  @JSName("qtip")
  def qtip_api(methodName: api): Api
  @JSName("qtip")
  def qtip_blur(methodName: blur): JQuery
  @JSName("qtip")
  def qtip_blur(methodName: blur, event: Event): JQuery
  @JSName("qtip")
  def qtip_destroy(methodName: destroy): JQuery
  @JSName("qtip")
  def qtip_destroy(methodName: destroy, immediate: Boolean): JQuery
  @JSName("qtip")
  def qtip_disable(methodName: disable): JQuery
  @JSName("qtip")
  def qtip_disable(methodName: disable, state: Boolean): JQuery
  @JSName("qtip")
  def qtip_enable(methodName: enable): JQuery
  @JSName("qtip")
  def qtip_focus(methodName: focus): JQuery
  @JSName("qtip")
  def qtip_focus(methodName: focus, event: Event): JQuery
  @JSName("qtip")
  def qtip_hide(methodName: hide): JQuery
  @JSName("qtip")
  def qtip_hide(methodName: hide, event: Event): JQuery
  @JSName("qtip")
  def qtip_option(methodName: option, properties: QTipOptions): Api
  @JSName("qtip")
  def qtip_reposition(methodName: reposition): JQuery
  @JSName("qtip")
  def qtip_reposition(methodName: reposition, event: Event): JQuery
  @JSName("qtip")
  def qtip_reposition(methodName: reposition, event: Event, effect: Boolean): JQuery
  @JSName("qtip")
  def qtip_reposition(methodName: reposition, event: Unit, effect: Boolean): JQuery
  @JSName("qtip")
  def qtip_show(methodName: show): JQuery
  @JSName("qtip")
  def qtip_show(methodName: show, event: Event): JQuery
  @JSName("qtip")
  def qtip_toggle(methodName: toggle): JQuery
  @JSName("qtip")
  def qtip_toggle(methodName: toggle, state: Boolean): JQuery
  @JSName("qtip")
  def qtip_toggle(methodName: toggle, state: Boolean, event: Event): JQuery
  @JSName("qtip")
  def qtip_toggle(methodName: toggle, state: Unit, event: Event): JQuery
}
object JQuery {
  
  inline def apply(qtip: Plugin): JQuery = {
    val __obj = js.Dynamic.literal(qtip = qtip.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setQtip(value: Plugin): Self = StObject.set(x, "qtip", value.asInstanceOf[js.Any])
  }
}
