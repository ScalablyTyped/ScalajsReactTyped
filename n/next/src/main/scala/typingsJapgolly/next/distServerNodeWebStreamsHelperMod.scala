package typingsJapgolly.next

import org.scalajs.dom.ReadableStream
import typingsJapgolly.next.anon.DataStream
import typingsJapgolly.next.anon.Element
import typingsJapgolly.std.TextDecoder
import typingsJapgolly.std.TransformStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerNodeWebStreamsHelperMod {
  
  @JSImport("next/dist/server/node-web-streams-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chainStreams[T](streams: js.Array[ReadableStream[T]]): ReadableStream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainStreams")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[T]]
  
  inline def continueFromInitialStream(
    renderStream: ReactReadableStream,
    hasSuffixDataStreamGenerateStaticHTMLFlushEffectHandlerFlushEffectsToHead: DataStream
  ): js.Promise[ReadableStream[js.typedarray.Uint8Array]] = (^.asInstanceOf[js.Dynamic].applyDynamic("continueFromInitialStream")(renderStream.asInstanceOf[js.Any], hasSuffixDataStreamGenerateStaticHTMLFlushEffectHandlerFlushEffectsToHead.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStream[js.typedarray.Uint8Array]]]
  
  inline def createBufferedTransformStream(): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBufferedTransformStream")().asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  inline def createBufferedTransformStream(transform: js.Function1[/* v */ String, String | js.Promise[String]]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBufferedTransformStream")(transform.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createDeferredSuffixStream(suffix: String): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeferredSuffixStream")(suffix.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createFlushEffectStream(handleFlushEffect: js.Function0[String]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlushEffectStream")(handleFlushEffect.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createHeadInjectionTransformStream(inject: js.Function0[String]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createHeadInjectionTransformStream")(inject.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createInlineDataStream(dataStream: ReadableStream[js.typedarray.Uint8Array]): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineDataStream")(dataStream.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def createSuffixStream(suffix: String): TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSuffixStream")(suffix.asInstanceOf[js.Any]).asInstanceOf[TransformStream[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
  
  inline def decodeText(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")().asInstanceOf[String]
  inline def decodeText(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decodeText(input: js.typedarray.Uint8Array, textDecoder: TextDecoder): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def decodeText(input: Unit, textDecoder: TextDecoder): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeText")(input.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeText(input: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeText")(input.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readableStreamTee[T](readable: ReadableStream[T]): js.Tuple2[ReadableStream[T], ReadableStream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readableStreamTee")(readable.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ReadableStream[T], ReadableStream[T]]]
  
  inline def renderToInitialStream(hasReactDOMServerElementStreamOptions: Element): js.Promise[ReactReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToInitialStream")(hasReactDOMServerElementStreamOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReactReadableStream]]
  
  inline def streamFromArray(strings: js.Array[String]): ReadableStream[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamFromArray")(strings.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[js.typedarray.Uint8Array]]
  
  inline def streamToString(stream: ReadableStream[js.typedarray.Uint8Array]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("streamToString")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @js.native
  trait ReactReadableStream
    extends StObject
       with typingsJapgolly.std.ReadableStream[js.typedarray.Uint8Array] {
    
    var allReady: js.UndefOr[js.Promise[Unit]] = js.native
  }
}
