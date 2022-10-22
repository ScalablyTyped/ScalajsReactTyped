package typingsJapgolly.webextensionPolyfill.namespacesManifestMod.Manifest

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webextensionPolyfill.namespacesExperimentsMod.Experiments.ExperimentAPI
import typingsJapgolly.webextensionPolyfill.namespacesExperimentsMod.Experiments.ExperimentURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebExtensionManifestExperimentApisType
  extends StObject
     with ExperimentAPI
     with /* s */ StringDictionary[Any]
object WebExtensionManifestExperimentApisType {
  
  inline def apply(schema: ExperimentURL): WebExtensionManifestExperimentApisType = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebExtensionManifestExperimentApisType]
  }
}
