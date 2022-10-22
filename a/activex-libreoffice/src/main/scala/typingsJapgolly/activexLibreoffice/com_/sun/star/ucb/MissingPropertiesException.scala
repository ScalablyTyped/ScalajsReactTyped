package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This exception is used to indicate that there are properties missing.
  *
  * For example, to create a new resource, usually one ore more property values must be set prior to executing the command "insert", which makes the new
  * resource persistent.
  * @author Kai Sommerfeld
  * @see Content
  * @version 1.0
  */
trait MissingPropertiesException
  extends StObject
     with Exception {
  
  /** contains the names of the missing properties. */
  var Properties: SafeArray[String]
}
object MissingPropertiesException {
  
  inline def apply(Context: XInterface, Message: String, Properties: SafeArray[String]): MissingPropertiesException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingPropertiesException]
  }
  
  extension [Self <: MissingPropertiesException](x: Self) {
    
    inline def setProperties(value: SafeArray[String]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
  }
}
