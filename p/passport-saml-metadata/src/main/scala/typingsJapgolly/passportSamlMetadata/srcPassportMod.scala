package typingsJapgolly.passportSamlMetadata

import typingsJapgolly.passportSaml.mod.SamlConfig
import typingsJapgolly.passportSamlMetadata.anon.MultipleCerts
import typingsJapgolly.passportSamlMetadata.srcReaderMod.MetadataReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPassportMod {
  
  @JSImport("passport-saml-metadata/src/passport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def claimsToCamelCase(claims: Any, claimSchema: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("claimsToCamelCase")(claims.asInstanceOf[js.Any], claimSchema.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def toPassportConfig(): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")().asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: Unit, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: MetadataReader): SamlConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any]).asInstanceOf[SamlConfig]
  inline def toPassportConfig(reader: MetadataReader, options: MultipleCerts): SamlConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("toPassportConfig")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SamlConfig]
}
