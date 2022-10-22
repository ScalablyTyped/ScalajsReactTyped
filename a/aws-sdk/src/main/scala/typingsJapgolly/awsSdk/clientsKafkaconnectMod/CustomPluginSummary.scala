package typingsJapgolly.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPluginSummary extends StObject {
  
  /**
    * The time that the custom plugin was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin.
    */
  var customPluginArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the custom plugin.
    */
  var customPluginState: js.UndefOr[CustomPluginState] = js.undefined
  
  /**
    * A description of the custom plugin.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The latest revision of the custom plugin.
    */
  var latestRevision: js.UndefOr[CustomPluginRevisionSummary] = js.undefined
  
  /**
    * The name of the custom plugin.
    */
  var name: js.UndefOr[string] = js.undefined
}
object CustomPluginSummary {
  
  inline def apply(): CustomPluginSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPluginSummary]
  }
  
  extension [Self <: CustomPluginSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginArnUndefined: Self = StObject.set(x, "customPluginArn", js.undefined)
    
    inline def setCustomPluginState(value: CustomPluginState): Self = StObject.set(x, "customPluginState", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginStateUndefined: Self = StObject.set(x, "customPluginState", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLatestRevision(value: CustomPluginRevisionSummary): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
