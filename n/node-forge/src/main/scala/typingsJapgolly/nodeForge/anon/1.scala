package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.sha512.Sha512224MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def create(): Sha512224MessageDigest
}
object `1` {
  
  inline def apply(create: CallbackTo[Sha512224MessageDigest]): `1` = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setCreate(value: CallbackTo[Sha512224MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
