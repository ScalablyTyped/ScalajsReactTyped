package typingsJapgolly.nReadlines

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nReadlines.nReadlinesBooleans.`false`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n-readlines", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LineByLine {
    def this(file: Double) = this()
    def this(file: PathLike) = this()
    def this(file: Double, options: Options) = this()
    def this(file: PathLike, options: Options) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Buffer | `false` = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  trait LineByLine extends StObject {
    
    def close(): Unit
    
    def next(): Buffer | `false`
    
    def reset(): Unit
  }
  object LineByLine {
    
    inline def apply(close: Callback, next: CallbackTo[Buffer | `false`], reset: Callback): LineByLine = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, next = next.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[LineByLine]
    }
    
    extension [Self <: LineByLine](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setNext(value: CallbackTo[Buffer | `false`]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  trait Options extends StObject {
    
    var newLineCharacter: js.UndefOr[String] = js.undefined
    
    var readChunk: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNewLineCharacter(value: String): Self = StObject.set(x, "newLineCharacter", value.asInstanceOf[js.Any])
      
      inline def setNewLineCharacterUndefined: Self = StObject.set(x, "newLineCharacter", js.undefined)
      
      inline def setReadChunk(value: Double): Self = StObject.set(x, "readChunk", value.asInstanceOf[js.Any])
      
      inline def setReadChunkUndefined: Self = StObject.set(x, "readChunk", js.undefined)
    }
  }
}
