package typingsJapgolly.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A function that calls the updateLintingCallback with any errors found during the linting process.
    */
  type AsyncLinter = js.Function4[
    /* content */ java.lang.String, 
    /* updateLintingCallback */ typingsJapgolly.codemirror.mod.UpdateLintingCallback, 
    /* options */ typingsJapgolly.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typingsJapgolly.codemirror.mod.Editor, 
    scala.Unit
  ]
  type HintFunction = js.Function1[
    /* cm */ typingsJapgolly.codemirror.mod.Editor, 
    typingsJapgolly.codemirror.mod.Hints
  ]
  type KeyMap = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.codemirror.codemirrorBooleans.`false` | java.lang.String | (js.Function1[
      /* instance */ typingsJapgolly.codemirror.mod.Editor, 
      scala.Unit | typingsJapgolly.codemirror.AnonToString
    ])
  ]
  /**
    * A function that return errors found during the linting process.
    */
  type Linter = js.Function3[
    /* content */ java.lang.String, 
    /* options */ typingsJapgolly.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typingsJapgolly.codemirror.mod.Editor, 
    js.Array[typingsJapgolly.codemirror.mod.Annotation] | js.Thenable[js.Array[typingsJapgolly.codemirror.mod.Annotation]]
  ]
  type MimeModeMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
    */
  type ModeFactory[T] = js.Function2[
    /* config */ typingsJapgolly.codemirror.mod.EditorConfiguration, 
    /* modeOptions */ js.UndefOr[js.Any], 
    typingsJapgolly.codemirror.mod.Mode[T]
  ]
  type ModeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.codemirror.mod.ModeFactory[js.Any]]
  /**
    * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
    */
  type UpdateLintingCallback = js.Function2[
    /* codeMirror */ typingsJapgolly.codemirror.mod.Editor, 
    /* annotations */ js.Array[typingsJapgolly.codemirror.mod.Annotation], 
    scala.Unit
  ]
}
