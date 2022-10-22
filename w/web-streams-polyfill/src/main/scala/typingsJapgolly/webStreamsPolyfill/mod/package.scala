package typingsJapgolly.webStreamsPolyfill.mod

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, Double]

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | PromiseLike[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | PromiseLike[Unit]]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | PromiseLike[Unit]]

type UnderlyingByteSourcePullCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | PromiseLike[Unit]]

type UnderlyingByteSourceStartCallback = js.Function1[/* controller */ ReadableByteStreamController, Unit | PromiseLike[Unit]]

type UnderlyingSinkAbortCallback = js.Function1[/* reason */ Any, Unit | PromiseLike[Unit]]

type UnderlyingSinkCloseCallback = js.Function0[Unit | PromiseLike[Unit]]

type UnderlyingSinkStartCallback = js.Function1[/* controller */ WritableStreamDefaultController[Any], Unit | PromiseLike[Unit]]

type UnderlyingSinkWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController[Any], 
Unit | PromiseLike[Unit]]

type UnderlyingSourceCancelCallback = js.Function1[/* reason */ Any, Unit | PromiseLike[Unit]]

type UnderlyingSourcePullCallback[R] = js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | PromiseLike[Unit]]

type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ ReadableStreamDefaultController[R], Unit | PromiseLike[Unit]]
