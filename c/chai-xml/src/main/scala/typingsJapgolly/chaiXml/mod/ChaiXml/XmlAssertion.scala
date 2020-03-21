package typingsJapgolly.chaiXml.mod.ChaiXml

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chaiXml.mod._Global_.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAssertion extends Assertion {
  var and: XmlAssertion
  var at: XmlAssertion
  var be: XmlAssertion
  var been: XmlAssertion
  var has: XmlAssertion
  var have: XmlAssertion
  var is: XmlAssertion
  var not: XmlAssertion
  var of: XmlAssertion
  var same: XmlAssertion
  var that: XmlAssertion
  var to: XmlAssertion
  var which: XmlAssertion
  var `with`: XmlAssertion
  def valid(): XmlAssertion
}

object XmlAssertion {
  @scala.inline
  def apply(
    and: XmlAssertion,
    at: XmlAssertion,
    be: XmlAssertion,
    been: XmlAssertion,
    has: XmlAssertion,
    have: XmlAssertion,
    is: XmlAssertion,
    not: XmlAssertion,
    of: XmlAssertion,
    same: XmlAssertion,
    that: XmlAssertion,
    to: XmlAssertion,
    valid: CallbackTo[XmlAssertion],
    which: XmlAssertion,
    `with`: XmlAssertion,
    xml: XmlAssertion
  ): XmlAssertion = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("valid")(valid.toJsFn)
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAssertion]
  }
}

