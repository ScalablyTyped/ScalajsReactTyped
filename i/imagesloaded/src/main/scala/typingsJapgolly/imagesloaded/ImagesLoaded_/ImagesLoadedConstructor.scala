package typingsJapgolly.imagesloaded.ImagesLoaded_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesLoadedConstructor extends js.Object {
  def apply(elem: ElementSelector): ImagesLoaded = js.native
  def apply(elem: ElementSelector, callback: ImagesLoadedCallback): ImagesLoaded = js.native
  /**
    * Creates a new ImagesLoaded object with the provided callback
    * @param elem Element, NodeList, Element array, or selector string for images to watch
    * @param options object that can tell imagesloaded to watch background images as well
    * @param callback function triggered after all images have been loaded
    */
  def apply(elem: ElementSelector, options: ImagesLoadedOptions): ImagesLoaded = js.native
  def apply(elem: ElementSelector, options: ImagesLoadedOptions, callback: ImagesLoadedCallback): ImagesLoaded = js.native
}

