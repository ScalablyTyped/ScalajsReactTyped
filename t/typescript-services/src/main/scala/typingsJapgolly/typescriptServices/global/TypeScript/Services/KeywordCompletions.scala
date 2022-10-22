package typingsJapgolly.typescriptServices.global.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.KeywordCompletions")
@js.native
open class KeywordCompletions ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.KeywordCompletions
object KeywordCompletions {
  
  @JSGlobal("TypeScript.Services.KeywordCompletions")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getKeywordCompltions(): js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.ResolvedCompletionEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeywordCompltions")().asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.Services.ResolvedCompletionEntry]]
  
  /* static member */
  @JSGlobal("TypeScript.Services.KeywordCompletions.keywordCompletions")
  @js.native
  def keywordCompletions: Any = js.native
  inline def keywordCompletions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keywordCompletions")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("TypeScript.Services.KeywordCompletions.keywords")
  @js.native
  def keywords: Any = js.native
  inline def keywords_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keywords")(x.asInstanceOf[js.Any])
}
