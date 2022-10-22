package typingsJapgolly.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderLineNumbersType extends StObject
@JSImport("monaco-editor", "editor.RenderLineNumbersType")
@js.native
object RenderLineNumbersType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RenderLineNumbersType & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with RenderLineNumbersType
  /* 4 */ val Custom: typingsJapgolly.monacoEditor.mod.editor.RenderLineNumbersType.Custom & Double = js.native
  
  @js.native
  sealed trait Interval
    extends StObject
       with RenderLineNumbersType
  /* 3 */ val Interval: typingsJapgolly.monacoEditor.mod.editor.RenderLineNumbersType.Interval & Double = js.native
  
  @js.native
  sealed trait Off
    extends StObject
       with RenderLineNumbersType
  /* 0 */ val Off: typingsJapgolly.monacoEditor.mod.editor.RenderLineNumbersType.Off & Double = js.native
  
  @js.native
  sealed trait On
    extends StObject
       with RenderLineNumbersType
  /* 1 */ val On: typingsJapgolly.monacoEditor.mod.editor.RenderLineNumbersType.On & Double = js.native
  
  @js.native
  sealed trait Relative
    extends StObject
       with RenderLineNumbersType
  /* 2 */ val Relative: typingsJapgolly.monacoEditor.mod.editor.RenderLineNumbersType.Relative & Double = js.native
}
