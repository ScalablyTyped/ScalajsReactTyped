package typingsJapgolly.ssri.anon

import typingsJapgolly.ssri.mod.HashLike
import typingsJapgolly.ssri.mod.IntegrityLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrity extends StObject {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  
  var integrity: js.UndefOr[String | IntegrityLike | HashLike] = js.undefined
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var pickAlgorithm: js.UndefOr[js.Function2[/* algo1 */ String, /* algo2 */ String, String]] = js.undefined
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Integrity {
  
  inline def apply(): Integrity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrity]
  }
  
  extension [Self <: Integrity](x: Self) {
    
    inline def setAlgorithms(value: js.Array[String]): Self = StObject.set(x, "algorithms", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmsUndefined: Self = StObject.set(x, "algorithms", js.undefined)
    
    inline def setAlgorithmsVarargs(value: String*): Self = StObject.set(x, "algorithms", js.Array(value*))
    
    inline def setIntegrity(value: String | IntegrityLike | HashLike): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPickAlgorithm(value: (/* algo1 */ String, /* algo2 */ String) => String): Self = StObject.set(x, "pickAlgorithm", js.Any.fromFunction2(value))
    
    inline def setPickAlgorithmUndefined: Self = StObject.set(x, "pickAlgorithm", js.undefined)
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
