package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Design")
@js.native
/* private */ open class Design ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Design {
  
  /* CompleteClass */
  override def AddTitleMaster(): typingsJapgolly.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val HasTitleMaster: MsoTriState = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Design_typekey")
  var PowerPointDotDesign_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  var Preserved: MsoTriState = js.native
  
  /* CompleteClass */
  override val SlideMaster: typingsJapgolly.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override val TitleMaster: typingsJapgolly.activexPowerpoint.PowerPoint.Master = js.native
}
