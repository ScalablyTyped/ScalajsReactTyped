package typingsJapgolly.activexWord.global.Word

import typingsJapgolly.activexWord.Word.WdStyleSheetLinkType
import typingsJapgolly.activexWord.Word.WdStyleSheetPrecedence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.StyleSheets")
@js.native
/* private */ open class StyleSheets ()
  extends StObject
     with typingsJapgolly.activexWord.Word.StyleSheets {
  
  /* CompleteClass */
  override def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): typingsJapgolly.activexWord.Word.StyleSheet = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexWord.Word.StyleSheet = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: typingsJapgolly.activexWord.Word.StyleSheets = js.native
}
