package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyTitle extends StObject {
  
  /** @description The discussion post's body text. */
  var body: js.UndefOr[String] = js.undefined
  
  /** @description The discussion post's title. */
  var title: js.UndefOr[String] = js.undefined
}
object BodyTitle {
  
  inline def apply(): BodyTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyTitle]
  }
  
  extension [Self <: BodyTitle](x: Self) {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
