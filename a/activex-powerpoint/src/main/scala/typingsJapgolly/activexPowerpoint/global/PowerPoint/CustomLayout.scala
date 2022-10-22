package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.MsoThemeColorSchemeIndex
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.ThemeColor
import typingsJapgolly.activexOffice.Office.ThemeColorScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.CustomLayout")
@js.native
/* private */ open class CustomLayout ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayout {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Background: typingsJapgolly.activexPowerpoint.PowerPoint.ShapeRange = js.native
  
  /* CompleteClass */
  override def Copy(): Unit = js.native
  
  /* CompleteClass */
  override val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  /* CompleteClass */
  override def Cut(): Unit = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Design: typingsJapgolly.activexPowerpoint.PowerPoint.Design = js.native
  
  /* CompleteClass */
  var DisplayMasterShapes: MsoTriState = js.native
  
  /* CompleteClass */
  override def Duplicate(): typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  /* CompleteClass */
  var FollowMasterBackground: MsoTriState = js.native
  
  /* CompleteClass */
  override val HeadersFooters: typingsJapgolly.activexPowerpoint.PowerPoint.HeadersFooters = js.native
  
  /* CompleteClass */
  override val Height: Double = js.native
  
  /* CompleteClass */
  override val Hyperlinks: typingsJapgolly.activexPowerpoint.PowerPoint.Hyperlinks = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var MatchingName: String = js.native
  
  /* CompleteClass */
  override def MoveTo(toPos: Double): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.CustomLayout_typekey")
  var PowerPointDotCustomLayout_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.CustomLayout = js.native
  
  /* CompleteClass */
  var Preserved: MsoTriState = js.native
  
  /* CompleteClass */
  override def Select(): Unit = js.native
  
  /* CompleteClass */
  override val Shapes: typingsJapgolly.activexPowerpoint.PowerPoint.Shapes = js.native
  
  /* CompleteClass */
  override val SlideShowTransition: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override def ThemeColorScheme(Index: MsoThemeColorSchemeIndex): ThemeColor = js.native
  /* CompleteClass */
  @JSName("ThemeColorScheme")
  override val ThemeColorScheme_Original: ThemeColorScheme = js.native
  
  /* CompleteClass */
  override val TimeLine: typingsJapgolly.activexPowerpoint.PowerPoint.TimeLine = js.native
  
  /* CompleteClass */
  override val Width: Double = js.native
}
