package typingsJapgolly.jqueryFinger

import typingsJapgolly.jqueryFinger.jqueryFingerStrings.doubletap
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.drag
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.flick
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.press
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.tap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("on")
  def on_doubletap(
    events: doubletap,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_doubletap(
    events: doubletap,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_drag(
    events: drag,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_drag(
    events: drag,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_flick(
    events: flick,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_flick(
    events: flick,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_press(
    events: press,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_press(
    events: press,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_tap(
    events: tap,
    data: js.Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
  @JSName("on")
  def on_tap(
    events: tap,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ js.Any, _]
  ): JQuery = js.native
}

