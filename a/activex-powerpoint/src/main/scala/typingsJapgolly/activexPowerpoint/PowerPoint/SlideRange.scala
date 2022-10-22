package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoBackgroundStyleIndex
import typingsJapgolly.activexOffice.Office.MsoThemeColorSchemeIndex
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.Script
import typingsJapgolly.activexOffice.Office.Scripts
import typingsJapgolly.activexOffice.Office.ThemeColor
import typingsJapgolly.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlideRange extends StObject {
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  def ApplyTemplate(FileName: String): Unit = js.native
  
  def ApplyTheme(themeName: String): Unit = js.native
  
  def ApplyThemeColorScheme(themeColorSchemeName: String): Unit = js.native
  
  val Background: ShapeRange = js.native
  
  var BackgroundStyle: MsoBackgroundStyleIndex = js.native
  
  var ColorScheme: typingsJapgolly.activexPowerpoint.PowerPoint.ColorScheme = js.native
  
  val Comments: typingsJapgolly.activexPowerpoint.PowerPoint.Comments = js.native
  
  def Copy(): Unit = js.native
  
  val Count: Double = js.native
  
  var CustomLayout: typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  def Cut(): Unit = js.native
  
  def Delete(): Unit = js.native
  
  var Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  
  var DisplayMasterShapes: MsoTriState = js.native
  
  def Duplicate(): SlideRange = js.native
  
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(FileName: String, FilterName: String): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Export(FileName: String, FilterName: String, ScaleWidth: Unit, ScaleHeight: Double): Unit = js.native
  
  var FollowMasterBackground: MsoTriState = js.native
  
  val HasNotesPage: MsoTriState = js.native
  
  val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  def Item(Index: Any): Slide = js.native
  
  var Layout: PpSlideLayout = js.native
  
  val Master: typingsJapgolly.activexPowerpoint.PowerPoint.Master = js.native
  
  def MoveTo(toPos: Double): Unit = js.native
  
  def MoveToSectionStart(toSection: Double): Unit = js.native
  
  var Name: String = js.native
  
  val NotesPage: SlideRange = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("PowerPoint.SlideRange_typekey")
  var PowerPointDotSlideRange_typekey: SlideRange = js.native
  
  val PrintSteps: Double = js.native
  
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: String): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean, UseSlideOrder: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Unit, UseSlideOrder: Boolean): Unit = js.native
  
  def Scripts(Index: Any): Script = js.native
  @JSName("Scripts")
  val Scripts_Original: Scripts = js.native
  
  val SectionNumber: Double = js.native
  
  def Select(): Unit = js.native
  
  val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes = js.native
  
  val SlideID: Double = js.native
  
  val SlideIndex: Double = js.native
  
  val SlideNumber: Double = js.native
  
  val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  val Tags: typingsJapgolly.activexPowerpoint.PowerPoint.Tags = js.native
  
  def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  @JSName("ThemeColorScheme")
  val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  val sectionIndex: Double = js.native
}
