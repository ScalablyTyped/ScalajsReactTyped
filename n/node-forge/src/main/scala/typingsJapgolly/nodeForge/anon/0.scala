package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.sha256.MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def create(): MessageDigest
}
object `0` {
  
  inline def apply(create: CallbackTo[MessageDigest]): `0` = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCreate(value: CallbackTo[MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
