package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.date_nanos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingDateNanosProperty
  extends StObject
     with MappingDocValuesPropertyBase
     with MappingProperty {
  
  var boost: js.UndefOr[double] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var ignore_malformed: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Boolean] = js.undefined
  
  var null_value: js.UndefOr[DateTime] = js.undefined
  
  var precision_step: js.UndefOr[integer] = js.undefined
  
  var `type`: date_nanos
}
object MappingDateNanosProperty {
  
  inline def apply(): MappingDateNanosProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("date_nanos")
    __obj.asInstanceOf[MappingDateNanosProperty]
  }
  
  extension [Self <: MappingDateNanosProperty](x: Self) {
    
    inline def setBoost(value: double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIgnore_malformed(value: Boolean): Self = StObject.set(x, "ignore_malformed", value.asInstanceOf[js.Any])
    
    inline def setIgnore_malformedUndefined: Self = StObject.set(x, "ignore_malformed", js.undefined)
    
    inline def setIndex(value: Boolean): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNull_value(value: DateTime): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setPrecision_step(value: integer): Self = StObject.set(x, "precision_step", value.asInstanceOf[js.Any])
    
    inline def setPrecision_stepUndefined: Self = StObject.set(x, "precision_step", js.undefined)
    
    inline def setType(value: date_nanos): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
