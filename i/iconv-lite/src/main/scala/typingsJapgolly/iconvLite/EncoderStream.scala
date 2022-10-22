package typingsJapgolly.iconvLite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncoderStream extends StObject {
  
  def end(): js.UndefOr[Buffer]
  
  def write(str: String): Buffer
}
object EncoderStream {
  
  inline def apply(end: CallbackTo[js.UndefOr[Buffer]], write: String => Buffer): EncoderStream = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[EncoderStream]
  }
  
  extension [Self <: EncoderStream](x: Self) {
    
    inline def setEnd(value: CallbackTo[js.UndefOr[Buffer]]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setWrite(value: String => Buffer): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
