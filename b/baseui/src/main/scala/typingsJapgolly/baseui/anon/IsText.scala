package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsText extends StObject {
  
  @JSName("$isText")
  var $isText: Boolean
}
object IsText {
  
  inline def apply($isText: Boolean): IsText = {
    val __obj = js.Dynamic.literal($isText = $isText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsText]
  }
  
  extension [Self <: IsText](x: Self) {
    
    inline def set$isText(value: Boolean): Self = StObject.set(x, "$isText", value.asInstanceOf[js.Any])
  }
}
