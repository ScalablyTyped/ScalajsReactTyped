package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distEsm2017SrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def open(url: String, target: String, options: String): InAppBrowserRef
}
object `6` {
  
  inline def apply(open: (String, String, String) => InAppBrowserRef): `6` = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction3(open))
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setOpen(value: (String, String, String) => InAppBrowserRef): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
  }
}
