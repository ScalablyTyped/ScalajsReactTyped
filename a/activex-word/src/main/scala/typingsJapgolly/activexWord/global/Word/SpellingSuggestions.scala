package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdSpellingErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.SpellingSuggestions")
@js.native
/* private */ open class SpellingSuggestions ()
  extends StObject
     with typingsJapgolly.activexWord.Word.SpellingSuggestions {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typingsJapgolly.activexWord.Word.SpellingSuggestion = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val SpellingErrorType: WdSpellingErrorType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: typingsJapgolly.activexWord.Word.SpellingSuggestions = js.native
}
