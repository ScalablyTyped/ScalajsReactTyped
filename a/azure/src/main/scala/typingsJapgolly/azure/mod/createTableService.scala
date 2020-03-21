package typingsJapgolly.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "createTableService")
@js.native
object createTableService extends js.Object {
  def apply(): TableService = js.native
  def apply(connectionString: String): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String): TableService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): TableService = js.native
}

