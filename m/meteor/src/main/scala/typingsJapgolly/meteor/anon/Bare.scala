package typingsJapgolly.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bare extends StObject {
  
  var bare: js.UndefOr[Boolean] = js.undefined
}
object Bare {
  
  inline def apply(): Bare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bare]
  }
  
  extension [Self <: Bare](x: Self) {
    
    inline def setBare(value: Boolean): Self = StObject.set(x, "bare", value.asInstanceOf[js.Any])
    
    inline def setBareUndefined: Self = StObject.set(x, "bare", js.undefined)
  }
}
