package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.coreGameObjectMod.GameObject
import typingsJapgolly.blackEngine.messagesMessageDispatcherMod.MessageDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreComponentMod {
  
  @JSImport("black-engine/core/Component", "Component")
  @js.native
  open class Component () extends MessageDispatcher {
    
    var enabled: Boolean = js.native
    
    def gameObject: GameObject = js.native
    
    /* private */ var mAdded: Any = js.native
    
    /* private */ var mGameObject: Any = js.native
    
    /* private */ var mId: Any = js.native
    
    /* protected */ def onAdded(gameObject: GameObject): Unit = js.native
    
    /* protected */ def onRemoved(gameObject: GameObject): Unit = js.native
    
    /* protected */ def onRender(): Unit = js.native
    
    /* protected */ def onUpdate(): Unit = js.native
    
    def removeFromParent(): Unit = js.native
  }
}
