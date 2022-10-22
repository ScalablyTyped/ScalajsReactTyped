package typingsJapgolly.falafel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: String, opts: OptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: FullOptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: Buffer, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(src: Buffer, opts: OptionsObject, fn: WalkerFunction): Result = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @JSImport("falafel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FullOptionsObject
    extends StObject
       with OptionsObject {
    
    var src: String
  }
  object FullOptionsObject {
    
    inline def apply(parser: Any, src: String): FullOptionsObject = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullOptionsObject]
    }
    
    extension [Self <: FullOptionsObject](x: Self) {
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsObject
    extends StObject
       with /* key */ NumberDictionary[Any]
       with /* key */ StringDictionary[Any] {
    
    var parser: Any
  }
  object OptionsObject {
    
    inline def apply(parser: Any): OptionsObject = {
      val __obj = js.Dynamic.literal(parser = parser.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsObject]
    }
    
    extension [Self <: OptionsObject](x: Self) {
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var chunks: js.Array[Any]
    
    def inspect(): String
  }
  object Result {
    
    inline def apply(chunks: js.Array[Any], inspect: CallbackTo[String]): Result = {
      val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], inspect = inspect.toJsFn)
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setChunks(value: js.Array[Any]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksVarargs(value: Any*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
    }
  }
  
  type WalkerFunction = js.Function2[/* nodeOrChild */ Any, /* nodeOrNull */ Any, Unit]
}
