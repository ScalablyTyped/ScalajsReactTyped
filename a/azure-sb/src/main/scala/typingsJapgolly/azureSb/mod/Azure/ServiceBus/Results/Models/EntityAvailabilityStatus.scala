package typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EntityAvailabilityStatus extends StObject
@JSImport("azure-sb", "Azure.ServiceBus.Results.Models.EntityAvailabilityStatus")
@js.native
object EntityAvailabilityStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EntityAvailabilityStatus & String] = js.native
  
  @js.native
  sealed trait Available
    extends StObject
       with EntityAvailabilityStatus
  /* "Available" */ val Available: typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Available & String = js.native
  
  @js.native
  sealed trait Limited
    extends StObject
       with EntityAvailabilityStatus
  /* "Limited" */ val Limited: typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Limited & String = js.native
  
  @js.native
  sealed trait Renaming
    extends StObject
       with EntityAvailabilityStatus
  /* "Renaming" */ val Renaming: typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Renaming & String = js.native
  
  @js.native
  sealed trait Restoring
    extends StObject
       with EntityAvailabilityStatus
  /* "Restoring" */ val Restoring: typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Restoring & String = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EntityAvailabilityStatus
  /* "Unknown" */ val Unknown: typingsJapgolly.azureSb.mod.Azure.ServiceBus.Results.Models.EntityAvailabilityStatus.Unknown & String = js.native
}
