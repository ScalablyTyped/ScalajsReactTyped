package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distCordovaSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  def open(url: String, target: String, options: String): InAppBrowserRef
}
object Open {
  
  inline def apply(open: (String, String, String) => InAppBrowserRef): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction3(open))
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: (String, String, String) => InAppBrowserRef): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
  }
}
