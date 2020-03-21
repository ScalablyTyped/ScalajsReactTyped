package typingsJapgolly.agGrid.dragAndDropServiceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VDirection extends js.Object

@JSImport("ag-grid/dist/lib/dragAndDrop/dragAndDropService", "VDirection")
@js.native
object VDirection extends js.Object {
  @js.native
  sealed trait Down extends VDirection
  
  @js.native
  sealed trait Up extends VDirection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VDirection with Double] = js.native
  /* 1 */ @js.native
  object Down extends TopLevel[Down with Double]
  
  /* 0 */ @js.native
  object Up extends TopLevel[Up with Double]
  
}

