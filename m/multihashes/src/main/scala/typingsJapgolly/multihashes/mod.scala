package typingsJapgolly.multihashes

import typingsJapgolly.multihashes.anon.Code
import typingsJapgolly.multihashes.distSrcTypesMod.CodeNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multihashes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multihashes", "codes")
  @js.native
  val codes: CodeNameMap = js.native
  
  inline def coerceCode(name: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceCode")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def coerceCode(name: HashName): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceCode")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def decode(bytes: js.typedarray.Uint8Array): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bytes.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  inline def encode(digest: js.typedarray.Uint8Array, code: HashCode): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(digest.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(digest: js.typedarray.Uint8Array, code: HashCode, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(digest.asInstanceOf[js.Any], code.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(digest: js.typedarray.Uint8Array, code: HashName): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(digest.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(digest: js.typedarray.Uint8Array, code: HashName, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(digest.asInstanceOf[js.Any], code.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromB58String(hash: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromB58String")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def fromB58String(hash: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromB58String")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def fromHexString(hash: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHexString")(hash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def isAppCode(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppCode")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidCode(code: HashCode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidCode")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined std.Record<multihashes.multihashes/dist/src/constants.HashName, multihashes.multihashes/dist/src/constants.HashCode> */
  object names {
    
    @JSImport("multihashes", "names")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("multihashes", "names.blake2b-104")
    @js.native
    def blake2b104: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b104_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-104")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-112")
    @js.native
    def blake2b112: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b112_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-112")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-120")
    @js.native
    def blake2b120: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b120_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-120")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-128")
    @js.native
    def blake2b128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-136")
    @js.native
    def blake2b136: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b136_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-136")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-144")
    @js.native
    def blake2b144: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b144_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-144")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-152")
    @js.native
    def blake2b152: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b152_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-152")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-16")
    @js.native
    def blake2b16: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-160")
    @js.native
    def blake2b160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-168")
    @js.native
    def blake2b168: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b168_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-168")(x.asInstanceOf[js.Any])
    
    inline def blake2b16_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-16")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-176")
    @js.native
    def blake2b176: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b176_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-176")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-184")
    @js.native
    def blake2b184: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b184_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-184")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-192")
    @js.native
    def blake2b192: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b192_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-192")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-200")
    @js.native
    def blake2b200: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b200_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-200")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-208")
    @js.native
    def blake2b208: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b208_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-208")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-216")
    @js.native
    def blake2b216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-216")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-224")
    @js.native
    def blake2b224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-232")
    @js.native
    def blake2b232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-232")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-24")
    @js.native
    def blake2b24: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-240")
    @js.native
    def blake2b240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-240")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-248")
    @js.native
    def blake2b248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-248")(x.asInstanceOf[js.Any])
    
    inline def blake2b24_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-24")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-256")
    @js.native
    def blake2b256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-264")
    @js.native
    def blake2b264: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b264_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-264")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-272")
    @js.native
    def blake2b272: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b272_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-272")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-280")
    @js.native
    def blake2b280: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b280_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-280")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-288")
    @js.native
    def blake2b288: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b288_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-288")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-296")
    @js.native
    def blake2b296: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b296_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-296")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-304")
    @js.native
    def blake2b304: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b304_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-304")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-312")
    @js.native
    def blake2b312: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b312_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-312")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-32")
    @js.native
    def blake2b32: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-320")
    @js.native
    def blake2b320: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b320_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-320")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-328")
    @js.native
    def blake2b328: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b328_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-328")(x.asInstanceOf[js.Any])
    
    inline def blake2b32_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-336")
    @js.native
    def blake2b336: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b336_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-336")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-344")
    @js.native
    def blake2b344: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b344_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-344")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-352")
    @js.native
    def blake2b352: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b352_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-352")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-360")
    @js.native
    def blake2b360: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b360_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-360")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-368")
    @js.native
    def blake2b368: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b368_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-368")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-376")
    @js.native
    def blake2b376: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b376_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-376")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-384")
    @js.native
    def blake2b384: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b384_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-384")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-392")
    @js.native
    def blake2b392: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b392_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-392")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-40")
    @js.native
    def blake2b40: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-400")
    @js.native
    def blake2b400: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b400_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-400")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-408")
    @js.native
    def blake2b408: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b408_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-408")(x.asInstanceOf[js.Any])
    
    inline def blake2b40_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-40")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-416")
    @js.native
    def blake2b416: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b416_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-416")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-424")
    @js.native
    def blake2b424: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b424_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-424")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-432")
    @js.native
    def blake2b432: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b432_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-432")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-440")
    @js.native
    def blake2b440: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b440_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-440")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-448")
    @js.native
    def blake2b448: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b448_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-448")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-456")
    @js.native
    def blake2b456: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b456_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-456")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-464")
    @js.native
    def blake2b464: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b464_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-464")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-472")
    @js.native
    def blake2b472: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b472_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-472")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-48")
    @js.native
    def blake2b48: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-480")
    @js.native
    def blake2b480: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b480_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-480")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-488")
    @js.native
    def blake2b488: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b488_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-488")(x.asInstanceOf[js.Any])
    
    inline def blake2b48_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-48")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-496")
    @js.native
    def blake2b496: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b496_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-496")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-504")
    @js.native
    def blake2b504: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b504_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-504")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-512")
    @js.native
    def blake2b512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-56")
    @js.native
    def blake2b56: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b56_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-56")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-64")
    @js.native
    def blake2b64: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b64_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-64")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-72")
    @js.native
    def blake2b72: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b72_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-72")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-8")
    @js.native
    def blake2b8: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2b-80")
    @js.native
    def blake2b80: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b80_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-80")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-88")
    @js.native
    def blake2b88: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b88_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-88")(x.asInstanceOf[js.Any])
    
    inline def blake2b8_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-8")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2b-96")
    @js.native
    def blake2b96: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2b96_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2b-96")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-104")
    @js.native
    def blake2s104: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s104_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-104")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-112")
    @js.native
    def blake2s112: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s112_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-112")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-120")
    @js.native
    def blake2s120: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s120_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-120")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-128")
    @js.native
    def blake2s128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-136")
    @js.native
    def blake2s136: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s136_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-136")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-144")
    @js.native
    def blake2s144: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s144_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-144")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-152")
    @js.native
    def blake2s152: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s152_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-152")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-16")
    @js.native
    def blake2s16: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2s-160")
    @js.native
    def blake2s160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-168")
    @js.native
    def blake2s168: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s168_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-168")(x.asInstanceOf[js.Any])
    
    inline def blake2s16_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-16")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-176")
    @js.native
    def blake2s176: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s176_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-176")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-184")
    @js.native
    def blake2s184: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s184_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-184")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-192")
    @js.native
    def blake2s192: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s192_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-192")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-200")
    @js.native
    def blake2s200: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s200_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-200")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-208")
    @js.native
    def blake2s208: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s208_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-208")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-216")
    @js.native
    def blake2s216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-216")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-224")
    @js.native
    def blake2s224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-232")
    @js.native
    def blake2s232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-232")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-24")
    @js.native
    def blake2s24: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2s-240")
    @js.native
    def blake2s240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-240")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-248")
    @js.native
    def blake2s248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-248")(x.asInstanceOf[js.Any])
    
    inline def blake2s24_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-24")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-256")
    @js.native
    def blake2s256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-32")
    @js.native
    def blake2s32: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s32_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-40")
    @js.native
    def blake2s40: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s40_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-40")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-48")
    @js.native
    def blake2s48: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s48_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-48")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-56")
    @js.native
    def blake2s56: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s56_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-56")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-64")
    @js.native
    def blake2s64: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s64_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-64")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-72")
    @js.native
    def blake2s72: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s72_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-72")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-8")
    @js.native
    def blake2s8: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.blake2s-80")
    @js.native
    def blake2s80: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s80_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-80")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-88")
    @js.native
    def blake2s88: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s88_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-88")(x.asInstanceOf[js.Any])
    
    inline def blake2s8_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-8")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake2s-96")
    @js.native
    def blake2s96: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def blake2s96_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake2s-96")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.blake3")
    @js.native
    def blake3: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def blake3_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blake3")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.bmt")
    @js.native
    def bmt: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def bmt_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmt")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.dbl-sha2-256")
    @js.native
    def dblSha2256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def dblSha2256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dbl-sha2-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.identity")
    @js.native
    def identity: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def identity_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identity")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.kangarootwelve")
    @js.native
    def kangarootwelve: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def kangarootwelve_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kangarootwelve")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.keccak-224")
    @js.native
    def keccak224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def keccak224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keccak-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.keccak-256")
    @js.native
    def keccak256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def keccak256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keccak-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.keccak-384")
    @js.native
    def keccak384: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def keccak384_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keccak-384")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.keccak-512")
    @js.native
    def keccak512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def keccak512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keccak-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.md4")
    @js.native
    def md4: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def md4_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md4")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.md5")
    @js.native
    def md5: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def md5_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md5")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.murmur3-128")
    @js.native
    def murmur3128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def murmur3128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("murmur3-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.murmur3-32")
    @js.native
    def murmur332: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def murmur332_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("murmur3-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.poseidon-bls12_381-a2-fc1")
    @js.native
    def poseidonBls12381A2Fc1: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.poseidon-bls12_381-a2-fc1-sc")
    @js.native
    def poseidonBls12381A2Fc1Sc: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def poseidonBls12381A2Fc1Sc_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poseidon-bls12_381-a2-fc1-sc")(x.asInstanceOf[js.Any])
    
    inline def poseidonBls12381A2Fc1_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("poseidon-bls12_381-a2-fc1")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.ripemd-128")
    @js.native
    def ripemd128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def ripemd128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.ripemd-160")
    @js.native
    def ripemd160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def ripemd160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.ripemd-256")
    @js.native
    def ripemd256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def ripemd256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.ripemd-320")
    @js.native
    def ripemd320: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def ripemd320_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ripemd-320")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha1")
    @js.native
    def sha1: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def sha1_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha1")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha2-256")
    @js.native
    def sha2256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.sha2-256-trunc254-padded")
    @js.native
    def sha2256Trunc254Padded: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha2256Trunc254Padded_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha2-256-trunc254-padded")(x.asInstanceOf[js.Any])
    
    inline def sha2256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha2-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha2-512")
    @js.native
    def sha2512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha2512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha2-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha3-224")
    @js.native
    def sha3224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha3224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha3-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha3-256")
    @js.native
    def sha3256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha3256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha3-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha3-384")
    @js.native
    def sha3384: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha3384_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha3-384")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sha3-512")
    @js.native
    def sha3512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sha3512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha3-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.shake-128")
    @js.native
    def shake128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def shake128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shake-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.shake-256")
    @js.native
    def shake256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def shake256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shake-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-1000")
    @js.native
    def skein10241000: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein10241000_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-1000")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-1008")
    @js.native
    def skein10241008: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein10241008_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-1008")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-1016")
    @js.native
    def skein10241016: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein10241016_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-1016")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-1024")
    @js.native
    def skein10241024: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein10241024_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-1024")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-104")
    @js.native
    def skein1024104: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024104_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-104")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-112")
    @js.native
    def skein1024112: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024112_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-112")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-120")
    @js.native
    def skein1024120: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024120_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-120")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-128")
    @js.native
    def skein1024128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-136")
    @js.native
    def skein1024136: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024136_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-136")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-144")
    @js.native
    def skein1024144: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024144_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-144")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-152")
    @js.native
    def skein1024152: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024152_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-152")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-16")
    @js.native
    def skein102416: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-160")
    @js.native
    def skein1024160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-168")
    @js.native
    def skein1024168: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024168_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-168")(x.asInstanceOf[js.Any])
    
    inline def skein102416_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-16")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-176")
    @js.native
    def skein1024176: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024176_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-176")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-184")
    @js.native
    def skein1024184: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024184_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-184")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-192")
    @js.native
    def skein1024192: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024192_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-192")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-200")
    @js.native
    def skein1024200: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024200_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-200")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-208")
    @js.native
    def skein1024208: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024208_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-208")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-216")
    @js.native
    def skein1024216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-216")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-224")
    @js.native
    def skein1024224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-232")
    @js.native
    def skein1024232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-232")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-24")
    @js.native
    def skein102424: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-240")
    @js.native
    def skein1024240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-240")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-248")
    @js.native
    def skein1024248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-248")(x.asInstanceOf[js.Any])
    
    inline def skein102424_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-24")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-256")
    @js.native
    def skein1024256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-264")
    @js.native
    def skein1024264: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024264_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-264")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-272")
    @js.native
    def skein1024272: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024272_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-272")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-280")
    @js.native
    def skein1024280: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024280_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-280")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-288")
    @js.native
    def skein1024288: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024288_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-288")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-296")
    @js.native
    def skein1024296: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024296_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-296")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-304")
    @js.native
    def skein1024304: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024304_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-304")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-312")
    @js.native
    def skein1024312: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024312_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-312")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-32")
    @js.native
    def skein102432: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-320")
    @js.native
    def skein1024320: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024320_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-320")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-328")
    @js.native
    def skein1024328: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024328_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-328")(x.asInstanceOf[js.Any])
    
    inline def skein102432_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-336")
    @js.native
    def skein1024336: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024336_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-336")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-344")
    @js.native
    def skein1024344: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024344_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-344")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-352")
    @js.native
    def skein1024352: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024352_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-352")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-360")
    @js.native
    def skein1024360: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024360_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-360")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-368")
    @js.native
    def skein1024368: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024368_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-368")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-376")
    @js.native
    def skein1024376: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024376_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-376")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-384")
    @js.native
    def skein1024384: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024384_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-384")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-392")
    @js.native
    def skein1024392: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024392_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-392")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-40")
    @js.native
    def skein102440: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-400")
    @js.native
    def skein1024400: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024400_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-400")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-408")
    @js.native
    def skein1024408: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024408_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-408")(x.asInstanceOf[js.Any])
    
    inline def skein102440_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-40")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-416")
    @js.native
    def skein1024416: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024416_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-416")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-424")
    @js.native
    def skein1024424: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024424_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-424")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-432")
    @js.native
    def skein1024432: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024432_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-432")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-440")
    @js.native
    def skein1024440: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024440_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-440")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-448")
    @js.native
    def skein1024448: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024448_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-448")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-456")
    @js.native
    def skein1024456: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024456_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-456")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-464")
    @js.native
    def skein1024464: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024464_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-464")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-472")
    @js.native
    def skein1024472: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024472_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-472")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-48")
    @js.native
    def skein102448: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-480")
    @js.native
    def skein1024480: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024480_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-480")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-488")
    @js.native
    def skein1024488: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024488_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-488")(x.asInstanceOf[js.Any])
    
    inline def skein102448_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-48")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-496")
    @js.native
    def skein1024496: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024496_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-496")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-504")
    @js.native
    def skein1024504: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024504_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-504")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-512")
    @js.native
    def skein1024512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-520")
    @js.native
    def skein1024520: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024520_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-520")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-528")
    @js.native
    def skein1024528: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024528_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-528")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-536")
    @js.native
    def skein1024536: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024536_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-536")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-544")
    @js.native
    def skein1024544: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024544_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-544")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-552")
    @js.native
    def skein1024552: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024552_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-552")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-56")
    @js.native
    def skein102456: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-560")
    @js.native
    def skein1024560: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024560_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-560")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-568")
    @js.native
    def skein1024568: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024568_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-568")(x.asInstanceOf[js.Any])
    
    inline def skein102456_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-56")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-576")
    @js.native
    def skein1024576: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024576_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-576")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-584")
    @js.native
    def skein1024584: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024584_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-584")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-592")
    @js.native
    def skein1024592: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024592_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-592")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-600")
    @js.native
    def skein1024600: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024600_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-600")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-608")
    @js.native
    def skein1024608: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024608_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-608")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-616")
    @js.native
    def skein1024616: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024616_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-616")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-624")
    @js.native
    def skein1024624: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024624_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-624")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-632")
    @js.native
    def skein1024632: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024632_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-632")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-64")
    @js.native
    def skein102464: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-640")
    @js.native
    def skein1024640: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024640_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-640")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-648")
    @js.native
    def skein1024648: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024648_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-648")(x.asInstanceOf[js.Any])
    
    inline def skein102464_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-64")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-656")
    @js.native
    def skein1024656: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024656_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-656")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-664")
    @js.native
    def skein1024664: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024664_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-664")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-672")
    @js.native
    def skein1024672: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024672_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-672")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-680")
    @js.native
    def skein1024680: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024680_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-680")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-688")
    @js.native
    def skein1024688: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024688_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-688")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-696")
    @js.native
    def skein1024696: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024696_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-696")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-704")
    @js.native
    def skein1024704: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024704_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-704")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-712")
    @js.native
    def skein1024712: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024712_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-712")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-72")
    @js.native
    def skein102472: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-720")
    @js.native
    def skein1024720: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024720_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-720")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-728")
    @js.native
    def skein1024728: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024728_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-728")(x.asInstanceOf[js.Any])
    
    inline def skein102472_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-72")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-736")
    @js.native
    def skein1024736: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024736_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-736")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-744")
    @js.native
    def skein1024744: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024744_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-744")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-752")
    @js.native
    def skein1024752: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024752_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-752")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-760")
    @js.native
    def skein1024760: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024760_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-760")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-768")
    @js.native
    def skein1024768: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024768_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-768")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-776")
    @js.native
    def skein1024776: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024776_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-776")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-784")
    @js.native
    def skein1024784: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024784_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-784")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-792")
    @js.native
    def skein1024792: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024792_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-792")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-8")
    @js.native
    def skein10248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-80")
    @js.native
    def skein102480: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-800")
    @js.native
    def skein1024800: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024800_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-800")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-808")
    @js.native
    def skein1024808: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024808_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-808")(x.asInstanceOf[js.Any])
    
    inline def skein102480_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-80")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-816")
    @js.native
    def skein1024816: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024816_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-816")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-824")
    @js.native
    def skein1024824: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024824_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-824")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-832")
    @js.native
    def skein1024832: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024832_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-832")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-840")
    @js.native
    def skein1024840: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024840_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-840")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-848")
    @js.native
    def skein1024848: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024848_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-848")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-856")
    @js.native
    def skein1024856: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024856_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-856")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-864")
    @js.native
    def skein1024864: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024864_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-864")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-872")
    @js.native
    def skein1024872: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024872_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-872")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-88")
    @js.native
    def skein102488: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-880")
    @js.native
    def skein1024880: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024880_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-880")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-888")
    @js.native
    def skein1024888: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024888_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-888")(x.asInstanceOf[js.Any])
    
    inline def skein102488_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-88")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-896")
    @js.native
    def skein1024896: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024896_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-896")(x.asInstanceOf[js.Any])
    
    inline def skein10248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-8")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-904")
    @js.native
    def skein1024904: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024904_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-904")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-912")
    @js.native
    def skein1024912: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024912_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-912")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-920")
    @js.native
    def skein1024920: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024920_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-920")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-928")
    @js.native
    def skein1024928: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024928_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-928")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-936")
    @js.native
    def skein1024936: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024936_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-936")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-944")
    @js.native
    def skein1024944: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024944_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-944")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-952")
    @js.native
    def skein1024952: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024952_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-952")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-96")
    @js.native
    def skein102496: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein1024-960")
    @js.native
    def skein1024960: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024960_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-960")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-968")
    @js.native
    def skein1024968: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024968_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-968")(x.asInstanceOf[js.Any])
    
    inline def skein102496_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-96")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-976")
    @js.native
    def skein1024976: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024976_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-976")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-984")
    @js.native
    def skein1024984: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024984_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-984")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein1024-992")
    @js.native
    def skein1024992: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein1024992_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein1024-992")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-104")
    @js.native
    def skein256104: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256104_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-104")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-112")
    @js.native
    def skein256112: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256112_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-112")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-120")
    @js.native
    def skein256120: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256120_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-120")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-128")
    @js.native
    def skein256128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-136")
    @js.native
    def skein256136: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256136_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-136")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-144")
    @js.native
    def skein256144: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256144_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-144")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-152")
    @js.native
    def skein256152: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256152_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-152")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-16")
    @js.native
    def skein25616: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein256-160")
    @js.native
    def skein256160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-168")
    @js.native
    def skein256168: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256168_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-168")(x.asInstanceOf[js.Any])
    
    inline def skein25616_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-16")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-176")
    @js.native
    def skein256176: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256176_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-176")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-184")
    @js.native
    def skein256184: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256184_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-184")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-192")
    @js.native
    def skein256192: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256192_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-192")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-200")
    @js.native
    def skein256200: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256200_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-200")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-208")
    @js.native
    def skein256208: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256208_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-208")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-216")
    @js.native
    def skein256216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-216")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-224")
    @js.native
    def skein256224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-232")
    @js.native
    def skein256232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-232")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-24")
    @js.native
    def skein25624: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein256-240")
    @js.native
    def skein256240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-240")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-248")
    @js.native
    def skein256248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-248")(x.asInstanceOf[js.Any])
    
    inline def skein25624_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-24")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-256")
    @js.native
    def skein256256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein256256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-32")
    @js.native
    def skein25632: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25632_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-40")
    @js.native
    def skein25640: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25640_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-40")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-48")
    @js.native
    def skein25648: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25648_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-48")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-56")
    @js.native
    def skein25656: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25656_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-56")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-64")
    @js.native
    def skein25664: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25664_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-64")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-72")
    @js.native
    def skein25672: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25672_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-72")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-8")
    @js.native
    def skein2568: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein256-80")
    @js.native
    def skein25680: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25680_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-80")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-88")
    @js.native
    def skein25688: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25688_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-88")(x.asInstanceOf[js.Any])
    
    inline def skein2568_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-8")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein256-96")
    @js.native
    def skein25696: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein25696_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein256-96")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-104")
    @js.native
    def skein512104: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512104_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-104")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-112")
    @js.native
    def skein512112: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512112_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-112")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-120")
    @js.native
    def skein512120: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512120_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-120")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-128")
    @js.native
    def skein512128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-128")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-136")
    @js.native
    def skein512136: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512136_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-136")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-144")
    @js.native
    def skein512144: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512144_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-144")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-152")
    @js.native
    def skein512152: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512152_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-152")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-16")
    @js.native
    def skein51216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-160")
    @js.native
    def skein512160: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512160_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-160")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-168")
    @js.native
    def skein512168: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512168_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-168")(x.asInstanceOf[js.Any])
    
    inline def skein51216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-16")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-176")
    @js.native
    def skein512176: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512176_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-176")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-184")
    @js.native
    def skein512184: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512184_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-184")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-192")
    @js.native
    def skein512192: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512192_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-192")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-200")
    @js.native
    def skein512200: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512200_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-200")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-208")
    @js.native
    def skein512208: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512208_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-208")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-216")
    @js.native
    def skein512216: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512216_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-216")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-224")
    @js.native
    def skein512224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-224")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-232")
    @js.native
    def skein512232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-232")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-24")
    @js.native
    def skein51224: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-240")
    @js.native
    def skein512240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-240")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-248")
    @js.native
    def skein512248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-248")(x.asInstanceOf[js.Any])
    
    inline def skein51224_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-24")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-256")
    @js.native
    def skein512256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-264")
    @js.native
    def skein512264: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512264_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-264")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-272")
    @js.native
    def skein512272: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512272_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-272")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-280")
    @js.native
    def skein512280: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512280_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-280")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-288")
    @js.native
    def skein512288: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512288_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-288")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-296")
    @js.native
    def skein512296: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512296_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-296")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-304")
    @js.native
    def skein512304: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512304_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-304")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-312")
    @js.native
    def skein512312: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512312_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-312")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-32")
    @js.native
    def skein51232: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-320")
    @js.native
    def skein512320: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512320_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-320")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-328")
    @js.native
    def skein512328: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512328_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-328")(x.asInstanceOf[js.Any])
    
    inline def skein51232_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-32")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-336")
    @js.native
    def skein512336: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512336_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-336")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-344")
    @js.native
    def skein512344: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512344_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-344")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-352")
    @js.native
    def skein512352: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512352_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-352")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-360")
    @js.native
    def skein512360: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512360_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-360")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-368")
    @js.native
    def skein512368: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512368_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-368")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-376")
    @js.native
    def skein512376: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512376_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-376")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-384")
    @js.native
    def skein512384: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512384_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-384")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-392")
    @js.native
    def skein512392: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512392_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-392")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-40")
    @js.native
    def skein51240: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-400")
    @js.native
    def skein512400: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512400_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-400")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-408")
    @js.native
    def skein512408: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512408_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-408")(x.asInstanceOf[js.Any])
    
    inline def skein51240_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-40")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-416")
    @js.native
    def skein512416: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512416_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-416")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-424")
    @js.native
    def skein512424: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512424_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-424")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-432")
    @js.native
    def skein512432: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512432_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-432")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-440")
    @js.native
    def skein512440: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512440_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-440")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-448")
    @js.native
    def skein512448: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512448_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-448")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-456")
    @js.native
    def skein512456: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512456_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-456")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-464")
    @js.native
    def skein512464: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512464_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-464")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-472")
    @js.native
    def skein512472: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512472_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-472")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-48")
    @js.native
    def skein51248: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-480")
    @js.native
    def skein512480: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512480_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-480")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-488")
    @js.native
    def skein512488: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512488_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-488")(x.asInstanceOf[js.Any])
    
    inline def skein51248_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-48")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-496")
    @js.native
    def skein512496: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512496_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-496")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-504")
    @js.native
    def skein512504: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512504_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-504")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-512")
    @js.native
    def skein512512: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein512512_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-512")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-56")
    @js.native
    def skein51256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-56")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-64")
    @js.native
    def skein51264: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51264_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-64")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-72")
    @js.native
    def skein51272: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51272_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-72")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-8")
    @js.native
    def skein5128: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    @JSImport("multihashes", "names.skein512-80")
    @js.native
    def skein51280: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51280_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-80")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-88")
    @js.native
    def skein51288: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51288_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-88")(x.asInstanceOf[js.Any])
    
    inline def skein5128_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-8")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.skein512-96")
    @js.native
    def skein51296: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def skein51296_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skein512-96")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.sm3-256")
    @js.native
    def sm3256: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    
    inline def sm3256_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm3-256")(x.asInstanceOf[js.Any])
    
    @JSImport("multihashes", "names.x11")
    @js.native
    def x11: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode = js.native
    inline def x11_=(x: typingsJapgolly.multihashes.distSrcConstantsMod.HashCode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("x11")(x.asInstanceOf[js.Any])
  }
  
  inline def prefix(multihash: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(multihash.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toB58String(hash: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toB58String")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toHexString(hash: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHexString")(hash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def validate(multihash: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(multihash.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type HashCode = typingsJapgolly.multihashes.distSrcConstantsMod.HashCode
  
  type HashName = typingsJapgolly.multihashes.distSrcConstantsMod.HashName
}
