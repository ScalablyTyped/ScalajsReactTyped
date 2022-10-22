package typingsJapgolly.azureKustoData

import typingsJapgolly.azureKustoData.sourceTokenProviderMod.TokenProviderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSecurityMod {
  
  @JSImport("azure-kusto-data/source/security", JSImport.Default)
  @js.native
  open class default protected () extends AadHelper {
    def this(kcsb: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default) = this()
  }
  
  @JSImport("azure-kusto-data/source/security", "AadHelper")
  @js.native
  open class AadHelper protected () extends StObject {
    def this(kcsb: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default) = this()
    
    def getAuthHeader(): js.Promise[String | Null] = js.native
    
    var tokenProvider: js.UndefOr[TokenProviderBase] = js.native
  }
}
