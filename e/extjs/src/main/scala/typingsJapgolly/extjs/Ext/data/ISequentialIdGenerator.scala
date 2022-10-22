package typingsJapgolly.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISequentialIdGenerator
  extends StObject
     with IIdGenerator {
  
  /** [Config Option] (String) */
  var prefix: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Number) */
  var seed: js.UndefOr[Double] = js.undefined
}
object ISequentialIdGenerator {
  
  inline def apply(): ISequentialIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISequentialIdGenerator]
  }
  
  extension [Self <: ISequentialIdGenerator](x: Self) {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSeed(value: Double): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
