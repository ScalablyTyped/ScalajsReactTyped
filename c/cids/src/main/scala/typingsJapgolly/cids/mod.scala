package typingsJapgolly.cids

import typingsJapgolly.cids.cidsStrings.B
import typingsJapgolly.cids.cidsStrings.C
import typingsJapgolly.cids.cidsStrings.F
import typingsJapgolly.cids.cidsStrings.K
import typingsJapgolly.cids.cidsStrings.M
import typingsJapgolly.cids.cidsStrings.Null
import typingsJapgolly.cids.cidsStrings.T
import typingsJapgolly.cids.cidsStrings.U
import typingsJapgolly.cids.cidsStrings.V
import typingsJapgolly.cids.cidsStrings.Z
import typingsJapgolly.cids.cidsStrings.`0`
import typingsJapgolly.cids.cidsStrings.`7`
import typingsJapgolly.cids.cidsStrings.`9`
import typingsJapgolly.cids.cidsStrings.b_
import typingsJapgolly.cids.cidsStrings.base10
import typingsJapgolly.cids.cidsStrings.base16
import typingsJapgolly.cids.cidsStrings.base16upper
import typingsJapgolly.cids.cidsStrings.base2
import typingsJapgolly.cids.cidsStrings.base32
import typingsJapgolly.cids.cidsStrings.base32hex
import typingsJapgolly.cids.cidsStrings.base32hexpad
import typingsJapgolly.cids.cidsStrings.base32hexpadupper
import typingsJapgolly.cids.cidsStrings.base32hexupper
import typingsJapgolly.cids.cidsStrings.base32pad
import typingsJapgolly.cids.cidsStrings.base32padupper
import typingsJapgolly.cids.cidsStrings.base32upper
import typingsJapgolly.cids.cidsStrings.base32z
import typingsJapgolly.cids.cidsStrings.base36
import typingsJapgolly.cids.cidsStrings.base36upper
import typingsJapgolly.cids.cidsStrings.base58btc
import typingsJapgolly.cids.cidsStrings.base58flickr
import typingsJapgolly.cids.cidsStrings.base64
import typingsJapgolly.cids.cidsStrings.base64pad
import typingsJapgolly.cids.cidsStrings.base64url
import typingsJapgolly.cids.cidsStrings.base64urlpad
import typingsJapgolly.cids.cidsStrings.base8
import typingsJapgolly.cids.cidsStrings.c_
import typingsJapgolly.cids.cidsStrings.f_
import typingsJapgolly.cids.cidsStrings.h
import typingsJapgolly.cids.cidsStrings.identity
import typingsJapgolly.cids.cidsStrings.k_
import typingsJapgolly.cids.cidsStrings.m_
import typingsJapgolly.cids.cidsStrings.t_
import typingsJapgolly.cids.cidsStrings.u_
import typingsJapgolly.cids.cidsStrings.v_
import typingsJapgolly.cids.cidsStrings.z_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {Object} SerializedCID
    * @property {string} codec
    * @property {number} version
    * @property {Uint8Array} hash
    */
  /**
    * @typedef {0|1} CIDVersion
    * @typedef {import('multibase').BaseNameOrCode} BaseNameOrCode
    * @typedef {import('multicodec').CodecName} CodecName
    * @typedef {import('multicodec').CodecCode} CodecCode
    */
  /**
    * Class representing a CID `<mbase><version><mcodec><mhash>`
    * , as defined in [ipld/cid](https://github.com/multiformats/cid).
    *
    * @class CID
    */
  @JSImport("cids", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CID {
    def this(version: String) = this()
    def this(version: js.typedarray.Uint8Array) = this()
    def this(version: CID) = this()
    /**
      * Create a new CID.
      *
      * The algorithm for argument input is roughly:
      * ```
      * if (cid)
      *   -> create a copy
      * else if (str)
      *   if (1st char is on multibase table) -> CID String
      *   else -> bs58 encoded multihash
      * else if (Uint8Array)
      *   if (1st byte is 0 or 1) -> CID
      *   else -> multihash
      * else if (Number)
      *   -> construct CID by parts
      * ```
      *
      * @param {CIDVersion | string | Uint8Array | CID} version
      * @param {string|number} [codec]
      * @param {Uint8Array} [multihash]
      * @param {string} [multibaseName]
      *
      * @example
      * new CID(<version>, <codec>, <multihash>, <multibaseName>)
      * new CID(<cidStr>)
      * new CID(<cid.bytes>)
      * new CID(<multihash>)
      * new CID(<bs58 encoded multihash>)
      * new CID(<cid>)
      */
    def this(version: CIDVersion) = this()
    def this(version: String, codec: String) = this()
    def this(version: String, codec: Double) = this()
    def this(version: js.typedarray.Uint8Array, codec: String) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double) = this()
    def this(version: CIDVersion, codec: String) = this()
    def this(version: CIDVersion, codec: Double) = this()
    def this(version: CID, codec: String) = this()
    def this(version: CID, codec: Double) = this()
    def this(version: String, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: js.typedarray.Uint8Array, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CIDVersion, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: String, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: Double, multihash: js.typedarray.Uint8Array) = this()
    def this(version: CID, codec: Unit, multihash: js.typedarray.Uint8Array) = this()
    def this(version: String, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: String, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: String, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: String, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: String,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: Double,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(
      version: js.typedarray.Uint8Array,
      codec: Unit,
      multihash: js.typedarray.Uint8Array,
      multibaseName: String
    ) = this()
    def this(version: js.typedarray.Uint8Array, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CIDVersion, codec: Unit, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: String, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: String, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: Double, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: Double, multihash: Unit, multibaseName: String) = this()
    def this(version: CID, codec: Unit, multihash: js.typedarray.Uint8Array, multibaseName: String) = this()
    def this(version: CID, codec: Unit, multihash: Unit, multibaseName: String) = this()
  }
  @JSImport("cids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cids", "codecs")
  @js.native
  val codecs: Record[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_generated-types.CodecName */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_generated-types.CodecCode */ Any
  ] = js.native
  
  /**
    * Check if object is a CID instance
    *
    * @param {any} value
    * @returns {value is CID}
    */
  /* static member */
  inline def isCID(value: Any): /* is cids.cids.^ */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCID")(value.asInstanceOf[js.Any]).asInstanceOf[/* is cids.cids.^ */ Boolean]
  
  /**
    * Test if the given input is a valid CID object.
    * Throws if it is not.
    *
    * @param {any} other - The other CID.
    * @returns {void}
    */
  /* static member */
  inline def validateCID(other: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCID")(other.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cids.cidsStrings.base58btc
    - typingsJapgolly.cids.cidsStrings.identity
    - typingsJapgolly.cids.cidsStrings.Null
    - typingsJapgolly.cids.cidsStrings.`0`
    - typingsJapgolly.cids.cidsStrings.`7`
    - typingsJapgolly.cids.cidsStrings.`9`
    - typingsJapgolly.cids.cidsStrings.f_
    - typingsJapgolly.cids.cidsStrings.F
    - typingsJapgolly.cids.cidsStrings.v_
    - typingsJapgolly.cids.cidsStrings.V
    - typingsJapgolly.cids.cidsStrings.t_
    - typingsJapgolly.cids.cidsStrings.T
    - typingsJapgolly.cids.cidsStrings.b_
    - typingsJapgolly.cids.cidsStrings.B
    - typingsJapgolly.cids.cidsStrings.c_
    - typingsJapgolly.cids.cidsStrings.C
    - typingsJapgolly.cids.cidsStrings.h
    - typingsJapgolly.cids.cidsStrings.k_
    - typingsJapgolly.cids.cidsStrings.K
    - typingsJapgolly.cids.cidsStrings.z_
    - typingsJapgolly.cids.cidsStrings.Z
    - typingsJapgolly.cids.cidsStrings.m_
    - typingsJapgolly.cids.cidsStrings.M
    - typingsJapgolly.cids.cidsStrings.u_
    - typingsJapgolly.cids.cidsStrings.U
    - typingsJapgolly.cids.cidsStrings.base2
    - typingsJapgolly.cids.cidsStrings.base8
    - typingsJapgolly.cids.cidsStrings.base10
    - typingsJapgolly.cids.cidsStrings.base16
    - typingsJapgolly.cids.cidsStrings.base16upper
    - typingsJapgolly.cids.cidsStrings.base32hex
    - typingsJapgolly.cids.cidsStrings.base32hexupper
    - typingsJapgolly.cids.cidsStrings.base32hexpad
    - typingsJapgolly.cids.cidsStrings.base32hexpadupper
    - typingsJapgolly.cids.cidsStrings.base32
    - typingsJapgolly.cids.cidsStrings.base32upper
    - typingsJapgolly.cids.cidsStrings.base32pad
    - typingsJapgolly.cids.cidsStrings.base32padupper
    - typingsJapgolly.cids.cidsStrings.base32z
    - typingsJapgolly.cids.cidsStrings.base36
    - typingsJapgolly.cids.cidsStrings.base36upper
    - typingsJapgolly.cids.cidsStrings.base58flickr
    - typingsJapgolly.cids.cidsStrings.base64
    - typingsJapgolly.cids.cidsStrings.base64pad
    - typingsJapgolly.cids.cidsStrings.base64url
    - typingsJapgolly.cids.cidsStrings.base64urlpad
  */
  trait BaseNameOrCode extends StObject
  object BaseNameOrCode {
    
    inline def `0`: typingsJapgolly.cids.cidsStrings.`0` = "0".asInstanceOf[typingsJapgolly.cids.cidsStrings.`0`]
    
    inline def `7`: typingsJapgolly.cids.cidsStrings.`7` = "7".asInstanceOf[typingsJapgolly.cids.cidsStrings.`7`]
    
    inline def `9`: typingsJapgolly.cids.cidsStrings.`9` = "9".asInstanceOf[typingsJapgolly.cids.cidsStrings.`9`]
    
    inline def B: typingsJapgolly.cids.cidsStrings.B = "B".asInstanceOf[typingsJapgolly.cids.cidsStrings.B]
    
    inline def C: typingsJapgolly.cids.cidsStrings.C = "C".asInstanceOf[typingsJapgolly.cids.cidsStrings.C]
    
    inline def F: typingsJapgolly.cids.cidsStrings.F = "F".asInstanceOf[typingsJapgolly.cids.cidsStrings.F]
    
    inline def K: typingsJapgolly.cids.cidsStrings.K = "K".asInstanceOf[typingsJapgolly.cids.cidsStrings.K]
    
    inline def M: typingsJapgolly.cids.cidsStrings.M = "M".asInstanceOf[typingsJapgolly.cids.cidsStrings.M]
    
    inline def Null: typingsJapgolly.cids.cidsStrings.Null = "\u0000".asInstanceOf[typingsJapgolly.cids.cidsStrings.Null]
    
    inline def T: typingsJapgolly.cids.cidsStrings.T = "T".asInstanceOf[typingsJapgolly.cids.cidsStrings.T]
    
    inline def U: typingsJapgolly.cids.cidsStrings.U = "U".asInstanceOf[typingsJapgolly.cids.cidsStrings.U]
    
    inline def V: typingsJapgolly.cids.cidsStrings.V = "V".asInstanceOf[typingsJapgolly.cids.cidsStrings.V]
    
    inline def Z: typingsJapgolly.cids.cidsStrings.Z = "Z".asInstanceOf[typingsJapgolly.cids.cidsStrings.Z]
    
    inline def b: b_ = "b".asInstanceOf[b_]
    
    inline def base10: typingsJapgolly.cids.cidsStrings.base10 = "base10".asInstanceOf[typingsJapgolly.cids.cidsStrings.base10]
    
    inline def base16: typingsJapgolly.cids.cidsStrings.base16 = "base16".asInstanceOf[typingsJapgolly.cids.cidsStrings.base16]
    
    inline def base16upper: typingsJapgolly.cids.cidsStrings.base16upper = "base16upper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base16upper]
    
    inline def base2: typingsJapgolly.cids.cidsStrings.base2 = "base2".asInstanceOf[typingsJapgolly.cids.cidsStrings.base2]
    
    inline def base32: typingsJapgolly.cids.cidsStrings.base32 = "base32".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32]
    
    inline def base32hex: typingsJapgolly.cids.cidsStrings.base32hex = "base32hex".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32hex]
    
    inline def base32hexpad: typingsJapgolly.cids.cidsStrings.base32hexpad = "base32hexpad".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32hexpad]
    
    inline def base32hexpadupper: typingsJapgolly.cids.cidsStrings.base32hexpadupper = "base32hexpadupper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32hexpadupper]
    
    inline def base32hexupper: typingsJapgolly.cids.cidsStrings.base32hexupper = "base32hexupper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32hexupper]
    
    inline def base32pad: typingsJapgolly.cids.cidsStrings.base32pad = "base32pad".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32pad]
    
    inline def base32padupper: typingsJapgolly.cids.cidsStrings.base32padupper = "base32padupper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32padupper]
    
    inline def base32upper: typingsJapgolly.cids.cidsStrings.base32upper = "base32upper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32upper]
    
    inline def base32z: typingsJapgolly.cids.cidsStrings.base32z = "base32z".asInstanceOf[typingsJapgolly.cids.cidsStrings.base32z]
    
    inline def base36: typingsJapgolly.cids.cidsStrings.base36 = "base36".asInstanceOf[typingsJapgolly.cids.cidsStrings.base36]
    
    inline def base36upper: typingsJapgolly.cids.cidsStrings.base36upper = "base36upper".asInstanceOf[typingsJapgolly.cids.cidsStrings.base36upper]
    
    inline def base58btc: typingsJapgolly.cids.cidsStrings.base58btc = "base58btc".asInstanceOf[typingsJapgolly.cids.cidsStrings.base58btc]
    
    inline def base58flickr: typingsJapgolly.cids.cidsStrings.base58flickr = "base58flickr".asInstanceOf[typingsJapgolly.cids.cidsStrings.base58flickr]
    
    inline def base64: typingsJapgolly.cids.cidsStrings.base64 = "base64".asInstanceOf[typingsJapgolly.cids.cidsStrings.base64]
    
    inline def base64pad: typingsJapgolly.cids.cidsStrings.base64pad = "base64pad".asInstanceOf[typingsJapgolly.cids.cidsStrings.base64pad]
    
    inline def base64url: typingsJapgolly.cids.cidsStrings.base64url = "base64url".asInstanceOf[typingsJapgolly.cids.cidsStrings.base64url]
    
    inline def base64urlpad: typingsJapgolly.cids.cidsStrings.base64urlpad = "base64urlpad".asInstanceOf[typingsJapgolly.cids.cidsStrings.base64urlpad]
    
    inline def base8: typingsJapgolly.cids.cidsStrings.base8 = "base8".asInstanceOf[typingsJapgolly.cids.cidsStrings.base8]
    
    inline def c: c_ = "c".asInstanceOf[c_]
    
    inline def f: f_ = "f".asInstanceOf[f_]
    
    inline def h: typingsJapgolly.cids.cidsStrings.h = "h".asInstanceOf[typingsJapgolly.cids.cidsStrings.h]
    
    inline def identity: typingsJapgolly.cids.cidsStrings.identity = "identity".asInstanceOf[typingsJapgolly.cids.cidsStrings.identity]
    
    inline def k: k_ = "k".asInstanceOf[k_]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def t: t_ = "t".asInstanceOf[t_]
    
    inline def u: u_ = "u".asInstanceOf[u_]
    
    inline def v: v_ = "v".asInstanceOf[v_]
    
    inline def z: z_ = "z".asInstanceOf[z_]
  }
  
  /**
    * @typedef {Object} SerializedCID
    * @property {string} codec
    * @property {number} version
    * @property {Uint8Array} hash
    */
  /**
    * @typedef {0|1} CIDVersion
    * @typedef {import('multibase').BaseNameOrCode} BaseNameOrCode
    * @typedef {import('multicodec').CodecName} CodecName
    * @typedef {import('multicodec').CodecCode} CodecCode
    */
  /**
    * Class representing a CID `<mbase><version><mcodec><mhash>`
    * , as defined in [ipld/cid](https://github.com/multiformats/cid).
    *
    * @class CID
    */
  @js.native
  trait CID extends StObject {
    
    /**
      * The CID as a `Uint8Array`
      *
      * @returns {Uint8Array}
      *
      */
    def bytes: js.typedarray.Uint8Array = js.native
    
    /**
      * The codec of the CID in its number form.
      *
      * @returns {CodecCode}
      */
    def code: Any = js.native
    
    /**
      * The codec of the CID.
      *
      * @deprecated
      * @type {CodecName}
      */
    var codec: CodecName = js.native
    
    /**
      * Compare equality with another CID.
      *
      * @param {CID} other
      * @returns {boolean}
      */
    def equals(other: CID): Boolean = js.native
    
    var multibaseName: Any = js.native
    
    /**
      * The multihash of the CID.
      *
      * @type {Uint8Array}
      */
    var multihash: js.typedarray.Uint8Array = js.native
    
    /**
      * The prefix of the CID.
      *
      * @returns {Uint8Array}
      */
    def prefix: js.typedarray.Uint8Array = js.native
    
    /**
      * Encode the CID into a string.
      *
      * @param {BaseNameOrCode} [base=this.multibaseName] - Base encoding to use.
      * @returns {string}
      */
    def toBaseEncodedString(): String = js.native
    def toBaseEncodedString(
      base: base58btc | identity | Null | `0` | `7` | `9` | f_ | F | v_ | V | t_ | T | b_ | B | c_ | C | h | k_ | K | z_ | Z | m_ | M | u_ | U | base2 | base8 | base10 | base16 | base16upper | base32hex | base32hexupper | base32hexpad | base32hexpadupper | base32 | base32upper | base32pad | base32padupper | base32z | base36 | base36upper | base58flickr | base64 | base64pad | base64url | base64urlpad
    ): String = js.native
    
    /**
      * Serialize to a plain object.
      *
      * @returns {SerializedCID}
      */
    def toJSON(): SerializedCID = js.native
    
    def toString(
      base: base58btc | identity | Null | `0` | `7` | `9` | f_ | F | v_ | V | t_ | T | b_ | B | c_ | C | h | k_ | K | z_ | Z | m_ | M | u_ | U | base2 | base8 | base10 | base16 | base16upper | base32hex | base32hexupper | base32hexpad | base32hexpadupper | base32 | base32upper | base32pad | base32padupper | base32z | base36 | base36upper | base58flickr | base64 | base64pad | base64url | base64urlpad
    ): String = js.native
    
    /**
      * Convert to a CID of version `0`.
      *
      * @returns {CID}
      */
    def toV0(): CID = js.native
    
    /**
      * Convert to a CID of version `1`.
      *
      * @returns {CID}
      */
    def toV1(): CID = js.native
    
    /**
      * The version of the CID.
      *
      * @type {CIDVersion}
      */
    var version: CIDVersion = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cids.cidsInts.`0`
    - typingsJapgolly.cids.cidsInts.`1`
  */
  trait CIDVersion extends StObject
  object CIDVersion {
    
    inline def `0`: typingsJapgolly.cids.cidsInts.`0` = 0.asInstanceOf[typingsJapgolly.cids.cidsInts.`0`]
    
    inline def `1`: typingsJapgolly.cids.cidsInts.`1` = 1.asInstanceOf[typingsJapgolly.cids.cidsInts.`1`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cids.cidsInts.`0`
    - typingsJapgolly.cids.cidsInts.`1`
    - typingsJapgolly.cids.cidsInts.`2`
    - typingsJapgolly.cids.cidsInts.`3`
    - typingsJapgolly.cids.cidsInts.`4`
    - typingsJapgolly.cids.cidsInts.`6`
    - typingsJapgolly.cids.cidsInts.`17`
    - typingsJapgolly.cids.cidsInts.`18`
    - typingsJapgolly.cids.cidsInts.`19`
    - typingsJapgolly.cids.cidsInts.`20`
    - typingsJapgolly.cids.cidsInts.`21`
    - typingsJapgolly.cids.cidsInts.`22`
    - typingsJapgolly.cids.cidsInts.`23`
    - typingsJapgolly.cids.cidsInts.`24`
    - typingsJapgolly.cids.cidsInts.`25`
    - typingsJapgolly.cids.cidsInts.`26`
    - typingsJapgolly.cids.cidsInts.`27`
    - typingsJapgolly.cids.cidsInts.`28`
    - typingsJapgolly.cids.cidsInts.`29`
    - typingsJapgolly.cids.cidsInts.`30`
    - typingsJapgolly.cids.cidsInts.`33`
    - typingsJapgolly.cids.cidsInts.`34`
    - typingsJapgolly.cids.cidsInts.`35`
    - typingsJapgolly.cids.cidsInts.`41`
    - typingsJapgolly.cids.cidsInts.`42`
    - typingsJapgolly.cids.cidsInts.`47`
    - typingsJapgolly.cids.cidsInts.`48`
    - typingsJapgolly.cids.cidsInts.`49`
    - typingsJapgolly.cids.cidsInts.`50`
    - typingsJapgolly.cids.cidsInts.`51`
    - typingsJapgolly.cids.cidsInts.`53`
    - typingsJapgolly.cids.cidsInts.`54`
    - typingsJapgolly.cids.cidsInts.`55`
    - typingsJapgolly.cids.cidsInts.`56`
    - typingsJapgolly.cids.cidsInts.`80`
    - typingsJapgolly.cids.cidsInts.`81`
    - typingsJapgolly.cids.cidsInts.`85`
    - typingsJapgolly.cids.cidsInts.`86`
    - typingsJapgolly.cids.cidsInts.`96`
    - typingsJapgolly.cids.cidsInts.`99`
    - typingsJapgolly.cids.cidsInts.`112`
    - typingsJapgolly.cids.cidsInts.`113`
    - typingsJapgolly.cids.cidsInts.`114`
    - typingsJapgolly.cids.cidsInts.`120`
    - typingsJapgolly.cids.cidsInts.`123`
    - typingsJapgolly.cids.cidsInts.`124`
    - typingsJapgolly.cids.cidsInts.`129`
    - typingsJapgolly.cids.cidsInts.`130`
    - typingsJapgolly.cids.cidsInts.`131`
    - typingsJapgolly.cids.cidsInts.`132`
    - typingsJapgolly.cids.cidsInts.`133`
    - typingsJapgolly.cids.cidsInts.`134`
    - typingsJapgolly.cids.cidsInts.`144`
    - typingsJapgolly.cids.cidsInts.`145`
    - typingsJapgolly.cids.cidsInts.`146`
    - typingsJapgolly.cids.cidsInts.`147`
    - typingsJapgolly.cids.cidsInts.`148`
    - typingsJapgolly.cids.cidsInts.`149`
    - typingsJapgolly.cids.cidsInts.`150`
    - typingsJapgolly.cids.cidsInts.`151`
    - typingsJapgolly.cids.cidsInts.`152`
    - typingsJapgolly.cids.cidsInts.`176`
    - typingsJapgolly.cids.cidsInts.`177`
    - typingsJapgolly.cids.cidsInts.`178`
    - typingsJapgolly.cids.cidsInts.`192`
    - typingsJapgolly.cids.cidsInts.`193`
    - typingsJapgolly.cids.cidsInts.`206`
    - typingsJapgolly.cids.cidsInts.`208`
    - typingsJapgolly.cids.cidsInts.`209`
    - typingsJapgolly.cids.cidsInts.`212`
    - typingsJapgolly.cids.cidsInts.`213`
    - typingsJapgolly.cids.cidsInts.`214`
    - typingsJapgolly.cids.cidsInts.`224`
    - typingsJapgolly.cids.cidsInts.`225`
    - typingsJapgolly.cids.cidsInts.`226`
    - typingsJapgolly.cids.cidsInts.`227`
    - typingsJapgolly.cids.cidsInts.`228`
    - typingsJapgolly.cids.cidsInts.`229`
    - typingsJapgolly.cids.cidsInts.`230`
    - typingsJapgolly.cids.cidsInts.`231`
    - typingsJapgolly.cids.cidsInts.`234`
    - typingsJapgolly.cids.cidsInts.`235`
    - typingsJapgolly.cids.cidsInts.`236`
    - typingsJapgolly.cids.cidsInts.`237`
    - typingsJapgolly.cids.cidsInts.`238`
    - typingsJapgolly.cids.cidsInts.`240`
    - typingsJapgolly.cids.cidsInts.`241`
    - typingsJapgolly.cids.cidsInts.`250`
    - typingsJapgolly.cids.cidsInts.`251`
    - typingsJapgolly.cids.cidsInts.`273`
    - typingsJapgolly.cids.cidsInts.`275`
    - typingsJapgolly.cids.cidsInts.`276`
    - typingsJapgolly.cids.cidsInts.`277`
    - typingsJapgolly.cids.cidsInts.`290`
    - typingsJapgolly.cids.cidsInts.`297`
    - typingsJapgolly.cids.cidsInts.`301`
    - typingsJapgolly.cids.cidsInts.`302`
    - typingsJapgolly.cids.cidsInts.`400`
    - typingsJapgolly.cids.cidsInts.`406`
    - typingsJapgolly.cids.cidsInts.`421`
    - typingsJapgolly.cids.cidsInts.`443`
    - typingsJapgolly.cids.cidsInts.`444`
    - typingsJapgolly.cids.cidsInts.`445`
    - typingsJapgolly.cids.cidsInts.`446`
    - typingsJapgolly.cids.cidsInts.`447`
    - typingsJapgolly.cids.cidsInts.`448`
    - typingsJapgolly.cids.cidsInts.`460`
    - typingsJapgolly.cids.cidsInts.`477`
    - typingsJapgolly.cids.cidsInts.`478`
    - typingsJapgolly.cids.cidsInts.`479`
    - typingsJapgolly.cids.cidsInts.`480`
    - typingsJapgolly.cids.cidsInts.`512`
    - typingsJapgolly.cids.cidsInts.`513`
    - typingsJapgolly.cids.cidsInts.`769`
    - typingsJapgolly.cids.cidsInts.`4114`
    - typingsJapgolly.cids.cidsInts.`4178`
    - typingsJapgolly.cids.cidsInts.`4179`
    - typingsJapgolly.cids.cidsInts.`4180`
    - typingsJapgolly.cids.cidsInts.`4181`
    - typingsJapgolly.cids.cidsInts.`4352`
    - typingsJapgolly.cids.cidsInts.`4608`
    - typingsJapgolly.cids.cidsInts.`4609`
    - typingsJapgolly.cids.cidsInts.`4610`
    - typingsJapgolly.cids.cidsInts.`4611`
    - typingsJapgolly.cids.cidsInts.`4612`
    - typingsJapgolly.cids.cidsInts.`4864`
    - typingsJapgolly.cids.cidsInts.`7425`
    - typingsJapgolly.cids.cidsInts.`21325`
    - typingsJapgolly.cids.cidsInts.`45569`
    - typingsJapgolly.cids.cidsInts.`45570`
    - typingsJapgolly.cids.cidsInts.`45571`
    - typingsJapgolly.cids.cidsInts.`45572`
    - typingsJapgolly.cids.cidsInts.`45573`
    - typingsJapgolly.cids.cidsInts.`45574`
    - typingsJapgolly.cids.cidsInts.`45575`
    - typingsJapgolly.cids.cidsInts.`45576`
    - typingsJapgolly.cids.cidsInts.`45577`
    - typingsJapgolly.cids.cidsInts.`45578`
    - typingsJapgolly.cids.cidsInts.`45579`
    - typingsJapgolly.cids.cidsInts.`45580`
    - typingsJapgolly.cids.cidsInts.`45581`
    - typingsJapgolly.cids.cidsInts.`45582`
    - typingsJapgolly.cids.cidsInts.`45583`
    - typingsJapgolly.cids.cidsInts.`45584`
    - typingsJapgolly.cids.cidsInts.`45585`
    - typingsJapgolly.cids.cidsInts.`45586`
    - typingsJapgolly.cids.cidsInts.`45587`
    - typingsJapgolly.cids.cidsInts.`45588`
    - typingsJapgolly.cids.cidsInts.`45589`
    - typingsJapgolly.cids.cidsInts.`45590`
    - typingsJapgolly.cids.cidsInts.`45591`
    - typingsJapgolly.cids.cidsInts.`45592`
    - typingsJapgolly.cids.cidsInts.`45593`
    - typingsJapgolly.cids.cidsInts.`45594`
    - typingsJapgolly.cids.cidsInts.`45595`
    - typingsJapgolly.cids.cidsInts.`45596`
    - typingsJapgolly.cids.cidsInts.`45597`
    - typingsJapgolly.cids.cidsInts.`45598`
    - typingsJapgolly.cids.cidsInts.`45599`
    - typingsJapgolly.cids.cidsInts.`45600`
    - typingsJapgolly.cids.cidsInts.`45601`
    - typingsJapgolly.cids.cidsInts.`45602`
    - typingsJapgolly.cids.cidsInts.`45603`
    - typingsJapgolly.cids.cidsInts.`45604`
    - typingsJapgolly.cids.cidsInts.`45605`
    - typingsJapgolly.cids.cidsInts.`45606`
    - typingsJapgolly.cids.cidsInts.`45607`
    - typingsJapgolly.cids.cidsInts.`45608`
    - typingsJapgolly.cids.cidsInts.`45609`
    - typingsJapgolly.cids.cidsInts.`45610`
    - typingsJapgolly.cids.cidsInts.`45611`
    - typingsJapgolly.cids.cidsInts.`45612`
    - typingsJapgolly.cids.cidsInts.`45613`
    - typingsJapgolly.cids.cidsInts.`45614`
    - typingsJapgolly.cids.cidsInts.`45615`
    - typingsJapgolly.cids.cidsInts.`45616`
    - typingsJapgolly.cids.cidsInts.`45617`
    - typingsJapgolly.cids.cidsInts.`45618`
    - typingsJapgolly.cids.cidsInts.`45619`
    - typingsJapgolly.cids.cidsInts.`45620`
    - typingsJapgolly.cids.cidsInts.`45621`
    - typingsJapgolly.cids.cidsInts.`45622`
    - typingsJapgolly.cids.cidsInts.`45623`
    - typingsJapgolly.cids.cidsInts.`45624`
    - typingsJapgolly.cids.cidsInts.`45625`
    - typingsJapgolly.cids.cidsInts.`45626`
    - typingsJapgolly.cids.cidsInts.`45627`
    - typingsJapgolly.cids.cidsInts.`45628`
    - typingsJapgolly.cids.cidsInts.`45629`
    - typingsJapgolly.cids.cidsInts.`45630`
    - typingsJapgolly.cids.cidsInts.`45631`
    - typingsJapgolly.cids.cidsInts.`45632`
    - typingsJapgolly.cids.cidsInts.`45633`
    - typingsJapgolly.cids.cidsInts.`45634`
    - typingsJapgolly.cids.cidsInts.`45635`
    - typingsJapgolly.cids.cidsInts.`45636`
    - typingsJapgolly.cids.cidsInts.`45637`
    - typingsJapgolly.cids.cidsInts.`45638`
    - typingsJapgolly.cids.cidsInts.`45639`
    - typingsJapgolly.cids.cidsInts.`45640`
    - typingsJapgolly.cids.cidsInts.`45641`
    - typingsJapgolly.cids.cidsInts.`45642`
    - typingsJapgolly.cids.cidsInts.`45643`
    - typingsJapgolly.cids.cidsInts.`45644`
    - typingsJapgolly.cids.cidsInts.`45645`
    - typingsJapgolly.cids.cidsInts.`45646`
    - typingsJapgolly.cids.cidsInts.`45647`
    - typingsJapgolly.cids.cidsInts.`45648`
    - typingsJapgolly.cids.cidsInts.`45649`
    - typingsJapgolly.cids.cidsInts.`45650`
    - typingsJapgolly.cids.cidsInts.`45651`
    - typingsJapgolly.cids.cidsInts.`45652`
    - typingsJapgolly.cids.cidsInts.`45653`
    - typingsJapgolly.cids.cidsInts.`45654`
    - typingsJapgolly.cids.cidsInts.`45655`
    - typingsJapgolly.cids.cidsInts.`45656`
    - typingsJapgolly.cids.cidsInts.`45657`
    - typingsJapgolly.cids.cidsInts.`45658`
    - typingsJapgolly.cids.cidsInts.`45659`
    - typingsJapgolly.cids.cidsInts.`45660`
    - typingsJapgolly.cids.cidsInts.`45661`
    - typingsJapgolly.cids.cidsInts.`45662`
    - typingsJapgolly.cids.cidsInts.`45663`
    - typingsJapgolly.cids.cidsInts.`45664`
    - typingsJapgolly.cids.cidsInts.`45825`
    - typingsJapgolly.cids.cidsInts.`45826`
    - typingsJapgolly.cids.cidsInts.`45827`
    - typingsJapgolly.cids.cidsInts.`45828`
    - typingsJapgolly.cids.cidsInts.`45829`
    - typingsJapgolly.cids.cidsInts.`45830`
    - typingsJapgolly.cids.cidsInts.`45831`
    - typingsJapgolly.cids.cidsInts.`45832`
    - typingsJapgolly.cids.cidsInts.`45833`
    - typingsJapgolly.cids.cidsInts.`45834`
    - typingsJapgolly.cids.cidsInts.`45835`
    - typingsJapgolly.cids.cidsInts.`45836`
    - typingsJapgolly.cids.cidsInts.`45837`
    - typingsJapgolly.cids.cidsInts.`45838`
    - typingsJapgolly.cids.cidsInts.`45839`
    - typingsJapgolly.cids.cidsInts.`45840`
    - typingsJapgolly.cids.cidsInts.`45841`
    - typingsJapgolly.cids.cidsInts.`45842`
    - typingsJapgolly.cids.cidsInts.`45843`
    - typingsJapgolly.cids.cidsInts.`45844`
    - typingsJapgolly.cids.cidsInts.`45845`
    - typingsJapgolly.cids.cidsInts.`45846`
    - typingsJapgolly.cids.cidsInts.`45847`
    - typingsJapgolly.cids.cidsInts.`45848`
    - typingsJapgolly.cids.cidsInts.`45849`
    - typingsJapgolly.cids.cidsInts.`45850`
    - typingsJapgolly.cids.cidsInts.`45851`
    - typingsJapgolly.cids.cidsInts.`45852`
    - typingsJapgolly.cids.cidsInts.`45853`
    - typingsJapgolly.cids.cidsInts.`45854`
    - typingsJapgolly.cids.cidsInts.`45855`
    - typingsJapgolly.cids.cidsInts.`45856`
    - typingsJapgolly.cids.cidsInts.`45857`
    - typingsJapgolly.cids.cidsInts.`45858`
    - typingsJapgolly.cids.cidsInts.`45859`
    - typingsJapgolly.cids.cidsInts.`45860`
    - typingsJapgolly.cids.cidsInts.`45861`
    - typingsJapgolly.cids.cidsInts.`45862`
    - typingsJapgolly.cids.cidsInts.`45863`
    - typingsJapgolly.cids.cidsInts.`45864`
    - typingsJapgolly.cids.cidsInts.`45865`
    - typingsJapgolly.cids.cidsInts.`45866`
    - typingsJapgolly.cids.cidsInts.`45867`
    - typingsJapgolly.cids.cidsInts.`45868`
    - typingsJapgolly.cids.cidsInts.`45869`
    - typingsJapgolly.cids.cidsInts.`45870`
    - typingsJapgolly.cids.cidsInts.`45871`
    - typingsJapgolly.cids.cidsInts.`45872`
    - typingsJapgolly.cids.cidsInts.`45873`
    - typingsJapgolly.cids.cidsInts.`45874`
    - typingsJapgolly.cids.cidsInts.`45875`
    - typingsJapgolly.cids.cidsInts.`45876`
    - typingsJapgolly.cids.cidsInts.`45877`
    - typingsJapgolly.cids.cidsInts.`45878`
    - typingsJapgolly.cids.cidsInts.`45879`
    - typingsJapgolly.cids.cidsInts.`45880`
    - typingsJapgolly.cids.cidsInts.`45881`
    - typingsJapgolly.cids.cidsInts.`45882`
    - typingsJapgolly.cids.cidsInts.`45883`
    - typingsJapgolly.cids.cidsInts.`45884`
    - typingsJapgolly.cids.cidsInts.`45885`
    - typingsJapgolly.cids.cidsInts.`45886`
    - typingsJapgolly.cids.cidsInts.`45887`
    - typingsJapgolly.cids.cidsInts.`45888`
    - typingsJapgolly.cids.cidsInts.`45889`
    - typingsJapgolly.cids.cidsInts.`45890`
    - typingsJapgolly.cids.cidsInts.`45891`
    - typingsJapgolly.cids.cidsInts.`45892`
    - typingsJapgolly.cids.cidsInts.`45893`
    - typingsJapgolly.cids.cidsInts.`45894`
    - typingsJapgolly.cids.cidsInts.`45895`
    - typingsJapgolly.cids.cidsInts.`45896`
    - typingsJapgolly.cids.cidsInts.`45897`
    - typingsJapgolly.cids.cidsInts.`45898`
    - typingsJapgolly.cids.cidsInts.`45899`
    - typingsJapgolly.cids.cidsInts.`45900`
    - typingsJapgolly.cids.cidsInts.`45901`
    - typingsJapgolly.cids.cidsInts.`45902`
    - typingsJapgolly.cids.cidsInts.`45903`
    - typingsJapgolly.cids.cidsInts.`45904`
    - typingsJapgolly.cids.cidsInts.`45905`
    - typingsJapgolly.cids.cidsInts.`45906`
    - typingsJapgolly.cids.cidsInts.`45907`
    - typingsJapgolly.cids.cidsInts.`45908`
    - typingsJapgolly.cids.cidsInts.`45909`
    - typingsJapgolly.cids.cidsInts.`45910`
    - typingsJapgolly.cids.cidsInts.`45911`
    - typingsJapgolly.cids.cidsInts.`45912`
    - typingsJapgolly.cids.cidsInts.`45913`
    - typingsJapgolly.cids.cidsInts.`45914`
    - typingsJapgolly.cids.cidsInts.`45915`
    - typingsJapgolly.cids.cidsInts.`45916`
    - typingsJapgolly.cids.cidsInts.`45917`
    - typingsJapgolly.cids.cidsInts.`45918`
    - typingsJapgolly.cids.cidsInts.`45919`
    - typingsJapgolly.cids.cidsInts.`45920`
    - typingsJapgolly.cids.cidsInts.`45921`
    - typingsJapgolly.cids.cidsInts.`45922`
    - typingsJapgolly.cids.cidsInts.`45923`
    - typingsJapgolly.cids.cidsInts.`45924`
    - typingsJapgolly.cids.cidsInts.`45925`
    - typingsJapgolly.cids.cidsInts.`45926`
    - typingsJapgolly.cids.cidsInts.`45927`
    - typingsJapgolly.cids.cidsInts.`45928`
    - typingsJapgolly.cids.cidsInts.`45929`
    - typingsJapgolly.cids.cidsInts.`45930`
    - typingsJapgolly.cids.cidsInts.`45931`
    - typingsJapgolly.cids.cidsInts.`45932`
    - typingsJapgolly.cids.cidsInts.`45933`
    - typingsJapgolly.cids.cidsInts.`45934`
    - typingsJapgolly.cids.cidsInts.`45935`
    - typingsJapgolly.cids.cidsInts.`45936`
    - typingsJapgolly.cids.cidsInts.`45937`
    - typingsJapgolly.cids.cidsInts.`45938`
    - typingsJapgolly.cids.cidsInts.`45939`
    - typingsJapgolly.cids.cidsInts.`45940`
    - typingsJapgolly.cids.cidsInts.`45941`
    - typingsJapgolly.cids.cidsInts.`45942`
    - typingsJapgolly.cids.cidsInts.`45943`
    - typingsJapgolly.cids.cidsInts.`45944`
    - typingsJapgolly.cids.cidsInts.`45945`
    - typingsJapgolly.cids.cidsInts.`45946`
    - typingsJapgolly.cids.cidsInts.`45947`
    - typingsJapgolly.cids.cidsInts.`45948`
    - typingsJapgolly.cids.cidsInts.`45949`
    - typingsJapgolly.cids.cidsInts.`45950`
    - typingsJapgolly.cids.cidsInts.`45951`
    - typingsJapgolly.cids.cidsInts.`45952`
    - typingsJapgolly.cids.cidsInts.`45953`
    - typingsJapgolly.cids.cidsInts.`45954`
    - typingsJapgolly.cids.cidsInts.`45955`
    - typingsJapgolly.cids.cidsInts.`45956`
    - typingsJapgolly.cids.cidsInts.`45957`
    - typingsJapgolly.cids.cidsInts.`45958`
    - typingsJapgolly.cids.cidsInts.`45959`
    - typingsJapgolly.cids.cidsInts.`45960`
    - typingsJapgolly.cids.cidsInts.`45961`
    - typingsJapgolly.cids.cidsInts.`45962`
    - typingsJapgolly.cids.cidsInts.`45963`
    - typingsJapgolly.cids.cidsInts.`45964`
    - typingsJapgolly.cids.cidsInts.`45965`
    - typingsJapgolly.cids.cidsInts.`45966`
    - typingsJapgolly.cids.cidsInts.`45967`
    - typingsJapgolly.cids.cidsInts.`45968`
    - typingsJapgolly.cids.cidsInts.`45969`
    - typingsJapgolly.cids.cidsInts.`45970`
    - typingsJapgolly.cids.cidsInts.`45971`
    - typingsJapgolly.cids.cidsInts.`45972`
    - typingsJapgolly.cids.cidsInts.`45973`
    - typingsJapgolly.cids.cidsInts.`45974`
    - typingsJapgolly.cids.cidsInts.`45975`
    - typingsJapgolly.cids.cidsInts.`45976`
    - typingsJapgolly.cids.cidsInts.`45977`
    - typingsJapgolly.cids.cidsInts.`45978`
    - typingsJapgolly.cids.cidsInts.`45979`
    - typingsJapgolly.cids.cidsInts.`45980`
    - typingsJapgolly.cids.cidsInts.`45981`
    - typingsJapgolly.cids.cidsInts.`45982`
    - typingsJapgolly.cids.cidsInts.`45983`
    - typingsJapgolly.cids.cidsInts.`45984`
    - typingsJapgolly.cids.cidsInts.`45985`
    - typingsJapgolly.cids.cidsInts.`45986`
    - typingsJapgolly.cids.cidsInts.`45987`
    - typingsJapgolly.cids.cidsInts.`45988`
    - typingsJapgolly.cids.cidsInts.`45989`
    - typingsJapgolly.cids.cidsInts.`45990`
    - typingsJapgolly.cids.cidsInts.`45991`
    - typingsJapgolly.cids.cidsInts.`45992`
    - typingsJapgolly.cids.cidsInts.`45993`
    - typingsJapgolly.cids.cidsInts.`45994`
    - typingsJapgolly.cids.cidsInts.`45995`
    - typingsJapgolly.cids.cidsInts.`45996`
    - typingsJapgolly.cids.cidsInts.`45997`
    - typingsJapgolly.cids.cidsInts.`45998`
    - typingsJapgolly.cids.cidsInts.`45999`
    - typingsJapgolly.cids.cidsInts.`46000`
    - typingsJapgolly.cids.cidsInts.`46001`
    - typingsJapgolly.cids.cidsInts.`46002`
    - typingsJapgolly.cids.cidsInts.`46003`
    - typingsJapgolly.cids.cidsInts.`46004`
    - typingsJapgolly.cids.cidsInts.`46005`
    - typingsJapgolly.cids.cidsInts.`46006`
    - typingsJapgolly.cids.cidsInts.`46007`
    - typingsJapgolly.cids.cidsInts.`46008`
    - typingsJapgolly.cids.cidsInts.`46009`
    - typingsJapgolly.cids.cidsInts.`46010`
    - typingsJapgolly.cids.cidsInts.`46011`
    - typingsJapgolly.cids.cidsInts.`46012`
    - typingsJapgolly.cids.cidsInts.`46013`
    - typingsJapgolly.cids.cidsInts.`46014`
    - typingsJapgolly.cids.cidsInts.`46015`
    - typingsJapgolly.cids.cidsInts.`46016`
    - typingsJapgolly.cids.cidsInts.`46017`
    - typingsJapgolly.cids.cidsInts.`46018`
    - typingsJapgolly.cids.cidsInts.`46019`
    - typingsJapgolly.cids.cidsInts.`46020`
    - typingsJapgolly.cids.cidsInts.`46021`
    - typingsJapgolly.cids.cidsInts.`46022`
    - typingsJapgolly.cids.cidsInts.`46023`
    - typingsJapgolly.cids.cidsInts.`46024`
    - typingsJapgolly.cids.cidsInts.`46025`
    - typingsJapgolly.cids.cidsInts.`46026`
    - typingsJapgolly.cids.cidsInts.`46027`
    - typingsJapgolly.cids.cidsInts.`46028`
    - typingsJapgolly.cids.cidsInts.`46029`
    - typingsJapgolly.cids.cidsInts.`46030`
    - typingsJapgolly.cids.cidsInts.`46031`
    - typingsJapgolly.cids.cidsInts.`46032`
    - typingsJapgolly.cids.cidsInts.`46033`
    - typingsJapgolly.cids.cidsInts.`46034`
    - typingsJapgolly.cids.cidsInts.`46035`
    - typingsJapgolly.cids.cidsInts.`46036`
    - typingsJapgolly.cids.cidsInts.`46037`
    - typingsJapgolly.cids.cidsInts.`46038`
    - typingsJapgolly.cids.cidsInts.`46039`
    - typingsJapgolly.cids.cidsInts.`46040`
    - typingsJapgolly.cids.cidsInts.`46041`
    - typingsJapgolly.cids.cidsInts.`46042`
    - typingsJapgolly.cids.cidsInts.`46043`
    - typingsJapgolly.cids.cidsInts.`46044`
    - typingsJapgolly.cids.cidsInts.`46045`
    - typingsJapgolly.cids.cidsInts.`46046`
    - typingsJapgolly.cids.cidsInts.`46047`
    - typingsJapgolly.cids.cidsInts.`46048`
    - typingsJapgolly.cids.cidsInts.`46081`
    - typingsJapgolly.cids.cidsInts.`46082`
    - typingsJapgolly.cids.cidsInts.`52753`
    - typingsJapgolly.cids.cidsInts.`61697`
    - typingsJapgolly.cids.cidsInts.`61698`
    - typingsJapgolly.cids.cidsInts.`8417572`
    - typingsJapgolly.cids.cidsInts.`8483108`
    - typingsJapgolly.cids.cidsInts.`9728292`
    - typingsJapgolly.cids.cidsInts.`9793828`
    - typingsJapgolly.cids.cidsInts.`10645796`
    - typingsJapgolly.cids.cidsInts.`10711332`
    - typingsJapgolly.cids.cidsInts.`11639056`
  */
  trait CodecCode extends StObject
  object CodecCode {
    
    inline def `0`: typingsJapgolly.cids.cidsInts.`0` = 0.asInstanceOf[typingsJapgolly.cids.cidsInts.`0`]
    
    inline def `1`: typingsJapgolly.cids.cidsInts.`1` = 1.asInstanceOf[typingsJapgolly.cids.cidsInts.`1`]
    
    inline def `10645796`: typingsJapgolly.cids.cidsInts.`10645796` = 10645796.asInstanceOf[typingsJapgolly.cids.cidsInts.`10645796`]
    
    inline def `10711332`: typingsJapgolly.cids.cidsInts.`10711332` = 10711332.asInstanceOf[typingsJapgolly.cids.cidsInts.`10711332`]
    
    inline def `112`: typingsJapgolly.cids.cidsInts.`112` = 112.asInstanceOf[typingsJapgolly.cids.cidsInts.`112`]
    
    inline def `113`: typingsJapgolly.cids.cidsInts.`113` = 113.asInstanceOf[typingsJapgolly.cids.cidsInts.`113`]
    
    inline def `114`: typingsJapgolly.cids.cidsInts.`114` = 114.asInstanceOf[typingsJapgolly.cids.cidsInts.`114`]
    
    inline def `11639056`: typingsJapgolly.cids.cidsInts.`11639056` = 11639056.asInstanceOf[typingsJapgolly.cids.cidsInts.`11639056`]
    
    inline def `120`: typingsJapgolly.cids.cidsInts.`120` = 120.asInstanceOf[typingsJapgolly.cids.cidsInts.`120`]
    
    inline def `123`: typingsJapgolly.cids.cidsInts.`123` = 123.asInstanceOf[typingsJapgolly.cids.cidsInts.`123`]
    
    inline def `124`: typingsJapgolly.cids.cidsInts.`124` = 124.asInstanceOf[typingsJapgolly.cids.cidsInts.`124`]
    
    inline def `129`: typingsJapgolly.cids.cidsInts.`129` = 129.asInstanceOf[typingsJapgolly.cids.cidsInts.`129`]
    
    inline def `130`: typingsJapgolly.cids.cidsInts.`130` = 130.asInstanceOf[typingsJapgolly.cids.cidsInts.`130`]
    
    inline def `131`: typingsJapgolly.cids.cidsInts.`131` = 131.asInstanceOf[typingsJapgolly.cids.cidsInts.`131`]
    
    inline def `132`: typingsJapgolly.cids.cidsInts.`132` = 132.asInstanceOf[typingsJapgolly.cids.cidsInts.`132`]
    
    inline def `133`: typingsJapgolly.cids.cidsInts.`133` = 133.asInstanceOf[typingsJapgolly.cids.cidsInts.`133`]
    
    inline def `134`: typingsJapgolly.cids.cidsInts.`134` = 134.asInstanceOf[typingsJapgolly.cids.cidsInts.`134`]
    
    inline def `144`: typingsJapgolly.cids.cidsInts.`144` = 144.asInstanceOf[typingsJapgolly.cids.cidsInts.`144`]
    
    inline def `145`: typingsJapgolly.cids.cidsInts.`145` = 145.asInstanceOf[typingsJapgolly.cids.cidsInts.`145`]
    
    inline def `146`: typingsJapgolly.cids.cidsInts.`146` = 146.asInstanceOf[typingsJapgolly.cids.cidsInts.`146`]
    
    inline def `147`: typingsJapgolly.cids.cidsInts.`147` = 147.asInstanceOf[typingsJapgolly.cids.cidsInts.`147`]
    
    inline def `148`: typingsJapgolly.cids.cidsInts.`148` = 148.asInstanceOf[typingsJapgolly.cids.cidsInts.`148`]
    
    inline def `149`: typingsJapgolly.cids.cidsInts.`149` = 149.asInstanceOf[typingsJapgolly.cids.cidsInts.`149`]
    
    inline def `150`: typingsJapgolly.cids.cidsInts.`150` = 150.asInstanceOf[typingsJapgolly.cids.cidsInts.`150`]
    
    inline def `151`: typingsJapgolly.cids.cidsInts.`151` = 151.asInstanceOf[typingsJapgolly.cids.cidsInts.`151`]
    
    inline def `152`: typingsJapgolly.cids.cidsInts.`152` = 152.asInstanceOf[typingsJapgolly.cids.cidsInts.`152`]
    
    inline def `17`: typingsJapgolly.cids.cidsInts.`17` = 17.asInstanceOf[typingsJapgolly.cids.cidsInts.`17`]
    
    inline def `176`: typingsJapgolly.cids.cidsInts.`176` = 176.asInstanceOf[typingsJapgolly.cids.cidsInts.`176`]
    
    inline def `177`: typingsJapgolly.cids.cidsInts.`177` = 177.asInstanceOf[typingsJapgolly.cids.cidsInts.`177`]
    
    inline def `178`: typingsJapgolly.cids.cidsInts.`178` = 178.asInstanceOf[typingsJapgolly.cids.cidsInts.`178`]
    
    inline def `18`: typingsJapgolly.cids.cidsInts.`18` = 18.asInstanceOf[typingsJapgolly.cids.cidsInts.`18`]
    
    inline def `19`: typingsJapgolly.cids.cidsInts.`19` = 19.asInstanceOf[typingsJapgolly.cids.cidsInts.`19`]
    
    inline def `192`: typingsJapgolly.cids.cidsInts.`192` = 192.asInstanceOf[typingsJapgolly.cids.cidsInts.`192`]
    
    inline def `193`: typingsJapgolly.cids.cidsInts.`193` = 193.asInstanceOf[typingsJapgolly.cids.cidsInts.`193`]
    
    inline def `2`: typingsJapgolly.cids.cidsInts.`2` = 2.asInstanceOf[typingsJapgolly.cids.cidsInts.`2`]
    
    inline def `20`: typingsJapgolly.cids.cidsInts.`20` = 20.asInstanceOf[typingsJapgolly.cids.cidsInts.`20`]
    
    inline def `206`: typingsJapgolly.cids.cidsInts.`206` = 206.asInstanceOf[typingsJapgolly.cids.cidsInts.`206`]
    
    inline def `208`: typingsJapgolly.cids.cidsInts.`208` = 208.asInstanceOf[typingsJapgolly.cids.cidsInts.`208`]
    
    inline def `209`: typingsJapgolly.cids.cidsInts.`209` = 209.asInstanceOf[typingsJapgolly.cids.cidsInts.`209`]
    
    inline def `21`: typingsJapgolly.cids.cidsInts.`21` = 21.asInstanceOf[typingsJapgolly.cids.cidsInts.`21`]
    
    inline def `212`: typingsJapgolly.cids.cidsInts.`212` = 212.asInstanceOf[typingsJapgolly.cids.cidsInts.`212`]
    
    inline def `213`: typingsJapgolly.cids.cidsInts.`213` = 213.asInstanceOf[typingsJapgolly.cids.cidsInts.`213`]
    
    inline def `21325`: typingsJapgolly.cids.cidsInts.`21325` = 21325.asInstanceOf[typingsJapgolly.cids.cidsInts.`21325`]
    
    inline def `214`: typingsJapgolly.cids.cidsInts.`214` = 214.asInstanceOf[typingsJapgolly.cids.cidsInts.`214`]
    
    inline def `22`: typingsJapgolly.cids.cidsInts.`22` = 22.asInstanceOf[typingsJapgolly.cids.cidsInts.`22`]
    
    inline def `224`: typingsJapgolly.cids.cidsInts.`224` = 224.asInstanceOf[typingsJapgolly.cids.cidsInts.`224`]
    
    inline def `225`: typingsJapgolly.cids.cidsInts.`225` = 225.asInstanceOf[typingsJapgolly.cids.cidsInts.`225`]
    
    inline def `226`: typingsJapgolly.cids.cidsInts.`226` = 226.asInstanceOf[typingsJapgolly.cids.cidsInts.`226`]
    
    inline def `227`: typingsJapgolly.cids.cidsInts.`227` = 227.asInstanceOf[typingsJapgolly.cids.cidsInts.`227`]
    
    inline def `228`: typingsJapgolly.cids.cidsInts.`228` = 228.asInstanceOf[typingsJapgolly.cids.cidsInts.`228`]
    
    inline def `229`: typingsJapgolly.cids.cidsInts.`229` = 229.asInstanceOf[typingsJapgolly.cids.cidsInts.`229`]
    
    inline def `23`: typingsJapgolly.cids.cidsInts.`23` = 23.asInstanceOf[typingsJapgolly.cids.cidsInts.`23`]
    
    inline def `230`: typingsJapgolly.cids.cidsInts.`230` = 230.asInstanceOf[typingsJapgolly.cids.cidsInts.`230`]
    
    inline def `231`: typingsJapgolly.cids.cidsInts.`231` = 231.asInstanceOf[typingsJapgolly.cids.cidsInts.`231`]
    
    inline def `234`: typingsJapgolly.cids.cidsInts.`234` = 234.asInstanceOf[typingsJapgolly.cids.cidsInts.`234`]
    
    inline def `235`: typingsJapgolly.cids.cidsInts.`235` = 235.asInstanceOf[typingsJapgolly.cids.cidsInts.`235`]
    
    inline def `236`: typingsJapgolly.cids.cidsInts.`236` = 236.asInstanceOf[typingsJapgolly.cids.cidsInts.`236`]
    
    inline def `237`: typingsJapgolly.cids.cidsInts.`237` = 237.asInstanceOf[typingsJapgolly.cids.cidsInts.`237`]
    
    inline def `238`: typingsJapgolly.cids.cidsInts.`238` = 238.asInstanceOf[typingsJapgolly.cids.cidsInts.`238`]
    
    inline def `24`: typingsJapgolly.cids.cidsInts.`24` = 24.asInstanceOf[typingsJapgolly.cids.cidsInts.`24`]
    
    inline def `240`: typingsJapgolly.cids.cidsInts.`240` = 240.asInstanceOf[typingsJapgolly.cids.cidsInts.`240`]
    
    inline def `241`: typingsJapgolly.cids.cidsInts.`241` = 241.asInstanceOf[typingsJapgolly.cids.cidsInts.`241`]
    
    inline def `25`: typingsJapgolly.cids.cidsInts.`25` = 25.asInstanceOf[typingsJapgolly.cids.cidsInts.`25`]
    
    inline def `250`: typingsJapgolly.cids.cidsInts.`250` = 250.asInstanceOf[typingsJapgolly.cids.cidsInts.`250`]
    
    inline def `251`: typingsJapgolly.cids.cidsInts.`251` = 251.asInstanceOf[typingsJapgolly.cids.cidsInts.`251`]
    
    inline def `26`: typingsJapgolly.cids.cidsInts.`26` = 26.asInstanceOf[typingsJapgolly.cids.cidsInts.`26`]
    
    inline def `27`: typingsJapgolly.cids.cidsInts.`27` = 27.asInstanceOf[typingsJapgolly.cids.cidsInts.`27`]
    
    inline def `273`: typingsJapgolly.cids.cidsInts.`273` = 273.asInstanceOf[typingsJapgolly.cids.cidsInts.`273`]
    
    inline def `275`: typingsJapgolly.cids.cidsInts.`275` = 275.asInstanceOf[typingsJapgolly.cids.cidsInts.`275`]
    
    inline def `276`: typingsJapgolly.cids.cidsInts.`276` = 276.asInstanceOf[typingsJapgolly.cids.cidsInts.`276`]
    
    inline def `277`: typingsJapgolly.cids.cidsInts.`277` = 277.asInstanceOf[typingsJapgolly.cids.cidsInts.`277`]
    
    inline def `28`: typingsJapgolly.cids.cidsInts.`28` = 28.asInstanceOf[typingsJapgolly.cids.cidsInts.`28`]
    
    inline def `29`: typingsJapgolly.cids.cidsInts.`29` = 29.asInstanceOf[typingsJapgolly.cids.cidsInts.`29`]
    
    inline def `290`: typingsJapgolly.cids.cidsInts.`290` = 290.asInstanceOf[typingsJapgolly.cids.cidsInts.`290`]
    
    inline def `297`: typingsJapgolly.cids.cidsInts.`297` = 297.asInstanceOf[typingsJapgolly.cids.cidsInts.`297`]
    
    inline def `3`: typingsJapgolly.cids.cidsInts.`3` = 3.asInstanceOf[typingsJapgolly.cids.cidsInts.`3`]
    
    inline def `30`: typingsJapgolly.cids.cidsInts.`30` = 30.asInstanceOf[typingsJapgolly.cids.cidsInts.`30`]
    
    inline def `301`: typingsJapgolly.cids.cidsInts.`301` = 301.asInstanceOf[typingsJapgolly.cids.cidsInts.`301`]
    
    inline def `302`: typingsJapgolly.cids.cidsInts.`302` = 302.asInstanceOf[typingsJapgolly.cids.cidsInts.`302`]
    
    inline def `33`: typingsJapgolly.cids.cidsInts.`33` = 33.asInstanceOf[typingsJapgolly.cids.cidsInts.`33`]
    
    inline def `34`: typingsJapgolly.cids.cidsInts.`34` = 34.asInstanceOf[typingsJapgolly.cids.cidsInts.`34`]
    
    inline def `35`: typingsJapgolly.cids.cidsInts.`35` = 35.asInstanceOf[typingsJapgolly.cids.cidsInts.`35`]
    
    inline def `4`: typingsJapgolly.cids.cidsInts.`4` = 4.asInstanceOf[typingsJapgolly.cids.cidsInts.`4`]
    
    inline def `400`: typingsJapgolly.cids.cidsInts.`400` = 400.asInstanceOf[typingsJapgolly.cids.cidsInts.`400`]
    
    inline def `406`: typingsJapgolly.cids.cidsInts.`406` = 406.asInstanceOf[typingsJapgolly.cids.cidsInts.`406`]
    
    inline def `41`: typingsJapgolly.cids.cidsInts.`41` = 41.asInstanceOf[typingsJapgolly.cids.cidsInts.`41`]
    
    inline def `4114`: typingsJapgolly.cids.cidsInts.`4114` = 4114.asInstanceOf[typingsJapgolly.cids.cidsInts.`4114`]
    
    inline def `4178`: typingsJapgolly.cids.cidsInts.`4178` = 4178.asInstanceOf[typingsJapgolly.cids.cidsInts.`4178`]
    
    inline def `4179`: typingsJapgolly.cids.cidsInts.`4179` = 4179.asInstanceOf[typingsJapgolly.cids.cidsInts.`4179`]
    
    inline def `4180`: typingsJapgolly.cids.cidsInts.`4180` = 4180.asInstanceOf[typingsJapgolly.cids.cidsInts.`4180`]
    
    inline def `4181`: typingsJapgolly.cids.cidsInts.`4181` = 4181.asInstanceOf[typingsJapgolly.cids.cidsInts.`4181`]
    
    inline def `42`: typingsJapgolly.cids.cidsInts.`42` = 42.asInstanceOf[typingsJapgolly.cids.cidsInts.`42`]
    
    inline def `421`: typingsJapgolly.cids.cidsInts.`421` = 421.asInstanceOf[typingsJapgolly.cids.cidsInts.`421`]
    
    inline def `4352`: typingsJapgolly.cids.cidsInts.`4352` = 4352.asInstanceOf[typingsJapgolly.cids.cidsInts.`4352`]
    
    inline def `443`: typingsJapgolly.cids.cidsInts.`443` = 443.asInstanceOf[typingsJapgolly.cids.cidsInts.`443`]
    
    inline def `444`: typingsJapgolly.cids.cidsInts.`444` = 444.asInstanceOf[typingsJapgolly.cids.cidsInts.`444`]
    
    inline def `445`: typingsJapgolly.cids.cidsInts.`445` = 445.asInstanceOf[typingsJapgolly.cids.cidsInts.`445`]
    
    inline def `446`: typingsJapgolly.cids.cidsInts.`446` = 446.asInstanceOf[typingsJapgolly.cids.cidsInts.`446`]
    
    inline def `447`: typingsJapgolly.cids.cidsInts.`447` = 447.asInstanceOf[typingsJapgolly.cids.cidsInts.`447`]
    
    inline def `448`: typingsJapgolly.cids.cidsInts.`448` = 448.asInstanceOf[typingsJapgolly.cids.cidsInts.`448`]
    
    inline def `45569`: typingsJapgolly.cids.cidsInts.`45569` = 45569.asInstanceOf[typingsJapgolly.cids.cidsInts.`45569`]
    
    inline def `45570`: typingsJapgolly.cids.cidsInts.`45570` = 45570.asInstanceOf[typingsJapgolly.cids.cidsInts.`45570`]
    
    inline def `45571`: typingsJapgolly.cids.cidsInts.`45571` = 45571.asInstanceOf[typingsJapgolly.cids.cidsInts.`45571`]
    
    inline def `45572`: typingsJapgolly.cids.cidsInts.`45572` = 45572.asInstanceOf[typingsJapgolly.cids.cidsInts.`45572`]
    
    inline def `45573`: typingsJapgolly.cids.cidsInts.`45573` = 45573.asInstanceOf[typingsJapgolly.cids.cidsInts.`45573`]
    
    inline def `45574`: typingsJapgolly.cids.cidsInts.`45574` = 45574.asInstanceOf[typingsJapgolly.cids.cidsInts.`45574`]
    
    inline def `45575`: typingsJapgolly.cids.cidsInts.`45575` = 45575.asInstanceOf[typingsJapgolly.cids.cidsInts.`45575`]
    
    inline def `45576`: typingsJapgolly.cids.cidsInts.`45576` = 45576.asInstanceOf[typingsJapgolly.cids.cidsInts.`45576`]
    
    inline def `45577`: typingsJapgolly.cids.cidsInts.`45577` = 45577.asInstanceOf[typingsJapgolly.cids.cidsInts.`45577`]
    
    inline def `45578`: typingsJapgolly.cids.cidsInts.`45578` = 45578.asInstanceOf[typingsJapgolly.cids.cidsInts.`45578`]
    
    inline def `45579`: typingsJapgolly.cids.cidsInts.`45579` = 45579.asInstanceOf[typingsJapgolly.cids.cidsInts.`45579`]
    
    inline def `45580`: typingsJapgolly.cids.cidsInts.`45580` = 45580.asInstanceOf[typingsJapgolly.cids.cidsInts.`45580`]
    
    inline def `45581`: typingsJapgolly.cids.cidsInts.`45581` = 45581.asInstanceOf[typingsJapgolly.cids.cidsInts.`45581`]
    
    inline def `45582`: typingsJapgolly.cids.cidsInts.`45582` = 45582.asInstanceOf[typingsJapgolly.cids.cidsInts.`45582`]
    
    inline def `45583`: typingsJapgolly.cids.cidsInts.`45583` = 45583.asInstanceOf[typingsJapgolly.cids.cidsInts.`45583`]
    
    inline def `45584`: typingsJapgolly.cids.cidsInts.`45584` = 45584.asInstanceOf[typingsJapgolly.cids.cidsInts.`45584`]
    
    inline def `45585`: typingsJapgolly.cids.cidsInts.`45585` = 45585.asInstanceOf[typingsJapgolly.cids.cidsInts.`45585`]
    
    inline def `45586`: typingsJapgolly.cids.cidsInts.`45586` = 45586.asInstanceOf[typingsJapgolly.cids.cidsInts.`45586`]
    
    inline def `45587`: typingsJapgolly.cids.cidsInts.`45587` = 45587.asInstanceOf[typingsJapgolly.cids.cidsInts.`45587`]
    
    inline def `45588`: typingsJapgolly.cids.cidsInts.`45588` = 45588.asInstanceOf[typingsJapgolly.cids.cidsInts.`45588`]
    
    inline def `45589`: typingsJapgolly.cids.cidsInts.`45589` = 45589.asInstanceOf[typingsJapgolly.cids.cidsInts.`45589`]
    
    inline def `45590`: typingsJapgolly.cids.cidsInts.`45590` = 45590.asInstanceOf[typingsJapgolly.cids.cidsInts.`45590`]
    
    inline def `45591`: typingsJapgolly.cids.cidsInts.`45591` = 45591.asInstanceOf[typingsJapgolly.cids.cidsInts.`45591`]
    
    inline def `45592`: typingsJapgolly.cids.cidsInts.`45592` = 45592.asInstanceOf[typingsJapgolly.cids.cidsInts.`45592`]
    
    inline def `45593`: typingsJapgolly.cids.cidsInts.`45593` = 45593.asInstanceOf[typingsJapgolly.cids.cidsInts.`45593`]
    
    inline def `45594`: typingsJapgolly.cids.cidsInts.`45594` = 45594.asInstanceOf[typingsJapgolly.cids.cidsInts.`45594`]
    
    inline def `45595`: typingsJapgolly.cids.cidsInts.`45595` = 45595.asInstanceOf[typingsJapgolly.cids.cidsInts.`45595`]
    
    inline def `45596`: typingsJapgolly.cids.cidsInts.`45596` = 45596.asInstanceOf[typingsJapgolly.cids.cidsInts.`45596`]
    
    inline def `45597`: typingsJapgolly.cids.cidsInts.`45597` = 45597.asInstanceOf[typingsJapgolly.cids.cidsInts.`45597`]
    
    inline def `45598`: typingsJapgolly.cids.cidsInts.`45598` = 45598.asInstanceOf[typingsJapgolly.cids.cidsInts.`45598`]
    
    inline def `45599`: typingsJapgolly.cids.cidsInts.`45599` = 45599.asInstanceOf[typingsJapgolly.cids.cidsInts.`45599`]
    
    inline def `45600`: typingsJapgolly.cids.cidsInts.`45600` = 45600.asInstanceOf[typingsJapgolly.cids.cidsInts.`45600`]
    
    inline def `45601`: typingsJapgolly.cids.cidsInts.`45601` = 45601.asInstanceOf[typingsJapgolly.cids.cidsInts.`45601`]
    
    inline def `45602`: typingsJapgolly.cids.cidsInts.`45602` = 45602.asInstanceOf[typingsJapgolly.cids.cidsInts.`45602`]
    
    inline def `45603`: typingsJapgolly.cids.cidsInts.`45603` = 45603.asInstanceOf[typingsJapgolly.cids.cidsInts.`45603`]
    
    inline def `45604`: typingsJapgolly.cids.cidsInts.`45604` = 45604.asInstanceOf[typingsJapgolly.cids.cidsInts.`45604`]
    
    inline def `45605`: typingsJapgolly.cids.cidsInts.`45605` = 45605.asInstanceOf[typingsJapgolly.cids.cidsInts.`45605`]
    
    inline def `45606`: typingsJapgolly.cids.cidsInts.`45606` = 45606.asInstanceOf[typingsJapgolly.cids.cidsInts.`45606`]
    
    inline def `45607`: typingsJapgolly.cids.cidsInts.`45607` = 45607.asInstanceOf[typingsJapgolly.cids.cidsInts.`45607`]
    
    inline def `45608`: typingsJapgolly.cids.cidsInts.`45608` = 45608.asInstanceOf[typingsJapgolly.cids.cidsInts.`45608`]
    
    inline def `45609`: typingsJapgolly.cids.cidsInts.`45609` = 45609.asInstanceOf[typingsJapgolly.cids.cidsInts.`45609`]
    
    inline def `45610`: typingsJapgolly.cids.cidsInts.`45610` = 45610.asInstanceOf[typingsJapgolly.cids.cidsInts.`45610`]
    
    inline def `45611`: typingsJapgolly.cids.cidsInts.`45611` = 45611.asInstanceOf[typingsJapgolly.cids.cidsInts.`45611`]
    
    inline def `45612`: typingsJapgolly.cids.cidsInts.`45612` = 45612.asInstanceOf[typingsJapgolly.cids.cidsInts.`45612`]
    
    inline def `45613`: typingsJapgolly.cids.cidsInts.`45613` = 45613.asInstanceOf[typingsJapgolly.cids.cidsInts.`45613`]
    
    inline def `45614`: typingsJapgolly.cids.cidsInts.`45614` = 45614.asInstanceOf[typingsJapgolly.cids.cidsInts.`45614`]
    
    inline def `45615`: typingsJapgolly.cids.cidsInts.`45615` = 45615.asInstanceOf[typingsJapgolly.cids.cidsInts.`45615`]
    
    inline def `45616`: typingsJapgolly.cids.cidsInts.`45616` = 45616.asInstanceOf[typingsJapgolly.cids.cidsInts.`45616`]
    
    inline def `45617`: typingsJapgolly.cids.cidsInts.`45617` = 45617.asInstanceOf[typingsJapgolly.cids.cidsInts.`45617`]
    
    inline def `45618`: typingsJapgolly.cids.cidsInts.`45618` = 45618.asInstanceOf[typingsJapgolly.cids.cidsInts.`45618`]
    
    inline def `45619`: typingsJapgolly.cids.cidsInts.`45619` = 45619.asInstanceOf[typingsJapgolly.cids.cidsInts.`45619`]
    
    inline def `45620`: typingsJapgolly.cids.cidsInts.`45620` = 45620.asInstanceOf[typingsJapgolly.cids.cidsInts.`45620`]
    
    inline def `45621`: typingsJapgolly.cids.cidsInts.`45621` = 45621.asInstanceOf[typingsJapgolly.cids.cidsInts.`45621`]
    
    inline def `45622`: typingsJapgolly.cids.cidsInts.`45622` = 45622.asInstanceOf[typingsJapgolly.cids.cidsInts.`45622`]
    
    inline def `45623`: typingsJapgolly.cids.cidsInts.`45623` = 45623.asInstanceOf[typingsJapgolly.cids.cidsInts.`45623`]
    
    inline def `45624`: typingsJapgolly.cids.cidsInts.`45624` = 45624.asInstanceOf[typingsJapgolly.cids.cidsInts.`45624`]
    
    inline def `45625`: typingsJapgolly.cids.cidsInts.`45625` = 45625.asInstanceOf[typingsJapgolly.cids.cidsInts.`45625`]
    
    inline def `45626`: typingsJapgolly.cids.cidsInts.`45626` = 45626.asInstanceOf[typingsJapgolly.cids.cidsInts.`45626`]
    
    inline def `45627`: typingsJapgolly.cids.cidsInts.`45627` = 45627.asInstanceOf[typingsJapgolly.cids.cidsInts.`45627`]
    
    inline def `45628`: typingsJapgolly.cids.cidsInts.`45628` = 45628.asInstanceOf[typingsJapgolly.cids.cidsInts.`45628`]
    
    inline def `45629`: typingsJapgolly.cids.cidsInts.`45629` = 45629.asInstanceOf[typingsJapgolly.cids.cidsInts.`45629`]
    
    inline def `45630`: typingsJapgolly.cids.cidsInts.`45630` = 45630.asInstanceOf[typingsJapgolly.cids.cidsInts.`45630`]
    
    inline def `45631`: typingsJapgolly.cids.cidsInts.`45631` = 45631.asInstanceOf[typingsJapgolly.cids.cidsInts.`45631`]
    
    inline def `45632`: typingsJapgolly.cids.cidsInts.`45632` = 45632.asInstanceOf[typingsJapgolly.cids.cidsInts.`45632`]
    
    inline def `45633`: typingsJapgolly.cids.cidsInts.`45633` = 45633.asInstanceOf[typingsJapgolly.cids.cidsInts.`45633`]
    
    inline def `45634`: typingsJapgolly.cids.cidsInts.`45634` = 45634.asInstanceOf[typingsJapgolly.cids.cidsInts.`45634`]
    
    inline def `45635`: typingsJapgolly.cids.cidsInts.`45635` = 45635.asInstanceOf[typingsJapgolly.cids.cidsInts.`45635`]
    
    inline def `45636`: typingsJapgolly.cids.cidsInts.`45636` = 45636.asInstanceOf[typingsJapgolly.cids.cidsInts.`45636`]
    
    inline def `45637`: typingsJapgolly.cids.cidsInts.`45637` = 45637.asInstanceOf[typingsJapgolly.cids.cidsInts.`45637`]
    
    inline def `45638`: typingsJapgolly.cids.cidsInts.`45638` = 45638.asInstanceOf[typingsJapgolly.cids.cidsInts.`45638`]
    
    inline def `45639`: typingsJapgolly.cids.cidsInts.`45639` = 45639.asInstanceOf[typingsJapgolly.cids.cidsInts.`45639`]
    
    inline def `45640`: typingsJapgolly.cids.cidsInts.`45640` = 45640.asInstanceOf[typingsJapgolly.cids.cidsInts.`45640`]
    
    inline def `45641`: typingsJapgolly.cids.cidsInts.`45641` = 45641.asInstanceOf[typingsJapgolly.cids.cidsInts.`45641`]
    
    inline def `45642`: typingsJapgolly.cids.cidsInts.`45642` = 45642.asInstanceOf[typingsJapgolly.cids.cidsInts.`45642`]
    
    inline def `45643`: typingsJapgolly.cids.cidsInts.`45643` = 45643.asInstanceOf[typingsJapgolly.cids.cidsInts.`45643`]
    
    inline def `45644`: typingsJapgolly.cids.cidsInts.`45644` = 45644.asInstanceOf[typingsJapgolly.cids.cidsInts.`45644`]
    
    inline def `45645`: typingsJapgolly.cids.cidsInts.`45645` = 45645.asInstanceOf[typingsJapgolly.cids.cidsInts.`45645`]
    
    inline def `45646`: typingsJapgolly.cids.cidsInts.`45646` = 45646.asInstanceOf[typingsJapgolly.cids.cidsInts.`45646`]
    
    inline def `45647`: typingsJapgolly.cids.cidsInts.`45647` = 45647.asInstanceOf[typingsJapgolly.cids.cidsInts.`45647`]
    
    inline def `45648`: typingsJapgolly.cids.cidsInts.`45648` = 45648.asInstanceOf[typingsJapgolly.cids.cidsInts.`45648`]
    
    inline def `45649`: typingsJapgolly.cids.cidsInts.`45649` = 45649.asInstanceOf[typingsJapgolly.cids.cidsInts.`45649`]
    
    inline def `45650`: typingsJapgolly.cids.cidsInts.`45650` = 45650.asInstanceOf[typingsJapgolly.cids.cidsInts.`45650`]
    
    inline def `45651`: typingsJapgolly.cids.cidsInts.`45651` = 45651.asInstanceOf[typingsJapgolly.cids.cidsInts.`45651`]
    
    inline def `45652`: typingsJapgolly.cids.cidsInts.`45652` = 45652.asInstanceOf[typingsJapgolly.cids.cidsInts.`45652`]
    
    inline def `45653`: typingsJapgolly.cids.cidsInts.`45653` = 45653.asInstanceOf[typingsJapgolly.cids.cidsInts.`45653`]
    
    inline def `45654`: typingsJapgolly.cids.cidsInts.`45654` = 45654.asInstanceOf[typingsJapgolly.cids.cidsInts.`45654`]
    
    inline def `45655`: typingsJapgolly.cids.cidsInts.`45655` = 45655.asInstanceOf[typingsJapgolly.cids.cidsInts.`45655`]
    
    inline def `45656`: typingsJapgolly.cids.cidsInts.`45656` = 45656.asInstanceOf[typingsJapgolly.cids.cidsInts.`45656`]
    
    inline def `45657`: typingsJapgolly.cids.cidsInts.`45657` = 45657.asInstanceOf[typingsJapgolly.cids.cidsInts.`45657`]
    
    inline def `45658`: typingsJapgolly.cids.cidsInts.`45658` = 45658.asInstanceOf[typingsJapgolly.cids.cidsInts.`45658`]
    
    inline def `45659`: typingsJapgolly.cids.cidsInts.`45659` = 45659.asInstanceOf[typingsJapgolly.cids.cidsInts.`45659`]
    
    inline def `45660`: typingsJapgolly.cids.cidsInts.`45660` = 45660.asInstanceOf[typingsJapgolly.cids.cidsInts.`45660`]
    
    inline def `45661`: typingsJapgolly.cids.cidsInts.`45661` = 45661.asInstanceOf[typingsJapgolly.cids.cidsInts.`45661`]
    
    inline def `45662`: typingsJapgolly.cids.cidsInts.`45662` = 45662.asInstanceOf[typingsJapgolly.cids.cidsInts.`45662`]
    
    inline def `45663`: typingsJapgolly.cids.cidsInts.`45663` = 45663.asInstanceOf[typingsJapgolly.cids.cidsInts.`45663`]
    
    inline def `45664`: typingsJapgolly.cids.cidsInts.`45664` = 45664.asInstanceOf[typingsJapgolly.cids.cidsInts.`45664`]
    
    inline def `45825`: typingsJapgolly.cids.cidsInts.`45825` = 45825.asInstanceOf[typingsJapgolly.cids.cidsInts.`45825`]
    
    inline def `45826`: typingsJapgolly.cids.cidsInts.`45826` = 45826.asInstanceOf[typingsJapgolly.cids.cidsInts.`45826`]
    
    inline def `45827`: typingsJapgolly.cids.cidsInts.`45827` = 45827.asInstanceOf[typingsJapgolly.cids.cidsInts.`45827`]
    
    inline def `45828`: typingsJapgolly.cids.cidsInts.`45828` = 45828.asInstanceOf[typingsJapgolly.cids.cidsInts.`45828`]
    
    inline def `45829`: typingsJapgolly.cids.cidsInts.`45829` = 45829.asInstanceOf[typingsJapgolly.cids.cidsInts.`45829`]
    
    inline def `45830`: typingsJapgolly.cids.cidsInts.`45830` = 45830.asInstanceOf[typingsJapgolly.cids.cidsInts.`45830`]
    
    inline def `45831`: typingsJapgolly.cids.cidsInts.`45831` = 45831.asInstanceOf[typingsJapgolly.cids.cidsInts.`45831`]
    
    inline def `45832`: typingsJapgolly.cids.cidsInts.`45832` = 45832.asInstanceOf[typingsJapgolly.cids.cidsInts.`45832`]
    
    inline def `45833`: typingsJapgolly.cids.cidsInts.`45833` = 45833.asInstanceOf[typingsJapgolly.cids.cidsInts.`45833`]
    
    inline def `45834`: typingsJapgolly.cids.cidsInts.`45834` = 45834.asInstanceOf[typingsJapgolly.cids.cidsInts.`45834`]
    
    inline def `45835`: typingsJapgolly.cids.cidsInts.`45835` = 45835.asInstanceOf[typingsJapgolly.cids.cidsInts.`45835`]
    
    inline def `45836`: typingsJapgolly.cids.cidsInts.`45836` = 45836.asInstanceOf[typingsJapgolly.cids.cidsInts.`45836`]
    
    inline def `45837`: typingsJapgolly.cids.cidsInts.`45837` = 45837.asInstanceOf[typingsJapgolly.cids.cidsInts.`45837`]
    
    inline def `45838`: typingsJapgolly.cids.cidsInts.`45838` = 45838.asInstanceOf[typingsJapgolly.cids.cidsInts.`45838`]
    
    inline def `45839`: typingsJapgolly.cids.cidsInts.`45839` = 45839.asInstanceOf[typingsJapgolly.cids.cidsInts.`45839`]
    
    inline def `45840`: typingsJapgolly.cids.cidsInts.`45840` = 45840.asInstanceOf[typingsJapgolly.cids.cidsInts.`45840`]
    
    inline def `45841`: typingsJapgolly.cids.cidsInts.`45841` = 45841.asInstanceOf[typingsJapgolly.cids.cidsInts.`45841`]
    
    inline def `45842`: typingsJapgolly.cids.cidsInts.`45842` = 45842.asInstanceOf[typingsJapgolly.cids.cidsInts.`45842`]
    
    inline def `45843`: typingsJapgolly.cids.cidsInts.`45843` = 45843.asInstanceOf[typingsJapgolly.cids.cidsInts.`45843`]
    
    inline def `45844`: typingsJapgolly.cids.cidsInts.`45844` = 45844.asInstanceOf[typingsJapgolly.cids.cidsInts.`45844`]
    
    inline def `45845`: typingsJapgolly.cids.cidsInts.`45845` = 45845.asInstanceOf[typingsJapgolly.cids.cidsInts.`45845`]
    
    inline def `45846`: typingsJapgolly.cids.cidsInts.`45846` = 45846.asInstanceOf[typingsJapgolly.cids.cidsInts.`45846`]
    
    inline def `45847`: typingsJapgolly.cids.cidsInts.`45847` = 45847.asInstanceOf[typingsJapgolly.cids.cidsInts.`45847`]
    
    inline def `45848`: typingsJapgolly.cids.cidsInts.`45848` = 45848.asInstanceOf[typingsJapgolly.cids.cidsInts.`45848`]
    
    inline def `45849`: typingsJapgolly.cids.cidsInts.`45849` = 45849.asInstanceOf[typingsJapgolly.cids.cidsInts.`45849`]
    
    inline def `45850`: typingsJapgolly.cids.cidsInts.`45850` = 45850.asInstanceOf[typingsJapgolly.cids.cidsInts.`45850`]
    
    inline def `45851`: typingsJapgolly.cids.cidsInts.`45851` = 45851.asInstanceOf[typingsJapgolly.cids.cidsInts.`45851`]
    
    inline def `45852`: typingsJapgolly.cids.cidsInts.`45852` = 45852.asInstanceOf[typingsJapgolly.cids.cidsInts.`45852`]
    
    inline def `45853`: typingsJapgolly.cids.cidsInts.`45853` = 45853.asInstanceOf[typingsJapgolly.cids.cidsInts.`45853`]
    
    inline def `45854`: typingsJapgolly.cids.cidsInts.`45854` = 45854.asInstanceOf[typingsJapgolly.cids.cidsInts.`45854`]
    
    inline def `45855`: typingsJapgolly.cids.cidsInts.`45855` = 45855.asInstanceOf[typingsJapgolly.cids.cidsInts.`45855`]
    
    inline def `45856`: typingsJapgolly.cids.cidsInts.`45856` = 45856.asInstanceOf[typingsJapgolly.cids.cidsInts.`45856`]
    
    inline def `45857`: typingsJapgolly.cids.cidsInts.`45857` = 45857.asInstanceOf[typingsJapgolly.cids.cidsInts.`45857`]
    
    inline def `45858`: typingsJapgolly.cids.cidsInts.`45858` = 45858.asInstanceOf[typingsJapgolly.cids.cidsInts.`45858`]
    
    inline def `45859`: typingsJapgolly.cids.cidsInts.`45859` = 45859.asInstanceOf[typingsJapgolly.cids.cidsInts.`45859`]
    
    inline def `45860`: typingsJapgolly.cids.cidsInts.`45860` = 45860.asInstanceOf[typingsJapgolly.cids.cidsInts.`45860`]
    
    inline def `45861`: typingsJapgolly.cids.cidsInts.`45861` = 45861.asInstanceOf[typingsJapgolly.cids.cidsInts.`45861`]
    
    inline def `45862`: typingsJapgolly.cids.cidsInts.`45862` = 45862.asInstanceOf[typingsJapgolly.cids.cidsInts.`45862`]
    
    inline def `45863`: typingsJapgolly.cids.cidsInts.`45863` = 45863.asInstanceOf[typingsJapgolly.cids.cidsInts.`45863`]
    
    inline def `45864`: typingsJapgolly.cids.cidsInts.`45864` = 45864.asInstanceOf[typingsJapgolly.cids.cidsInts.`45864`]
    
    inline def `45865`: typingsJapgolly.cids.cidsInts.`45865` = 45865.asInstanceOf[typingsJapgolly.cids.cidsInts.`45865`]
    
    inline def `45866`: typingsJapgolly.cids.cidsInts.`45866` = 45866.asInstanceOf[typingsJapgolly.cids.cidsInts.`45866`]
    
    inline def `45867`: typingsJapgolly.cids.cidsInts.`45867` = 45867.asInstanceOf[typingsJapgolly.cids.cidsInts.`45867`]
    
    inline def `45868`: typingsJapgolly.cids.cidsInts.`45868` = 45868.asInstanceOf[typingsJapgolly.cids.cidsInts.`45868`]
    
    inline def `45869`: typingsJapgolly.cids.cidsInts.`45869` = 45869.asInstanceOf[typingsJapgolly.cids.cidsInts.`45869`]
    
    inline def `45870`: typingsJapgolly.cids.cidsInts.`45870` = 45870.asInstanceOf[typingsJapgolly.cids.cidsInts.`45870`]
    
    inline def `45871`: typingsJapgolly.cids.cidsInts.`45871` = 45871.asInstanceOf[typingsJapgolly.cids.cidsInts.`45871`]
    
    inline def `45872`: typingsJapgolly.cids.cidsInts.`45872` = 45872.asInstanceOf[typingsJapgolly.cids.cidsInts.`45872`]
    
    inline def `45873`: typingsJapgolly.cids.cidsInts.`45873` = 45873.asInstanceOf[typingsJapgolly.cids.cidsInts.`45873`]
    
    inline def `45874`: typingsJapgolly.cids.cidsInts.`45874` = 45874.asInstanceOf[typingsJapgolly.cids.cidsInts.`45874`]
    
    inline def `45875`: typingsJapgolly.cids.cidsInts.`45875` = 45875.asInstanceOf[typingsJapgolly.cids.cidsInts.`45875`]
    
    inline def `45876`: typingsJapgolly.cids.cidsInts.`45876` = 45876.asInstanceOf[typingsJapgolly.cids.cidsInts.`45876`]
    
    inline def `45877`: typingsJapgolly.cids.cidsInts.`45877` = 45877.asInstanceOf[typingsJapgolly.cids.cidsInts.`45877`]
    
    inline def `45878`: typingsJapgolly.cids.cidsInts.`45878` = 45878.asInstanceOf[typingsJapgolly.cids.cidsInts.`45878`]
    
    inline def `45879`: typingsJapgolly.cids.cidsInts.`45879` = 45879.asInstanceOf[typingsJapgolly.cids.cidsInts.`45879`]
    
    inline def `45880`: typingsJapgolly.cids.cidsInts.`45880` = 45880.asInstanceOf[typingsJapgolly.cids.cidsInts.`45880`]
    
    inline def `45881`: typingsJapgolly.cids.cidsInts.`45881` = 45881.asInstanceOf[typingsJapgolly.cids.cidsInts.`45881`]
    
    inline def `45882`: typingsJapgolly.cids.cidsInts.`45882` = 45882.asInstanceOf[typingsJapgolly.cids.cidsInts.`45882`]
    
    inline def `45883`: typingsJapgolly.cids.cidsInts.`45883` = 45883.asInstanceOf[typingsJapgolly.cids.cidsInts.`45883`]
    
    inline def `45884`: typingsJapgolly.cids.cidsInts.`45884` = 45884.asInstanceOf[typingsJapgolly.cids.cidsInts.`45884`]
    
    inline def `45885`: typingsJapgolly.cids.cidsInts.`45885` = 45885.asInstanceOf[typingsJapgolly.cids.cidsInts.`45885`]
    
    inline def `45886`: typingsJapgolly.cids.cidsInts.`45886` = 45886.asInstanceOf[typingsJapgolly.cids.cidsInts.`45886`]
    
    inline def `45887`: typingsJapgolly.cids.cidsInts.`45887` = 45887.asInstanceOf[typingsJapgolly.cids.cidsInts.`45887`]
    
    inline def `45888`: typingsJapgolly.cids.cidsInts.`45888` = 45888.asInstanceOf[typingsJapgolly.cids.cidsInts.`45888`]
    
    inline def `45889`: typingsJapgolly.cids.cidsInts.`45889` = 45889.asInstanceOf[typingsJapgolly.cids.cidsInts.`45889`]
    
    inline def `45890`: typingsJapgolly.cids.cidsInts.`45890` = 45890.asInstanceOf[typingsJapgolly.cids.cidsInts.`45890`]
    
    inline def `45891`: typingsJapgolly.cids.cidsInts.`45891` = 45891.asInstanceOf[typingsJapgolly.cids.cidsInts.`45891`]
    
    inline def `45892`: typingsJapgolly.cids.cidsInts.`45892` = 45892.asInstanceOf[typingsJapgolly.cids.cidsInts.`45892`]
    
    inline def `45893`: typingsJapgolly.cids.cidsInts.`45893` = 45893.asInstanceOf[typingsJapgolly.cids.cidsInts.`45893`]
    
    inline def `45894`: typingsJapgolly.cids.cidsInts.`45894` = 45894.asInstanceOf[typingsJapgolly.cids.cidsInts.`45894`]
    
    inline def `45895`: typingsJapgolly.cids.cidsInts.`45895` = 45895.asInstanceOf[typingsJapgolly.cids.cidsInts.`45895`]
    
    inline def `45896`: typingsJapgolly.cids.cidsInts.`45896` = 45896.asInstanceOf[typingsJapgolly.cids.cidsInts.`45896`]
    
    inline def `45897`: typingsJapgolly.cids.cidsInts.`45897` = 45897.asInstanceOf[typingsJapgolly.cids.cidsInts.`45897`]
    
    inline def `45898`: typingsJapgolly.cids.cidsInts.`45898` = 45898.asInstanceOf[typingsJapgolly.cids.cidsInts.`45898`]
    
    inline def `45899`: typingsJapgolly.cids.cidsInts.`45899` = 45899.asInstanceOf[typingsJapgolly.cids.cidsInts.`45899`]
    
    inline def `45900`: typingsJapgolly.cids.cidsInts.`45900` = 45900.asInstanceOf[typingsJapgolly.cids.cidsInts.`45900`]
    
    inline def `45901`: typingsJapgolly.cids.cidsInts.`45901` = 45901.asInstanceOf[typingsJapgolly.cids.cidsInts.`45901`]
    
    inline def `45902`: typingsJapgolly.cids.cidsInts.`45902` = 45902.asInstanceOf[typingsJapgolly.cids.cidsInts.`45902`]
    
    inline def `45903`: typingsJapgolly.cids.cidsInts.`45903` = 45903.asInstanceOf[typingsJapgolly.cids.cidsInts.`45903`]
    
    inline def `45904`: typingsJapgolly.cids.cidsInts.`45904` = 45904.asInstanceOf[typingsJapgolly.cids.cidsInts.`45904`]
    
    inline def `45905`: typingsJapgolly.cids.cidsInts.`45905` = 45905.asInstanceOf[typingsJapgolly.cids.cidsInts.`45905`]
    
    inline def `45906`: typingsJapgolly.cids.cidsInts.`45906` = 45906.asInstanceOf[typingsJapgolly.cids.cidsInts.`45906`]
    
    inline def `45907`: typingsJapgolly.cids.cidsInts.`45907` = 45907.asInstanceOf[typingsJapgolly.cids.cidsInts.`45907`]
    
    inline def `45908`: typingsJapgolly.cids.cidsInts.`45908` = 45908.asInstanceOf[typingsJapgolly.cids.cidsInts.`45908`]
    
    inline def `45909`: typingsJapgolly.cids.cidsInts.`45909` = 45909.asInstanceOf[typingsJapgolly.cids.cidsInts.`45909`]
    
    inline def `45910`: typingsJapgolly.cids.cidsInts.`45910` = 45910.asInstanceOf[typingsJapgolly.cids.cidsInts.`45910`]
    
    inline def `45911`: typingsJapgolly.cids.cidsInts.`45911` = 45911.asInstanceOf[typingsJapgolly.cids.cidsInts.`45911`]
    
    inline def `45912`: typingsJapgolly.cids.cidsInts.`45912` = 45912.asInstanceOf[typingsJapgolly.cids.cidsInts.`45912`]
    
    inline def `45913`: typingsJapgolly.cids.cidsInts.`45913` = 45913.asInstanceOf[typingsJapgolly.cids.cidsInts.`45913`]
    
    inline def `45914`: typingsJapgolly.cids.cidsInts.`45914` = 45914.asInstanceOf[typingsJapgolly.cids.cidsInts.`45914`]
    
    inline def `45915`: typingsJapgolly.cids.cidsInts.`45915` = 45915.asInstanceOf[typingsJapgolly.cids.cidsInts.`45915`]
    
    inline def `45916`: typingsJapgolly.cids.cidsInts.`45916` = 45916.asInstanceOf[typingsJapgolly.cids.cidsInts.`45916`]
    
    inline def `45917`: typingsJapgolly.cids.cidsInts.`45917` = 45917.asInstanceOf[typingsJapgolly.cids.cidsInts.`45917`]
    
    inline def `45918`: typingsJapgolly.cids.cidsInts.`45918` = 45918.asInstanceOf[typingsJapgolly.cids.cidsInts.`45918`]
    
    inline def `45919`: typingsJapgolly.cids.cidsInts.`45919` = 45919.asInstanceOf[typingsJapgolly.cids.cidsInts.`45919`]
    
    inline def `45920`: typingsJapgolly.cids.cidsInts.`45920` = 45920.asInstanceOf[typingsJapgolly.cids.cidsInts.`45920`]
    
    inline def `45921`: typingsJapgolly.cids.cidsInts.`45921` = 45921.asInstanceOf[typingsJapgolly.cids.cidsInts.`45921`]
    
    inline def `45922`: typingsJapgolly.cids.cidsInts.`45922` = 45922.asInstanceOf[typingsJapgolly.cids.cidsInts.`45922`]
    
    inline def `45923`: typingsJapgolly.cids.cidsInts.`45923` = 45923.asInstanceOf[typingsJapgolly.cids.cidsInts.`45923`]
    
    inline def `45924`: typingsJapgolly.cids.cidsInts.`45924` = 45924.asInstanceOf[typingsJapgolly.cids.cidsInts.`45924`]
    
    inline def `45925`: typingsJapgolly.cids.cidsInts.`45925` = 45925.asInstanceOf[typingsJapgolly.cids.cidsInts.`45925`]
    
    inline def `45926`: typingsJapgolly.cids.cidsInts.`45926` = 45926.asInstanceOf[typingsJapgolly.cids.cidsInts.`45926`]
    
    inline def `45927`: typingsJapgolly.cids.cidsInts.`45927` = 45927.asInstanceOf[typingsJapgolly.cids.cidsInts.`45927`]
    
    inline def `45928`: typingsJapgolly.cids.cidsInts.`45928` = 45928.asInstanceOf[typingsJapgolly.cids.cidsInts.`45928`]
    
    inline def `45929`: typingsJapgolly.cids.cidsInts.`45929` = 45929.asInstanceOf[typingsJapgolly.cids.cidsInts.`45929`]
    
    inline def `45930`: typingsJapgolly.cids.cidsInts.`45930` = 45930.asInstanceOf[typingsJapgolly.cids.cidsInts.`45930`]
    
    inline def `45931`: typingsJapgolly.cids.cidsInts.`45931` = 45931.asInstanceOf[typingsJapgolly.cids.cidsInts.`45931`]
    
    inline def `45932`: typingsJapgolly.cids.cidsInts.`45932` = 45932.asInstanceOf[typingsJapgolly.cids.cidsInts.`45932`]
    
    inline def `45933`: typingsJapgolly.cids.cidsInts.`45933` = 45933.asInstanceOf[typingsJapgolly.cids.cidsInts.`45933`]
    
    inline def `45934`: typingsJapgolly.cids.cidsInts.`45934` = 45934.asInstanceOf[typingsJapgolly.cids.cidsInts.`45934`]
    
    inline def `45935`: typingsJapgolly.cids.cidsInts.`45935` = 45935.asInstanceOf[typingsJapgolly.cids.cidsInts.`45935`]
    
    inline def `45936`: typingsJapgolly.cids.cidsInts.`45936` = 45936.asInstanceOf[typingsJapgolly.cids.cidsInts.`45936`]
    
    inline def `45937`: typingsJapgolly.cids.cidsInts.`45937` = 45937.asInstanceOf[typingsJapgolly.cids.cidsInts.`45937`]
    
    inline def `45938`: typingsJapgolly.cids.cidsInts.`45938` = 45938.asInstanceOf[typingsJapgolly.cids.cidsInts.`45938`]
    
    inline def `45939`: typingsJapgolly.cids.cidsInts.`45939` = 45939.asInstanceOf[typingsJapgolly.cids.cidsInts.`45939`]
    
    inline def `45940`: typingsJapgolly.cids.cidsInts.`45940` = 45940.asInstanceOf[typingsJapgolly.cids.cidsInts.`45940`]
    
    inline def `45941`: typingsJapgolly.cids.cidsInts.`45941` = 45941.asInstanceOf[typingsJapgolly.cids.cidsInts.`45941`]
    
    inline def `45942`: typingsJapgolly.cids.cidsInts.`45942` = 45942.asInstanceOf[typingsJapgolly.cids.cidsInts.`45942`]
    
    inline def `45943`: typingsJapgolly.cids.cidsInts.`45943` = 45943.asInstanceOf[typingsJapgolly.cids.cidsInts.`45943`]
    
    inline def `45944`: typingsJapgolly.cids.cidsInts.`45944` = 45944.asInstanceOf[typingsJapgolly.cids.cidsInts.`45944`]
    
    inline def `45945`: typingsJapgolly.cids.cidsInts.`45945` = 45945.asInstanceOf[typingsJapgolly.cids.cidsInts.`45945`]
    
    inline def `45946`: typingsJapgolly.cids.cidsInts.`45946` = 45946.asInstanceOf[typingsJapgolly.cids.cidsInts.`45946`]
    
    inline def `45947`: typingsJapgolly.cids.cidsInts.`45947` = 45947.asInstanceOf[typingsJapgolly.cids.cidsInts.`45947`]
    
    inline def `45948`: typingsJapgolly.cids.cidsInts.`45948` = 45948.asInstanceOf[typingsJapgolly.cids.cidsInts.`45948`]
    
    inline def `45949`: typingsJapgolly.cids.cidsInts.`45949` = 45949.asInstanceOf[typingsJapgolly.cids.cidsInts.`45949`]
    
    inline def `45950`: typingsJapgolly.cids.cidsInts.`45950` = 45950.asInstanceOf[typingsJapgolly.cids.cidsInts.`45950`]
    
    inline def `45951`: typingsJapgolly.cids.cidsInts.`45951` = 45951.asInstanceOf[typingsJapgolly.cids.cidsInts.`45951`]
    
    inline def `45952`: typingsJapgolly.cids.cidsInts.`45952` = 45952.asInstanceOf[typingsJapgolly.cids.cidsInts.`45952`]
    
    inline def `45953`: typingsJapgolly.cids.cidsInts.`45953` = 45953.asInstanceOf[typingsJapgolly.cids.cidsInts.`45953`]
    
    inline def `45954`: typingsJapgolly.cids.cidsInts.`45954` = 45954.asInstanceOf[typingsJapgolly.cids.cidsInts.`45954`]
    
    inline def `45955`: typingsJapgolly.cids.cidsInts.`45955` = 45955.asInstanceOf[typingsJapgolly.cids.cidsInts.`45955`]
    
    inline def `45956`: typingsJapgolly.cids.cidsInts.`45956` = 45956.asInstanceOf[typingsJapgolly.cids.cidsInts.`45956`]
    
    inline def `45957`: typingsJapgolly.cids.cidsInts.`45957` = 45957.asInstanceOf[typingsJapgolly.cids.cidsInts.`45957`]
    
    inline def `45958`: typingsJapgolly.cids.cidsInts.`45958` = 45958.asInstanceOf[typingsJapgolly.cids.cidsInts.`45958`]
    
    inline def `45959`: typingsJapgolly.cids.cidsInts.`45959` = 45959.asInstanceOf[typingsJapgolly.cids.cidsInts.`45959`]
    
    inline def `45960`: typingsJapgolly.cids.cidsInts.`45960` = 45960.asInstanceOf[typingsJapgolly.cids.cidsInts.`45960`]
    
    inline def `45961`: typingsJapgolly.cids.cidsInts.`45961` = 45961.asInstanceOf[typingsJapgolly.cids.cidsInts.`45961`]
    
    inline def `45962`: typingsJapgolly.cids.cidsInts.`45962` = 45962.asInstanceOf[typingsJapgolly.cids.cidsInts.`45962`]
    
    inline def `45963`: typingsJapgolly.cids.cidsInts.`45963` = 45963.asInstanceOf[typingsJapgolly.cids.cidsInts.`45963`]
    
    inline def `45964`: typingsJapgolly.cids.cidsInts.`45964` = 45964.asInstanceOf[typingsJapgolly.cids.cidsInts.`45964`]
    
    inline def `45965`: typingsJapgolly.cids.cidsInts.`45965` = 45965.asInstanceOf[typingsJapgolly.cids.cidsInts.`45965`]
    
    inline def `45966`: typingsJapgolly.cids.cidsInts.`45966` = 45966.asInstanceOf[typingsJapgolly.cids.cidsInts.`45966`]
    
    inline def `45967`: typingsJapgolly.cids.cidsInts.`45967` = 45967.asInstanceOf[typingsJapgolly.cids.cidsInts.`45967`]
    
    inline def `45968`: typingsJapgolly.cids.cidsInts.`45968` = 45968.asInstanceOf[typingsJapgolly.cids.cidsInts.`45968`]
    
    inline def `45969`: typingsJapgolly.cids.cidsInts.`45969` = 45969.asInstanceOf[typingsJapgolly.cids.cidsInts.`45969`]
    
    inline def `45970`: typingsJapgolly.cids.cidsInts.`45970` = 45970.asInstanceOf[typingsJapgolly.cids.cidsInts.`45970`]
    
    inline def `45971`: typingsJapgolly.cids.cidsInts.`45971` = 45971.asInstanceOf[typingsJapgolly.cids.cidsInts.`45971`]
    
    inline def `45972`: typingsJapgolly.cids.cidsInts.`45972` = 45972.asInstanceOf[typingsJapgolly.cids.cidsInts.`45972`]
    
    inline def `45973`: typingsJapgolly.cids.cidsInts.`45973` = 45973.asInstanceOf[typingsJapgolly.cids.cidsInts.`45973`]
    
    inline def `45974`: typingsJapgolly.cids.cidsInts.`45974` = 45974.asInstanceOf[typingsJapgolly.cids.cidsInts.`45974`]
    
    inline def `45975`: typingsJapgolly.cids.cidsInts.`45975` = 45975.asInstanceOf[typingsJapgolly.cids.cidsInts.`45975`]
    
    inline def `45976`: typingsJapgolly.cids.cidsInts.`45976` = 45976.asInstanceOf[typingsJapgolly.cids.cidsInts.`45976`]
    
    inline def `45977`: typingsJapgolly.cids.cidsInts.`45977` = 45977.asInstanceOf[typingsJapgolly.cids.cidsInts.`45977`]
    
    inline def `45978`: typingsJapgolly.cids.cidsInts.`45978` = 45978.asInstanceOf[typingsJapgolly.cids.cidsInts.`45978`]
    
    inline def `45979`: typingsJapgolly.cids.cidsInts.`45979` = 45979.asInstanceOf[typingsJapgolly.cids.cidsInts.`45979`]
    
    inline def `45980`: typingsJapgolly.cids.cidsInts.`45980` = 45980.asInstanceOf[typingsJapgolly.cids.cidsInts.`45980`]
    
    inline def `45981`: typingsJapgolly.cids.cidsInts.`45981` = 45981.asInstanceOf[typingsJapgolly.cids.cidsInts.`45981`]
    
    inline def `45982`: typingsJapgolly.cids.cidsInts.`45982` = 45982.asInstanceOf[typingsJapgolly.cids.cidsInts.`45982`]
    
    inline def `45983`: typingsJapgolly.cids.cidsInts.`45983` = 45983.asInstanceOf[typingsJapgolly.cids.cidsInts.`45983`]
    
    inline def `45984`: typingsJapgolly.cids.cidsInts.`45984` = 45984.asInstanceOf[typingsJapgolly.cids.cidsInts.`45984`]
    
    inline def `45985`: typingsJapgolly.cids.cidsInts.`45985` = 45985.asInstanceOf[typingsJapgolly.cids.cidsInts.`45985`]
    
    inline def `45986`: typingsJapgolly.cids.cidsInts.`45986` = 45986.asInstanceOf[typingsJapgolly.cids.cidsInts.`45986`]
    
    inline def `45987`: typingsJapgolly.cids.cidsInts.`45987` = 45987.asInstanceOf[typingsJapgolly.cids.cidsInts.`45987`]
    
    inline def `45988`: typingsJapgolly.cids.cidsInts.`45988` = 45988.asInstanceOf[typingsJapgolly.cids.cidsInts.`45988`]
    
    inline def `45989`: typingsJapgolly.cids.cidsInts.`45989` = 45989.asInstanceOf[typingsJapgolly.cids.cidsInts.`45989`]
    
    inline def `45990`: typingsJapgolly.cids.cidsInts.`45990` = 45990.asInstanceOf[typingsJapgolly.cids.cidsInts.`45990`]
    
    inline def `45991`: typingsJapgolly.cids.cidsInts.`45991` = 45991.asInstanceOf[typingsJapgolly.cids.cidsInts.`45991`]
    
    inline def `45992`: typingsJapgolly.cids.cidsInts.`45992` = 45992.asInstanceOf[typingsJapgolly.cids.cidsInts.`45992`]
    
    inline def `45993`: typingsJapgolly.cids.cidsInts.`45993` = 45993.asInstanceOf[typingsJapgolly.cids.cidsInts.`45993`]
    
    inline def `45994`: typingsJapgolly.cids.cidsInts.`45994` = 45994.asInstanceOf[typingsJapgolly.cids.cidsInts.`45994`]
    
    inline def `45995`: typingsJapgolly.cids.cidsInts.`45995` = 45995.asInstanceOf[typingsJapgolly.cids.cidsInts.`45995`]
    
    inline def `45996`: typingsJapgolly.cids.cidsInts.`45996` = 45996.asInstanceOf[typingsJapgolly.cids.cidsInts.`45996`]
    
    inline def `45997`: typingsJapgolly.cids.cidsInts.`45997` = 45997.asInstanceOf[typingsJapgolly.cids.cidsInts.`45997`]
    
    inline def `45998`: typingsJapgolly.cids.cidsInts.`45998` = 45998.asInstanceOf[typingsJapgolly.cids.cidsInts.`45998`]
    
    inline def `45999`: typingsJapgolly.cids.cidsInts.`45999` = 45999.asInstanceOf[typingsJapgolly.cids.cidsInts.`45999`]
    
    inline def `460`: typingsJapgolly.cids.cidsInts.`460` = 460.asInstanceOf[typingsJapgolly.cids.cidsInts.`460`]
    
    inline def `46000`: typingsJapgolly.cids.cidsInts.`46000` = 46000.asInstanceOf[typingsJapgolly.cids.cidsInts.`46000`]
    
    inline def `46001`: typingsJapgolly.cids.cidsInts.`46001` = 46001.asInstanceOf[typingsJapgolly.cids.cidsInts.`46001`]
    
    inline def `46002`: typingsJapgolly.cids.cidsInts.`46002` = 46002.asInstanceOf[typingsJapgolly.cids.cidsInts.`46002`]
    
    inline def `46003`: typingsJapgolly.cids.cidsInts.`46003` = 46003.asInstanceOf[typingsJapgolly.cids.cidsInts.`46003`]
    
    inline def `46004`: typingsJapgolly.cids.cidsInts.`46004` = 46004.asInstanceOf[typingsJapgolly.cids.cidsInts.`46004`]
    
    inline def `46005`: typingsJapgolly.cids.cidsInts.`46005` = 46005.asInstanceOf[typingsJapgolly.cids.cidsInts.`46005`]
    
    inline def `46006`: typingsJapgolly.cids.cidsInts.`46006` = 46006.asInstanceOf[typingsJapgolly.cids.cidsInts.`46006`]
    
    inline def `46007`: typingsJapgolly.cids.cidsInts.`46007` = 46007.asInstanceOf[typingsJapgolly.cids.cidsInts.`46007`]
    
    inline def `46008`: typingsJapgolly.cids.cidsInts.`46008` = 46008.asInstanceOf[typingsJapgolly.cids.cidsInts.`46008`]
    
    inline def `46009`: typingsJapgolly.cids.cidsInts.`46009` = 46009.asInstanceOf[typingsJapgolly.cids.cidsInts.`46009`]
    
    inline def `46010`: typingsJapgolly.cids.cidsInts.`46010` = 46010.asInstanceOf[typingsJapgolly.cids.cidsInts.`46010`]
    
    inline def `46011`: typingsJapgolly.cids.cidsInts.`46011` = 46011.asInstanceOf[typingsJapgolly.cids.cidsInts.`46011`]
    
    inline def `46012`: typingsJapgolly.cids.cidsInts.`46012` = 46012.asInstanceOf[typingsJapgolly.cids.cidsInts.`46012`]
    
    inline def `46013`: typingsJapgolly.cids.cidsInts.`46013` = 46013.asInstanceOf[typingsJapgolly.cids.cidsInts.`46013`]
    
    inline def `46014`: typingsJapgolly.cids.cidsInts.`46014` = 46014.asInstanceOf[typingsJapgolly.cids.cidsInts.`46014`]
    
    inline def `46015`: typingsJapgolly.cids.cidsInts.`46015` = 46015.asInstanceOf[typingsJapgolly.cids.cidsInts.`46015`]
    
    inline def `46016`: typingsJapgolly.cids.cidsInts.`46016` = 46016.asInstanceOf[typingsJapgolly.cids.cidsInts.`46016`]
    
    inline def `46017`: typingsJapgolly.cids.cidsInts.`46017` = 46017.asInstanceOf[typingsJapgolly.cids.cidsInts.`46017`]
    
    inline def `46018`: typingsJapgolly.cids.cidsInts.`46018` = 46018.asInstanceOf[typingsJapgolly.cids.cidsInts.`46018`]
    
    inline def `46019`: typingsJapgolly.cids.cidsInts.`46019` = 46019.asInstanceOf[typingsJapgolly.cids.cidsInts.`46019`]
    
    inline def `46020`: typingsJapgolly.cids.cidsInts.`46020` = 46020.asInstanceOf[typingsJapgolly.cids.cidsInts.`46020`]
    
    inline def `46021`: typingsJapgolly.cids.cidsInts.`46021` = 46021.asInstanceOf[typingsJapgolly.cids.cidsInts.`46021`]
    
    inline def `46022`: typingsJapgolly.cids.cidsInts.`46022` = 46022.asInstanceOf[typingsJapgolly.cids.cidsInts.`46022`]
    
    inline def `46023`: typingsJapgolly.cids.cidsInts.`46023` = 46023.asInstanceOf[typingsJapgolly.cids.cidsInts.`46023`]
    
    inline def `46024`: typingsJapgolly.cids.cidsInts.`46024` = 46024.asInstanceOf[typingsJapgolly.cids.cidsInts.`46024`]
    
    inline def `46025`: typingsJapgolly.cids.cidsInts.`46025` = 46025.asInstanceOf[typingsJapgolly.cids.cidsInts.`46025`]
    
    inline def `46026`: typingsJapgolly.cids.cidsInts.`46026` = 46026.asInstanceOf[typingsJapgolly.cids.cidsInts.`46026`]
    
    inline def `46027`: typingsJapgolly.cids.cidsInts.`46027` = 46027.asInstanceOf[typingsJapgolly.cids.cidsInts.`46027`]
    
    inline def `46028`: typingsJapgolly.cids.cidsInts.`46028` = 46028.asInstanceOf[typingsJapgolly.cids.cidsInts.`46028`]
    
    inline def `46029`: typingsJapgolly.cids.cidsInts.`46029` = 46029.asInstanceOf[typingsJapgolly.cids.cidsInts.`46029`]
    
    inline def `46030`: typingsJapgolly.cids.cidsInts.`46030` = 46030.asInstanceOf[typingsJapgolly.cids.cidsInts.`46030`]
    
    inline def `46031`: typingsJapgolly.cids.cidsInts.`46031` = 46031.asInstanceOf[typingsJapgolly.cids.cidsInts.`46031`]
    
    inline def `46032`: typingsJapgolly.cids.cidsInts.`46032` = 46032.asInstanceOf[typingsJapgolly.cids.cidsInts.`46032`]
    
    inline def `46033`: typingsJapgolly.cids.cidsInts.`46033` = 46033.asInstanceOf[typingsJapgolly.cids.cidsInts.`46033`]
    
    inline def `46034`: typingsJapgolly.cids.cidsInts.`46034` = 46034.asInstanceOf[typingsJapgolly.cids.cidsInts.`46034`]
    
    inline def `46035`: typingsJapgolly.cids.cidsInts.`46035` = 46035.asInstanceOf[typingsJapgolly.cids.cidsInts.`46035`]
    
    inline def `46036`: typingsJapgolly.cids.cidsInts.`46036` = 46036.asInstanceOf[typingsJapgolly.cids.cidsInts.`46036`]
    
    inline def `46037`: typingsJapgolly.cids.cidsInts.`46037` = 46037.asInstanceOf[typingsJapgolly.cids.cidsInts.`46037`]
    
    inline def `46038`: typingsJapgolly.cids.cidsInts.`46038` = 46038.asInstanceOf[typingsJapgolly.cids.cidsInts.`46038`]
    
    inline def `46039`: typingsJapgolly.cids.cidsInts.`46039` = 46039.asInstanceOf[typingsJapgolly.cids.cidsInts.`46039`]
    
    inline def `46040`: typingsJapgolly.cids.cidsInts.`46040` = 46040.asInstanceOf[typingsJapgolly.cids.cidsInts.`46040`]
    
    inline def `46041`: typingsJapgolly.cids.cidsInts.`46041` = 46041.asInstanceOf[typingsJapgolly.cids.cidsInts.`46041`]
    
    inline def `46042`: typingsJapgolly.cids.cidsInts.`46042` = 46042.asInstanceOf[typingsJapgolly.cids.cidsInts.`46042`]
    
    inline def `46043`: typingsJapgolly.cids.cidsInts.`46043` = 46043.asInstanceOf[typingsJapgolly.cids.cidsInts.`46043`]
    
    inline def `46044`: typingsJapgolly.cids.cidsInts.`46044` = 46044.asInstanceOf[typingsJapgolly.cids.cidsInts.`46044`]
    
    inline def `46045`: typingsJapgolly.cids.cidsInts.`46045` = 46045.asInstanceOf[typingsJapgolly.cids.cidsInts.`46045`]
    
    inline def `46046`: typingsJapgolly.cids.cidsInts.`46046` = 46046.asInstanceOf[typingsJapgolly.cids.cidsInts.`46046`]
    
    inline def `46047`: typingsJapgolly.cids.cidsInts.`46047` = 46047.asInstanceOf[typingsJapgolly.cids.cidsInts.`46047`]
    
    inline def `46048`: typingsJapgolly.cids.cidsInts.`46048` = 46048.asInstanceOf[typingsJapgolly.cids.cidsInts.`46048`]
    
    inline def `4608`: typingsJapgolly.cids.cidsInts.`4608` = 4608.asInstanceOf[typingsJapgolly.cids.cidsInts.`4608`]
    
    inline def `46081`: typingsJapgolly.cids.cidsInts.`46081` = 46081.asInstanceOf[typingsJapgolly.cids.cidsInts.`46081`]
    
    inline def `46082`: typingsJapgolly.cids.cidsInts.`46082` = 46082.asInstanceOf[typingsJapgolly.cids.cidsInts.`46082`]
    
    inline def `4609`: typingsJapgolly.cids.cidsInts.`4609` = 4609.asInstanceOf[typingsJapgolly.cids.cidsInts.`4609`]
    
    inline def `4610`: typingsJapgolly.cids.cidsInts.`4610` = 4610.asInstanceOf[typingsJapgolly.cids.cidsInts.`4610`]
    
    inline def `4611`: typingsJapgolly.cids.cidsInts.`4611` = 4611.asInstanceOf[typingsJapgolly.cids.cidsInts.`4611`]
    
    inline def `4612`: typingsJapgolly.cids.cidsInts.`4612` = 4612.asInstanceOf[typingsJapgolly.cids.cidsInts.`4612`]
    
    inline def `47`: typingsJapgolly.cids.cidsInts.`47` = 47.asInstanceOf[typingsJapgolly.cids.cidsInts.`47`]
    
    inline def `477`: typingsJapgolly.cids.cidsInts.`477` = 477.asInstanceOf[typingsJapgolly.cids.cidsInts.`477`]
    
    inline def `478`: typingsJapgolly.cids.cidsInts.`478` = 478.asInstanceOf[typingsJapgolly.cids.cidsInts.`478`]
    
    inline def `479`: typingsJapgolly.cids.cidsInts.`479` = 479.asInstanceOf[typingsJapgolly.cids.cidsInts.`479`]
    
    inline def `48`: typingsJapgolly.cids.cidsInts.`48` = 48.asInstanceOf[typingsJapgolly.cids.cidsInts.`48`]
    
    inline def `480`: typingsJapgolly.cids.cidsInts.`480` = 480.asInstanceOf[typingsJapgolly.cids.cidsInts.`480`]
    
    inline def `4864`: typingsJapgolly.cids.cidsInts.`4864` = 4864.asInstanceOf[typingsJapgolly.cids.cidsInts.`4864`]
    
    inline def `49`: typingsJapgolly.cids.cidsInts.`49` = 49.asInstanceOf[typingsJapgolly.cids.cidsInts.`49`]
    
    inline def `50`: typingsJapgolly.cids.cidsInts.`50` = 50.asInstanceOf[typingsJapgolly.cids.cidsInts.`50`]
    
    inline def `51`: typingsJapgolly.cids.cidsInts.`51` = 51.asInstanceOf[typingsJapgolly.cids.cidsInts.`51`]
    
    inline def `512`: typingsJapgolly.cids.cidsInts.`512` = 512.asInstanceOf[typingsJapgolly.cids.cidsInts.`512`]
    
    inline def `513`: typingsJapgolly.cids.cidsInts.`513` = 513.asInstanceOf[typingsJapgolly.cids.cidsInts.`513`]
    
    inline def `52753`: typingsJapgolly.cids.cidsInts.`52753` = 52753.asInstanceOf[typingsJapgolly.cids.cidsInts.`52753`]
    
    inline def `53`: typingsJapgolly.cids.cidsInts.`53` = 53.asInstanceOf[typingsJapgolly.cids.cidsInts.`53`]
    
    inline def `54`: typingsJapgolly.cids.cidsInts.`54` = 54.asInstanceOf[typingsJapgolly.cids.cidsInts.`54`]
    
    inline def `55`: typingsJapgolly.cids.cidsInts.`55` = 55.asInstanceOf[typingsJapgolly.cids.cidsInts.`55`]
    
    inline def `56`: typingsJapgolly.cids.cidsInts.`56` = 56.asInstanceOf[typingsJapgolly.cids.cidsInts.`56`]
    
    inline def `6`: typingsJapgolly.cids.cidsInts.`6` = 6.asInstanceOf[typingsJapgolly.cids.cidsInts.`6`]
    
    inline def `61697`: typingsJapgolly.cids.cidsInts.`61697` = 61697.asInstanceOf[typingsJapgolly.cids.cidsInts.`61697`]
    
    inline def `61698`: typingsJapgolly.cids.cidsInts.`61698` = 61698.asInstanceOf[typingsJapgolly.cids.cidsInts.`61698`]
    
    inline def `7425`: typingsJapgolly.cids.cidsInts.`7425` = 7425.asInstanceOf[typingsJapgolly.cids.cidsInts.`7425`]
    
    inline def `769`: typingsJapgolly.cids.cidsInts.`769` = 769.asInstanceOf[typingsJapgolly.cids.cidsInts.`769`]
    
    inline def `80`: typingsJapgolly.cids.cidsInts.`80` = 80.asInstanceOf[typingsJapgolly.cids.cidsInts.`80`]
    
    inline def `81`: typingsJapgolly.cids.cidsInts.`81` = 81.asInstanceOf[typingsJapgolly.cids.cidsInts.`81`]
    
    inline def `8417572`: typingsJapgolly.cids.cidsInts.`8417572` = 8417572.asInstanceOf[typingsJapgolly.cids.cidsInts.`8417572`]
    
    inline def `8483108`: typingsJapgolly.cids.cidsInts.`8483108` = 8483108.asInstanceOf[typingsJapgolly.cids.cidsInts.`8483108`]
    
    inline def `85`: typingsJapgolly.cids.cidsInts.`85` = 85.asInstanceOf[typingsJapgolly.cids.cidsInts.`85`]
    
    inline def `86`: typingsJapgolly.cids.cidsInts.`86` = 86.asInstanceOf[typingsJapgolly.cids.cidsInts.`86`]
    
    inline def `96`: typingsJapgolly.cids.cidsInts.`96` = 96.asInstanceOf[typingsJapgolly.cids.cidsInts.`96`]
    
    inline def `9728292`: typingsJapgolly.cids.cidsInts.`9728292` = 9728292.asInstanceOf[typingsJapgolly.cids.cidsInts.`9728292`]
    
    inline def `9793828`: typingsJapgolly.cids.cidsInts.`9793828` = 9793828.asInstanceOf[typingsJapgolly.cids.cidsInts.`9793828`]
    
    inline def `99`: typingsJapgolly.cids.cidsInts.`99` = 99.asInstanceOf[typingsJapgolly.cids.cidsInts.`99`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cids.cidsStrings.`dag-pb`
    - typingsJapgolly.cids.cidsStrings.identity
    - typingsJapgolly.cids.cidsStrings.cidv1
    - typingsJapgolly.cids.cidsStrings.cidv2
    - typingsJapgolly.cids.cidsStrings.cidv3
    - typingsJapgolly.cids.cidsStrings.ip4
    - typingsJapgolly.cids.cidsStrings.tcp
    - typingsJapgolly.cids.cidsStrings.sha1
    - typingsJapgolly.cids.cidsStrings.`sha2-256`
    - typingsJapgolly.cids.cidsStrings.`sha2-512`
    - typingsJapgolly.cids.cidsStrings.`sha3-512`
    - typingsJapgolly.cids.cidsStrings.`sha3-384`
    - typingsJapgolly.cids.cidsStrings.`sha3-256`
    - typingsJapgolly.cids.cidsStrings.`sha3-224`
    - typingsJapgolly.cids.cidsStrings.`shake-128`
    - typingsJapgolly.cids.cidsStrings.`shake-256`
    - typingsJapgolly.cids.cidsStrings.`keccak-224`
    - typingsJapgolly.cids.cidsStrings.`keccak-256`
    - typingsJapgolly.cids.cidsStrings.`keccak-384`
    - typingsJapgolly.cids.cidsStrings.`keccak-512`
    - typingsJapgolly.cids.cidsStrings.blake3
    - typingsJapgolly.cids.cidsStrings.dccp
    - typingsJapgolly.cids.cidsStrings.`murmur3-128`
    - typingsJapgolly.cids.cidsStrings.`murmur3-32`
    - typingsJapgolly.cids.cidsStrings.ip6
    - typingsJapgolly.cids.cidsStrings.ip6zone
    - typingsJapgolly.cids.cidsStrings.path
    - typingsJapgolly.cids.cidsStrings.multicodec
    - typingsJapgolly.cids.cidsStrings.multihash
    - typingsJapgolly.cids.cidsStrings.multiaddr
    - typingsJapgolly.cids.cidsStrings.multibase
    - typingsJapgolly.cids.cidsStrings.dns
    - typingsJapgolly.cids.cidsStrings.dns4
    - typingsJapgolly.cids.cidsStrings.dns6
    - typingsJapgolly.cids.cidsStrings.dnsaddr
    - typingsJapgolly.cids.cidsStrings.protobuf
    - typingsJapgolly.cids.cidsStrings.cbor
    - typingsJapgolly.cids.cidsStrings.raw
    - typingsJapgolly.cids.cidsStrings.`dbl-sha2-256`
    - typingsJapgolly.cids.cidsStrings.rlp
    - typingsJapgolly.cids.cidsStrings.bencode
    - typingsJapgolly.cids.cidsStrings.`dag-cbor`
    - typingsJapgolly.cids.cidsStrings.`libp2p-key`
    - typingsJapgolly.cids.cidsStrings.`git-raw`
    - typingsJapgolly.cids.cidsStrings.`torrent-info`
    - typingsJapgolly.cids.cidsStrings.`torrent-file`
    - typingsJapgolly.cids.cidsStrings.`leofcoin-block`
    - typingsJapgolly.cids.cidsStrings.`leofcoin-tx`
    - typingsJapgolly.cids.cidsStrings.`leofcoin-pr`
    - typingsJapgolly.cids.cidsStrings.sctp
    - typingsJapgolly.cids.cidsStrings.`dag-jose`
    - typingsJapgolly.cids.cidsStrings.`dag-cose`
    - typingsJapgolly.cids.cidsStrings.`eth-block`
    - typingsJapgolly.cids.cidsStrings.`eth-block-list`
    - typingsJapgolly.cids.cidsStrings.`eth-tx-trie`
    - typingsJapgolly.cids.cidsStrings.`eth-tx`
    - typingsJapgolly.cids.cidsStrings.`eth-tx-receipt-trie`
    - typingsJapgolly.cids.cidsStrings.`eth-tx-receipt`
    - typingsJapgolly.cids.cidsStrings.`eth-state-trie`
    - typingsJapgolly.cids.cidsStrings.`eth-account-snapshot`
    - typingsJapgolly.cids.cidsStrings.`eth-storage-trie`
    - typingsJapgolly.cids.cidsStrings.`bitcoin-block`
    - typingsJapgolly.cids.cidsStrings.`bitcoin-tx`
    - typingsJapgolly.cids.cidsStrings.`bitcoin-witness-commitment`
    - typingsJapgolly.cids.cidsStrings.`zcash-block`
    - typingsJapgolly.cids.cidsStrings.`zcash-tx`
    - typingsJapgolly.cids.cidsStrings.docid
    - typingsJapgolly.cids.cidsStrings.`stellar-block`
    - typingsJapgolly.cids.cidsStrings.`stellar-tx`
    - typingsJapgolly.cids.cidsStrings.md4
    - typingsJapgolly.cids.cidsStrings.md5
    - typingsJapgolly.cids.cidsStrings.bmt
    - typingsJapgolly.cids.cidsStrings.`decred-block`
    - typingsJapgolly.cids.cidsStrings.`decred-tx`
    - typingsJapgolly.cids.cidsStrings.`ipld-ns`
    - typingsJapgolly.cids.cidsStrings.`ipfs-ns`
    - typingsJapgolly.cids.cidsStrings.`swarm-ns`
    - typingsJapgolly.cids.cidsStrings.`ipns-ns`
    - typingsJapgolly.cids.cidsStrings.zeronet
    - typingsJapgolly.cids.cidsStrings.`secp256k1-pub`
    - typingsJapgolly.cids.cidsStrings.`bls12_381-g1-pub`
    - typingsJapgolly.cids.cidsStrings.`bls12_381-g2-pub`
    - typingsJapgolly.cids.cidsStrings.`x25519-pub`
    - typingsJapgolly.cids.cidsStrings.`ed25519-pub`
    - typingsJapgolly.cids.cidsStrings.`bls12_381-g1g2-pub`
    - typingsJapgolly.cids.cidsStrings.`dash-block`
    - typingsJapgolly.cids.cidsStrings.`dash-tx`
    - typingsJapgolly.cids.cidsStrings.`swarm-manifest`
    - typingsJapgolly.cids.cidsStrings.`swarm-feed`
    - typingsJapgolly.cids.cidsStrings.udp
    - typingsJapgolly.cids.cidsStrings.`p2p-webrtc-star`
    - typingsJapgolly.cids.cidsStrings.`p2p-webrtc-direct`
    - typingsJapgolly.cids.cidsStrings.`p2p-stardust`
    - typingsJapgolly.cids.cidsStrings.`p2p-circuit`
    - typingsJapgolly.cids.cidsStrings.`dag-json`
    - typingsJapgolly.cids.cidsStrings.udt
    - typingsJapgolly.cids.cidsStrings.utp
    - typingsJapgolly.cids.cidsStrings.unix
    - typingsJapgolly.cids.cidsStrings.thread
    - typingsJapgolly.cids.cidsStrings.p2p
    - typingsJapgolly.cids.cidsStrings.ipfs
    - typingsJapgolly.cids.cidsStrings.https
    - typingsJapgolly.cids.cidsStrings.onion
    - typingsJapgolly.cids.cidsStrings.onion3
    - typingsJapgolly.cids.cidsStrings.garlic64
    - typingsJapgolly.cids.cidsStrings.garlic32
    - typingsJapgolly.cids.cidsStrings.tls
    - typingsJapgolly.cids.cidsStrings.quic
    - typingsJapgolly.cids.cidsStrings.ws
    - typingsJapgolly.cids.cidsStrings.wss
    - typingsJapgolly.cids.cidsStrings.`p2p-websocket-star`
    - typingsJapgolly.cids.cidsStrings.http
    - typingsJapgolly.cids.cidsStrings.json
    - typingsJapgolly.cids.cidsStrings.messagepack
    - typingsJapgolly.cids.cidsStrings.`libp2p-peer-record`
    - typingsJapgolly.cids.cidsStrings.`sha2-256-trunc254-padded`
    - typingsJapgolly.cids.cidsStrings.`ripemd-128`
    - typingsJapgolly.cids.cidsStrings.`ripemd-160`
    - typingsJapgolly.cids.cidsStrings.`ripemd-256`
    - typingsJapgolly.cids.cidsStrings.`ripemd-320`
    - typingsJapgolly.cids.cidsStrings.x11
    - typingsJapgolly.cids.cidsStrings.`p256-pub`
    - typingsJapgolly.cids.cidsStrings.`p384-pub`
    - typingsJapgolly.cids.cidsStrings.`p521-pub`
    - typingsJapgolly.cids.cidsStrings.`ed448-pub`
    - typingsJapgolly.cids.cidsStrings.`x448-pub`
    - typingsJapgolly.cids.cidsStrings.`ed25519-priv`
    - typingsJapgolly.cids.cidsStrings.kangarootwelve
    - typingsJapgolly.cids.cidsStrings.`sm3-256`
    - typingsJapgolly.cids.cidsStrings.`blake2b-8`
    - typingsJapgolly.cids.cidsStrings.`blake2b-16`
    - typingsJapgolly.cids.cidsStrings.`blake2b-24`
    - typingsJapgolly.cids.cidsStrings.`blake2b-32`
    - typingsJapgolly.cids.cidsStrings.`blake2b-40`
    - typingsJapgolly.cids.cidsStrings.`blake2b-48`
    - typingsJapgolly.cids.cidsStrings.`blake2b-56`
    - typingsJapgolly.cids.cidsStrings.`blake2b-64`
    - typingsJapgolly.cids.cidsStrings.`blake2b-72`
    - typingsJapgolly.cids.cidsStrings.`blake2b-80`
    - typingsJapgolly.cids.cidsStrings.`blake2b-88`
    - typingsJapgolly.cids.cidsStrings.`blake2b-96`
    - typingsJapgolly.cids.cidsStrings.`blake2b-104`
    - typingsJapgolly.cids.cidsStrings.`blake2b-112`
    - typingsJapgolly.cids.cidsStrings.`blake2b-120`
    - typingsJapgolly.cids.cidsStrings.`blake2b-128`
    - typingsJapgolly.cids.cidsStrings.`blake2b-136`
    - typingsJapgolly.cids.cidsStrings.`blake2b-144`
    - typingsJapgolly.cids.cidsStrings.`blake2b-152`
    - typingsJapgolly.cids.cidsStrings.`blake2b-160`
    - typingsJapgolly.cids.cidsStrings.`blake2b-168`
    - typingsJapgolly.cids.cidsStrings.`blake2b-176`
    - typingsJapgolly.cids.cidsStrings.`blake2b-184`
    - typingsJapgolly.cids.cidsStrings.`blake2b-192`
    - typingsJapgolly.cids.cidsStrings.`blake2b-200`
    - typingsJapgolly.cids.cidsStrings.`blake2b-208`
    - typingsJapgolly.cids.cidsStrings.`blake2b-216`
    - typingsJapgolly.cids.cidsStrings.`blake2b-224`
    - typingsJapgolly.cids.cidsStrings.`blake2b-232`
    - typingsJapgolly.cids.cidsStrings.`blake2b-240`
    - typingsJapgolly.cids.cidsStrings.`blake2b-248`
    - typingsJapgolly.cids.cidsStrings.`blake2b-256`
    - typingsJapgolly.cids.cidsStrings.`blake2b-264`
    - typingsJapgolly.cids.cidsStrings.`blake2b-272`
    - typingsJapgolly.cids.cidsStrings.`blake2b-280`
    - typingsJapgolly.cids.cidsStrings.`blake2b-288`
    - typingsJapgolly.cids.cidsStrings.`blake2b-296`
    - typingsJapgolly.cids.cidsStrings.`blake2b-304`
    - typingsJapgolly.cids.cidsStrings.`blake2b-312`
    - typingsJapgolly.cids.cidsStrings.`blake2b-320`
    - typingsJapgolly.cids.cidsStrings.`blake2b-328`
    - typingsJapgolly.cids.cidsStrings.`blake2b-336`
    - typingsJapgolly.cids.cidsStrings.`blake2b-344`
    - typingsJapgolly.cids.cidsStrings.`blake2b-352`
    - typingsJapgolly.cids.cidsStrings.`blake2b-360`
    - typingsJapgolly.cids.cidsStrings.`blake2b-368`
    - typingsJapgolly.cids.cidsStrings.`blake2b-376`
    - typingsJapgolly.cids.cidsStrings.`blake2b-384`
    - typingsJapgolly.cids.cidsStrings.`blake2b-392`
    - typingsJapgolly.cids.cidsStrings.`blake2b-400`
    - typingsJapgolly.cids.cidsStrings.`blake2b-408`
    - typingsJapgolly.cids.cidsStrings.`blake2b-416`
    - typingsJapgolly.cids.cidsStrings.`blake2b-424`
    - typingsJapgolly.cids.cidsStrings.`blake2b-432`
    - typingsJapgolly.cids.cidsStrings.`blake2b-440`
    - typingsJapgolly.cids.cidsStrings.`blake2b-448`
    - typingsJapgolly.cids.cidsStrings.`blake2b-456`
    - typingsJapgolly.cids.cidsStrings.`blake2b-464`
    - typingsJapgolly.cids.cidsStrings.`blake2b-472`
    - typingsJapgolly.cids.cidsStrings.`blake2b-480`
    - typingsJapgolly.cids.cidsStrings.`blake2b-488`
    - typingsJapgolly.cids.cidsStrings.`blake2b-496`
    - typingsJapgolly.cids.cidsStrings.`blake2b-504`
    - typingsJapgolly.cids.cidsStrings.`blake2b-512`
    - typingsJapgolly.cids.cidsStrings.`blake2s-8`
    - typingsJapgolly.cids.cidsStrings.`blake2s-16`
    - typingsJapgolly.cids.cidsStrings.`blake2s-24`
    - typingsJapgolly.cids.cidsStrings.`blake2s-32`
    - typingsJapgolly.cids.cidsStrings.`blake2s-40`
    - typingsJapgolly.cids.cidsStrings.`blake2s-48`
    - typingsJapgolly.cids.cidsStrings.`blake2s-56`
    - typingsJapgolly.cids.cidsStrings.`blake2s-64`
    - typingsJapgolly.cids.cidsStrings.`blake2s-72`
    - typingsJapgolly.cids.cidsStrings.`blake2s-80`
    - typingsJapgolly.cids.cidsStrings.`blake2s-88`
    - typingsJapgolly.cids.cidsStrings.`blake2s-96`
    - typingsJapgolly.cids.cidsStrings.`blake2s-104`
    - typingsJapgolly.cids.cidsStrings.`blake2s-112`
    - typingsJapgolly.cids.cidsStrings.`blake2s-120`
    - typingsJapgolly.cids.cidsStrings.`blake2s-128`
    - typingsJapgolly.cids.cidsStrings.`blake2s-136`
    - typingsJapgolly.cids.cidsStrings.`blake2s-144`
    - typingsJapgolly.cids.cidsStrings.`blake2s-152`
    - typingsJapgolly.cids.cidsStrings.`blake2s-160`
    - typingsJapgolly.cids.cidsStrings.`blake2s-168`
    - typingsJapgolly.cids.cidsStrings.`blake2s-176`
    - typingsJapgolly.cids.cidsStrings.`blake2s-184`
    - typingsJapgolly.cids.cidsStrings.`blake2s-192`
    - typingsJapgolly.cids.cidsStrings.`blake2s-200`
    - typingsJapgolly.cids.cidsStrings.`blake2s-208`
    - typingsJapgolly.cids.cidsStrings.`blake2s-216`
    - typingsJapgolly.cids.cidsStrings.`blake2s-224`
    - typingsJapgolly.cids.cidsStrings.`blake2s-232`
    - typingsJapgolly.cids.cidsStrings.`blake2s-240`
    - typingsJapgolly.cids.cidsStrings.`blake2s-248`
    - typingsJapgolly.cids.cidsStrings.`blake2s-256`
    - typingsJapgolly.cids.cidsStrings.`skein256-8`
    - typingsJapgolly.cids.cidsStrings.`skein256-16`
    - typingsJapgolly.cids.cidsStrings.`skein256-24`
    - typingsJapgolly.cids.cidsStrings.`skein256-32`
    - typingsJapgolly.cids.cidsStrings.`skein256-40`
    - typingsJapgolly.cids.cidsStrings.`skein256-48`
    - typingsJapgolly.cids.cidsStrings.`skein256-56`
    - typingsJapgolly.cids.cidsStrings.`skein256-64`
    - typingsJapgolly.cids.cidsStrings.`skein256-72`
    - typingsJapgolly.cids.cidsStrings.`skein256-80`
    - typingsJapgolly.cids.cidsStrings.`skein256-88`
    - typingsJapgolly.cids.cidsStrings.`skein256-96`
    - typingsJapgolly.cids.cidsStrings.`skein256-104`
    - typingsJapgolly.cids.cidsStrings.`skein256-112`
    - typingsJapgolly.cids.cidsStrings.`skein256-120`
    - typingsJapgolly.cids.cidsStrings.`skein256-128`
    - typingsJapgolly.cids.cidsStrings.`skein256-136`
    - typingsJapgolly.cids.cidsStrings.`skein256-144`
    - typingsJapgolly.cids.cidsStrings.`skein256-152`
    - typingsJapgolly.cids.cidsStrings.`skein256-160`
    - typingsJapgolly.cids.cidsStrings.`skein256-168`
    - typingsJapgolly.cids.cidsStrings.`skein256-176`
    - typingsJapgolly.cids.cidsStrings.`skein256-184`
    - typingsJapgolly.cids.cidsStrings.`skein256-192`
    - typingsJapgolly.cids.cidsStrings.`skein256-200`
    - typingsJapgolly.cids.cidsStrings.`skein256-208`
    - typingsJapgolly.cids.cidsStrings.`skein256-216`
    - typingsJapgolly.cids.cidsStrings.`skein256-224`
    - typingsJapgolly.cids.cidsStrings.`skein256-232`
    - typingsJapgolly.cids.cidsStrings.`skein256-240`
    - typingsJapgolly.cids.cidsStrings.`skein256-248`
    - typingsJapgolly.cids.cidsStrings.`skein256-256`
    - typingsJapgolly.cids.cidsStrings.`skein512-8`
    - typingsJapgolly.cids.cidsStrings.`skein512-16`
    - typingsJapgolly.cids.cidsStrings.`skein512-24`
    - typingsJapgolly.cids.cidsStrings.`skein512-32`
    - typingsJapgolly.cids.cidsStrings.`skein512-40`
    - typingsJapgolly.cids.cidsStrings.`skein512-48`
    - typingsJapgolly.cids.cidsStrings.`skein512-56`
    - typingsJapgolly.cids.cidsStrings.`skein512-64`
    - typingsJapgolly.cids.cidsStrings.`skein512-72`
    - typingsJapgolly.cids.cidsStrings.`skein512-80`
    - typingsJapgolly.cids.cidsStrings.`skein512-88`
    - typingsJapgolly.cids.cidsStrings.`skein512-96`
    - typingsJapgolly.cids.cidsStrings.`skein512-104`
    - typingsJapgolly.cids.cidsStrings.`skein512-112`
    - typingsJapgolly.cids.cidsStrings.`skein512-120`
    - typingsJapgolly.cids.cidsStrings.`skein512-128`
    - typingsJapgolly.cids.cidsStrings.`skein512-136`
    - typingsJapgolly.cids.cidsStrings.`skein512-144`
    - typingsJapgolly.cids.cidsStrings.`skein512-152`
    - typingsJapgolly.cids.cidsStrings.`skein512-160`
    - typingsJapgolly.cids.cidsStrings.`skein512-168`
    - typingsJapgolly.cids.cidsStrings.`skein512-176`
    - typingsJapgolly.cids.cidsStrings.`skein512-184`
    - typingsJapgolly.cids.cidsStrings.`skein512-192`
    - typingsJapgolly.cids.cidsStrings.`skein512-200`
    - typingsJapgolly.cids.cidsStrings.`skein512-208`
    - typingsJapgolly.cids.cidsStrings.`skein512-216`
    - typingsJapgolly.cids.cidsStrings.`skein512-224`
    - typingsJapgolly.cids.cidsStrings.`skein512-232`
    - typingsJapgolly.cids.cidsStrings.`skein512-240`
    - typingsJapgolly.cids.cidsStrings.`skein512-248`
    - typingsJapgolly.cids.cidsStrings.`skein512-256`
    - typingsJapgolly.cids.cidsStrings.`skein512-264`
    - typingsJapgolly.cids.cidsStrings.`skein512-272`
    - typingsJapgolly.cids.cidsStrings.`skein512-280`
    - typingsJapgolly.cids.cidsStrings.`skein512-288`
    - typingsJapgolly.cids.cidsStrings.`skein512-296`
    - typingsJapgolly.cids.cidsStrings.`skein512-304`
    - typingsJapgolly.cids.cidsStrings.`skein512-312`
    - typingsJapgolly.cids.cidsStrings.`skein512-320`
    - typingsJapgolly.cids.cidsStrings.`skein512-328`
    - typingsJapgolly.cids.cidsStrings.`skein512-336`
    - typingsJapgolly.cids.cidsStrings.`skein512-344`
    - typingsJapgolly.cids.cidsStrings.`skein512-352`
    - typingsJapgolly.cids.cidsStrings.`skein512-360`
    - typingsJapgolly.cids.cidsStrings.`skein512-368`
    - typingsJapgolly.cids.cidsStrings.`skein512-376`
    - typingsJapgolly.cids.cidsStrings.`skein512-384`
    - typingsJapgolly.cids.cidsStrings.`skein512-392`
    - typingsJapgolly.cids.cidsStrings.`skein512-400`
    - typingsJapgolly.cids.cidsStrings.`skein512-408`
    - typingsJapgolly.cids.cidsStrings.`skein512-416`
    - typingsJapgolly.cids.cidsStrings.`skein512-424`
    - typingsJapgolly.cids.cidsStrings.`skein512-432`
    - typingsJapgolly.cids.cidsStrings.`skein512-440`
    - typingsJapgolly.cids.cidsStrings.`skein512-448`
    - typingsJapgolly.cids.cidsStrings.`skein512-456`
    - typingsJapgolly.cids.cidsStrings.`skein512-464`
    - typingsJapgolly.cids.cidsStrings.`skein512-472`
    - typingsJapgolly.cids.cidsStrings.`skein512-480`
    - typingsJapgolly.cids.cidsStrings.`skein512-488`
    - typingsJapgolly.cids.cidsStrings.`skein512-496`
    - typingsJapgolly.cids.cidsStrings.`skein512-504`
    - typingsJapgolly.cids.cidsStrings.`skein512-512`
    - typingsJapgolly.cids.cidsStrings.`skein1024-8`
    - typingsJapgolly.cids.cidsStrings.`skein1024-16`
    - typingsJapgolly.cids.cidsStrings.`skein1024-24`
    - typingsJapgolly.cids.cidsStrings.`skein1024-32`
    - typingsJapgolly.cids.cidsStrings.`skein1024-40`
    - typingsJapgolly.cids.cidsStrings.`skein1024-48`
    - typingsJapgolly.cids.cidsStrings.`skein1024-56`
    - typingsJapgolly.cids.cidsStrings.`skein1024-64`
    - typingsJapgolly.cids.cidsStrings.`skein1024-72`
    - typingsJapgolly.cids.cidsStrings.`skein1024-80`
    - typingsJapgolly.cids.cidsStrings.`skein1024-88`
    - typingsJapgolly.cids.cidsStrings.`skein1024-96`
    - typingsJapgolly.cids.cidsStrings.`skein1024-104`
    - typingsJapgolly.cids.cidsStrings.`skein1024-112`
    - typingsJapgolly.cids.cidsStrings.`skein1024-120`
    - typingsJapgolly.cids.cidsStrings.`skein1024-128`
    - typingsJapgolly.cids.cidsStrings.`skein1024-136`
    - typingsJapgolly.cids.cidsStrings.`skein1024-144`
    - typingsJapgolly.cids.cidsStrings.`skein1024-152`
    - typingsJapgolly.cids.cidsStrings.`skein1024-160`
    - typingsJapgolly.cids.cidsStrings.`skein1024-168`
    - typingsJapgolly.cids.cidsStrings.`skein1024-176`
    - typingsJapgolly.cids.cidsStrings.`skein1024-184`
    - typingsJapgolly.cids.cidsStrings.`skein1024-192`
    - typingsJapgolly.cids.cidsStrings.`skein1024-200`
    - typingsJapgolly.cids.cidsStrings.`skein1024-208`
    - typingsJapgolly.cids.cidsStrings.`skein1024-216`
    - typingsJapgolly.cids.cidsStrings.`skein1024-224`
    - typingsJapgolly.cids.cidsStrings.`skein1024-232`
    - typingsJapgolly.cids.cidsStrings.`skein1024-240`
    - typingsJapgolly.cids.cidsStrings.`skein1024-248`
    - typingsJapgolly.cids.cidsStrings.`skein1024-256`
    - typingsJapgolly.cids.cidsStrings.`skein1024-264`
    - typingsJapgolly.cids.cidsStrings.`skein1024-272`
    - typingsJapgolly.cids.cidsStrings.`skein1024-280`
    - typingsJapgolly.cids.cidsStrings.`skein1024-288`
    - typingsJapgolly.cids.cidsStrings.`skein1024-296`
    - typingsJapgolly.cids.cidsStrings.`skein1024-304`
    - typingsJapgolly.cids.cidsStrings.`skein1024-312`
    - typingsJapgolly.cids.cidsStrings.`skein1024-320`
    - typingsJapgolly.cids.cidsStrings.`skein1024-328`
    - typingsJapgolly.cids.cidsStrings.`skein1024-336`
    - typingsJapgolly.cids.cidsStrings.`skein1024-344`
    - typingsJapgolly.cids.cidsStrings.`skein1024-352`
    - typingsJapgolly.cids.cidsStrings.`skein1024-360`
    - typingsJapgolly.cids.cidsStrings.`skein1024-368`
    - typingsJapgolly.cids.cidsStrings.`skein1024-376`
    - typingsJapgolly.cids.cidsStrings.`skein1024-384`
    - typingsJapgolly.cids.cidsStrings.`skein1024-392`
    - typingsJapgolly.cids.cidsStrings.`skein1024-400`
    - typingsJapgolly.cids.cidsStrings.`skein1024-408`
    - typingsJapgolly.cids.cidsStrings.`skein1024-416`
    - typingsJapgolly.cids.cidsStrings.`skein1024-424`
    - typingsJapgolly.cids.cidsStrings.`skein1024-432`
    - typingsJapgolly.cids.cidsStrings.`skein1024-440`
    - typingsJapgolly.cids.cidsStrings.`skein1024-448`
    - typingsJapgolly.cids.cidsStrings.`skein1024-456`
    - typingsJapgolly.cids.cidsStrings.`skein1024-464`
    - typingsJapgolly.cids.cidsStrings.`skein1024-472`
    - typingsJapgolly.cids.cidsStrings.`skein1024-480`
    - typingsJapgolly.cids.cidsStrings.`skein1024-488`
    - typingsJapgolly.cids.cidsStrings.`skein1024-496`
    - typingsJapgolly.cids.cidsStrings.`skein1024-504`
    - typingsJapgolly.cids.cidsStrings.`skein1024-512`
    - typingsJapgolly.cids.cidsStrings.`skein1024-520`
    - typingsJapgolly.cids.cidsStrings.`skein1024-528`
    - typingsJapgolly.cids.cidsStrings.`skein1024-536`
    - typingsJapgolly.cids.cidsStrings.`skein1024-544`
    - typingsJapgolly.cids.cidsStrings.`skein1024-552`
    - typingsJapgolly.cids.cidsStrings.`skein1024-560`
    - typingsJapgolly.cids.cidsStrings.`skein1024-568`
    - typingsJapgolly.cids.cidsStrings.`skein1024-576`
    - typingsJapgolly.cids.cidsStrings.`skein1024-584`
    - typingsJapgolly.cids.cidsStrings.`skein1024-592`
    - typingsJapgolly.cids.cidsStrings.`skein1024-600`
    - typingsJapgolly.cids.cidsStrings.`skein1024-608`
    - typingsJapgolly.cids.cidsStrings.`skein1024-616`
    - typingsJapgolly.cids.cidsStrings.`skein1024-624`
    - typingsJapgolly.cids.cidsStrings.`skein1024-632`
    - typingsJapgolly.cids.cidsStrings.`skein1024-640`
    - typingsJapgolly.cids.cidsStrings.`skein1024-648`
    - typingsJapgolly.cids.cidsStrings.`skein1024-656`
    - typingsJapgolly.cids.cidsStrings.`skein1024-664`
    - typingsJapgolly.cids.cidsStrings.`skein1024-672`
    - typingsJapgolly.cids.cidsStrings.`skein1024-680`
    - typingsJapgolly.cids.cidsStrings.`skein1024-688`
    - typingsJapgolly.cids.cidsStrings.`skein1024-696`
    - typingsJapgolly.cids.cidsStrings.`skein1024-704`
    - typingsJapgolly.cids.cidsStrings.`skein1024-712`
    - typingsJapgolly.cids.cidsStrings.`skein1024-720`
    - typingsJapgolly.cids.cidsStrings.`skein1024-728`
    - typingsJapgolly.cids.cidsStrings.`skein1024-736`
    - typingsJapgolly.cids.cidsStrings.`skein1024-744`
    - typingsJapgolly.cids.cidsStrings.`skein1024-752`
    - typingsJapgolly.cids.cidsStrings.`skein1024-760`
    - typingsJapgolly.cids.cidsStrings.`skein1024-768`
    - typingsJapgolly.cids.cidsStrings.`skein1024-776`
    - typingsJapgolly.cids.cidsStrings.`skein1024-784`
    - typingsJapgolly.cids.cidsStrings.`skein1024-792`
    - typingsJapgolly.cids.cidsStrings.`skein1024-800`
    - typingsJapgolly.cids.cidsStrings.`skein1024-808`
    - typingsJapgolly.cids.cidsStrings.`skein1024-816`
    - typingsJapgolly.cids.cidsStrings.`skein1024-824`
    - typingsJapgolly.cids.cidsStrings.`skein1024-832`
    - typingsJapgolly.cids.cidsStrings.`skein1024-840`
    - typingsJapgolly.cids.cidsStrings.`skein1024-848`
    - typingsJapgolly.cids.cidsStrings.`skein1024-856`
    - typingsJapgolly.cids.cidsStrings.`skein1024-864`
    - typingsJapgolly.cids.cidsStrings.`skein1024-872`
    - typingsJapgolly.cids.cidsStrings.`skein1024-880`
    - typingsJapgolly.cids.cidsStrings.`skein1024-888`
    - typingsJapgolly.cids.cidsStrings.`skein1024-896`
    - typingsJapgolly.cids.cidsStrings.`skein1024-904`
    - typingsJapgolly.cids.cidsStrings.`skein1024-912`
    - typingsJapgolly.cids.cidsStrings.`skein1024-920`
    - typingsJapgolly.cids.cidsStrings.`skein1024-928`
    - typingsJapgolly.cids.cidsStrings.`skein1024-936`
    - typingsJapgolly.cids.cidsStrings.`skein1024-944`
    - typingsJapgolly.cids.cidsStrings.`skein1024-952`
    - typingsJapgolly.cids.cidsStrings.`skein1024-960`
    - typingsJapgolly.cids.cidsStrings.`skein1024-968`
    - typingsJapgolly.cids.cidsStrings.`skein1024-976`
    - typingsJapgolly.cids.cidsStrings.`skein1024-984`
    - typingsJapgolly.cids.cidsStrings.`skein1024-992`
    - typingsJapgolly.cids.cidsStrings.`skein1024-1000`
    - typingsJapgolly.cids.cidsStrings.`skein1024-1008`
    - typingsJapgolly.cids.cidsStrings.`skein1024-1016`
    - typingsJapgolly.cids.cidsStrings.`skein1024-1024`
    - typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1`
    - typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc`
    - typingsJapgolly.cids.cidsStrings.`zeroxcert-imprint-256`
    - typingsJapgolly.cids.cidsStrings.`fil-commitment-unsealed`
    - typingsJapgolly.cids.cidsStrings.`fil-commitment-sealed`
    - typingsJapgolly.cids.cidsStrings.`holochain-adr-v0`
    - typingsJapgolly.cids.cidsStrings.`holochain-adr-v1`
    - typingsJapgolly.cids.cidsStrings.`holochain-key-v0`
    - typingsJapgolly.cids.cidsStrings.`holochain-key-v1`
    - typingsJapgolly.cids.cidsStrings.`holochain-sig-v0`
    - typingsJapgolly.cids.cidsStrings.`holochain-sig-v1`
    - typingsJapgolly.cids.cidsStrings.`skynet-ns`
  */
  trait CodecName extends StObject
  object CodecName {
    
    inline def bencode: typingsJapgolly.cids.cidsStrings.bencode = "bencode".asInstanceOf[typingsJapgolly.cids.cidsStrings.bencode]
    
    inline def `bitcoin-block`: typingsJapgolly.cids.cidsStrings.`bitcoin-block` = "bitcoin-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bitcoin-block`]
    
    inline def `bitcoin-tx`: typingsJapgolly.cids.cidsStrings.`bitcoin-tx` = "bitcoin-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bitcoin-tx`]
    
    inline def `bitcoin-witness-commitment`: typingsJapgolly.cids.cidsStrings.`bitcoin-witness-commitment` = "bitcoin-witness-commitment".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bitcoin-witness-commitment`]
    
    inline def `blake2b-104`: typingsJapgolly.cids.cidsStrings.`blake2b-104` = "blake2b-104".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-104`]
    
    inline def `blake2b-112`: typingsJapgolly.cids.cidsStrings.`blake2b-112` = "blake2b-112".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-112`]
    
    inline def `blake2b-120`: typingsJapgolly.cids.cidsStrings.`blake2b-120` = "blake2b-120".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-120`]
    
    inline def `blake2b-128`: typingsJapgolly.cids.cidsStrings.`blake2b-128` = "blake2b-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-128`]
    
    inline def `blake2b-136`: typingsJapgolly.cids.cidsStrings.`blake2b-136` = "blake2b-136".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-136`]
    
    inline def `blake2b-144`: typingsJapgolly.cids.cidsStrings.`blake2b-144` = "blake2b-144".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-144`]
    
    inline def `blake2b-152`: typingsJapgolly.cids.cidsStrings.`blake2b-152` = "blake2b-152".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-152`]
    
    inline def `blake2b-16`: typingsJapgolly.cids.cidsStrings.`blake2b-16` = "blake2b-16".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-16`]
    
    inline def `blake2b-160`: typingsJapgolly.cids.cidsStrings.`blake2b-160` = "blake2b-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-160`]
    
    inline def `blake2b-168`: typingsJapgolly.cids.cidsStrings.`blake2b-168` = "blake2b-168".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-168`]
    
    inline def `blake2b-176`: typingsJapgolly.cids.cidsStrings.`blake2b-176` = "blake2b-176".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-176`]
    
    inline def `blake2b-184`: typingsJapgolly.cids.cidsStrings.`blake2b-184` = "blake2b-184".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-184`]
    
    inline def `blake2b-192`: typingsJapgolly.cids.cidsStrings.`blake2b-192` = "blake2b-192".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-192`]
    
    inline def `blake2b-200`: typingsJapgolly.cids.cidsStrings.`blake2b-200` = "blake2b-200".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-200`]
    
    inline def `blake2b-208`: typingsJapgolly.cids.cidsStrings.`blake2b-208` = "blake2b-208".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-208`]
    
    inline def `blake2b-216`: typingsJapgolly.cids.cidsStrings.`blake2b-216` = "blake2b-216".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-216`]
    
    inline def `blake2b-224`: typingsJapgolly.cids.cidsStrings.`blake2b-224` = "blake2b-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-224`]
    
    inline def `blake2b-232`: typingsJapgolly.cids.cidsStrings.`blake2b-232` = "blake2b-232".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-232`]
    
    inline def `blake2b-24`: typingsJapgolly.cids.cidsStrings.`blake2b-24` = "blake2b-24".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-24`]
    
    inline def `blake2b-240`: typingsJapgolly.cids.cidsStrings.`blake2b-240` = "blake2b-240".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-240`]
    
    inline def `blake2b-248`: typingsJapgolly.cids.cidsStrings.`blake2b-248` = "blake2b-248".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-248`]
    
    inline def `blake2b-256`: typingsJapgolly.cids.cidsStrings.`blake2b-256` = "blake2b-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-256`]
    
    inline def `blake2b-264`: typingsJapgolly.cids.cidsStrings.`blake2b-264` = "blake2b-264".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-264`]
    
    inline def `blake2b-272`: typingsJapgolly.cids.cidsStrings.`blake2b-272` = "blake2b-272".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-272`]
    
    inline def `blake2b-280`: typingsJapgolly.cids.cidsStrings.`blake2b-280` = "blake2b-280".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-280`]
    
    inline def `blake2b-288`: typingsJapgolly.cids.cidsStrings.`blake2b-288` = "blake2b-288".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-288`]
    
    inline def `blake2b-296`: typingsJapgolly.cids.cidsStrings.`blake2b-296` = "blake2b-296".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-296`]
    
    inline def `blake2b-304`: typingsJapgolly.cids.cidsStrings.`blake2b-304` = "blake2b-304".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-304`]
    
    inline def `blake2b-312`: typingsJapgolly.cids.cidsStrings.`blake2b-312` = "blake2b-312".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-312`]
    
    inline def `blake2b-32`: typingsJapgolly.cids.cidsStrings.`blake2b-32` = "blake2b-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-32`]
    
    inline def `blake2b-320`: typingsJapgolly.cids.cidsStrings.`blake2b-320` = "blake2b-320".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-320`]
    
    inline def `blake2b-328`: typingsJapgolly.cids.cidsStrings.`blake2b-328` = "blake2b-328".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-328`]
    
    inline def `blake2b-336`: typingsJapgolly.cids.cidsStrings.`blake2b-336` = "blake2b-336".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-336`]
    
    inline def `blake2b-344`: typingsJapgolly.cids.cidsStrings.`blake2b-344` = "blake2b-344".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-344`]
    
    inline def `blake2b-352`: typingsJapgolly.cids.cidsStrings.`blake2b-352` = "blake2b-352".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-352`]
    
    inline def `blake2b-360`: typingsJapgolly.cids.cidsStrings.`blake2b-360` = "blake2b-360".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-360`]
    
    inline def `blake2b-368`: typingsJapgolly.cids.cidsStrings.`blake2b-368` = "blake2b-368".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-368`]
    
    inline def `blake2b-376`: typingsJapgolly.cids.cidsStrings.`blake2b-376` = "blake2b-376".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-376`]
    
    inline def `blake2b-384`: typingsJapgolly.cids.cidsStrings.`blake2b-384` = "blake2b-384".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-384`]
    
    inline def `blake2b-392`: typingsJapgolly.cids.cidsStrings.`blake2b-392` = "blake2b-392".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-392`]
    
    inline def `blake2b-40`: typingsJapgolly.cids.cidsStrings.`blake2b-40` = "blake2b-40".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-40`]
    
    inline def `blake2b-400`: typingsJapgolly.cids.cidsStrings.`blake2b-400` = "blake2b-400".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-400`]
    
    inline def `blake2b-408`: typingsJapgolly.cids.cidsStrings.`blake2b-408` = "blake2b-408".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-408`]
    
    inline def `blake2b-416`: typingsJapgolly.cids.cidsStrings.`blake2b-416` = "blake2b-416".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-416`]
    
    inline def `blake2b-424`: typingsJapgolly.cids.cidsStrings.`blake2b-424` = "blake2b-424".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-424`]
    
    inline def `blake2b-432`: typingsJapgolly.cids.cidsStrings.`blake2b-432` = "blake2b-432".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-432`]
    
    inline def `blake2b-440`: typingsJapgolly.cids.cidsStrings.`blake2b-440` = "blake2b-440".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-440`]
    
    inline def `blake2b-448`: typingsJapgolly.cids.cidsStrings.`blake2b-448` = "blake2b-448".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-448`]
    
    inline def `blake2b-456`: typingsJapgolly.cids.cidsStrings.`blake2b-456` = "blake2b-456".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-456`]
    
    inline def `blake2b-464`: typingsJapgolly.cids.cidsStrings.`blake2b-464` = "blake2b-464".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-464`]
    
    inline def `blake2b-472`: typingsJapgolly.cids.cidsStrings.`blake2b-472` = "blake2b-472".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-472`]
    
    inline def `blake2b-48`: typingsJapgolly.cids.cidsStrings.`blake2b-48` = "blake2b-48".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-48`]
    
    inline def `blake2b-480`: typingsJapgolly.cids.cidsStrings.`blake2b-480` = "blake2b-480".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-480`]
    
    inline def `blake2b-488`: typingsJapgolly.cids.cidsStrings.`blake2b-488` = "blake2b-488".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-488`]
    
    inline def `blake2b-496`: typingsJapgolly.cids.cidsStrings.`blake2b-496` = "blake2b-496".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-496`]
    
    inline def `blake2b-504`: typingsJapgolly.cids.cidsStrings.`blake2b-504` = "blake2b-504".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-504`]
    
    inline def `blake2b-512`: typingsJapgolly.cids.cidsStrings.`blake2b-512` = "blake2b-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-512`]
    
    inline def `blake2b-56`: typingsJapgolly.cids.cidsStrings.`blake2b-56` = "blake2b-56".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-56`]
    
    inline def `blake2b-64`: typingsJapgolly.cids.cidsStrings.`blake2b-64` = "blake2b-64".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-64`]
    
    inline def `blake2b-72`: typingsJapgolly.cids.cidsStrings.`blake2b-72` = "blake2b-72".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-72`]
    
    inline def `blake2b-8`: typingsJapgolly.cids.cidsStrings.`blake2b-8` = "blake2b-8".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-8`]
    
    inline def `blake2b-80`: typingsJapgolly.cids.cidsStrings.`blake2b-80` = "blake2b-80".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-80`]
    
    inline def `blake2b-88`: typingsJapgolly.cids.cidsStrings.`blake2b-88` = "blake2b-88".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-88`]
    
    inline def `blake2b-96`: typingsJapgolly.cids.cidsStrings.`blake2b-96` = "blake2b-96".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2b-96`]
    
    inline def `blake2s-104`: typingsJapgolly.cids.cidsStrings.`blake2s-104` = "blake2s-104".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-104`]
    
    inline def `blake2s-112`: typingsJapgolly.cids.cidsStrings.`blake2s-112` = "blake2s-112".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-112`]
    
    inline def `blake2s-120`: typingsJapgolly.cids.cidsStrings.`blake2s-120` = "blake2s-120".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-120`]
    
    inline def `blake2s-128`: typingsJapgolly.cids.cidsStrings.`blake2s-128` = "blake2s-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-128`]
    
    inline def `blake2s-136`: typingsJapgolly.cids.cidsStrings.`blake2s-136` = "blake2s-136".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-136`]
    
    inline def `blake2s-144`: typingsJapgolly.cids.cidsStrings.`blake2s-144` = "blake2s-144".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-144`]
    
    inline def `blake2s-152`: typingsJapgolly.cids.cidsStrings.`blake2s-152` = "blake2s-152".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-152`]
    
    inline def `blake2s-16`: typingsJapgolly.cids.cidsStrings.`blake2s-16` = "blake2s-16".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-16`]
    
    inline def `blake2s-160`: typingsJapgolly.cids.cidsStrings.`blake2s-160` = "blake2s-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-160`]
    
    inline def `blake2s-168`: typingsJapgolly.cids.cidsStrings.`blake2s-168` = "blake2s-168".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-168`]
    
    inline def `blake2s-176`: typingsJapgolly.cids.cidsStrings.`blake2s-176` = "blake2s-176".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-176`]
    
    inline def `blake2s-184`: typingsJapgolly.cids.cidsStrings.`blake2s-184` = "blake2s-184".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-184`]
    
    inline def `blake2s-192`: typingsJapgolly.cids.cidsStrings.`blake2s-192` = "blake2s-192".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-192`]
    
    inline def `blake2s-200`: typingsJapgolly.cids.cidsStrings.`blake2s-200` = "blake2s-200".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-200`]
    
    inline def `blake2s-208`: typingsJapgolly.cids.cidsStrings.`blake2s-208` = "blake2s-208".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-208`]
    
    inline def `blake2s-216`: typingsJapgolly.cids.cidsStrings.`blake2s-216` = "blake2s-216".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-216`]
    
    inline def `blake2s-224`: typingsJapgolly.cids.cidsStrings.`blake2s-224` = "blake2s-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-224`]
    
    inline def `blake2s-232`: typingsJapgolly.cids.cidsStrings.`blake2s-232` = "blake2s-232".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-232`]
    
    inline def `blake2s-24`: typingsJapgolly.cids.cidsStrings.`blake2s-24` = "blake2s-24".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-24`]
    
    inline def `blake2s-240`: typingsJapgolly.cids.cidsStrings.`blake2s-240` = "blake2s-240".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-240`]
    
    inline def `blake2s-248`: typingsJapgolly.cids.cidsStrings.`blake2s-248` = "blake2s-248".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-248`]
    
    inline def `blake2s-256`: typingsJapgolly.cids.cidsStrings.`blake2s-256` = "blake2s-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-256`]
    
    inline def `blake2s-32`: typingsJapgolly.cids.cidsStrings.`blake2s-32` = "blake2s-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-32`]
    
    inline def `blake2s-40`: typingsJapgolly.cids.cidsStrings.`blake2s-40` = "blake2s-40".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-40`]
    
    inline def `blake2s-48`: typingsJapgolly.cids.cidsStrings.`blake2s-48` = "blake2s-48".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-48`]
    
    inline def `blake2s-56`: typingsJapgolly.cids.cidsStrings.`blake2s-56` = "blake2s-56".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-56`]
    
    inline def `blake2s-64`: typingsJapgolly.cids.cidsStrings.`blake2s-64` = "blake2s-64".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-64`]
    
    inline def `blake2s-72`: typingsJapgolly.cids.cidsStrings.`blake2s-72` = "blake2s-72".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-72`]
    
    inline def `blake2s-8`: typingsJapgolly.cids.cidsStrings.`blake2s-8` = "blake2s-8".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-8`]
    
    inline def `blake2s-80`: typingsJapgolly.cids.cidsStrings.`blake2s-80` = "blake2s-80".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-80`]
    
    inline def `blake2s-88`: typingsJapgolly.cids.cidsStrings.`blake2s-88` = "blake2s-88".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-88`]
    
    inline def `blake2s-96`: typingsJapgolly.cids.cidsStrings.`blake2s-96` = "blake2s-96".asInstanceOf[typingsJapgolly.cids.cidsStrings.`blake2s-96`]
    
    inline def blake3: typingsJapgolly.cids.cidsStrings.blake3 = "blake3".asInstanceOf[typingsJapgolly.cids.cidsStrings.blake3]
    
    inline def `bls12_381-g1-pub`: typingsJapgolly.cids.cidsStrings.`bls12_381-g1-pub` = "bls12_381-g1-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bls12_381-g1-pub`]
    
    inline def `bls12_381-g1g2-pub`: typingsJapgolly.cids.cidsStrings.`bls12_381-g1g2-pub` = "bls12_381-g1g2-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bls12_381-g1g2-pub`]
    
    inline def `bls12_381-g2-pub`: typingsJapgolly.cids.cidsStrings.`bls12_381-g2-pub` = "bls12_381-g2-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`bls12_381-g2-pub`]
    
    inline def bmt: typingsJapgolly.cids.cidsStrings.bmt = "bmt".asInstanceOf[typingsJapgolly.cids.cidsStrings.bmt]
    
    inline def cbor: typingsJapgolly.cids.cidsStrings.cbor = "cbor".asInstanceOf[typingsJapgolly.cids.cidsStrings.cbor]
    
    inline def cidv1: typingsJapgolly.cids.cidsStrings.cidv1 = "cidv1".asInstanceOf[typingsJapgolly.cids.cidsStrings.cidv1]
    
    inline def cidv2: typingsJapgolly.cids.cidsStrings.cidv2 = "cidv2".asInstanceOf[typingsJapgolly.cids.cidsStrings.cidv2]
    
    inline def cidv3: typingsJapgolly.cids.cidsStrings.cidv3 = "cidv3".asInstanceOf[typingsJapgolly.cids.cidsStrings.cidv3]
    
    inline def `dag-cbor`: typingsJapgolly.cids.cidsStrings.`dag-cbor` = "dag-cbor".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dag-cbor`]
    
    inline def `dag-cose`: typingsJapgolly.cids.cidsStrings.`dag-cose` = "dag-cose".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dag-cose`]
    
    inline def `dag-jose`: typingsJapgolly.cids.cidsStrings.`dag-jose` = "dag-jose".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dag-jose`]
    
    inline def `dag-json`: typingsJapgolly.cids.cidsStrings.`dag-json` = "dag-json".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dag-json`]
    
    inline def `dag-pb`: typingsJapgolly.cids.cidsStrings.`dag-pb` = "dag-pb".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dag-pb`]
    
    inline def `dash-block`: typingsJapgolly.cids.cidsStrings.`dash-block` = "dash-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dash-block`]
    
    inline def `dash-tx`: typingsJapgolly.cids.cidsStrings.`dash-tx` = "dash-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dash-tx`]
    
    inline def `dbl-sha2-256`: typingsJapgolly.cids.cidsStrings.`dbl-sha2-256` = "dbl-sha2-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`dbl-sha2-256`]
    
    inline def dccp: typingsJapgolly.cids.cidsStrings.dccp = "dccp".asInstanceOf[typingsJapgolly.cids.cidsStrings.dccp]
    
    inline def `decred-block`: typingsJapgolly.cids.cidsStrings.`decred-block` = "decred-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`decred-block`]
    
    inline def `decred-tx`: typingsJapgolly.cids.cidsStrings.`decred-tx` = "decred-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`decred-tx`]
    
    inline def dns: typingsJapgolly.cids.cidsStrings.dns = "dns".asInstanceOf[typingsJapgolly.cids.cidsStrings.dns]
    
    inline def dns4: typingsJapgolly.cids.cidsStrings.dns4 = "dns4".asInstanceOf[typingsJapgolly.cids.cidsStrings.dns4]
    
    inline def dns6: typingsJapgolly.cids.cidsStrings.dns6 = "dns6".asInstanceOf[typingsJapgolly.cids.cidsStrings.dns6]
    
    inline def dnsaddr: typingsJapgolly.cids.cidsStrings.dnsaddr = "dnsaddr".asInstanceOf[typingsJapgolly.cids.cidsStrings.dnsaddr]
    
    inline def docid: typingsJapgolly.cids.cidsStrings.docid = "docid".asInstanceOf[typingsJapgolly.cids.cidsStrings.docid]
    
    inline def `ed25519-priv`: typingsJapgolly.cids.cidsStrings.`ed25519-priv` = "ed25519-priv".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ed25519-priv`]
    
    inline def `ed25519-pub`: typingsJapgolly.cids.cidsStrings.`ed25519-pub` = "ed25519-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ed25519-pub`]
    
    inline def `ed448-pub`: typingsJapgolly.cids.cidsStrings.`ed448-pub` = "ed448-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ed448-pub`]
    
    inline def `eth-account-snapshot`: typingsJapgolly.cids.cidsStrings.`eth-account-snapshot` = "eth-account-snapshot".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-account-snapshot`]
    
    inline def `eth-block`: typingsJapgolly.cids.cidsStrings.`eth-block` = "eth-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-block`]
    
    inline def `eth-block-list`: typingsJapgolly.cids.cidsStrings.`eth-block-list` = "eth-block-list".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-block-list`]
    
    inline def `eth-state-trie`: typingsJapgolly.cids.cidsStrings.`eth-state-trie` = "eth-state-trie".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-state-trie`]
    
    inline def `eth-storage-trie`: typingsJapgolly.cids.cidsStrings.`eth-storage-trie` = "eth-storage-trie".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-storage-trie`]
    
    inline def `eth-tx`: typingsJapgolly.cids.cidsStrings.`eth-tx` = "eth-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-tx`]
    
    inline def `eth-tx-receipt`: typingsJapgolly.cids.cidsStrings.`eth-tx-receipt` = "eth-tx-receipt".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-tx-receipt`]
    
    inline def `eth-tx-receipt-trie`: typingsJapgolly.cids.cidsStrings.`eth-tx-receipt-trie` = "eth-tx-receipt-trie".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-tx-receipt-trie`]
    
    inline def `eth-tx-trie`: typingsJapgolly.cids.cidsStrings.`eth-tx-trie` = "eth-tx-trie".asInstanceOf[typingsJapgolly.cids.cidsStrings.`eth-tx-trie`]
    
    inline def `fil-commitment-sealed`: typingsJapgolly.cids.cidsStrings.`fil-commitment-sealed` = "fil-commitment-sealed".asInstanceOf[typingsJapgolly.cids.cidsStrings.`fil-commitment-sealed`]
    
    inline def `fil-commitment-unsealed`: typingsJapgolly.cids.cidsStrings.`fil-commitment-unsealed` = "fil-commitment-unsealed".asInstanceOf[typingsJapgolly.cids.cidsStrings.`fil-commitment-unsealed`]
    
    inline def garlic32: typingsJapgolly.cids.cidsStrings.garlic32 = "garlic32".asInstanceOf[typingsJapgolly.cids.cidsStrings.garlic32]
    
    inline def garlic64: typingsJapgolly.cids.cidsStrings.garlic64 = "garlic64".asInstanceOf[typingsJapgolly.cids.cidsStrings.garlic64]
    
    inline def `git-raw`: typingsJapgolly.cids.cidsStrings.`git-raw` = "git-raw".asInstanceOf[typingsJapgolly.cids.cidsStrings.`git-raw`]
    
    inline def `holochain-adr-v0`: typingsJapgolly.cids.cidsStrings.`holochain-adr-v0` = "holochain-adr-v0".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-adr-v0`]
    
    inline def `holochain-adr-v1`: typingsJapgolly.cids.cidsStrings.`holochain-adr-v1` = "holochain-adr-v1".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-adr-v1`]
    
    inline def `holochain-key-v0`: typingsJapgolly.cids.cidsStrings.`holochain-key-v0` = "holochain-key-v0".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-key-v0`]
    
    inline def `holochain-key-v1`: typingsJapgolly.cids.cidsStrings.`holochain-key-v1` = "holochain-key-v1".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-key-v1`]
    
    inline def `holochain-sig-v0`: typingsJapgolly.cids.cidsStrings.`holochain-sig-v0` = "holochain-sig-v0".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-sig-v0`]
    
    inline def `holochain-sig-v1`: typingsJapgolly.cids.cidsStrings.`holochain-sig-v1` = "holochain-sig-v1".asInstanceOf[typingsJapgolly.cids.cidsStrings.`holochain-sig-v1`]
    
    inline def http: typingsJapgolly.cids.cidsStrings.http = "http".asInstanceOf[typingsJapgolly.cids.cidsStrings.http]
    
    inline def https: typingsJapgolly.cids.cidsStrings.https = "https".asInstanceOf[typingsJapgolly.cids.cidsStrings.https]
    
    inline def identity: typingsJapgolly.cids.cidsStrings.identity = "identity".asInstanceOf[typingsJapgolly.cids.cidsStrings.identity]
    
    inline def ip4: typingsJapgolly.cids.cidsStrings.ip4 = "ip4".asInstanceOf[typingsJapgolly.cids.cidsStrings.ip4]
    
    inline def ip6: typingsJapgolly.cids.cidsStrings.ip6 = "ip6".asInstanceOf[typingsJapgolly.cids.cidsStrings.ip6]
    
    inline def ip6zone: typingsJapgolly.cids.cidsStrings.ip6zone = "ip6zone".asInstanceOf[typingsJapgolly.cids.cidsStrings.ip6zone]
    
    inline def ipfs: typingsJapgolly.cids.cidsStrings.ipfs = "ipfs".asInstanceOf[typingsJapgolly.cids.cidsStrings.ipfs]
    
    inline def `ipfs-ns`: typingsJapgolly.cids.cidsStrings.`ipfs-ns` = "ipfs-ns".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ipfs-ns`]
    
    inline def `ipld-ns`: typingsJapgolly.cids.cidsStrings.`ipld-ns` = "ipld-ns".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ipld-ns`]
    
    inline def `ipns-ns`: typingsJapgolly.cids.cidsStrings.`ipns-ns` = "ipns-ns".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ipns-ns`]
    
    inline def json: typingsJapgolly.cids.cidsStrings.json = "json".asInstanceOf[typingsJapgolly.cids.cidsStrings.json]
    
    inline def kangarootwelve: typingsJapgolly.cids.cidsStrings.kangarootwelve = "kangarootwelve".asInstanceOf[typingsJapgolly.cids.cidsStrings.kangarootwelve]
    
    inline def `keccak-224`: typingsJapgolly.cids.cidsStrings.`keccak-224` = "keccak-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`keccak-224`]
    
    inline def `keccak-256`: typingsJapgolly.cids.cidsStrings.`keccak-256` = "keccak-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`keccak-256`]
    
    inline def `keccak-384`: typingsJapgolly.cids.cidsStrings.`keccak-384` = "keccak-384".asInstanceOf[typingsJapgolly.cids.cidsStrings.`keccak-384`]
    
    inline def `keccak-512`: typingsJapgolly.cids.cidsStrings.`keccak-512` = "keccak-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`keccak-512`]
    
    inline def `leofcoin-block`: typingsJapgolly.cids.cidsStrings.`leofcoin-block` = "leofcoin-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`leofcoin-block`]
    
    inline def `leofcoin-pr`: typingsJapgolly.cids.cidsStrings.`leofcoin-pr` = "leofcoin-pr".asInstanceOf[typingsJapgolly.cids.cidsStrings.`leofcoin-pr`]
    
    inline def `leofcoin-tx`: typingsJapgolly.cids.cidsStrings.`leofcoin-tx` = "leofcoin-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`leofcoin-tx`]
    
    inline def `libp2p-key`: typingsJapgolly.cids.cidsStrings.`libp2p-key` = "libp2p-key".asInstanceOf[typingsJapgolly.cids.cidsStrings.`libp2p-key`]
    
    inline def `libp2p-peer-record`: typingsJapgolly.cids.cidsStrings.`libp2p-peer-record` = "libp2p-peer-record".asInstanceOf[typingsJapgolly.cids.cidsStrings.`libp2p-peer-record`]
    
    inline def md4: typingsJapgolly.cids.cidsStrings.md4 = "md4".asInstanceOf[typingsJapgolly.cids.cidsStrings.md4]
    
    inline def md5: typingsJapgolly.cids.cidsStrings.md5 = "md5".asInstanceOf[typingsJapgolly.cids.cidsStrings.md5]
    
    inline def messagepack: typingsJapgolly.cids.cidsStrings.messagepack = "messagepack".asInstanceOf[typingsJapgolly.cids.cidsStrings.messagepack]
    
    inline def multiaddr: typingsJapgolly.cids.cidsStrings.multiaddr = "multiaddr".asInstanceOf[typingsJapgolly.cids.cidsStrings.multiaddr]
    
    inline def multibase: typingsJapgolly.cids.cidsStrings.multibase = "multibase".asInstanceOf[typingsJapgolly.cids.cidsStrings.multibase]
    
    inline def multicodec: typingsJapgolly.cids.cidsStrings.multicodec = "multicodec".asInstanceOf[typingsJapgolly.cids.cidsStrings.multicodec]
    
    inline def multihash: typingsJapgolly.cids.cidsStrings.multihash = "multihash".asInstanceOf[typingsJapgolly.cids.cidsStrings.multihash]
    
    inline def `murmur3-128`: typingsJapgolly.cids.cidsStrings.`murmur3-128` = "murmur3-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`murmur3-128`]
    
    inline def `murmur3-32`: typingsJapgolly.cids.cidsStrings.`murmur3-32` = "murmur3-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`murmur3-32`]
    
    inline def onion: typingsJapgolly.cids.cidsStrings.onion = "onion".asInstanceOf[typingsJapgolly.cids.cidsStrings.onion]
    
    inline def onion3: typingsJapgolly.cids.cidsStrings.onion3 = "onion3".asInstanceOf[typingsJapgolly.cids.cidsStrings.onion3]
    
    inline def `p256-pub`: typingsJapgolly.cids.cidsStrings.`p256-pub` = "p256-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p256-pub`]
    
    inline def p2p: typingsJapgolly.cids.cidsStrings.p2p = "p2p".asInstanceOf[typingsJapgolly.cids.cidsStrings.p2p]
    
    inline def `p2p-circuit`: typingsJapgolly.cids.cidsStrings.`p2p-circuit` = "p2p-circuit".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p2p-circuit`]
    
    inline def `p2p-stardust`: typingsJapgolly.cids.cidsStrings.`p2p-stardust` = "p2p-stardust".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p2p-stardust`]
    
    inline def `p2p-webrtc-direct`: typingsJapgolly.cids.cidsStrings.`p2p-webrtc-direct` = "p2p-webrtc-direct".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p2p-webrtc-direct`]
    
    inline def `p2p-webrtc-star`: typingsJapgolly.cids.cidsStrings.`p2p-webrtc-star` = "p2p-webrtc-star".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p2p-webrtc-star`]
    
    inline def `p2p-websocket-star`: typingsJapgolly.cids.cidsStrings.`p2p-websocket-star` = "p2p-websocket-star".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p2p-websocket-star`]
    
    inline def `p384-pub`: typingsJapgolly.cids.cidsStrings.`p384-pub` = "p384-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p384-pub`]
    
    inline def `p521-pub`: typingsJapgolly.cids.cidsStrings.`p521-pub` = "p521-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`p521-pub`]
    
    inline def path: typingsJapgolly.cids.cidsStrings.path = "path".asInstanceOf[typingsJapgolly.cids.cidsStrings.path]
    
    inline def `poseidon-bls12_381-a2-fc1`: typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1` = "poseidon-bls12_381-a2-fc1".asInstanceOf[typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1`]
    
    inline def `poseidon-bls12_381-a2-fc1-sc`: typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc` = "poseidon-bls12_381-a2-fc1-sc".asInstanceOf[typingsJapgolly.cids.cidsStrings.`poseidon-bls12_381-a2-fc1-sc`]
    
    inline def protobuf: typingsJapgolly.cids.cidsStrings.protobuf = "protobuf".asInstanceOf[typingsJapgolly.cids.cidsStrings.protobuf]
    
    inline def quic: typingsJapgolly.cids.cidsStrings.quic = "quic".asInstanceOf[typingsJapgolly.cids.cidsStrings.quic]
    
    inline def raw: typingsJapgolly.cids.cidsStrings.raw = "raw".asInstanceOf[typingsJapgolly.cids.cidsStrings.raw]
    
    inline def `ripemd-128`: typingsJapgolly.cids.cidsStrings.`ripemd-128` = "ripemd-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ripemd-128`]
    
    inline def `ripemd-160`: typingsJapgolly.cids.cidsStrings.`ripemd-160` = "ripemd-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ripemd-160`]
    
    inline def `ripemd-256`: typingsJapgolly.cids.cidsStrings.`ripemd-256` = "ripemd-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ripemd-256`]
    
    inline def `ripemd-320`: typingsJapgolly.cids.cidsStrings.`ripemd-320` = "ripemd-320".asInstanceOf[typingsJapgolly.cids.cidsStrings.`ripemd-320`]
    
    inline def rlp: typingsJapgolly.cids.cidsStrings.rlp = "rlp".asInstanceOf[typingsJapgolly.cids.cidsStrings.rlp]
    
    inline def sctp: typingsJapgolly.cids.cidsStrings.sctp = "sctp".asInstanceOf[typingsJapgolly.cids.cidsStrings.sctp]
    
    inline def `secp256k1-pub`: typingsJapgolly.cids.cidsStrings.`secp256k1-pub` = "secp256k1-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`secp256k1-pub`]
    
    inline def sha1: typingsJapgolly.cids.cidsStrings.sha1 = "sha1".asInstanceOf[typingsJapgolly.cids.cidsStrings.sha1]
    
    inline def `sha2-256`: typingsJapgolly.cids.cidsStrings.`sha2-256` = "sha2-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha2-256`]
    
    inline def `sha2-256-trunc254-padded`: typingsJapgolly.cids.cidsStrings.`sha2-256-trunc254-padded` = "sha2-256-trunc254-padded".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha2-256-trunc254-padded`]
    
    inline def `sha2-512`: typingsJapgolly.cids.cidsStrings.`sha2-512` = "sha2-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha2-512`]
    
    inline def `sha3-224`: typingsJapgolly.cids.cidsStrings.`sha3-224` = "sha3-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha3-224`]
    
    inline def `sha3-256`: typingsJapgolly.cids.cidsStrings.`sha3-256` = "sha3-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha3-256`]
    
    inline def `sha3-384`: typingsJapgolly.cids.cidsStrings.`sha3-384` = "sha3-384".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha3-384`]
    
    inline def `sha3-512`: typingsJapgolly.cids.cidsStrings.`sha3-512` = "sha3-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sha3-512`]
    
    inline def `shake-128`: typingsJapgolly.cids.cidsStrings.`shake-128` = "shake-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`shake-128`]
    
    inline def `shake-256`: typingsJapgolly.cids.cidsStrings.`shake-256` = "shake-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`shake-256`]
    
    inline def `skein1024-1000`: typingsJapgolly.cids.cidsStrings.`skein1024-1000` = "skein1024-1000".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-1000`]
    
    inline def `skein1024-1008`: typingsJapgolly.cids.cidsStrings.`skein1024-1008` = "skein1024-1008".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-1008`]
    
    inline def `skein1024-1016`: typingsJapgolly.cids.cidsStrings.`skein1024-1016` = "skein1024-1016".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-1016`]
    
    inline def `skein1024-1024`: typingsJapgolly.cids.cidsStrings.`skein1024-1024` = "skein1024-1024".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-1024`]
    
    inline def `skein1024-104`: typingsJapgolly.cids.cidsStrings.`skein1024-104` = "skein1024-104".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-104`]
    
    inline def `skein1024-112`: typingsJapgolly.cids.cidsStrings.`skein1024-112` = "skein1024-112".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-112`]
    
    inline def `skein1024-120`: typingsJapgolly.cids.cidsStrings.`skein1024-120` = "skein1024-120".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-120`]
    
    inline def `skein1024-128`: typingsJapgolly.cids.cidsStrings.`skein1024-128` = "skein1024-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-128`]
    
    inline def `skein1024-136`: typingsJapgolly.cids.cidsStrings.`skein1024-136` = "skein1024-136".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-136`]
    
    inline def `skein1024-144`: typingsJapgolly.cids.cidsStrings.`skein1024-144` = "skein1024-144".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-144`]
    
    inline def `skein1024-152`: typingsJapgolly.cids.cidsStrings.`skein1024-152` = "skein1024-152".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-152`]
    
    inline def `skein1024-16`: typingsJapgolly.cids.cidsStrings.`skein1024-16` = "skein1024-16".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-16`]
    
    inline def `skein1024-160`: typingsJapgolly.cids.cidsStrings.`skein1024-160` = "skein1024-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-160`]
    
    inline def `skein1024-168`: typingsJapgolly.cids.cidsStrings.`skein1024-168` = "skein1024-168".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-168`]
    
    inline def `skein1024-176`: typingsJapgolly.cids.cidsStrings.`skein1024-176` = "skein1024-176".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-176`]
    
    inline def `skein1024-184`: typingsJapgolly.cids.cidsStrings.`skein1024-184` = "skein1024-184".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-184`]
    
    inline def `skein1024-192`: typingsJapgolly.cids.cidsStrings.`skein1024-192` = "skein1024-192".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-192`]
    
    inline def `skein1024-200`: typingsJapgolly.cids.cidsStrings.`skein1024-200` = "skein1024-200".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-200`]
    
    inline def `skein1024-208`: typingsJapgolly.cids.cidsStrings.`skein1024-208` = "skein1024-208".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-208`]
    
    inline def `skein1024-216`: typingsJapgolly.cids.cidsStrings.`skein1024-216` = "skein1024-216".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-216`]
    
    inline def `skein1024-224`: typingsJapgolly.cids.cidsStrings.`skein1024-224` = "skein1024-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-224`]
    
    inline def `skein1024-232`: typingsJapgolly.cids.cidsStrings.`skein1024-232` = "skein1024-232".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-232`]
    
    inline def `skein1024-24`: typingsJapgolly.cids.cidsStrings.`skein1024-24` = "skein1024-24".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-24`]
    
    inline def `skein1024-240`: typingsJapgolly.cids.cidsStrings.`skein1024-240` = "skein1024-240".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-240`]
    
    inline def `skein1024-248`: typingsJapgolly.cids.cidsStrings.`skein1024-248` = "skein1024-248".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-248`]
    
    inline def `skein1024-256`: typingsJapgolly.cids.cidsStrings.`skein1024-256` = "skein1024-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-256`]
    
    inline def `skein1024-264`: typingsJapgolly.cids.cidsStrings.`skein1024-264` = "skein1024-264".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-264`]
    
    inline def `skein1024-272`: typingsJapgolly.cids.cidsStrings.`skein1024-272` = "skein1024-272".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-272`]
    
    inline def `skein1024-280`: typingsJapgolly.cids.cidsStrings.`skein1024-280` = "skein1024-280".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-280`]
    
    inline def `skein1024-288`: typingsJapgolly.cids.cidsStrings.`skein1024-288` = "skein1024-288".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-288`]
    
    inline def `skein1024-296`: typingsJapgolly.cids.cidsStrings.`skein1024-296` = "skein1024-296".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-296`]
    
    inline def `skein1024-304`: typingsJapgolly.cids.cidsStrings.`skein1024-304` = "skein1024-304".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-304`]
    
    inline def `skein1024-312`: typingsJapgolly.cids.cidsStrings.`skein1024-312` = "skein1024-312".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-312`]
    
    inline def `skein1024-32`: typingsJapgolly.cids.cidsStrings.`skein1024-32` = "skein1024-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-32`]
    
    inline def `skein1024-320`: typingsJapgolly.cids.cidsStrings.`skein1024-320` = "skein1024-320".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-320`]
    
    inline def `skein1024-328`: typingsJapgolly.cids.cidsStrings.`skein1024-328` = "skein1024-328".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-328`]
    
    inline def `skein1024-336`: typingsJapgolly.cids.cidsStrings.`skein1024-336` = "skein1024-336".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-336`]
    
    inline def `skein1024-344`: typingsJapgolly.cids.cidsStrings.`skein1024-344` = "skein1024-344".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-344`]
    
    inline def `skein1024-352`: typingsJapgolly.cids.cidsStrings.`skein1024-352` = "skein1024-352".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-352`]
    
    inline def `skein1024-360`: typingsJapgolly.cids.cidsStrings.`skein1024-360` = "skein1024-360".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-360`]
    
    inline def `skein1024-368`: typingsJapgolly.cids.cidsStrings.`skein1024-368` = "skein1024-368".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-368`]
    
    inline def `skein1024-376`: typingsJapgolly.cids.cidsStrings.`skein1024-376` = "skein1024-376".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-376`]
    
    inline def `skein1024-384`: typingsJapgolly.cids.cidsStrings.`skein1024-384` = "skein1024-384".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-384`]
    
    inline def `skein1024-392`: typingsJapgolly.cids.cidsStrings.`skein1024-392` = "skein1024-392".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-392`]
    
    inline def `skein1024-40`: typingsJapgolly.cids.cidsStrings.`skein1024-40` = "skein1024-40".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-40`]
    
    inline def `skein1024-400`: typingsJapgolly.cids.cidsStrings.`skein1024-400` = "skein1024-400".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-400`]
    
    inline def `skein1024-408`: typingsJapgolly.cids.cidsStrings.`skein1024-408` = "skein1024-408".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-408`]
    
    inline def `skein1024-416`: typingsJapgolly.cids.cidsStrings.`skein1024-416` = "skein1024-416".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-416`]
    
    inline def `skein1024-424`: typingsJapgolly.cids.cidsStrings.`skein1024-424` = "skein1024-424".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-424`]
    
    inline def `skein1024-432`: typingsJapgolly.cids.cidsStrings.`skein1024-432` = "skein1024-432".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-432`]
    
    inline def `skein1024-440`: typingsJapgolly.cids.cidsStrings.`skein1024-440` = "skein1024-440".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-440`]
    
    inline def `skein1024-448`: typingsJapgolly.cids.cidsStrings.`skein1024-448` = "skein1024-448".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-448`]
    
    inline def `skein1024-456`: typingsJapgolly.cids.cidsStrings.`skein1024-456` = "skein1024-456".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-456`]
    
    inline def `skein1024-464`: typingsJapgolly.cids.cidsStrings.`skein1024-464` = "skein1024-464".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-464`]
    
    inline def `skein1024-472`: typingsJapgolly.cids.cidsStrings.`skein1024-472` = "skein1024-472".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-472`]
    
    inline def `skein1024-48`: typingsJapgolly.cids.cidsStrings.`skein1024-48` = "skein1024-48".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-48`]
    
    inline def `skein1024-480`: typingsJapgolly.cids.cidsStrings.`skein1024-480` = "skein1024-480".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-480`]
    
    inline def `skein1024-488`: typingsJapgolly.cids.cidsStrings.`skein1024-488` = "skein1024-488".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-488`]
    
    inline def `skein1024-496`: typingsJapgolly.cids.cidsStrings.`skein1024-496` = "skein1024-496".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-496`]
    
    inline def `skein1024-504`: typingsJapgolly.cids.cidsStrings.`skein1024-504` = "skein1024-504".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-504`]
    
    inline def `skein1024-512`: typingsJapgolly.cids.cidsStrings.`skein1024-512` = "skein1024-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-512`]
    
    inline def `skein1024-520`: typingsJapgolly.cids.cidsStrings.`skein1024-520` = "skein1024-520".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-520`]
    
    inline def `skein1024-528`: typingsJapgolly.cids.cidsStrings.`skein1024-528` = "skein1024-528".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-528`]
    
    inline def `skein1024-536`: typingsJapgolly.cids.cidsStrings.`skein1024-536` = "skein1024-536".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-536`]
    
    inline def `skein1024-544`: typingsJapgolly.cids.cidsStrings.`skein1024-544` = "skein1024-544".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-544`]
    
    inline def `skein1024-552`: typingsJapgolly.cids.cidsStrings.`skein1024-552` = "skein1024-552".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-552`]
    
    inline def `skein1024-56`: typingsJapgolly.cids.cidsStrings.`skein1024-56` = "skein1024-56".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-56`]
    
    inline def `skein1024-560`: typingsJapgolly.cids.cidsStrings.`skein1024-560` = "skein1024-560".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-560`]
    
    inline def `skein1024-568`: typingsJapgolly.cids.cidsStrings.`skein1024-568` = "skein1024-568".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-568`]
    
    inline def `skein1024-576`: typingsJapgolly.cids.cidsStrings.`skein1024-576` = "skein1024-576".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-576`]
    
    inline def `skein1024-584`: typingsJapgolly.cids.cidsStrings.`skein1024-584` = "skein1024-584".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-584`]
    
    inline def `skein1024-592`: typingsJapgolly.cids.cidsStrings.`skein1024-592` = "skein1024-592".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-592`]
    
    inline def `skein1024-600`: typingsJapgolly.cids.cidsStrings.`skein1024-600` = "skein1024-600".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-600`]
    
    inline def `skein1024-608`: typingsJapgolly.cids.cidsStrings.`skein1024-608` = "skein1024-608".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-608`]
    
    inline def `skein1024-616`: typingsJapgolly.cids.cidsStrings.`skein1024-616` = "skein1024-616".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-616`]
    
    inline def `skein1024-624`: typingsJapgolly.cids.cidsStrings.`skein1024-624` = "skein1024-624".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-624`]
    
    inline def `skein1024-632`: typingsJapgolly.cids.cidsStrings.`skein1024-632` = "skein1024-632".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-632`]
    
    inline def `skein1024-64`: typingsJapgolly.cids.cidsStrings.`skein1024-64` = "skein1024-64".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-64`]
    
    inline def `skein1024-640`: typingsJapgolly.cids.cidsStrings.`skein1024-640` = "skein1024-640".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-640`]
    
    inline def `skein1024-648`: typingsJapgolly.cids.cidsStrings.`skein1024-648` = "skein1024-648".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-648`]
    
    inline def `skein1024-656`: typingsJapgolly.cids.cidsStrings.`skein1024-656` = "skein1024-656".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-656`]
    
    inline def `skein1024-664`: typingsJapgolly.cids.cidsStrings.`skein1024-664` = "skein1024-664".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-664`]
    
    inline def `skein1024-672`: typingsJapgolly.cids.cidsStrings.`skein1024-672` = "skein1024-672".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-672`]
    
    inline def `skein1024-680`: typingsJapgolly.cids.cidsStrings.`skein1024-680` = "skein1024-680".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-680`]
    
    inline def `skein1024-688`: typingsJapgolly.cids.cidsStrings.`skein1024-688` = "skein1024-688".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-688`]
    
    inline def `skein1024-696`: typingsJapgolly.cids.cidsStrings.`skein1024-696` = "skein1024-696".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-696`]
    
    inline def `skein1024-704`: typingsJapgolly.cids.cidsStrings.`skein1024-704` = "skein1024-704".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-704`]
    
    inline def `skein1024-712`: typingsJapgolly.cids.cidsStrings.`skein1024-712` = "skein1024-712".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-712`]
    
    inline def `skein1024-72`: typingsJapgolly.cids.cidsStrings.`skein1024-72` = "skein1024-72".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-72`]
    
    inline def `skein1024-720`: typingsJapgolly.cids.cidsStrings.`skein1024-720` = "skein1024-720".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-720`]
    
    inline def `skein1024-728`: typingsJapgolly.cids.cidsStrings.`skein1024-728` = "skein1024-728".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-728`]
    
    inline def `skein1024-736`: typingsJapgolly.cids.cidsStrings.`skein1024-736` = "skein1024-736".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-736`]
    
    inline def `skein1024-744`: typingsJapgolly.cids.cidsStrings.`skein1024-744` = "skein1024-744".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-744`]
    
    inline def `skein1024-752`: typingsJapgolly.cids.cidsStrings.`skein1024-752` = "skein1024-752".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-752`]
    
    inline def `skein1024-760`: typingsJapgolly.cids.cidsStrings.`skein1024-760` = "skein1024-760".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-760`]
    
    inline def `skein1024-768`: typingsJapgolly.cids.cidsStrings.`skein1024-768` = "skein1024-768".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-768`]
    
    inline def `skein1024-776`: typingsJapgolly.cids.cidsStrings.`skein1024-776` = "skein1024-776".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-776`]
    
    inline def `skein1024-784`: typingsJapgolly.cids.cidsStrings.`skein1024-784` = "skein1024-784".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-784`]
    
    inline def `skein1024-792`: typingsJapgolly.cids.cidsStrings.`skein1024-792` = "skein1024-792".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-792`]
    
    inline def `skein1024-8`: typingsJapgolly.cids.cidsStrings.`skein1024-8` = "skein1024-8".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-8`]
    
    inline def `skein1024-80`: typingsJapgolly.cids.cidsStrings.`skein1024-80` = "skein1024-80".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-80`]
    
    inline def `skein1024-800`: typingsJapgolly.cids.cidsStrings.`skein1024-800` = "skein1024-800".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-800`]
    
    inline def `skein1024-808`: typingsJapgolly.cids.cidsStrings.`skein1024-808` = "skein1024-808".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-808`]
    
    inline def `skein1024-816`: typingsJapgolly.cids.cidsStrings.`skein1024-816` = "skein1024-816".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-816`]
    
    inline def `skein1024-824`: typingsJapgolly.cids.cidsStrings.`skein1024-824` = "skein1024-824".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-824`]
    
    inline def `skein1024-832`: typingsJapgolly.cids.cidsStrings.`skein1024-832` = "skein1024-832".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-832`]
    
    inline def `skein1024-840`: typingsJapgolly.cids.cidsStrings.`skein1024-840` = "skein1024-840".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-840`]
    
    inline def `skein1024-848`: typingsJapgolly.cids.cidsStrings.`skein1024-848` = "skein1024-848".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-848`]
    
    inline def `skein1024-856`: typingsJapgolly.cids.cidsStrings.`skein1024-856` = "skein1024-856".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-856`]
    
    inline def `skein1024-864`: typingsJapgolly.cids.cidsStrings.`skein1024-864` = "skein1024-864".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-864`]
    
    inline def `skein1024-872`: typingsJapgolly.cids.cidsStrings.`skein1024-872` = "skein1024-872".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-872`]
    
    inline def `skein1024-88`: typingsJapgolly.cids.cidsStrings.`skein1024-88` = "skein1024-88".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-88`]
    
    inline def `skein1024-880`: typingsJapgolly.cids.cidsStrings.`skein1024-880` = "skein1024-880".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-880`]
    
    inline def `skein1024-888`: typingsJapgolly.cids.cidsStrings.`skein1024-888` = "skein1024-888".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-888`]
    
    inline def `skein1024-896`: typingsJapgolly.cids.cidsStrings.`skein1024-896` = "skein1024-896".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-896`]
    
    inline def `skein1024-904`: typingsJapgolly.cids.cidsStrings.`skein1024-904` = "skein1024-904".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-904`]
    
    inline def `skein1024-912`: typingsJapgolly.cids.cidsStrings.`skein1024-912` = "skein1024-912".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-912`]
    
    inline def `skein1024-920`: typingsJapgolly.cids.cidsStrings.`skein1024-920` = "skein1024-920".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-920`]
    
    inline def `skein1024-928`: typingsJapgolly.cids.cidsStrings.`skein1024-928` = "skein1024-928".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-928`]
    
    inline def `skein1024-936`: typingsJapgolly.cids.cidsStrings.`skein1024-936` = "skein1024-936".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-936`]
    
    inline def `skein1024-944`: typingsJapgolly.cids.cidsStrings.`skein1024-944` = "skein1024-944".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-944`]
    
    inline def `skein1024-952`: typingsJapgolly.cids.cidsStrings.`skein1024-952` = "skein1024-952".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-952`]
    
    inline def `skein1024-96`: typingsJapgolly.cids.cidsStrings.`skein1024-96` = "skein1024-96".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-96`]
    
    inline def `skein1024-960`: typingsJapgolly.cids.cidsStrings.`skein1024-960` = "skein1024-960".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-960`]
    
    inline def `skein1024-968`: typingsJapgolly.cids.cidsStrings.`skein1024-968` = "skein1024-968".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-968`]
    
    inline def `skein1024-976`: typingsJapgolly.cids.cidsStrings.`skein1024-976` = "skein1024-976".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-976`]
    
    inline def `skein1024-984`: typingsJapgolly.cids.cidsStrings.`skein1024-984` = "skein1024-984".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-984`]
    
    inline def `skein1024-992`: typingsJapgolly.cids.cidsStrings.`skein1024-992` = "skein1024-992".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein1024-992`]
    
    inline def `skein256-104`: typingsJapgolly.cids.cidsStrings.`skein256-104` = "skein256-104".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-104`]
    
    inline def `skein256-112`: typingsJapgolly.cids.cidsStrings.`skein256-112` = "skein256-112".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-112`]
    
    inline def `skein256-120`: typingsJapgolly.cids.cidsStrings.`skein256-120` = "skein256-120".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-120`]
    
    inline def `skein256-128`: typingsJapgolly.cids.cidsStrings.`skein256-128` = "skein256-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-128`]
    
    inline def `skein256-136`: typingsJapgolly.cids.cidsStrings.`skein256-136` = "skein256-136".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-136`]
    
    inline def `skein256-144`: typingsJapgolly.cids.cidsStrings.`skein256-144` = "skein256-144".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-144`]
    
    inline def `skein256-152`: typingsJapgolly.cids.cidsStrings.`skein256-152` = "skein256-152".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-152`]
    
    inline def `skein256-16`: typingsJapgolly.cids.cidsStrings.`skein256-16` = "skein256-16".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-16`]
    
    inline def `skein256-160`: typingsJapgolly.cids.cidsStrings.`skein256-160` = "skein256-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-160`]
    
    inline def `skein256-168`: typingsJapgolly.cids.cidsStrings.`skein256-168` = "skein256-168".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-168`]
    
    inline def `skein256-176`: typingsJapgolly.cids.cidsStrings.`skein256-176` = "skein256-176".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-176`]
    
    inline def `skein256-184`: typingsJapgolly.cids.cidsStrings.`skein256-184` = "skein256-184".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-184`]
    
    inline def `skein256-192`: typingsJapgolly.cids.cidsStrings.`skein256-192` = "skein256-192".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-192`]
    
    inline def `skein256-200`: typingsJapgolly.cids.cidsStrings.`skein256-200` = "skein256-200".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-200`]
    
    inline def `skein256-208`: typingsJapgolly.cids.cidsStrings.`skein256-208` = "skein256-208".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-208`]
    
    inline def `skein256-216`: typingsJapgolly.cids.cidsStrings.`skein256-216` = "skein256-216".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-216`]
    
    inline def `skein256-224`: typingsJapgolly.cids.cidsStrings.`skein256-224` = "skein256-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-224`]
    
    inline def `skein256-232`: typingsJapgolly.cids.cidsStrings.`skein256-232` = "skein256-232".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-232`]
    
    inline def `skein256-24`: typingsJapgolly.cids.cidsStrings.`skein256-24` = "skein256-24".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-24`]
    
    inline def `skein256-240`: typingsJapgolly.cids.cidsStrings.`skein256-240` = "skein256-240".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-240`]
    
    inline def `skein256-248`: typingsJapgolly.cids.cidsStrings.`skein256-248` = "skein256-248".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-248`]
    
    inline def `skein256-256`: typingsJapgolly.cids.cidsStrings.`skein256-256` = "skein256-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-256`]
    
    inline def `skein256-32`: typingsJapgolly.cids.cidsStrings.`skein256-32` = "skein256-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-32`]
    
    inline def `skein256-40`: typingsJapgolly.cids.cidsStrings.`skein256-40` = "skein256-40".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-40`]
    
    inline def `skein256-48`: typingsJapgolly.cids.cidsStrings.`skein256-48` = "skein256-48".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-48`]
    
    inline def `skein256-56`: typingsJapgolly.cids.cidsStrings.`skein256-56` = "skein256-56".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-56`]
    
    inline def `skein256-64`: typingsJapgolly.cids.cidsStrings.`skein256-64` = "skein256-64".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-64`]
    
    inline def `skein256-72`: typingsJapgolly.cids.cidsStrings.`skein256-72` = "skein256-72".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-72`]
    
    inline def `skein256-8`: typingsJapgolly.cids.cidsStrings.`skein256-8` = "skein256-8".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-8`]
    
    inline def `skein256-80`: typingsJapgolly.cids.cidsStrings.`skein256-80` = "skein256-80".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-80`]
    
    inline def `skein256-88`: typingsJapgolly.cids.cidsStrings.`skein256-88` = "skein256-88".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-88`]
    
    inline def `skein256-96`: typingsJapgolly.cids.cidsStrings.`skein256-96` = "skein256-96".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein256-96`]
    
    inline def `skein512-104`: typingsJapgolly.cids.cidsStrings.`skein512-104` = "skein512-104".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-104`]
    
    inline def `skein512-112`: typingsJapgolly.cids.cidsStrings.`skein512-112` = "skein512-112".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-112`]
    
    inline def `skein512-120`: typingsJapgolly.cids.cidsStrings.`skein512-120` = "skein512-120".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-120`]
    
    inline def `skein512-128`: typingsJapgolly.cids.cidsStrings.`skein512-128` = "skein512-128".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-128`]
    
    inline def `skein512-136`: typingsJapgolly.cids.cidsStrings.`skein512-136` = "skein512-136".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-136`]
    
    inline def `skein512-144`: typingsJapgolly.cids.cidsStrings.`skein512-144` = "skein512-144".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-144`]
    
    inline def `skein512-152`: typingsJapgolly.cids.cidsStrings.`skein512-152` = "skein512-152".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-152`]
    
    inline def `skein512-16`: typingsJapgolly.cids.cidsStrings.`skein512-16` = "skein512-16".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-16`]
    
    inline def `skein512-160`: typingsJapgolly.cids.cidsStrings.`skein512-160` = "skein512-160".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-160`]
    
    inline def `skein512-168`: typingsJapgolly.cids.cidsStrings.`skein512-168` = "skein512-168".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-168`]
    
    inline def `skein512-176`: typingsJapgolly.cids.cidsStrings.`skein512-176` = "skein512-176".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-176`]
    
    inline def `skein512-184`: typingsJapgolly.cids.cidsStrings.`skein512-184` = "skein512-184".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-184`]
    
    inline def `skein512-192`: typingsJapgolly.cids.cidsStrings.`skein512-192` = "skein512-192".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-192`]
    
    inline def `skein512-200`: typingsJapgolly.cids.cidsStrings.`skein512-200` = "skein512-200".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-200`]
    
    inline def `skein512-208`: typingsJapgolly.cids.cidsStrings.`skein512-208` = "skein512-208".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-208`]
    
    inline def `skein512-216`: typingsJapgolly.cids.cidsStrings.`skein512-216` = "skein512-216".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-216`]
    
    inline def `skein512-224`: typingsJapgolly.cids.cidsStrings.`skein512-224` = "skein512-224".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-224`]
    
    inline def `skein512-232`: typingsJapgolly.cids.cidsStrings.`skein512-232` = "skein512-232".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-232`]
    
    inline def `skein512-24`: typingsJapgolly.cids.cidsStrings.`skein512-24` = "skein512-24".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-24`]
    
    inline def `skein512-240`: typingsJapgolly.cids.cidsStrings.`skein512-240` = "skein512-240".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-240`]
    
    inline def `skein512-248`: typingsJapgolly.cids.cidsStrings.`skein512-248` = "skein512-248".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-248`]
    
    inline def `skein512-256`: typingsJapgolly.cids.cidsStrings.`skein512-256` = "skein512-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-256`]
    
    inline def `skein512-264`: typingsJapgolly.cids.cidsStrings.`skein512-264` = "skein512-264".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-264`]
    
    inline def `skein512-272`: typingsJapgolly.cids.cidsStrings.`skein512-272` = "skein512-272".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-272`]
    
    inline def `skein512-280`: typingsJapgolly.cids.cidsStrings.`skein512-280` = "skein512-280".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-280`]
    
    inline def `skein512-288`: typingsJapgolly.cids.cidsStrings.`skein512-288` = "skein512-288".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-288`]
    
    inline def `skein512-296`: typingsJapgolly.cids.cidsStrings.`skein512-296` = "skein512-296".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-296`]
    
    inline def `skein512-304`: typingsJapgolly.cids.cidsStrings.`skein512-304` = "skein512-304".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-304`]
    
    inline def `skein512-312`: typingsJapgolly.cids.cidsStrings.`skein512-312` = "skein512-312".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-312`]
    
    inline def `skein512-32`: typingsJapgolly.cids.cidsStrings.`skein512-32` = "skein512-32".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-32`]
    
    inline def `skein512-320`: typingsJapgolly.cids.cidsStrings.`skein512-320` = "skein512-320".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-320`]
    
    inline def `skein512-328`: typingsJapgolly.cids.cidsStrings.`skein512-328` = "skein512-328".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-328`]
    
    inline def `skein512-336`: typingsJapgolly.cids.cidsStrings.`skein512-336` = "skein512-336".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-336`]
    
    inline def `skein512-344`: typingsJapgolly.cids.cidsStrings.`skein512-344` = "skein512-344".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-344`]
    
    inline def `skein512-352`: typingsJapgolly.cids.cidsStrings.`skein512-352` = "skein512-352".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-352`]
    
    inline def `skein512-360`: typingsJapgolly.cids.cidsStrings.`skein512-360` = "skein512-360".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-360`]
    
    inline def `skein512-368`: typingsJapgolly.cids.cidsStrings.`skein512-368` = "skein512-368".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-368`]
    
    inline def `skein512-376`: typingsJapgolly.cids.cidsStrings.`skein512-376` = "skein512-376".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-376`]
    
    inline def `skein512-384`: typingsJapgolly.cids.cidsStrings.`skein512-384` = "skein512-384".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-384`]
    
    inline def `skein512-392`: typingsJapgolly.cids.cidsStrings.`skein512-392` = "skein512-392".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-392`]
    
    inline def `skein512-40`: typingsJapgolly.cids.cidsStrings.`skein512-40` = "skein512-40".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-40`]
    
    inline def `skein512-400`: typingsJapgolly.cids.cidsStrings.`skein512-400` = "skein512-400".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-400`]
    
    inline def `skein512-408`: typingsJapgolly.cids.cidsStrings.`skein512-408` = "skein512-408".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-408`]
    
    inline def `skein512-416`: typingsJapgolly.cids.cidsStrings.`skein512-416` = "skein512-416".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-416`]
    
    inline def `skein512-424`: typingsJapgolly.cids.cidsStrings.`skein512-424` = "skein512-424".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-424`]
    
    inline def `skein512-432`: typingsJapgolly.cids.cidsStrings.`skein512-432` = "skein512-432".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-432`]
    
    inline def `skein512-440`: typingsJapgolly.cids.cidsStrings.`skein512-440` = "skein512-440".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-440`]
    
    inline def `skein512-448`: typingsJapgolly.cids.cidsStrings.`skein512-448` = "skein512-448".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-448`]
    
    inline def `skein512-456`: typingsJapgolly.cids.cidsStrings.`skein512-456` = "skein512-456".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-456`]
    
    inline def `skein512-464`: typingsJapgolly.cids.cidsStrings.`skein512-464` = "skein512-464".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-464`]
    
    inline def `skein512-472`: typingsJapgolly.cids.cidsStrings.`skein512-472` = "skein512-472".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-472`]
    
    inline def `skein512-48`: typingsJapgolly.cids.cidsStrings.`skein512-48` = "skein512-48".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-48`]
    
    inline def `skein512-480`: typingsJapgolly.cids.cidsStrings.`skein512-480` = "skein512-480".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-480`]
    
    inline def `skein512-488`: typingsJapgolly.cids.cidsStrings.`skein512-488` = "skein512-488".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-488`]
    
    inline def `skein512-496`: typingsJapgolly.cids.cidsStrings.`skein512-496` = "skein512-496".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-496`]
    
    inline def `skein512-504`: typingsJapgolly.cids.cidsStrings.`skein512-504` = "skein512-504".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-504`]
    
    inline def `skein512-512`: typingsJapgolly.cids.cidsStrings.`skein512-512` = "skein512-512".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-512`]
    
    inline def `skein512-56`: typingsJapgolly.cids.cidsStrings.`skein512-56` = "skein512-56".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-56`]
    
    inline def `skein512-64`: typingsJapgolly.cids.cidsStrings.`skein512-64` = "skein512-64".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-64`]
    
    inline def `skein512-72`: typingsJapgolly.cids.cidsStrings.`skein512-72` = "skein512-72".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-72`]
    
    inline def `skein512-8`: typingsJapgolly.cids.cidsStrings.`skein512-8` = "skein512-8".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-8`]
    
    inline def `skein512-80`: typingsJapgolly.cids.cidsStrings.`skein512-80` = "skein512-80".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-80`]
    
    inline def `skein512-88`: typingsJapgolly.cids.cidsStrings.`skein512-88` = "skein512-88".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-88`]
    
    inline def `skein512-96`: typingsJapgolly.cids.cidsStrings.`skein512-96` = "skein512-96".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skein512-96`]
    
    inline def `skynet-ns`: typingsJapgolly.cids.cidsStrings.`skynet-ns` = "skynet-ns".asInstanceOf[typingsJapgolly.cids.cidsStrings.`skynet-ns`]
    
    inline def `sm3-256`: typingsJapgolly.cids.cidsStrings.`sm3-256` = "sm3-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`sm3-256`]
    
    inline def `stellar-block`: typingsJapgolly.cids.cidsStrings.`stellar-block` = "stellar-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`stellar-block`]
    
    inline def `stellar-tx`: typingsJapgolly.cids.cidsStrings.`stellar-tx` = "stellar-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`stellar-tx`]
    
    inline def `swarm-feed`: typingsJapgolly.cids.cidsStrings.`swarm-feed` = "swarm-feed".asInstanceOf[typingsJapgolly.cids.cidsStrings.`swarm-feed`]
    
    inline def `swarm-manifest`: typingsJapgolly.cids.cidsStrings.`swarm-manifest` = "swarm-manifest".asInstanceOf[typingsJapgolly.cids.cidsStrings.`swarm-manifest`]
    
    inline def `swarm-ns`: typingsJapgolly.cids.cidsStrings.`swarm-ns` = "swarm-ns".asInstanceOf[typingsJapgolly.cids.cidsStrings.`swarm-ns`]
    
    inline def tcp: typingsJapgolly.cids.cidsStrings.tcp = "tcp".asInstanceOf[typingsJapgolly.cids.cidsStrings.tcp]
    
    inline def thread: typingsJapgolly.cids.cidsStrings.thread = "thread".asInstanceOf[typingsJapgolly.cids.cidsStrings.thread]
    
    inline def tls: typingsJapgolly.cids.cidsStrings.tls = "tls".asInstanceOf[typingsJapgolly.cids.cidsStrings.tls]
    
    inline def `torrent-file`: typingsJapgolly.cids.cidsStrings.`torrent-file` = "torrent-file".asInstanceOf[typingsJapgolly.cids.cidsStrings.`torrent-file`]
    
    inline def `torrent-info`: typingsJapgolly.cids.cidsStrings.`torrent-info` = "torrent-info".asInstanceOf[typingsJapgolly.cids.cidsStrings.`torrent-info`]
    
    inline def udp: typingsJapgolly.cids.cidsStrings.udp = "udp".asInstanceOf[typingsJapgolly.cids.cidsStrings.udp]
    
    inline def udt: typingsJapgolly.cids.cidsStrings.udt = "udt".asInstanceOf[typingsJapgolly.cids.cidsStrings.udt]
    
    inline def unix: typingsJapgolly.cids.cidsStrings.unix = "unix".asInstanceOf[typingsJapgolly.cids.cidsStrings.unix]
    
    inline def utp: typingsJapgolly.cids.cidsStrings.utp = "utp".asInstanceOf[typingsJapgolly.cids.cidsStrings.utp]
    
    inline def ws: typingsJapgolly.cids.cidsStrings.ws = "ws".asInstanceOf[typingsJapgolly.cids.cidsStrings.ws]
    
    inline def wss: typingsJapgolly.cids.cidsStrings.wss = "wss".asInstanceOf[typingsJapgolly.cids.cidsStrings.wss]
    
    inline def x11: typingsJapgolly.cids.cidsStrings.x11 = "x11".asInstanceOf[typingsJapgolly.cids.cidsStrings.x11]
    
    inline def `x25519-pub`: typingsJapgolly.cids.cidsStrings.`x25519-pub` = "x25519-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`x25519-pub`]
    
    inline def `x448-pub`: typingsJapgolly.cids.cidsStrings.`x448-pub` = "x448-pub".asInstanceOf[typingsJapgolly.cids.cidsStrings.`x448-pub`]
    
    inline def `zcash-block`: typingsJapgolly.cids.cidsStrings.`zcash-block` = "zcash-block".asInstanceOf[typingsJapgolly.cids.cidsStrings.`zcash-block`]
    
    inline def `zcash-tx`: typingsJapgolly.cids.cidsStrings.`zcash-tx` = "zcash-tx".asInstanceOf[typingsJapgolly.cids.cidsStrings.`zcash-tx`]
    
    inline def zeronet: typingsJapgolly.cids.cidsStrings.zeronet = "zeronet".asInstanceOf[typingsJapgolly.cids.cidsStrings.zeronet]
    
    inline def `zeroxcert-imprint-256`: typingsJapgolly.cids.cidsStrings.`zeroxcert-imprint-256` = "zeroxcert-imprint-256".asInstanceOf[typingsJapgolly.cids.cidsStrings.`zeroxcert-imprint-256`]
  }
  
  trait SerializedCID extends StObject {
    
    var codec: String
    
    var hash: js.typedarray.Uint8Array
    
    var version: Double
  }
  object SerializedCID {
    
    inline def apply(codec: String, hash: js.typedarray.Uint8Array, version: Double): SerializedCID = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedCID]
    }
    
    extension [Self <: SerializedCID](x: Self) {
      
      inline def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
