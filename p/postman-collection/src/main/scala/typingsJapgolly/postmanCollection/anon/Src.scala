package typingsJapgolly.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Src extends StObject {
  
  var src: js.UndefOr[String] = js.undefined
}
object Src {
  
  inline def apply(): Src = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Src]
  }
  
  extension [Self <: Src](x: Self) {
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
