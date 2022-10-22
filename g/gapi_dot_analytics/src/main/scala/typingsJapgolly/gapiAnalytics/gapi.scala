package typingsJapgolly.gapiAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object analytics {
      
      object kB {
        
        object parameters {
          
          trait AnalyticsParameter extends StObject {
            
            var default: js.UndefOr[String] = js.undefined
            
            var description: js.UndefOr[String] = js.undefined
            
            var `enum`: js.UndefOr[js.Array[String]] = js.undefined
            
            var enumDescriptions: js.UndefOr[js.Array[String]] = js.undefined
            
            var location: js.UndefOr[String] = js.undefined
            
            var `type`: js.UndefOr[String] = js.undefined
          }
          object AnalyticsParameter {
            
            inline def apply(): AnalyticsParameter = {
              val __obj = js.Dynamic.literal()
              __obj.asInstanceOf[AnalyticsParameter]
            }
            
            extension [Self <: AnalyticsParameter](x: Self) {
              
              inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
              
              inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
              
              inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
              
              inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
              
              inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
              
              inline def setEnumDescriptions(value: js.Array[String]): Self = StObject.set(x, "enumDescriptions", value.asInstanceOf[js.Any])
              
              inline def setEnumDescriptionsUndefined: Self = StObject.set(x, "enumDescriptions", js.undefined)
              
              inline def setEnumDescriptionsVarargs(value: String*): Self = StObject.set(x, "enumDescriptions", js.Array(value*))
              
              inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
              
              inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
              
              inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
              
              inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
              
              inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
              
              inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
            }
          }
          
          type alt = AnalyticsParameter
          
          type fields = AnalyticsParameter
          
          type key = AnalyticsParameter
          
          type oauthToken = AnalyticsParameter
          
          type prettyPrint = AnalyticsParameter
          
          type quotaUser = AnalyticsParameter
          
          type userIP = AnalyticsParameter
        }
      }
    }
  }
}
