package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.Blob
import typingsJapgolly.tabris.anon.ResizeHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ImageBitmap")
@js.native
/**
  * Represents an in-memory Image. Unlike ImageData it is immutable, but can be created from a number of
  * sources via [createImageBitmap](#createimagebitmapimagesource-options).
  */
/* private */ open class ImageBitmap ()
  extends StObject
     with _ImageSource {
  
  /**
    * Disposes the resources associated with this ImageBitmap. Should be called once the image is no longer
    * needed to free up memory.
    */
  def close(): Unit = js.native
  
  /**
    * Native image height in pixel
    * @constant
    */
  val height: Double = js.native
  
  /**
    * Native image width in pixel
    * @constant
    */
  val width: Double = js.native
}
/* static members */
object ImageBitmap {
  
  @JSImport("tabris", "ImageBitmap")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a promise that resolves to a new instance of ImageBitmap. Also available in global scope.
    * @param imageSource The data source to create an ImageBitmap instance from.
    * @param options Options for resizing the image.
    */
  inline def createImageBitmap(imageSource: Blob): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: Blob, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  /**
    * Creates a promise that resolves to a new instance of ImageBitmap. Also available in global scope.
    * @param imageSource The data source to create an ImageBitmap instance from.
    * @param sx The x coordinate of the reference point of the rectangle from which the ImageBitmap will be extracted.
    * @param sy The y coordinate of the reference point of the rectangle from which the ImageBitmap will be extracted.
    * @param sw The width of the rectangle from which the ImageBitmap will be extracted.
    * @param sh The height of the rectangle from which the ImageBitmap will be extracted.
    * @param options Options for resizing the image.
    */
  inline def createImageBitmap(imageSource: Blob, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: Blob, sx: Double, sy: Double, sw: Double, sh: Double, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.ImageData): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.ImageData, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.ImageData, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(
    imageSource: typingsJapgolly.tabris.ImageData,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ResizeHeight
  ): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.mod.Canvas): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.mod.Canvas, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: typingsJapgolly.tabris.mod.Canvas, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(
    imageSource: typingsJapgolly.tabris.mod.Canvas,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ResizeHeight
  ): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: ImageBitmap): js.Promise[ImageBitmap] = ^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: ImageBitmap, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: ImageBitmap, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
  inline def createImageBitmap(imageSource: ImageBitmap, sx: Double, sy: Double, sw: Double, sh: Double, options: ResizeHeight): js.Promise[ImageBitmap] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageBitmap")(imageSource.asInstanceOf[js.Any], sx.asInstanceOf[js.Any], sy.asInstanceOf[js.Any], sw.asInstanceOf[js.Any], sh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageBitmap]]
}
