package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdDictionaryType
import typingsJapgolly.activexWord.Word.WdLanguageID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Dictionary")
@js.native
/* private */ open class Dictionary ()
  extends StObject
     with typingsJapgolly.activexWord.Word.Dictionary {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var LanguageID: WdLanguageID = js.native
  
  /* CompleteClass */
  var LanguageSpecific: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  override val ReadOnly: Boolean = js.native
  
  /* CompleteClass */
  override val Type: WdDictionaryType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Dictionary_typekey")
  var WordDotDictionary_typekey: typingsJapgolly.activexWord.Word.Dictionary = js.native
}
