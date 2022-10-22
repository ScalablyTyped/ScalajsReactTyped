package typingsJapgolly.nano.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ChangesReader functions */
trait ChangesReaderScope extends StObject {
  
  /** fetch changes and stop when an empty batch is received */
  def get(opts: ChangesReaderOptions): EventEmitter
  
  /** pause consuming the changes feed */
  def pause(): Unit
  
  /** resume consuming the changes feed */
  def resume(): Unit
  
  /** spool the change in one long feed, instead of batches */
  def spool(opts: ChangesReaderOptions): EventEmitter
  
  /** fetch changes forever */
  def start(opts: ChangesReaderOptions): EventEmitter
  
  /** stop consuming the changes feed */
  def stop(): Unit
}
object ChangesReaderScope {
  
  inline def apply(
    get: ChangesReaderOptions => EventEmitter,
    pause: japgolly.scalajs.react.Callback,
    resume: japgolly.scalajs.react.Callback,
    spool: ChangesReaderOptions => EventEmitter,
    start: ChangesReaderOptions => EventEmitter,
    stop: japgolly.scalajs.react.Callback
  ): ChangesReaderScope = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), pause = pause.toJsFn, resume = resume.toJsFn, spool = js.Any.fromFunction1(spool), start = js.Any.fromFunction1(start), stop = stop.toJsFn)
    __obj.asInstanceOf[ChangesReaderScope]
  }
  
  extension [Self <: ChangesReaderScope](x: Self) {
    
    inline def setGet(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setPause(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSpool(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "spool", js.Any.fromFunction1(value))
    
    inline def setStart(value: ChangesReaderOptions => EventEmitter): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
