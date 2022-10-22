package typingsJapgolly.webStreamsPolyfill.mod

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformer[I, O] extends StObject {
  
  /**
    * A function called after all chunks written to the writable side have been transformed by successfully passing
    * through {@link Transformer.transform | transform()}, and the writable side is about to be closed.
    */
  var flush: js.UndefOr[TransformerFlushCallback[O]] = js.undefined
  
  var readableType: Unit
  
  /**
    * A function that is called immediately during creation of the {@link TransformStream}.
    */
  var start: js.UndefOr[TransformerStartCallback[O]] = js.undefined
  
  /**
    * A function called when a new chunk originally written to the writable side is ready to be transformed.
    */
  var transform: js.UndefOr[TransformerTransformCallback[I, O]] = js.undefined
  
  var writableType: Unit
}
object Transformer {
  
  inline def apply[I, O](readableType: Unit, writableType: Unit): Transformer[I, O] = {
    val __obj = js.Dynamic.literal(readableType = readableType.asInstanceOf[js.Any], writableType = writableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformer[I, O]]
  }
  
  extension [Self <: Transformer[?, ?], I, O](x: Self & (Transformer[I, O])) {
    
    inline def setFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "flush", js.Any.fromFunction1(value))
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setReadableType(value: Unit): Self = StObject.set(x, "readableType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | PromiseLike[Unit]): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWritableType(value: Unit): Self = StObject.set(x, "writableType", value.asInstanceOf[js.Any])
  }
}
