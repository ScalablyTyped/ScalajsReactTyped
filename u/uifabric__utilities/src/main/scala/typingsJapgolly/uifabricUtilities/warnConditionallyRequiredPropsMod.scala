package typingsJapgolly.uifabricUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/warn/warnConditionallyRequiredProps", JSImport.Namespace)
@js.native
object warnConditionallyRequiredPropsMod extends js.Object {
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = js.native
}

