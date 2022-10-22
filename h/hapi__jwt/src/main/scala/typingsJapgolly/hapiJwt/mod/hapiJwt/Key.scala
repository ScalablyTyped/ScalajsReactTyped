package typingsJapgolly.hapiJwt.mod.hapiJwt

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hapiJwt.mod.hapiJwt.StandardKey
  - typingsJapgolly.hapiJwt.mod.hapiJwt.JWKSKey
*/
trait Key extends StObject
object Key {
  
  inline def JWKSKey(uri: String): typingsJapgolly.hapiJwt.mod.hapiJwt.JWKSKey = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hapiJwt.mod.hapiJwt.JWKSKey]
  }
  
  inline def StandardKey(key: String | Buffer): typingsJapgolly.hapiJwt.mod.hapiJwt.StandardKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hapiJwt.mod.hapiJwt.StandardKey]
  }
}
