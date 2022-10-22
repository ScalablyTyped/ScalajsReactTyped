package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveKey extends StObject {
  
  var activeKey: typingsJapgolly.react.mod.Key
}
object ActiveKey {
  
  inline def apply(activeKey: typingsJapgolly.react.mod.Key): ActiveKey = {
    val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveKey]
  }
  
  extension [Self <: ActiveKey](x: Self) {
    
    inline def setActiveKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
  }
}
