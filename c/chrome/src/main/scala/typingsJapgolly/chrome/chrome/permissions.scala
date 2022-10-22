package typingsJapgolly.chrome.chrome

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Permissions
////////////////////
/**
  * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
  * @since Chrome 16.
  */
object permissions {
  
  trait Permissions extends StObject {
    
    /**
      * Optional.
      * List of origin permissions. Anything listed here must be a subset of a host that appears in the optional_permissions list in the manifest. For example, if http:// *.example.com/ or http:// * appears in optional_permissions, you can request an origin of http://help.example.com/. Any path is ignored.
      */
    var origins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional.
      * List of named permissions (does not include hosts or origins). Anything listed here must appear in the optional_permissions list in the manifest.
      */
    var permissions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Permissions {
    
    inline def apply(): Permissions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Permissions]
    }
    
    extension [Self <: Permissions](x: Self) {
      
      inline def setOrigins(value: js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
      
      inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    }
  }
  
  trait PermissionsAddedEvent extends StObject {
    
    /**
      * @param callback The callback parameter should be a function that looks like this:
      * function( Permissions permissions) {...};
      * Parameter permissions: The newly acquired permissions.
      */
    def addListener(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit
  }
  object PermissionsAddedEvent {
    
    inline def apply(addListener: js.Function1[/* permissions */ Permissions, Unit] => Callback): PermissionsAddedEvent = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: js.Function1[/* permissions */ Permissions, Unit]) => addListener(t0).runNow()))
      __obj.asInstanceOf[PermissionsAddedEvent]
    }
    
    extension [Self <: PermissionsAddedEvent](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* permissions */ Permissions, Unit] => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: js.Function1[/* permissions */ Permissions, Unit]) => value(t0).runNow()))
    }
  }
  
  trait PermissionsRemovedEvent extends StObject {
    
    /**
      * @param callback The callback parameter should be a function that looks like this:
      * function( Permissions permissions) {...};
      * Parameter permissions: The permissions that have been removed.
      */
    def addListener(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit
  }
  object PermissionsRemovedEvent {
    
    inline def apply(addListener: js.Function1[/* permissions */ Permissions, Unit] => Callback): PermissionsRemovedEvent = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: js.Function1[/* permissions */ Permissions, Unit]) => addListener(t0).runNow()))
      __obj.asInstanceOf[PermissionsRemovedEvent]
    }
    
    extension [Self <: PermissionsRemovedEvent](x: Self) {
      
      inline def setAddListener(value: js.Function1[/* permissions */ Permissions, Unit] => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: js.Function1[/* permissions */ Permissions, Unit]) => value(t0).runNow()))
    }
  }
}
