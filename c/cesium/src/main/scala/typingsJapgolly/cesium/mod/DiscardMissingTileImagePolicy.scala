package typingsJapgolly.cesium.mod

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cesium.anon.DisableCheckIfAllPixelsAreTransparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "DiscardMissingTileImagePolicy")
@js.native
open class DiscardMissingTileImagePolicy protected () extends StObject {
  def this(options: DisableCheckIfAllPixelsAreTransparent) = this()
  
  /**
    * Determines if the discard policy is ready to process images.
    * @returns True if the discard policy is ready to process images; otherwise, false.
    */
  def isReady(): Boolean = js.native
  
  /**
    * Given a tile image, decide whether to discard that image.
    * @param image - An image to test.
    * @returns True if the image should be discarded; otherwise, false.
    */
  def shouldDiscardImage(image: HTMLImageElement): Boolean = js.native
}
