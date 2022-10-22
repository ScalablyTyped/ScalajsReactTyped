package typingsJapgolly.azureMsalBrowser

import typingsJapgolly.azureMsalBrowser.distCryptoBrowserCryptoMod.BrowserCrypto
import typingsJapgolly.azureMsalCommon.distCryptoIguidgeneratorMod.IGuidGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoGuidGeneratorMod {
  
  @JSImport("@azure/msal-browser/dist/crypto/GuidGenerator", "GuidGenerator")
  @js.native
  open class GuidGenerator protected ()
    extends StObject
       with IGuidGenerator {
    def this(cryptoObj: BrowserCrypto) = this()
    
    /* private */ var cryptoObj: Any = js.native
    
    /* CompleteClass */
    override def generateGuid(): String = js.native
    
    /* CompleteClass */
    override def isGuid(guid: String): Boolean = js.native
  }
}
