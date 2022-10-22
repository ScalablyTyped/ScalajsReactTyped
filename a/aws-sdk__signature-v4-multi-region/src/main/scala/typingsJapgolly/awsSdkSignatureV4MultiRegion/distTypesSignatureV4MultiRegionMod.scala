package typingsJapgolly.awsSdkSignatureV4MultiRegion

import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4Init
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesSignatureMod.RequestPresigner
import typingsJapgolly.awsSdkTypes.distTypesSignatureMod.RequestSigner
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSignatureV4MultiRegionMod {
  
  @JSImport("@aws-sdk/signature-v4-multi-region/dist-types/SignatureV4MultiRegion", "SignatureV4MultiRegion")
  @js.native
  open class SignatureV4MultiRegion protected ()
    extends StObject
       with RequestPresigner
       with RequestSigner {
    def this(options: SignatureV4MultiRegionInit) = this()
    
    /* private */ var getSigv4aSigner: Any = js.native
    
    /* private */ val signerOptions: Any = js.native
    
    /* private */ val sigv4Signer: Any = js.native
    
    /* private */ var sigv4aSigner: Any = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit because var conflicts: sha256. Inlined  */ trait SignatureV4MultiRegionInit
    extends StObject
       with SignatureV4Init {
    
    var runtime: js.UndefOr[String] = js.undefined
  }
  object SignatureV4MultiRegionInit {
    
    inline def apply(
      credentials: Credentials | Provider[Credentials],
      region: String | Provider[String],
      service: String
    ): SignatureV4MultiRegionInit = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignatureV4MultiRegionInit]
    }
    
    extension [Self <: SignatureV4MultiRegionInit](x: Self) {
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
}
