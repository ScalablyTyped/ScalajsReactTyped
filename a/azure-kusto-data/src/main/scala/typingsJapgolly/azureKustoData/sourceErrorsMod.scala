package typingsJapgolly.azureKustoData

import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceErrorsMod {
  
  @JSImport("azure-kusto-data/source/errors", "KustoAuthenticationError")
  @js.native
  open class KustoAuthenticationError protected ()
    extends StObject
       with Error {
    def this(message: String, inner: js.Error, tokenProviderName: String, context: Record[String, Any]) = this()
    def this(message: String, inner: Unit, tokenProviderName: String, context: Record[String, Any]) = this()
    
    var context: Record[String, Any] = js.native
    
    var inner: js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var tokenProviderName: String = js.native
  }
  
  @JSImport("azure-kusto-data/source/errors", "ThrottlingError")
  @js.native
  open class ThrottlingError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, inner: js.Error) = this()
    
    var inner: js.UndefOr[js.Error] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}
