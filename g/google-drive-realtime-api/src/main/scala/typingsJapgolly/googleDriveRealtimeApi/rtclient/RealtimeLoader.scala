package typingsJapgolly.googleDriveRealtimeApi.rtclient

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeLoader extends js.Object {
  def handleErrors(e: Error): Unit
  def load(): Unit
  def start(): Unit
}

@JSGlobal("rtclient.RealtimeLoader")
@js.native
object RealtimeLoader extends TopLevel[RealtimeLoaderFactory]

