package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.keyInfoClauseMod.KeyInfoClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/xml/key_infos/key_value", JSImport.Namespace)
@js.native
object keyValueMod extends js.Object {
  @js.native
  class KeyValue () extends KeyInfoClause {
    def this(value: KeyInfoClause) = this()
    var value: KeyInfoClause = js.native
    def Value(): KeyInfoClause = js.native
    def Value(v: KeyInfoClause): js.Any = js.native
  }
  
}

