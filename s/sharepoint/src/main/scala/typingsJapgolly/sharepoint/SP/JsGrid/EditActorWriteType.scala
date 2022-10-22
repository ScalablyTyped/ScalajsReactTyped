package typingsJapgolly.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditActorWriteType extends StObject
@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends StObject {
  
  @js.native
  sealed trait Both
    extends StObject
       with EditActorWriteType
  
  // 2,
  @js.native
  sealed trait DataOnly
    extends StObject
       with EditActorWriteType
  
  // 3,
  @js.native
  sealed trait Either
    extends StObject
       with EditActorWriteType
  
  // 1,
  @js.native
  sealed trait LocalizedOnly
    extends StObject
       with EditActorWriteType
}
