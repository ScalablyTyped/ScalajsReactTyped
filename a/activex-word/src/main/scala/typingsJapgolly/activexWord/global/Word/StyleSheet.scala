package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdStyleSheetLinkType
import typingsJapgolly.activexWord.Word.WdStyleSheetPrecedence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.StyleSheet")
@js.native
/* private */ open class StyleSheet ()
  extends StObject
     with typingsJapgolly.activexWord.Word.StyleSheet {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val FullName: String = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def Move(Precedence: WdStyleSheetPrecedence): Unit = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  var Title: String = js.native
  
  /* CompleteClass */
  var Type: WdStyleSheetLinkType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: typingsJapgolly.activexWord.Word.StyleSheet = js.native
}
