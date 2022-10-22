package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyBinding extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  def Clear(): Unit = js.native
  
  val Command: String = js.native
  
  val CommandParameter: String = js.native
  
  val Context: Any = js.native
  
  val Creator: Double = js.native
  
  def Disable(): Unit = js.native
  
  def Execute(): Unit = js.native
  
  val KeyCategory: WdKeyCategory = js.native
  
  val KeyCode: Double = js.native
  
  val KeyCode2: Double = js.native
  
  val KeyString: String = js.native
  
  val Parent: Any = js.native
  
  val Protected: Boolean = js.native
  
  def Rebind(KeyCategory: WdKeyCategory, Command: String): Unit = js.native
  def Rebind(KeyCategory: WdKeyCategory, Command: String, CommandParameter: Any): Unit = js.native
  
  /* private */ @JSName("Word.KeyBinding_typekey")
  var WordDotKeyBinding_typekey: KeyBinding = js.native
}
