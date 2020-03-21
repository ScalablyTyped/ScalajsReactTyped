package typingsJapgolly.offlineJs

import typingsJapgolly.offlineJs.offlineJsStrings.`confirmed-down`
import typingsJapgolly.offlineJs.offlineJsStrings.`confirmed-up`
import typingsJapgolly.offlineJs.offlineJsStrings.checking
import typingsJapgolly.offlineJs.offlineJsStrings.down
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonconnecting
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonfailure
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonstarted
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColonstopped
import typingsJapgolly.offlineJs.offlineJsStrings.reconnectColontick
import typingsJapgolly.offlineJs.offlineJsStrings.requestsColonflush
import typingsJapgolly.offlineJs.offlineJsStrings.requestsColonhold
import typingsJapgolly.offlineJs.offlineJsStrings.up
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Offline")
@js.native
object Offline extends js.Object {
  var options: OfflineOptions = js.native
  var state: String = js.native
  def check(): Unit = js.native
  def off(event: String): Unit = js.native
  def off(event: String, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_checking(event: checking): Unit = js.native
  @JSName("off")
  def off_checking(event: checking, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_confirmeddown(event: `confirmed-down`): Unit = js.native
  @JSName("off")
  def off_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_confirmedup(event: `confirmed-up`): Unit = js.native
  @JSName("off")
  def off_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_down(event: down): Unit = js.native
  @JSName("off")
  def off_down(event: down, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(event: reconnectColonconnecting): Unit = js.native
  @JSName("off")
  def off_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_reconnectfailure(event: reconnectColonfailure): Unit = js.native
  @JSName("off")
  def off_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_reconnectstarted(event: reconnectColonstarted): Unit = js.native
  @JSName("off")
  def off_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_reconnectstopped(event: reconnectColonstopped): Unit = js.native
  @JSName("off")
  def off_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_reconnecttick(event: reconnectColontick): Unit = js.native
  @JSName("off")
  def off_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_requestsflush(event: requestsColonflush): Unit = js.native
  @JSName("off")
  def off_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_requestshold(event: requestsColonhold): Unit = js.native
  @JSName("off")
  def off_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("off")
  def off_up(event: up): Unit = js.native
  @JSName("off")
  def off_up(event: up, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  def on(event: String, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  def on(event: String, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_checking(event: checking, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_checking(event: checking, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_confirmeddown(event: `confirmed-down`, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_confirmedup(event: `confirmed-up`, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_down(event: down, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_down(event: down, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_reconnectconnecting(event: reconnectColonconnecting, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_reconnectfailure(event: reconnectColonfailure, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_reconnectstarted(event: reconnectColonstarted, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_reconnectstopped(event: reconnectColonstopped, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_reconnecttick(event: reconnectColontick, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_requestsflush(event: requestsColonflush, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_requestshold(event: requestsColonhold, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
  @JSName("on")
  def on_up(event: up, handler: js.Function1[/* e */ Event_, _]): Unit = js.native
  @JSName("on")
  def on_up(event: up, handler: js.Function1[/* e */ Event_, _], context: js.Any): Unit = js.native
}

