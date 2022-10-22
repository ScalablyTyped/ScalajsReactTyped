package typingsJapgolly.cborg

import typingsJapgolly.cborg.typesLibTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLib7floatMod {
  
  @JSImport("cborg/types/lib/7float", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBreak(_data: js.typedarray.Uint8Array, _pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBreak")(_data.asInstanceOf[js.Any], _pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeFloat16(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloat16")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeFloat32(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloat32")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeFloat64(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeFloat64")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeUndefined(_data: js.typedarray.Uint8Array, _pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUndefined")(_data.asInstanceOf[js.Any], _pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  object encodeFloat {
    
    inline def apply(buf: Bl, token: Token, options: EncodeOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/7float", "encodeFloat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compareTokens(tok1: Token, tok2: Token): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTokens")(tok1.asInstanceOf[js.Any], tok2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @param {Token} token
      * @param {EncodeOptions} options
      * @returns {number}
      */
    inline def encodedSize(token: Token, options: typingsJapgolly.cborg.typesInterfaceMod.EncodeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encodedSize")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  type Bl = typingsJapgolly.cborg.typesLibBlMod.Bl
  
  type DecodeOptions = typingsJapgolly.cborg.typesInterfaceMod.DecodeOptions
  
  type EncodeOptions = typingsJapgolly.cborg.typesInterfaceMod.EncodeOptions
}
