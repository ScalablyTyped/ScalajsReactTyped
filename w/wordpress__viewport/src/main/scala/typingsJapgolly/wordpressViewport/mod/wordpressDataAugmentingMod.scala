package typingsJapgolly.wordpressViewport.mod

import typingsJapgolly.wordpressViewport.TypeofimportedActions
import typingsJapgolly.wordpressViewport.TypeofimportedSelectors
import typingsJapgolly.wordpressViewport.wordpressViewportStrings.coreSlashviewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@wordpress/data", JSImport.Namespace)
@js.native
object wordpressDataAugmentingMod extends js.Object {
  @JSName("dispatch")
  def dispatch_coreviewport(key: coreSlashviewport): TypeofimportedActions = js.native
  @JSName("select")
  def select_coreviewport(key: coreSlashviewport): TypeofimportedSelectors = js.native
}

