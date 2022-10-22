package typingsJapgolly.googleCloudPaginator

import typingsJapgolly.googleCloudPaginator.googleCloudPaginatorStrings.data
import typingsJapgolly.googleCloudPaginator.mod.ParsedArguments
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResourceStreamMod {
  
  @JSImport("@google-cloud/paginator/build/src/resource-stream", "ResourceStream")
  @js.native
  open class ResourceStream[T] protected ()
    extends Transform
       with ResourceEvents[T] {
    def this(args: ParsedArguments, requestFn: js.Function) = this()
    
    var _ended: Boolean = js.native
    
    var _maxApiCalls: Double = js.native
    
    var _nextQuery: js.Object | Null = js.native
    
    def _read(): Unit = js.native
    
    var _reading: Boolean = js.native
    
    var _requestFn: js.Function = js.native
    
    var _requestsMade: Double = js.native
    
    var _resultsToSend: Double = js.native
    
    /* CompleteClass */
    @JSName("addListener")
    override def addListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
    
    /* CompleteClass */
    @JSName("emit")
    override def emit_data(event: data, data: T): Boolean = js.native
    
    def end(args: Any*): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<{None (): this, None (cb : (): void): this, None (chunk : any): this, None (chunk : any, cb : (): void): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding): this, None (chunk : any, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (data : string): this, None (data : std.Uint8Array): this, None (data : string, cb : (): void): this, None (data : std.Uint8Array, cb : (): void): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding): this, None (str : string, encoding : node.buffer.<global>.BufferEncoding, cb : (): void): this, None (str : string, encoding : undefined, cb : (): void): this}> extends node.stream.Writable ? this : void */ js.Any = js.native
    
    /* CompleteClass */
    @JSName("on")
    override def on_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
    
    /* CompleteClass */
    @JSName("once")
    override def once_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
    
    /* CompleteClass */
    @JSName("prependListener")
    override def prependListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
    
    /* CompleteClass */
    @JSName("prependOnceListener")
    override def prependOnceListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
    
    /* CompleteClass */
    @JSName("removeListener")
    override def removeListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  }
  
  trait ResourceEvents[T] extends StObject {
    
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
    
    @JSName("emit")
    def emit_data(event: data, data: T): Boolean
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
    
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
    
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
    
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
    
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): this.type
  }
  object ResourceEvents {
    
    inline def apply[T](
      addListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      emit: (data, T) => Boolean,
      on: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      once: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      prependListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      prependOnceListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T],
      removeListener: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]
    ): ResourceEvents[T] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[ResourceEvents[T]]
    }
    
    extension [Self <: ResourceEvents[?], T](x: Self & ResourceEvents[T]) {
      
      inline def setAddListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setEmit(value: (data, T) => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOn(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPrependListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (data, js.Function1[/* data */ T, Unit]) => ResourceEvents[T]): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
}
