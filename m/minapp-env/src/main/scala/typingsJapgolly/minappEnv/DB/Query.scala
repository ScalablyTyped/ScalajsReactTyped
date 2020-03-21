package typingsJapgolly.minappEnv.DB

import typingsJapgolly.minappEnv.OQ
import typingsJapgolly.minappEnv.Promise
import typingsJapgolly.minappEnv.RQICountDocumentOptions
import typingsJapgolly.minappEnv.RQIGetDocumentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.Query")
@js.native
class Query () extends js.Object {
  // update(options?: IUpdateDocumentOptions): Promise<IUpdateResult> | void
  // remove(options?: IRemoveDocumentOptions): Promise<IRemoveResult> | void
  // count(options?: ICountDocumentOptions): Promise<ICountResult> | void
  def count(): Promise[ICountResult] = js.native
  def count(options: OQ[ICountDocumentOptions]): Unit = js.native
  def count(options: RQICountDocumentOptions): Promise[ICountResult] = js.native
  def field(`object`: js.Object): Query = js.native
  // get(options?: IGetDocumentOptions): Promise<IQueryResult> | void
  // // update(options?: IUpdateDocumentOptions): Promise<IUpdateResult> | void
  // // remove(options?: IRemoveDocumentOptions): Promise<IRemoveResult> | void
  // count(options?: ICountDocumentOptions): Promise<ICountResult> | void
  // get(options?: IGetDocumentOptions): Promise<IQueryResult> | void
  def get(): Promise[IQueryResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): Promise[IQueryResult] = js.native
  def limit(max: Double): Query = js.native
  def orderBy(fieldPath: String, order: String): Query = js.native
  def skip(offset: Double): Query = js.native
  def where(condition: IQueryCondition): Query = js.native
}

