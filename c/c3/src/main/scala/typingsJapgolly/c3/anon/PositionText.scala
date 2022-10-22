package typingsJapgolly.c3.anon

import typingsJapgolly.c3.c3Strings.`inner-center`
import typingsJapgolly.c3.c3Strings.`inner-left`
import typingsJapgolly.c3.c3Strings.`inner-right`
import typingsJapgolly.c3.c3Strings.`outer-center`
import typingsJapgolly.c3.c3Strings.`outer-left`
import typingsJapgolly.c3.c3Strings.`outer-right`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionText extends StObject {
  
  /** The position of the label. */
  var position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`
  
  /** The label text to show. */
  var text: String
}
object PositionText {
  
  inline def apply(
    position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`,
    text: String
  ): PositionText = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionText]
  }
  
  extension [Self <: PositionText](x: Self) {
    
    inline def setPosition(
      value: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left`
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
