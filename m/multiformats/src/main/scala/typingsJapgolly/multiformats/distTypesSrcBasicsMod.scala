package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.anon.Code
import typingsJapgolly.multiformats.anon.Codec
import typingsJapgolly.multiformats.anon.Encode
import typingsJapgolly.multiformats.distTypesSrcBasesInterfaceMod.MultibaseDecoder
import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.ByteView
import typingsJapgolly.multiformats.distTypesSrcHashesHasherMod.Await
import typingsJapgolly.multiformats.distTypesSrcHashesInterfaceMod.MultihashDigest
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Link
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.ToString
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.mod.hasher.Hasher
import typingsJapgolly.multiformats.multiformatsInts.`0`
import typingsJapgolly.multiformats.multiformatsInts.`112`
import typingsJapgolly.multiformats.multiformatsInts.`18`
import typingsJapgolly.multiformats.multiformatsInts.`19`
import typingsJapgolly.multiformats.multiformatsInts.`1`
import typingsJapgolly.multiformats.multiformatsStrings.B
import typingsJapgolly.multiformats.multiformatsStrings.C
import typingsJapgolly.multiformats.multiformatsStrings.F
import typingsJapgolly.multiformats.multiformatsStrings.Highsurrogatesd83dLowsurrogatesde80
import typingsJapgolly.multiformats.multiformatsStrings.K
import typingsJapgolly.multiformats.multiformatsStrings.M
import typingsJapgolly.multiformats.multiformatsStrings.T
import typingsJapgolly.multiformats.multiformatsStrings.U
import typingsJapgolly.multiformats.multiformatsStrings.V
import typingsJapgolly.multiformats.multiformatsStrings.Z
import typingsJapgolly.multiformats.multiformatsStrings.`7`
import typingsJapgolly.multiformats.multiformatsStrings.`9`
import typingsJapgolly.multiformats.multiformatsStrings.`sha2-256`
import typingsJapgolly.multiformats.multiformatsStrings.`sha2-512`
import typingsJapgolly.multiformats.multiformatsStrings.b_
import typingsJapgolly.multiformats.multiformatsStrings.base10
import typingsJapgolly.multiformats.multiformatsStrings.base16
import typingsJapgolly.multiformats.multiformatsStrings.base16upper
import typingsJapgolly.multiformats.multiformatsStrings.base2
import typingsJapgolly.multiformats.multiformatsStrings.base256emoji
import typingsJapgolly.multiformats.multiformatsStrings.base32
import typingsJapgolly.multiformats.multiformatsStrings.base32hex
import typingsJapgolly.multiformats.multiformatsStrings.base32hexpad
import typingsJapgolly.multiformats.multiformatsStrings.base32hexpadupper
import typingsJapgolly.multiformats.multiformatsStrings.base32hexupper
import typingsJapgolly.multiformats.multiformatsStrings.base32pad
import typingsJapgolly.multiformats.multiformatsStrings.base32padupper
import typingsJapgolly.multiformats.multiformatsStrings.base32upper
import typingsJapgolly.multiformats.multiformatsStrings.base32z
import typingsJapgolly.multiformats.multiformatsStrings.base36
import typingsJapgolly.multiformats.multiformatsStrings.base36upper
import typingsJapgolly.multiformats.multiformatsStrings.base58btc
import typingsJapgolly.multiformats.multiformatsStrings.base58flickr
import typingsJapgolly.multiformats.multiformatsStrings.base64
import typingsJapgolly.multiformats.multiformatsStrings.base64pad
import typingsJapgolly.multiformats.multiformatsStrings.base64url
import typingsJapgolly.multiformats.multiformatsStrings.base64urlpad
import typingsJapgolly.multiformats.multiformatsStrings.base8
import typingsJapgolly.multiformats.multiformatsStrings.c_
import typingsJapgolly.multiformats.multiformatsStrings.f_
import typingsJapgolly.multiformats.multiformatsStrings.h
import typingsJapgolly.multiformats.multiformatsStrings.identity
import typingsJapgolly.multiformats.multiformatsStrings.k_
import typingsJapgolly.multiformats.multiformatsStrings.m_
import typingsJapgolly.multiformats.multiformatsStrings.t_
import typingsJapgolly.multiformats.multiformatsStrings.u_
import typingsJapgolly.multiformats.multiformatsStrings.v_
import typingsJapgolly.multiformats.multiformatsStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcBasicsMod {
  
  @JSImport("multiformats/dist/types/src/basics", "CID")
  @js.native
  open class CID[Data /* <: Any */, Format /* <: Double */, Alg /* <: Double */, Version /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */] protected ()
    extends typingsJapgolly.multiformats.mod.CID[Data, Format, Alg, Version] {
    /**
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} multihash - (Multi)hash of the of the content.
      * @param {Uint8Array} bytes
      *
      */
    def this(version: Version, code: Format, multihash: MultihashDigest[Alg], bytes: js.typedarray.Uint8Array) = this()
  }
  /* static members */
  object CID {
    
    @JSImport("multiformats/dist/types/src/basics", "CID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes any input `value` and returns a `CID` instance if it was
      * a `CID` otherwise returns `null`. If `value` is instanceof `CID`
      * it will return value back. If `value` is not instance of this CID
      * class, but is compatible CID it will return new instance of this
      * `CID` class. Otherwise returs null.
      *
      * This allows two different incompatible versions of CID library to
      * co-exist and interop as long as binary interface is compatible.
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @template {unknown} U
      * @param {API.Link<Data, Format, Alg, Version>|U} input
      * @returns {CID<Data, Format, Alg, Version>|null}
      */
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: U): (typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    inline def asCID[Data_2 /* <: Any */, Format_2 /* <: Double */, Alg_2 /* <: Double */, Version_2 /* <: Version */, U /* <: Any */](input: Link[Data_2, Format_2, Alg_2, Version_2]): (typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("asCID")(input.asInstanceOf[js.Any]).asInstanceOf[(typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_2, Format_2, Alg_2, Version_2]) | Null]
    
    /**
      *
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {Version} version - Version of the CID
      * @param {Format} code - Code of the codec content is encoded in, see https://github.com/multiformats/multicodec/blob/master/table.csv
      * @param {API.MultihashDigest<Alg>} digest - (Multi)hash of the of the content.
      * @returns {CID<Data, Format, Alg, Version>}
      */
    inline def create[Data_3 /* <: Any */, Format_3 /* <: Double */, Alg_3 /* <: Double */, Version_3 /* <: Version */](version: Version_3, code: Format_3, digest: MultihashDigest[Alg_3]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_3, Format_3, Alg_3, Version_3] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(version.asInstanceOf[js.Any], code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_3, Format_3, Alg_3, Version_3]]
    
    /**
      * Simplified version of `create` for CIDv0.
      *
      * @template {unknown} [T=unknown]
      * @param {API.MultihashDigest<typeof SHA_256_CODE>} digest - Multihash.
      * @returns {CID<T, typeof DAG_PB_CODE, typeof SHA_256_CODE, 0>}
      */
    inline def createV0_18[T /* <: Any */](digest: MultihashDigest[`18`]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[T, `112`, `18`, `0`] = ^.asInstanceOf[js.Dynamic].applyDynamic("createV0")(digest.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[T, `112`, `18`, `0`]]
    
    /**
      * Simplified version of `create` for CIDv1.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @param {Code} code - Content encoding format code.
      * @param {API.MultihashDigest<Alg>} digest - Miltihash of the content.
      * @returns {CID<Data, Code, Alg, 1>}
      */
    inline def createV1[Data_4 /* <: Any */, Code /* <: Double */, Alg_4 /* <: Double */](code: Code, digest: MultihashDigest[Alg_4]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_4, Code, Alg_4, `1`] = (^.asInstanceOf[js.Dynamic].applyDynamic("createV1")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_4, Code, Alg_4, `1`]]
    
    /**
      * Decoded a CID from its binary representation. The byte array must contain
      * only the CID with no additional bytes.
      *
      * An error will be thrown if the bytes provided do not contain a valid
      * binary representation of a CID.
      *
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ByteView<API.Link<Data, Code, Alg, Ver>>} bytes
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def decode[Data_5 /* <: Any */, Code_1 /* <: Double */, Alg_5 /* <: Double */, Ver /* <: Version */](bytes: ByteView[Link[Data_5, Code_1, Alg_5, Ver]]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_5, Code_1, Alg_5, Ver] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_5, Code_1, Alg_5, Ver]]
    
    /**
      * Decoded a CID from its binary representation at the beginning of a byte
      * array.
      *
      * Returns an array with the first element containing the CID and the second
      * element containing the remainder of the original byte array. The remainder
      * will be a zero-length byte array if the provided bytes only contained a
      * binary CID representation.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} bytes
      * @returns {[CID<T, C, A, V>, Uint8Array]}
      */
    inline def decodeFirst[T_1 /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */](bytes: ByteView[Link[T_1, C, A, V]]): js.Tuple2[
        typingsJapgolly.multiformats.distTypesSrcCidMod.CID[T_1, C, A, V], 
        js.typedarray.Uint8Array
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFirst")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
        typingsJapgolly.multiformats.distTypesSrcCidMod.CID[T_1, C, A, V], 
        js.typedarray.Uint8Array
      ]]
    
    /**
      * @template {unknown} Data
      * @template {number} Format
      * @template {number} Alg
      * @template {API.Version} Version
      * @param {API.Link<Data, Format, Alg, Version>} self
      * @param {unknown} other
      * @returns {other is CID}
      */
    inline def equals[Data_1 /* <: Any */, Format_1 /* <: Double */, Alg_1 /* <: Double */, Version_1 /* <: Version */](self: Link[Data_1, Format_1, Alg_1, Version_1], other: Any): /* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(self.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[/* is multiformats.multiformats/dist/types/src/cid.CID<any, number, number, multiformats.multiformats/dist/types/src/link/interface.Version> */ Boolean]
    
    /**
      * Inspect the initial bytes of a CID to determine its properties.
      *
      * Involves decoding up to 4 varints. Typically this will require only 4 to 6
      * bytes but for larger multicodec code values and larger multihash digest
      * lengths these varints can be quite large. It is recommended that at least
      * 10 bytes be made available in the `initialBytes` argument for a complete
      * inspection.
      *
      * @template {unknown} T
      * @template {number} C
      * @template {number} A
      * @template {API.Version} V
      * @param {API.ByteView<API.Link<T, C, A, V>>} initialBytes
      * @returns {{ version:V, codec:C, multihashCode:A, digestSize:number, multihashSize:number, size:number }}
      */
    inline def inspectBytes[T_2 /* <: Any */, C_1 /* <: Double */, A_1 /* <: Double */, V_1 /* <: Version */](initialBytes: ByteView[Link[T_2, C_1, A_1, V_1]]): Codec[V_1, C_1, A_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectBytes")(initialBytes.asInstanceOf[js.Any]).asInstanceOf[Codec[V_1, C_1, A_1]]
    
    /**
      * Takes cid in a string representation and creates an instance. If `base`
      * decoder is not provided will use a default from the configuration. It will
      * throw an error if encoding of the CID is not compatible with supplied (or
      * a default decoder).
      *
      * @template {string} Prefix
      * @template {unknown} Data
      * @template {number} Code
      * @template {number} Alg
      * @template {API.Version} Ver
      * @param {API.ToString<API.Link<Data, Code, Alg, Ver>, Prefix>} source
      * @param {API.MultibaseDecoder<Prefix>} [base]
      * @returns {CID<Data, Code, Alg, Ver>}
      */
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1]]
    inline def parse[Prefix /* <: String */, Data_6 /* <: Any */, Code_2 /* <: Double */, Alg_6 /* <: Double */, Ver_1 /* <: Version */](source: ToString[Link[Data_6, Code_2, Alg_6, Ver_1], Prefix], base: MultibaseDecoder[Prefix]): typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcCidMod.CID[Data_6, Code_2, Alg_6, Ver_1]]
  }
  
  object bases {
    
    @JSImport("multiformats/dist/types/src/basics", "bases")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base10")
    @js.native
    def base10: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base10, `9`] = js.native
    inline def base10_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base10, `9`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base10")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base16")
    @js.native
    def base16: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base16, f_] = js.native
    inline def base16_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base16, f_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base16")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base16upper")
    @js.native
    def base16upper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base16upper, F] = js.native
    inline def base16upper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base16upper, F]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base16upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base2")
    @js.native
    def base2: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[
        typingsJapgolly.multiformats.multiformatsStrings.base2, 
        typingsJapgolly.multiformats.multiformatsStrings.`0`
      ] = js.native
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base256emoji")
    @js.native
    def base256emoji: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[
        typingsJapgolly.multiformats.multiformatsStrings.base256emoji, 
        Highsurrogatesd83dLowsurrogatesde80
      ] = js.native
    inline def base256emoji_=(
      x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base256emoji, Highsurrogatesd83dLowsurrogatesde80]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base256emoji")(x.asInstanceOf[js.Any])
    
    inline def base2_=(
      x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base2, typingsJapgolly.multiformats.multiformatsStrings.`0`]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base2")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32")
    @js.native
    def base32: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32, b_] = js.native
    inline def base32_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32, b_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32hex")
    @js.native
    def base32hex: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32hex, v_] = js.native
    inline def base32hex_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32hex, v_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hex")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32hexpad")
    @js.native
    def base32hexpad: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32hexpad, t_] = js.native
    inline def base32hexpad_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32hexpad, t_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexpad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32hexpadupper")
    @js.native
    def base32hexpadupper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32hexpadupper, T] = js.native
    inline def base32hexpadupper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32hexpadupper, T]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexpadupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32hexupper")
    @js.native
    def base32hexupper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32hexupper, V] = js.native
    inline def base32hexupper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32hexupper, V]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32hexupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32pad")
    @js.native
    def base32pad: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32pad, c_] = js.native
    inline def base32pad_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32pad, c_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32pad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32padupper")
    @js.native
    def base32padupper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32padupper, C] = js.native
    inline def base32padupper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32padupper, C]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32padupper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32upper")
    @js.native
    def base32upper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32upper, B] = js.native
    inline def base32upper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32upper, B]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base32z")
    @js.native
    def base32z: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base32z, h] = js.native
    inline def base32z_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base32z, h]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base32z")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base36")
    @js.native
    def base36: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base36, k_] = js.native
    inline def base36_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base36, k_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base36")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base36upper")
    @js.native
    def base36upper: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base36upper, K] = js.native
    inline def base36upper_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base36upper, K]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base36upper")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base58btc")
    @js.native
    def base58btc: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base58btc, z_] = js.native
    inline def base58btc_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base58btc, z_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base58btc")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base58flickr")
    @js.native
    def base58flickr: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base58flickr, Z] = js.native
    inline def base58flickr_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base58flickr, Z]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base58flickr")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base64")
    @js.native
    def base64: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base64, m_] = js.native
    inline def base64_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base64, m_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base64pad")
    @js.native
    def base64pad: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base64pad, M] = js.native
    inline def base64pad_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base64pad, M]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64pad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base64url")
    @js.native
    def base64url: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base64url, u_] = js.native
    inline def base64url_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base64url, u_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64url")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base64urlpad")
    @js.native
    def base64urlpad: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base64urlpad, U] = js.native
    inline def base64urlpad_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base64urlpad, U]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base64urlpad")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.base8")
    @js.native
    def base8: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[typingsJapgolly.multiformats.multiformatsStrings.base8, `7`] = js.native
    inline def base8_=(x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[base8, `7`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base8")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "bases.identity")
    @js.native
    def identity: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[
        typingsJapgolly.multiformats.multiformatsStrings.identity, 
        typingsJapgolly.multiformats.multiformatsStrings.Null
      ] = js.native
    inline def identity_=(
      x: typingsJapgolly.multiformats.distTypesSrcBasesBaseMod.Codec[identity, typingsJapgolly.multiformats.multiformatsStrings.Null]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
  }
  
  object bytes {
    
    @JSImport("multiformats/dist/types/src/basics", "bytes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def coerce(o: js.typedarray.ArrayBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.ArrayBufferView): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def coerce(o: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(o.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    @JSImport("multiformats/dist/types/src/basics", "bytes.empty")
    @js.native
    val empty: js.typedarray.Uint8Array = js.native
    
    inline def equals_(aa: js.typedarray.Uint8Array, bb: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(aa.asInstanceOf[js.Any], bb.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromHex(hex: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHex")(hex.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromString(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def isBinary(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def toHex(d: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toString_(b: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(b.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object digest {
    
    @JSImport("multiformats/dist/types/src/basics", "digest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/dist/types/src/basics", "digest.Digest")
    @js.native
    open class Digest[Code /* <: Double */, Size /* <: Double */] protected ()
      extends typingsJapgolly.multiformats.mod.digest.Digest[Code, Size] {
      /**
        * Creates a multihash digest.
        *
        * @param {Code} code
        * @param {Size} size
        * @param {Uint8Array} digest
        * @param {Uint8Array} bytes
        */
      def this(code: Code, size: Size, digest: js.typedarray.Uint8Array, bytes: js.typedarray.Uint8Array) = this()
    }
    
    inline def create[Code /* <: Double */](code: Code, digest: js.typedarray.Uint8Array): typingsJapgolly.multiformats.distTypesSrcHashesDigestMod.Digest[Code, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(code.asInstanceOf[js.Any], digest.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcHashesDigestMod.Digest[Code, Double]]
    
    inline def decode(multihash: js.typedarray.Uint8Array): typingsJapgolly.multiformats.distTypesSrcHashesDigestMod.MultihashDigest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(multihash.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcHashesDigestMod.MultihashDigest]
    
    inline def equals_(a: typingsJapgolly.multiformats.distTypesSrcHashesDigestMod.MultihashDigest, b: Any): /* is multiformats.multiformats/dist/types/src/hashes/interface.MultihashDigest<number> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[/* is multiformats.multiformats/dist/types/src/hashes/interface.MultihashDigest<number> */ Boolean]
  }
  
  object hasher {
    
    @JSImport("multiformats/dist/types/src/basics", "hasher")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/dist/types/src/basics", "hasher.Hasher")
    @js.native
    open class Hasher[Name /* <: String */, Code /* <: Double */] protected ()
      extends typingsJapgolly.multiformats.mod.hasher.Hasher[Name, Code] {
      /**
        *
        * @param {Name} name
        * @param {Code} code
        * @param {(input: Uint8Array) => Await<Uint8Array>} encode
        */
      def this(
        name: Name,
        code: Code,
        encode: js.Function1[/* input */ js.typedarray.Uint8Array, Await[js.typedarray.Uint8Array]]
      ) = this()
    }
    
    inline def from[Name /* <: String */, Code /* <: Double */](hasNameCodeEncode: Encode[Name, Code]): typingsJapgolly.multiformats.distTypesSrcHashesHasherMod.Hasher[Name, Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(hasNameCodeEncode.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.multiformats.distTypesSrcHashesHasherMod.Hasher[Name, Code]]
  }
  
  object hashes {
    
    @JSImport("multiformats/dist/types/src/basics", "hashes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multiformats/dist/types/src/basics", "hashes.identity")
    @js.native
    def identity: Code = js.native
    inline def identity_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "hashes.sha256")
    @js.native
    def sha256: Hasher[`sha2-256`, `18`] = js.native
    inline def sha256_=(x: Hasher[`sha2-256`, `18`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha256")(x.asInstanceOf[js.Any])
    
    @JSImport("multiformats/dist/types/src/basics", "hashes.sha512")
    @js.native
    def sha512: Hasher[`sha2-512`, `19`] = js.native
    inline def sha512_=(x: Hasher[`sha2-512`, `19`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512")(x.asInstanceOf[js.Any])
  }
  
  object varint {
    
    @JSImport("multiformats/dist/types/src/basics", "varint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(data: js.typedarray.Uint8Array): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
    inline def decode(data: js.typedarray.Uint8Array, offset: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
    
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def encodeTo(int: Double, target: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTo")(int.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def encodingLength(int: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(int.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
