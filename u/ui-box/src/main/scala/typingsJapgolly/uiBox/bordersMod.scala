package typingsJapgolly.uiBox

import typingsJapgolly.uiBox.typesEnhancersMod.PropEnhancers
import typingsJapgolly.uiBox.typesEnhancersMod.PropTypesMapping
import typingsJapgolly.uiBox.typesEnhancersMod.PropValidators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box/dist/enhancers/borders", JSImport.Namespace)
@js.native
object bordersMod extends js.Object {
  val propEnhancers: PropEnhancers = js.native
  val propTypes: PropTypesMapping = js.native
  val propValidators: PropValidators = js.native
  @js.native
  object propAliases extends js.Object {
    var border: js.Array[String] = js.native
    var borderColor: js.Array[String] = js.native
    var borderStyle: js.Array[String] = js.native
    var borderWidth: js.Array[String] = js.native
  }
  
}

