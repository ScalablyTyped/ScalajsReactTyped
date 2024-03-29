package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait License extends StObject {
  
  /** [Output Only] Deprecated. This field no longer reflects whether a license charges a usage fee. */
  var chargesUseFee: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of resource. Always compute#license for licenses. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique code used to attach this license to images, snapshots, and disks. */
  var licenseCode: js.UndefOr[String] = js.undefined
  
  /** Name of the resource. The name must be 1-63 characters long and comply with RFC1035. */
  var name: js.UndefOr[String] = js.undefined
  
  var resourceRequirements: js.UndefOr[LicenseResourceRequirements] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** If false, licenses will not be copied from the source resource when creating an image from a disk, disk from snapshot, or snapshot from disk. */
  var transferable: js.UndefOr[Boolean] = js.undefined
}
object License {
  
  inline def apply(): License = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[License]
  }
  
  extension [Self <: License](x: Self) {
    
    inline def setChargesUseFee(value: Boolean): Self = StObject.set(x, "chargesUseFee", value.asInstanceOf[js.Any])
    
    inline def setChargesUseFeeUndefined: Self = StObject.set(x, "chargesUseFee", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLicenseCode(value: String): Self = StObject.set(x, "licenseCode", value.asInstanceOf[js.Any])
    
    inline def setLicenseCodeUndefined: Self = StObject.set(x, "licenseCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceRequirements(value: LicenseResourceRequirements): Self = StObject.set(x, "resourceRequirements", value.asInstanceOf[js.Any])
    
    inline def setResourceRequirementsUndefined: Self = StObject.set(x, "resourceRequirements", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setTransferable(value: Boolean): Self = StObject.set(x, "transferable", value.asInstanceOf[js.Any])
    
    inline def setTransferableUndefined: Self = StObject.set(x, "transferable", js.undefined)
  }
}
