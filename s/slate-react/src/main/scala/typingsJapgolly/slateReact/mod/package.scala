package typingsJapgolly.slateReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorProps[T /* <: typingsJapgolly.slate.mod.Controller */] = typingsJapgolly.slateReact.mod.BasicEditorProps[T] with typingsJapgolly.slateReact.mod.Plugin[T]
  type EventHook[T] = js.Function3[
    /* event */ T, 
    /* editor */ typingsJapgolly.slateReact.mod.Editor, 
    /* next */ js.Function0[js.Any], 
    js.Any
  ]
  type OnChangeFn = js.Function1[/* change */ typingsJapgolly.slateReact.mod.OnChangeParam, js.Any]
  type RenderAttributes = org.scalablytyped.runtime.StringDictionary[js.Any]
}
