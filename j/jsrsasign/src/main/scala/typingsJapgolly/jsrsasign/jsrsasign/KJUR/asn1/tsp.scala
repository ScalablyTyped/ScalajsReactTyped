package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for RFC 3161 Time Stamp Protocol
  *
  * This name space provides
  * [RFC 3161 Time-Stamp Protocol(TSP)](https://tools.ietf.org/html/rfc3161)
  * data generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  */
object tsp {
  
  /**
    * abstract class for TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  trait AbstractTSAAdapter extends StObject {
    
    def getTSTHex(msgHex: String, hashAlg: String): Unit
  }
  object AbstractTSAAdapter {
    
    inline def apply(getTSTHex: (String, String) => Callback): AbstractTSAAdapter = {
      val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2((t0: String, t1: String) => (getTSTHex(t0, t1)).runNow()))
      __obj.asInstanceOf[AbstractTSAAdapter]
    }
    
    extension [Self <: AbstractTSAAdapter](x: Self) {
      
      inline def setGetTSTHex(value: (String, String) => Callback): Self = StObject.set(x, "getTSTHex", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * class for TSP Accuracy ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * Accuracy ::= SEQUENCE {
    *       seconds        INTEGER              OPTIONAL,
    *       millis     [0] INTEGER  (1..999)    OPTIONAL,
    *       micros     [1] INTEGER  (1..999)    OPTIONAL  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.Accuracy({seconds: 1,
    *                                 millis: 500,
    *                                 micros: 500});
    */
  trait Accuracy
    extends StObject
       with ASN1Object
  object Accuracy {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): Accuracy = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[Accuracy]
    }
  }
  
  /**
    * class for fixed TimeStampToken generator
    * @param params associative array of parameters
    * @description
    * This class generates fixed TimeStampToken except messageImprint
    * for testing purpose.
    * General TSA generates TimeStampToken which varies following
    * fields:
    *
    * - genTime
    * - serialNumber
    * - nonce
    *
    * Those values are provided by initial parameters.
    */
  trait FixedTSAAdapter extends StObject {
    
    def getTSTHex(msgHex: String, hashAlg: String): String
  }
  object FixedTSAAdapter {
    
    inline def apply(getTSTHex: (String, String) => String): FixedTSAAdapter = {
      val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
      __obj.asInstanceOf[FixedTSAAdapter]
    }
    
    extension [Self <: FixedTSAAdapter](x: Self) {
      
      inline def setGetTSTHex(value: (String, String) => String): Self = StObject.set(x, "getTSTHex", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * class for TSP MessageImprint ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * MessageImprint ::= SEQUENCE  {
    *      hashAlgorithm                AlgorithmIdentifier,
    *      hashedMessage                OCTET STRING  }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.MessageImprint({hashAlg: 'sha1',
    *                                       hashValue: '1f3dea...'});
    */
  trait MessageImprint
    extends StObject
       with ASN1Object
  object MessageImprint {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): MessageImprint = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[MessageImprint]
    }
  }
  
  /**
    * class for TSP PKIFailureInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFailureInfo ::= BIT STRING {
    *    badAlg                 (0),
    *    badRequest             (2),
    *    badDataFormat          (5),
    *    timeNotAvailable       (14),
    *    unacceptedPolicy       (15),
    *    unacceptedExtension    (16),
    *    addInfoNotAvailable    (17),
    *    systemFailure          (25) }
    * ```
    */
  type PKIFailureInfo = ASN1Object
  
  /**
    * class for TSP PKIFreeText ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIFreeText ::= SEQUENCE {
    *    SIZE (1..MAX) OF UTF8String }
    * ```
    */
  type PKIFreeText = ASN1Object
  
  /**
    * class for TSP PKIStatus ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatus ::= INTEGER {
    *    granted                (0),
    *    grantedWithMods        (1),
    *    rejection              (2),
    *    waiting                (3),
    *    revocationWarning      (4),
    *    revocationNotification (5) }
    * ```
    */
  type PKIStatus = ASN1Object
  
  /**
    * class for TSP PKIStatusInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * PKIStatusInfo ::= SEQUENCE {
    *    status                  PKIStatus,
    *    statusString            PKIFreeText     OPTIONAL,
    *    failInfo                PKIFailureInfo  OPTIONAL  }
    * ```
    */
  type PKIStatusInfo = ASN1Object
  
  /**
    * class for simple TimeStampToken generator
    * @param params associative array of parameters
    * @description
    */
  trait SimpleTSAAdapter extends StObject {
    
    def getTSTHex(msgHex: String, hashAlg: String): String
  }
  object SimpleTSAAdapter {
    
    inline def apply(getTSTHex: (String, String) => String): SimpleTSAAdapter = {
      val __obj = js.Dynamic.literal(getTSTHex = js.Any.fromFunction2(getTSTHex))
      __obj.asInstanceOf[SimpleTSAAdapter]
    }
    
    extension [Self <: SimpleTSAAdapter](x: Self) {
      
      inline def setGetTSTHex(value: (String, String) => String): Self = StObject.set(x, "getTSTHex", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * class for TSP TSTInfo ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TSTInfo ::= SEQUENCE  {
    *    version         INTEGER  { v1(1) },
    *    policy          TSAPolicyId,
    *    messageImprint  MessageImprint,
    *    serialNumber    INTEGER, -- up to 160bit
    *    genTime         GeneralizedTime,
    *    accuracy        Accuracy                 OPTIONAL,
    *    ordering        BOOLEAN                  DEFAULT FALSE,
    *    nonce           INTEGER                  OPTIONAL,
    *    tsa             [0] GeneralName          OPTIONAL,
    *    extensions      [1] IMPLICIT Extensions  OPTIONAL   }
    * ```
    * @example
    * o = new KJUR.asn1.tsp.TSTInfo({
    *     policy:    '1.2.3.4.5',
    *     messageImprint: {hashAlg: 'sha256', hashMsgHex: '1abc...'},
    *     genTime:   {withMillis: true},     // OPTION
    *     accuracy:  {micros: 500},          // OPTION
    *     ordering:  true,                   // OPTION
    *     nonce:     {hex: '52fab1...'},     // OPTION
    *     tsa:       {str: '/C=US/O=TSA1'}   // OPTION
    * });
    */
  trait TSTInfo
    extends StObject
       with ASN1Object
  object TSTInfo {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String
    ): TSTInfo = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[TSTInfo]
    }
  }
  
  /**
    * class for TSP TimeStampReq ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampReq ::= SEQUENCE  {
    *    version          INTEGER  { v1(1) },
    *    messageImprint   MessageImprint,
    *    reqPolicy        TSAPolicyId               OPTIONAL,
    *    nonce            INTEGER                   OPTIONAL,
    *    certReq          BOOLEAN                   DEFAULT FALSE,
    *    extensions       [0] IMPLICIT Extensions   OPTIONAL  }
    * ```
    */
  trait TimeStampReq
    extends StObject
       with ASN1Object {
    
    def setMessageImprint(params: MessageImprint): Unit
  }
  object TimeStampReq {
    
    inline def apply(
      getEncodedHex: CallbackTo[String],
      getFreshValueHex: CallbackTo[String],
      getLengthHexFromValue: CallbackTo[String],
      getValueHex: CallbackTo[String],
      hL: String,
      hT: String,
      hTLV: String,
      hV: String,
      isModified: String,
      setMessageImprint: MessageImprint => Callback
    ): TimeStampReq = {
      val __obj = js.Dynamic.literal(getEncodedHex = getEncodedHex.toJsFn, getFreshValueHex = getFreshValueHex.toJsFn, getLengthHexFromValue = getLengthHexFromValue.toJsFn, getValueHex = getValueHex.toJsFn, hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setMessageImprint = js.Any.fromFunction1((t0: MessageImprint) => setMessageImprint(t0).runNow()), params = null)
      __obj.asInstanceOf[TimeStampReq]
    }
    
    extension [Self <: TimeStampReq](x: Self) {
      
      inline def setSetMessageImprint(value: MessageImprint => Callback): Self = StObject.set(x, "setMessageImprint", js.Any.fromFunction1((t0: MessageImprint) => value(t0).runNow()))
    }
  }
  
  /**
    * class for TSP TimeStampResp ASN.1 object
    * @param params associative array of parameters
    * @description
    * ```
    * TimeStampResp ::= SEQUENCE  {
    *    status                  PKIStatusInfo,
    *    timeStampToken          TimeStampToken     OPTIONAL  }
    * ```
    */
  type TimeStampResp = ASN1Object
}
