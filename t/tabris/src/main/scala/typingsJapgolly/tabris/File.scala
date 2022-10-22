package typingsJapgolly.tabris

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// File
/**
  * Represents raw data of a given type and name.
  */
trait File
  extends StObject
     with Blob {
  
  /**
    * Unix timestamp of the last known modification of the file
    * @constant
    */
  val lastModified: Double
  
  /**
    * The name or path of the file
    * @constant
    */
  val name: String
}
object File {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    lastModified: Double,
    name: String,
    size: Double,
    text: CallbackTo[js.Promise[String]],
    `type`: String
  ): File = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
