package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntelligentTieringFilter extends StObject {
  
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  var And: js.UndefOr[IntelligentTieringAndOperator] = js.undefined
  
  /**
    * An object key name prefix that identifies the subset of objects to which the rule applies.  Replacement must be made for object keys containing special characters (such as carriage returns) when using XML requests. For more information, see  XML related object key constraints. 
    */
  var Prefix: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Prefix] = js.undefined
  
  var Tag: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Tag] = js.undefined
}
object IntelligentTieringFilter {
  
  inline def apply(): IntelligentTieringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntelligentTieringFilter]
  }
  
  extension [Self <: IntelligentTieringFilter](x: Self) {
    
    inline def setAnd(value: IntelligentTieringAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
