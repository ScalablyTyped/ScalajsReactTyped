package typingsJapgolly.reactMonacoEditor.components

import typingsJapgolly.reactMonacoEditor.libTypesMod.MonacoDiffEditorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonacoDiffEditor {
  
  @JSImport("react-monaco-editor", "MonacoDiffEditor")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MonacoDiffEditor.type): SharedBuilder_MonacoDiffEditorProps_550238599[typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor] = new SharedBuilder_MonacoDiffEditorProps_550238599[typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MonacoDiffEditorProps): SharedBuilder_MonacoDiffEditorProps_550238599[typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor] = new SharedBuilder_MonacoDiffEditorProps_550238599[typingsJapgolly.reactMonacoEditor.mod.MonacoDiffEditor](js.Array(this.component, p.asInstanceOf[js.Any]))
}
