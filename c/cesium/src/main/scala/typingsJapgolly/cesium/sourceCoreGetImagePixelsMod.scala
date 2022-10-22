package typingsJapgolly.cesium

import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ImageData
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreGetImagePixelsMod {
  
  @JSImport("cesium/Source/Core/getImagePixels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(image: HTMLImageElement, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
  inline def default(image: ImageBitmap, width: Double, height: Double): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[ImageData]
}
