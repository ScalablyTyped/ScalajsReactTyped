package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetrieveEnvironmentInfoMessage extends StObject {
  
  /**
    * The ID of the data's environment. If no such environment is found, returns an InvalidParameterValue error. Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error.
    */
  var EnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  
  /**
    * The name of the data's environment.  If no such environment is found, returns an InvalidParameterValue error.   Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The type of information to retrieve.
    */
  var InfoType: EnvironmentInfoType
}
object RetrieveEnvironmentInfoMessage {
  
  inline def apply(InfoType: EnvironmentInfoType): RetrieveEnvironmentInfoMessage = {
    val __obj = js.Dynamic.literal(InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveEnvironmentInfoMessage]
  }
  
  extension [Self <: RetrieveEnvironmentInfoMessage](x: Self) {
    
    inline def setEnvironmentId(value: EnvironmentId): Self = StObject.set(x, "EnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentIdUndefined: Self = StObject.set(x, "EnvironmentId", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setInfoType(value: EnvironmentInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
  }
}
