package typingsJapgolly.rdfjsParserN3.mod

import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var baseIRI: js.UndefOr[String] = js.undefined
  var factory: js.UndefOr[DataFactory[Quad]] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(baseIRI: String = null, factory: DataFactory[Quad] = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseIRI != null) __obj.updateDynamic("baseIRI")(baseIRI.asInstanceOf[js.Any])
    if (factory != null) __obj.updateDynamic("factory")(factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

