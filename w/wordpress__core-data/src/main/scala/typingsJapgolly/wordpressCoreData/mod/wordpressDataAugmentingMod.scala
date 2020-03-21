package typingsJapgolly.wordpressCoreData.mod

import typingsJapgolly.wordpressCoreData.TypeofimportedActions
import typingsJapgolly.wordpressCoreData.TypeofimportedSelectors
import typingsJapgolly.wordpressCoreData.wordpressCoreDataStrings.core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_core(key: core): TypeofimportedActions = js.native
  @JSName("select")
  def select_core(key: core): TypeofimportedSelectors = js.native
}

