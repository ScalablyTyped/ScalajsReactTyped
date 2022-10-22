package typingsJapgolly.passportSamlMetadata

import typingsJapgolly.passportSaml.mod.SamlConfig
import typingsJapgolly.passportSamlMetadata.anon.MultipleCerts
import typingsJapgolly.passportSamlMetadata.anon.PartialMetadataConstructo
import typingsJapgolly.passportSamlMetadata.srcFetchMod.FetchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-saml-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("passport-saml-metadata", "MetadataReader")
  @js.native
  open class MetadataReader protected ()
    extends typingsJapgolly.passportSamlMetadata.srcMod.MetadataReader {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
  }
  
  inline def claimsToCamelCase(claims: Any, claimSchema: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("claimsToCamelCase")(claims.asInstanceOf[js.Any], claimSchema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def fetch(config: FetchConfig): js.Promise[typingsJapgolly.passportSamlMetadata.srcReaderMod.MetadataReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.passportSamlMetadata.srcReaderMod.MetadataReader]]
  
  inline def metadata(config: SamlConfig): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def toPassportConfig(): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")().asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: Unit, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: typingsJapgolly.passportSamlMetadata.srcReaderMod.MetadataReader): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any]).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: typingsJapgolly.passportSamlMetadata.srcReaderMod.MetadataReader, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
}
