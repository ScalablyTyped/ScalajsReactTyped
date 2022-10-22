package typingsJapgolly.antvDataSet

import typingsJapgolly.antvDataSet.antvDataSetStrings.group
import typingsJapgolly.antvDataSet.antvDataSetStrings.order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformFillRowsMod {
  
  trait Options extends StObject {
    
    var fillBy: js.UndefOr[group | order] = js.undefined
    
    var groupBy: js.UndefOr[js.Array[String]] = js.undefined
    
    var orderBy: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFillBy(value: group | order): Self = StObject.set(x, "fillBy", value.asInstanceOf[js.Any])
      
      inline def setFillByUndefined: Self = StObject.set(x, "fillBy", js.undefined)
      
      inline def setGroupBy(value: js.Array[String]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      inline def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value*))
      
      inline def setOrderBy(value: js.Array[String]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
      
      inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
      
      inline def setOrderByVarargs(value: String*): Self = StObject.set(x, "orderBy", js.Array(value*))
    }
  }
}
