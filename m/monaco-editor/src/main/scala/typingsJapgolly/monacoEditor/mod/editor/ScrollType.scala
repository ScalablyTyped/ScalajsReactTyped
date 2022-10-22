package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollType extends StObject
@JSImport("monaco-editor", "editor.ScrollType")
@js.native
object ScrollType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScrollType & Double] = js.native
  
  @js.native
  sealed trait Immediate
    extends StObject
       with ScrollType
  /* 1 */ val Immediate: typingsJapgolly.monacoEditor.mod.editor.ScrollType.Immediate & Double = js.native
  
  @js.native
  sealed trait Smooth
    extends StObject
       with ScrollType
  /* 0 */ val Smooth: typingsJapgolly.monacoEditor.mod.editor.ScrollType.Smooth & Double = js.native
}
