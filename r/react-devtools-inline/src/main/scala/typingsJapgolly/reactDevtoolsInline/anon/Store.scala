package typingsJapgolly.reactDevtoolsInline.anon

import typingsJapgolly.reactDevtoolsInline.commonsMod.FrontendBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  var bridge: js.UndefOr[FrontendBridge] = js.undefined
  
  var store: js.UndefOr[typingsJapgolly.reactDevtoolsInline.commonsMod.Store] = js.undefined
}
object Store {
  
  inline def apply(): Store = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setBridge(value: FrontendBridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setStore(value: typingsJapgolly.reactDevtoolsInline.commonsMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
