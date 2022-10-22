package typingsJapgolly.monacoEditor.mod.languages.typescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JsxEmit extends StObject
@JSImport("monaco-editor", "languages.typescript.JsxEmit")
@js.native
object JsxEmit extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxEmit & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with JsxEmit
  /* 0 */ val None: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.None & Double = js.native
  
  @js.native
  sealed trait Preserve
    extends StObject
       with JsxEmit
  /* 1 */ val Preserve: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.Preserve & Double = js.native
  
  @js.native
  sealed trait React
    extends StObject
       with JsxEmit
  /* 2 */ val React: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.React & Double = js.native
  
  @js.native
  sealed trait ReactJSX
    extends StObject
       with JsxEmit
  /* 4 */ val ReactJSX: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactJSX & Double = js.native
  
  @js.native
  sealed trait ReactJSXDev
    extends StObject
       with JsxEmit
  /* 5 */ val ReactJSXDev: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactJSXDev & Double = js.native
  
  @js.native
  sealed trait ReactNative
    extends StObject
       with JsxEmit
  /* 3 */ val ReactNative: typingsJapgolly.monacoEditor.mod.languages.typescript.JsxEmit.ReactNative & Double = js.native
}
