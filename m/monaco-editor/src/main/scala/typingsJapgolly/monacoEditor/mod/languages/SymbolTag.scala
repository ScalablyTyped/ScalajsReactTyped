package typingsJapgolly.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolTag extends StObject
@JSImport("monaco-editor", "languages.SymbolTag")
@js.native
object SymbolTag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolTag & Double] = js.native
  
  @js.native
  sealed trait Deprecated
    extends StObject
       with SymbolTag
  /* 1 */ val Deprecated: typingsJapgolly.monacoEditor.mod.languages.SymbolTag.Deprecated & Double = js.native
}
