package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`0`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react", "InjectionMode")
@js.native
object InjectionMode extends js.Object {
  /**
    * Appends rules using appendChild.
    */
  var appendChild: `2` = js.native
  /**
    * Inserts rules using the insertRule api.
    */
  var insertNode: `1` = js.native
  /**
    * Avoids style injection, use getRules() to read the styles.
    */
  var none: `0` = js.native
}

