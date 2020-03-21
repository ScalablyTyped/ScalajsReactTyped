package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ASN.1 TBSCertList structure class for CRL
  * @param params associative array of parameters (ex. {})
  * @example
  *  var o = new KJUR.asn1.x509.TBSCertList();
  *  o.setSignatureAlgByParam({'name': 'SHA1withRSA'});
  *  o.setIssuerByParam({'str': '/C=US/O=a'});
  *  o.setNotThisUpdateByParam({'str': '130504235959Z'});
  *  o.setNotNextUpdateByParam({'str': '140504235959Z'});
  *  o.addRevokedCert({'int': 4}, {'str':'130514235959Z'}));
  *  o.addRevokedCert({'hex': '0f34dd'}, {'str':'130514235959Z'}));
  *
  * // TBSCertList  ::=  SEQUENCE  {
  * //        version                 Version OPTIONAL,
  * //                                     -- if present, MUST be v2
  * //        signature               AlgorithmIdentifier,
  * //        issuer                  Name,
  * //        thisUpdate              Time,
  * //        nextUpdate              Time OPTIONAL,
  * //        revokedCertificates     SEQUENCE OF SEQUENCE  {
  * //             userCertificate         CertificateSerialNumber,
  * //             revocationDate          Time,
  * //             crlEntryExtensions      Extensions OPTIONAL
  * //                                      -- if present, version MUST be v2
  * //                                  }  OPTIONAL,
  * //        crlExtensions           [0]  EXPLICIT Extensions OPTIONAL
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.TBSCertList")
@js.native
class TBSCertList () extends ASN1Object {
  /**
    * add revoked certificate by parameter
    * @param snParam DERInteger parameter for certificate serial number
    * @param timeParam Time parameter for revocation date
    * @example
    * tbsc.addRevokedCert({'int': 3}, {'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def addRevokedCert(snParam: IntegerParam, timeParam: StringParam): Unit = js.native
  /**
    * set issuer name field by parameter
    * @param x500NameParam X500Name parameter
    * @example
    * tbsc.setIssuerParam({'str': '/C=US/CN=b'});
    * @see KJUR.asn1.x509.X500Name
    */
  def setIssuerByParam(x500NameParam: StringParam): Unit = js.native
  /**
    * set nextUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setNextUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setNextUpdateByParam(timeParam: StringParam): Unit = js.native
  /**
    * set signature algorithm field by parameter
    * @param algIdParam AlgorithmIdentifier parameter
    * @example
    * tbsc.setSignatureAlgByParam({'name': 'SHA1withRSA'});
    */
  def setSignatureAlgByParam(algIdParam: NameParam): Unit = js.native
  /**
    * set thisUpdate field by parameter
    * @param timeParam Time parameter
    * @example
    * tbsc.setThisUpdateByParam({'str': '130508235959Z'});
    * @see KJUR.asn1.x509.Time
    */
  def setThisUpdateByParam(timeParam: StringParam): Unit = js.native
}

