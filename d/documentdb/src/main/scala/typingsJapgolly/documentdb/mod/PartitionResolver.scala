package typingsJapgolly.documentdb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionResolver extends js.Object {
  /**
    * Extracts the partition key from the specified document using the partitionKeyExtractor
    * @param document - The document from which to extract the partition key.
    */
  def getPartitionKey(document: js.Any): String
  /**
    * Given a partition key, returns the correct collection link for creating a document.
    * @param partitionKey - The partition key used to determine the target collection for create
    */
  def resolveForCreate(partitionKey: String): String
  /**
    * Given a partition key, returns a list of collection links to read from.
    * @param partitionKey - The partition key used to determine the target collection for query
    */
  def resolveForRead(partitionKey: js.Any): js.Array[String]
}

object PartitionResolver {
  @scala.inline
  def apply(
    getPartitionKey: js.Any => CallbackTo[String],
    resolveForCreate: String => CallbackTo[String],
    resolveForRead: js.Any => CallbackTo[js.Array[String]]
  ): PartitionResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPartitionKey")(js.Any.fromFunction1((t0: js.Any) => getPartitionKey(t0).runNow()))
    __obj.updateDynamic("resolveForCreate")(js.Any.fromFunction1((t0: java.lang.String) => resolveForCreate(t0).runNow()))
    __obj.updateDynamic("resolveForRead")(js.Any.fromFunction1((t0: js.Any) => resolveForRead(t0).runNow()))
    __obj.asInstanceOf[PartitionResolver]
  }
}

