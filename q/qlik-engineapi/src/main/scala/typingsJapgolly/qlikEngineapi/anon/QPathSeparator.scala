package typingsJapgolly.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QPathSeparator extends StObject {
  
  /**
    * Path Separator for the OS
    */
  var qPathSeparator: String
}
object QPathSeparator {
  
  inline def apply(qPathSeparator: String): QPathSeparator = {
    val __obj = js.Dynamic.literal(qPathSeparator = qPathSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QPathSeparator]
  }
  
  extension [Self <: QPathSeparator](x: Self) {
    
    inline def setQPathSeparator(value: String): Self = StObject.set(x, "qPathSeparator", value.asInstanceOf[js.Any])
  }
}
