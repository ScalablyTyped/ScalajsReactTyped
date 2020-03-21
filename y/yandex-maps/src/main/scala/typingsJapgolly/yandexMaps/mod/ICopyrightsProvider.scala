package typingsJapgolly.yandexMaps.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICopyrightsProvider extends IEventEmitter {
  def getCopyrights(coords: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
  def remove(): Unit = js.native
  def setCopyrights(copyrights: String): Unit = js.native
  def setCopyrights(copyrights: js.Array[String | typingsJapgolly.std.HTMLElement]): Unit = js.native
  def setCopyrights(copyrights: typingsJapgolly.std.HTMLElement): Unit = js.native
}

