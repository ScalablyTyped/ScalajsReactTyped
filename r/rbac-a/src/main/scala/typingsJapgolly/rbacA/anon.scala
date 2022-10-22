package typingsJapgolly.rbacA

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.rbacA.mod.AttributesManager
import typingsJapgolly.rbacA.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes[P /* <: Provider */, AM /* <: AttributesManager */] extends StObject {
    
    var attributes: js.UndefOr[AM] = js.undefined
    
    var provider: P
  }
  object Attributes {
    
    inline def apply[P /* <: Provider */, AM /* <: AttributesManager */](provider: P): Attributes[P, AM] = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes[P, AM]]
    }
    
    extension [Self <: Attributes[?, ?], P /* <: Provider */, AM /* <: AttributesManager */](x: Self & (Attributes[P, AM])) {
      
      inline def setAttributes(value: AM): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setProvider(value: P): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* roles */ js.Object, Provider]
}
