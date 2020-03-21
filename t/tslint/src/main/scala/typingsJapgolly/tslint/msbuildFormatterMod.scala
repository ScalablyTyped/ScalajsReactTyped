package typingsJapgolly.tslint

import typingsJapgolly.tslint.abstractFormatterMod.AbstractFormatter
import typingsJapgolly.tslint.formatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/msbuildFormatter", JSImport.Namespace)
@js.native
object msbuildFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

