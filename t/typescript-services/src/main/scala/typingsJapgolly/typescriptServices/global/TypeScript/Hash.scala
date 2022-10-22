package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Hash")
@js.native
open class Hash ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Hash
object Hash {
  
  @JSGlobal("TypeScript.Hash")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Hash.FNV_BASE")
  @js.native
  def FNV_BASE: Any = js.native
  inline def FNV_BASE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FNV_BASE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Hash.FNV_PRIME")
  @js.native
  def FNV_PRIME: Any = js.native
  inline def FNV_PRIME_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FNV_PRIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def combine(value: Double, currentHash: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combine")(value.asInstanceOf[js.Any], currentHash.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def computeFnv1aCharArrayHashCode(text: Any, start: Any, len: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFnv1aCharArrayHashCode")(text.asInstanceOf[js.Any], start.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def computeMurmur2StringHashCode(key: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMurmur2StringHashCode")(key.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def computeSimple31BitCharArrayHashCode(key: js.Array[Double], start: Double, len: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSimple31BitCharArrayHashCode")(key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def computeSimple31BitStringHashCode(key: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSimple31BitStringHashCode")(key.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def expandPrime(oldSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("expandPrime")(oldSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def getPrime(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrime")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @JSGlobal("TypeScript.Hash.primes")
  @js.native
  def primes: Any = js.native
  inline def primes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primes")(x.asInstanceOf[js.Any])
}
