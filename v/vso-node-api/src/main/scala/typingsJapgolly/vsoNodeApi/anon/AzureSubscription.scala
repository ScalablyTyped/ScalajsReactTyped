package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureSubscription extends StObject {
  
  var azureSubscription: scala.Double
  
  var chef: scala.Double
  
  var custom: scala.Double
  
  var generic: scala.Double
}
object AzureSubscription {
  
  inline def apply(azureSubscription: scala.Double, chef: scala.Double, custom: scala.Double, generic: scala.Double): AzureSubscription = {
    val __obj = js.Dynamic.literal(azureSubscription = azureSubscription.asInstanceOf[js.Any], chef = chef.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], generic = generic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureSubscription]
  }
  
  extension [Self <: AzureSubscription](x: Self) {
    
    inline def setAzureSubscription(value: scala.Double): Self = StObject.set(x, "azureSubscription", value.asInstanceOf[js.Any])
    
    inline def setChef(value: scala.Double): Self = StObject.set(x, "chef", value.asInstanceOf[js.Any])
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setGeneric(value: scala.Double): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
  }
}
