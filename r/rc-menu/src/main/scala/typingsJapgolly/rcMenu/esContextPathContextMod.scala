package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextPathContextMod {
  
  @JSImport("rc-menu/es/context/PathContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathRegisterContext")
  @js.native
  val PathRegisterContext: Context[PathRegisterContextProps] = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathTrackerContext")
  @js.native
  val PathTrackerContext: Context[js.Array[String]] = js.native
  
  @JSImport("rc-menu/es/context/PathContext", "PathUserContext")
  @js.native
  val PathUserContext: Context[PathUserContextProps] = js.native
  
  inline def useFullPath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")().asInstanceOf[js.Array[String]]
  inline def useFullPath(eventKey: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFullPath")(eventKey.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def useMeasure(): PathRegisterContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useMeasure")().asInstanceOf[PathRegisterContextProps]
  
  trait PathRegisterContextProps extends StObject {
    
    def registerPath(key: String, keyPath: js.Array[String]): Unit
    
    def unregisterPath(key: String, keyPath: js.Array[String]): Unit
  }
  object PathRegisterContextProps {
    
    inline def apply(
      registerPath: (String, js.Array[String]) => Callback,
      unregisterPath: (String, js.Array[String]) => Callback
    ): PathRegisterContextProps = {
      val __obj = js.Dynamic.literal(registerPath = js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (registerPath(t0, t1)).runNow()), unregisterPath = js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (unregisterPath(t0, t1)).runNow()))
      __obj.asInstanceOf[PathRegisterContextProps]
    }
    
    extension [Self <: PathRegisterContextProps](x: Self) {
      
      inline def setRegisterPath(value: (String, js.Array[String]) => Callback): Self = StObject.set(x, "registerPath", js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (value(t0, t1)).runNow()))
      
      inline def setUnregisterPath(value: (String, js.Array[String]) => Callback): Self = StObject.set(x, "unregisterPath", js.Any.fromFunction2((t0: String, t1: js.Array[String]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait PathUserContextProps extends StObject {
    
    def isSubPathKey(pathKeys: js.Array[String], eventKey: String): Boolean
  }
  object PathUserContextProps {
    
    inline def apply(isSubPathKey: (js.Array[String], String) => Boolean): PathUserContextProps = {
      val __obj = js.Dynamic.literal(isSubPathKey = js.Any.fromFunction2(isSubPathKey))
      __obj.asInstanceOf[PathUserContextProps]
    }
    
    extension [Self <: PathUserContextProps](x: Self) {
      
      inline def setIsSubPathKey(value: (js.Array[String], String) => Boolean): Self = StObject.set(x, "isSubPathKey", js.Any.fromFunction2(value))
    }
  }
}
