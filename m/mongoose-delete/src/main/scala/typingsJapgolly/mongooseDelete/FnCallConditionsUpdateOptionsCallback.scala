package typingsJapgolly.mongooseDelete

import typingsJapgolly.mongodb.mod.FindAndModifyWriteOpResultObject
import typingsJapgolly.mongoose.mod.QueryFindOneAndUpdateOptions
import typingsJapgolly.mongoose.rawResulttrueQueryFindOneContext
import typingsJapgolly.mongoose.rawResulttrueupserttruene
import typingsJapgolly.mongoose.upserttruenewtrueQueryFin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConditionsUpdateOptionsCallback extends js.Object {
  def apply(): DocumentQueryanynullanyAll = js.native
  def apply(conditions: js.Any, update: js.Any): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): DocumentQueryanynullanyAll = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): DocumentQueryanynullanyAll = js.native
  def apply(conditions: js.Any, update: js.Any, options: rawResulttrueQueryFindOneContext): QueryFindAndModifyWriteOpBatchSize = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueQueryFindOneContext,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpBatchSize = js.native
  def apply(conditions: js.Any, update: js.Any, options: rawResulttrueupserttruene): QueryFindAndModifyWriteOpAnd = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: rawResulttrueupserttruene,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): QueryFindAndModifyWriteOpAnd = js.native
  def apply(conditions: js.Any, update: js.Any, options: upserttruenewtrueQueryFin): DocumentQueryanyanyAll = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: upserttruenewtrueQueryFin,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): DocumentQueryanyanyAll = js.native
}

