package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distCommonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationCanvasMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/canvas", "Canvas")
  @js.native
  open class Canvas protected () extends StObject {
    /** @hidden */
    def this(user: GoogleActionsV2Input) = this()
    
    /**
      * Gets the canvas state
      *
      * Accessible using `conv.canvas.state`
      * @public
      */
    var state: js.UndefOr[JsonObject] = js.native
  }
}
