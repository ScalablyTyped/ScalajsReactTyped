package typingsJapgolly.tslint

import typingsJapgolly.tslint.abstractFormatterMod.AbstractFormatter
import typingsJapgolly.tslint.formatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/checkstyleFormatter", JSImport.Namespace)
@js.native
object checkstyleFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter {
    var escapeXml: js.Any = js.native
    var formatFailure: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

