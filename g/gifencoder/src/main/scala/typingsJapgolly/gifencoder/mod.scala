package typingsJapgolly.gifencoder

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gifencoder", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with GIFEncoder {
    def this(width: Double, height: Double) = this()
  }
  
  trait ByteArray extends StObject {
    
    var data: js.Array[Double]
    
    def getData(): Buffer
  }
  object ByteArray {
    
    inline def apply(data: js.Array[Double], getData: CallbackTo[Buffer]): ByteArray = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getData = getData.toJsFn)
      __obj.asInstanceOf[ByteArray]
    }
    
    extension [Self <: ByteArray](x: Self) {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setGetData(value: CallbackTo[Buffer]): Self = StObject.set(x, "getData", value.toJsFn)
    }
  }
  
  @js.native
  trait GIFEncoder extends StObject {
    
    def addFrame(ctx: CanvasRenderingContext2D): Unit = js.native
    
    def createReadStream(): Readable = js.native
    
    def createWriteStream(options: GIFOptions): Transform = js.native
    
    def finish(): Unit = js.native
    
    var out: ByteArray = js.native
    
    def setDelay(/** frame delay in ms */ delay: Double): Unit = js.native
    
    def setQuality(/** image quality. 10 is default */ quality: Double): Unit = js.native
    
    def setRepeat(/** 0 for repeat, -1 for no-repeat */
    repeat: Double): Unit = js.native
    
    def setTransparent(color: String): Unit = js.native
    def setTransparent(color: Double): Unit = js.native
    
    def start(): Unit = js.native
  }
  
  trait GIFOptions extends StObject {
    
    /** frame delay in ms */
    var delay: Double
    
    /** image quality. 10 is default */
    var quality: Double
    
    /** 0 for repeat, -1 for no-repeat */
    var repeat: Double
  }
  object GIFOptions {
    
    inline def apply(delay: Double, quality: Double, repeat: Double): GIFOptions = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any])
      __obj.asInstanceOf[GIFOptions]
    }
    
    extension [Self <: GIFOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    }
  }
}
