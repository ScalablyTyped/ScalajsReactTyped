package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
  */
@JSGlobal("ASPxClientImageGalleryFullscreenViewerEventArgs")
@js.native
class ASPxClientImageGalleryFullscreenViewerEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientImageGalleryFullscreenViewerEventArgs class.
    * @param index A Int32 value that is the processed item index.
    * @param name A String value that specifies the processed item's unique identifier name.
    */
  def this(index: Double, name: String) = this()
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String = js.native
}

