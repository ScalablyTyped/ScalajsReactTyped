package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** information needed to export an object in mbx format (supplying an output stream to export into). */
trait ExportStreamInfo extends StObject {
  
  /** tries hard to make message (document) bodies available for export. */
  var ForceBodies: Boolean
  
  /** the output stream to export into. */
  var Target: XOutputStream
}
object ExportStreamInfo {
  
  inline def apply(ForceBodies: Boolean, Target: XOutputStream): ExportStreamInfo = {
    val __obj = js.Dynamic.literal(ForceBodies = ForceBodies.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportStreamInfo]
  }
  
  extension [Self <: ExportStreamInfo](x: Self) {
    
    inline def setForceBodies(value: Boolean): Self = StObject.set(x, "ForceBodies", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: XOutputStream): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
