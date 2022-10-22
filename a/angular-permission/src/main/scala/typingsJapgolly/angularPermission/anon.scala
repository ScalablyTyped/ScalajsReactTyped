package typingsJapgolly.angularPermission

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angularPermission.angularMod.permission.PermissionRedirectConfigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Except extends StObject {
    
    var except: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[Any]] = js.undefined
    
    var only: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[Any]] = js.undefined
    
    var redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
  }
  object Except {
    
    inline def apply(
      redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
    ): Except = {
      val __obj = js.Dynamic.literal(redirectTo = redirectTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Except]
    }
    
    extension [Self <: Except](x: Self) {
      
      inline def setExcept(value: js.Function0[Unit] | String | js.Array[String] | IPromise[Any]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      inline def setExceptCallback(value: Callback): Self = StObject.set(x, "except", value.toJsFn)
      
      inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      inline def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value*))
      
      inline def setOnly(value: js.Function0[Unit] | String | js.Array[String] | IPromise[Any]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
      
      inline def setOnlyCallback(value: Callback): Self = StObject.set(x, "only", value.toJsFn)
      
      inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      inline def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value*))
      
      inline def setRedirectTo(
        value: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
      ): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToCallbackTo(value: CallbackTo[PermissionRedirectConfigation | String]): Self = StObject.set(x, "redirectTo", value.toJsFn)
    }
  }
}
