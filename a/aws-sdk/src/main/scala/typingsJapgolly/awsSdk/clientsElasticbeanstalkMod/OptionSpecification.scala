package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionSpecification extends StObject {
  
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.undefined
  
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
  
  /**
    * A unique resource name for a time-based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.ResourceName] = js.undefined
}
object OptionSpecification {
  
  inline def apply(): OptionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSpecification]
  }
  
  extension [Self <: OptionSpecification](x: Self) {
    
    inline def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOptionName(value: ConfigurationOptionName): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}
