package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.sha512.Sha384MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  def create(): Sha384MessageDigest
}
object `3` {
  
  inline def apply(create: CallbackTo[Sha384MessageDigest]): `3` = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setCreate(value: CallbackTo[Sha384MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
