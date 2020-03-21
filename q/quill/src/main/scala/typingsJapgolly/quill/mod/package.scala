package typingsJapgolly.quill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorChangeHandler = js.Function4[
    typingsJapgolly.quill.quillStrings.`text-change` | typingsJapgolly.quill.quillStrings.`selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any) | (/* range */ typingsJapgolly.quill.mod.RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any) | (/* oldRange */ typingsJapgolly.quill.mod.RangeStatic), 
    /* source */ typingsJapgolly.quill.mod.Sources, 
    js.Any
  ]
  type SelectionChangeHandler = js.Function3[
    /* range */ typingsJapgolly.quill.mod.RangeStatic, 
    /* oldRange */ typingsJapgolly.quill.mod.RangeStatic, 
    /* source */ typingsJapgolly.quill.mod.Sources, 
    js.Any
  ]
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ typingsJapgolly.quill.mod.Sources, 
    js.Any
  ]
}
