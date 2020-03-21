package typingsJapgolly.uifabricMergeStyles.stylesheetMod

import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`0`
  - typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`1`
  - typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesNumbers.`2`
*/
trait InjectionMode extends js.Object

@JSImport("@uifabric/merge-styles/lib/Stylesheet", "InjectionMode")
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

