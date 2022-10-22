package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.md5.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def create(): MessageDigest
}
object `4` {
  
  inline def apply(create: CallbackTo[MessageDigest]): `4` = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setCreate(value: CallbackTo[MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
