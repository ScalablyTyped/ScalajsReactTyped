package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BloomFilter extends StObject {
  
  def add(value: String): Unit
  
  def addKeys(keys: IIndexable[Any]): Unit
  
  /* private */ var bitArray: Any
  
  /* private */ def computeHash(key: Any, seed: Any): Any
  
  /* private */ var hashFunctionCount: Any
  
  def isEquivalent(filter: BloomFilter): Boolean
  
  def probablyContains(value: String): Boolean
}
object BloomFilter {
  
  inline def apply(
    add: String => Callback,
    addKeys: IIndexable[Any] => Callback,
    bitArray: Any,
    computeHash: (Any, Any) => Any,
    hashFunctionCount: Any,
    isEquivalent: BloomFilter => Boolean,
    probablyContains: String => Boolean
  ): BloomFilter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: String) => add(t0).runNow()), addKeys = js.Any.fromFunction1((t0: IIndexable[Any]) => addKeys(t0).runNow()), bitArray = bitArray.asInstanceOf[js.Any], computeHash = js.Any.fromFunction2(computeHash), hashFunctionCount = hashFunctionCount.asInstanceOf[js.Any], isEquivalent = js.Any.fromFunction1(isEquivalent), probablyContains = js.Any.fromFunction1(probablyContains))
    __obj.asInstanceOf[BloomFilter]
  }
  
  extension [Self <: BloomFilter](x: Self) {
    
    inline def setAdd(value: String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddKeys(value: IIndexable[Any] => Callback): Self = StObject.set(x, "addKeys", js.Any.fromFunction1((t0: IIndexable[Any]) => value(t0).runNow()))
    
    inline def setBitArray(value: Any): Self = StObject.set(x, "bitArray", value.asInstanceOf[js.Any])
    
    inline def setComputeHash(value: (Any, Any) => Any): Self = StObject.set(x, "computeHash", js.Any.fromFunction2(value))
    
    inline def setHashFunctionCount(value: Any): Self = StObject.set(x, "hashFunctionCount", value.asInstanceOf[js.Any])
    
    inline def setIsEquivalent(value: BloomFilter => Boolean): Self = StObject.set(x, "isEquivalent", js.Any.fromFunction1(value))
    
    inline def setProbablyContains(value: String => Boolean): Self = StObject.set(x, "probablyContains", js.Any.fromFunction1(value))
  }
}
