package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait ClipboardItem extends StObject {
  
  /* standard dom */
  def getType(`type`: java.lang.String): js.Promise[org.scalajs.dom.Blob]
  
  /* standard dom */
  val types: js.Array[java.lang.String]
}
object ClipboardItem {
  
  inline def apply(getType: java.lang.String => js.Promise[org.scalajs.dom.Blob], types: js.Array[java.lang.String]): ClipboardItem = {
    val __obj = js.Dynamic.literal(getType = js.Any.fromFunction1(getType), types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardItem]
  }
  
  extension [Self <: ClipboardItem](x: Self) {
    
    inline def setGetType(value: java.lang.String => js.Promise[org.scalajs.dom.Blob]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setTypes(value: js.Array[java.lang.String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: java.lang.String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
