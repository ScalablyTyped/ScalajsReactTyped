package typingsJapgolly.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompletionItemTag extends StObject
@JSImport("monaco-editor", "languages.CompletionItemTag")
@js.native
object CompletionItemTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompletionItemTag & Double] = js.native
  
  @js.native
  sealed trait Deprecated
    extends StObject
       with CompletionItemTag
  /* 1 */ val Deprecated: typingsJapgolly.monacoEditor.mod.languages.CompletionItemTag.Deprecated & Double = js.native
}
