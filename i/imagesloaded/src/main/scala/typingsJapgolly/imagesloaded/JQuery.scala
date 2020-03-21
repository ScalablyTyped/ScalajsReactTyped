package typingsJapgolly.imagesloaded

import typingsJapgolly.imagesloaded.ImagesLoaded_.ImagesLoaded
import typingsJapgolly.imagesloaded.ImagesLoaded_.ImagesLoadedCallback
import typingsJapgolly.imagesloaded.ImagesLoaded_.ImagesLoadedOptions
import typingsJapgolly.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def imagesLoaded(): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(callback: ImagesLoadedCallback): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions): JQueryDeferred[ImagesLoaded] = js.native
  def imagesLoaded(options: ImagesLoadedOptions, callback: ImagesLoadedCallback): JQueryDeferred[ImagesLoaded] = js.native
}

