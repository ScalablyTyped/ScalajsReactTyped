package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollbarVisibility extends StObject
@JSImport("monaco-editor", "editor.ScrollbarVisibility")
@js.native
object ScrollbarVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollbarVisibility & Double] = js.native
  
  @js.native
  sealed trait Auto
    extends StObject
       with ScrollbarVisibility
  /* 1 */ val Auto: typingsJapgolly.monacoEditor.mod.editor.ScrollbarVisibility.Auto & Double = js.native
  
  @js.native
  sealed trait Hidden
    extends StObject
       with ScrollbarVisibility
  /* 2 */ val Hidden: typingsJapgolly.monacoEditor.mod.editor.ScrollbarVisibility.Hidden & Double = js.native
  
  @js.native
  sealed trait Visible
    extends StObject
       with ScrollbarVisibility
  /* 3 */ val Visible: typingsJapgolly.monacoEditor.mod.editor.ScrollbarVisibility.Visible & Double = js.native
}
