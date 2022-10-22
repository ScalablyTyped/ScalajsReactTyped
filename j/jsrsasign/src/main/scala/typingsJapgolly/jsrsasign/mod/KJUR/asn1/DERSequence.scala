package typingsJapgolly.jsrsasign.mod.KJUR.asn1

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * class for ASN.1 DER Sequence
  *
  * @description
  * As for argument 'params' for constructor, you can specify one of
  * following properties:
  *
  * - array - specify array of ASN1Object to set elements of content
  *
  * NOTE: 'params' can be omitted.
  */
@JSImport("jsrsasign", "KJUR.asn1.DERSequence")
@js.native
open class DERSequence ()
  extends StObject
     with typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.DERSequence {
  def this(params: ArrayParam[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]) = this()
  
  /**
    * append an ASN1Object to internal array
    * @param asn1Object object to add
    */
  /* CompleteClass */
  override def appendASN1Object(asn1Object: typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object): Unit = js.native
  
  /* CompleteClass */
  var asn1Array: js.Array[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object] = js.native
  
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  
  /**
    * set value by array of ASN1Object
    * @param asn1ObjectArray array of ASN1Object to set
    */
  /* CompleteClass */
  override def setByASN1ObjectArray(asn1ObjectArray: js.Array[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object]): String = js.native
}
