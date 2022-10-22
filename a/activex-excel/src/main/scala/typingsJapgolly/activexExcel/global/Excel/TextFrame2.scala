package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexOffice.Office.MsoAutoSize
import typingsJapgolly.activexOffice.Office.MsoHorizontalAnchor
import typingsJapgolly.activexOffice.Office.MsoPathFormat
import typingsJapgolly.activexOffice.Office.MsoPresetTextEffect
import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoVerticalAnchor
import typingsJapgolly.activexOffice.Office.MsoWarpFormat
import typingsJapgolly.activexOffice.Office.Ruler2
import typingsJapgolly.activexOffice.Office.TextColumn2
import typingsJapgolly.activexOffice.Office.TextRange2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.TextFrame2")
@js.native
/* private */ open class TextFrame2 ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.TextFrame2 {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var AutoSize: MsoAutoSize = js.native
  
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.TextFrame2_typekey")
  var ExcelDotTextFrame2_typekey: typingsJapgolly.activexExcel.Excel.TextFrame2 = js.native
  
  /* CompleteClass */
  override val HasText: MsoTriState = js.native
  
  /* CompleteClass */
  var HorizontalAnchor: MsoHorizontalAnchor = js.native
  
  /* CompleteClass */
  var MarginBottom: Double = js.native
  
  /* CompleteClass */
  var MarginLeft: Double = js.native
  
  /* CompleteClass */
  var MarginRight: Double = js.native
  
  /* CompleteClass */
  var MarginTop: Double = js.native
  
  /* CompleteClass */
  var NoTextRotation: MsoTriState = js.native
  
  /* CompleteClass */
  var Orientation: MsoTextOrientation = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PathFormat: MsoPathFormat = js.native
  
  /* CompleteClass */
  override val Ruler: Ruler2 = js.native
  
  /* CompleteClass */
  override val TextRange: TextRange2 = js.native
  
  /* CompleteClass */
  override val ThreeD: typingsJapgolly.activexExcel.Excel.ThreeDFormat = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WarpFormat: MsoWarpFormat = js.native
  
  /* CompleteClass */
  var WordArtformat: MsoPresetTextEffect = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
