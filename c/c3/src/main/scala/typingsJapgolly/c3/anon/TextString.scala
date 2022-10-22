package typingsJapgolly.c3.anon

import typingsJapgolly.c3.c3Strings.`inner-bottom`
import typingsJapgolly.c3.c3Strings.`inner-middle`
import typingsJapgolly.c3.c3Strings.`inner-top`
import typingsJapgolly.c3.c3Strings.`outer-bottom`
import typingsJapgolly.c3.c3Strings.`outer-middle`
import typingsJapgolly.c3.c3Strings.`outer-top`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextString extends StObject {
  
  /** The position of the label. */
  var position: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
  
  /** The label text to show. */
  var text: String
}
object TextString {
  
  inline def apply(
    position: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`,
    text: String
  ): TextString = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextString]
  }
  
  extension [Self <: TextString](x: Self) {
    
    inline def setPosition(
      value: `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
