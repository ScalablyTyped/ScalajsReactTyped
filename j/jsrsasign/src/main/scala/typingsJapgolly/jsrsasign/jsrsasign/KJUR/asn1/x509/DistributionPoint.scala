package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DistributionPoint ASN.1 structure class
  * @description
  * ```
  * DistributionPoint ::= SEQUENCE {
  *      distributionPoint       [0]     DistributionPointName OPTIONAL,
  *      reasons                 [1]     ReasonFlags OPTIONAL,
  *      cRLIssuer               [2]     GeneralNames OPTIONAL }
  *
  * DistributionPointName ::= CHOICE {
  *      fullName                [0]     GeneralNames,
  *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
  *
  * ReasonFlags ::= BIT STRING {
  *      unused                  (0),
  *      keyCompromise           (1),
  *      cACompromise            (2),
  *      affiliationChanged      (3),
  *      superseded              (4),
  *      cessationOfOperation    (5),
  *      certificateHold         (6),
  *      privilegeWithdrawn      (7),
  *      aACompromise            (8) }
  * ```
  */
trait DistributionPoint extends StObject {
  
  def getEncodedHex(): String
}
object DistributionPoint {
  
  inline def apply(getEncodedHex: CallbackTo[String]): DistributionPoint = {
    val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn)
    __obj.asInstanceOf[DistributionPoint]
  }
  
  extension [Self <: DistributionPoint](x: Self) {
    
    inline def setGetEncodedHex(value: CallbackTo[String]): Self = StObject.set(x, "getEncodedHex", value.toJsFn)
  }
}
