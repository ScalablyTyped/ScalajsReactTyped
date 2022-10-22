package typingsJapgolly.jsrsasign.jsrsasign.KJUR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsrsasign.anon.Ecprvhex
import typingsJapgolly.jsrsasign.anon.I
import typingsJapgolly.jsrsasign.anon.R
import typingsJapgolly.jsrsasign.anon.X
import typingsJapgolly.jsrsasign.jsrsasign.BigInteger
import typingsJapgolly.jsrsasign.jsrsasign.ECCPrivateKey
import typingsJapgolly.jsrsasign.jsrsasign.ECCurveFp
import typingsJapgolly.jsrsasign.jsrsasign.ECPointFp
import typingsJapgolly.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  /**
    * class for DSA signing and verification
    * @description
    *
    * CAUTION: Most of the case, you don't need to use this class.
    * Please use `KJUR.crypto.Signature` class instead.
    *
    *
    * NOTE: Until jsrsasign 6.2.3, DSA class have used codes from openpgpjs library 1.0.0
    * licenced under LGPL licence. To avoid license issue dsa-2.0.js was re-written with
    * my own codes in jsrsasign 7.0.0.
    * Some random number generators used in dsa-2.0.js was newly defined
    * in KJUR.crypto.Util class. Now all of LGPL codes are removed.
    */
  @js.native
  trait DSA extends StObject {
    
    /**
      * parse hexadecimal ASN.1 DSA signature value
      * @param hSigVal hexadecimal string of ASN.1 encoded DSA signature value
      * @return array [r, s] of DSA signature value. Both r and s are BigInteger.
      */
    def parseASN1Signature(hSigVal: String): js.Tuple2[BigInteger, BigInteger] = js.native
    
    /**
      * read an ASN.1 hexadecimal string of X.509 DSA public key certificate
      * @param h hexadecimal string of X.509 DSA public key certificate
      * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
      */
    def readCertPubKeyHex(h: String, nthPKI: Double): Unit = js.native
    
    /**
      * read an ASN.1 hexadecimal string of PKCS#1/5 plain DSA private key
      * @param h hexadecimal string of PKCS#1/5 DSA private key
      */
    def readPKCS5PrvKeyHex(h: String): Unit = js.native
    
    /**
      * read an ASN.1 hexadecimal string of PKCS#8 plain DSA private key
      * @param h hexadecimal string of PKCS#8 DSA private key
      */
    def readPKCS8PrvKeyHex(h: String): Unit = js.native
    
    /**
      * read an ASN.1 hexadecimal string of PKCS#8 plain DSA private key
      * @param h hexadecimal string of PKCS#8 DSA private key
      */
    def readPKCS8PubKeyHex(h: String): Unit = js.native
    
    def setPrivate(p: BigInteger, q: BigInteger, g: BigInteger, y: Null, x: BigInteger): Unit = js.native
    /**
      * set DSA private key by key parameters of BigInteger object
      * @param p prime P parameter
      * @param q sub prime Q parameter
      * @param g base G parameter
      * @param y public key Y or null
      * @param x private key X
      */
    def setPrivate(p: BigInteger, q: BigInteger, g: BigInteger, y: BigInteger, x: BigInteger): Unit = js.native
    
    /**
      * set DSA private key by key parameters of hexadecimal string
      * @param hP prime P parameter
      * @param hQ sub prime Q parameter
      * @param hG base G parameter
      * @param hY public key Y or null
      * @param hX private key X
      */
    def setPrivateHex(hP: String, hQ: String, hG: String, hY: String, hX: String): Unit = js.native
    
    /**
      * set DSA public key by key parameters of BigInteger object
      * @param p prime P parameter
      * @param q sub prime Q parameter
      * @param g base G parameter
      * @param y public key Y
      */
    def setPublic(p: BigInteger, q: BigInteger, g: BigInteger, y: BigInteger): Unit = js.native
    
    /**
      * set DSA public key by key parameters of hexadecimal string
      * @param hP prime P parameter
      * @param hQ sub prime Q parameter
      * @param hG base G parameter
      * @param hY public key Y
      */
    def setPublicHex(hP: String, hQ: String, hG: String, hY: String): Unit = js.native
    
    /**
      * sign to hashed message by this DSA private key object
      * @param sHashHex hexadecimal string of hashed message
      * @return hexadecimal string of ASN.1 encoded DSA signature value
      */
    def signWithMessageHash(sHashHex: String): String = js.native
    
    /**
      * verify signature by this DSA public key object
      * @param sHashHex hexadecimal string of hashed message
      * @param hSigVal hexadecimal string of ASN.1 encoded DSA signature value
      * @return true if the signature is valid otherwise false.
      */
    def verifyWithMessageHash(sHashHex: String, hSigVal: String): Boolean = js.native
  }
  
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
  @js.native
  trait ECDSA extends StObject {
    
    /**
      * generate a EC key pair
      * @return associative array of hexadecimal string of private and public key
      * @example
      * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1'});
      * var keypair = ec.generateKeyPairHex();
      * var pubhex = keypair.ecpubhex; // hexadecimal string of EC public key
      * var prvhex = keypair.ecprvhex; // hexadecimal string of EC private key (=d)
      */
    def generateKeyPairHex(): Ecprvhex = js.native
    
    /**
      * generate public key for EC private key
      * @return associative array of hexadecimal string of private and public key
      * @example
      * var ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1', 'prv': prvHex});
      * var pubhex = ec.generatePublicKeyHex(); // hexadecimal string of EC public key
      * var pub ec.getPublicKeyXYHex() → { x: '01bacf...', y: 'c3bc22...' }
      */
    def generatePublicKeyHex(): String = js.native
    
    def getBigRandom(limit: Double): BigInteger = js.native
    
    /**
      * get X and Y hexadecimal string value of public key
      * @return associative array of x and y value of public key
      * @example
      * ec = new KJUR.crypto.ECDSA({'curve': 'secp256r1', 'pub': pubHex});
      * ec.getPublicKeyXYHex() → { x: '01bacf...', y: 'c3bc22...' }
      */
    def getPublicKeyXYHex(): X = js.native
    
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
    def parseSig(sig: String): R = js.native
    
    def parseSigCompact(sig: String): I = js.native
    
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
    def parseSigHex(sigHex: String): R = js.native
    
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
    def parseSigHexInHexRS(sigHex: String): R = js.native
    
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
  
  trait ECParameter extends StObject {
    
    var G: ECPointFp
    
    var curve: ECCurveFp
    
    var h: BigInteger
    
    var info: js.UndefOr[String] = js.undefined
    
    var keylen: Double
    
    var n: BigInteger
    
    var name: String
    
    var oid: js.UndefOr[String] = js.undefined
  }
  object ECParameter {
    
    inline def apply(G: ECPointFp, curve: ECCurveFp, h: BigInteger, keylen: Double, n: BigInteger, name: String): ECParameter = {
      val __obj = js.Dynamic.literal(G = G.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], keylen = keylen.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECParameter]
    }
    
    extension [Self <: ECParameter](x: Self) {
      
      inline def setCurve(value: ECCurveFp): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setG(value: ECPointFp): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      inline def setH(value: BigInteger): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setKeylen(value: Double): Self = StObject.set(x, "keylen", value.asInstanceOf[js.Any])
      
      inline def setN(value: BigInteger): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
    }
  }
  
  /**
    * Mac(Message Authentication Code) class which is very similar to java.security.Mac class
    * @param params parameters for constructor
    * @description
    *
    * Currently this supports following algorithm and providers combination:
    * - hmacmd5 - cryptojs
    * - hmacsha1 - cryptojs
    * - hmacsha224 - cryptojs
    * - hmacsha256 - cryptojs
    * - hmacsha384 - cryptojs
    * - hmacsha512 - cryptojs
    * NOTE: HmacSHA224 and HmacSHA384 issue was fixed since jsrsasign 4.1.4.
    * Please use 'ext/cryptojs-312-core-fix*.js' instead of 'core.js' of original CryptoJS
    * to avoid those issue.
    *
    * NOTE2: Hmac signature bug was fixed in jsrsasign 4.9.0 by providing CryptoJS
    * bug workaround.
    *
    * Please see `KJUR.crypto.Mac.setPassword` how to provide password
    * in various ways in detail.
    * @example
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA1", "pass": "pass"});
    * mac.updateString('aaa')
    * var macHex = mac.doFinal()
    *
    * // other password representation
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"hex":  "6161"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"utf8": "aa"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"rstr": "\x61\x61"}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64":  "Mi02/+...a=="}});
    * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": {"b64u": "Mi02_-...a"}});
    */
  @js.native
  trait Mac extends StObject {
    
    /**
      * completes hash calculation and returns hash result
      * @example
      * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": "pass"});
      * mac.updateString('aaa')
      * mac.doFinal() → "5737da..."
      */
    def doFinal(): String = js.native
    
    /**
      * performs final update on the digest using hexadecimal string, then completes the digest computation
      * @param hex hexadecimal string to final update
      * @example
      * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": "pass"});
      * mac.doFinalHex("616161") → "5737da..."
      */
    def doFinalHex(hex: String): String = js.native
    
    /**
      * performs final update on the digest using string, then completes the digest computation
      * @param str string to final update
      * @example
      * var mac = new KJUR.crypto.Mac({alg: "HmacSHA256", "pass": "pass"});
      * mac.doFinalString("aaa") → "5737da..."
      */
    def doFinalString(str: String): String = js.native
    
    def setAlgAndProvider(alg: String, prov: String): Unit = js.native
    
    /**
      * set password for Mac
      * @param pass password for Mac
      * @description
      * This method will set password for (H)Mac internally.
      * Argument 'pass' can be specified as following:
      * - even length string of 0..9, a..f or A-F: implicitly specified as hexadecimal string
      * - not above string: implicitly specified as raw string
      * - {rstr: "\x65\x70"}: explicitly specified as raw string
      * - {hex: "6570"}: explicitly specified as hexacedimal string
      * - {utf8: "秘密"}: explicitly specified as UTF8 string
      * - {b64: "Mi78..=="}: explicitly specified as Base64 string
      * - {b64u: "Mi7-_"}: explicitly specified as Base64URL string
      * It is *STRONGLY RECOMMENDED* that explicit representation of password argument
      * to avoid ambiguity. For example string  "6161" can mean a string "6161" or
      * a hexadecimal string of "aa" (i.e. \x61\x61).
      * @example
      * mac = KJUR.crypto.Mac({'alg': 'hmacsha256'});
      * // set password by implicit raw string
      * mac.setPassword("\x65\x70\xb9\x0b");
      * mac.setPassword("password");
      * // set password by implicit hexadecimal string
      * mac.setPassword("6570b90b");
      * mac.setPassword("6570B90B");
      * // set password by explicit raw string
      * mac.setPassword({"rstr": "\x65\x70\xb9\x0b"});
      * // set password by explicit hexadecimal string
      * mac.setPassword({"hex": "6570b90b"});
      * // set password by explicit utf8 string
      * mac.setPassword({"utf8": "passwordパスワード");
      * // set password by explicit Base64 string
      * mac.setPassword({"b64": "Mb+c3f/=="});
      * // set password by explicit Base64URL string
      * mac.setPassword({"b64u": "Mb-c3f_"});
      */
    def setPassword(pass: String): Unit = js.native
    def setPassword(pass: StringDictionary[String]): Unit = js.native
    
    /**
      * update digest by specified hexadecimal string
      * @param hex hexadecimal string to update
      * @example
      * mac.updateHex('0afe36');
      */
    def updateHex(hex: String): Unit = js.native
    
    /**
      * update digest by specified string
      * @param str string to update
      * @example
      * mac.updateString('New York');
      */
    def updateString(str: String): Unit = js.native
  }
  
  /**
    * MessageDigest class which is very similar to java.security.MessageDigest class
    * @description
    * Currently this supports following algorithm and providers combination:
    * - md5 - cryptojs
    * - sha1 - cryptojs
    * - sha224 - cryptojs
    * - sha256 - cryptojs
    * - sha384 - cryptojs
    * - sha512 - cryptojs
    * - ripemd160 - cryptojs
    * - sha256 - sjcl (NEW from crypto.js 1.0.4)
    *
    * @example
    * // CryptoJS provider sample
    * var md = new KJUR.crypto.MessageDigest({alg: "sha1", prov: "cryptojs"});
    * md.updateString('aaa')
    * var mdHex = md.digest()
    *
    * // SJCL(Stanford JavaScript Crypto Library) provider sample
    * var md = new KJUR.crypto.MessageDigest({alg: "sha256", prov: "sjcl"}); // sjcl supports sha256 only
    * md.updateString('aaa')
    * var mdHex = md.digest()
    *
    * // HASHLENGTH property
    * KJUR.crypto.MessageDigest.HASHLENGTH['sha1'] → 20
    * KJUR.crypto.MessageDigest.HASHLENGTH['sha512'] → 64
    */
  trait MessageDigest extends StObject {
    
    /**
      * completes hash calculation and returns hash result
      * @description
      * @example
      * md.digest()
      */
    def digest(): String
    
    /**
      * performs final update on the digest using hexadecimal string, then completes the digest computation
      * @param hex hexadecimal string to final update
      * @description
      * @example
      * md.digestHex('0f2abd')
      */
    def digestHex(hex: String): String
    
    /**
      * performs final update on the digest using string, then completes the digest computation
      * @param str string to final update
      * @description
      * @example
      * md.digestString('aaa')
      */
    def digestString(str: String): String
    
    /**
      * set hash algorithm and provider
      * @param alg hash algorithm name
      * @param prov provider name
      * @description
      * This methods set an algorithm and a cryptographic provider.
      * Here is acceptable algorithm names ignoring cases and hyphens:
      * - MD5
      * - SHA1
      * - SHA224
      * - SHA256
      * - SHA384
      * - SHA512
      * - RIPEMD160
      * NOTE: Since jsrsasign 6.2.0 crypto 1.1.10, this method ignores
      * upper or lower cases. Also any hyphens (i.e. "-") will be ignored
      * so that "SHA1" or "SHA-1" will be acceptable.
      * @example
      * // for SHA1
      * md.setAlgAndProvider('sha1', 'cryptojs');
      * md.setAlgAndProvider('SHA1');
      * // for RIPEMD160
      * md.setAlgAndProvider('ripemd160', 'cryptojs');
      */
    def setAlgAndProvider(alg: String, prov: String): Unit
    
    /**
      * update digest by specified hexadecimal string
      * @param hex hexadecimal string to update
      * @description
      * @example
      * md.updateHex('0afe36');
      */
    def updateHex(hex: String): Unit
    
    /**
      * update digest by specified string
      * @param str string to update
      * @description
      * @example
      * md.updateString('New York');
      */
    def updateString(str: String): Unit
  }
  object MessageDigest {
    
    inline def apply(
      digest: CallbackTo[String],
      digestHex: String => String,
      digestString: String => String,
      setAlgAndProvider: (String, String) => Callback,
      updateHex: String => Callback,
      updateString: String => Callback
    ): MessageDigest = {
      val __obj = js.Dynamic.literal(digest = digest.toJsFn, digestHex = js.Any.fromFunction1(digestHex), digestString = js.Any.fromFunction1(digestString), setAlgAndProvider = js.Any.fromFunction2((t0: String, t1: String) => (setAlgAndProvider(t0, t1)).runNow()), updateHex = js.Any.fromFunction1((t0: String) => updateHex(t0).runNow()), updateString = js.Any.fromFunction1((t0: String) => updateString(t0).runNow()))
      __obj.asInstanceOf[MessageDigest]
    }
    
    extension [Self <: MessageDigest](x: Self) {
      
      inline def setDigest(value: CallbackTo[String]): Self = StObject.set(x, "digest", value.toJsFn)
      
      inline def setDigestHex(value: String => String): Self = StObject.set(x, "digestHex", js.Any.fromFunction1(value))
      
      inline def setDigestString(value: String => String): Self = StObject.set(x, "digestString", js.Any.fromFunction1(value))
      
      inline def setSetAlgAndProvider(value: (String, String) => Callback): Self = StObject.set(x, "setAlgAndProvider", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setUpdateHex(value: String => Callback): Self = StObject.set(x, "updateHex", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUpdateString(value: String => Callback): Self = StObject.set(x, "updateString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * Signature class which is very similar to java.security.Signature class
    * @param params parameters for constructor
    * @description
    * As for params of constructor's argument, it can be specify following attributes:
    * - alg - signature algorithm name (ex. {MD5,SHA1,SHA224,SHA256,SHA384,SHA512,RIPEMD160}with{RSA,ECDSA,DSA})
    * - provider - currently 'cryptojs/jsrsa' only
    * <h4>SUPPORTED ALGORITHMS AND PROVIDERS</h4>
    * This Signature class supports following signature algorithm and provider names:
    * - MD5withRSA - cryptojs/jsrsa
    * - SHA1withRSA - cryptojs/jsrsa
    * - SHA224withRSA - cryptojs/jsrsa
    * - SHA256withRSA - cryptojs/jsrsa
    * - SHA384withRSA - cryptojs/jsrsa
    * - SHA512withRSA - cryptojs/jsrsa
    * - RIPEMD160withRSA - cryptojs/jsrsa
    * - MD5withECDSA - cryptojs/jsrsa
    * - SHA1withECDSA - cryptojs/jsrsa
    * - SHA224withECDSA - cryptojs/jsrsa
    * - SHA256withECDSA - cryptojs/jsrsa
    * - SHA384withECDSA - cryptojs/jsrsa
    * - SHA512withECDSA - cryptojs/jsrsa
    * - RIPEMD160withECDSA - cryptojs/jsrsa
    * - MD5withRSAandMGF1 - cryptojs/jsrsa
    * - SHA1withRSAandMGF1 - cryptojs/jsrsa
    * - SHA224withRSAandMGF1 - cryptojs/jsrsa
    * - SHA256withRSAandMGF1 - cryptojs/jsrsa
    * - SHA384withRSAandMGF1 - cryptojs/jsrsa
    * - SHA512withRSAandMGF1 - cryptojs/jsrsa
    * - RIPEMD160withRSAandMGF1 - cryptojs/jsrsa
    * - SHA1withDSA - cryptojs/jsrsa
    * - SHA224withDSA - cryptojs/jsrsa
    * - SHA256withDSA - cryptojs/jsrsa
    * Here are supported elliptic cryptographic curve names and their aliases for ECDSA:
    * - secp256k1
    * - secp256r1, NIST P-256, P-256, prime256v1
    * - secp384r1, NIST P-384, P-384
    * NOTE1: DSA signing algorithm is also supported since crypto 1.1.5.
    * <h4>EXAMPLES</h4>
    * @example
    * // RSA signature generation
    * var sig = new KJUR.crypto.Signature({"alg": "SHA1withRSA"});
    * sig.init(prvKeyPEM);
    * sig.updateString('aaa');
    * var hSigVal = sig.sign();
    *
    * // DSA signature validation
    * var sig2 = new KJUR.crypto.Signature({"alg": "SHA1withDSA"});
    * sig2.init(certPEM);
    * sig.updateString('aaa');
    * var isValid = sig2.verify(hSigVal);
    *
    * // ECDSA signing
    * var sig = new KJUR.crypto.Signature({'alg':'SHA1withECDSA'});
    * sig.init(prvKeyPEM);
    * sig.updateString('aaa');
    * var sigValueHex = sig.sign();
    *
    * // ECDSA verifying
    * var sig2 = new KJUR.crypto.Signature({'alg':'SHA1withECDSA'});
    * sig.init(certPEM);
    * sig.updateString('aaa');
    * var isValid = sig.verify(sigValueHex);
    */
  @js.native
  trait Signature extends StObject {
    
    /**
      * Initialize this object for signing or verifying depends on key
      * @param key specifying public or private key as plain/encrypted PKCS#5/8 PEM file, certificate PEM or `RSAKey`, `KJUR.crypto.DSA` or `KJUR.crypto.ECDSA` object
      * @param pass (OPTION) passcode for encrypted private key
      * @description
      * This method is very useful initialize method for Signature class since
      * you just specify key then this method will automatically initialize it
      * using `KEYUTIL.getKey` method.
      * As for 'key',  following argument type are supported:
      * __signing__
      * - PEM formatted PKCS#8 encrypted RSA/ECDSA private key concluding "BEGIN ENCRYPTED PRIVATE KEY"
      * - PEM formatted PKCS#5 encrypted RSA/DSA private key concluding "BEGIN RSA/DSA PRIVATE KEY" and ",ENCRYPTED"
      * - PEM formatted PKCS#8 plain RSA/ECDSA private key concluding "BEGIN PRIVATE KEY"
      * - PEM formatted PKCS#5 plain RSA/DSA private key concluding "BEGIN RSA/DSA PRIVATE KEY" without ",ENCRYPTED"
      * - RSAKey object of private key
      * - KJUR.crypto.ECDSA object of private key
      * - KJUR.crypto.DSA object of private key
      *
      * __verification__
      * - PEM formatted PKCS#8 RSA/EC/DSA public key concluding "BEGIN PUBLIC KEY"
      * - PEM formatted X.509 certificate with RSA/EC/DSA public key concluding
      *   "BEGIN CERTIFICATE", "BEGIN X509 CERTIFICATE" or "BEGIN TRUSTED CERTIFICATE".
      * - RSAKey object of public key
      * - KJUR.crypto.ECDSA object of public key
      * - KJUR.crypto.DSA object of public key
      * @example
      * sig.init(sCertPEM)
      */
    def init(key: String): Unit = js.native
    def init(key: String, pass: String): Unit = js.native
    def init(key: ECCPrivateKey): Unit = js.native
    def init(key: ECCPrivateKey, pass: String): Unit = js.native
    def init(key: DSA): Unit = js.native
    def init(key: DSA, pass: String): Unit = js.native
    def init(key: ECDSA): Unit = js.native
    def init(key: ECDSA, pass: String): Unit = js.native
    def init(key: RSAKey): Unit = js.native
    def init(key: RSAKey, pass: String): Unit = js.native
    
    /**
      * set signature algorithm and provider
      * @param alg signature algorithm name
      * @param prov provider name
      * @example
      * md.setAlgAndProvider('SHA1withRSA', 'cryptojs/jsrsa');
      */
    def setAlgAndProvider(alg: String, prov: String): Unit = js.native
    
    /**
      * Returns the signature bytes of all data updates as a hexadecimal string
      * @return the signature bytes as a hexadecimal string
      * @example
      * var hSigValue = sig.sign()
      */
    def sign(): String = js.native
    
    /**
      * performs final update on the sign using hexadecimal string, then returns the signature bytes of all data updates as a hexadecimal string
      * @param hex hexadecimal string to final update
      * @return the signature bytes of a hexadecimal string
      * @example
      * var hSigValue = sig.signHex('1fdc33')
      */
    def signHex(hex: String): String = js.native
    
    /**
      * performs final update on the sign using string, then returns the signature bytes of all data updates as a hexadecimal string
      * @param str string to final update
      * @return the signature bytes of a hexadecimal string
      * @example
      * var hSigValue = sig.signString('aaa')
      */
    def signString(str: String): String = js.native
    
    /**
      * Updates the data to be signed or verified by a hexadecimal string
      * @param hex hexadecimal string to use for the update
      * @example
      * sig.updateHex('1f2f3f')
      */
    def updateHex(hex: String): Unit = js.native
    
    /**
      * Updates the data to be signed or verified by a string
      * @param str string to use for the update
      * @example
      * sig.updateString('aaa')
      */
    def updateString(str: String): Unit = js.native
    
    /**
      * verifies the passed-in signature.
      * @param hSigVal string to final update
      * @return true if the signature was verified, otherwise false
      * @example
      * var isValid = sig.verify('1fbcefdca4823a7(snip)')
      */
    def verify(hSigVal: String): Boolean = js.native
  }
}
