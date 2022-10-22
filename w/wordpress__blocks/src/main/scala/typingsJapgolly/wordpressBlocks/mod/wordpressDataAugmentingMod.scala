package typingsJapgolly.wordpressBlocks.mod

import typingsJapgolly.wordpressBlocks.anon.TypeofimportedActions
import typingsJapgolly.wordpressBlocks.anon.TypeofimportedSelectors
import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.coreSlashblocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object wordpressDataAugmentingMod {
  
  @JSImport("@wordpress/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch_coreblocks(key: coreSlashblocks): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
  
  inline def select_coreblocks(key: coreSlashblocks): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
}
