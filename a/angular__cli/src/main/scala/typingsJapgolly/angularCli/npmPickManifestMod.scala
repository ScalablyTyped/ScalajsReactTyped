package typingsJapgolly.angularCli

import typingsJapgolly.angularCli.srcUtilitiesPackageMetadataMod.PackageManifest
import typingsJapgolly.angularCli.srcUtilitiesPackageMetadataMod.PackageMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmPickManifestMod {
  
  inline def apply(metadata: PackageMetadata, selector: String): PackageManifest = (^.asInstanceOf[js.Dynamic].apply(metadata.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[PackageManifest]
  
  @JSImport("npm-pick-manifest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
