package typingsJapgolly.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsrsasign.anon.D
  - typingsJapgolly.jsrsasign.anon.Kid
  - typingsJapgolly.jsrsasign.anon.Crv
  - typingsJapgolly.jsrsasign.anon.Kty
*/
trait JwkObject extends StObject
object JwkObject {
  
  inline def Crv(crv: String, d: String, x: String, y: String): typingsJapgolly.jsrsasign.anon.Crv = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Crv]
  }
  
  inline def D(d: String, dp: String, dq: String, e: String, n: String, p: String, q: String, qi: String): typingsJapgolly.jsrsasign.anon.D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], dp = dp.asInstanceOf[js.Any], dq = dq.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], qi = qi.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.D]
  }
  
  inline def Kid(e: String, n: String): typingsJapgolly.jsrsasign.anon.Kid = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], kty = "RSA", n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Kid]
  }
  
  inline def Kty(crv: String, x: String, y: String): typingsJapgolly.jsrsasign.anon.Kty = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = "EC", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Kty]
  }
}
