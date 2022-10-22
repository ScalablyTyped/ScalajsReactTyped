package typingsJapgolly.bytewise

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bytewise", JSImport.Namespace)
  @js.native
  val ^ : Bytewise = js.native
  
  trait Bytewise
    extends StObject
       with /* k */ StringDictionary[Any] {
    
    def decode(value: Buffer): Any
    
    def encode(value: Any): Buffer
  }
  object Bytewise {
    
    inline def apply(decode: Buffer => Any, encode: Any => Buffer): Bytewise = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Bytewise]
    }
    
    extension [Self <: Bytewise](x: Self) {
      
      inline def setDecode(value: Buffer => Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: Any => Buffer): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Bytewise
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bytewise = ^
}
