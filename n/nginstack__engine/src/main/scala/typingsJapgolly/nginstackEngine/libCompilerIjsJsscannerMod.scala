package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompilerIjsJsscannerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSScanner", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with JSScanner {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var lineBreaks: Boolean = js.native
    
    /* CompleteClass */
    var lineBreaksInsideString: Boolean = js.native
    
    /* CompleteClass */
    override def nextToken(): String = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def prepare(source: String): Unit = js.native
    
    /* CompleteClass */
    var source: String = js.native
    
    /* CompleteClass */
    var token: String = js.native
    
    /* CompleteClass */
    var tokenWord: JSTokenWord = js.native
  }
  @JSImport("@nginstack/engine/lib/compiler/ijs/JSScanner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSScanner extends StObject {
    
    def clear(): Unit
    
    var lineBreaks: Boolean
    
    var lineBreaksInsideString: Boolean
    
    def nextToken(): String
    
    var position: Double
    
    def prepare(source: String): Unit
    
    var source: String
    
    var token: String
    
    var tokenWord: JSTokenWord
  }
  object JSScanner {
    
    inline def apply(
      clear: Callback,
      lineBreaks: Boolean,
      lineBreaksInsideString: Boolean,
      nextToken: CallbackTo[String],
      position: Double,
      prepare: String => Callback,
      source: String,
      token: String,
      tokenWord: JSTokenWord
    ): JSScanner = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, lineBreaks = lineBreaks.asInstanceOf[js.Any], lineBreaksInsideString = lineBreaksInsideString.asInstanceOf[js.Any], nextToken = nextToken.toJsFn, position = position.asInstanceOf[js.Any], prepare = js.Any.fromFunction1((t0: String) => prepare(t0).runNow()), source = source.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenWord = tokenWord.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSScanner]
    }
    
    extension [Self <: JSScanner](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setLineBreaks(value: Boolean): Self = StObject.set(x, "lineBreaks", value.asInstanceOf[js.Any])
      
      inline def setLineBreaksInsideString(value: Boolean): Self = StObject.set(x, "lineBreaksInsideString", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: CallbackTo[String]): Self = StObject.set(x, "nextToken", value.toJsFn)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrepare(value: String => Callback): Self = StObject.set(x, "prepare", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenWord(value: JSTokenWord): Self = StObject.set(x, "tokenWord", value.asInstanceOf[js.Any])
    }
  }
  
  type JSTokenWord = typingsJapgolly.nginstackEngine.libCompilerIjsJstokenwordMod.^
}
