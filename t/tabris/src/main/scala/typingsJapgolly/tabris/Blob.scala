package typingsJapgolly.tabris

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tabris.mod._ImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Blob
/**
  * Represents raw data of a given type.
  */
trait Blob
  extends StObject
     with _ImageSource {
  
  /**
    * Reads the blob data into an ArrayBuffer and returns it in a promise. Each call creates a new
    * in-memory copy of the data.
    */
  def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
  
  /**
    * Size of the blob data in bytes
    * @constant
    */
  val size: Double
  
  /**
    * Decodes the blob data as a string and returns it in a promise.
    */
  def text(): js.Promise[String]
  
  /**
    * The MIME type of the blob data
    * @constant
    */
  val `type`: String
}
object Blob {
  
  inline def apply(
    arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
    size: Double,
    text: CallbackTo[js.Promise[String]],
    `type`: String
  ): Blob = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, size = size.asInstanceOf[js.Any], text = text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  
  extension [Self <: Blob](x: Self) {
    
    inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
