package typingsJapgolly.datastoreCore.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.interfaceDatastore.mod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountDatastore
  extends Datastore[js.Any] {
  var mounts: js.Array[Mount[_]]
}

@JSImport("datastore-core", "MountDatastore")
@js.native
object MountDatastore extends TopLevel[MountDatastoreConstructor]

