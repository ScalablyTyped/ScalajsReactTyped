package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdConditionCode
import typingsJapgolly.activexWord.Word.WdRowAlignment
import typingsJapgolly.activexWord.Word.WdTableDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TableStyle")
@js.native
/* private */ open class TableStyle ()
  extends StObject
     with typingsJapgolly.activexWord.Word.TableStyle {
  
  /* CompleteClass */
  var Alignment: WdRowAlignment = js.native
  
  /* CompleteClass */
  var AllowBreakAcrossPage: Double = js.native
  
  /* CompleteClass */
  var AllowPageBreaks: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Borders: typingsJapgolly.activexWord.Word.Borders = js.native
  
  /* CompleteClass */
  var BottomPadding: Double = js.native
  
  /* CompleteClass */
  var ColumnStripe: Double = js.native
  
  /* CompleteClass */
  override def Condition(ConditionCode: WdConditionCode): typingsJapgolly.activexWord.Word.ConditionalStyle = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var LeftIndent: Double = js.native
  
  /* CompleteClass */
  var LeftPadding: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var RightPadding: Double = js.native
  
  /* CompleteClass */
  var RowStripe: Double = js.native
  
  /* CompleteClass */
  override val Shading: typingsJapgolly.activexWord.Word.Shading = js.native
  
  /* CompleteClass */
  var Spacing: Double = js.native
  
  /* CompleteClass */
  var TableDirection: WdTableDirection = js.native
  
  /* CompleteClass */
  var TopPadding: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: typingsJapgolly.activexWord.Word.TableStyle = js.native
}
