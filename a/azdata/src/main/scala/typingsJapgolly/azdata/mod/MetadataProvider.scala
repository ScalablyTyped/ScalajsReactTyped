package typingsJapgolly.azdata.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataProvider extends DataProvider {
  def getDatabases(connectionUri: String): Thenable[js.Array[String]]
  def getMetadata(connectionUri: String): Thenable[ProviderMetadata]
  def getTableInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
  def getViewInfo(connectionUri: String, metadata: ObjectMetadata): Thenable[js.Array[ColumnMetadata]]
}

object MetadataProvider {
  @scala.inline
  def apply(
    getDatabases: String => CallbackTo[Thenable[js.Array[String]]],
    getMetadata: String => CallbackTo[Thenable[ProviderMetadata]],
    getTableInfo: (String, ObjectMetadata) => CallbackTo[Thenable[js.Array[ColumnMetadata]]],
    getViewInfo: (String, ObjectMetadata) => CallbackTo[Thenable[js.Array[ColumnMetadata]]],
    providerId: String,
    handle: Int | Double = null
  ): MetadataProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any])
    __obj.updateDynamic("getDatabases")(js.Any.fromFunction1((t0: java.lang.String) => getDatabases(t0).runNow()))
    __obj.updateDynamic("getMetadata")(js.Any.fromFunction1((t0: java.lang.String) => getMetadata(t0).runNow()))
    __obj.updateDynamic("getTableInfo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.ObjectMetadata) => getTableInfo(t0, t1).runNow()))
    __obj.updateDynamic("getViewInfo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.azdata.mod.ObjectMetadata) => getViewInfo(t0, t1).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProvider]
  }
}

