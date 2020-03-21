package typingsJapgolly.limeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ISessionListener = js.Function1[/* session */ typingsJapgolly.limeJs.mod.Session, scala.Unit]
  type ITransportEnvelopeListener = js.Function1[/* envelope */ typingsJapgolly.limeJs.mod.Envelope, scala.Unit]
}
