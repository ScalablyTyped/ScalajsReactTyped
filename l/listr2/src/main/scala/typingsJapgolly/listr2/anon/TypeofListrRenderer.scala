package typingsJapgolly.listr2.anon

import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofListrRenderer extends StObject {
  
  /** designate whether this renderer can work in non-tty environments */
  /* static member */
  var nonTTY: Boolean
  
  /** designate renderer global options that is specific to the current renderer */
  /* static member */
  var rendererOptions: Record[PropertyKey, Any]
  
  /** designate renderer per task options that is specific to the current renderer  */
  /* static member */
  var rendererTaskOptions: Record[PropertyKey, Any]
}
object TypeofListrRenderer {
  
  inline def apply(
    nonTTY: Boolean,
    rendererOptions: Record[PropertyKey, Any],
    rendererTaskOptions: Record[PropertyKey, Any]
  ): TypeofListrRenderer = {
    val __obj = js.Dynamic.literal(nonTTY = nonTTY.asInstanceOf[js.Any], rendererOptions = rendererOptions.asInstanceOf[js.Any], rendererTaskOptions = rendererTaskOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofListrRenderer]
  }
  
  extension [Self <: TypeofListrRenderer](x: Self) {
    
    inline def setNonTTY(value: Boolean): Self = StObject.set(x, "nonTTY", value.asInstanceOf[js.Any])
    
    inline def setRendererOptions(value: Record[PropertyKey, Any]): Self = StObject.set(x, "rendererOptions", value.asInstanceOf[js.Any])
    
    inline def setRendererTaskOptions(value: Record[PropertyKey, Any]): Self = StObject.set(x, "rendererTaskOptions", value.asInstanceOf[js.Any])
  }
}
