package typingsJapgolly.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.interfaceDatastore.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceDatastore[Value] extends KeytransformDatastore[Value] {
  var prefix: Key
}

@JSImport("datastore-core", "NamespaceDatastore")
@js.native
object NamespaceDatastore extends TopLevel[NamespaceDatastoreConstructor]

