package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
  */
trait LimitRangeItem extends StObject {
  
  /**
    * Default resource requirement limit value by resource name if resource limit is omitted.
    */
  var default: StringDictionary[String]
  
  /**
    * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
    */
  var defaultRequest: StringDictionary[String]
  
  /**
    * Max usage constraints on this kind by resource name.
    */
  var max: StringDictionary[String]
  
  /**
    * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
    */
  var maxLimitRequestRatio: StringDictionary[String]
  
  /**
    * Min usage constraints on this kind by resource name.
    */
  var min: StringDictionary[String]
  
  /**
    * Type of resource that this limit applies to.
    */
  var `type`: String
}
object LimitRangeItem {
  
  inline def apply(
    default: StringDictionary[String],
    defaultRequest: StringDictionary[String],
    max: StringDictionary[String],
    maxLimitRequestRatio: StringDictionary[String],
    min: StringDictionary[String],
    `type`: String
  ): LimitRangeItem = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], defaultRequest = defaultRequest.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLimitRequestRatio = maxLimitRequestRatio.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitRangeItem]
  }
  
  extension [Self <: LimitRangeItem](x: Self) {
    
    inline def setDefault(value: StringDictionary[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultRequest(value: StringDictionary[String]): Self = StObject.set(x, "defaultRequest", value.asInstanceOf[js.Any])
    
    inline def setMax(value: StringDictionary[String]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLimitRequestRatio(value: StringDictionary[String]): Self = StObject.set(x, "maxLimitRequestRatio", value.asInstanceOf[js.Any])
    
    inline def setMin(value: StringDictionary[String]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
