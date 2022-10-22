package typingsJapgolly.go.mod

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
  * You can specify what to show by either setting the .source URL property
  * to a URL string or the .element property to an HTMLImageElement,
  * HTMLCanvasElement, or HTMLVideoElement.
  */
@JSImport("go", "Picture")
@js.native
/**
  * The constructor creates a picture that shows nothing until the .source or .element is specified.
  */
open class Picture () extends GraphObject {
  
  /**Gets or sets the Picture's HTML element, an Image or Video or Canvas element.*/
  var element: HTMLElement = js.native
  
  /**Gets or sets the function to call if an image fails to load.*/
  def errorFunction(pic: Picture, e: Event): Unit = js.native
  
  /**Gets or sets how the Picture's image is stretched within its bounding box.*/
  var imageStretch: EnumValue = js.native
  
  /**Gets or sets the Picture's source URL, which can be any valid image (png, jpg, gif, etc) URL.*/
  var source: String = js.native
  
  /**Gets or sets a function that returns a value for image.crossOrigin, which is null by default.*/
  def sourceCrossOrigin(pic: Picture): String = js.native
  
  /**Gets or sets the rectangular area of the source image that this picture should display.*/
  var sourceRect: Rect = js.native
}
object Picture {
  
  @JSImport("go", "Picture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  inline def clearCache(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
