package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginStyle extends StObject {
  
  /**
    * This Boolean value controls whether to display sheet margins.
    */
  var Show: js.UndefOr[scala.Boolean] = js.undefined
}
object MarginStyle {
  
  inline def apply(): MarginStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginStyle]
  }
  
  extension [Self <: MarginStyle](x: Self) {
    
    inline def setShow(value: scala.Boolean): Self = StObject.set(x, "Show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "Show", js.undefined)
  }
}
