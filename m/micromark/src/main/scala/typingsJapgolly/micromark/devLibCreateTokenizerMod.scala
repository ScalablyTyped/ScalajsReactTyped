package typingsJapgolly.micromark

import japgolly.scalajs.react.Callback
import typingsJapgolly.micromark.anon.OmitPointindexbufferIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibCreateTokenizerMod {
  
  @JSImport("micromark/dev/lib/create-tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTokenizer(parser: ParseContext, initialize: InitialConstruct): TokenizeContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createTokenizer")(parser.asInstanceOf[js.Any], initialize.asInstanceOf[js.Any])).asInstanceOf[TokenizeContext]
  inline def createTokenizer(parser: ParseContext, initialize: InitialConstruct, from: OmitPointindexbufferIndex): TokenizeContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createTokenizer")(parser.asInstanceOf[js.Any], initialize.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[TokenizeContext]
  
  type Chunk = typingsJapgolly.micromarkUtilTypes.mod.Chunk
  
  type Code = typingsJapgolly.micromarkUtilTypes.mod.Code
  
  type Construct = typingsJapgolly.micromarkUtilTypes.mod.Construct
  
  type ConstructRecord = typingsJapgolly.micromarkUtilTypes.mod.ConstructRecord
  
  type Effects = typingsJapgolly.micromarkUtilTypes.mod.Effects
  
  trait Info extends StObject {
    
    var from: Double
    
    def restore(): Unit
  }
  object Info {
    
    inline def apply(from: Double, restore: Callback): Info = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], restore = restore.toJsFn)
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setRestore(value: Callback): Self = StObject.set(x, "restore", value.toJsFn)
    }
  }
  
  type InitialConstruct = typingsJapgolly.micromarkUtilTypes.mod.InitialConstruct
  
  type ParseContext = typingsJapgolly.micromarkUtilTypes.mod.ParseContext
  
  type Point = typingsJapgolly.micromarkUtilTypes.mod.Point
  
  type ReturnHandle = js.Function2[/* construct */ Construct, /* info */ Info, Unit]
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
  
  type Token = typingsJapgolly.micromarkUtilTypes.mod.Token
  
  type TokenizeContext = typingsJapgolly.micromarkUtilTypes.mod.TokenizeContext
}
