package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  def copy(): Attachment
  
  var name: String
}
object Attachment {
  
  inline def apply(copy: CallbackTo[Attachment], name: String): Attachment = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setCopy(value: CallbackTo[Attachment]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
