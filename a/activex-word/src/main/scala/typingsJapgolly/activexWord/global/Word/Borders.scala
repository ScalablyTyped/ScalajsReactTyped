package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdBorderDistanceFrom
import typingsJapgolly.activexWord.Word.WdBorderType
import typingsJapgolly.activexWord.Word.WdColor
import typingsJapgolly.activexWord.Word.WdColorIndex
import typingsJapgolly.activexWord.Word.WdLineStyle
import typingsJapgolly.activexWord.Word.WdLineWidth
import typingsJapgolly.activexWord.activexWordInts.`9999999`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Borders")
@js.native
/* private */ open class Borders ()
  extends StObject
     with typingsJapgolly.activexWord.Word.Borders {
  
  /* CompleteClass */
  var AlwaysInFront: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def ApplyPageBordersToAllSections(): Unit = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var DistanceFrom: WdBorderDistanceFrom = js.native
  
  /* CompleteClass */
  var DistanceFromBottom: Double = js.native
  
  /* CompleteClass */
  var DistanceFromLeft: Double = js.native
  
  /* CompleteClass */
  var DistanceFromRight: Double = js.native
  
  /* CompleteClass */
  var DistanceFromTop: Double = js.native
  
  /* CompleteClass */
  var Enable: Boolean | `9999999` | WdLineStyle = js.native
  
  /* CompleteClass */
  var EnableFirstPageInSection: Boolean = js.native
  
  /* CompleteClass */
  var EnableOtherPagesInSection: Boolean = js.native
  
  /* CompleteClass */
  override val HasHorizontal: Boolean = js.native
  
  /* CompleteClass */
  override val HasVertical: Boolean = js.native
  
  /* CompleteClass */
  var InsideColor: WdColor = js.native
  
  /* CompleteClass */
  var InsideColorIndex: WdColorIndex = js.native
  
  /* CompleteClass */
  var InsideLineStyle: WdLineStyle = js.native
  
  /* CompleteClass */
  var InsideLineWidth: WdLineWidth = js.native
  
  /* CompleteClass */
  override def Item(Index: WdBorderType): typingsJapgolly.activexWord.Word.Border = js.native
  
  /* CompleteClass */
  var JoinBorders: Boolean = js.native
  
  /* CompleteClass */
  var OutsideColor: WdColor = js.native
  
  /* CompleteClass */
  var OutsideColorIndex: WdColorIndex = js.native
  
  /* CompleteClass */
  var OutsideLineStyle: WdLineStyle = js.native
  
  /* CompleteClass */
  var OutsideLineWidth: WdLineWidth = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Shadow: Boolean = js.native
  
  /* CompleteClass */
  var SurroundFooter: Boolean = js.native
  
  /* CompleteClass */
  var SurroundHeader: Boolean = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Borders_typekey")
  var WordDotBorders_typekey: typingsJapgolly.activexWord.Word.Borders = js.native
}
