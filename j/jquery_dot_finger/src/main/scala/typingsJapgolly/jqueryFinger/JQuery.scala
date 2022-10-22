package typingsJapgolly.jqueryFinger

import typingsJapgolly.jqueryFinger.jqueryFingerStrings.doubletap
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.drag
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.flick
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.press
import typingsJapgolly.jqueryFinger.jqueryFingerStrings.tap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  @JSName("on")
  def on_doubletap(
    events: doubletap,
    data: Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_doubletap(
    events: doubletap,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_drag(
    events: drag,
    data: Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_drag(
    events: drag,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_flick(
    events: flick,
    data: Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_flick(
    events: flick,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_press(
    events: press,
    data: Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_press(
    events: press,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_tap(
    events: tap,
    data: Any,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
  @JSName("on")
  def on_tap(
    events: tap,
    handler: js.Function2[/* eventObject */ JQueryFingerEventObject, /* repeated */ Any, Any]
  ): JQuery = js.native
}
