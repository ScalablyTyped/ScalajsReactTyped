package typingsJapgolly.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object specsSpecTestRunnerMod {
  type SpecQueryFilter = js.Tuple3[java.lang.String, java.lang.String, js.Any]
  type SpecQueryOrderBy = js.Tuple2[java.lang.String, java.lang.String]
  type SpecUserDelete = java.lang.String
  type SpecUserListen = js.Tuple2[
    typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId, 
    java.lang.String | typingsJapgolly.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
  ]
  type SpecUserPatch = js.Tuple2[
    java.lang.String, 
    typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.JsonObject[js.Any]
  ]
  type SpecUserSet = js.Tuple2[
    java.lang.String, 
    typingsJapgolly.firebaseFirestore.srcModelFieldValueMod.JsonObject[js.Any]
  ]
  type SpecUserUnlisten = js.Tuple2[
    typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId, 
    java.lang.String | typingsJapgolly.firebaseFirestore.specsSpecTestRunnerMod.SpecQuery
  ]
  type SpecWatchAck = js.Array[typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId]
  type SpecWatchCurrent = js.Tuple2[
    js.Array[typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId], 
    java.lang.String
  ]
  type SpecWatchReset = js.Array[typingsJapgolly.firebaseFirestore.coreTypesMod.TargetId]
}
