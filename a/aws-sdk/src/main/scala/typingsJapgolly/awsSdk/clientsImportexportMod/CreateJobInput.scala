package typingsJapgolly.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var JobType: typingsJapgolly.awsSdk.clientsImportexportMod.JobType
  
  var Manifest: typingsJapgolly.awsSdk.clientsImportexportMod.Manifest
  
  var ManifestAddendum: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.ManifestAddendum] = js.undefined
  
  var ValidateOnly: typingsJapgolly.awsSdk.clientsImportexportMod.ValidateOnly
}
object CreateJobInput {
  
  inline def apply(JobType: JobType, Manifest: Manifest, ValidateOnly: ValidateOnly): CreateJobInput = {
    val __obj = js.Dynamic.literal(JobType = JobType.asInstanceOf[js.Any], Manifest = Manifest.asInstanceOf[js.Any], ValidateOnly = ValidateOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobInput]
  }
  
  extension [Self <: CreateJobInput](x: Self) {
    
    inline def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setManifest(value: Manifest): Self = StObject.set(x, "Manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestAddendum(value: ManifestAddendum): Self = StObject.set(x, "ManifestAddendum", value.asInstanceOf[js.Any])
    
    inline def setManifestAddendumUndefined: Self = StObject.set(x, "ManifestAddendum", js.undefined)
    
    inline def setValidateOnly(value: ValidateOnly): Self = StObject.set(x, "ValidateOnly", value.asInstanceOf[js.Any])
  }
}
