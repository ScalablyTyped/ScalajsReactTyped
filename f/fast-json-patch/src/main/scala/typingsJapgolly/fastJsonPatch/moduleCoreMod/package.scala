package typingsJapgolly.fastJsonPatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moduleCoreMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.AddOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.RemoveOperation
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.MoveOperation
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.CopyOperation
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.TestOperation[js.Any]
    - typingsJapgolly.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  */
  type Operation = typingsJapgolly.fastJsonPatch.moduleCoreMod._Operation | typingsJapgolly.fastJsonPatch.moduleCoreMod.AddOperation[js.Any] | typingsJapgolly.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any] | typingsJapgolly.fastJsonPatch.moduleCoreMod.TestOperation[js.Any] | typingsJapgolly.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  type Validator_[T] = js.Function4[
    /* operation */ typingsJapgolly.fastJsonPatch.moduleCoreMod.Operation, 
    /* index */ scala.Double, 
    /* document */ T, 
    /* existingPathFragment */ java.lang.String, 
    scala.Unit
  ]
}
