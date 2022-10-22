package typingsJapgolly.expoImageUtils

import typingsJapgolly.expoImageUtils.anon.Background
import typingsJapgolly.expoImageUtils.anon.CacheType
import typingsJapgolly.expoImageUtils.anon.Name
import typingsJapgolly.expoImageUtils.buildImageDottypesMod.ImageOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildImageMod {
  
  @JSImport("@expo/image-utils/build/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compositeImagesAsync(hasForegroundBackgroundXY: Background): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compositeImagesAsync")(hasForegroundBackgroundXY.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def generateFaviconAsync(pngImageBuffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFaviconAsync")(pngImageBuffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def generateFaviconAsync(pngImageBuffer: Buffer, sizes: js.Array[Double]): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFaviconAsync")(pngImageBuffer.asInstanceOf[js.Any], sizes.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def generateImageAsync(options: CacheType, imageOptions: ImageOptions): js.Promise[Name] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateImageAsync")(options.asInstanceOf[js.Any], imageOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Name]]
}
