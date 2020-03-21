package typingsJapgolly.electron.mod.remote

import typingsJapgolly.electron.Electron.ClientRequest
import typingsJapgolly.electron.electronStrings.host
import typingsJapgolly.electron.electronStrings.hostname
import typingsJapgolly.electron.electronStrings.method
import typingsJapgolly.electron.electronStrings.partition
import typingsJapgolly.electron.electronStrings.path
import typingsJapgolly.electron.electronStrings.port
import typingsJapgolly.electron.electronStrings.protocol
import typingsJapgolly.electron.electronStrings.redirect
import typingsJapgolly.electron.electronStrings.session
import typingsJapgolly.electron.electronStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "remote.ClientRequest")
@js.native
class ClientRequestCls protected () extends ClientRequest {
  def this(options: method | url | session | partition | protocol | host | hostname | port | path | redirect) = this()
}

