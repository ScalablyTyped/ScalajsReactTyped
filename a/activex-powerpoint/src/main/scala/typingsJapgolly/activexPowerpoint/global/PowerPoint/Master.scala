package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoBackgroundStyleIndex
import typingsJapgolly.activexOffice.Office.OfficeTheme
import typingsJapgolly.activexOffice.Office.Script
import typingsJapgolly.activexOffice.Office.Scripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Master")
@js.native
/* private */ open class Master ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.Master {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override def ApplyTheme(themeName: String): Unit = js.native
  
  /* CompleteClass */
  override val Background: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  /* CompleteClass */
  var ColorScheme: typingsJapgolly.activexPowerpoint.PowerPoint.ColorScheme = js.native
  
  /* CompleteClass */
  override val CustomLayouts: typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayouts = js.native
  
  /* CompleteClass */
  override val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  override val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.Master_typekey")
  var PowerPointDotMaster_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.Master = js.native
  
  /* CompleteClass */
  override def Scripts(Index: Any): Script = js.native
  /* CompleteClass */
  @JSName("Scripts")
  override val Scripts_Original: Scripts = js.native
  
  /* CompleteClass */
  override val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes = js.native
  
  /* CompleteClass */
  override val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override val TextStyles: typingsJapgolly.activexPowerpoint.PowerPoint.TextStyles = js.native
  
  /* CompleteClass */
  override val Theme: OfficeTheme = js.native
  
  /* CompleteClass */
  override val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
