package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RecycleBinItemState extends StObject
@JSGlobal("SP.RecycleBinItemState")
@js.native
object RecycleBinItemState extends StObject {
  
  @js.native
  sealed trait firstStageRecycleBin
    extends StObject
       with RecycleBinItemState
  
  @js.native
  sealed trait none
    extends StObject
       with RecycleBinItemState
  
  @js.native
  sealed trait secondStageRecycleBin
    extends StObject
       with RecycleBinItemState
}
