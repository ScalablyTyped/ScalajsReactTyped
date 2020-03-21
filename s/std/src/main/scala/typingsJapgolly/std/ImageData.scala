package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The underlying pixel data of an area of a <canvas> element. It is created using the ImageData() constructor or creator methods on the CanvasRenderingContext2D object associated with a canvas: createImageData() and getImageData(). It can also be used to set a part of the canvas by using putImageData(). */
trait ImageData
  extends ImageBitmapSource
     with TexImageSource {
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
    */
  val data: scala.scalajs.js.typedarray.Uint8ClampedArray
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  val height: Double
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  val width: Double
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* width */ Double) | (/* array */ Uint8ClampedArray), 
      /* width */ Double, 
      ImageData
    ]
     with Instantiable3[/* array */ Uint8ClampedArray, /* width */ Double, /* height */ Double, ImageData]

