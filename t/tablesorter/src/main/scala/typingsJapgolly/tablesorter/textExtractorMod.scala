package typingsJapgolly.tablesorter

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Parsing/TextExtractor", JSImport.Namespace)
@js.native
object textExtractorMod extends js.Object {
  type TextExtractor[TElement] = js.Function3[/* cell */ Element, /* table */ TElement, /* index */ Double, String]
}

