package typingsJapgolly.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN
  
  /**
    * Name of the application.
    */
  var ApplicationName: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ApplicationName
  
  /**
    * Status of the application.
    */
  var ApplicationStatus: typingsJapgolly.awsSdk.clientsKinesisanalyticsMod.ApplicationStatus
}
object ApplicationSummary {
  
  inline def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN.asInstanceOf[js.Any], ApplicationName = ApplicationName.asInstanceOf[js.Any], ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationStatus(value: ApplicationStatus): Self = StObject.set(x, "ApplicationStatus", value.asInstanceOf[js.Any])
  }
}
