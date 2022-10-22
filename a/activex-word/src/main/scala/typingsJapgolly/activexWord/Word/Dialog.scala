package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  val CommandBarId: Double = js.native
  
  val CommandName: String = js.native
  
  val Creator: Double = js.native
  
  var DefaultTab: WdWordDialogTab = js.native
  
  def Display(): Double = js.native
  def Display(TimeOut: Double): Double = js.native
  
  def Execute(): Unit = js.native
  
  val Parent: Any = js.native
  
  def Show(): Double = js.native
  def Show(TimeOut: Any): Double = js.native
  
  val Type: WdWordDialog = js.native
  
  def Update(): Unit = js.native
  
  /* private */ @JSName("Word.Dialog_typekey")
  var WordDotDialog_typekey: Dialog = js.native
}
