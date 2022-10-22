package typingsJapgolly.savePixels

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.ndarray.mod.Data
import typingsJapgolly.ndarray.mod.NdArray
import typingsJapgolly.savePixels.anon.Quality
import typingsJapgolly.savePixels.savePixelsStrings.canvas
import typingsJapgolly.savePixels.savePixelsStrings.gif
import typingsJapgolly.savePixels.savePixelsStrings.jpeg
import typingsJapgolly.savePixels.savePixelsStrings.jpg
import typingsJapgolly.savePixels.savePixelsStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Function overloads. Most types return a Stream, except 'canvas'. Quality option only available for
  // JPEG format. See https://www.npmjs.com/package/save-pixels#requiresave-pixelsarray-type-options.
  inline def apply(array: NdArray[Data[Double]], `type`: gif | jpeg | jpg | png): typingsJapgolly.node.streamMod.^ = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.^]
  inline def apply(array: NdArray[Data[Double]], `type`: jpeg | jpg, options: Quality): typingsJapgolly.node.streamMod.^ = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.node.streamMod.^]
  inline def apply(array: NdArray[Data[Double]], `type`: canvas): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
  
  @JSImport("save-pixels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
