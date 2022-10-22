package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyTypes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.LookupValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is Lookup. Currently
  * targeted for use with Lookup.Simple only, and interface will be expanded as more features are made public.
  */
trait LookupProperty
  extends StObject
     with Property {
  
  /**
    * Get Lookup target entity type
    */
  def getTargetEntityType(): String
  
  /**
    * Gets Id of view used by the lookup property
    */
  def getViewId(): String
  
  @JSName("raw")
  var raw_LookupProperty: js.Array[LookupValue]
}
object LookupProperty {
  
  inline def apply(
    error: Boolean,
    errorMessage: String,
    getTargetEntityType: CallbackTo[String],
    getViewId: CallbackTo[String],
    raw: js.Array[LookupValue],
    `type`: String
  ): LookupProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], getTargetEntityType = getTargetEntityType.toJsFn, getViewId = getViewId.toJsFn, raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupProperty]
  }
  
  extension [Self <: LookupProperty](x: Self) {
    
    inline def setGetTargetEntityType(value: CallbackTo[String]): Self = StObject.set(x, "getTargetEntityType", value.toJsFn)
    
    inline def setGetViewId(value: CallbackTo[String]): Self = StObject.set(x, "getViewId", value.toJsFn)
    
    inline def setRaw(value: js.Array[LookupValue]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawVarargs(value: LookupValue*): Self = StObject.set(x, "raw", js.Array(value*))
  }
}
