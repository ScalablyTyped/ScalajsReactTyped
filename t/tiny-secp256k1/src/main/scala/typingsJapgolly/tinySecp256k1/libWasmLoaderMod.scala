package typingsJapgolly.tinySecp256k1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`-1`
import typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`0`
import typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`1`
import typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`2`
import typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWasmLoaderMod extends Shortcut {
  
  @JSImport("tiny-secp256k1/lib/wasm_loader", JSImport.Default)
  @js.native
  val default: Secp256k1WASM = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`0`
    - typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`1`
    - typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`2`
    - typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`3`
  */
  trait RecoveryIdType extends StObject
  object RecoveryIdType {
    
    inline def `0`: typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`0` = 0.asInstanceOf[typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`0`]
    
    inline def `1`: typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`1` = 1.asInstanceOf[typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`1`]
    
    inline def `2`: typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`2` = 2.asInstanceOf[typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`2`]
    
    inline def `3`: typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`3` = 3.asInstanceOf[typingsJapgolly.tinySecp256k1.tinySecp256k1Ints.`3`]
  }
  
  trait Secp256k1WASM extends StObject {
    
    var EXTRA_DATA_INPUT: WebAssemblyGlobal
    
    var HASH_INPUT: WebAssemblyGlobal
    
    var PRIVATE_INPUT: WebAssemblyGlobal
    
    var PUBLIC_KEY_INPUT: WebAssemblyGlobal
    
    var PUBLIC_KEY_INPUT2: WebAssemblyGlobal
    
    var SIGNATURE_INPUT: WebAssemblyGlobal
    
    var TWEAK_INPUT: WebAssemblyGlobal
    
    var X_ONLY_PUBLIC_KEY_INPUT: WebAssemblyGlobal
    
    var X_ONLY_PUBLIC_KEY_INPUT2: WebAssemblyGlobal
    
    def initializeContext(): Unit
    
    def isPoint(p: Double): Double
    
    var memory: WebAssemblyMemory
    
    def pointAdd(pA: Double, pB: Double, outputlen: Double): Double
    
    def pointAddScalar(p: Double, outputlen: Double): Double
    
    def pointCompress(p: Double, outputlen: Double): Double
    
    def pointFromScalar(outputlen: Double): Double
    
    def pointMultiply(p: Double, outputlen: Double): Double
    
    def privateAdd(): Double
    
    def privateNegate(): Unit
    
    def privateSub(): Double
    
    def recover(outputlen: Double, recoveryId: RecoveryIdType): Double
    
    def sign(e: Double): Unit
    
    def signRecoverable(e: Double): `0` | `1` | `2` | `3`
    
    def signSchnorr(e: Double): Unit
    
    def verify(Q: Double, strict: Double): Double
    
    def verifySchnorr(): Double
    
    def xOnlyPointAddTweak(): `1` | `0` | `-1`
    
    def xOnlyPointAddTweakCheck(parity: Double): Double
    
    def xOnlyPointFromPoint(inputLen: Double): Double
    
    def xOnlyPointFromScalar(): Double
  }
  object Secp256k1WASM {
    
    inline def apply(
      EXTRA_DATA_INPUT: WebAssemblyGlobal,
      HASH_INPUT: WebAssemblyGlobal,
      PRIVATE_INPUT: WebAssemblyGlobal,
      PUBLIC_KEY_INPUT: WebAssemblyGlobal,
      PUBLIC_KEY_INPUT2: WebAssemblyGlobal,
      SIGNATURE_INPUT: WebAssemblyGlobal,
      TWEAK_INPUT: WebAssemblyGlobal,
      X_ONLY_PUBLIC_KEY_INPUT: WebAssemblyGlobal,
      X_ONLY_PUBLIC_KEY_INPUT2: WebAssemblyGlobal,
      initializeContext: Callback,
      isPoint: Double => Double,
      memory: WebAssemblyMemory,
      pointAdd: (Double, Double, Double) => Double,
      pointAddScalar: (Double, Double) => Double,
      pointCompress: (Double, Double) => Double,
      pointFromScalar: Double => Double,
      pointMultiply: (Double, Double) => Double,
      privateAdd: CallbackTo[Double],
      privateNegate: Callback,
      privateSub: CallbackTo[Double],
      recover: (Double, RecoveryIdType) => Double,
      sign: Double => Callback,
      signRecoverable: Double => `0` | `1` | `2` | `3`,
      signSchnorr: Double => Callback,
      verify: (Double, Double) => Double,
      verifySchnorr: CallbackTo[Double],
      xOnlyPointAddTweak: CallbackTo[`1` | `0` | `-1`],
      xOnlyPointAddTweakCheck: Double => Double,
      xOnlyPointFromPoint: Double => Double,
      xOnlyPointFromScalar: CallbackTo[Double]
    ): Secp256k1WASM = {
      val __obj = js.Dynamic.literal(EXTRA_DATA_INPUT = EXTRA_DATA_INPUT.asInstanceOf[js.Any], HASH_INPUT = HASH_INPUT.asInstanceOf[js.Any], PRIVATE_INPUT = PRIVATE_INPUT.asInstanceOf[js.Any], PUBLIC_KEY_INPUT = PUBLIC_KEY_INPUT.asInstanceOf[js.Any], PUBLIC_KEY_INPUT2 = PUBLIC_KEY_INPUT2.asInstanceOf[js.Any], SIGNATURE_INPUT = SIGNATURE_INPUT.asInstanceOf[js.Any], TWEAK_INPUT = TWEAK_INPUT.asInstanceOf[js.Any], X_ONLY_PUBLIC_KEY_INPUT = X_ONLY_PUBLIC_KEY_INPUT.asInstanceOf[js.Any], X_ONLY_PUBLIC_KEY_INPUT2 = X_ONLY_PUBLIC_KEY_INPUT2.asInstanceOf[js.Any], initializeContext = initializeContext.toJsFn, isPoint = js.Any.fromFunction1(isPoint), memory = memory.asInstanceOf[js.Any], pointAdd = js.Any.fromFunction3(pointAdd), pointAddScalar = js.Any.fromFunction2(pointAddScalar), pointCompress = js.Any.fromFunction2(pointCompress), pointFromScalar = js.Any.fromFunction1(pointFromScalar), pointMultiply = js.Any.fromFunction2(pointMultiply), privateAdd = privateAdd.toJsFn, privateNegate = privateNegate.toJsFn, privateSub = privateSub.toJsFn, recover = js.Any.fromFunction2(recover), sign = js.Any.fromFunction1((t0: Double) => sign(t0).runNow()), signRecoverable = js.Any.fromFunction1(signRecoverable), signSchnorr = js.Any.fromFunction1((t0: Double) => signSchnorr(t0).runNow()), verify = js.Any.fromFunction2(verify), verifySchnorr = verifySchnorr.toJsFn, xOnlyPointAddTweak = xOnlyPointAddTweak.toJsFn, xOnlyPointAddTweakCheck = js.Any.fromFunction1(xOnlyPointAddTweakCheck), xOnlyPointFromPoint = js.Any.fromFunction1(xOnlyPointFromPoint), xOnlyPointFromScalar = xOnlyPointFromScalar.toJsFn)
      __obj.asInstanceOf[Secp256k1WASM]
    }
    
    extension [Self <: Secp256k1WASM](x: Self) {
      
      inline def setEXTRA_DATA_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "EXTRA_DATA_INPUT", value.asInstanceOf[js.Any])
      
      inline def setHASH_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "HASH_INPUT", value.asInstanceOf[js.Any])
      
      inline def setInitializeContext(value: Callback): Self = StObject.set(x, "initializeContext", value.toJsFn)
      
      inline def setIsPoint(value: Double => Double): Self = StObject.set(x, "isPoint", js.Any.fromFunction1(value))
      
      inline def setMemory(value: WebAssemblyMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setPRIVATE_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "PRIVATE_INPUT", value.asInstanceOf[js.Any])
      
      inline def setPUBLIC_KEY_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "PUBLIC_KEY_INPUT", value.asInstanceOf[js.Any])
      
      inline def setPUBLIC_KEY_INPUT2(value: WebAssemblyGlobal): Self = StObject.set(x, "PUBLIC_KEY_INPUT2", value.asInstanceOf[js.Any])
      
      inline def setPointAdd(value: (Double, Double, Double) => Double): Self = StObject.set(x, "pointAdd", js.Any.fromFunction3(value))
      
      inline def setPointAddScalar(value: (Double, Double) => Double): Self = StObject.set(x, "pointAddScalar", js.Any.fromFunction2(value))
      
      inline def setPointCompress(value: (Double, Double) => Double): Self = StObject.set(x, "pointCompress", js.Any.fromFunction2(value))
      
      inline def setPointFromScalar(value: Double => Double): Self = StObject.set(x, "pointFromScalar", js.Any.fromFunction1(value))
      
      inline def setPointMultiply(value: (Double, Double) => Double): Self = StObject.set(x, "pointMultiply", js.Any.fromFunction2(value))
      
      inline def setPrivateAdd(value: CallbackTo[Double]): Self = StObject.set(x, "privateAdd", value.toJsFn)
      
      inline def setPrivateNegate(value: Callback): Self = StObject.set(x, "privateNegate", value.toJsFn)
      
      inline def setPrivateSub(value: CallbackTo[Double]): Self = StObject.set(x, "privateSub", value.toJsFn)
      
      inline def setRecover(value: (Double, RecoveryIdType) => Double): Self = StObject.set(x, "recover", js.Any.fromFunction2(value))
      
      inline def setSIGNATURE_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "SIGNATURE_INPUT", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Double => Callback): Self = StObject.set(x, "sign", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSignRecoverable(value: Double => `0` | `1` | `2` | `3`): Self = StObject.set(x, "signRecoverable", js.Any.fromFunction1(value))
      
      inline def setSignSchnorr(value: Double => Callback): Self = StObject.set(x, "signSchnorr", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTWEAK_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "TWEAK_INPUT", value.asInstanceOf[js.Any])
      
      inline def setVerify(value: (Double, Double) => Double): Self = StObject.set(x, "verify", js.Any.fromFunction2(value))
      
      inline def setVerifySchnorr(value: CallbackTo[Double]): Self = StObject.set(x, "verifySchnorr", value.toJsFn)
      
      inline def setXOnlyPointAddTweak(value: CallbackTo[`1` | `0` | `-1`]): Self = StObject.set(x, "xOnlyPointAddTweak", value.toJsFn)
      
      inline def setXOnlyPointAddTweakCheck(value: Double => Double): Self = StObject.set(x, "xOnlyPointAddTweakCheck", js.Any.fromFunction1(value))
      
      inline def setXOnlyPointFromPoint(value: Double => Double): Self = StObject.set(x, "xOnlyPointFromPoint", js.Any.fromFunction1(value))
      
      inline def setXOnlyPointFromScalar(value: CallbackTo[Double]): Self = StObject.set(x, "xOnlyPointFromScalar", value.toJsFn)
      
      inline def setX_ONLY_PUBLIC_KEY_INPUT(value: WebAssemblyGlobal): Self = StObject.set(x, "X_ONLY_PUBLIC_KEY_INPUT", value.asInstanceOf[js.Any])
      
      inline def setX_ONLY_PUBLIC_KEY_INPUT2(value: WebAssemblyGlobal): Self = StObject.set(x, "X_ONLY_PUBLIC_KEY_INPUT2", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAssemblyGlobal extends StObject {
    
    var value: Double
  }
  object WebAssemblyGlobal {
    
    inline def apply(value: Double): WebAssemblyGlobal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyGlobal]
    }
    
    extension [Self <: WebAssemblyGlobal](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebAssemblyMemory extends StObject {
    
    var buffer: js.typedarray.Uint8Array
  }
  object WebAssemblyMemory {
    
    inline def apply(buffer: js.typedarray.Uint8Array): WebAssemblyMemory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyMemory]
    }
    
    extension [Self <: WebAssemblyMemory](x: Self) {
      
      inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Secp256k1WASM
  
  /* This means you don't have to write `default`, but can instead just say `libWasmLoaderMod.foo` */
  override def _to: Secp256k1WASM = default
}
