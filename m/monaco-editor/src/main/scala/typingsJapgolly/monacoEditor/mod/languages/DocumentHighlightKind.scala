package typingsJapgolly.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentHighlightKind extends StObject
@JSImport("monaco-editor", "languages.DocumentHighlightKind")
@js.native
object DocumentHighlightKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentHighlightKind & Double] = js.native
  
  /**
    * Read-access of a symbol, like reading a variable.
    */
  @js.native
  sealed trait Read
    extends StObject
       with DocumentHighlightKind
  /* 1 */ val Read: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Read & Double = js.native
  
  /**
    * A textual occurrence.
    */
  @js.native
  sealed trait Text
    extends StObject
       with DocumentHighlightKind
  /* 0 */ val Text: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Text & Double = js.native
  
  /**
    * Write-access of a symbol, like writing to a variable.
    */
  @js.native
  sealed trait Write
    extends StObject
       with DocumentHighlightKind
  /* 2 */ val Write: typingsJapgolly.monacoEditor.mod.languages.DocumentHighlightKind.Write & Double = js.native
}
