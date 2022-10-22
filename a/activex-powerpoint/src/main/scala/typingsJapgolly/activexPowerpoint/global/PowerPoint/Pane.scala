package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexPowerpoint.PowerPoint.PpViewType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Pane")
@js.native
/* private */ open class Pane ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Pane {
  
  /* CompleteClass */
  override def Activate(): Unit = js.native
  
  /* CompleteClass */
  override val Active: MsoTriState = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Pane_typekey")
  var PowerPointDotPane_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Pane = js.native
  
  /* CompleteClass */
  override val ViewType: PpViewType = js.native
}
