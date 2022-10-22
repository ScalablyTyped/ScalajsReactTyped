package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateIdentity extends StObject {
  
  var aggregateIdentity: scala.Double
  
  var importedIdentity: scala.Double
  
  var none: scala.Double
  
  var serviceIdentity: scala.Double
}
object AggregateIdentity {
  
  inline def apply(
    aggregateIdentity: scala.Double,
    importedIdentity: scala.Double,
    none: scala.Double,
    serviceIdentity: scala.Double
  ): AggregateIdentity = {
    val __obj = js.Dynamic.literal(aggregateIdentity = aggregateIdentity.asInstanceOf[js.Any], importedIdentity = importedIdentity.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceIdentity = serviceIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateIdentity]
  }
  
  extension [Self <: AggregateIdentity](x: Self) {
    
    inline def setAggregateIdentity(value: scala.Double): Self = StObject.set(x, "aggregateIdentity", value.asInstanceOf[js.Any])
    
    inline def setImportedIdentity(value: scala.Double): Self = StObject.set(x, "importedIdentity", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentity(value: scala.Double): Self = StObject.set(x, "serviceIdentity", value.asInstanceOf[js.Any])
  }
}
