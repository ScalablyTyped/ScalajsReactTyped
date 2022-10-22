package typingsJapgolly.jose

import typingsJapgolly.jose.distTypesTypesMod.JWSHeaderParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilDecodeProtectedHeaderMod {
  
  @JSImport("jose/dist/types/util/decode_protected_header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeProtectedHeader(token: String): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  inline def decodeProtectedHeader(token: js.Object): ProtectedHeaderParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeProtectedHeader")(token.asInstanceOf[js.Any]).asInstanceOf[ProtectedHeaderParameters]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited
  - typingsJapgolly.jose.distTypesTypesMod.JoseHeaderParameters because Already inherited
  - typingsJapgolly.jose.distTypesTypesMod.JWEHeaderParameters because var conflicts: alg, crit, cty, jku, jwk, kid, typ, x5c, x5t, x5u. Inlined enc, zip */ trait ProtectedHeaderParameters
    extends StObject
       with JWSHeaderParameters {
    
    /** JWE "enc" (Encryption Algorithm) Header Parameter. */
    var enc: js.UndefOr[String] = js.undefined
    
    /** JWE "zip" (Compression Algorithm) Header Parameter. */
    var zip: js.UndefOr[String] = js.undefined
  }
  object ProtectedHeaderParameters {
    
    inline def apply(): ProtectedHeaderParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProtectedHeaderParameters]
    }
    
    extension [Self <: ProtectedHeaderParameters](x: Self) {
      
      inline def setEnc(value: String): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
  }
}
