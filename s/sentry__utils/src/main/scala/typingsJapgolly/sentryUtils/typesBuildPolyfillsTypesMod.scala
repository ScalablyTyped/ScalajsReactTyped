package typingsJapgolly.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sentryTypes.typesMiscMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBuildPolyfillsTypesMod {
  
  @js.native
  trait GenericFunction
    extends StObject
       with _Value {
    
    def apply(args: Any*): Value = js.native
  }
  
  trait GenericObject
    extends StObject
       with /* key */ StringDictionary[Value]
       with _Value
  object GenericObject {
    
    inline def apply(): GenericObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericObject]
    }
  }
  
  type RequireResult = GenericObject | (GenericFunction & GenericObject)
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.typesMiscMod.Primitive
    - typingsJapgolly.sentryUtils.typesBuildPolyfillsTypesMod.GenericFunction
    - typingsJapgolly.sentryUtils.typesBuildPolyfillsTypesMod.GenericObject
  */
  type Value = _Value | Primitive
  
  trait _Value extends StObject
}
