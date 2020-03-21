package typingsJapgolly.readdirEnhanced

import typingsJapgolly.readdirEnhanced.typesPublicMod.Callback
import typingsJapgolly.readdirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallDirOptionsCallback extends js.Object {
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  def apply(dir: String, callback: Callback[js.Array[String]]): Unit = js.native
  def apply(dir: String, options: js.UndefOr[scala.Nothing], callback: Callback[js.Array[String]]): Unit = js.native
  def apply(dir: String, options: Optionsstatsfalse): js.Promise[js.Array[String]] = js.native
  def apply(dir: String, options: Optionsstatsfalse, callback: Callback[js.Array[String]]): Unit = js.native
  def apply(dir: String, options: Optionsstatstrue): js.Promise[js.Array[Stats]] = js.native
  def apply(dir: String, options: Optionsstatstrue, callback: Callback[js.Array[Stats]]): Unit = js.native
}

