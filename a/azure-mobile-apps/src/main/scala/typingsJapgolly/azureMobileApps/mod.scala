package typingsJapgolly.azureMobileApps

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.azureMobileApps.Azure.MobileApps.ApiDefinition
import typingsJapgolly.azureMobileApps.Azure.MobileApps.Configuration
import typingsJapgolly.azureMobileApps.Azure.MobileApps.Logger
import typingsJapgolly.azureMobileApps.Azure.MobileApps.Platforms.Express.MobileApp
import typingsJapgolly.azureMobileApps.Azure.MobileApps.Platforms.Express.Table
import typingsJapgolly.azureMobileApps.Azure.MobileApps.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("azure-mobile-apps", JSImport.Namespace)
  @js.native
  val ^ : AzureMobileApps = js.native
  
  @js.native
  trait AzureMobileApps extends StObject {
    
    def apply(): MobileApp = js.native
    def apply(configuration: Configuration): MobileApp = js.native
    
    def api(): ApiDefinition = js.native
    def api(definition: ApiDefinition): ApiDefinition = js.native
    
    var logger: Logger = js.native
    
    var query: Query = js.native
    
    def table(): Table = js.native
  }
  
  type _To = AzureMobileApps
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AzureMobileApps = ^
}
