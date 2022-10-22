package typingsJapgolly.prettier.docMod.builders

import typingsJapgolly.prettier.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.prettier.docMod.builders.Align_
  - typingsJapgolly.prettier.docMod.builders.BreakParent_
  - typingsJapgolly.prettier.docMod.builders.Concat_
  - typingsJapgolly.prettier.docMod.builders.Cursor_
  - typingsJapgolly.prettier.docMod.builders.Fill_
  - typingsJapgolly.prettier.docMod.builders.Group_
  - typingsJapgolly.prettier.docMod.builders.IfBreak_
  - typingsJapgolly.prettier.docMod.builders.Indent_
  - typingsJapgolly.prettier.docMod.builders.IndentIfBreak_
  - typingsJapgolly.prettier.docMod.builders.Label_
  - typingsJapgolly.prettier.docMod.builders.Line_
  - typingsJapgolly.prettier.docMod.builders.LineSuffix_
  - typingsJapgolly.prettier.docMod.builders.LineSuffixBoundary_
  - typingsJapgolly.prettier.docMod.builders.Trim_
*/
trait DocCommand extends StObject
object DocCommand {
  
  inline def Align_(contents: Doc, n: Double | String | Type): typingsJapgolly.prettier.docMod.builders.Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("align")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Align_]
  }
  
  inline def BreakParent_(): typingsJapgolly.prettier.docMod.builders.BreakParent_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("break-parent")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.BreakParent_]
  }
  
  inline def Concat_(parts: js.Array[Doc]): typingsJapgolly.prettier.docMod.builders.Concat_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("concat")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Concat_]
  }
  
  inline def Cursor_(placeholder: js.Symbol): typingsJapgolly.prettier.docMod.builders.Cursor_ = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("cursor")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Cursor_]
  }
  
  inline def Fill_(parts: js.Array[Doc]): typingsJapgolly.prettier.docMod.builders.Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Fill_]
  }
  
  inline def Group_(break: Boolean, contents: Doc, expandedStates: js.Array[Doc]): typingsJapgolly.prettier.docMod.builders.Group_ = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], expandedStates = expandedStates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Group_]
  }
  
  inline def IfBreak_(breakContents: Doc, flatContents: Doc): typingsJapgolly.prettier.docMod.builders.IfBreak_ = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("if-break")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.IfBreak_]
  }
  
  inline def IndentIfBreak_(): typingsJapgolly.prettier.docMod.builders.IndentIfBreak_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("indent-if-break")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.IndentIfBreak_]
  }
  
  inline def Indent_(contents: Doc): typingsJapgolly.prettier.docMod.builders.Indent_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("indent")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Indent_]
  }
  
  inline def Label_(): typingsJapgolly.prettier.docMod.builders.Label_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("label")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Label_]
  }
  
  inline def LineSuffixBoundary_(): typingsJapgolly.prettier.docMod.builders.LineSuffixBoundary_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line-suffix-boundary")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.LineSuffixBoundary_]
  }
  
  inline def LineSuffix_(contents: Doc): typingsJapgolly.prettier.docMod.builders.LineSuffix_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line-suffix")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.LineSuffix_]
  }
  
  inline def Line_(): typingsJapgolly.prettier.docMod.builders.Line_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Line_]
  }
  
  inline def Trim_(): typingsJapgolly.prettier.docMod.builders.Trim_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trim")
    __obj.asInstanceOf[typingsJapgolly.prettier.docMod.builders.Trim_]
  }
}
