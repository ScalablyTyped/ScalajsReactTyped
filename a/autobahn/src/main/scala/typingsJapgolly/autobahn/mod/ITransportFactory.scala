package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportFactory extends js.Object {
  var `type`: TransportType
  def create(): ITransport
}

object ITransportFactory {
  @scala.inline
  def apply(create: CallbackTo[ITransport], `type`: TransportType): ITransportFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportFactory]
  }
}

