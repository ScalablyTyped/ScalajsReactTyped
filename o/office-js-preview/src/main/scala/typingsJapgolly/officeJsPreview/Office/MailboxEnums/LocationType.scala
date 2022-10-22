package typingsJapgolly.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationType extends StObject
/**
  * Specifies an appointment location's type.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.LocationType")
@js.native
object LocationType extends StObject {
  
  /**
    * A custom location.
    */
  @js.native
  sealed trait Custom
    extends StObject
       with LocationType
  
  /**
    * A conference room or similar resource.
    */
  @js.native
  sealed trait Room
    extends StObject
       with LocationType
}
