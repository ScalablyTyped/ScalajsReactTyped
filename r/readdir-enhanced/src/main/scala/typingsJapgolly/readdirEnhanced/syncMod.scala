package typingsJapgolly.readdirEnhanced

import typingsJapgolly.readdirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalse): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
}

