package typingsJapgolly.libp2pMplex

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.itStreamTypes.mod.Sink
import typingsJapgolly.itStreamTypes.mod.Source
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceConnection.mod.Stream
import typingsJapgolly.libp2pInterfaceConnection.mod.StreamStat
import typingsJapgolly.libp2pInterfaceStreamMuxer.mod.StreamMuxer
import typingsJapgolly.libp2pInterfaceStreamMuxer.mod.StreamMuxerInit
import typingsJapgolly.libp2pMplex.anon.AsyncGeneratorUint8Arrayv
import typingsJapgolly.libp2pMplex.anon.Id
import typingsJapgolly.libp2pMplex.anon.Name
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.Message
import typingsJapgolly.libp2pMplex.mod.MplexInit
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.Record
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMplexMod {
  
  @JSImport("@libp2p/mplex/dist/src/mplex", "MplexStreamMuxer")
  @js.native
  open class MplexStreamMuxer protected ()
    extends StObject
       with StreamMuxer {
    def this(components: Components) = this()
    def this(components: Components, init: MplexStreamMuxerInit) = this()
    
    /**
      * Creates a sink with an abortable source. Incoming messages will
      * also have their size restricted. All messages will be varint decoded.
      */
    def _createSink(): Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /**
      * Creates a source that restricts outgoing message sizes
      * and varint encodes them
      */
    def _createSource(): AsyncGeneratorUint8Arrayv = js.native
    
    def _handleIncoming(message: Message): js.Promise[Unit] = js.native
    
    /* private */ val _init: Any = js.native
    
    /**
      * Called whenever an inbound stream is created
      */
    def _newReceiverStream(options: Id): MplexStream = js.native
    
    def _newStream(options: Name): MplexStream = js.native
    
    /* private */ val _source: Any = js.native
    
    /* private */ var _streamId: Any = js.native
    
    /* private */ val _streams: Any = js.native
    
    /* private */ val closeController: Any = js.native
    
    def init(components: Components): Unit = js.native
    
    /* private */ val rateLimiter: Any = js.native
    
    /* CompleteClass */
    override def sink(source: Source[js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("sink")
    var sink_Original: Sink[js.typedarray.Uint8Array, js.Promise[Unit]] = js.native
    
    /* CompleteClass */
    var source: Source[js.typedarray.Uint8Array] = js.native
    @JSName("source")
    var source_MplexStreamMuxer: AsyncIterable[js.typedarray.Uint8Array] = js.native
    
    /**
      * Returns a Map of streams and their ids
      */
    @JSName("streams")
    def streams_MMplexStreamMuxer: js.Array[Stream] = js.native
  }
  
  trait MplexStream
    extends StObject
       with Stream {
    
    def sourcePush(data: Uint8ArrayList): Unit
    
    def sourceReadableLength(): Double
  }
  object MplexStream {
    
    inline def apply(
      abort: js.Error => Callback,
      close: Callback,
      closeRead: Callback,
      closeWrite: Callback,
      id: String,
      metadata: Record[String, Any],
      reset: Callback,
      sink: /* source */ Source[Uint8ArrayList | js.typedarray.Uint8Array] => js.Promise[Unit],
      source: Source[Uint8ArrayList],
      sourcePush: Uint8ArrayList => Callback,
      sourceReadableLength: CallbackTo[Double],
      stat: StreamStat
    ): MplexStream = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction1((t0: js.Error) => abort(t0).runNow()), close = close.toJsFn, closeRead = closeRead.toJsFn, closeWrite = closeWrite.toJsFn, id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reset = reset.toJsFn, sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any], sourcePush = js.Any.fromFunction1((t0: Uint8ArrayList) => sourcePush(t0).runNow()), sourceReadableLength = sourceReadableLength.toJsFn, stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[MplexStream]
    }
    
    extension [Self <: MplexStream](x: Self) {
      
      inline def setSourcePush(value: Uint8ArrayList => Callback): Self = StObject.set(x, "sourcePush", js.Any.fromFunction1((t0: Uint8ArrayList) => value(t0).runNow()))
      
      inline def setSourceReadableLength(value: CallbackTo[Double]): Self = StObject.set(x, "sourceReadableLength", value.toJsFn)
    }
  }
  
  trait MplexStreamMuxerInit
    extends StObject
       with MplexInit
       with StreamMuxerInit
  object MplexStreamMuxerInit {
    
    inline def apply(): MplexStreamMuxerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MplexStreamMuxerInit]
    }
  }
}
