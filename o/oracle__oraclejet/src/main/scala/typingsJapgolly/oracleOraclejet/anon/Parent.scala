package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent[K] extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var key: js.UndefOr[K] = js.undefined
  
  var parent: js.UndefOr[org.scalajs.dom.Element] = js.undefined
}
object Parent {
  
  inline def apply[K](): Parent[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent[K]]
  }
  
  extension [Self <: Parent[?], K](x: Self & Parent[K]) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setParent(value: org.scalajs.dom.Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
