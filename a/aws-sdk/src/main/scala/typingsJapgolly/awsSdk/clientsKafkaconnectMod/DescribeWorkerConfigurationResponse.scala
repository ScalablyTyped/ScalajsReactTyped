package typingsJapgolly.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkerConfigurationResponse extends StObject {
  
  /**
    * The time that the worker configuration was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the worker configuration.
    */
  var description: js.UndefOr[string] = js.undefined
  
  /**
    * The latest revision of the custom configuration.
    */
  var latestRevision: js.UndefOr[WorkerConfigurationRevisionDescription] = js.undefined
  
  /**
    * The name of the worker configuration.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom configuration.
    */
  var workerConfigurationArn: js.UndefOr[string] = js.undefined
}
object DescribeWorkerConfigurationResponse {
  
  inline def apply(): DescribeWorkerConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkerConfigurationResponse]
  }
  
  extension [Self <: DescribeWorkerConfigurationResponse](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLatestRevision(value: WorkerConfigurationRevisionDescription): Self = StObject.set(x, "latestRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestRevisionUndefined: Self = StObject.set(x, "latestRevision", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setWorkerConfigurationArn(value: string): Self = StObject.set(x, "workerConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationArnUndefined: Self = StObject.set(x, "workerConfigurationArn", js.undefined)
  }
}
