package typingsJapgolly.apolloProtobufjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITokenizerHandle extends StObject {
  
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  def cmnt(): String | Null
  def cmnt(line: Double): String | Null
  /** Gets the comment on the previous line or the line comment on the specified line, if any */
  @JSName("cmnt")
  var cmnt_Original: TokenizerHandleCmnt
  
  /** Current line number */
  var line: Double
  
  /** Gets the next token and advances (`null` on eof) */
  def next(): String | Null
  /** Gets the next token and advances (`null` on eof) */
  @JSName("next")
  var next_Original: TokenizerHandleNext
  
  /** Peeks for the next token (`null` on eof) */
  def peek(): String | Null
  /** Peeks for the next token (`null` on eof) */
  @JSName("peek")
  var peek_Original: TokenizerHandlePeek
  
  /** Pushes a token back to the stack */
  def push(token: String): Unit
  /** Pushes a token back to the stack */
  @JSName("push")
  var push_Original: TokenizerHandlePush
  
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  def skip(expected: String): Boolean
  def skip(expected: String, optional: Boolean): Boolean
  /** Skips a token, returns its presence and advances or, if non-optional and not present, throws */
  @JSName("skip")
  var skip_Original: TokenizerHandleSkip
}
object ITokenizerHandle {
  
  inline def apply(
    cmnt: /* line */ js.UndefOr[Double] => String | Null,
    line: Double,
    next: CallbackTo[String | Null],
    peek: CallbackTo[String | Null],
    push: /* token */ String => Callback,
    skip: (/* expected */ String, /* optional */ js.UndefOr[Boolean]) => Boolean
  ): ITokenizerHandle = {
    val __obj = js.Dynamic.literal(cmnt = js.Any.fromFunction1(cmnt), line = line.asInstanceOf[js.Any], next = next.toJsFn, peek = peek.toJsFn, push = js.Any.fromFunction1((t0: /* token */ String) => push(t0).runNow()), skip = js.Any.fromFunction2(skip))
    __obj.asInstanceOf[ITokenizerHandle]
  }
  
  extension [Self <: ITokenizerHandle](x: Self) {
    
    inline def setCmnt(value: /* line */ js.UndefOr[Double] => String | Null): Self = StObject.set(x, "cmnt", js.Any.fromFunction1(value))
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setNext(value: CallbackTo[String | Null]): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setPeek(value: CallbackTo[String | Null]): Self = StObject.set(x, "peek", value.toJsFn)
    
    inline def setPush(value: /* token */ String => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: /* token */ String) => value(t0).runNow()))
    
    inline def setSkip(value: (/* expected */ String, /* optional */ js.UndefOr[Boolean]) => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction2(value))
  }
}
