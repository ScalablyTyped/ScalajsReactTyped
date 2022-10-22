package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /** @description A description of the detector used. */
  var detector: NameUrl
  
  var job: Correlator
  
  /** @description A collection of package manifests, which are a collection of related dependencies declared in a file or representing a logical group of dependencies. */
  var manifests: js.UndefOr[
    StringDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['manifest'] */ js.Any
    ]
  ] = js.undefined
  
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['metadata'] */ js.Any
  ] = js.undefined
  
  /**
    * @description The repository branch that triggered this snapshot.
    * @example refs/heads/main
    */
  var ref: String
  
  /**
    * Format: date-time
    * @description The time at which the snapshot was scanned.
    * @example 2020-06-13T14:52:50-05:00
    */
  var scanned: String
  
  /**
    * @description The commit SHA associated with this dependency snapshot.
    * @example ddc951f4b1293222421f2c8df679786153acf689
    */
  var sha: String
  
  /** @description The version of the repository snapshot submission. */
  var version: Double
}
object Job {
  
  inline def apply(detector: NameUrl, job: Correlator, ref: String, scanned: String, sha: String, version: Double): Job = {
    val __obj = js.Dynamic.literal(detector = detector.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], scanned = scanned.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setDetector(value: NameUrl): Self = StObject.set(x, "detector", value.asInstanceOf[js.Any])
    
    inline def setJob(value: Correlator): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setManifests(
      value: StringDictionary[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['manifest'] */ js.Any
        ]
    ): Self = StObject.set(x, "manifests", value.asInstanceOf[js.Any])
    
    inline def setManifestsUndefined: Self = StObject.set(x, "manifests", js.undefined)
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['metadata'] */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setScanned(value: String): Self = StObject.set(x, "scanned", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
