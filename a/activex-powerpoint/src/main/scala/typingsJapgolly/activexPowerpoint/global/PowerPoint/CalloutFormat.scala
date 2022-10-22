package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoCalloutAngleType
import typingsJapgolly.activexOffice.Office.MsoCalloutDropType
import typingsJapgolly.activexOffice.Office.MsoCalloutType
import typingsJapgolly.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.CalloutFormat")
@js.native
/* private */ open class CalloutFormat ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.CalloutFormat {
  
  /* CompleteClass */
  var Accent: MsoTriState = js.native
  
  /* CompleteClass */
  var Angle: MsoCalloutAngleType = js.native
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var AutoAttach: MsoTriState = js.native
  
  /* CompleteClass */
  override val AutoLength: MsoTriState = js.native
  
  /* CompleteClass */
  override def AutomaticLength(): Unit = js.native
  
  /* CompleteClass */
  var Border: MsoTriState = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def CustomDrop(Drop: Double): Unit = js.native
  
  /* CompleteClass */
  override def CustomLength(Length: Double): Unit = js.native
  
  /* CompleteClass */
  override val Drop: Double = js.native
  
  /* CompleteClass */
  override val DropType: MsoCalloutDropType = js.native
  
  /* CompleteClass */
  var Gap: Double = js.native
  
  /* CompleteClass */
  override val Length: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.CalloutFormat_typekey")
  var PowerPointDotCalloutFormat_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.CalloutFormat = js.native
  
  /* CompleteClass */
  override def PresetDrop(DropType: MsoCalloutDropType): Unit = js.native
  
  /* CompleteClass */
  var Type: MsoCalloutType = js.native
}
