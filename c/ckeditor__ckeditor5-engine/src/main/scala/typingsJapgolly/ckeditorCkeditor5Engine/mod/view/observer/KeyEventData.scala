package typingsJapgolly.ckeditorCkeditor5Engine.mod.view.observer

import typingsJapgolly.ckeditorCkeditor5Utils.mod.KeystrokeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/view/observer/keyobserver
@JSImport("@ckeditor/ckeditor5-engine", "view.observer.KeyEventData")
@js.native
class KeyEventData ()
  extends DomEventData
     with KeystrokeInfo {
  /* CompleteClass */
  override var keyCode: Double = js.native
  var keystroke: Double = js.native
}

