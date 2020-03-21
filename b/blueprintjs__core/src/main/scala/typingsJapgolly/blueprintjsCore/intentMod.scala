package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.danger
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.primary
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.success
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/intent", JSImport.Namespace)
@js.native
object intentMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.none
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.primary
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.danger
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.warning
    - typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.success
  */
  trait Intent extends js.Object
  
  @js.native
  object Intent extends js.Object {
    var DANGER: danger = js.native
    var NONE: none = js.native
    var PRIMARY: primary = js.native
    var SUCCESS: success = js.native
    var WARNING: warning = js.native
  }
  
}

