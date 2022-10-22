package typingsJapgolly.jsrsasign.mod.KJUR.asn1

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER IA5String
  * @param params associative array of parameters (ex. {'str': 'aaa'})
  */
@JSImport("jsrsasign", "KJUR.asn1.DERIA5String")
@js.native
open class DERIA5String protected ()
  extends StObject
     with typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractString {
  def this(params: StringParam) = this()
  
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  
  /**
    * get string value of this string object
    * @return string value of this string object
    */
  /* CompleteClass */
  override def getString(): String = js.native
  
  /* CompleteClass */
  var s: String = js.native
  
  /**
    * set value by a string
    * @param newS value by a string to set
    */
  /* CompleteClass */
  override def setString(newS: String): Unit = js.native
  
  /**
    * set value by a hexadecimal string
    * @param newHexString value by a hexadecimal string to set
    */
  /* CompleteClass */
  override def setStringHex(newHexString: String): Unit = js.native
}
