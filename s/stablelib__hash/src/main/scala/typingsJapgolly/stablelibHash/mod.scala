package typingsJapgolly.stablelibHash

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSerializableHash(h: Hash): /* is @stablelib/hash.@stablelib/hash.SerializableHash */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerializableHash")(h.asInstanceOf[js.Any]).asInstanceOf[/* is @stablelib/hash.@stablelib/hash.SerializableHash */ Boolean]
  
  trait Hash extends StObject {
    
    val blockSize: Double
    
    def clean(): Unit
    
    def digest(): js.typedarray.Uint8Array
    
    val digestLength: Double
    
    def finish(out: js.typedarray.Uint8Array): this.type
    
    def reset(): this.type
    
    def update(data: js.typedarray.Uint8Array): this.type
  }
  object Hash {
    
    inline def apply(
      blockSize: Double,
      clean: Callback,
      digest: CallbackTo[js.typedarray.Uint8Array],
      digestLength: Double,
      finish: js.typedarray.Uint8Array => Hash,
      reset: CallbackTo[Hash],
      update: js.typedarray.Uint8Array => Hash
    ): Hash = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], clean = clean.toJsFn, digest = digest.toJsFn, digestLength = digestLength.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), reset = reset.toJsFn, update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setClean(value: Callback): Self = StObject.set(x, "clean", value.toJsFn)
      
      inline def setDigest(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "digest", value.toJsFn)
      
      inline def setDigestLength(value: Double): Self = StObject.set(x, "digestLength", value.asInstanceOf[js.Any])
      
      inline def setFinish(value: js.typedarray.Uint8Array => Hash): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setReset(value: CallbackTo[Hash]): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setUpdate(value: js.typedarray.Uint8Array => Hash): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait SerializableHash
    extends StObject
       with Hash {
    
    def cleanSavedState(savedState: Any): Unit
    
    def restoreState(savedState: Any): this.type
    
    def saveState(): Any
  }
  object SerializableHash {
    
    inline def apply(
      blockSize: Double,
      clean: Callback,
      cleanSavedState: Any => Callback,
      digest: CallbackTo[js.typedarray.Uint8Array],
      digestLength: Double,
      finish: js.typedarray.Uint8Array => SerializableHash,
      reset: CallbackTo[SerializableHash],
      restoreState: Any => SerializableHash,
      saveState: CallbackTo[Any],
      update: js.typedarray.Uint8Array => SerializableHash
    ): SerializableHash = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], clean = clean.toJsFn, cleanSavedState = js.Any.fromFunction1((t0: Any) => cleanSavedState(t0).runNow()), digest = digest.toJsFn, digestLength = digestLength.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), reset = reset.toJsFn, restoreState = js.Any.fromFunction1(restoreState), saveState = saveState.toJsFn, update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[SerializableHash]
    }
    
    extension [Self <: SerializableHash](x: Self) {
      
      inline def setCleanSavedState(value: Any => Callback): Self = StObject.set(x, "cleanSavedState", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRestoreState(value: Any => SerializableHash): Self = StObject.set(x, "restoreState", js.Any.fromFunction1(value))
      
      inline def setSaveState(value: CallbackTo[Any]): Self = StObject.set(x, "saveState", value.toJsFn)
    }
  }
}
