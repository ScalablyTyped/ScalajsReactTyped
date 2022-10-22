package typingsJapgolly.imageSize

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReadUIntMod {
  
  @JSImport("image-size/dist/readUInt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readUInt(buffer: Buffer, bits: Bits, offset: Double, isBigEndian: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt")(buffer.asInstanceOf[js.Any], bits.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], isBigEndian.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.imageSize.imageSizeInts.`16`
    - typingsJapgolly.imageSize.imageSizeInts.`32`
  */
  trait Bits extends StObject
  object Bits {
    
    inline def `16`: typingsJapgolly.imageSize.imageSizeInts.`16` = 16.asInstanceOf[typingsJapgolly.imageSize.imageSizeInts.`16`]
    
    inline def `32`: typingsJapgolly.imageSize.imageSizeInts.`32` = 32.asInstanceOf[typingsJapgolly.imageSize.imageSizeInts.`32`]
  }
}
