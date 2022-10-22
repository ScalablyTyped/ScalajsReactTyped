package typingsJapgolly.awsSdk.clientsMediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAccessLoggingInput extends StObject {
  
  /**
    * The name of the container that you want to stop access logging on.
    */
  var ContainerName: typingsJapgolly.awsSdk.clientsMediastoreMod.ContainerName
}
object StopAccessLoggingInput {
  
  inline def apply(ContainerName: ContainerName): StopAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAccessLoggingInput]
  }
  
  extension [Self <: StopAccessLoggingInput](x: Self) {
    
    inline def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
