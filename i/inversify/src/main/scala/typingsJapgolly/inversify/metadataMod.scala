package typingsJapgolly.inversify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/metadata", JSImport.Namespace)
@js.native
object metadataMod extends js.Object {
  @js.native
  class Metadata protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Metadata {
    def this(key: String, value: js.Any) = this()
    def this(key: js.Symbol, value: js.Any) = this()
    def this(key: Double, value: js.Any) = this()
    /* CompleteClass */
    override var key: String | Double | js.Symbol = js.native
    /* CompleteClass */
    override var value: js.Any = js.native
  }
  
}

