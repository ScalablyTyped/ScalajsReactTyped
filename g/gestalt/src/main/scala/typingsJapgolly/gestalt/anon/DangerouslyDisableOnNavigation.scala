package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerouslyDisableOnNavigation extends StObject {
  
  var dangerouslyDisableOnNavigation: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DangerouslyDisableOnNavigation {
  
  inline def apply(): DangerouslyDisableOnNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DangerouslyDisableOnNavigation]
  }
  
  extension [Self <: DangerouslyDisableOnNavigation](x: Self) {
    
    inline def setDangerouslyDisableOnNavigation(value: Callback): Self = StObject.set(x, "dangerouslyDisableOnNavigation", value.toJsFn)
    
    inline def setDangerouslyDisableOnNavigationUndefined: Self = StObject.set(x, "dangerouslyDisableOnNavigation", js.undefined)
  }
}
