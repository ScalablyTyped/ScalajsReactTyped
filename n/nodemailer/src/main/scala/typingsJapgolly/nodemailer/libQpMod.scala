package typingsJapgolly.nodemailer

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libQpMod {
  
  @JSImport("nodemailer/lib/qp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("nodemailer/lib/qp", "Encoder")
  @js.native
  open class Encoder () extends Transform {
    def this(options: EncoderOptions) = this()
    
    var inputBytes: Double = js.native
    
    var options: EncoderOptions = js.native
    
    var outputBytes: Double = js.native
  }
  
  inline def encode(buffer: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wrap(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def wrap(str: String, lineLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(str.asInstanceOf[js.Any], lineLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait EncoderOptions
    extends StObject
       with TransformOptions {
    
    var lineLength: js.UndefOr[Double | `false`] = js.undefined
  }
  object EncoderOptions {
    
    inline def apply(): EncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncoderOptions]
    }
    
    extension [Self <: EncoderOptions](x: Self) {
      
      inline def setLineLength(value: Double | `false`): Self = StObject.set(x, "lineLength", value.asInstanceOf[js.Any])
      
      inline def setLineLengthUndefined: Self = StObject.set(x, "lineLength", js.undefined)
    }
  }
}
