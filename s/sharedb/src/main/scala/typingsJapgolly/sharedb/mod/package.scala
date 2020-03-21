package typingsJapgolly.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddNumOp = typingsJapgolly.sharedb.sharedbMod.AddNumOp
  type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type DBQueryCallback = js.Function3[
    /* err */ typingsJapgolly.sharedb.mod.Error | scala.Null, 
    /* snapshots */ js.Array[typingsJapgolly.sharedb.sharedbMod.Snapshot], 
    /* extra */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type DBQueryMethod = js.Function5[
    /* collection */ java.lang.String, 
    /* query */ js.Any, 
    /* fields */ js.UndefOr[typingsJapgolly.sharedb.mod.ProjectionFields], 
    /* options */ js.Any, 
    /* callback */ typingsJapgolly.sharedb.mod.DBQueryCallback, 
    scala.Unit
  ]
  type Doc = typingsJapgolly.sharedb.sharedbMod.Doc
  type Error = typingsJapgolly.sharedb.sharedbMod.Error
  type ListDeleteOp = typingsJapgolly.sharedb.sharedbMod.ListDeleteOp
  type ListInsertOp = typingsJapgolly.sharedb.sharedbMod.ListInsertOp
  type ListMoveOp = typingsJapgolly.sharedb.sharedbMod.ListMoveOp
  type ListReplaceOp = typingsJapgolly.sharedb.sharedbMod.ListReplaceOp
  type ObjectDeleteOp = typingsJapgolly.sharedb.sharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typingsJapgolly.sharedb.sharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typingsJapgolly.sharedb.sharedbMod.ObjectReplaceOp
  type Op = typingsJapgolly.sharedb.sharedbMod.Op
  type Path = typingsJapgolly.sharedb.sharedbMod.Path
  type ProjectionFields = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sharedb.sharedbBooleans.`true`]
  type Query = typingsJapgolly.sharedb.sharedbMod.Query
  type ShareDBSourceOptions = typingsJapgolly.sharedb.sharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typingsJapgolly.sharedb.sharedbMod.StringDeleteOp
  type StringInsertOp = typingsJapgolly.sharedb.sharedbMod.StringInsertOp
  type SubtypeOp = typingsJapgolly.sharedb.sharedbMod.SubtypeOp
}
