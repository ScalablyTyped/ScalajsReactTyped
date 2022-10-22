package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.HTMLElement, 'dir'> */
trait PickHTMLElementdir extends StObject {
  
  var dir: String
}
object PickHTMLElementdir {
  
  inline def apply(dir: String): PickHTMLElementdir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickHTMLElementdir]
  }
  
  extension [Self <: PickHTMLElementdir](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
  }
}
