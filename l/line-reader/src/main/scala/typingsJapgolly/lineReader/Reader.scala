package typingsJapgolly.lineReader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reader extends StObject {
  
  def close(cb: js.Function1[/* err */ js.Error, Unit]): Unit
  
  def getReadStream(): ReadableStream
  
  def hasNextLine(): Boolean
  
  def isClosed(): Boolean
  
  def isOpen(): Boolean
  
  def nextLine(cb: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit]): Unit
}
object Reader {
  
  inline def apply(
    close: js.Function1[/* err */ js.Error, Unit] => Callback,
    getReadStream: CallbackTo[ReadableStream],
    hasNextLine: CallbackTo[Boolean],
    isClosed: CallbackTo[Boolean],
    isOpen: CallbackTo[Boolean],
    nextLine: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit] => Callback
  ): Reader = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, Unit]) => close(t0).runNow()), getReadStream = getReadStream.toJsFn, hasNextLine = hasNextLine.toJsFn, isClosed = isClosed.toJsFn, isOpen = isOpen.toJsFn, nextLine = js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit]) => nextLine(t0).runNow()))
    __obj.asInstanceOf[Reader]
  }
  
  extension [Self <: Reader](x: Self) {
    
    inline def setClose(value: js.Function1[/* err */ js.Error, Unit] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: js.Function1[/* err */ js.Error, Unit]) => value(t0).runNow()))
    
    inline def setGetReadStream(value: CallbackTo[ReadableStream]): Self = StObject.set(x, "getReadStream", value.toJsFn)
    
    inline def setHasNextLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNextLine", value.toJsFn)
    
    inline def setIsClosed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClosed", value.toJsFn)
    
    inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
    
    inline def setNextLine(value: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit] => Callback): Self = StObject.set(x, "nextLine", js.Any.fromFunction1((t0: js.Function2[/* err */ js.Error, /* line */ js.UndefOr[String], Unit]) => value(t0).runNow()))
  }
}
