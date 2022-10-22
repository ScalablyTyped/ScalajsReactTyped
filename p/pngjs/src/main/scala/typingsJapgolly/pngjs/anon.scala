package typingsJapgolly.pngjs

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.zlibMod.Deflate_
import typingsJapgolly.node.zlibMod.ZlibOptions
import typingsJapgolly.pngjs.mod.PNG
import typingsJapgolly.pngjs.mod.PNGWithMetadata
import typingsJapgolly.pngjs.mod.PackerOptions
import typingsJapgolly.pngjs.mod.ParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blue extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object Blue {
    
    inline def apply(blue: Double, green: Double, red: Double): Blue = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blue]
    }
    
    extension [Self <: Blue](x: Self) {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Deflate_ = js.native
    def apply(options: ZlibOptions): Deflate_ = js.native
  }
  
  @js.native
  trait Read extends StObject {
    
    def read(buffer: Buffer): PNGWithMetadata = js.native
    def read(buffer: Buffer, options: ParserOptions): PNGWithMetadata = js.native
    
    def write(png: PNG): Buffer = js.native
    def write(png: PNG, options: PackerOptions): Buffer = js.native
  }
}
