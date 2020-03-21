package typingsJapgolly.owlCarousel

import typingsJapgolly.owlCarousel.OwlCarousel.HandlerCallback
import typingsJapgolly.owlCarousel.OwlCarousel.OnEvent
import typingsJapgolly.owlCarousel.OwlCarousel.Options
import typingsJapgolly.owlCarousel.OwlCarousel.TriggerEvent
import typingsJapgolly.owlCarousel.owlCarouselStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def on(event: OnEvent, handler: HandlerCallback): JQuery = js.native
  def owlCarousel(): JQuery = js.native
  def owlCarousel(options: Options): JQuery = js.native
  @JSName("owlCarousel")
  def owlCarousel_destroy(options: destroy): JQuery = js.native
  def trigger(event: TriggerEvent): JQuery = js.native
}

