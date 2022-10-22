package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowSizeChanger extends StObject {
  
  var showSizeChanger: js.UndefOr[Boolean] = js.undefined
}
object ShowSizeChanger {
  
  inline def apply(): ShowSizeChanger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowSizeChanger]
  }
  
  extension [Self <: ShowSizeChanger](x: Self) {
    
    inline def setShowSizeChanger(value: Boolean): Self = StObject.set(x, "showSizeChanger", value.asInstanceOf[js.Any])
    
    inline def setShowSizeChangerUndefined: Self = StObject.set(x, "showSizeChanger", js.undefined)
  }
}
