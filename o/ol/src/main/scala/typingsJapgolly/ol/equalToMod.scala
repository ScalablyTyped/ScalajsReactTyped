package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter/EqualTo", JSImport.Namespace)
@js.native
object equalToMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsJapgolly.ol.comparisonBinaryMod.default {
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  type EqualTo = typingsJapgolly.ol.comparisonBinaryMod.default
}

