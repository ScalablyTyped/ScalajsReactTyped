package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorldExportJobSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the world export job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world export job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  var outputLocation: js.UndefOr[OutputLocation] = js.undefined
  
  /**
    * The status of the world export job.  Pending  The world export job request is pending.  Running  The world export job is running.   Completed  The world export job completed.   Failed  The world export job failed. See failureCode for more information.   Canceled  The world export job was cancelled.  Canceling  The world export job is being cancelled.  
    */
  var status: js.UndefOr[WorldExportJobStatus] = js.undefined
  
  /**
    * A list of worlds.
    */
  var worlds: js.UndefOr[Arns] = js.undefined
}
object WorldExportJobSummary {
  
  inline def apply(): WorldExportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldExportJobSummary]
  }
  
  extension [Self <: WorldExportJobSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setOutputLocation(value: OutputLocation): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    
    inline def setStatus(value: WorldExportJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWorlds(value: Arns): Self = StObject.set(x, "worlds", value.asInstanceOf[js.Any])
    
    inline def setWorldsUndefined: Self = StObject.set(x, "worlds", js.undefined)
    
    inline def setWorldsVarargs(value: Arn*): Self = StObject.set(x, "worlds", js.Array(value*))
  }
}
