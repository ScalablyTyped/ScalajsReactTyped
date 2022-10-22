package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOptions extends StObject {
  
  /* standard dom */
  var preventScroll: js.UndefOr[scala.Boolean] = js.undefined
}
object FocusOptions {
  
  inline def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  extension [Self <: FocusOptions](x: Self) {
    
    inline def setPreventScroll(value: scala.Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
