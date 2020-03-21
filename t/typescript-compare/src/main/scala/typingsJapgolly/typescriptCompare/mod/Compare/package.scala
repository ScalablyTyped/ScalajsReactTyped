package typingsJapgolly.typescriptCompare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Compare {
  type Options = typingsJapgolly.typescriptCompare.mod.Compare.Options_
  type Strict[A, B, Options /* <: typingsJapgolly.typescriptCompare.mod.Compare.Options */] = typingsJapgolly.typescriptLogic.mod.If[
    typingsJapgolly.typescriptCompare.mod.Extends[A, B], 
    typingsJapgolly.typescriptLogic.mod.If[
      typingsJapgolly.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typingsJapgolly.typescriptLogic.mod.If[
      typingsJapgolly.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
}
