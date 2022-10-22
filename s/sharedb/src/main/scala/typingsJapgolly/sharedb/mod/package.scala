package typingsJapgolly.sharedb.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharedb.libSharedbMod.Logger
import typingsJapgolly.sharedb.libSharedbMod.Types
import typingsJapgolly.sharedb.sharedbBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def logger: Logger = ^.asInstanceOf[js.Dynamic].selectDynamic("logger").asInstanceOf[Logger]
inline def logger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])

/* static member */
inline def types: Types = ^.asInstanceOf[js.Dynamic].selectDynamic("types").asInstanceOf[Types]
inline def types_=(x: Types): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])

type AddNumOp = typingsJapgolly.sharedb.libSharedbMod.AddNumOp

type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]

type CreateOp = typingsJapgolly.sharedb.libSharedbMod.CreateOp

type DBQueryCallback = js.Function3[
/* err */ Error | Null, 
/* snapshots */ js.Array[Snapshot], 
/* extra */ js.UndefOr[Any], 
Unit]

type DBQueryMethod = js.Function5[
/* collection */ String, 
/* query */ Any, 
/* fields */ ProjectionFields, 
/* options */ Any, 
/* callback */ DBQueryCallback, 
Unit]

type DeleteOp = typingsJapgolly.sharedb.libSharedbMod.DeleteOp

type Doc = typingsJapgolly.sharedb.libSharedbMod.Doc[Any]

type EditOp = typingsJapgolly.sharedb.libSharedbMod.EditOp

type Error = typingsJapgolly.sharedb.libSharedbMod.Error

type ErrorHandler = js.Function2[/* error */ js.Error, /* context */ ErrorHandlerContext, Unit]

type ListDeleteOp = typingsJapgolly.sharedb.libSharedbMod.ListDeleteOp

type ListInsertOp = typingsJapgolly.sharedb.libSharedbMod.ListInsertOp

type ListMoveOp = typingsJapgolly.sharedb.libSharedbMod.ListMoveOp

type ListReplaceOp = typingsJapgolly.sharedb.libSharedbMod.ListReplaceOp

type ObjectDeleteOp = typingsJapgolly.sharedb.libSharedbMod.ObjectDeleteOp

type ObjectInsertOp = typingsJapgolly.sharedb.libSharedbMod.ObjectInsertOp

type ObjectReplaceOp = typingsJapgolly.sharedb.libSharedbMod.ObjectReplaceOp

type Op = typingsJapgolly.sharedb.libSharedbMod.Op

type Path = typingsJapgolly.sharedb.libSharedbMod.Path

type ProjectionFields = StringDictionary[`true`]

type Query = typingsJapgolly.sharedb.libSharedbMod.Query[Any]

type ShareDBSourceOptions = typingsJapgolly.sharedb.libSharedbMod.ShareDBSourceOptions

type Snapshot = typingsJapgolly.sharedb.libSharedbMod.Snapshot[Any]

type StringDeleteOp = typingsJapgolly.sharedb.libSharedbMod.StringDeleteOp

type StringInsertOp = typingsJapgolly.sharedb.libSharedbMod.StringInsertOp

type SubtypeOp = typingsJapgolly.sharedb.libSharedbMod.SubtypeOp
