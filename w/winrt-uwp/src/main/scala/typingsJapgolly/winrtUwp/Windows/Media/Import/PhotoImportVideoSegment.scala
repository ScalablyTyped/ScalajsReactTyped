package typingsJapgolly.winrtUwp.Windows.Media.Import

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an imported video segment. */
trait PhotoImportVideoSegment extends StObject {
  
  /** Gets the date of the imported video segment. */
  var date: js.Date
  
  /** Gets the name of the imported video segment. */
  var name: String
  
  /** Gets the sibling file associated with the imported video segment. */
  var sibling: PhotoImportSidecar
  
  /** Gets the sidecar file associated with the imported video segment. */
  var sidecars: IVectorView[PhotoImportSidecar]
  
  /** Gets the size of the imported video segment, in bytes. */
  var sizeInBytes: Double
}
object PhotoImportVideoSegment {
  
  inline def apply(
    date: js.Date,
    name: String,
    sibling: PhotoImportSidecar,
    sidecars: IVectorView[PhotoImportSidecar],
    sizeInBytes: Double
  ): PhotoImportVideoSegment = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sibling = sibling.asInstanceOf[js.Any], sidecars = sidecars.asInstanceOf[js.Any], sizeInBytes = sizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoImportVideoSegment]
  }
  
  extension [Self <: PhotoImportVideoSegment](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSibling(value: PhotoImportSidecar): Self = StObject.set(x, "sibling", value.asInstanceOf[js.Any])
    
    inline def setSidecars(value: IVectorView[PhotoImportSidecar]): Self = StObject.set(x, "sidecars", value.asInstanceOf[js.Any])
    
    inline def setSizeInBytes(value: Double): Self = StObject.set(x, "sizeInBytes", value.asInstanceOf[js.Any])
  }
}
