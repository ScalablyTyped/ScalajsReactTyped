package typingsJapgolly.nodeForge.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeForge.mod.md.sha512.Sha512256MessageDigest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def create(): Sha512256MessageDigest
}
object `2` {
  
  inline def apply(create: CallbackTo[Sha512256MessageDigest]): `2` = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setCreate(value: CallbackTo[Sha512256MessageDigest]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
