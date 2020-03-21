package typingsJapgolly.i18nextNodeFsBackend.mod

import typingsJapgolly.i18next.mod.BackendModule
import typingsJapgolly.i18next.mod.Services
import typingsJapgolly.i18nextNodeFsBackend.i18nextNodeFsBackEnd.i18nextNodeFsBackEndOptions
import typingsJapgolly.i18nextNodeFsBackend.i18nextNodeFsBackendStrings.backend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends BackendModule[i18nextNodeFsBackEndOptions] {
  @JSName("type")
  var type_Backend: backend = js.native
  def init(services: Services): Unit = js.native
  def init(services: Services, backendOptions: i18nextNodeFsBackEndOptions): Unit = js.native
}

