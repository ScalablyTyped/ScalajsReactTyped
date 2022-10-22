package typingsJapgolly.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disk extends StObject {
  
  /**
    * A user-supplied name for the disk. Used when mounting the disk into actions. The name must contain only upper and lowercase alphanumeric characters and hyphens and cannot start with
    * a hyphen.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The size, in GB, of the disk to attach. If the size is not specified, a default is chosen to ensure reasonable I/O performance. If the disk type is specified as `local-ssd`,
    * multiple local drives are automatically combined to provide the requested size. Note, however, that each physical SSD is 375GB in size, and no more than 8 drives can be attached to
    * a single instance.
    */
  var sizeGb: js.UndefOr[Double] = js.undefined
  
  /** An optional image to put on the disk before attaching it to the VM. */
  var sourceImage: js.UndefOr[String] = js.undefined
  
  /** The Compute Engine disk type. If unspecified, `pd-standard` is used. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Disk {
  
  inline def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  
  extension [Self <: Disk](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    inline def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    inline def setSourceImage(value: String): Self = StObject.set(x, "sourceImage", value.asInstanceOf[js.Any])
    
    inline def setSourceImageUndefined: Self = StObject.set(x, "sourceImage", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
