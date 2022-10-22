package typingsJapgolly.jsrsasign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "ECPointFp")
@js.native
open class ECPointFp protected ()
  extends StObject
     with typingsJapgolly.jsrsasign.jsrsasign.ECPointFp {
  def this(
    curve: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp
  ) = this()
  def this(
    curve: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp,
    x: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp,
    y: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp,
    z: typingsJapgolly.jsrsasign.jsrsasign.BigInteger
  ) = this()
  
  /* CompleteClass */
  var curve: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var x: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var y: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var z: typingsJapgolly.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  var zinv: typingsJapgolly.jsrsasign.jsrsasign.BigInteger | Null = js.native
}
