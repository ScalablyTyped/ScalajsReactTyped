package typingsJapgolly.tslint

import typingsJapgolly.tslint.abstractFormatterMod.AbstractFormatter
import typingsJapgolly.tslint.formatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/verboseFormatter", JSImport.Namespace)
@js.native
object verboseFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter {
    var mapToMessages: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

