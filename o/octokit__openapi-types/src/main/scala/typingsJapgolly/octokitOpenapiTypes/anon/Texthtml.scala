package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texthtml extends StObject {
  
  @JSName("text/html")
  var textSlashhtml: String
}
object Texthtml {
  
  inline def apply(textSlashhtml: String): Texthtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text/html")(textSlashhtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Texthtml]
  }
  
  extension [Self <: Texthtml](x: Self) {
    
    inline def setTextSlashhtml(value: String): Self = StObject.set(x, "text/html", value.asInstanceOf[js.Any])
  }
}
