package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resources {
  
  @JSImport("azdata", "resources")
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerResourceProvider(providerMetadata: ResourceProviderMetadata, provider: ResourceProvider): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceProvider")(providerMetadata.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[Disposable]
}
