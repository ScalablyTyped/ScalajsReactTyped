package typingsJapgolly.jsrsasign.mod.KJUR.asn1

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base class for ASN.1 DER structured class */
@JSImport("jsrsasign", "KJUR.asn1.DERAbstractStructured")
@js.native
open class DERAbstractStructured ()
  extends StObject
     with typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.DERAbstractStructured {
  def this(asn1Array: ArrayParam[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]) = this()
  
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  /* CompleteClass */
  override def appendASN1Object(asn1Object: typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object): Unit = js.native
  
  /* CompleteClass */
  var asn1Array: js.Array[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object] = js.native
  
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  /* CompleteClass */
  override def setByASN1ObjectArray(asn1ObjectArray: js.Array[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]): String = js.native
}
