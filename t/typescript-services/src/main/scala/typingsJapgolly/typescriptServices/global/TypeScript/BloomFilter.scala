package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IIndexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.BloomFilter")
@js.native
open class BloomFilter protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.BloomFilter {
  def this(expectedCount: Double) = this()
  
  /* CompleteClass */
  override def add(value: String): Unit = js.native
  
  /* CompleteClass */
  override def addKeys(keys: IIndexable[Any]): Unit = js.native
  
  /* private */ /* CompleteClass */
  var bitArray: Any = js.native
  
  /* private */ /* CompleteClass */
  override def computeHash(key: Any, seed: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  var hashFunctionCount: Any = js.native
  
  /* CompleteClass */
  override def isEquivalent(filter: typingsJapgolly.typescriptServices.TypeScript.BloomFilter): Boolean = js.native
  
  /* CompleteClass */
  override def probablyContains(value: String): Boolean = js.native
}
object BloomFilter {
  
  @JSGlobal("TypeScript.BloomFilter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def computeK(expectedCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeK")(expectedCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def computeM(expectedCount: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeM")(expectedCount.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  @JSGlobal("TypeScript.BloomFilter.falsePositiveProbability")
  @js.native
  def falsePositiveProbability: Double = js.native
  inline def falsePositiveProbability_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("falsePositiveProbability")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isEquivalent(array1: js.Array[Boolean], array2: js.Array[Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEquivalent")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
