package typingsJapgolly.clownface.mod

import typingsJapgolly.clownface.AnonToString
import typingsJapgolly.clownface.clownfaceStrings.BlankNode
import typingsJapgolly.clownface.clownfaceStrings.Literal
import typingsJapgolly.clownface.clownfaceStrings.NamedNode
import typingsJapgolly.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions extends js.Object {
  var datatype: js.UndefOr[Term | AnonToString] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[BlankNode | Literal | NamedNode] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply(
    datatype: Term | AnonToString = null,
    language: String = null,
    `type`: BlankNode | Literal | NamedNode = null
  ): NodeOptions = {
    val __obj = js.Dynamic.literal()
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
}

