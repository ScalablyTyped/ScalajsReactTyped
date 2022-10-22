package typingsJapgolly.iconvLite

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoderStream extends StObject {
  
  def end(): js.UndefOr[String]
  
  def write(buf: Buffer): String
}
object DecoderStream {
  
  inline def apply(end: CallbackTo[js.UndefOr[String]], write: Buffer => String): DecoderStream = {
    val __obj = js.Dynamic.literal(end = end.toJsFn, write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[DecoderStream]
  }
  
  extension [Self <: DecoderStream](x: Self) {
    
    inline def setEnd(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setWrite(value: Buffer => String): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
