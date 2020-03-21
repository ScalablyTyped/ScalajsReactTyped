package typingsJapgolly.humanparser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanparserStatic extends js.Object {
  def getFullestName(name: String): FullerNameOutput
  def parseAddress(address: String): AddressOutput
  def parseName(name: String): NameOutput
}

object HumanparserStatic {
  @scala.inline
  def apply(
    getFullestName: String => CallbackTo[FullerNameOutput],
    parseAddress: String => CallbackTo[AddressOutput],
    parseName: String => CallbackTo[NameOutput]
  ): HumanparserStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFullestName")(js.Any.fromFunction1((t0: java.lang.String) => getFullestName(t0).runNow()))
    __obj.updateDynamic("parseAddress")(js.Any.fromFunction1((t0: java.lang.String) => parseAddress(t0).runNow()))
    __obj.updateDynamic("parseName")(js.Any.fromFunction1((t0: java.lang.String) => parseName(t0).runNow()))
    __obj.asInstanceOf[HumanparserStatic]
  }
}

