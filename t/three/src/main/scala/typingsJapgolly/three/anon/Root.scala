package typingsJapgolly.three.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var root: HTMLElement
}
object Root {
  
  inline def apply(root: HTMLElement): Root = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setRoot(value: HTMLElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
