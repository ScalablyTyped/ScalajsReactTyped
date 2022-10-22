package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlCreator
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Macintosh only */
@JSGlobal("Excel.Mailer")
@js.native
/* private */ open class Mailer ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Mailer {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var BCCRecipients: Any = js.native
  
  /* CompleteClass */
  var CCRecipients: Any = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var Enclosures: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Mailer_typekey")
  var ExcelDotMailer_typekey: typingsJapgolly.activexExcel.Excel.Mailer = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Received: Boolean = js.native
  
  /* CompleteClass */
  override val SendDateTime: VarDate = js.native
  
  /* CompleteClass */
  override val Sender: String = js.native
  
  /* CompleteClass */
  var Subject: String = js.native
  
  /* CompleteClass */
  var ToRecipients: Any = js.native
  
  /* CompleteClass */
  var WhichAddress: Any = js.native
}
