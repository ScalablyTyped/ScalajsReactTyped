package typingsJapgolly.antvG2plot

import typingsJapgolly.antvG2.libInterfaceMod.IInteractionContext
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.mod.InteractionAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLineInteractionsMarkerActiveMod {
  
  @JSImport("@antv/g2plot/lib/plots/line/interactions/marker-active", "MarkerActiveAction")
  @js.native
  open class MarkerActiveAction protected () extends InteractionAction[LooseObject] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: LooseObject) = this()
    
    def active(): Unit = js.native
    
    /* private */ var getView: Any = js.native
    
    def reset(): Unit = js.native
  }
}
