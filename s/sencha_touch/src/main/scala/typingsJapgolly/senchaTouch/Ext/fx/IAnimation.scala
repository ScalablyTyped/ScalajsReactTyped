package typingsJapgolly.senchaTouch.Ext.fx

import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimation
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}
object IAnimation {
  
  inline def apply(): IAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimation]
  }
  
  extension [Self <: IAnimation](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
