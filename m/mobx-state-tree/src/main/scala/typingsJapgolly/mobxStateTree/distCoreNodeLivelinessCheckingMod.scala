package typingsJapgolly.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreNodeLivelinessCheckingMod {
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLivelinessChecking(): LivelinessMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLivelinessChecking")().asInstanceOf[LivelinessMode]
  
  inline def setLivelinessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelinessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLivelynessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelynessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mobxStateTree.mobxStateTreeStrings.warn
    - typingsJapgolly.mobxStateTree.mobxStateTreeStrings.error
    - typingsJapgolly.mobxStateTree.mobxStateTreeStrings.ignore
  */
  trait LivelinessMode extends StObject
  object LivelinessMode {
    
    inline def error: typingsJapgolly.mobxStateTree.mobxStateTreeStrings.error = "error".asInstanceOf[typingsJapgolly.mobxStateTree.mobxStateTreeStrings.error]
    
    inline def ignore: typingsJapgolly.mobxStateTree.mobxStateTreeStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.mobxStateTree.mobxStateTreeStrings.ignore]
    
    inline def warn: typingsJapgolly.mobxStateTree.mobxStateTreeStrings.warn = "warn".asInstanceOf[typingsJapgolly.mobxStateTree.mobxStateTreeStrings.warn]
  }
  
  type LivelynessMode = LivelinessMode
}
