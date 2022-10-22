package typingsJapgolly.owlCarousel

import typingsJapgolly.owlCarousel.OwlCarousel.HandlerCallback
import typingsJapgolly.owlCarousel.OwlCarousel.OnEvent
import typingsJapgolly.owlCarousel.OwlCarousel.Options
import typingsJapgolly.owlCarousel.OwlCarousel.TriggerEvent
import typingsJapgolly.owlCarousel.owlCarouselStrings.destroy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def on(event: OnEvent, handler: HandlerCallback): JQuery = js.native
  
  def owlCarousel(): JQuery = js.native
  def owlCarousel(options: Options): JQuery = js.native
  @JSName("owlCarousel")
  def owlCarousel_destroy(options: destroy): JQuery = js.native
  
  def trigger(event: TriggerEvent): JQuery = js.native
}
