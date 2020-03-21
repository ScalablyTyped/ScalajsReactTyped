package typingsJapgolly.expo

import typingsJapgolly.expo.expoStrings.downloadProgress
import typingsJapgolly.expo.expoStrings.downloadStart
import typingsJapgolly.expo.expoStrings.noUpdateAvailable
import typingsJapgolly.expo.updatesMod.UpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable
}

object Anon0 {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

