package typingsJapgolly.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fastJsonPatch.coreMod.AddOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.coreMod.RemoveOperation
    - typingsJapgolly.fastJsonPatch.coreMod.ReplaceOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.coreMod.MoveOperation
    - typingsJapgolly.fastJsonPatch.coreMod.CopyOperation
    - typingsJapgolly.fastJsonPatch.coreMod.TestOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.coreMod.GetOperation[js.Any]
  */
  type Operation = typingsJapgolly.fastJsonPatch.coreMod._Operation | typingsJapgolly.fastJsonPatch.coreMod.AddOperation[js.Any] | typingsJapgolly.fastJsonPatch.coreMod.ReplaceOperation[js.Any] | typingsJapgolly.fastJsonPatch.coreMod.TestOperation[js.Any] | typingsJapgolly.fastJsonPatch.coreMod.GetOperation[js.Any]
  type Validator_[T] = js.Function4[
    /* operation */ typingsJapgolly.fastJsonPatch.coreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
