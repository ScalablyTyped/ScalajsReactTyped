package typingsJapgolly.ebml.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.ebml.ebmlStrings.close
import typingsJapgolly.ebml.ebmlStrings.data
import typingsJapgolly.ebml.ebmlStrings.end
import typingsJapgolly.ebml.ebmlStrings.error
import typingsJapgolly.ebml.ebmlStrings.readable
import typingsJapgolly.ebml.mod.Decoder.State
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Decoder")
@js.native
open class Decoder () extends Transform {
  def this(opts: TransformOptions) = this()
  
  def addListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  // #region Duplex methods overloadings
  def addListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var buffer: Buffer = js.native
  
  var cursor: Double = js.native
  
  def end(): this.type = js.native
  def end(cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer): this.type = js.native
  def end(chunk: Buffer, cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: String): this.type = js.native
  def end(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): this.type = js.native
  def end(chunk: Buffer, encoding: Unit, cb: js.Function0[Unit]): this.type = js.native
  
  def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def on[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def once(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def once[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def prependOnceListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  def readContent(): Boolean = js.native
  
  def readSize(): Boolean = js.native
  
  def readTag(): Boolean = js.native
  
  def removeListener(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def removeListener[K /* <: /* keyof ebml.ebml.Decoder.EventListenerMap */ data | close | end | readable | error */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.Decoder.EventListenerMap[K] */ js.Any
  ): this.type = js.native
  
  var state: State = js.native
  
  var tagStack: js.Array[TagMetadata] = js.native
  
  var total: Double = js.native
  
  def write(chunk: Buffer): Boolean = js.native
  def write(chunk: Buffer, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: String): Boolean = js.native
  def write(chunk: Buffer, encoding: String, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(chunk: Buffer, encoding: Unit, cb: js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
}
/* static members */
object Decoder {
  
  @JSImport("ebml", "Decoder")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSchemaInfo(tag: Double): EBMLTagSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaInfo")(tag.asInstanceOf[js.Any]).asInstanceOf[EBMLTagSchema]
  
  trait EventListenerMap extends StObject {
    
    def close(): Unit
    
    def data(chunk: StateAndTagData): Unit
    
    def end(): Unit
    
    def error(err: js.Error): Unit
    
    def readable(): Unit
  }
  object EventListenerMap {
    
    inline def apply(
      close: Callback,
      data: StateAndTagData => Callback,
      end: Callback,
      error: js.Error => Callback,
      readable: Callback
    ): EventListenerMap = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = js.Any.fromFunction1((t0: StateAndTagData) => data(t0).runNow()), end = end.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), readable = readable.toJsFn)
      __obj.asInstanceOf[EventListenerMap]
    }
    
    extension [Self <: EventListenerMap](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setData(value: StateAndTagData => Callback): Self = StObject.set(x, "data", js.Any.fromFunction1((t0: StateAndTagData) => value(t0).runNow()))
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setReadable(value: Callback): Self = StObject.set(x, "readable", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ebml.ebmlInts.`1`
    - typingsJapgolly.ebml.ebmlInts.`2`
    - typingsJapgolly.ebml.ebmlInts.`3`
  */
  trait State extends StObject
  object State {
    
    inline def `1`: typingsJapgolly.ebml.ebmlInts.`1` = 1.asInstanceOf[typingsJapgolly.ebml.ebmlInts.`1`]
    
    inline def `2`: typingsJapgolly.ebml.ebmlInts.`2` = 2.asInstanceOf[typingsJapgolly.ebml.ebmlInts.`2`]
    
    inline def `3`: typingsJapgolly.ebml.ebmlInts.`3` = 3.asInstanceOf[typingsJapgolly.ebml.ebmlInts.`3`]
  }
}
