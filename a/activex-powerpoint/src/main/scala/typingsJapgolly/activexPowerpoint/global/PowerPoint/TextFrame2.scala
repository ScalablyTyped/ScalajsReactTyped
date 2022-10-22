package typingsJapgolly.activexPowerpoint.global.PowerPoint

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

@JSGlobal("PowerPoint.TextFrame2")
@js.native
/* private */ open class TextFrame2 ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.TextFrame2 {
  
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
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.TextFrame2_typekey")
  var PowerPointDotTextFrame2_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.TextFrame2 = js.native
  
  /* CompleteClass */
  override val Ruler: Ruler2 = js.native
  
  /* CompleteClass */
  override val TextRange: TextRange2 = js.native
  
  /* CompleteClass */
  override val ThreeD: typingsJapgolly.activexPowerpoint.PowerPoint.ThreeDFormat = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WarpFormat: MsoWarpFormat = js.native
  
  /* CompleteClass */
  var WordArtFormat: MsoPresetTextEffect = js.native
  
  /* CompleteClass */
  var WordWrap: MsoTriState = js.native
}
