package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libInterfaceMod.ActionCallback
import typingsJapgolly.antvG2.libInterfaceMod.IInteractionContext
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionCallbackMod {
  
  @JSImport("@antv/g2/lib/interaction/action/callback", JSImport.Default)
  @js.native
  open class default () extends CallbackAction
  
  @js.native
  trait CallbackAction
    extends typingsJapgolly.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 回调函数
      */
    def callback(context: IInteractionContext): Unit = js.native
    /**
      * 回调函数
      */
    @JSName("callback")
    var callback_Original: ActionCallback = js.native
    
    /**
      * 执行
      */
    def execute(): Unit = js.native
  }
}
