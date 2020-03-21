package typingsJapgolly.fastCsv

import typingsJapgolly.fastCsv.headerTransformerMod.default
import typingsJapgolly.fastCsv.parserOptionsMod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-csv/build/src/parser/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  @js.native
  class HeaderTransformer protected () extends default {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @js.native
  class RowTransformerValidator ()
    extends typingsJapgolly.fastCsv.rowTransformerValidatorMod.default
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
}

