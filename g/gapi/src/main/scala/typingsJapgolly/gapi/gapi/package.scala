package typingsJapgolly.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gapi {
  type CallbackOrConfig = typingsJapgolly.gapi.gapi.LoadConfig | typingsJapgolly.gapi.gapi.LoadCallback
  type LoadCallback = js.Function1[/* repeated */ js.Any, scala.Unit]
}
