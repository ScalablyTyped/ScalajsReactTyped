package typingsJapgolly.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibDecodeMod {
  
  @JSImport("cborg/types/lib/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/lib/decode", "Tokeniser")
  @js.native
  open class Tokeniser protected ()
    extends StObject
       with typingsJapgolly.cborg.typesInterfaceMod.DecodeTokenizer {
    /**
      * @param {Uint8Array} data
      * @param {DecodeOptions} options
      */
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.Uint8Array, options: DecodeOptions) = this()
    
    var data: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def done(): Boolean = js.native
    
    /* CompleteClass */
    override def next(): typingsJapgolly.cborg.typesLibTokenMod.Token = js.native
    
    var options: typingsJapgolly.cborg.typesInterfaceMod.DecodeOptions = js.native
    
    var pos: Double = js.native
  }
  
  inline def decode(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: js.typedarray.Uint8Array, options: typingsJapgolly.cborg.typesInterfaceMod.DecodeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def tokensToObject(tokeniser: DecodeTokenizer, options: DecodeOptions): Any | js.Symbol = (^.asInstanceOf[js.Dynamic].applyDynamic("tokensToObject")(tokeniser.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any | js.Symbol]
  
  type DecodeOptions = typingsJapgolly.cborg.typesInterfaceMod.DecodeOptions
  
  type DecodeTokenizer = typingsJapgolly.cborg.typesInterfaceMod.DecodeTokenizer
  
  type Token = typingsJapgolly.cborg.typesLibTokenMod.Token
}
