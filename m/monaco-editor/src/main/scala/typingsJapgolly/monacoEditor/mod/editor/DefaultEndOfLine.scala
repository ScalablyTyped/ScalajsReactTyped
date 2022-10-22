package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefaultEndOfLine extends StObject
@JSImport("monaco-editor", "editor.DefaultEndOfLine")
@js.native
object DefaultEndOfLine extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefaultEndOfLine & Double] = js.native
  
  /**
    * Use carriage return and line feed (\r\n) as the end of line character.
    */
  @js.native
  sealed trait CRLF
    extends StObject
       with DefaultEndOfLine
  /* 2 */ val CRLF: typingsJapgolly.monacoEditor.mod.editor.DefaultEndOfLine.CRLF & Double = js.native
  
  /**
    * Use line feed (\n) as the end of line character.
    */
  @js.native
  sealed trait LF
    extends StObject
       with DefaultEndOfLine
  /* 1 */ val LF: typingsJapgolly.monacoEditor.mod.editor.DefaultEndOfLine.LF & Double = js.native
}
