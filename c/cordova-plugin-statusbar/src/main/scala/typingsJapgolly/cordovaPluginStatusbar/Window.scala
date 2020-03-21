package typingsJapgolly.cordovaPluginStatusbar

import typingsJapgolly.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var StatusBar: typingsJapgolly.cordovaPluginStatusbar.StatusBar = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event_, _], useCapture: Boolean): Unit = js.native
}

