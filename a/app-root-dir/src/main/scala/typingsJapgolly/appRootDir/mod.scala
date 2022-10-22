package typingsJapgolly.appRootDir

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("app-root-dir", JSImport.Namespace)
  @js.native
  val ^ : AppRootDir = js.native
  
  trait AppRootDir extends StObject {
    
    // Get the application's root directory
    def get(): String
    
    /**
      * Set the application's root directory
      *    this will set a global so that no matter
      *    how many instances of app-root-dir module are installed,
      *    they will all return the same directory
      */
    def set(dirname: String): Unit
  }
  object AppRootDir {
    
    inline def apply(get: CallbackTo[String], set: String => Callback): AppRootDir = {
      val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()))
      __obj.asInstanceOf[AppRootDir]
    }
    
    extension [Self <: AppRootDir](x: Self) {
      
      inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type _To = AppRootDir
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AppRootDir = ^
}
