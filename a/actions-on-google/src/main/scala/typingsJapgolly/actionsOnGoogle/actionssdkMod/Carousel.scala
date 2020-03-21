package typingsJapgolly.actionsOnGoogle.actionssdkMod

import typingsJapgolly.actionsOnGoogle.carouselMod.CarouselOptions
import typingsJapgolly.actionsOnGoogle.incomingMod._IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Carousel")
@js.native
class Carousel protected ()
  extends typingsJapgolly.actionsOnGoogle.conversationMod.Carousel
     with _IncomingMessage {
  /**
    * @param options Carousel option
    * @public
    */
  def this(options: CarouselOptions) = this()
}

