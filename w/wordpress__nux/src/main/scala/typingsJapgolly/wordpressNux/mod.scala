package typingsJapgolly.wordpressNux

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressNux.anon.TypeofimportedActions
import typingsJapgolly.wordpressNux.anon.TypeofimportedSelectors
import typingsJapgolly.wordpressNux.componentsDotTipMod.DotTip.Props
import typingsJapgolly.wordpressNux.wordpressNuxStrings.coreSlashnux
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/nux", "DotTip")
  @js.native
  val DotTip: ComponentType[Props] = js.native
  
  /* augmented module */
  object wordpressDataAugmentingMod {
    
    @JSImport("@wordpress/data", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def dispatch_corenux(key: coreSlashnux): TypeofimportedActions = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedActions]
    
    inline def select_corenux(key: coreSlashnux): TypeofimportedSelectors = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(key.asInstanceOf[js.Any]).asInstanceOf[TypeofimportedSelectors]
  }
}
