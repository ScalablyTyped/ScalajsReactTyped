package typingsJapgolly.jsrsasign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "ECCurveFp")
@js.native
open class ECCurveFp protected ()
  extends StObject
     with typingsJapgolly.jsrsasign.jsrsasign.ECCurveFp {
  def this(
    q: typingsJapgolly.jsrsasign.jsrsasign.BigInteger,
    a: typingsJapgolly.jsrsasign.jsrsasign.BigInteger,
    b: typingsJapgolly.jsrsasign.jsrsasign.BigInteger
  ) = this()
  
  /* CompleteClass */
  var a: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  var b: typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def decodePointHex(): typingsJapgolly.jsrsasign.jsrsasign.ECPointFp | Null = js.native
  
  /* CompleteClass */
  override def equals(): Boolean = js.native
  
  /* CompleteClass */
  override def fromBigInteger(): typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getA(): typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getB(): typingsJapgolly.jsrsasign.jsrsasign.ECFieldElementFp = js.native
  
  /* CompleteClass */
  override def getInfinity(): typingsJapgolly.jsrsasign.jsrsasign.ECPointFp = js.native
  
  /* CompleteClass */
  override def getQ(): typingsJapgolly.jsrsasign.jsrsasign.BigInteger = js.native
  
  /* CompleteClass */
  var infinity: typingsJapgolly.jsrsasign.jsrsasign.ECPointFp = js.native
  
  /* CompleteClass */
  var q: typingsJapgolly.jsrsasign.jsrsasign.BigInteger = js.native
}
