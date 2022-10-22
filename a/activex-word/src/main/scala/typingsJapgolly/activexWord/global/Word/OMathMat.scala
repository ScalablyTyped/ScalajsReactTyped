package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdOMathSpacingRule
import typingsJapgolly.activexWord.Word.WdOMathVertAlignType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.OMathMat")
@js.native
/* private */ open class OMathMat ()
  extends StObject
     with typingsJapgolly.activexWord.Word.OMathMat {
  
  /* CompleteClass */
  var Align: WdOMathVertAlignType = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def Cell(Row: Double, Col: Double): typingsJapgolly.activexWord.Word.OMath = js.native
  
  /* CompleteClass */
  var ColGap: Double = js.native
  
  /* CompleteClass */
  var ColGapRule: WdOMathSpacingRule = js.native
  
  /* CompleteClass */
  var ColSpacing: Double = js.native
  
  /* CompleteClass */
  override val Cols: typingsJapgolly.activexWord.Word.OMathMatCols = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PlcHoldHidden: Boolean = js.native
  
  /* CompleteClass */
  var RowSpacing: Double = js.native
  
  /* CompleteClass */
  var RowSpacingRule: WdOMathSpacingRule = js.native
  
  /* CompleteClass */
  override val Rows: typingsJapgolly.activexWord.Word.OMathMatRows = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.OMathMat_typekey")
  var WordDotOMathMat_typekey: typingsJapgolly.activexWord.Word.OMathMat = js.native
}
