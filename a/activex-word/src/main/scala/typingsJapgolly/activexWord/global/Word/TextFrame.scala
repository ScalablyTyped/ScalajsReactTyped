package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexOffice.Office.MsoHorizontalAnchor
import typingsJapgolly.activexOffice.Office.MsoPathFormat
import typingsJapgolly.activexOffice.Office.MsoTextOrientation
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.MsoVerticalAnchor
import typingsJapgolly.activexOffice.Office.MsoWarpFormat
import typingsJapgolly.activexOffice.Office.TextColumn2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TextFrame")
@js.native
/* private */ open class TextFrame ()
  extends StObject
     with typingsJapgolly.activexWord.Word.TextFrame {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var AutoSize: Double = js.native
  
  /* CompleteClass */
  override def BreakForwardLink(): Unit = js.native
  
  /* CompleteClass */
  override val Column: TextColumn2 = js.native
  
  /* CompleteClass */
  override val ContainingRange: typingsJapgolly.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def DeleteText(): Unit = js.native
  
  /* CompleteClass */
  override val HasText: Double = js.native
  
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
  var Next: typingsJapgolly.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  var NoTextRotation: MsoTriState = js.native
  
  /* CompleteClass */
  var Orientation: MsoTextOrientation = js.native
  
  /* CompleteClass */
  override val Overflowing: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: typingsJapgolly.activexWord.Word.Shape = js.native
  
  /* CompleteClass */
  var PathFormat: MsoPathFormat = js.native
  
  /* CompleteClass */
  var Previous: typingsJapgolly.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  override val TextRange: typingsJapgolly.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val ThreeD: typingsJapgolly.activexWord.Word.ThreeDFormat = js.native
  
  /* CompleteClass */
  override def ValidLinkTarget(TargetTextFrame: typingsJapgolly.activexWord.Word.TextFrame): Boolean = js.native
  
  /* CompleteClass */
  var VerticalAnchor: MsoVerticalAnchor = js.native
  
  /* CompleteClass */
  var WarpFormat: MsoWarpFormat = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.TextFrame_typekey")
  var WordDotTextFrame_typekey: typingsJapgolly.activexWord.Word.TextFrame = js.native
  
  /* CompleteClass */
  var WordWrap: Double = js.native
}
