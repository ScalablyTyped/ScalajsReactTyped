package typingsJapgolly.jupyterlabCoreutils.statedbMod.StateDB

import typingsJapgolly.jupyterlabCoreutils.AnonIdsValues
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An in-memory string key/value data connector.
  */
@JSImport("@jupyterlab/coreutils/lib/statedb", "StateDB.Connector")
@js.native
class Connector () extends IDataConnector[String, String, String] {
  var _storage: js.Any = js.native
  def list(query: String): js.Promise[AnonIdsValues] = js.native
}

