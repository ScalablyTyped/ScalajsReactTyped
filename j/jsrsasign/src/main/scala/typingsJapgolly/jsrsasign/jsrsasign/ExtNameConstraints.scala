package typingsJapgolly.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jsrsasign.anon.Permit
  - typingsJapgolly.jsrsasign.anon.Exclude
*/
trait ExtNameConstraints
  extends StObject
     with ExtParam
object ExtNameConstraints {
  
  inline def Exclude(exclude: js.Array[GeneralSubtree]): typingsJapgolly.jsrsasign.anon.Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extname = "nameConstraints")
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Exclude]
  }
  
  inline def Permit(permit: js.Array[GeneralSubtree]): typingsJapgolly.jsrsasign.anon.Permit = {
    val __obj = js.Dynamic.literal(extname = "nameConstraints", permit = permit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jsrsasign.anon.Permit]
  }
}
