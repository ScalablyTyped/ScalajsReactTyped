package typingsJapgolly.pouchdbMapreduce.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._sum
  - typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._count
  - typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._stats
*/
trait BuiltInReducers extends js.Object

object BuiltInReducers {
  @scala.inline
  def _count: typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._count = this.cast("_count")
  @scala.inline
  def _stats: typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._stats = this.cast("_stats")
  @scala.inline
  def _sum: typingsJapgolly.pouchdbMapreduce.pouchdbMapreduceStrings._sum = this.cast("_sum")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

