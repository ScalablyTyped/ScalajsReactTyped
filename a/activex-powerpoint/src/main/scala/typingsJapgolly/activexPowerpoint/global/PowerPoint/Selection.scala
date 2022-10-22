package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexPowerpoint.PowerPoint.PpSelectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Selection")
@js.native
/* private */ open class Selection ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Selection {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val ChildShapeRange: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  override def Copy(): Unit = js.native
  
  /* CompleteClass */
  override def Cut(): Unit = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val HasChildShapeRange: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Selection_typekey")
  var PowerPointDotSelection_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Selection = js.native
  
  /* CompleteClass */
  override val ShapeRange: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  override val SlideRange: typingsJapgolly.activexPowerpoint.PowerPoint.SlideRange = js.native
  
  /* CompleteClass */
  override val TextRange: typingsJapgolly.activexPowerpoint.PowerPoint.TextRange = js.native
  
  /* CompleteClass */
  override val TextRange2: typingsJapgolly.activexOffice.Office.TextRange2 = js.native
  
  /* CompleteClass */
  override val Type: PpSelectionType = js.native
  
  /* CompleteClass */
  override def Unselect(): Unit = js.native
}
