package typingsJapgolly.webdriverio.WebdriverIOAsync

import typingsJapgolly.webdriverio.ElementAsync
import typingsJapgolly.webdriverio.ElementStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends ElementAsync
     with ElementStatic {
  def dragAndDrop(target: Element): js.Promise[Unit] = js.native
  def dragAndDrop(target: Element, duration: Double): js.Promise[Unit] = js.native
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
}

