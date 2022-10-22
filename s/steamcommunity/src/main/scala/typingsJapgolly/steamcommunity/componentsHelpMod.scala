package typingsJapgolly.steamcommunity

import typingsJapgolly.steamcommunity.mod.Callback
import typingsJapgolly.steamcommunity.mod.packageid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHelpMod {
  
  trait Help extends StObject {
    
    /**
      * Removes a license from your account. The help site claims this is "permanent", but it can be undone via a call to restorePackage.
      * @param packageID
      * @param callback
      */
    def removePackage(packageID: packageid, callback: Callback): Unit
    
    /**
      * Restore a previously removed steam package from your steam account.
      * @param packageID
      * @param callback
      */
    def restorePackage(packageID: packageid, callback: Callback): Unit
  }
  object Help {
    
    inline def apply(
      removePackage: (packageid, Callback) => japgolly.scalajs.react.Callback,
      restorePackage: (packageid, Callback) => japgolly.scalajs.react.Callback
    ): Help = {
      val __obj = js.Dynamic.literal(removePackage = js.Any.fromFunction2((t0: packageid, t1: Callback) => (removePackage(t0, t1)).runNow()), restorePackage = js.Any.fromFunction2((t0: packageid, t1: Callback) => (restorePackage(t0, t1)).runNow()))
      __obj.asInstanceOf[Help]
    }
    
    extension [Self <: Help](x: Self) {
      
      inline def setRemovePackage(value: (packageid, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "removePackage", js.Any.fromFunction2((t0: packageid, t1: Callback) => (value(t0, t1)).runNow()))
      
      inline def setRestorePackage(value: (packageid, Callback) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "restorePackage", js.Any.fromFunction2((t0: packageid, t1: Callback) => (value(t0, t1)).runNow()))
    }
  }
}
