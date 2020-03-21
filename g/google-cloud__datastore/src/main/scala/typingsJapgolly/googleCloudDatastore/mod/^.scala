package typingsJapgolly.googleCloudDatastore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.googleCloudDatastore.queryMod.MoreResultsAfterCursor
import typingsJapgolly.googleCloudDatastore.queryMod.MoreResultsAfterLimit
import typingsJapgolly.googleCloudDatastore.queryMod.NoMoreResults
import typingsJapgolly.googleCloudDatastore.transactionMod.DatastoreTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/datastore", JSImport.Namespace)
@js.native
class ^ () extends Datastore {
  def this(options: InitOptions) = this()
}

@JSImport("@google-cloud/datastore", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DatastoreRequest: Instantiable0[typingsJapgolly.googleCloudDatastore.requestMod.DatastoreRequest] = js.native
  val KEY: js.Symbol = js.native
  val MORE_RESULTS_AFTER_CURSOR: MoreResultsAfterCursor = js.native
  val MORE_RESULTS_AFTER_LIMIT: MoreResultsAfterLimit = js.native
  val NO_MORE_RESULTS: NoMoreResults = js.native
  val Query: Instantiable3[
    /* scope */ String, 
    /* kinds */ String, 
    /* namespace */ String, 
    typingsJapgolly.googleCloudDatastore.queryMod.Query
  ] = js.native
  val Transaction: Instantiable1[/* datastore */ ^, DatastoreTransaction] = js.native
}

