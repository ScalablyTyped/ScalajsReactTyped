package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var closeSource: js.UndefOr[typingsJapgolly.baseui.modalTypesMod.CloseSource] = js.undefined
}
object `15` {
  
  inline def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`15`]
  }
  
  extension [Self <: `15`](x: Self) {
    
    inline def setCloseSource(value: typingsJapgolly.baseui.modalTypesMod.CloseSource): Self = StObject.set(x, "closeSource", value.asInstanceOf[js.Any])
    
    inline def setCloseSourceUndefined: Self = StObject.set(x, "closeSource", js.undefined)
  }
}
