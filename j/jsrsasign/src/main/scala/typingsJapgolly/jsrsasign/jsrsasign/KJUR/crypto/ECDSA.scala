package typingsJapgolly.jsrsasign.jsrsasign.KJUR.crypto

import typingsJapgolly.jsrsasign.AnonCurve
import typingsJapgolly.jsrsasign.AnonEcprvhex
import typingsJapgolly.jsrsasign.AnonI
import typingsJapgolly.jsrsasign.AnonR
import typingsJapgolly.jsrsasign.AnonX
import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for EC key generation,  ECDSA signing and verifcation
  * @description
  * CAUTION: Most of the case, you don't need to use this class except
  * for generating an EC key pair. Please use `KJUR.crypto.Signature` class instead.
  *
  * This class was originally developped by Stefan Thomas for Bitcoin JavaScript library.
  * (See https://github.com/bitcoinjs/bitcoinjs-lib/blob/master/src/ecdsa.js)
  * Currently this class supports following named curves and their aliases.
  *
  * - secp256r1, NIST P-256, P-256, prime256v1 (*)
  * - secp256k1 (*)
  * - secp384r1, NIST P-384, P-384 (*)
  */
@JSGlobal("jsrsasign.KJUR.crypto.ECDSA")
@js.native
class ECDSA () extends js.Object {
  def this(publicKey: AnonCurve) = this()
  /**
    * generate a EC key pair
    * @return associative array of hexadecimal string of private and public key
    * @example
    * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
    * var keypair = ec.generateKeyPairHex();
    * var pubhex = keypair.ecpubhex; // hexadecimal string of EC public key
    * var prvhex = keypair.ecprvhex; // hexadecimal string of EC private key (=d)
    */
  def generateKeyPairHex(): AnonEcprvhex = js.native
  def getBigRandom(limit: Double): BigInteger = js.native
  /**
    * get X and Y hexadecimal string value of public key
    * @return associative array of x and y value of public key
    * @example
    * ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1', 'pub': pubHex});
    * ec.getPublicKeyXYHex() → { x: '01bacf...', y: 'c3bc22...' }
    */
  def getPublicKeyXYHex(): AnonX = js.native
  /**
    * get NIST curve short name such as "P-256" or "P-384"
    * @return short NIST P curve name such as "P-256" or "P-384" if it's NIST P curve otherwise null;
    * @example
    * ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1', 'pub': pubHex});
    * ec.getShortPCurveName() → "P-256";
    */
  def getShortNISTPCurveName(): String = js.native
  /**
    * Parses a byte array containing a DER-encoded signature.
    *
    * This function will return an object of the form:
    * ```
    * {
    *   r: BigInteger,
    *   s: BigInteger
    * }
    * ```
    */
  def parseSig(sig: String): AnonR = js.native
  def parseSigCompact(sig: String): AnonI = js.native
  /**
    * parse ASN.1 DER encoded ECDSA signature
    * @param sigHex hexadecimal string of ECDSA signature value
    * @return associative array of signature field r and s of BigInteger
    * @example
    * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
    * var sig = ec.parseSigHex('30...');
    * var biR = sig.r; // BigInteger object for 'r' field of signature.
    * var biS = sig.s; // BigInteger object for 's' field of signature.
    */
  def parseSigHex(sigHex: String): AnonR = js.native
  /**
    * parse ASN.1 DER encoded ECDSA signature
    * @param sigHex hexadecimal string of ECDSA signature value
    * @return associative array of signature field r and s in hexadecimal
    * @example
    * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
    * var sig = ec.parseSigHexInHexRS('30...');
    * var hR = sig.r; // hexadecimal string for 'r' field of signature.
    * var hS = sig.s; // hexadecimal string for 's' field of signature.
    */
  def parseSigHexInHexRS(sigHex: String): AnonR = js.native
  /**
    * read an ASN.1 hexadecimal string of X.509 ECC public key certificate
    * @param h hexadecimal string of X.509 ECC public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain ECC private key
    * @param h hexadecimal string of PKCS#1/5 ECC private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain ECC private key
    * @param h hexadecimal string of PKCS#8 ECC private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit = js.native
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 ECC public key
    * @param h hexadecimal string of PKCS#8 ECC public key
    */
  def readPKCS8PubKeyHex(h: String): Unit = js.native
  /**
    * Serialize a signature into DER format.
    *
    * Takes two BigIntegers representing r and s and returns a byte array.
    */
  def serializeSig(r: BigInteger, s: BigInteger): js.Array[Double] = js.native
  def setNamedCurve(curveName: String): Unit = js.native
  def setPrivateKeyHex(prvKeyHex: String): Unit = js.native
  def setPublicKeyHex(pubKeyHex: String): Unit = js.native
  def sign(hash: String, priv: String): js.Array[Double] = js.native
  def sign(hash: String, priv: BigInteger): js.Array[Double] = js.native
  /**
    * signing to message hash
    * @param hashHex hexadecimal string of hash value of signing message
    * @param privHex hexadecimal string of EC private key
    * @return hexadecimal string of ECDSA signature
    * @example
    * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
    * var sigValue = ec.signHex(hash, prvKey);
    */
  def signHex(hashHex: String, privHex: String): String = js.native
  def verify(hash: String, sig: String, pubkey: String): Boolean = js.native
  /**
    * verifying signature with message hash and public key
    * @param hashHex hexadecimal string of hash value of signing message
    * @param sigHex hexadecimal string of signature value
    * @param pubkeyHex hexadecimal string of public key
    * @return true if the signature is valid, otherwise false
    * @example
    * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
    * var result = ec.verifyHex(msgHashHex, sigHex, pubkeyHex);
    */
  def verifyHex(hashHex: String, sigHex: String, pubkeyHex: String): Boolean = js.native
  def verifyRaw(e: String, r: String, s: String, Q: String): Boolean = js.native
  def verifyRaw(e: String, r: String, s: String, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: String, r: String, s: BigInteger, Q: String): Boolean = js.native
  def verifyRaw(e: String, r: String, s: BigInteger, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: String, r: BigInteger, s: String, Q: String): Boolean = js.native
  def verifyRaw(e: String, r: BigInteger, s: String, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: String, r: BigInteger, s: BigInteger, Q: String): Boolean = js.native
  def verifyRaw(e: String, r: BigInteger, s: BigInteger, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: BigInteger, r: String, s: String, Q: String): Boolean = js.native
  def verifyRaw(e: BigInteger, r: String, s: String, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: BigInteger, r: String, s: BigInteger, Q: String): Boolean = js.native
  def verifyRaw(e: BigInteger, r: String, s: BigInteger, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: BigInteger, r: BigInteger, s: String, Q: String): Boolean = js.native
  def verifyRaw(e: BigInteger, r: BigInteger, s: String, Q: BigInteger): Boolean = js.native
  def verifyRaw(e: BigInteger, r: BigInteger, s: BigInteger, Q: String): Boolean = js.native
  def verifyRaw(e: BigInteger, r: BigInteger, s: BigInteger, Q: BigInteger): Boolean = js.native
  def verifyWithMessageHash(hashHex: String, sigHex: String): Boolean = js.native
}

/* static members */
@JSGlobal("jsrsasign.KJUR.crypto.ECDSA")
@js.native
object ECDSA extends js.Object {
  /**
    * convert hexadecimal ASN.1 encoded signature to concatinated signature
    * @param asn1Hex hexadecimal string of ASN.1 encoded ECDSA signature value
    * @return r-s concatinated format of ECDSA signature value
    */
  def asn1SigToConcatSig(asn1Sig: String): String = js.native
  /**
    * convert R and S BigInteger object of signature to ASN.1 encoded signature
    * @param biR BigInteger object of R field of ECDSA signature value
    * @param biS BIgInteger object of S field of ECDSA signature value
    * @return hexadecimal string of ASN.1 encoded ECDSA signature value
    */
  def biRSSigToASN1Sig(biR: BigInteger, biS: BigInteger): String = js.native
  /**
    * convert hexadecimal concatinated signature to ASN.1 encoded signature
    * @param concatSig r-s concatinated format of ECDSA signature value
    * @return hexadecimal string of ASN.1 encoded ECDSA signature value
    */
  def concatSigToASN1Sig(concatSig: String): String = js.native
  /**
    * static method to get normalized EC curve name from curve name or hexadecimal OID value
    * @param s curve name (ex. P-256) or hexadecimal OID value (ex. 2a86...)
    * @return normalized EC curve name (ex. secp256r1)
    * @description
    * This static method returns normalized EC curve name
    * which is supported in jsrsasign
    * from curve name or hexadecimal OID value.
    * When curve is not supported in jsrsasign, this method returns null.
    * Normalized name will be "secp*" in jsrsasign.
    * @example
    * KJUR.crypto.ECDSA.getName("2b8104000a") → "secp256k1"
    * KJUR.crypto.ECDSA.getName("NIST P-256") → "secp256r1"
    * KJUR.crypto.ECDSA.getName("P-521") → undefined // not supported
    */
  def getName(s: String): String = js.native
  /**
    * convert hexadecimal R and S value of signature to ASN.1 encoded signature
    * @param hR hexadecimal string of R field of ECDSA signature value
    * @param hS hexadecimal string of S field of ECDSA signature value
    * @return hexadecimal string of ASN.1 encoded ECDSA signature value
    */
  def hexRSSigToASN1Sig(hR: String, hS: String): String = js.native
}

