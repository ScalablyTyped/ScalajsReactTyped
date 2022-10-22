package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.sha1.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  def create(): MessageDigest
}
object Create {
  
  inline def apply(create: CallbackTo[MessageDigest]): Create = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCreate(value: CallbackTo[MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
