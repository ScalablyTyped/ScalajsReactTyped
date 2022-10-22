package typingsJapgolly.multicodec

import typingsJapgolly.multicodec.distSrcMapsMod.CodeNameMap
import typingsJapgolly.multicodec.distSrcMapsMod.NameUint8ArrayMap
import typingsJapgolly.multicodec.multicodecStrings.bencode_
import typingsJapgolly.multicodec.multicodecStrings.blake3_
import typingsJapgolly.multicodec.multicodecStrings.bmt_
import typingsJapgolly.multicodec.multicodecStrings.cbor_
import typingsJapgolly.multicodec.multicodecStrings.cidv1_
import typingsJapgolly.multicodec.multicodecStrings.cidv2_
import typingsJapgolly.multicodec.multicodecStrings.cidv3_
import typingsJapgolly.multicodec.multicodecStrings.dccp_
import typingsJapgolly.multicodec.multicodecStrings.dns4_
import typingsJapgolly.multicodec.multicodecStrings.dns6_
import typingsJapgolly.multicodec.multicodecStrings.dns_
import typingsJapgolly.multicodec.multicodecStrings.dnsaddr_
import typingsJapgolly.multicodec.multicodecStrings.garlic32_
import typingsJapgolly.multicodec.multicodecStrings.garlic64_
import typingsJapgolly.multicodec.multicodecStrings.http_
import typingsJapgolly.multicodec.multicodecStrings.https_
import typingsJapgolly.multicodec.multicodecStrings.identity_
import typingsJapgolly.multicodec.multicodecStrings.ip4_
import typingsJapgolly.multicodec.multicodecStrings.ip6_
import typingsJapgolly.multicodec.multicodecStrings.ip6zone_
import typingsJapgolly.multicodec.multicodecStrings.ipfs_
import typingsJapgolly.multicodec.multicodecStrings.json_
import typingsJapgolly.multicodec.multicodecStrings.kangarootwelve_
import typingsJapgolly.multicodec.multicodecStrings.md4_
import typingsJapgolly.multicodec.multicodecStrings.md5_
import typingsJapgolly.multicodec.multicodecStrings.messagepack_
import typingsJapgolly.multicodec.multicodecStrings.multiaddr_
import typingsJapgolly.multicodec.multicodecStrings.multibase_
import typingsJapgolly.multicodec.multicodecStrings.multicodec_
import typingsJapgolly.multicodec.multicodecStrings.multihash_
import typingsJapgolly.multicodec.multicodecStrings.noise_
import typingsJapgolly.multicodec.multicodecStrings.onion3_
import typingsJapgolly.multicodec.multicodecStrings.onion_
import typingsJapgolly.multicodec.multicodecStrings.p2p_
import typingsJapgolly.multicodec.multicodecStrings.path_
import typingsJapgolly.multicodec.multicodecStrings.protobuf_
import typingsJapgolly.multicodec.multicodecStrings.quic_
import typingsJapgolly.multicodec.multicodecStrings.raw_
import typingsJapgolly.multicodec.multicodecStrings.rlp_
import typingsJapgolly.multicodec.multicodecStrings.sctp_
import typingsJapgolly.multicodec.multicodecStrings.sha1_
import typingsJapgolly.multicodec.multicodecStrings.streamid_
import typingsJapgolly.multicodec.multicodecStrings.tcp_
import typingsJapgolly.multicodec.multicodecStrings.thread_
import typingsJapgolly.multicodec.multicodecStrings.tls_
import typingsJapgolly.multicodec.multicodecStrings.udp_
import typingsJapgolly.multicodec.multicodecStrings.udt_
import typingsJapgolly.multicodec.multicodecStrings.unix_
import typingsJapgolly.multicodec.multicodecStrings.utp_
import typingsJapgolly.multicodec.multicodecStrings.ws_
import typingsJapgolly.multicodec.multicodecStrings.wss_
import typingsJapgolly.multicodec.multicodecStrings.x11_
import typingsJapgolly.multicodec.multicodecStrings.zeronet_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multicodec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multicodec", "ARWEAVE_NS")
  @js.native
  val ARWEAVE_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BENCODE")
  @js.native
  val BENCODE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_BLOCK")
  @js.native
  val BITCOIN_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_TX")
  @js.native
  val BITCOIN_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BITCOIN_WITNESS_COMMITMENT")
  @js.native
  val BITCOIN_WITNESS_COMMITMENT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_104")
  @js.native
  val BLAKE2B_104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_112")
  @js.native
  val BLAKE2B_112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_120")
  @js.native
  val BLAKE2B_120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_128")
  @js.native
  val BLAKE2B_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_136")
  @js.native
  val BLAKE2B_136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_144")
  @js.native
  val BLAKE2B_144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_152")
  @js.native
  val BLAKE2B_152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_16")
  @js.native
  val BLAKE2B_16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_160")
  @js.native
  val BLAKE2B_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_168")
  @js.native
  val BLAKE2B_168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_176")
  @js.native
  val BLAKE2B_176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_184")
  @js.native
  val BLAKE2B_184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_192")
  @js.native
  val BLAKE2B_192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_200")
  @js.native
  val BLAKE2B_200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_208")
  @js.native
  val BLAKE2B_208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_216")
  @js.native
  val BLAKE2B_216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_224")
  @js.native
  val BLAKE2B_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_232")
  @js.native
  val BLAKE2B_232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_24")
  @js.native
  val BLAKE2B_24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_240")
  @js.native
  val BLAKE2B_240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_248")
  @js.native
  val BLAKE2B_248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_256")
  @js.native
  val BLAKE2B_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_264")
  @js.native
  val BLAKE2B_264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_272")
  @js.native
  val BLAKE2B_272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_280")
  @js.native
  val BLAKE2B_280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_288")
  @js.native
  val BLAKE2B_288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_296")
  @js.native
  val BLAKE2B_296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_304")
  @js.native
  val BLAKE2B_304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_312")
  @js.native
  val BLAKE2B_312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_32")
  @js.native
  val BLAKE2B_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_320")
  @js.native
  val BLAKE2B_320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_328")
  @js.native
  val BLAKE2B_328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_336")
  @js.native
  val BLAKE2B_336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_344")
  @js.native
  val BLAKE2B_344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_352")
  @js.native
  val BLAKE2B_352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_360")
  @js.native
  val BLAKE2B_360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_368")
  @js.native
  val BLAKE2B_368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_376")
  @js.native
  val BLAKE2B_376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_384")
  @js.native
  val BLAKE2B_384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_392")
  @js.native
  val BLAKE2B_392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_40")
  @js.native
  val BLAKE2B_40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_400")
  @js.native
  val BLAKE2B_400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_408")
  @js.native
  val BLAKE2B_408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_416")
  @js.native
  val BLAKE2B_416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_424")
  @js.native
  val BLAKE2B_424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_432")
  @js.native
  val BLAKE2B_432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_440")
  @js.native
  val BLAKE2B_440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_448")
  @js.native
  val BLAKE2B_448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_456")
  @js.native
  val BLAKE2B_456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_464")
  @js.native
  val BLAKE2B_464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_472")
  @js.native
  val BLAKE2B_472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_48")
  @js.native
  val BLAKE2B_48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_480")
  @js.native
  val BLAKE2B_480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_488")
  @js.native
  val BLAKE2B_488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_496")
  @js.native
  val BLAKE2B_496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_504")
  @js.native
  val BLAKE2B_504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_512")
  @js.native
  val BLAKE2B_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_56")
  @js.native
  val BLAKE2B_56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_64")
  @js.native
  val BLAKE2B_64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_72")
  @js.native
  val BLAKE2B_72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_8")
  @js.native
  val BLAKE2B_8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_80")
  @js.native
  val BLAKE2B_80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_88")
  @js.native
  val BLAKE2B_88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2B_96")
  @js.native
  val BLAKE2B_96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_104")
  @js.native
  val BLAKE2S_104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_112")
  @js.native
  val BLAKE2S_112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_120")
  @js.native
  val BLAKE2S_120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_128")
  @js.native
  val BLAKE2S_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_136")
  @js.native
  val BLAKE2S_136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_144")
  @js.native
  val BLAKE2S_144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_152")
  @js.native
  val BLAKE2S_152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_16")
  @js.native
  val BLAKE2S_16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_160")
  @js.native
  val BLAKE2S_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_168")
  @js.native
  val BLAKE2S_168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_176")
  @js.native
  val BLAKE2S_176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_184")
  @js.native
  val BLAKE2S_184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_192")
  @js.native
  val BLAKE2S_192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_200")
  @js.native
  val BLAKE2S_200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_208")
  @js.native
  val BLAKE2S_208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_216")
  @js.native
  val BLAKE2S_216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_224")
  @js.native
  val BLAKE2S_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_232")
  @js.native
  val BLAKE2S_232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_24")
  @js.native
  val BLAKE2S_24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_240")
  @js.native
  val BLAKE2S_240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_248")
  @js.native
  val BLAKE2S_248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_256")
  @js.native
  val BLAKE2S_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_32")
  @js.native
  val BLAKE2S_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_40")
  @js.native
  val BLAKE2S_40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_48")
  @js.native
  val BLAKE2S_48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_56")
  @js.native
  val BLAKE2S_56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_64")
  @js.native
  val BLAKE2S_64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_72")
  @js.native
  val BLAKE2S_72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_8")
  @js.native
  val BLAKE2S_8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_80")
  @js.native
  val BLAKE2S_80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_88")
  @js.native
  val BLAKE2S_88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE2S_96")
  @js.native
  val BLAKE2S_96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLAKE3")
  @js.native
  val BLAKE3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G1G2_PUB")
  @js.native
  val BLS12_381_G1G2_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G1_PUB")
  @js.native
  val BLS12_381_G1_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BLS12_381_G2_PUB")
  @js.native
  val BLS12_381_G2_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "BMT")
  @js.native
  val BMT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CAIP_50")
  @js.native
  val CAIP_50: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CAR_INDEX_SORTED")
  @js.native
  val CAR_INDEX_SORTED: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CBOR")
  @js.native
  val CBOR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV1")
  @js.native
  val CIDV1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV2")
  @js.native
  val CIDV2: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "CIDV3")
  @js.native
  val CIDV3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_CBOR")
  @js.native
  val DAG_CBOR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_COSE")
  @js.native
  val DAG_COSE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_JOSE")
  @js.native
  val DAG_JOSE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_JSON")
  @js.native
  val DAG_JSON: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DAG_PB")
  @js.native
  val DAG_PB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DASH_BLOCK")
  @js.native
  val DASH_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DASH_TX")
  @js.native
  val DASH_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DBL_SHA2_256")
  @js.native
  val DBL_SHA2_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DCCP")
  @js.native
  val DCCP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DECRED_BLOCK")
  @js.native
  val DECRED_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DECRED_TX")
  @js.native
  val DECRED_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS")
  @js.native
  val DNS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS4")
  @js.native
  val DNS4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNS6")
  @js.native
  val DNS6: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "DNSADDR")
  @js.native
  val DNSADDR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED25519_PRIV")
  @js.native
  val ED25519_PRIV: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED25519_PUB")
  @js.native
  val ED25519_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ED448_PUB")
  @js.native
  val ED448_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_ACCOUNT_SNAPSHOT")
  @js.native
  val ETH_ACCOUNT_SNAPSHOT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_BLOCK")
  @js.native
  val ETH_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_BLOCK_LIST")
  @js.native
  val ETH_BLOCK_LIST: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_RECEIPT_LOG_TRIE")
  @js.native
  val ETH_RECEIPT_LOG_TRIE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_RECIEPT_LOG")
  @js.native
  val ETH_RECIEPT_LOG: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_STATE_TRIE")
  @js.native
  val ETH_STATE_TRIE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_STORAGE_TRIE")
  @js.native
  val ETH_STORAGE_TRIE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX")
  @js.native
  val ETH_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_RECEIPT")
  @js.native
  val ETH_TX_RECEIPT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_RECEIPT_TRIE")
  @js.native
  val ETH_TX_RECEIPT_TRIE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ETH_TX_TRIE")
  @js.native
  val ETH_TX_TRIE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "FIL_COMMITMENT_SEALED")
  @js.native
  val FIL_COMMITMENT_SEALED: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "FIL_COMMITMENT_UNSEALED")
  @js.native
  val FIL_COMMITMENT_UNSEALED: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GARLIC32")
  @js.native
  val GARLIC32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GARLIC64")
  @js.native
  val GARLIC64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "GIT_RAW")
  @js.native
  val GIT_RAW: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_ADR_V0")
  @js.native
  val HOLOCHAIN_ADR_V0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_ADR_V1")
  @js.native
  val HOLOCHAIN_ADR_V1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_KEY_V0")
  @js.native
  val HOLOCHAIN_KEY_V0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_KEY_V1")
  @js.native
  val HOLOCHAIN_KEY_V1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_SIG_V0")
  @js.native
  val HOLOCHAIN_SIG_V0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HOLOCHAIN_SIG_V1")
  @js.native
  val HOLOCHAIN_SIG_V1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HTTP")
  @js.native
  val HTTP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "HTTPS")
  @js.native
  val HTTPS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IDENTITY")
  @js.native
  val IDENTITY: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP4")
  @js.native
  val IP4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP6")
  @js.native
  val IP6: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IP6ZONE")
  @js.native
  val IP6ZONE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPFS")
  @js.native
  val IPFS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPFS_NS")
  @js.native
  val IPFS_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPLD_NS")
  @js.native
  val IPLD_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "IPNS_NS")
  @js.native
  val IPNS_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "JSON")
  @js.native
  val JSON: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KANGAROOTWELVE")
  @js.native
  val KANGAROOTWELVE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_224")
  @js.native
  val KECCAK_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_256")
  @js.native
  val KECCAK_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_384")
  @js.native
  val KECCAK_384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "KECCAK_512")
  @js.native
  val KECCAK_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_BLOCK")
  @js.native
  val LEOFCOIN_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_PR")
  @js.native
  val LEOFCOIN_PR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LEOFCOIN_TX")
  @js.native
  val LEOFCOIN_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_KEY")
  @js.native
  val LIBP2P_KEY: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_PEER_RECORD")
  @js.native
  val LIBP2P_PEER_RECORD: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "LIBP2P_RELAY_RSVP")
  @js.native
  val LIBP2P_RELAY_RSVP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MD4")
  @js.native
  val MD4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MD5")
  @js.native
  val MD5: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MESSAGEPACK")
  @js.native
  val MESSAGEPACK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIADDR")
  @js.native
  val MULTIADDR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIBASE")
  @js.native
  val MULTIBASE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTICODEC")
  @js.native
  val MULTICODEC: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MULTIHASH")
  @js.native
  val MULTIHASH: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MURMUR3_128")
  @js.native
  val MURMUR3_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "MURMUR3_32")
  @js.native
  val MURMUR3_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "NOISE")
  @js.native
  val NOISE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ONION")
  @js.native
  val ONION: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ONION3")
  @js.native
  val ONION3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P256_PUB")
  @js.native
  val P256_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P")
  @js.native
  val P2P: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_CIRCUIT")
  @js.native
  val P2P_CIRCUIT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_STARDUST")
  @js.native
  val P2P_STARDUST: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBRTC_DIRECT")
  @js.native
  val P2P_WEBRTC_DIRECT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBRTC_STAR")
  @js.native
  val P2P_WEBRTC_STAR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P2P_WEBSOCKET_STAR")
  @js.native
  val P2P_WEBSOCKET_STAR: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P384_PUB")
  @js.native
  val P384_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "P521_PUB")
  @js.native
  val P521_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "PATH")
  @js.native
  val PATH: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "POSEIDON_BLS12_381_A2_FC1")
  @js.native
  val POSEIDON_BLS12_381_A2_FC1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "POSEIDON_BLS12_381_A2_FC1_SC")
  @js.native
  val POSEIDON_BLS12_381_A2_FC1_SC: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "PROTOBUF")
  @js.native
  val PROTOBUF: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "QUIC")
  @js.native
  val QUIC: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RAW")
  @js.native
  val RAW: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_128")
  @js.native
  val RIPEMD_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_160")
  @js.native
  val RIPEMD_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_256")
  @js.native
  val RIPEMD_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RIPEMD_320")
  @js.native
  val RIPEMD_320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "RLP")
  @js.native
  val RLP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SCTP")
  @js.native
  val SCTP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SECP256K1_PRIV")
  @js.native
  val SECP256K1_PRIV: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SECP256K1_PUB")
  @js.native
  val SECP256K1_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA1")
  @js.native
  val SHA1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_256")
  @js.native
  val SHA2_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_256_TRUNC254_PADDED")
  @js.native
  val SHA2_256_TRUNC254_PADDED: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA2_512")
  @js.native
  val SHA2_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_224")
  @js.native
  val SHA3_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_256")
  @js.native
  val SHA3_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_384")
  @js.native
  val SHA3_384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHA3_512")
  @js.native
  val SHA3_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHAKE_128")
  @js.native
  val SHAKE_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SHAKE_256")
  @js.native
  val SHAKE_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1000")
  @js.native
  val SKEIN1024_1000: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1008")
  @js.native
  val SKEIN1024_1008: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1016")
  @js.native
  val SKEIN1024_1016: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_1024")
  @js.native
  val SKEIN1024_1024: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_104")
  @js.native
  val SKEIN1024_104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_112")
  @js.native
  val SKEIN1024_112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_120")
  @js.native
  val SKEIN1024_120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_128")
  @js.native
  val SKEIN1024_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_136")
  @js.native
  val SKEIN1024_136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_144")
  @js.native
  val SKEIN1024_144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_152")
  @js.native
  val SKEIN1024_152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_16")
  @js.native
  val SKEIN1024_16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_160")
  @js.native
  val SKEIN1024_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_168")
  @js.native
  val SKEIN1024_168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_176")
  @js.native
  val SKEIN1024_176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_184")
  @js.native
  val SKEIN1024_184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_192")
  @js.native
  val SKEIN1024_192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_200")
  @js.native
  val SKEIN1024_200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_208")
  @js.native
  val SKEIN1024_208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_216")
  @js.native
  val SKEIN1024_216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_224")
  @js.native
  val SKEIN1024_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_232")
  @js.native
  val SKEIN1024_232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_24")
  @js.native
  val SKEIN1024_24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_240")
  @js.native
  val SKEIN1024_240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_248")
  @js.native
  val SKEIN1024_248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_256")
  @js.native
  val SKEIN1024_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_264")
  @js.native
  val SKEIN1024_264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_272")
  @js.native
  val SKEIN1024_272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_280")
  @js.native
  val SKEIN1024_280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_288")
  @js.native
  val SKEIN1024_288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_296")
  @js.native
  val SKEIN1024_296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_304")
  @js.native
  val SKEIN1024_304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_312")
  @js.native
  val SKEIN1024_312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_32")
  @js.native
  val SKEIN1024_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_320")
  @js.native
  val SKEIN1024_320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_328")
  @js.native
  val SKEIN1024_328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_336")
  @js.native
  val SKEIN1024_336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_344")
  @js.native
  val SKEIN1024_344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_352")
  @js.native
  val SKEIN1024_352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_360")
  @js.native
  val SKEIN1024_360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_368")
  @js.native
  val SKEIN1024_368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_376")
  @js.native
  val SKEIN1024_376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_384")
  @js.native
  val SKEIN1024_384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_392")
  @js.native
  val SKEIN1024_392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_40")
  @js.native
  val SKEIN1024_40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_400")
  @js.native
  val SKEIN1024_400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_408")
  @js.native
  val SKEIN1024_408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_416")
  @js.native
  val SKEIN1024_416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_424")
  @js.native
  val SKEIN1024_424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_432")
  @js.native
  val SKEIN1024_432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_440")
  @js.native
  val SKEIN1024_440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_448")
  @js.native
  val SKEIN1024_448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_456")
  @js.native
  val SKEIN1024_456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_464")
  @js.native
  val SKEIN1024_464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_472")
  @js.native
  val SKEIN1024_472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_48")
  @js.native
  val SKEIN1024_48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_480")
  @js.native
  val SKEIN1024_480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_488")
  @js.native
  val SKEIN1024_488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_496")
  @js.native
  val SKEIN1024_496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_504")
  @js.native
  val SKEIN1024_504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_512")
  @js.native
  val SKEIN1024_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_520")
  @js.native
  val SKEIN1024_520: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_528")
  @js.native
  val SKEIN1024_528: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_536")
  @js.native
  val SKEIN1024_536: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_544")
  @js.native
  val SKEIN1024_544: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_552")
  @js.native
  val SKEIN1024_552: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_56")
  @js.native
  val SKEIN1024_56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_560")
  @js.native
  val SKEIN1024_560: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_568")
  @js.native
  val SKEIN1024_568: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_576")
  @js.native
  val SKEIN1024_576: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_584")
  @js.native
  val SKEIN1024_584: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_592")
  @js.native
  val SKEIN1024_592: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_600")
  @js.native
  val SKEIN1024_600: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_608")
  @js.native
  val SKEIN1024_608: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_616")
  @js.native
  val SKEIN1024_616: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_624")
  @js.native
  val SKEIN1024_624: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_632")
  @js.native
  val SKEIN1024_632: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_64")
  @js.native
  val SKEIN1024_64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_640")
  @js.native
  val SKEIN1024_640: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_648")
  @js.native
  val SKEIN1024_648: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_656")
  @js.native
  val SKEIN1024_656: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_664")
  @js.native
  val SKEIN1024_664: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_672")
  @js.native
  val SKEIN1024_672: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_680")
  @js.native
  val SKEIN1024_680: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_688")
  @js.native
  val SKEIN1024_688: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_696")
  @js.native
  val SKEIN1024_696: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_704")
  @js.native
  val SKEIN1024_704: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_712")
  @js.native
  val SKEIN1024_712: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_72")
  @js.native
  val SKEIN1024_72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_720")
  @js.native
  val SKEIN1024_720: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_728")
  @js.native
  val SKEIN1024_728: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_736")
  @js.native
  val SKEIN1024_736: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_744")
  @js.native
  val SKEIN1024_744: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_752")
  @js.native
  val SKEIN1024_752: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_760")
  @js.native
  val SKEIN1024_760: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_768")
  @js.native
  val SKEIN1024_768: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_776")
  @js.native
  val SKEIN1024_776: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_784")
  @js.native
  val SKEIN1024_784: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_792")
  @js.native
  val SKEIN1024_792: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_8")
  @js.native
  val SKEIN1024_8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_80")
  @js.native
  val SKEIN1024_80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_800")
  @js.native
  val SKEIN1024_800: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_808")
  @js.native
  val SKEIN1024_808: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_816")
  @js.native
  val SKEIN1024_816: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_824")
  @js.native
  val SKEIN1024_824: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_832")
  @js.native
  val SKEIN1024_832: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_840")
  @js.native
  val SKEIN1024_840: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_848")
  @js.native
  val SKEIN1024_848: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_856")
  @js.native
  val SKEIN1024_856: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_864")
  @js.native
  val SKEIN1024_864: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_872")
  @js.native
  val SKEIN1024_872: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_88")
  @js.native
  val SKEIN1024_88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_880")
  @js.native
  val SKEIN1024_880: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_888")
  @js.native
  val SKEIN1024_888: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_896")
  @js.native
  val SKEIN1024_896: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_904")
  @js.native
  val SKEIN1024_904: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_912")
  @js.native
  val SKEIN1024_912: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_920")
  @js.native
  val SKEIN1024_920: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_928")
  @js.native
  val SKEIN1024_928: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_936")
  @js.native
  val SKEIN1024_936: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_944")
  @js.native
  val SKEIN1024_944: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_952")
  @js.native
  val SKEIN1024_952: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_96")
  @js.native
  val SKEIN1024_96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_960")
  @js.native
  val SKEIN1024_960: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_968")
  @js.native
  val SKEIN1024_968: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_976")
  @js.native
  val SKEIN1024_976: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_984")
  @js.native
  val SKEIN1024_984: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN1024_992")
  @js.native
  val SKEIN1024_992: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_104")
  @js.native
  val SKEIN256_104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_112")
  @js.native
  val SKEIN256_112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_120")
  @js.native
  val SKEIN256_120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_128")
  @js.native
  val SKEIN256_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_136")
  @js.native
  val SKEIN256_136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_144")
  @js.native
  val SKEIN256_144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_152")
  @js.native
  val SKEIN256_152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_16")
  @js.native
  val SKEIN256_16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_160")
  @js.native
  val SKEIN256_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_168")
  @js.native
  val SKEIN256_168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_176")
  @js.native
  val SKEIN256_176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_184")
  @js.native
  val SKEIN256_184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_192")
  @js.native
  val SKEIN256_192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_200")
  @js.native
  val SKEIN256_200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_208")
  @js.native
  val SKEIN256_208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_216")
  @js.native
  val SKEIN256_216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_224")
  @js.native
  val SKEIN256_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_232")
  @js.native
  val SKEIN256_232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_24")
  @js.native
  val SKEIN256_24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_240")
  @js.native
  val SKEIN256_240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_248")
  @js.native
  val SKEIN256_248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_256")
  @js.native
  val SKEIN256_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_32")
  @js.native
  val SKEIN256_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_40")
  @js.native
  val SKEIN256_40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_48")
  @js.native
  val SKEIN256_48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_56")
  @js.native
  val SKEIN256_56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_64")
  @js.native
  val SKEIN256_64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_72")
  @js.native
  val SKEIN256_72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_8")
  @js.native
  val SKEIN256_8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_80")
  @js.native
  val SKEIN256_80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_88")
  @js.native
  val SKEIN256_88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN256_96")
  @js.native
  val SKEIN256_96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_104")
  @js.native
  val SKEIN512_104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_112")
  @js.native
  val SKEIN512_112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_120")
  @js.native
  val SKEIN512_120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_128")
  @js.native
  val SKEIN512_128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_136")
  @js.native
  val SKEIN512_136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_144")
  @js.native
  val SKEIN512_144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_152")
  @js.native
  val SKEIN512_152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_16")
  @js.native
  val SKEIN512_16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_160")
  @js.native
  val SKEIN512_160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_168")
  @js.native
  val SKEIN512_168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_176")
  @js.native
  val SKEIN512_176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_184")
  @js.native
  val SKEIN512_184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_192")
  @js.native
  val SKEIN512_192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_200")
  @js.native
  val SKEIN512_200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_208")
  @js.native
  val SKEIN512_208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_216")
  @js.native
  val SKEIN512_216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_224")
  @js.native
  val SKEIN512_224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_232")
  @js.native
  val SKEIN512_232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_24")
  @js.native
  val SKEIN512_24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_240")
  @js.native
  val SKEIN512_240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_248")
  @js.native
  val SKEIN512_248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_256")
  @js.native
  val SKEIN512_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_264")
  @js.native
  val SKEIN512_264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_272")
  @js.native
  val SKEIN512_272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_280")
  @js.native
  val SKEIN512_280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_288")
  @js.native
  val SKEIN512_288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_296")
  @js.native
  val SKEIN512_296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_304")
  @js.native
  val SKEIN512_304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_312")
  @js.native
  val SKEIN512_312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_32")
  @js.native
  val SKEIN512_32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_320")
  @js.native
  val SKEIN512_320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_328")
  @js.native
  val SKEIN512_328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_336")
  @js.native
  val SKEIN512_336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_344")
  @js.native
  val SKEIN512_344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_352")
  @js.native
  val SKEIN512_352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_360")
  @js.native
  val SKEIN512_360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_368")
  @js.native
  val SKEIN512_368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_376")
  @js.native
  val SKEIN512_376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_384")
  @js.native
  val SKEIN512_384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_392")
  @js.native
  val SKEIN512_392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_40")
  @js.native
  val SKEIN512_40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_400")
  @js.native
  val SKEIN512_400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_408")
  @js.native
  val SKEIN512_408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_416")
  @js.native
  val SKEIN512_416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_424")
  @js.native
  val SKEIN512_424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_432")
  @js.native
  val SKEIN512_432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_440")
  @js.native
  val SKEIN512_440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_448")
  @js.native
  val SKEIN512_448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_456")
  @js.native
  val SKEIN512_456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_464")
  @js.native
  val SKEIN512_464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_472")
  @js.native
  val SKEIN512_472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_48")
  @js.native
  val SKEIN512_48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_480")
  @js.native
  val SKEIN512_480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_488")
  @js.native
  val SKEIN512_488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_496")
  @js.native
  val SKEIN512_496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_504")
  @js.native
  val SKEIN512_504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_512")
  @js.native
  val SKEIN512_512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_56")
  @js.native
  val SKEIN512_56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_64")
  @js.native
  val SKEIN512_64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_72")
  @js.native
  val SKEIN512_72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_8")
  @js.native
  val SKEIN512_8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_80")
  @js.native
  val SKEIN512_80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_88")
  @js.native
  val SKEIN512_88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKEIN512_96")
  @js.native
  val SKEIN512_96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SKYNET_NS")
  @js.native
  val SKYNET_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SM3_256")
  @js.native
  val SM3_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STELLAR_BLOCK")
  @js.native
  val STELLAR_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STELLAR_TX")
  @js.native
  val STELLAR_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "STREAMID")
  @js.native
  val STREAMID: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_FEED")
  @js.native
  val SWARM_FEED: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_MANIFEST")
  @js.native
  val SWARM_MANIFEST: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWARM_NS")
  @js.native
  val SWARM_NS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "SWHID_1_SNP")
  @js.native
  val SWHID_1_SNP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TCP")
  @js.native
  val TCP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "THREAD")
  @js.native
  val THREAD: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TLS")
  @js.native
  val TLS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TORRENT_FILE")
  @js.native
  val TORRENT_FILE: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "TORRENT_INFO")
  @js.native
  val TORRENT_INFO: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UDP")
  @js.native
  val UDP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UDT")
  @js.native
  val UDT: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UNIX")
  @js.native
  val UNIX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "UTP")
  @js.native
  val UTP: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "WS")
  @js.native
  val WS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "WSS")
  @js.native
  val WSS: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X11")
  @js.native
  val X11: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X25519_PRIV")
  @js.native
  val X25519_PRIV: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X25519_PUB")
  @js.native
  val X25519_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "X448_PUB")
  @js.native
  val X448_PUB: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZCASH_BLOCK")
  @js.native
  val ZCASH_BLOCK: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZCASH_TX")
  @js.native
  val ZCASH_TX: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZERONET")
  @js.native
  val ZERONET: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  @JSImport("multicodec", "ZEROXCERT_IMPRINT_256")
  @js.native
  val ZEROXCERT_IMPRINT_256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  
  inline def addPrefix(multicodecStrOrCode: js.typedarray.Uint8Array, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(multicodecStrOrCode.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def addPrefix(multicodecStrOrCode: CodecName, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("addPrefix")(multicodecStrOrCode.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("multicodec", "codeToName")
  @js.native
  val codeToName: CodeNameMap = js.native
  
  inline def getCode(prefixedData: js.typedarray.Uint8Array): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeFromData(prefixedData: js.typedarray.Uint8Array): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeFromData")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeFromName(name: CodecName): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeFromName")(name.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getCodeVarint(name: CodecName): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeVarint")(name.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getCodec(prefixedData: js.typedarray.Uint8Array): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodec")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getName(codec: CodecCode): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getName")(codec.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNameFromCode(codec: CodecCode): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromCode")(codec.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNameFromData(prefixedData: js.typedarray.Uint8Array): CodecName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromData")(prefixedData.asInstanceOf[js.Any]).asInstanceOf[CodecName]
  
  inline def getNumber(name: CodecName): CodecCode = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(name.asInstanceOf[js.Any]).asInstanceOf[CodecCode]
  
  inline def getVarint(code: CodecCode): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarint")(code.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def getVarintFromCode(code: CodecCode): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarintFromCode")(code.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def getVarintFromName(name: CodecName): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getVarintFromName")(name.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /* Inlined std.Readonly<std.Record<multicodec.multicodec/dist/src/generated-types.CodecName, multicodec.multicodec/dist/src/generated-types.CodecCode>> */
  object nameToCode {
    
    @JSImport("multicodec", "nameToCode.arweave-ns")
    @js.native
    val arweaveNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bencode")
    @js.native
    val bencode: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-block")
    @js.native
    val bitcoinBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-tx")
    @js.native
    val bitcoinTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bitcoin-witness-commitment")
    @js.native
    val bitcoinWitnessCommitment: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-104")
    @js.native
    val blake2b104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-112")
    @js.native
    val blake2b112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-120")
    @js.native
    val blake2b120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-128")
    @js.native
    val blake2b128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-136")
    @js.native
    val blake2b136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-144")
    @js.native
    val blake2b144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-152")
    @js.native
    val blake2b152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-16")
    @js.native
    val blake2b16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-160")
    @js.native
    val blake2b160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-168")
    @js.native
    val blake2b168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-176")
    @js.native
    val blake2b176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-184")
    @js.native
    val blake2b184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-192")
    @js.native
    val blake2b192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-200")
    @js.native
    val blake2b200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-208")
    @js.native
    val blake2b208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-216")
    @js.native
    val blake2b216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-224")
    @js.native
    val blake2b224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-232")
    @js.native
    val blake2b232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-24")
    @js.native
    val blake2b24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-240")
    @js.native
    val blake2b240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-248")
    @js.native
    val blake2b248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-256")
    @js.native
    val blake2b256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-264")
    @js.native
    val blake2b264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-272")
    @js.native
    val blake2b272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-280")
    @js.native
    val blake2b280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-288")
    @js.native
    val blake2b288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-296")
    @js.native
    val blake2b296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-304")
    @js.native
    val blake2b304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-312")
    @js.native
    val blake2b312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-32")
    @js.native
    val blake2b32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-320")
    @js.native
    val blake2b320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-328")
    @js.native
    val blake2b328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-336")
    @js.native
    val blake2b336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-344")
    @js.native
    val blake2b344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-352")
    @js.native
    val blake2b352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-360")
    @js.native
    val blake2b360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-368")
    @js.native
    val blake2b368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-376")
    @js.native
    val blake2b376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-384")
    @js.native
    val blake2b384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-392")
    @js.native
    val blake2b392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-40")
    @js.native
    val blake2b40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-400")
    @js.native
    val blake2b400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-408")
    @js.native
    val blake2b408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-416")
    @js.native
    val blake2b416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-424")
    @js.native
    val blake2b424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-432")
    @js.native
    val blake2b432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-440")
    @js.native
    val blake2b440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-448")
    @js.native
    val blake2b448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-456")
    @js.native
    val blake2b456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-464")
    @js.native
    val blake2b464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-472")
    @js.native
    val blake2b472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-48")
    @js.native
    val blake2b48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-480")
    @js.native
    val blake2b480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-488")
    @js.native
    val blake2b488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-496")
    @js.native
    val blake2b496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-504")
    @js.native
    val blake2b504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-512")
    @js.native
    val blake2b512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-56")
    @js.native
    val blake2b56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-64")
    @js.native
    val blake2b64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-72")
    @js.native
    val blake2b72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-8")
    @js.native
    val blake2b8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-80")
    @js.native
    val blake2b80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-88")
    @js.native
    val blake2b88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2b-96")
    @js.native
    val blake2b96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-104")
    @js.native
    val blake2s104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-112")
    @js.native
    val blake2s112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-120")
    @js.native
    val blake2s120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-128")
    @js.native
    val blake2s128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-136")
    @js.native
    val blake2s136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-144")
    @js.native
    val blake2s144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-152")
    @js.native
    val blake2s152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-16")
    @js.native
    val blake2s16: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-160")
    @js.native
    val blake2s160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-168")
    @js.native
    val blake2s168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-176")
    @js.native
    val blake2s176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-184")
    @js.native
    val blake2s184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-192")
    @js.native
    val blake2s192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-200")
    @js.native
    val blake2s200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-208")
    @js.native
    val blake2s208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-216")
    @js.native
    val blake2s216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-224")
    @js.native
    val blake2s224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-232")
    @js.native
    val blake2s232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-24")
    @js.native
    val blake2s24: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-240")
    @js.native
    val blake2s240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-248")
    @js.native
    val blake2s248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-256")
    @js.native
    val blake2s256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-32")
    @js.native
    val blake2s32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-40")
    @js.native
    val blake2s40: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-48")
    @js.native
    val blake2s48: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-56")
    @js.native
    val blake2s56: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-64")
    @js.native
    val blake2s64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-72")
    @js.native
    val blake2s72: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-8")
    @js.native
    val blake2s8: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-80")
    @js.native
    val blake2s80: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-88")
    @js.native
    val blake2s88: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake2s-96")
    @js.native
    val blake2s96: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.blake3")
    @js.native
    val blake3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g1-pub")
    @js.native
    val bls12381G1Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g1g2-pub")
    @js.native
    val bls12381G1g2Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bls12_381-g2-pub")
    @js.native
    val bls12381G2Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.bmt")
    @js.native
    val bmt: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.caip-50")
    @js.native
    val caip50: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.car-index-sorted")
    @js.native
    val carIndexSorted: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cbor")
    @js.native
    val cbor: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv1")
    @js.native
    val cidv1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv2")
    @js.native
    val cidv2: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.cidv3")
    @js.native
    val cidv3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-cbor")
    @js.native
    val dagCbor: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-cose")
    @js.native
    val dagCose: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-jose")
    @js.native
    val dagJose: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-json")
    @js.native
    val dagJson: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dag-pb")
    @js.native
    val dagPb: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dash-block")
    @js.native
    val dashBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dash-tx")
    @js.native
    val dashTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dbl-sha2-256")
    @js.native
    val dblSha2256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dccp")
    @js.native
    val dccp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.decred-block")
    @js.native
    val decredBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.decred-tx")
    @js.native
    val decredTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns")
    @js.native
    val dns: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns4")
    @js.native
    val dns4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dns6")
    @js.native
    val dns6: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.dnsaddr")
    @js.native
    val dnsaddr: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed25519-priv")
    @js.native
    val ed25519Priv: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed25519-pub")
    @js.native
    val ed25519Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ed448-pub")
    @js.native
    val ed448Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-account-snapshot")
    @js.native
    val ethAccountSnapshot: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-block")
    @js.native
    val ethBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-block-list")
    @js.native
    val ethBlockList: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-receipt-log-trie")
    @js.native
    val ethReceiptLogTrie: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-reciept-log")
    @js.native
    val ethRecieptLog: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-state-trie")
    @js.native
    val ethStateTrie: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-storage-trie")
    @js.native
    val ethStorageTrie: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx")
    @js.native
    val ethTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-receipt")
    @js.native
    val ethTxReceipt: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-receipt-trie")
    @js.native
    val ethTxReceiptTrie: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.eth-tx-trie")
    @js.native
    val ethTxTrie: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.fil-commitment-sealed")
    @js.native
    val filCommitmentSealed: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.fil-commitment-unsealed")
    @js.native
    val filCommitmentUnsealed: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.garlic32")
    @js.native
    val garlic32: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.garlic64")
    @js.native
    val garlic64: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.git-raw")
    @js.native
    val gitRaw: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-adr-v0")
    @js.native
    val holochainAdrV0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-adr-v1")
    @js.native
    val holochainAdrV1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-key-v0")
    @js.native
    val holochainKeyV0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-key-v1")
    @js.native
    val holochainKeyV1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-sig-v0")
    @js.native
    val holochainSigV0: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.holochain-sig-v1")
    @js.native
    val holochainSigV1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.http")
    @js.native
    val http: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.https")
    @js.native
    val https: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.identity")
    @js.native
    val identity: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip4")
    @js.native
    val ip4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip6")
    @js.native
    val ip6: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ip6zone")
    @js.native
    val ip6zone: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipfs")
    @js.native
    val ipfs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipfs-ns")
    @js.native
    val ipfsNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipld-ns")
    @js.native
    val ipldNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ipns-ns")
    @js.native
    val ipnsNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.json")
    @js.native
    val json: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.kangarootwelve")
    @js.native
    val kangarootwelve: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-224")
    @js.native
    val keccak224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-256")
    @js.native
    val keccak256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-384")
    @js.native
    val keccak384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.keccak-512")
    @js.native
    val keccak512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-block")
    @js.native
    val leofcoinBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-pr")
    @js.native
    val leofcoinPr: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.leofcoin-tx")
    @js.native
    val leofcoinTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-key")
    @js.native
    val libp2pKey: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-peer-record")
    @js.native
    val libp2pPeerRecord: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.libp2p-relay-rsvp")
    @js.native
    val libp2pRelayRsvp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.md4")
    @js.native
    val md4: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.md5")
    @js.native
    val md5: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.messagepack")
    @js.native
    val messagepack: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multiaddr")
    @js.native
    val multiaddr: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multibase")
    @js.native
    val multibase: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multicodec")
    @js.native
    val multicodec: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.multihash")
    @js.native
    val multihash: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.murmur3-128")
    @js.native
    val murmur3128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.murmur3-32")
    @js.native
    val murmur332: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.noise")
    @js.native
    val noise: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.onion")
    @js.native
    val onion: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.onion3")
    @js.native
    val onion3: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p256-pub")
    @js.native
    val p256Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p")
    @js.native
    val p2p: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-circuit")
    @js.native
    val p2pCircuit: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-stardust")
    @js.native
    val p2pStardust: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-webrtc-direct")
    @js.native
    val p2pWebrtcDirect: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-webrtc-star")
    @js.native
    val p2pWebrtcStar: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p2p-websocket-star")
    @js.native
    val p2pWebsocketStar: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p384-pub")
    @js.native
    val p384Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.p521-pub")
    @js.native
    val p521Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.path")
    @js.native
    val path: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.poseidon-bls12_381-a2-fc1")
    @js.native
    val poseidonBls12381A2Fc1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.poseidon-bls12_381-a2-fc1-sc")
    @js.native
    val poseidonBls12381A2Fc1Sc: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.protobuf")
    @js.native
    val protobuf: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.quic")
    @js.native
    val quic: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.raw")
    @js.native
    val raw: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-128")
    @js.native
    val ripemd128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-160")
    @js.native
    val ripemd160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-256")
    @js.native
    val ripemd256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ripemd-320")
    @js.native
    val ripemd320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.rlp")
    @js.native
    val rlp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sctp")
    @js.native
    val sctp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.secp256k1-priv")
    @js.native
    val secp256k1Priv: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.secp256k1-pub")
    @js.native
    val secp256k1Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha1")
    @js.native
    val sha1: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-256")
    @js.native
    val sha2256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-256-trunc254-padded")
    @js.native
    val sha2256Trunc254Padded: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha2-512")
    @js.native
    val sha2512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-224")
    @js.native
    val sha3224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-256")
    @js.native
    val sha3256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-384")
    @js.native
    val sha3384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sha3-512")
    @js.native
    val sha3512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.shake-128")
    @js.native
    val shake128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.shake-256")
    @js.native
    val shake256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1000")
    @js.native
    val skein10241000: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1008")
    @js.native
    val skein10241008: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1016")
    @js.native
    val skein10241016: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-1024")
    @js.native
    val skein10241024: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-104")
    @js.native
    val skein1024104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-112")
    @js.native
    val skein1024112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-120")
    @js.native
    val skein1024120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-128")
    @js.native
    val skein1024128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-136")
    @js.native
    val skein1024136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-144")
    @js.native
    val skein1024144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-152")
    @js.native
    val skein1024152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-16")
    @js.native
    val skein102416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-160")
    @js.native
    val skein1024160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-168")
    @js.native
    val skein1024168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-176")
    @js.native
    val skein1024176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-184")
    @js.native
    val skein1024184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-192")
    @js.native
    val skein1024192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-200")
    @js.native
    val skein1024200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-208")
    @js.native
    val skein1024208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-216")
    @js.native
    val skein1024216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-224")
    @js.native
    val skein1024224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-232")
    @js.native
    val skein1024232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-24")
    @js.native
    val skein102424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-240")
    @js.native
    val skein1024240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-248")
    @js.native
    val skein1024248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-256")
    @js.native
    val skein1024256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-264")
    @js.native
    val skein1024264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-272")
    @js.native
    val skein1024272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-280")
    @js.native
    val skein1024280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-288")
    @js.native
    val skein1024288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-296")
    @js.native
    val skein1024296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-304")
    @js.native
    val skein1024304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-312")
    @js.native
    val skein1024312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-32")
    @js.native
    val skein102432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-320")
    @js.native
    val skein1024320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-328")
    @js.native
    val skein1024328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-336")
    @js.native
    val skein1024336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-344")
    @js.native
    val skein1024344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-352")
    @js.native
    val skein1024352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-360")
    @js.native
    val skein1024360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-368")
    @js.native
    val skein1024368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-376")
    @js.native
    val skein1024376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-384")
    @js.native
    val skein1024384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-392")
    @js.native
    val skein1024392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-40")
    @js.native
    val skein102440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-400")
    @js.native
    val skein1024400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-408")
    @js.native
    val skein1024408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-416")
    @js.native
    val skein1024416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-424")
    @js.native
    val skein1024424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-432")
    @js.native
    val skein1024432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-440")
    @js.native
    val skein1024440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-448")
    @js.native
    val skein1024448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-456")
    @js.native
    val skein1024456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-464")
    @js.native
    val skein1024464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-472")
    @js.native
    val skein1024472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-48")
    @js.native
    val skein102448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-480")
    @js.native
    val skein1024480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-488")
    @js.native
    val skein1024488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-496")
    @js.native
    val skein1024496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-504")
    @js.native
    val skein1024504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-512")
    @js.native
    val skein1024512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-520")
    @js.native
    val skein1024520: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-528")
    @js.native
    val skein1024528: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-536")
    @js.native
    val skein1024536: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-544")
    @js.native
    val skein1024544: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-552")
    @js.native
    val skein1024552: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-56")
    @js.native
    val skein102456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-560")
    @js.native
    val skein1024560: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-568")
    @js.native
    val skein1024568: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-576")
    @js.native
    val skein1024576: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-584")
    @js.native
    val skein1024584: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-592")
    @js.native
    val skein1024592: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-600")
    @js.native
    val skein1024600: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-608")
    @js.native
    val skein1024608: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-616")
    @js.native
    val skein1024616: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-624")
    @js.native
    val skein1024624: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-632")
    @js.native
    val skein1024632: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-64")
    @js.native
    val skein102464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-640")
    @js.native
    val skein1024640: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-648")
    @js.native
    val skein1024648: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-656")
    @js.native
    val skein1024656: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-664")
    @js.native
    val skein1024664: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-672")
    @js.native
    val skein1024672: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-680")
    @js.native
    val skein1024680: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-688")
    @js.native
    val skein1024688: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-696")
    @js.native
    val skein1024696: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-704")
    @js.native
    val skein1024704: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-712")
    @js.native
    val skein1024712: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-72")
    @js.native
    val skein102472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-720")
    @js.native
    val skein1024720: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-728")
    @js.native
    val skein1024728: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-736")
    @js.native
    val skein1024736: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-744")
    @js.native
    val skein1024744: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-752")
    @js.native
    val skein1024752: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-760")
    @js.native
    val skein1024760: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-768")
    @js.native
    val skein1024768: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-776")
    @js.native
    val skein1024776: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-784")
    @js.native
    val skein1024784: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-792")
    @js.native
    val skein1024792: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-8")
    @js.native
    val skein10248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-80")
    @js.native
    val skein102480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-800")
    @js.native
    val skein1024800: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-808")
    @js.native
    val skein1024808: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-816")
    @js.native
    val skein1024816: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-824")
    @js.native
    val skein1024824: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-832")
    @js.native
    val skein1024832: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-840")
    @js.native
    val skein1024840: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-848")
    @js.native
    val skein1024848: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-856")
    @js.native
    val skein1024856: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-864")
    @js.native
    val skein1024864: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-872")
    @js.native
    val skein1024872: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-88")
    @js.native
    val skein102488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-880")
    @js.native
    val skein1024880: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-888")
    @js.native
    val skein1024888: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-896")
    @js.native
    val skein1024896: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-904")
    @js.native
    val skein1024904: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-912")
    @js.native
    val skein1024912: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-920")
    @js.native
    val skein1024920: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-928")
    @js.native
    val skein1024928: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-936")
    @js.native
    val skein1024936: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-944")
    @js.native
    val skein1024944: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-952")
    @js.native
    val skein1024952: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-96")
    @js.native
    val skein102496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-960")
    @js.native
    val skein1024960: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-968")
    @js.native
    val skein1024968: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-976")
    @js.native
    val skein1024976: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-984")
    @js.native
    val skein1024984: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein1024-992")
    @js.native
    val skein1024992: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-104")
    @js.native
    val skein256104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-112")
    @js.native
    val skein256112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-120")
    @js.native
    val skein256120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-128")
    @js.native
    val skein256128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-136")
    @js.native
    val skein256136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-144")
    @js.native
    val skein256144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-152")
    @js.native
    val skein256152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-16")
    @js.native
    val skein25616: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-160")
    @js.native
    val skein256160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-168")
    @js.native
    val skein256168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-176")
    @js.native
    val skein256176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-184")
    @js.native
    val skein256184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-192")
    @js.native
    val skein256192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-200")
    @js.native
    val skein256200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-208")
    @js.native
    val skein256208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-216")
    @js.native
    val skein256216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-224")
    @js.native
    val skein256224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-232")
    @js.native
    val skein256232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-24")
    @js.native
    val skein25624: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-240")
    @js.native
    val skein256240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-248")
    @js.native
    val skein256248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-256")
    @js.native
    val skein256256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-32")
    @js.native
    val skein25632: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-40")
    @js.native
    val skein25640: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-48")
    @js.native
    val skein25648: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-56")
    @js.native
    val skein25656: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-64")
    @js.native
    val skein25664: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-72")
    @js.native
    val skein25672: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-8")
    @js.native
    val skein2568: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-80")
    @js.native
    val skein25680: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-88")
    @js.native
    val skein25688: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein256-96")
    @js.native
    val skein25696: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-104")
    @js.native
    val skein512104: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-112")
    @js.native
    val skein512112: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-120")
    @js.native
    val skein512120: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-128")
    @js.native
    val skein512128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-136")
    @js.native
    val skein512136: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-144")
    @js.native
    val skein512144: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-152")
    @js.native
    val skein512152: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-16")
    @js.native
    val skein51216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-160")
    @js.native
    val skein512160: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-168")
    @js.native
    val skein512168: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-176")
    @js.native
    val skein512176: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-184")
    @js.native
    val skein512184: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-192")
    @js.native
    val skein512192: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-200")
    @js.native
    val skein512200: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-208")
    @js.native
    val skein512208: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-216")
    @js.native
    val skein512216: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-224")
    @js.native
    val skein512224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-232")
    @js.native
    val skein512232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-24")
    @js.native
    val skein51224: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-240")
    @js.native
    val skein512240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-248")
    @js.native
    val skein512248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-256")
    @js.native
    val skein512256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-264")
    @js.native
    val skein512264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-272")
    @js.native
    val skein512272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-280")
    @js.native
    val skein512280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-288")
    @js.native
    val skein512288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-296")
    @js.native
    val skein512296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-304")
    @js.native
    val skein512304: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-312")
    @js.native
    val skein512312: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-32")
    @js.native
    val skein51232: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-320")
    @js.native
    val skein512320: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-328")
    @js.native
    val skein512328: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-336")
    @js.native
    val skein512336: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-344")
    @js.native
    val skein512344: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-352")
    @js.native
    val skein512352: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-360")
    @js.native
    val skein512360: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-368")
    @js.native
    val skein512368: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-376")
    @js.native
    val skein512376: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-384")
    @js.native
    val skein512384: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-392")
    @js.native
    val skein512392: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-40")
    @js.native
    val skein51240: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-400")
    @js.native
    val skein512400: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-408")
    @js.native
    val skein512408: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-416")
    @js.native
    val skein512416: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-424")
    @js.native
    val skein512424: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-432")
    @js.native
    val skein512432: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-440")
    @js.native
    val skein512440: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-448")
    @js.native
    val skein512448: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-456")
    @js.native
    val skein512456: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-464")
    @js.native
    val skein512464: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-472")
    @js.native
    val skein512472: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-48")
    @js.native
    val skein51248: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-480")
    @js.native
    val skein512480: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-488")
    @js.native
    val skein512488: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-496")
    @js.native
    val skein512496: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-504")
    @js.native
    val skein512504: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-512")
    @js.native
    val skein512512: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-56")
    @js.native
    val skein51256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-64")
    @js.native
    val skein51264: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-72")
    @js.native
    val skein51272: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-8")
    @js.native
    val skein5128: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-80")
    @js.native
    val skein51280: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-88")
    @js.native
    val skein51288: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skein512-96")
    @js.native
    val skein51296: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.skynet-ns")
    @js.native
    val skynetNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.sm3-256")
    @js.native
    val sm3256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.stellar-block")
    @js.native
    val stellarBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.stellar-tx")
    @js.native
    val stellarTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.streamid")
    @js.native
    val streamid: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-feed")
    @js.native
    val swarmFeed: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-manifest")
    @js.native
    val swarmManifest: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swarm-ns")
    @js.native
    val swarmNs: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.swhid-1-snp")
    @js.native
    val swhid1Snp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.tcp")
    @js.native
    val tcp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.thread")
    @js.native
    val thread: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.tls")
    @js.native
    val tls: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.torrent-file")
    @js.native
    val torrentFile: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.torrent-info")
    @js.native
    val torrentInfo: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.udp")
    @js.native
    val udp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.udt")
    @js.native
    val udt: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.unix")
    @js.native
    val unix: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.utp")
    @js.native
    val utp: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.ws")
    @js.native
    val ws: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.wss")
    @js.native
    val wss: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x11")
    @js.native
    val x11: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x25519-priv")
    @js.native
    val x25519Priv: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x25519-pub")
    @js.native
    val x25519Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.x448-pub")
    @js.native
    val x448Pub: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zcash-block")
    @js.native
    val zcashBlock: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zcash-tx")
    @js.native
    val zcashTx: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zeronet")
    @js.native
    val zeronet: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
    
    @JSImport("multicodec", "nameToCode.zeroxcert-imprint-256")
    @js.native
    val zeroxcertImprint256: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode = js.native
  }
  
  @JSImport("multicodec", "nameToVarint")
  @js.native
  val nameToVarint: NameUint8ArrayMap = js.native
  
  inline def rmPrefix(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("rmPrefix")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.multicodec.multicodecInts.`0`
    - typingsJapgolly.multicodec.multicodecInts.`1`
    - typingsJapgolly.multicodec.multicodecInts.`2`
    - typingsJapgolly.multicodec.multicodecInts.`3`
    - typingsJapgolly.multicodec.multicodecInts.`4`
    - typingsJapgolly.multicodec.multicodecInts.`6`
    - typingsJapgolly.multicodec.multicodecInts.`17`
    - typingsJapgolly.multicodec.multicodecInts.`18`
    - typingsJapgolly.multicodec.multicodecInts.`19`
    - typingsJapgolly.multicodec.multicodecInts.`20`
    - typingsJapgolly.multicodec.multicodecInts.`21`
    - typingsJapgolly.multicodec.multicodecInts.`22`
    - typingsJapgolly.multicodec.multicodecInts.`23`
    - typingsJapgolly.multicodec.multicodecInts.`24`
    - typingsJapgolly.multicodec.multicodecInts.`25`
    - typingsJapgolly.multicodec.multicodecInts.`26`
    - typingsJapgolly.multicodec.multicodecInts.`27`
    - typingsJapgolly.multicodec.multicodecInts.`28`
    - typingsJapgolly.multicodec.multicodecInts.`29`
    - typingsJapgolly.multicodec.multicodecInts.`30`
    - typingsJapgolly.multicodec.multicodecInts.`33`
    - typingsJapgolly.multicodec.multicodecInts.`34`
    - typingsJapgolly.multicodec.multicodecInts.`35`
    - typingsJapgolly.multicodec.multicodecInts.`41`
    - typingsJapgolly.multicodec.multicodecInts.`42`
    - typingsJapgolly.multicodec.multicodecInts.`47`
    - typingsJapgolly.multicodec.multicodecInts.`48`
    - typingsJapgolly.multicodec.multicodecInts.`49`
    - typingsJapgolly.multicodec.multicodecInts.`50`
    - typingsJapgolly.multicodec.multicodecInts.`51`
    - typingsJapgolly.multicodec.multicodecInts.`53`
    - typingsJapgolly.multicodec.multicodecInts.`54`
    - typingsJapgolly.multicodec.multicodecInts.`55`
    - typingsJapgolly.multicodec.multicodecInts.`56`
    - typingsJapgolly.multicodec.multicodecInts.`80`
    - typingsJapgolly.multicodec.multicodecInts.`81`
    - typingsJapgolly.multicodec.multicodecInts.`85`
    - typingsJapgolly.multicodec.multicodecInts.`86`
    - typingsJapgolly.multicodec.multicodecInts.`96`
    - typingsJapgolly.multicodec.multicodecInts.`99`
    - typingsJapgolly.multicodec.multicodecInts.`112`
    - typingsJapgolly.multicodec.multicodecInts.`113`
    - typingsJapgolly.multicodec.multicodecInts.`114`
    - typingsJapgolly.multicodec.multicodecInts.`120`
    - typingsJapgolly.multicodec.multicodecInts.`123`
    - typingsJapgolly.multicodec.multicodecInts.`124`
    - typingsJapgolly.multicodec.multicodecInts.`129`
    - typingsJapgolly.multicodec.multicodecInts.`130`
    - typingsJapgolly.multicodec.multicodecInts.`131`
    - typingsJapgolly.multicodec.multicodecInts.`132`
    - typingsJapgolly.multicodec.multicodecInts.`133`
    - typingsJapgolly.multicodec.multicodecInts.`134`
    - typingsJapgolly.multicodec.multicodecInts.`144`
    - typingsJapgolly.multicodec.multicodecInts.`145`
    - typingsJapgolly.multicodec.multicodecInts.`146`
    - typingsJapgolly.multicodec.multicodecInts.`147`
    - typingsJapgolly.multicodec.multicodecInts.`148`
    - typingsJapgolly.multicodec.multicodecInts.`149`
    - typingsJapgolly.multicodec.multicodecInts.`150`
    - typingsJapgolly.multicodec.multicodecInts.`151`
    - typingsJapgolly.multicodec.multicodecInts.`152`
    - typingsJapgolly.multicodec.multicodecInts.`153`
    - typingsJapgolly.multicodec.multicodecInts.`154`
    - typingsJapgolly.multicodec.multicodecInts.`176`
    - typingsJapgolly.multicodec.multicodecInts.`177`
    - typingsJapgolly.multicodec.multicodecInts.`178`
    - typingsJapgolly.multicodec.multicodecInts.`192`
    - typingsJapgolly.multicodec.multicodecInts.`193`
    - typingsJapgolly.multicodec.multicodecInts.`202`
    - typingsJapgolly.multicodec.multicodecInts.`206`
    - typingsJapgolly.multicodec.multicodecInts.`208`
    - typingsJapgolly.multicodec.multicodecInts.`209`
    - typingsJapgolly.multicodec.multicodecInts.`212`
    - typingsJapgolly.multicodec.multicodecInts.`213`
    - typingsJapgolly.multicodec.multicodecInts.`214`
    - typingsJapgolly.multicodec.multicodecInts.`224`
    - typingsJapgolly.multicodec.multicodecInts.`225`
    - typingsJapgolly.multicodec.multicodecInts.`226`
    - typingsJapgolly.multicodec.multicodecInts.`227`
    - typingsJapgolly.multicodec.multicodecInts.`228`
    - typingsJapgolly.multicodec.multicodecInts.`229`
    - typingsJapgolly.multicodec.multicodecInts.`230`
    - typingsJapgolly.multicodec.multicodecInts.`231`
    - typingsJapgolly.multicodec.multicodecInts.`234`
    - typingsJapgolly.multicodec.multicodecInts.`235`
    - typingsJapgolly.multicodec.multicodecInts.`236`
    - typingsJapgolly.multicodec.multicodecInts.`237`
    - typingsJapgolly.multicodec.multicodecInts.`238`
    - typingsJapgolly.multicodec.multicodecInts.`240`
    - typingsJapgolly.multicodec.multicodecInts.`241`
    - typingsJapgolly.multicodec.multicodecInts.`250`
    - typingsJapgolly.multicodec.multicodecInts.`251`
    - typingsJapgolly.multicodec.multicodecInts.`273`
    - typingsJapgolly.multicodec.multicodecInts.`275`
    - typingsJapgolly.multicodec.multicodecInts.`276`
    - typingsJapgolly.multicodec.multicodecInts.`277`
    - typingsJapgolly.multicodec.multicodecInts.`290`
    - typingsJapgolly.multicodec.multicodecInts.`297`
    - typingsJapgolly.multicodec.multicodecInts.`301`
    - typingsJapgolly.multicodec.multicodecInts.`302`
    - typingsJapgolly.multicodec.multicodecInts.`400`
    - typingsJapgolly.multicodec.multicodecInts.`406`
    - typingsJapgolly.multicodec.multicodecInts.`421`
    - typingsJapgolly.multicodec.multicodecInts.`443`
    - typingsJapgolly.multicodec.multicodecInts.`444`
    - typingsJapgolly.multicodec.multicodecInts.`445`
    - typingsJapgolly.multicodec.multicodecInts.`446`
    - typingsJapgolly.multicodec.multicodecInts.`447`
    - typingsJapgolly.multicodec.multicodecInts.`448`
    - typingsJapgolly.multicodec.multicodecInts.`454`
    - typingsJapgolly.multicodec.multicodecInts.`460`
    - typingsJapgolly.multicodec.multicodecInts.`477`
    - typingsJapgolly.multicodec.multicodecInts.`478`
    - typingsJapgolly.multicodec.multicodecInts.`479`
    - typingsJapgolly.multicodec.multicodecInts.`480`
    - typingsJapgolly.multicodec.multicodecInts.`496`
    - typingsJapgolly.multicodec.multicodecInts.`512`
    - typingsJapgolly.multicodec.multicodecInts.`513`
    - typingsJapgolly.multicodec.multicodecInts.`769`
    - typingsJapgolly.multicodec.multicodecInts.`770`
    - typingsJapgolly.multicodec.multicodecInts.`1024`
    - typingsJapgolly.multicodec.multicodecInts.`4114`
    - typingsJapgolly.multicodec.multicodecInts.`4178`
    - typingsJapgolly.multicodec.multicodecInts.`4179`
    - typingsJapgolly.multicodec.multicodecInts.`4180`
    - typingsJapgolly.multicodec.multicodecInts.`4181`
    - typingsJapgolly.multicodec.multicodecInts.`4352`
    - typingsJapgolly.multicodec.multicodecInts.`4608`
    - typingsJapgolly.multicodec.multicodecInts.`4609`
    - typingsJapgolly.multicodec.multicodecInts.`4610`
    - typingsJapgolly.multicodec.multicodecInts.`4611`
    - typingsJapgolly.multicodec.multicodecInts.`4612`
    - typingsJapgolly.multicodec.multicodecInts.`4864`
    - typingsJapgolly.multicodec.multicodecInts.`4865`
    - typingsJapgolly.multicodec.multicodecInts.`4866`
    - typingsJapgolly.multicodec.multicodecInts.`7425`
    - typingsJapgolly.multicodec.multicodecInts.`21325`
    - typingsJapgolly.multicodec.multicodecInts.`45569`
    - typingsJapgolly.multicodec.multicodecInts.`45570`
    - typingsJapgolly.multicodec.multicodecInts.`45571`
    - typingsJapgolly.multicodec.multicodecInts.`45572`
    - typingsJapgolly.multicodec.multicodecInts.`45573`
    - typingsJapgolly.multicodec.multicodecInts.`45574`
    - typingsJapgolly.multicodec.multicodecInts.`45575`
    - typingsJapgolly.multicodec.multicodecInts.`45576`
    - typingsJapgolly.multicodec.multicodecInts.`45577`
    - typingsJapgolly.multicodec.multicodecInts.`45578`
    - typingsJapgolly.multicodec.multicodecInts.`45579`
    - typingsJapgolly.multicodec.multicodecInts.`45580`
    - typingsJapgolly.multicodec.multicodecInts.`45581`
    - typingsJapgolly.multicodec.multicodecInts.`45582`
    - typingsJapgolly.multicodec.multicodecInts.`45583`
    - typingsJapgolly.multicodec.multicodecInts.`45584`
    - typingsJapgolly.multicodec.multicodecInts.`45585`
    - typingsJapgolly.multicodec.multicodecInts.`45586`
    - typingsJapgolly.multicodec.multicodecInts.`45587`
    - typingsJapgolly.multicodec.multicodecInts.`45588`
    - typingsJapgolly.multicodec.multicodecInts.`45589`
    - typingsJapgolly.multicodec.multicodecInts.`45590`
    - typingsJapgolly.multicodec.multicodecInts.`45591`
    - typingsJapgolly.multicodec.multicodecInts.`45592`
    - typingsJapgolly.multicodec.multicodecInts.`45593`
    - typingsJapgolly.multicodec.multicodecInts.`45594`
    - typingsJapgolly.multicodec.multicodecInts.`45595`
    - typingsJapgolly.multicodec.multicodecInts.`45596`
    - typingsJapgolly.multicodec.multicodecInts.`45597`
    - typingsJapgolly.multicodec.multicodecInts.`45598`
    - typingsJapgolly.multicodec.multicodecInts.`45599`
    - typingsJapgolly.multicodec.multicodecInts.`45600`
    - typingsJapgolly.multicodec.multicodecInts.`45601`
    - typingsJapgolly.multicodec.multicodecInts.`45602`
    - typingsJapgolly.multicodec.multicodecInts.`45603`
    - typingsJapgolly.multicodec.multicodecInts.`45604`
    - typingsJapgolly.multicodec.multicodecInts.`45605`
    - typingsJapgolly.multicodec.multicodecInts.`45606`
    - typingsJapgolly.multicodec.multicodecInts.`45607`
    - typingsJapgolly.multicodec.multicodecInts.`45608`
    - typingsJapgolly.multicodec.multicodecInts.`45609`
    - typingsJapgolly.multicodec.multicodecInts.`45610`
    - typingsJapgolly.multicodec.multicodecInts.`45611`
    - typingsJapgolly.multicodec.multicodecInts.`45612`
    - typingsJapgolly.multicodec.multicodecInts.`45613`
    - typingsJapgolly.multicodec.multicodecInts.`45614`
    - typingsJapgolly.multicodec.multicodecInts.`45615`
    - typingsJapgolly.multicodec.multicodecInts.`45616`
    - typingsJapgolly.multicodec.multicodecInts.`45617`
    - typingsJapgolly.multicodec.multicodecInts.`45618`
    - typingsJapgolly.multicodec.multicodecInts.`45619`
    - typingsJapgolly.multicodec.multicodecInts.`45620`
    - typingsJapgolly.multicodec.multicodecInts.`45621`
    - typingsJapgolly.multicodec.multicodecInts.`45622`
    - typingsJapgolly.multicodec.multicodecInts.`45623`
    - typingsJapgolly.multicodec.multicodecInts.`45624`
    - typingsJapgolly.multicodec.multicodecInts.`45625`
    - typingsJapgolly.multicodec.multicodecInts.`45626`
    - typingsJapgolly.multicodec.multicodecInts.`45627`
    - typingsJapgolly.multicodec.multicodecInts.`45628`
    - typingsJapgolly.multicodec.multicodecInts.`45629`
    - typingsJapgolly.multicodec.multicodecInts.`45630`
    - typingsJapgolly.multicodec.multicodecInts.`45631`
    - typingsJapgolly.multicodec.multicodecInts.`45632`
    - typingsJapgolly.multicodec.multicodecInts.`45633`
    - typingsJapgolly.multicodec.multicodecInts.`45634`
    - typingsJapgolly.multicodec.multicodecInts.`45635`
    - typingsJapgolly.multicodec.multicodecInts.`45636`
    - typingsJapgolly.multicodec.multicodecInts.`45637`
    - typingsJapgolly.multicodec.multicodecInts.`45638`
    - typingsJapgolly.multicodec.multicodecInts.`45639`
    - typingsJapgolly.multicodec.multicodecInts.`45640`
    - typingsJapgolly.multicodec.multicodecInts.`45641`
    - typingsJapgolly.multicodec.multicodecInts.`45642`
    - typingsJapgolly.multicodec.multicodecInts.`45643`
    - typingsJapgolly.multicodec.multicodecInts.`45644`
    - typingsJapgolly.multicodec.multicodecInts.`45645`
    - typingsJapgolly.multicodec.multicodecInts.`45646`
    - typingsJapgolly.multicodec.multicodecInts.`45647`
    - typingsJapgolly.multicodec.multicodecInts.`45648`
    - typingsJapgolly.multicodec.multicodecInts.`45649`
    - typingsJapgolly.multicodec.multicodecInts.`45650`
    - typingsJapgolly.multicodec.multicodecInts.`45651`
    - typingsJapgolly.multicodec.multicodecInts.`45652`
    - typingsJapgolly.multicodec.multicodecInts.`45653`
    - typingsJapgolly.multicodec.multicodecInts.`45654`
    - typingsJapgolly.multicodec.multicodecInts.`45655`
    - typingsJapgolly.multicodec.multicodecInts.`45656`
    - typingsJapgolly.multicodec.multicodecInts.`45657`
    - typingsJapgolly.multicodec.multicodecInts.`45658`
    - typingsJapgolly.multicodec.multicodecInts.`45659`
    - typingsJapgolly.multicodec.multicodecInts.`45660`
    - typingsJapgolly.multicodec.multicodecInts.`45661`
    - typingsJapgolly.multicodec.multicodecInts.`45662`
    - typingsJapgolly.multicodec.multicodecInts.`45663`
    - typingsJapgolly.multicodec.multicodecInts.`45664`
    - typingsJapgolly.multicodec.multicodecInts.`45825`
    - typingsJapgolly.multicodec.multicodecInts.`45826`
    - typingsJapgolly.multicodec.multicodecInts.`45827`
    - typingsJapgolly.multicodec.multicodecInts.`45828`
    - typingsJapgolly.multicodec.multicodecInts.`45829`
    - typingsJapgolly.multicodec.multicodecInts.`45830`
    - typingsJapgolly.multicodec.multicodecInts.`45831`
    - typingsJapgolly.multicodec.multicodecInts.`45832`
    - typingsJapgolly.multicodec.multicodecInts.`45833`
    - typingsJapgolly.multicodec.multicodecInts.`45834`
    - typingsJapgolly.multicodec.multicodecInts.`45835`
    - typingsJapgolly.multicodec.multicodecInts.`45836`
    - typingsJapgolly.multicodec.multicodecInts.`45837`
    - typingsJapgolly.multicodec.multicodecInts.`45838`
    - typingsJapgolly.multicodec.multicodecInts.`45839`
    - typingsJapgolly.multicodec.multicodecInts.`45840`
    - typingsJapgolly.multicodec.multicodecInts.`45841`
    - typingsJapgolly.multicodec.multicodecInts.`45842`
    - typingsJapgolly.multicodec.multicodecInts.`45843`
    - typingsJapgolly.multicodec.multicodecInts.`45844`
    - typingsJapgolly.multicodec.multicodecInts.`45845`
    - typingsJapgolly.multicodec.multicodecInts.`45846`
    - typingsJapgolly.multicodec.multicodecInts.`45847`
    - typingsJapgolly.multicodec.multicodecInts.`45848`
    - typingsJapgolly.multicodec.multicodecInts.`45849`
    - typingsJapgolly.multicodec.multicodecInts.`45850`
    - typingsJapgolly.multicodec.multicodecInts.`45851`
    - typingsJapgolly.multicodec.multicodecInts.`45852`
    - typingsJapgolly.multicodec.multicodecInts.`45853`
    - typingsJapgolly.multicodec.multicodecInts.`45854`
    - typingsJapgolly.multicodec.multicodecInts.`45855`
    - typingsJapgolly.multicodec.multicodecInts.`45856`
    - typingsJapgolly.multicodec.multicodecInts.`45857`
    - typingsJapgolly.multicodec.multicodecInts.`45858`
    - typingsJapgolly.multicodec.multicodecInts.`45859`
    - typingsJapgolly.multicodec.multicodecInts.`45860`
    - typingsJapgolly.multicodec.multicodecInts.`45861`
    - typingsJapgolly.multicodec.multicodecInts.`45862`
    - typingsJapgolly.multicodec.multicodecInts.`45863`
    - typingsJapgolly.multicodec.multicodecInts.`45864`
    - typingsJapgolly.multicodec.multicodecInts.`45865`
    - typingsJapgolly.multicodec.multicodecInts.`45866`
    - typingsJapgolly.multicodec.multicodecInts.`45867`
    - typingsJapgolly.multicodec.multicodecInts.`45868`
    - typingsJapgolly.multicodec.multicodecInts.`45869`
    - typingsJapgolly.multicodec.multicodecInts.`45870`
    - typingsJapgolly.multicodec.multicodecInts.`45871`
    - typingsJapgolly.multicodec.multicodecInts.`45872`
    - typingsJapgolly.multicodec.multicodecInts.`45873`
    - typingsJapgolly.multicodec.multicodecInts.`45874`
    - typingsJapgolly.multicodec.multicodecInts.`45875`
    - typingsJapgolly.multicodec.multicodecInts.`45876`
    - typingsJapgolly.multicodec.multicodecInts.`45877`
    - typingsJapgolly.multicodec.multicodecInts.`45878`
    - typingsJapgolly.multicodec.multicodecInts.`45879`
    - typingsJapgolly.multicodec.multicodecInts.`45880`
    - typingsJapgolly.multicodec.multicodecInts.`45881`
    - typingsJapgolly.multicodec.multicodecInts.`45882`
    - typingsJapgolly.multicodec.multicodecInts.`45883`
    - typingsJapgolly.multicodec.multicodecInts.`45884`
    - typingsJapgolly.multicodec.multicodecInts.`45885`
    - typingsJapgolly.multicodec.multicodecInts.`45886`
    - typingsJapgolly.multicodec.multicodecInts.`45887`
    - typingsJapgolly.multicodec.multicodecInts.`45888`
    - typingsJapgolly.multicodec.multicodecInts.`45889`
    - typingsJapgolly.multicodec.multicodecInts.`45890`
    - typingsJapgolly.multicodec.multicodecInts.`45891`
    - typingsJapgolly.multicodec.multicodecInts.`45892`
    - typingsJapgolly.multicodec.multicodecInts.`45893`
    - typingsJapgolly.multicodec.multicodecInts.`45894`
    - typingsJapgolly.multicodec.multicodecInts.`45895`
    - typingsJapgolly.multicodec.multicodecInts.`45896`
    - typingsJapgolly.multicodec.multicodecInts.`45897`
    - typingsJapgolly.multicodec.multicodecInts.`45898`
    - typingsJapgolly.multicodec.multicodecInts.`45899`
    - typingsJapgolly.multicodec.multicodecInts.`45900`
    - typingsJapgolly.multicodec.multicodecInts.`45901`
    - typingsJapgolly.multicodec.multicodecInts.`45902`
    - typingsJapgolly.multicodec.multicodecInts.`45903`
    - typingsJapgolly.multicodec.multicodecInts.`45904`
    - typingsJapgolly.multicodec.multicodecInts.`45905`
    - typingsJapgolly.multicodec.multicodecInts.`45906`
    - typingsJapgolly.multicodec.multicodecInts.`45907`
    - typingsJapgolly.multicodec.multicodecInts.`45908`
    - typingsJapgolly.multicodec.multicodecInts.`45909`
    - typingsJapgolly.multicodec.multicodecInts.`45910`
    - typingsJapgolly.multicodec.multicodecInts.`45911`
    - typingsJapgolly.multicodec.multicodecInts.`45912`
    - typingsJapgolly.multicodec.multicodecInts.`45913`
    - typingsJapgolly.multicodec.multicodecInts.`45914`
    - typingsJapgolly.multicodec.multicodecInts.`45915`
    - typingsJapgolly.multicodec.multicodecInts.`45916`
    - typingsJapgolly.multicodec.multicodecInts.`45917`
    - typingsJapgolly.multicodec.multicodecInts.`45918`
    - typingsJapgolly.multicodec.multicodecInts.`45919`
    - typingsJapgolly.multicodec.multicodecInts.`45920`
    - typingsJapgolly.multicodec.multicodecInts.`45921`
    - typingsJapgolly.multicodec.multicodecInts.`45922`
    - typingsJapgolly.multicodec.multicodecInts.`45923`
    - typingsJapgolly.multicodec.multicodecInts.`45924`
    - typingsJapgolly.multicodec.multicodecInts.`45925`
    - typingsJapgolly.multicodec.multicodecInts.`45926`
    - typingsJapgolly.multicodec.multicodecInts.`45927`
    - typingsJapgolly.multicodec.multicodecInts.`45928`
    - typingsJapgolly.multicodec.multicodecInts.`45929`
    - typingsJapgolly.multicodec.multicodecInts.`45930`
    - typingsJapgolly.multicodec.multicodecInts.`45931`
    - typingsJapgolly.multicodec.multicodecInts.`45932`
    - typingsJapgolly.multicodec.multicodecInts.`45933`
    - typingsJapgolly.multicodec.multicodecInts.`45934`
    - typingsJapgolly.multicodec.multicodecInts.`45935`
    - typingsJapgolly.multicodec.multicodecInts.`45936`
    - typingsJapgolly.multicodec.multicodecInts.`45937`
    - typingsJapgolly.multicodec.multicodecInts.`45938`
    - typingsJapgolly.multicodec.multicodecInts.`45939`
    - typingsJapgolly.multicodec.multicodecInts.`45940`
    - typingsJapgolly.multicodec.multicodecInts.`45941`
    - typingsJapgolly.multicodec.multicodecInts.`45942`
    - typingsJapgolly.multicodec.multicodecInts.`45943`
    - typingsJapgolly.multicodec.multicodecInts.`45944`
    - typingsJapgolly.multicodec.multicodecInts.`45945`
    - typingsJapgolly.multicodec.multicodecInts.`45946`
    - typingsJapgolly.multicodec.multicodecInts.`45947`
    - typingsJapgolly.multicodec.multicodecInts.`45948`
    - typingsJapgolly.multicodec.multicodecInts.`45949`
    - typingsJapgolly.multicodec.multicodecInts.`45950`
    - typingsJapgolly.multicodec.multicodecInts.`45951`
    - typingsJapgolly.multicodec.multicodecInts.`45952`
    - typingsJapgolly.multicodec.multicodecInts.`45953`
    - typingsJapgolly.multicodec.multicodecInts.`45954`
    - typingsJapgolly.multicodec.multicodecInts.`45955`
    - typingsJapgolly.multicodec.multicodecInts.`45956`
    - typingsJapgolly.multicodec.multicodecInts.`45957`
    - typingsJapgolly.multicodec.multicodecInts.`45958`
    - typingsJapgolly.multicodec.multicodecInts.`45959`
    - typingsJapgolly.multicodec.multicodecInts.`45960`
    - typingsJapgolly.multicodec.multicodecInts.`45961`
    - typingsJapgolly.multicodec.multicodecInts.`45962`
    - typingsJapgolly.multicodec.multicodecInts.`45963`
    - typingsJapgolly.multicodec.multicodecInts.`45964`
    - typingsJapgolly.multicodec.multicodecInts.`45965`
    - typingsJapgolly.multicodec.multicodecInts.`45966`
    - typingsJapgolly.multicodec.multicodecInts.`45967`
    - typingsJapgolly.multicodec.multicodecInts.`45968`
    - typingsJapgolly.multicodec.multicodecInts.`45969`
    - typingsJapgolly.multicodec.multicodecInts.`45970`
    - typingsJapgolly.multicodec.multicodecInts.`45971`
    - typingsJapgolly.multicodec.multicodecInts.`45972`
    - typingsJapgolly.multicodec.multicodecInts.`45973`
    - typingsJapgolly.multicodec.multicodecInts.`45974`
    - typingsJapgolly.multicodec.multicodecInts.`45975`
    - typingsJapgolly.multicodec.multicodecInts.`45976`
    - typingsJapgolly.multicodec.multicodecInts.`45977`
    - typingsJapgolly.multicodec.multicodecInts.`45978`
    - typingsJapgolly.multicodec.multicodecInts.`45979`
    - typingsJapgolly.multicodec.multicodecInts.`45980`
    - typingsJapgolly.multicodec.multicodecInts.`45981`
    - typingsJapgolly.multicodec.multicodecInts.`45982`
    - typingsJapgolly.multicodec.multicodecInts.`45983`
    - typingsJapgolly.multicodec.multicodecInts.`45984`
    - typingsJapgolly.multicodec.multicodecInts.`45985`
    - typingsJapgolly.multicodec.multicodecInts.`45986`
    - typingsJapgolly.multicodec.multicodecInts.`45987`
    - typingsJapgolly.multicodec.multicodecInts.`45988`
    - typingsJapgolly.multicodec.multicodecInts.`45989`
    - typingsJapgolly.multicodec.multicodecInts.`45990`
    - typingsJapgolly.multicodec.multicodecInts.`45991`
    - typingsJapgolly.multicodec.multicodecInts.`45992`
    - typingsJapgolly.multicodec.multicodecInts.`45993`
    - typingsJapgolly.multicodec.multicodecInts.`45994`
    - typingsJapgolly.multicodec.multicodecInts.`45995`
    - typingsJapgolly.multicodec.multicodecInts.`45996`
    - typingsJapgolly.multicodec.multicodecInts.`45997`
    - typingsJapgolly.multicodec.multicodecInts.`45998`
    - typingsJapgolly.multicodec.multicodecInts.`45999`
    - typingsJapgolly.multicodec.multicodecInts.`46000`
    - typingsJapgolly.multicodec.multicodecInts.`46001`
    - typingsJapgolly.multicodec.multicodecInts.`46002`
    - typingsJapgolly.multicodec.multicodecInts.`46003`
    - typingsJapgolly.multicodec.multicodecInts.`46004`
    - typingsJapgolly.multicodec.multicodecInts.`46005`
    - typingsJapgolly.multicodec.multicodecInts.`46006`
    - typingsJapgolly.multicodec.multicodecInts.`46007`
    - typingsJapgolly.multicodec.multicodecInts.`46008`
    - typingsJapgolly.multicodec.multicodecInts.`46009`
    - typingsJapgolly.multicodec.multicodecInts.`46010`
    - typingsJapgolly.multicodec.multicodecInts.`46011`
    - typingsJapgolly.multicodec.multicodecInts.`46012`
    - typingsJapgolly.multicodec.multicodecInts.`46013`
    - typingsJapgolly.multicodec.multicodecInts.`46014`
    - typingsJapgolly.multicodec.multicodecInts.`46015`
    - typingsJapgolly.multicodec.multicodecInts.`46016`
    - typingsJapgolly.multicodec.multicodecInts.`46017`
    - typingsJapgolly.multicodec.multicodecInts.`46018`
    - typingsJapgolly.multicodec.multicodecInts.`46019`
    - typingsJapgolly.multicodec.multicodecInts.`46020`
    - typingsJapgolly.multicodec.multicodecInts.`46021`
    - typingsJapgolly.multicodec.multicodecInts.`46022`
    - typingsJapgolly.multicodec.multicodecInts.`46023`
    - typingsJapgolly.multicodec.multicodecInts.`46024`
    - typingsJapgolly.multicodec.multicodecInts.`46025`
    - typingsJapgolly.multicodec.multicodecInts.`46026`
    - typingsJapgolly.multicodec.multicodecInts.`46027`
    - typingsJapgolly.multicodec.multicodecInts.`46028`
    - typingsJapgolly.multicodec.multicodecInts.`46029`
    - typingsJapgolly.multicodec.multicodecInts.`46030`
    - typingsJapgolly.multicodec.multicodecInts.`46031`
    - typingsJapgolly.multicodec.multicodecInts.`46032`
    - typingsJapgolly.multicodec.multicodecInts.`46033`
    - typingsJapgolly.multicodec.multicodecInts.`46034`
    - typingsJapgolly.multicodec.multicodecInts.`46035`
    - typingsJapgolly.multicodec.multicodecInts.`46036`
    - typingsJapgolly.multicodec.multicodecInts.`46037`
    - typingsJapgolly.multicodec.multicodecInts.`46038`
    - typingsJapgolly.multicodec.multicodecInts.`46039`
    - typingsJapgolly.multicodec.multicodecInts.`46040`
    - typingsJapgolly.multicodec.multicodecInts.`46041`
    - typingsJapgolly.multicodec.multicodecInts.`46042`
    - typingsJapgolly.multicodec.multicodecInts.`46043`
    - typingsJapgolly.multicodec.multicodecInts.`46044`
    - typingsJapgolly.multicodec.multicodecInts.`46045`
    - typingsJapgolly.multicodec.multicodecInts.`46046`
    - typingsJapgolly.multicodec.multicodecInts.`46047`
    - typingsJapgolly.multicodec.multicodecInts.`46048`
    - typingsJapgolly.multicodec.multicodecInts.`46081`
    - typingsJapgolly.multicodec.multicodecInts.`46082`
    - typingsJapgolly.multicodec.multicodecInts.`52753`
    - typingsJapgolly.multicodec.multicodecInts.`61697`
    - typingsJapgolly.multicodec.multicodecInts.`61698`
    - typingsJapgolly.multicodec.multicodecInts.`8417572`
    - typingsJapgolly.multicodec.multicodecInts.`8483108`
    - typingsJapgolly.multicodec.multicodecInts.`9728292`
    - typingsJapgolly.multicodec.multicodecInts.`9793828`
    - typingsJapgolly.multicodec.multicodecInts.`10645796`
    - typingsJapgolly.multicodec.multicodecInts.`10711332`
    - typingsJapgolly.multicodec.multicodecInts.`11639056`
    - typingsJapgolly.multicodec.multicodecInts.`11704592`
  */
  trait CodecCode extends StObject
  object CodecCode {
    
    inline def `0`: typingsJapgolly.multicodec.multicodecInts.`0` = 0.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`0`]
    
    inline def `1`: typingsJapgolly.multicodec.multicodecInts.`1` = 1.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`1`]
    
    inline def `1024`: typingsJapgolly.multicodec.multicodecInts.`1024` = 1024.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`1024`]
    
    inline def `10645796`: typingsJapgolly.multicodec.multicodecInts.`10645796` = 10645796.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`10645796`]
    
    inline def `10711332`: typingsJapgolly.multicodec.multicodecInts.`10711332` = 10711332.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`10711332`]
    
    inline def `112`: typingsJapgolly.multicodec.multicodecInts.`112` = 112.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`112`]
    
    inline def `113`: typingsJapgolly.multicodec.multicodecInts.`113` = 113.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`113`]
    
    inline def `114`: typingsJapgolly.multicodec.multicodecInts.`114` = 114.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`114`]
    
    inline def `11639056`: typingsJapgolly.multicodec.multicodecInts.`11639056` = 11639056.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`11639056`]
    
    inline def `11704592`: typingsJapgolly.multicodec.multicodecInts.`11704592` = 11704592.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`11704592`]
    
    inline def `120`: typingsJapgolly.multicodec.multicodecInts.`120` = 120.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`120`]
    
    inline def `123`: typingsJapgolly.multicodec.multicodecInts.`123` = 123.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`123`]
    
    inline def `124`: typingsJapgolly.multicodec.multicodecInts.`124` = 124.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`124`]
    
    inline def `129`: typingsJapgolly.multicodec.multicodecInts.`129` = 129.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`129`]
    
    inline def `130`: typingsJapgolly.multicodec.multicodecInts.`130` = 130.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`130`]
    
    inline def `131`: typingsJapgolly.multicodec.multicodecInts.`131` = 131.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`131`]
    
    inline def `132`: typingsJapgolly.multicodec.multicodecInts.`132` = 132.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`132`]
    
    inline def `133`: typingsJapgolly.multicodec.multicodecInts.`133` = 133.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`133`]
    
    inline def `134`: typingsJapgolly.multicodec.multicodecInts.`134` = 134.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`134`]
    
    inline def `144`: typingsJapgolly.multicodec.multicodecInts.`144` = 144.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`144`]
    
    inline def `145`: typingsJapgolly.multicodec.multicodecInts.`145` = 145.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`145`]
    
    inline def `146`: typingsJapgolly.multicodec.multicodecInts.`146` = 146.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`146`]
    
    inline def `147`: typingsJapgolly.multicodec.multicodecInts.`147` = 147.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`147`]
    
    inline def `148`: typingsJapgolly.multicodec.multicodecInts.`148` = 148.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`148`]
    
    inline def `149`: typingsJapgolly.multicodec.multicodecInts.`149` = 149.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`149`]
    
    inline def `150`: typingsJapgolly.multicodec.multicodecInts.`150` = 150.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`150`]
    
    inline def `151`: typingsJapgolly.multicodec.multicodecInts.`151` = 151.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`151`]
    
    inline def `152`: typingsJapgolly.multicodec.multicodecInts.`152` = 152.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`152`]
    
    inline def `153`: typingsJapgolly.multicodec.multicodecInts.`153` = 153.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`153`]
    
    inline def `154`: typingsJapgolly.multicodec.multicodecInts.`154` = 154.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`154`]
    
    inline def `17`: typingsJapgolly.multicodec.multicodecInts.`17` = 17.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`17`]
    
    inline def `176`: typingsJapgolly.multicodec.multicodecInts.`176` = 176.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`176`]
    
    inline def `177`: typingsJapgolly.multicodec.multicodecInts.`177` = 177.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`177`]
    
    inline def `178`: typingsJapgolly.multicodec.multicodecInts.`178` = 178.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`178`]
    
    inline def `18`: typingsJapgolly.multicodec.multicodecInts.`18` = 18.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`18`]
    
    inline def `19`: typingsJapgolly.multicodec.multicodecInts.`19` = 19.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`19`]
    
    inline def `192`: typingsJapgolly.multicodec.multicodecInts.`192` = 192.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`192`]
    
    inline def `193`: typingsJapgolly.multicodec.multicodecInts.`193` = 193.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`193`]
    
    inline def `2`: typingsJapgolly.multicodec.multicodecInts.`2` = 2.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`2`]
    
    inline def `20`: typingsJapgolly.multicodec.multicodecInts.`20` = 20.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`20`]
    
    inline def `202`: typingsJapgolly.multicodec.multicodecInts.`202` = 202.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`202`]
    
    inline def `206`: typingsJapgolly.multicodec.multicodecInts.`206` = 206.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`206`]
    
    inline def `208`: typingsJapgolly.multicodec.multicodecInts.`208` = 208.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`208`]
    
    inline def `209`: typingsJapgolly.multicodec.multicodecInts.`209` = 209.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`209`]
    
    inline def `21`: typingsJapgolly.multicodec.multicodecInts.`21` = 21.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`21`]
    
    inline def `212`: typingsJapgolly.multicodec.multicodecInts.`212` = 212.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`212`]
    
    inline def `213`: typingsJapgolly.multicodec.multicodecInts.`213` = 213.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`213`]
    
    inline def `21325`: typingsJapgolly.multicodec.multicodecInts.`21325` = 21325.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`21325`]
    
    inline def `214`: typingsJapgolly.multicodec.multicodecInts.`214` = 214.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`214`]
    
    inline def `22`: typingsJapgolly.multicodec.multicodecInts.`22` = 22.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`22`]
    
    inline def `224`: typingsJapgolly.multicodec.multicodecInts.`224` = 224.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`224`]
    
    inline def `225`: typingsJapgolly.multicodec.multicodecInts.`225` = 225.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`225`]
    
    inline def `226`: typingsJapgolly.multicodec.multicodecInts.`226` = 226.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`226`]
    
    inline def `227`: typingsJapgolly.multicodec.multicodecInts.`227` = 227.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`227`]
    
    inline def `228`: typingsJapgolly.multicodec.multicodecInts.`228` = 228.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`228`]
    
    inline def `229`: typingsJapgolly.multicodec.multicodecInts.`229` = 229.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`229`]
    
    inline def `23`: typingsJapgolly.multicodec.multicodecInts.`23` = 23.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`23`]
    
    inline def `230`: typingsJapgolly.multicodec.multicodecInts.`230` = 230.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`230`]
    
    inline def `231`: typingsJapgolly.multicodec.multicodecInts.`231` = 231.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`231`]
    
    inline def `234`: typingsJapgolly.multicodec.multicodecInts.`234` = 234.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`234`]
    
    inline def `235`: typingsJapgolly.multicodec.multicodecInts.`235` = 235.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`235`]
    
    inline def `236`: typingsJapgolly.multicodec.multicodecInts.`236` = 236.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`236`]
    
    inline def `237`: typingsJapgolly.multicodec.multicodecInts.`237` = 237.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`237`]
    
    inline def `238`: typingsJapgolly.multicodec.multicodecInts.`238` = 238.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`238`]
    
    inline def `24`: typingsJapgolly.multicodec.multicodecInts.`24` = 24.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`24`]
    
    inline def `240`: typingsJapgolly.multicodec.multicodecInts.`240` = 240.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`240`]
    
    inline def `241`: typingsJapgolly.multicodec.multicodecInts.`241` = 241.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`241`]
    
    inline def `25`: typingsJapgolly.multicodec.multicodecInts.`25` = 25.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`25`]
    
    inline def `250`: typingsJapgolly.multicodec.multicodecInts.`250` = 250.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`250`]
    
    inline def `251`: typingsJapgolly.multicodec.multicodecInts.`251` = 251.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`251`]
    
    inline def `26`: typingsJapgolly.multicodec.multicodecInts.`26` = 26.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`26`]
    
    inline def `27`: typingsJapgolly.multicodec.multicodecInts.`27` = 27.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`27`]
    
    inline def `273`: typingsJapgolly.multicodec.multicodecInts.`273` = 273.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`273`]
    
    inline def `275`: typingsJapgolly.multicodec.multicodecInts.`275` = 275.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`275`]
    
    inline def `276`: typingsJapgolly.multicodec.multicodecInts.`276` = 276.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`276`]
    
    inline def `277`: typingsJapgolly.multicodec.multicodecInts.`277` = 277.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`277`]
    
    inline def `28`: typingsJapgolly.multicodec.multicodecInts.`28` = 28.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`28`]
    
    inline def `29`: typingsJapgolly.multicodec.multicodecInts.`29` = 29.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`29`]
    
    inline def `290`: typingsJapgolly.multicodec.multicodecInts.`290` = 290.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`290`]
    
    inline def `297`: typingsJapgolly.multicodec.multicodecInts.`297` = 297.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`297`]
    
    inline def `3`: typingsJapgolly.multicodec.multicodecInts.`3` = 3.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`3`]
    
    inline def `30`: typingsJapgolly.multicodec.multicodecInts.`30` = 30.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`30`]
    
    inline def `301`: typingsJapgolly.multicodec.multicodecInts.`301` = 301.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`301`]
    
    inline def `302`: typingsJapgolly.multicodec.multicodecInts.`302` = 302.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`302`]
    
    inline def `33`: typingsJapgolly.multicodec.multicodecInts.`33` = 33.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`33`]
    
    inline def `34`: typingsJapgolly.multicodec.multicodecInts.`34` = 34.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`34`]
    
    inline def `35`: typingsJapgolly.multicodec.multicodecInts.`35` = 35.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`35`]
    
    inline def `4`: typingsJapgolly.multicodec.multicodecInts.`4` = 4.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4`]
    
    inline def `400`: typingsJapgolly.multicodec.multicodecInts.`400` = 400.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`400`]
    
    inline def `406`: typingsJapgolly.multicodec.multicodecInts.`406` = 406.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`406`]
    
    inline def `41`: typingsJapgolly.multicodec.multicodecInts.`41` = 41.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`41`]
    
    inline def `4114`: typingsJapgolly.multicodec.multicodecInts.`4114` = 4114.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4114`]
    
    inline def `4178`: typingsJapgolly.multicodec.multicodecInts.`4178` = 4178.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4178`]
    
    inline def `4179`: typingsJapgolly.multicodec.multicodecInts.`4179` = 4179.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4179`]
    
    inline def `4180`: typingsJapgolly.multicodec.multicodecInts.`4180` = 4180.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4180`]
    
    inline def `4181`: typingsJapgolly.multicodec.multicodecInts.`4181` = 4181.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4181`]
    
    inline def `42`: typingsJapgolly.multicodec.multicodecInts.`42` = 42.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`42`]
    
    inline def `421`: typingsJapgolly.multicodec.multicodecInts.`421` = 421.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`421`]
    
    inline def `4352`: typingsJapgolly.multicodec.multicodecInts.`4352` = 4352.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4352`]
    
    inline def `443`: typingsJapgolly.multicodec.multicodecInts.`443` = 443.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`443`]
    
    inline def `444`: typingsJapgolly.multicodec.multicodecInts.`444` = 444.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`444`]
    
    inline def `445`: typingsJapgolly.multicodec.multicodecInts.`445` = 445.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`445`]
    
    inline def `446`: typingsJapgolly.multicodec.multicodecInts.`446` = 446.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`446`]
    
    inline def `447`: typingsJapgolly.multicodec.multicodecInts.`447` = 447.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`447`]
    
    inline def `448`: typingsJapgolly.multicodec.multicodecInts.`448` = 448.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`448`]
    
    inline def `454`: typingsJapgolly.multicodec.multicodecInts.`454` = 454.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`454`]
    
    inline def `45569`: typingsJapgolly.multicodec.multicodecInts.`45569` = 45569.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45569`]
    
    inline def `45570`: typingsJapgolly.multicodec.multicodecInts.`45570` = 45570.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45570`]
    
    inline def `45571`: typingsJapgolly.multicodec.multicodecInts.`45571` = 45571.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45571`]
    
    inline def `45572`: typingsJapgolly.multicodec.multicodecInts.`45572` = 45572.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45572`]
    
    inline def `45573`: typingsJapgolly.multicodec.multicodecInts.`45573` = 45573.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45573`]
    
    inline def `45574`: typingsJapgolly.multicodec.multicodecInts.`45574` = 45574.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45574`]
    
    inline def `45575`: typingsJapgolly.multicodec.multicodecInts.`45575` = 45575.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45575`]
    
    inline def `45576`: typingsJapgolly.multicodec.multicodecInts.`45576` = 45576.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45576`]
    
    inline def `45577`: typingsJapgolly.multicodec.multicodecInts.`45577` = 45577.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45577`]
    
    inline def `45578`: typingsJapgolly.multicodec.multicodecInts.`45578` = 45578.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45578`]
    
    inline def `45579`: typingsJapgolly.multicodec.multicodecInts.`45579` = 45579.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45579`]
    
    inline def `45580`: typingsJapgolly.multicodec.multicodecInts.`45580` = 45580.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45580`]
    
    inline def `45581`: typingsJapgolly.multicodec.multicodecInts.`45581` = 45581.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45581`]
    
    inline def `45582`: typingsJapgolly.multicodec.multicodecInts.`45582` = 45582.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45582`]
    
    inline def `45583`: typingsJapgolly.multicodec.multicodecInts.`45583` = 45583.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45583`]
    
    inline def `45584`: typingsJapgolly.multicodec.multicodecInts.`45584` = 45584.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45584`]
    
    inline def `45585`: typingsJapgolly.multicodec.multicodecInts.`45585` = 45585.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45585`]
    
    inline def `45586`: typingsJapgolly.multicodec.multicodecInts.`45586` = 45586.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45586`]
    
    inline def `45587`: typingsJapgolly.multicodec.multicodecInts.`45587` = 45587.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45587`]
    
    inline def `45588`: typingsJapgolly.multicodec.multicodecInts.`45588` = 45588.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45588`]
    
    inline def `45589`: typingsJapgolly.multicodec.multicodecInts.`45589` = 45589.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45589`]
    
    inline def `45590`: typingsJapgolly.multicodec.multicodecInts.`45590` = 45590.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45590`]
    
    inline def `45591`: typingsJapgolly.multicodec.multicodecInts.`45591` = 45591.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45591`]
    
    inline def `45592`: typingsJapgolly.multicodec.multicodecInts.`45592` = 45592.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45592`]
    
    inline def `45593`: typingsJapgolly.multicodec.multicodecInts.`45593` = 45593.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45593`]
    
    inline def `45594`: typingsJapgolly.multicodec.multicodecInts.`45594` = 45594.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45594`]
    
    inline def `45595`: typingsJapgolly.multicodec.multicodecInts.`45595` = 45595.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45595`]
    
    inline def `45596`: typingsJapgolly.multicodec.multicodecInts.`45596` = 45596.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45596`]
    
    inline def `45597`: typingsJapgolly.multicodec.multicodecInts.`45597` = 45597.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45597`]
    
    inline def `45598`: typingsJapgolly.multicodec.multicodecInts.`45598` = 45598.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45598`]
    
    inline def `45599`: typingsJapgolly.multicodec.multicodecInts.`45599` = 45599.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45599`]
    
    inline def `45600`: typingsJapgolly.multicodec.multicodecInts.`45600` = 45600.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45600`]
    
    inline def `45601`: typingsJapgolly.multicodec.multicodecInts.`45601` = 45601.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45601`]
    
    inline def `45602`: typingsJapgolly.multicodec.multicodecInts.`45602` = 45602.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45602`]
    
    inline def `45603`: typingsJapgolly.multicodec.multicodecInts.`45603` = 45603.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45603`]
    
    inline def `45604`: typingsJapgolly.multicodec.multicodecInts.`45604` = 45604.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45604`]
    
    inline def `45605`: typingsJapgolly.multicodec.multicodecInts.`45605` = 45605.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45605`]
    
    inline def `45606`: typingsJapgolly.multicodec.multicodecInts.`45606` = 45606.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45606`]
    
    inline def `45607`: typingsJapgolly.multicodec.multicodecInts.`45607` = 45607.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45607`]
    
    inline def `45608`: typingsJapgolly.multicodec.multicodecInts.`45608` = 45608.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45608`]
    
    inline def `45609`: typingsJapgolly.multicodec.multicodecInts.`45609` = 45609.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45609`]
    
    inline def `45610`: typingsJapgolly.multicodec.multicodecInts.`45610` = 45610.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45610`]
    
    inline def `45611`: typingsJapgolly.multicodec.multicodecInts.`45611` = 45611.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45611`]
    
    inline def `45612`: typingsJapgolly.multicodec.multicodecInts.`45612` = 45612.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45612`]
    
    inline def `45613`: typingsJapgolly.multicodec.multicodecInts.`45613` = 45613.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45613`]
    
    inline def `45614`: typingsJapgolly.multicodec.multicodecInts.`45614` = 45614.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45614`]
    
    inline def `45615`: typingsJapgolly.multicodec.multicodecInts.`45615` = 45615.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45615`]
    
    inline def `45616`: typingsJapgolly.multicodec.multicodecInts.`45616` = 45616.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45616`]
    
    inline def `45617`: typingsJapgolly.multicodec.multicodecInts.`45617` = 45617.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45617`]
    
    inline def `45618`: typingsJapgolly.multicodec.multicodecInts.`45618` = 45618.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45618`]
    
    inline def `45619`: typingsJapgolly.multicodec.multicodecInts.`45619` = 45619.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45619`]
    
    inline def `45620`: typingsJapgolly.multicodec.multicodecInts.`45620` = 45620.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45620`]
    
    inline def `45621`: typingsJapgolly.multicodec.multicodecInts.`45621` = 45621.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45621`]
    
    inline def `45622`: typingsJapgolly.multicodec.multicodecInts.`45622` = 45622.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45622`]
    
    inline def `45623`: typingsJapgolly.multicodec.multicodecInts.`45623` = 45623.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45623`]
    
    inline def `45624`: typingsJapgolly.multicodec.multicodecInts.`45624` = 45624.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45624`]
    
    inline def `45625`: typingsJapgolly.multicodec.multicodecInts.`45625` = 45625.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45625`]
    
    inline def `45626`: typingsJapgolly.multicodec.multicodecInts.`45626` = 45626.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45626`]
    
    inline def `45627`: typingsJapgolly.multicodec.multicodecInts.`45627` = 45627.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45627`]
    
    inline def `45628`: typingsJapgolly.multicodec.multicodecInts.`45628` = 45628.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45628`]
    
    inline def `45629`: typingsJapgolly.multicodec.multicodecInts.`45629` = 45629.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45629`]
    
    inline def `45630`: typingsJapgolly.multicodec.multicodecInts.`45630` = 45630.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45630`]
    
    inline def `45631`: typingsJapgolly.multicodec.multicodecInts.`45631` = 45631.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45631`]
    
    inline def `45632`: typingsJapgolly.multicodec.multicodecInts.`45632` = 45632.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45632`]
    
    inline def `45633`: typingsJapgolly.multicodec.multicodecInts.`45633` = 45633.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45633`]
    
    inline def `45634`: typingsJapgolly.multicodec.multicodecInts.`45634` = 45634.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45634`]
    
    inline def `45635`: typingsJapgolly.multicodec.multicodecInts.`45635` = 45635.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45635`]
    
    inline def `45636`: typingsJapgolly.multicodec.multicodecInts.`45636` = 45636.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45636`]
    
    inline def `45637`: typingsJapgolly.multicodec.multicodecInts.`45637` = 45637.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45637`]
    
    inline def `45638`: typingsJapgolly.multicodec.multicodecInts.`45638` = 45638.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45638`]
    
    inline def `45639`: typingsJapgolly.multicodec.multicodecInts.`45639` = 45639.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45639`]
    
    inline def `45640`: typingsJapgolly.multicodec.multicodecInts.`45640` = 45640.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45640`]
    
    inline def `45641`: typingsJapgolly.multicodec.multicodecInts.`45641` = 45641.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45641`]
    
    inline def `45642`: typingsJapgolly.multicodec.multicodecInts.`45642` = 45642.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45642`]
    
    inline def `45643`: typingsJapgolly.multicodec.multicodecInts.`45643` = 45643.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45643`]
    
    inline def `45644`: typingsJapgolly.multicodec.multicodecInts.`45644` = 45644.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45644`]
    
    inline def `45645`: typingsJapgolly.multicodec.multicodecInts.`45645` = 45645.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45645`]
    
    inline def `45646`: typingsJapgolly.multicodec.multicodecInts.`45646` = 45646.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45646`]
    
    inline def `45647`: typingsJapgolly.multicodec.multicodecInts.`45647` = 45647.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45647`]
    
    inline def `45648`: typingsJapgolly.multicodec.multicodecInts.`45648` = 45648.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45648`]
    
    inline def `45649`: typingsJapgolly.multicodec.multicodecInts.`45649` = 45649.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45649`]
    
    inline def `45650`: typingsJapgolly.multicodec.multicodecInts.`45650` = 45650.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45650`]
    
    inline def `45651`: typingsJapgolly.multicodec.multicodecInts.`45651` = 45651.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45651`]
    
    inline def `45652`: typingsJapgolly.multicodec.multicodecInts.`45652` = 45652.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45652`]
    
    inline def `45653`: typingsJapgolly.multicodec.multicodecInts.`45653` = 45653.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45653`]
    
    inline def `45654`: typingsJapgolly.multicodec.multicodecInts.`45654` = 45654.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45654`]
    
    inline def `45655`: typingsJapgolly.multicodec.multicodecInts.`45655` = 45655.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45655`]
    
    inline def `45656`: typingsJapgolly.multicodec.multicodecInts.`45656` = 45656.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45656`]
    
    inline def `45657`: typingsJapgolly.multicodec.multicodecInts.`45657` = 45657.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45657`]
    
    inline def `45658`: typingsJapgolly.multicodec.multicodecInts.`45658` = 45658.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45658`]
    
    inline def `45659`: typingsJapgolly.multicodec.multicodecInts.`45659` = 45659.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45659`]
    
    inline def `45660`: typingsJapgolly.multicodec.multicodecInts.`45660` = 45660.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45660`]
    
    inline def `45661`: typingsJapgolly.multicodec.multicodecInts.`45661` = 45661.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45661`]
    
    inline def `45662`: typingsJapgolly.multicodec.multicodecInts.`45662` = 45662.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45662`]
    
    inline def `45663`: typingsJapgolly.multicodec.multicodecInts.`45663` = 45663.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45663`]
    
    inline def `45664`: typingsJapgolly.multicodec.multicodecInts.`45664` = 45664.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45664`]
    
    inline def `45825`: typingsJapgolly.multicodec.multicodecInts.`45825` = 45825.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45825`]
    
    inline def `45826`: typingsJapgolly.multicodec.multicodecInts.`45826` = 45826.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45826`]
    
    inline def `45827`: typingsJapgolly.multicodec.multicodecInts.`45827` = 45827.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45827`]
    
    inline def `45828`: typingsJapgolly.multicodec.multicodecInts.`45828` = 45828.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45828`]
    
    inline def `45829`: typingsJapgolly.multicodec.multicodecInts.`45829` = 45829.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45829`]
    
    inline def `45830`: typingsJapgolly.multicodec.multicodecInts.`45830` = 45830.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45830`]
    
    inline def `45831`: typingsJapgolly.multicodec.multicodecInts.`45831` = 45831.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45831`]
    
    inline def `45832`: typingsJapgolly.multicodec.multicodecInts.`45832` = 45832.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45832`]
    
    inline def `45833`: typingsJapgolly.multicodec.multicodecInts.`45833` = 45833.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45833`]
    
    inline def `45834`: typingsJapgolly.multicodec.multicodecInts.`45834` = 45834.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45834`]
    
    inline def `45835`: typingsJapgolly.multicodec.multicodecInts.`45835` = 45835.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45835`]
    
    inline def `45836`: typingsJapgolly.multicodec.multicodecInts.`45836` = 45836.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45836`]
    
    inline def `45837`: typingsJapgolly.multicodec.multicodecInts.`45837` = 45837.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45837`]
    
    inline def `45838`: typingsJapgolly.multicodec.multicodecInts.`45838` = 45838.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45838`]
    
    inline def `45839`: typingsJapgolly.multicodec.multicodecInts.`45839` = 45839.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45839`]
    
    inline def `45840`: typingsJapgolly.multicodec.multicodecInts.`45840` = 45840.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45840`]
    
    inline def `45841`: typingsJapgolly.multicodec.multicodecInts.`45841` = 45841.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45841`]
    
    inline def `45842`: typingsJapgolly.multicodec.multicodecInts.`45842` = 45842.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45842`]
    
    inline def `45843`: typingsJapgolly.multicodec.multicodecInts.`45843` = 45843.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45843`]
    
    inline def `45844`: typingsJapgolly.multicodec.multicodecInts.`45844` = 45844.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45844`]
    
    inline def `45845`: typingsJapgolly.multicodec.multicodecInts.`45845` = 45845.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45845`]
    
    inline def `45846`: typingsJapgolly.multicodec.multicodecInts.`45846` = 45846.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45846`]
    
    inline def `45847`: typingsJapgolly.multicodec.multicodecInts.`45847` = 45847.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45847`]
    
    inline def `45848`: typingsJapgolly.multicodec.multicodecInts.`45848` = 45848.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45848`]
    
    inline def `45849`: typingsJapgolly.multicodec.multicodecInts.`45849` = 45849.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45849`]
    
    inline def `45850`: typingsJapgolly.multicodec.multicodecInts.`45850` = 45850.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45850`]
    
    inline def `45851`: typingsJapgolly.multicodec.multicodecInts.`45851` = 45851.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45851`]
    
    inline def `45852`: typingsJapgolly.multicodec.multicodecInts.`45852` = 45852.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45852`]
    
    inline def `45853`: typingsJapgolly.multicodec.multicodecInts.`45853` = 45853.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45853`]
    
    inline def `45854`: typingsJapgolly.multicodec.multicodecInts.`45854` = 45854.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45854`]
    
    inline def `45855`: typingsJapgolly.multicodec.multicodecInts.`45855` = 45855.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45855`]
    
    inline def `45856`: typingsJapgolly.multicodec.multicodecInts.`45856` = 45856.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45856`]
    
    inline def `45857`: typingsJapgolly.multicodec.multicodecInts.`45857` = 45857.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45857`]
    
    inline def `45858`: typingsJapgolly.multicodec.multicodecInts.`45858` = 45858.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45858`]
    
    inline def `45859`: typingsJapgolly.multicodec.multicodecInts.`45859` = 45859.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45859`]
    
    inline def `45860`: typingsJapgolly.multicodec.multicodecInts.`45860` = 45860.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45860`]
    
    inline def `45861`: typingsJapgolly.multicodec.multicodecInts.`45861` = 45861.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45861`]
    
    inline def `45862`: typingsJapgolly.multicodec.multicodecInts.`45862` = 45862.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45862`]
    
    inline def `45863`: typingsJapgolly.multicodec.multicodecInts.`45863` = 45863.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45863`]
    
    inline def `45864`: typingsJapgolly.multicodec.multicodecInts.`45864` = 45864.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45864`]
    
    inline def `45865`: typingsJapgolly.multicodec.multicodecInts.`45865` = 45865.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45865`]
    
    inline def `45866`: typingsJapgolly.multicodec.multicodecInts.`45866` = 45866.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45866`]
    
    inline def `45867`: typingsJapgolly.multicodec.multicodecInts.`45867` = 45867.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45867`]
    
    inline def `45868`: typingsJapgolly.multicodec.multicodecInts.`45868` = 45868.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45868`]
    
    inline def `45869`: typingsJapgolly.multicodec.multicodecInts.`45869` = 45869.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45869`]
    
    inline def `45870`: typingsJapgolly.multicodec.multicodecInts.`45870` = 45870.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45870`]
    
    inline def `45871`: typingsJapgolly.multicodec.multicodecInts.`45871` = 45871.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45871`]
    
    inline def `45872`: typingsJapgolly.multicodec.multicodecInts.`45872` = 45872.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45872`]
    
    inline def `45873`: typingsJapgolly.multicodec.multicodecInts.`45873` = 45873.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45873`]
    
    inline def `45874`: typingsJapgolly.multicodec.multicodecInts.`45874` = 45874.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45874`]
    
    inline def `45875`: typingsJapgolly.multicodec.multicodecInts.`45875` = 45875.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45875`]
    
    inline def `45876`: typingsJapgolly.multicodec.multicodecInts.`45876` = 45876.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45876`]
    
    inline def `45877`: typingsJapgolly.multicodec.multicodecInts.`45877` = 45877.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45877`]
    
    inline def `45878`: typingsJapgolly.multicodec.multicodecInts.`45878` = 45878.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45878`]
    
    inline def `45879`: typingsJapgolly.multicodec.multicodecInts.`45879` = 45879.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45879`]
    
    inline def `45880`: typingsJapgolly.multicodec.multicodecInts.`45880` = 45880.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45880`]
    
    inline def `45881`: typingsJapgolly.multicodec.multicodecInts.`45881` = 45881.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45881`]
    
    inline def `45882`: typingsJapgolly.multicodec.multicodecInts.`45882` = 45882.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45882`]
    
    inline def `45883`: typingsJapgolly.multicodec.multicodecInts.`45883` = 45883.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45883`]
    
    inline def `45884`: typingsJapgolly.multicodec.multicodecInts.`45884` = 45884.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45884`]
    
    inline def `45885`: typingsJapgolly.multicodec.multicodecInts.`45885` = 45885.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45885`]
    
    inline def `45886`: typingsJapgolly.multicodec.multicodecInts.`45886` = 45886.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45886`]
    
    inline def `45887`: typingsJapgolly.multicodec.multicodecInts.`45887` = 45887.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45887`]
    
    inline def `45888`: typingsJapgolly.multicodec.multicodecInts.`45888` = 45888.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45888`]
    
    inline def `45889`: typingsJapgolly.multicodec.multicodecInts.`45889` = 45889.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45889`]
    
    inline def `45890`: typingsJapgolly.multicodec.multicodecInts.`45890` = 45890.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45890`]
    
    inline def `45891`: typingsJapgolly.multicodec.multicodecInts.`45891` = 45891.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45891`]
    
    inline def `45892`: typingsJapgolly.multicodec.multicodecInts.`45892` = 45892.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45892`]
    
    inline def `45893`: typingsJapgolly.multicodec.multicodecInts.`45893` = 45893.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45893`]
    
    inline def `45894`: typingsJapgolly.multicodec.multicodecInts.`45894` = 45894.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45894`]
    
    inline def `45895`: typingsJapgolly.multicodec.multicodecInts.`45895` = 45895.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45895`]
    
    inline def `45896`: typingsJapgolly.multicodec.multicodecInts.`45896` = 45896.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45896`]
    
    inline def `45897`: typingsJapgolly.multicodec.multicodecInts.`45897` = 45897.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45897`]
    
    inline def `45898`: typingsJapgolly.multicodec.multicodecInts.`45898` = 45898.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45898`]
    
    inline def `45899`: typingsJapgolly.multicodec.multicodecInts.`45899` = 45899.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45899`]
    
    inline def `45900`: typingsJapgolly.multicodec.multicodecInts.`45900` = 45900.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45900`]
    
    inline def `45901`: typingsJapgolly.multicodec.multicodecInts.`45901` = 45901.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45901`]
    
    inline def `45902`: typingsJapgolly.multicodec.multicodecInts.`45902` = 45902.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45902`]
    
    inline def `45903`: typingsJapgolly.multicodec.multicodecInts.`45903` = 45903.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45903`]
    
    inline def `45904`: typingsJapgolly.multicodec.multicodecInts.`45904` = 45904.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45904`]
    
    inline def `45905`: typingsJapgolly.multicodec.multicodecInts.`45905` = 45905.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45905`]
    
    inline def `45906`: typingsJapgolly.multicodec.multicodecInts.`45906` = 45906.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45906`]
    
    inline def `45907`: typingsJapgolly.multicodec.multicodecInts.`45907` = 45907.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45907`]
    
    inline def `45908`: typingsJapgolly.multicodec.multicodecInts.`45908` = 45908.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45908`]
    
    inline def `45909`: typingsJapgolly.multicodec.multicodecInts.`45909` = 45909.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45909`]
    
    inline def `45910`: typingsJapgolly.multicodec.multicodecInts.`45910` = 45910.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45910`]
    
    inline def `45911`: typingsJapgolly.multicodec.multicodecInts.`45911` = 45911.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45911`]
    
    inline def `45912`: typingsJapgolly.multicodec.multicodecInts.`45912` = 45912.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45912`]
    
    inline def `45913`: typingsJapgolly.multicodec.multicodecInts.`45913` = 45913.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45913`]
    
    inline def `45914`: typingsJapgolly.multicodec.multicodecInts.`45914` = 45914.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45914`]
    
    inline def `45915`: typingsJapgolly.multicodec.multicodecInts.`45915` = 45915.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45915`]
    
    inline def `45916`: typingsJapgolly.multicodec.multicodecInts.`45916` = 45916.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45916`]
    
    inline def `45917`: typingsJapgolly.multicodec.multicodecInts.`45917` = 45917.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45917`]
    
    inline def `45918`: typingsJapgolly.multicodec.multicodecInts.`45918` = 45918.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45918`]
    
    inline def `45919`: typingsJapgolly.multicodec.multicodecInts.`45919` = 45919.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45919`]
    
    inline def `45920`: typingsJapgolly.multicodec.multicodecInts.`45920` = 45920.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45920`]
    
    inline def `45921`: typingsJapgolly.multicodec.multicodecInts.`45921` = 45921.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45921`]
    
    inline def `45922`: typingsJapgolly.multicodec.multicodecInts.`45922` = 45922.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45922`]
    
    inline def `45923`: typingsJapgolly.multicodec.multicodecInts.`45923` = 45923.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45923`]
    
    inline def `45924`: typingsJapgolly.multicodec.multicodecInts.`45924` = 45924.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45924`]
    
    inline def `45925`: typingsJapgolly.multicodec.multicodecInts.`45925` = 45925.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45925`]
    
    inline def `45926`: typingsJapgolly.multicodec.multicodecInts.`45926` = 45926.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45926`]
    
    inline def `45927`: typingsJapgolly.multicodec.multicodecInts.`45927` = 45927.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45927`]
    
    inline def `45928`: typingsJapgolly.multicodec.multicodecInts.`45928` = 45928.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45928`]
    
    inline def `45929`: typingsJapgolly.multicodec.multicodecInts.`45929` = 45929.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45929`]
    
    inline def `45930`: typingsJapgolly.multicodec.multicodecInts.`45930` = 45930.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45930`]
    
    inline def `45931`: typingsJapgolly.multicodec.multicodecInts.`45931` = 45931.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45931`]
    
    inline def `45932`: typingsJapgolly.multicodec.multicodecInts.`45932` = 45932.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45932`]
    
    inline def `45933`: typingsJapgolly.multicodec.multicodecInts.`45933` = 45933.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45933`]
    
    inline def `45934`: typingsJapgolly.multicodec.multicodecInts.`45934` = 45934.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45934`]
    
    inline def `45935`: typingsJapgolly.multicodec.multicodecInts.`45935` = 45935.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45935`]
    
    inline def `45936`: typingsJapgolly.multicodec.multicodecInts.`45936` = 45936.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45936`]
    
    inline def `45937`: typingsJapgolly.multicodec.multicodecInts.`45937` = 45937.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45937`]
    
    inline def `45938`: typingsJapgolly.multicodec.multicodecInts.`45938` = 45938.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45938`]
    
    inline def `45939`: typingsJapgolly.multicodec.multicodecInts.`45939` = 45939.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45939`]
    
    inline def `45940`: typingsJapgolly.multicodec.multicodecInts.`45940` = 45940.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45940`]
    
    inline def `45941`: typingsJapgolly.multicodec.multicodecInts.`45941` = 45941.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45941`]
    
    inline def `45942`: typingsJapgolly.multicodec.multicodecInts.`45942` = 45942.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45942`]
    
    inline def `45943`: typingsJapgolly.multicodec.multicodecInts.`45943` = 45943.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45943`]
    
    inline def `45944`: typingsJapgolly.multicodec.multicodecInts.`45944` = 45944.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45944`]
    
    inline def `45945`: typingsJapgolly.multicodec.multicodecInts.`45945` = 45945.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45945`]
    
    inline def `45946`: typingsJapgolly.multicodec.multicodecInts.`45946` = 45946.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45946`]
    
    inline def `45947`: typingsJapgolly.multicodec.multicodecInts.`45947` = 45947.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45947`]
    
    inline def `45948`: typingsJapgolly.multicodec.multicodecInts.`45948` = 45948.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45948`]
    
    inline def `45949`: typingsJapgolly.multicodec.multicodecInts.`45949` = 45949.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45949`]
    
    inline def `45950`: typingsJapgolly.multicodec.multicodecInts.`45950` = 45950.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45950`]
    
    inline def `45951`: typingsJapgolly.multicodec.multicodecInts.`45951` = 45951.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45951`]
    
    inline def `45952`: typingsJapgolly.multicodec.multicodecInts.`45952` = 45952.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45952`]
    
    inline def `45953`: typingsJapgolly.multicodec.multicodecInts.`45953` = 45953.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45953`]
    
    inline def `45954`: typingsJapgolly.multicodec.multicodecInts.`45954` = 45954.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45954`]
    
    inline def `45955`: typingsJapgolly.multicodec.multicodecInts.`45955` = 45955.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45955`]
    
    inline def `45956`: typingsJapgolly.multicodec.multicodecInts.`45956` = 45956.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45956`]
    
    inline def `45957`: typingsJapgolly.multicodec.multicodecInts.`45957` = 45957.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45957`]
    
    inline def `45958`: typingsJapgolly.multicodec.multicodecInts.`45958` = 45958.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45958`]
    
    inline def `45959`: typingsJapgolly.multicodec.multicodecInts.`45959` = 45959.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45959`]
    
    inline def `45960`: typingsJapgolly.multicodec.multicodecInts.`45960` = 45960.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45960`]
    
    inline def `45961`: typingsJapgolly.multicodec.multicodecInts.`45961` = 45961.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45961`]
    
    inline def `45962`: typingsJapgolly.multicodec.multicodecInts.`45962` = 45962.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45962`]
    
    inline def `45963`: typingsJapgolly.multicodec.multicodecInts.`45963` = 45963.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45963`]
    
    inline def `45964`: typingsJapgolly.multicodec.multicodecInts.`45964` = 45964.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45964`]
    
    inline def `45965`: typingsJapgolly.multicodec.multicodecInts.`45965` = 45965.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45965`]
    
    inline def `45966`: typingsJapgolly.multicodec.multicodecInts.`45966` = 45966.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45966`]
    
    inline def `45967`: typingsJapgolly.multicodec.multicodecInts.`45967` = 45967.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45967`]
    
    inline def `45968`: typingsJapgolly.multicodec.multicodecInts.`45968` = 45968.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45968`]
    
    inline def `45969`: typingsJapgolly.multicodec.multicodecInts.`45969` = 45969.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45969`]
    
    inline def `45970`: typingsJapgolly.multicodec.multicodecInts.`45970` = 45970.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45970`]
    
    inline def `45971`: typingsJapgolly.multicodec.multicodecInts.`45971` = 45971.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45971`]
    
    inline def `45972`: typingsJapgolly.multicodec.multicodecInts.`45972` = 45972.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45972`]
    
    inline def `45973`: typingsJapgolly.multicodec.multicodecInts.`45973` = 45973.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45973`]
    
    inline def `45974`: typingsJapgolly.multicodec.multicodecInts.`45974` = 45974.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45974`]
    
    inline def `45975`: typingsJapgolly.multicodec.multicodecInts.`45975` = 45975.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45975`]
    
    inline def `45976`: typingsJapgolly.multicodec.multicodecInts.`45976` = 45976.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45976`]
    
    inline def `45977`: typingsJapgolly.multicodec.multicodecInts.`45977` = 45977.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45977`]
    
    inline def `45978`: typingsJapgolly.multicodec.multicodecInts.`45978` = 45978.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45978`]
    
    inline def `45979`: typingsJapgolly.multicodec.multicodecInts.`45979` = 45979.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45979`]
    
    inline def `45980`: typingsJapgolly.multicodec.multicodecInts.`45980` = 45980.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45980`]
    
    inline def `45981`: typingsJapgolly.multicodec.multicodecInts.`45981` = 45981.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45981`]
    
    inline def `45982`: typingsJapgolly.multicodec.multicodecInts.`45982` = 45982.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45982`]
    
    inline def `45983`: typingsJapgolly.multicodec.multicodecInts.`45983` = 45983.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45983`]
    
    inline def `45984`: typingsJapgolly.multicodec.multicodecInts.`45984` = 45984.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45984`]
    
    inline def `45985`: typingsJapgolly.multicodec.multicodecInts.`45985` = 45985.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45985`]
    
    inline def `45986`: typingsJapgolly.multicodec.multicodecInts.`45986` = 45986.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45986`]
    
    inline def `45987`: typingsJapgolly.multicodec.multicodecInts.`45987` = 45987.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45987`]
    
    inline def `45988`: typingsJapgolly.multicodec.multicodecInts.`45988` = 45988.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45988`]
    
    inline def `45989`: typingsJapgolly.multicodec.multicodecInts.`45989` = 45989.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45989`]
    
    inline def `45990`: typingsJapgolly.multicodec.multicodecInts.`45990` = 45990.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45990`]
    
    inline def `45991`: typingsJapgolly.multicodec.multicodecInts.`45991` = 45991.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45991`]
    
    inline def `45992`: typingsJapgolly.multicodec.multicodecInts.`45992` = 45992.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45992`]
    
    inline def `45993`: typingsJapgolly.multicodec.multicodecInts.`45993` = 45993.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45993`]
    
    inline def `45994`: typingsJapgolly.multicodec.multicodecInts.`45994` = 45994.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45994`]
    
    inline def `45995`: typingsJapgolly.multicodec.multicodecInts.`45995` = 45995.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45995`]
    
    inline def `45996`: typingsJapgolly.multicodec.multicodecInts.`45996` = 45996.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45996`]
    
    inline def `45997`: typingsJapgolly.multicodec.multicodecInts.`45997` = 45997.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45997`]
    
    inline def `45998`: typingsJapgolly.multicodec.multicodecInts.`45998` = 45998.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45998`]
    
    inline def `45999`: typingsJapgolly.multicodec.multicodecInts.`45999` = 45999.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`45999`]
    
    inline def `460`: typingsJapgolly.multicodec.multicodecInts.`460` = 460.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`460`]
    
    inline def `46000`: typingsJapgolly.multicodec.multicodecInts.`46000` = 46000.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46000`]
    
    inline def `46001`: typingsJapgolly.multicodec.multicodecInts.`46001` = 46001.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46001`]
    
    inline def `46002`: typingsJapgolly.multicodec.multicodecInts.`46002` = 46002.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46002`]
    
    inline def `46003`: typingsJapgolly.multicodec.multicodecInts.`46003` = 46003.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46003`]
    
    inline def `46004`: typingsJapgolly.multicodec.multicodecInts.`46004` = 46004.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46004`]
    
    inline def `46005`: typingsJapgolly.multicodec.multicodecInts.`46005` = 46005.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46005`]
    
    inline def `46006`: typingsJapgolly.multicodec.multicodecInts.`46006` = 46006.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46006`]
    
    inline def `46007`: typingsJapgolly.multicodec.multicodecInts.`46007` = 46007.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46007`]
    
    inline def `46008`: typingsJapgolly.multicodec.multicodecInts.`46008` = 46008.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46008`]
    
    inline def `46009`: typingsJapgolly.multicodec.multicodecInts.`46009` = 46009.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46009`]
    
    inline def `46010`: typingsJapgolly.multicodec.multicodecInts.`46010` = 46010.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46010`]
    
    inline def `46011`: typingsJapgolly.multicodec.multicodecInts.`46011` = 46011.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46011`]
    
    inline def `46012`: typingsJapgolly.multicodec.multicodecInts.`46012` = 46012.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46012`]
    
    inline def `46013`: typingsJapgolly.multicodec.multicodecInts.`46013` = 46013.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46013`]
    
    inline def `46014`: typingsJapgolly.multicodec.multicodecInts.`46014` = 46014.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46014`]
    
    inline def `46015`: typingsJapgolly.multicodec.multicodecInts.`46015` = 46015.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46015`]
    
    inline def `46016`: typingsJapgolly.multicodec.multicodecInts.`46016` = 46016.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46016`]
    
    inline def `46017`: typingsJapgolly.multicodec.multicodecInts.`46017` = 46017.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46017`]
    
    inline def `46018`: typingsJapgolly.multicodec.multicodecInts.`46018` = 46018.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46018`]
    
    inline def `46019`: typingsJapgolly.multicodec.multicodecInts.`46019` = 46019.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46019`]
    
    inline def `46020`: typingsJapgolly.multicodec.multicodecInts.`46020` = 46020.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46020`]
    
    inline def `46021`: typingsJapgolly.multicodec.multicodecInts.`46021` = 46021.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46021`]
    
    inline def `46022`: typingsJapgolly.multicodec.multicodecInts.`46022` = 46022.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46022`]
    
    inline def `46023`: typingsJapgolly.multicodec.multicodecInts.`46023` = 46023.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46023`]
    
    inline def `46024`: typingsJapgolly.multicodec.multicodecInts.`46024` = 46024.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46024`]
    
    inline def `46025`: typingsJapgolly.multicodec.multicodecInts.`46025` = 46025.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46025`]
    
    inline def `46026`: typingsJapgolly.multicodec.multicodecInts.`46026` = 46026.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46026`]
    
    inline def `46027`: typingsJapgolly.multicodec.multicodecInts.`46027` = 46027.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46027`]
    
    inline def `46028`: typingsJapgolly.multicodec.multicodecInts.`46028` = 46028.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46028`]
    
    inline def `46029`: typingsJapgolly.multicodec.multicodecInts.`46029` = 46029.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46029`]
    
    inline def `46030`: typingsJapgolly.multicodec.multicodecInts.`46030` = 46030.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46030`]
    
    inline def `46031`: typingsJapgolly.multicodec.multicodecInts.`46031` = 46031.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46031`]
    
    inline def `46032`: typingsJapgolly.multicodec.multicodecInts.`46032` = 46032.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46032`]
    
    inline def `46033`: typingsJapgolly.multicodec.multicodecInts.`46033` = 46033.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46033`]
    
    inline def `46034`: typingsJapgolly.multicodec.multicodecInts.`46034` = 46034.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46034`]
    
    inline def `46035`: typingsJapgolly.multicodec.multicodecInts.`46035` = 46035.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46035`]
    
    inline def `46036`: typingsJapgolly.multicodec.multicodecInts.`46036` = 46036.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46036`]
    
    inline def `46037`: typingsJapgolly.multicodec.multicodecInts.`46037` = 46037.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46037`]
    
    inline def `46038`: typingsJapgolly.multicodec.multicodecInts.`46038` = 46038.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46038`]
    
    inline def `46039`: typingsJapgolly.multicodec.multicodecInts.`46039` = 46039.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46039`]
    
    inline def `46040`: typingsJapgolly.multicodec.multicodecInts.`46040` = 46040.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46040`]
    
    inline def `46041`: typingsJapgolly.multicodec.multicodecInts.`46041` = 46041.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46041`]
    
    inline def `46042`: typingsJapgolly.multicodec.multicodecInts.`46042` = 46042.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46042`]
    
    inline def `46043`: typingsJapgolly.multicodec.multicodecInts.`46043` = 46043.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46043`]
    
    inline def `46044`: typingsJapgolly.multicodec.multicodecInts.`46044` = 46044.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46044`]
    
    inline def `46045`: typingsJapgolly.multicodec.multicodecInts.`46045` = 46045.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46045`]
    
    inline def `46046`: typingsJapgolly.multicodec.multicodecInts.`46046` = 46046.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46046`]
    
    inline def `46047`: typingsJapgolly.multicodec.multicodecInts.`46047` = 46047.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46047`]
    
    inline def `46048`: typingsJapgolly.multicodec.multicodecInts.`46048` = 46048.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46048`]
    
    inline def `4608`: typingsJapgolly.multicodec.multicodecInts.`4608` = 4608.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4608`]
    
    inline def `46081`: typingsJapgolly.multicodec.multicodecInts.`46081` = 46081.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46081`]
    
    inline def `46082`: typingsJapgolly.multicodec.multicodecInts.`46082` = 46082.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`46082`]
    
    inline def `4609`: typingsJapgolly.multicodec.multicodecInts.`4609` = 4609.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4609`]
    
    inline def `4610`: typingsJapgolly.multicodec.multicodecInts.`4610` = 4610.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4610`]
    
    inline def `4611`: typingsJapgolly.multicodec.multicodecInts.`4611` = 4611.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4611`]
    
    inline def `4612`: typingsJapgolly.multicodec.multicodecInts.`4612` = 4612.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4612`]
    
    inline def `47`: typingsJapgolly.multicodec.multicodecInts.`47` = 47.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`47`]
    
    inline def `477`: typingsJapgolly.multicodec.multicodecInts.`477` = 477.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`477`]
    
    inline def `478`: typingsJapgolly.multicodec.multicodecInts.`478` = 478.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`478`]
    
    inline def `479`: typingsJapgolly.multicodec.multicodecInts.`479` = 479.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`479`]
    
    inline def `48`: typingsJapgolly.multicodec.multicodecInts.`48` = 48.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`48`]
    
    inline def `480`: typingsJapgolly.multicodec.multicodecInts.`480` = 480.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`480`]
    
    inline def `4864`: typingsJapgolly.multicodec.multicodecInts.`4864` = 4864.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4864`]
    
    inline def `4865`: typingsJapgolly.multicodec.multicodecInts.`4865` = 4865.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4865`]
    
    inline def `4866`: typingsJapgolly.multicodec.multicodecInts.`4866` = 4866.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`4866`]
    
    inline def `49`: typingsJapgolly.multicodec.multicodecInts.`49` = 49.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`49`]
    
    inline def `496`: typingsJapgolly.multicodec.multicodecInts.`496` = 496.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`496`]
    
    inline def `50`: typingsJapgolly.multicodec.multicodecInts.`50` = 50.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`50`]
    
    inline def `51`: typingsJapgolly.multicodec.multicodecInts.`51` = 51.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`51`]
    
    inline def `512`: typingsJapgolly.multicodec.multicodecInts.`512` = 512.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`512`]
    
    inline def `513`: typingsJapgolly.multicodec.multicodecInts.`513` = 513.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`513`]
    
    inline def `52753`: typingsJapgolly.multicodec.multicodecInts.`52753` = 52753.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`52753`]
    
    inline def `53`: typingsJapgolly.multicodec.multicodecInts.`53` = 53.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`53`]
    
    inline def `54`: typingsJapgolly.multicodec.multicodecInts.`54` = 54.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`54`]
    
    inline def `55`: typingsJapgolly.multicodec.multicodecInts.`55` = 55.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`55`]
    
    inline def `56`: typingsJapgolly.multicodec.multicodecInts.`56` = 56.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`56`]
    
    inline def `6`: typingsJapgolly.multicodec.multicodecInts.`6` = 6.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`6`]
    
    inline def `61697`: typingsJapgolly.multicodec.multicodecInts.`61697` = 61697.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`61697`]
    
    inline def `61698`: typingsJapgolly.multicodec.multicodecInts.`61698` = 61698.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`61698`]
    
    inline def `7425`: typingsJapgolly.multicodec.multicodecInts.`7425` = 7425.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`7425`]
    
    inline def `769`: typingsJapgolly.multicodec.multicodecInts.`769` = 769.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`769`]
    
    inline def `770`: typingsJapgolly.multicodec.multicodecInts.`770` = 770.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`770`]
    
    inline def `80`: typingsJapgolly.multicodec.multicodecInts.`80` = 80.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`80`]
    
    inline def `81`: typingsJapgolly.multicodec.multicodecInts.`81` = 81.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`81`]
    
    inline def `8417572`: typingsJapgolly.multicodec.multicodecInts.`8417572` = 8417572.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`8417572`]
    
    inline def `8483108`: typingsJapgolly.multicodec.multicodecInts.`8483108` = 8483108.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`8483108`]
    
    inline def `85`: typingsJapgolly.multicodec.multicodecInts.`85` = 85.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`85`]
    
    inline def `86`: typingsJapgolly.multicodec.multicodecInts.`86` = 86.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`86`]
    
    inline def `96`: typingsJapgolly.multicodec.multicodecInts.`96` = 96.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`96`]
    
    inline def `9728292`: typingsJapgolly.multicodec.multicodecInts.`9728292` = 9728292.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`9728292`]
    
    inline def `9793828`: typingsJapgolly.multicodec.multicodecInts.`9793828` = 9793828.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`9793828`]
    
    inline def `99`: typingsJapgolly.multicodec.multicodecInts.`99` = 99.asInstanceOf[typingsJapgolly.multicodec.multicodecInts.`99`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.multicodec.multicodecStrings.identity_
    - typingsJapgolly.multicodec.multicodecStrings.cidv1_
    - typingsJapgolly.multicodec.multicodecStrings.cidv2_
    - typingsJapgolly.multicodec.multicodecStrings.cidv3_
    - typingsJapgolly.multicodec.multicodecStrings.ip4_
    - typingsJapgolly.multicodec.multicodecStrings.tcp_
    - typingsJapgolly.multicodec.multicodecStrings.sha1_
    - typingsJapgolly.multicodec.multicodecStrings.`sha2-256`
    - typingsJapgolly.multicodec.multicodecStrings.`sha2-512`
    - typingsJapgolly.multicodec.multicodecStrings.`sha3-512`
    - typingsJapgolly.multicodec.multicodecStrings.`sha3-384`
    - typingsJapgolly.multicodec.multicodecStrings.`sha3-256`
    - typingsJapgolly.multicodec.multicodecStrings.`sha3-224`
    - typingsJapgolly.multicodec.multicodecStrings.`shake-128`
    - typingsJapgolly.multicodec.multicodecStrings.`shake-256`
    - typingsJapgolly.multicodec.multicodecStrings.`keccak-224`
    - typingsJapgolly.multicodec.multicodecStrings.`keccak-256`
    - typingsJapgolly.multicodec.multicodecStrings.`keccak-384`
    - typingsJapgolly.multicodec.multicodecStrings.`keccak-512`
    - typingsJapgolly.multicodec.multicodecStrings.blake3_
    - typingsJapgolly.multicodec.multicodecStrings.dccp_
    - typingsJapgolly.multicodec.multicodecStrings.`murmur3-128`
    - typingsJapgolly.multicodec.multicodecStrings.`murmur3-32`
    - typingsJapgolly.multicodec.multicodecStrings.ip6_
    - typingsJapgolly.multicodec.multicodecStrings.ip6zone_
    - typingsJapgolly.multicodec.multicodecStrings.path_
    - typingsJapgolly.multicodec.multicodecStrings.multicodec_
    - typingsJapgolly.multicodec.multicodecStrings.multihash_
    - typingsJapgolly.multicodec.multicodecStrings.multiaddr_
    - typingsJapgolly.multicodec.multicodecStrings.multibase_
    - typingsJapgolly.multicodec.multicodecStrings.dns_
    - typingsJapgolly.multicodec.multicodecStrings.dns4_
    - typingsJapgolly.multicodec.multicodecStrings.dns6_
    - typingsJapgolly.multicodec.multicodecStrings.dnsaddr_
    - typingsJapgolly.multicodec.multicodecStrings.protobuf_
    - typingsJapgolly.multicodec.multicodecStrings.cbor_
    - typingsJapgolly.multicodec.multicodecStrings.raw_
    - typingsJapgolly.multicodec.multicodecStrings.`dbl-sha2-256`
    - typingsJapgolly.multicodec.multicodecStrings.rlp_
    - typingsJapgolly.multicodec.multicodecStrings.bencode_
    - typingsJapgolly.multicodec.multicodecStrings.`dag-pb`
    - typingsJapgolly.multicodec.multicodecStrings.`dag-cbor`
    - typingsJapgolly.multicodec.multicodecStrings.`libp2p-key`
    - typingsJapgolly.multicodec.multicodecStrings.`git-raw`
    - typingsJapgolly.multicodec.multicodecStrings.`torrent-info`
    - typingsJapgolly.multicodec.multicodecStrings.`torrent-file`
    - typingsJapgolly.multicodec.multicodecStrings.`leofcoin-block`
    - typingsJapgolly.multicodec.multicodecStrings.`leofcoin-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`leofcoin-pr`
    - typingsJapgolly.multicodec.multicodecStrings.sctp_
    - typingsJapgolly.multicodec.multicodecStrings.`dag-jose`
    - typingsJapgolly.multicodec.multicodecStrings.`dag-cose`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-block`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-block-list`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-tx-trie`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt-trie`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-state-trie`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-account-snapshot`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-storage-trie`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-receipt-log-trie`
    - typingsJapgolly.multicodec.multicodecStrings.`eth-reciept-log`
    - typingsJapgolly.multicodec.multicodecStrings.`bitcoin-block`
    - typingsJapgolly.multicodec.multicodecStrings.`bitcoin-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`bitcoin-witness-commitment`
    - typingsJapgolly.multicodec.multicodecStrings.`zcash-block`
    - typingsJapgolly.multicodec.multicodecStrings.`zcash-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`caip-50`
    - typingsJapgolly.multicodec.multicodecStrings.streamid_
    - typingsJapgolly.multicodec.multicodecStrings.`stellar-block`
    - typingsJapgolly.multicodec.multicodecStrings.`stellar-tx`
    - typingsJapgolly.multicodec.multicodecStrings.md4_
    - typingsJapgolly.multicodec.multicodecStrings.md5_
    - typingsJapgolly.multicodec.multicodecStrings.bmt_
    - typingsJapgolly.multicodec.multicodecStrings.`decred-block`
    - typingsJapgolly.multicodec.multicodecStrings.`decred-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`ipld-ns`
    - typingsJapgolly.multicodec.multicodecStrings.`ipfs-ns`
    - typingsJapgolly.multicodec.multicodecStrings.`swarm-ns`
    - typingsJapgolly.multicodec.multicodecStrings.`ipns-ns`
    - typingsJapgolly.multicodec.multicodecStrings.zeronet_
    - typingsJapgolly.multicodec.multicodecStrings.`secp256k1-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g2-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`x25519-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`ed25519-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1g2-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`dash-block`
    - typingsJapgolly.multicodec.multicodecStrings.`dash-tx`
    - typingsJapgolly.multicodec.multicodecStrings.`swarm-manifest`
    - typingsJapgolly.multicodec.multicodecStrings.`swarm-feed`
    - typingsJapgolly.multicodec.multicodecStrings.udp_
    - typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-star`
    - typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-direct`
    - typingsJapgolly.multicodec.multicodecStrings.`p2p-stardust`
    - typingsJapgolly.multicodec.multicodecStrings.`p2p-circuit`
    - typingsJapgolly.multicodec.multicodecStrings.`dag-json`
    - typingsJapgolly.multicodec.multicodecStrings.udt_
    - typingsJapgolly.multicodec.multicodecStrings.utp_
    - typingsJapgolly.multicodec.multicodecStrings.unix_
    - typingsJapgolly.multicodec.multicodecStrings.thread_
    - typingsJapgolly.multicodec.multicodecStrings.p2p_
    - typingsJapgolly.multicodec.multicodecStrings.ipfs_
    - typingsJapgolly.multicodec.multicodecStrings.https_
    - typingsJapgolly.multicodec.multicodecStrings.onion_
    - typingsJapgolly.multicodec.multicodecStrings.onion3_
    - typingsJapgolly.multicodec.multicodecStrings.garlic64_
    - typingsJapgolly.multicodec.multicodecStrings.garlic32_
    - typingsJapgolly.multicodec.multicodecStrings.tls_
    - typingsJapgolly.multicodec.multicodecStrings.noise_
    - typingsJapgolly.multicodec.multicodecStrings.quic_
    - typingsJapgolly.multicodec.multicodecStrings.ws_
    - typingsJapgolly.multicodec.multicodecStrings.wss_
    - typingsJapgolly.multicodec.multicodecStrings.`p2p-websocket-star`
    - typingsJapgolly.multicodec.multicodecStrings.http_
    - typingsJapgolly.multicodec.multicodecStrings.`swhid-1-snp`
    - typingsJapgolly.multicodec.multicodecStrings.json_
    - typingsJapgolly.multicodec.multicodecStrings.messagepack_
    - typingsJapgolly.multicodec.multicodecStrings.`libp2p-peer-record`
    - typingsJapgolly.multicodec.multicodecStrings.`libp2p-relay-rsvp`
    - typingsJapgolly.multicodec.multicodecStrings.`car-index-sorted`
    - typingsJapgolly.multicodec.multicodecStrings.`sha2-256-trunc254-padded`
    - typingsJapgolly.multicodec.multicodecStrings.`ripemd-128`
    - typingsJapgolly.multicodec.multicodecStrings.`ripemd-160`
    - typingsJapgolly.multicodec.multicodecStrings.`ripemd-256`
    - typingsJapgolly.multicodec.multicodecStrings.`ripemd-320`
    - typingsJapgolly.multicodec.multicodecStrings.x11_
    - typingsJapgolly.multicodec.multicodecStrings.`p256-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`p384-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`p521-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`ed448-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`x448-pub`
    - typingsJapgolly.multicodec.multicodecStrings.`ed25519-priv`
    - typingsJapgolly.multicodec.multicodecStrings.`secp256k1-priv`
    - typingsJapgolly.multicodec.multicodecStrings.`x25519-priv`
    - typingsJapgolly.multicodec.multicodecStrings.kangarootwelve_
    - typingsJapgolly.multicodec.multicodecStrings.`sm3-256`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-8`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-16`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-24`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-32`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-40`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-48`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-56`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-64`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-72`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-80`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-88`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-96`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-104`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-112`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-120`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-128`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-136`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-144`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-152`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-160`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-168`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-176`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-184`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-192`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-200`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-208`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-216`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-224`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-232`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-240`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-248`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-256`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-264`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-272`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-280`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-288`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-296`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-304`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-312`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-320`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-328`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-336`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-344`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-352`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-360`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-368`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-376`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-384`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-392`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-400`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-408`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-416`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-424`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-432`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-440`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-448`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-456`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-464`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-472`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-480`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-488`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-496`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-504`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2b-512`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-8`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-16`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-24`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-32`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-40`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-48`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-56`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-64`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-72`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-80`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-88`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-96`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-104`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-112`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-120`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-128`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-136`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-144`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-152`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-160`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-168`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-176`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-184`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-192`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-200`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-208`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-216`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-224`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-232`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-240`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-248`
    - typingsJapgolly.multicodec.multicodecStrings.`blake2s-256`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-8`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-16`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-24`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-32`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-40`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-48`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-56`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-64`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-72`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-80`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-88`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-96`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-104`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-112`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-120`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-128`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-136`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-144`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-152`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-160`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-168`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-176`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-184`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-192`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-200`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-208`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-216`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-224`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-232`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-240`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-248`
    - typingsJapgolly.multicodec.multicodecStrings.`skein256-256`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-8`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-16`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-24`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-32`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-40`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-48`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-56`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-64`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-72`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-80`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-88`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-96`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-104`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-112`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-120`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-128`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-136`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-144`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-152`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-160`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-168`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-176`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-184`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-192`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-200`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-208`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-216`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-224`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-232`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-240`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-248`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-256`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-264`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-272`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-280`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-288`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-296`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-304`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-312`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-320`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-328`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-336`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-344`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-352`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-360`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-368`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-376`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-384`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-392`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-400`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-408`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-416`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-424`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-432`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-440`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-448`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-456`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-464`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-472`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-480`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-488`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-496`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-504`
    - typingsJapgolly.multicodec.multicodecStrings.`skein512-512`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-8`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-16`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-24`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-32`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-40`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-48`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-56`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-64`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-72`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-80`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-88`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-96`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-104`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-112`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-120`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-128`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-136`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-144`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-152`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-160`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-168`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-176`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-184`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-192`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-200`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-208`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-216`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-224`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-232`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-240`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-248`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-256`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-264`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-272`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-280`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-288`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-296`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-304`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-312`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-320`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-328`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-336`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-344`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-352`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-360`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-368`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-376`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-384`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-392`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-400`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-408`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-416`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-424`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-432`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-440`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-448`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-456`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-464`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-472`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-480`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-488`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-496`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-504`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-512`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-520`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-528`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-536`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-544`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-552`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-560`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-568`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-576`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-584`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-592`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-600`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-608`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-616`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-624`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-632`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-640`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-648`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-656`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-664`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-672`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-680`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-688`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-696`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-704`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-712`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-720`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-728`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-736`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-744`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-752`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-760`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-768`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-776`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-784`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-792`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-800`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-808`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-816`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-824`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-832`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-840`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-848`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-856`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-864`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-872`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-880`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-888`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-896`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-904`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-912`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-920`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-928`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-936`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-944`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-952`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-960`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-968`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-976`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-984`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-992`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-1000`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-1008`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-1016`
    - typingsJapgolly.multicodec.multicodecStrings.`skein1024-1024`
    - typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1`
    - typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc`
    - typingsJapgolly.multicodec.multicodecStrings.`zeroxcert-imprint-256`
    - typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-unsealed`
    - typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-sealed`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v0`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v1`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v0`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v1`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v0`
    - typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v1`
    - typingsJapgolly.multicodec.multicodecStrings.`skynet-ns`
    - typingsJapgolly.multicodec.multicodecStrings.`arweave-ns`
  */
  trait CodecName extends StObject
  object CodecName {
    
    inline def `arweave-ns`: typingsJapgolly.multicodec.multicodecStrings.`arweave-ns` = "arweave-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`arweave-ns`]
    
    inline def bencode: bencode_ = "bencode".asInstanceOf[bencode_]
    
    inline def `bitcoin-block`: typingsJapgolly.multicodec.multicodecStrings.`bitcoin-block` = "bitcoin-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bitcoin-block`]
    
    inline def `bitcoin-tx`: typingsJapgolly.multicodec.multicodecStrings.`bitcoin-tx` = "bitcoin-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bitcoin-tx`]
    
    inline def `bitcoin-witness-commitment`: typingsJapgolly.multicodec.multicodecStrings.`bitcoin-witness-commitment` = "bitcoin-witness-commitment".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bitcoin-witness-commitment`]
    
    inline def `blake2b-104`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-104` = "blake2b-104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-104`]
    
    inline def `blake2b-112`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-112` = "blake2b-112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-112`]
    
    inline def `blake2b-120`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-120` = "blake2b-120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-120`]
    
    inline def `blake2b-128`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-128` = "blake2b-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-128`]
    
    inline def `blake2b-136`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-136` = "blake2b-136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-136`]
    
    inline def `blake2b-144`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-144` = "blake2b-144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-144`]
    
    inline def `blake2b-152`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-152` = "blake2b-152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-152`]
    
    inline def `blake2b-16`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-16` = "blake2b-16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-16`]
    
    inline def `blake2b-160`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-160` = "blake2b-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-160`]
    
    inline def `blake2b-168`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-168` = "blake2b-168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-168`]
    
    inline def `blake2b-176`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-176` = "blake2b-176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-176`]
    
    inline def `blake2b-184`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-184` = "blake2b-184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-184`]
    
    inline def `blake2b-192`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-192` = "blake2b-192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-192`]
    
    inline def `blake2b-200`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-200` = "blake2b-200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-200`]
    
    inline def `blake2b-208`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-208` = "blake2b-208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-208`]
    
    inline def `blake2b-216`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-216` = "blake2b-216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-216`]
    
    inline def `blake2b-224`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-224` = "blake2b-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-224`]
    
    inline def `blake2b-232`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-232` = "blake2b-232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-232`]
    
    inline def `blake2b-24`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-24` = "blake2b-24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-24`]
    
    inline def `blake2b-240`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-240` = "blake2b-240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-240`]
    
    inline def `blake2b-248`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-248` = "blake2b-248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-248`]
    
    inline def `blake2b-256`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-256` = "blake2b-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-256`]
    
    inline def `blake2b-264`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-264` = "blake2b-264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-264`]
    
    inline def `blake2b-272`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-272` = "blake2b-272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-272`]
    
    inline def `blake2b-280`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-280` = "blake2b-280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-280`]
    
    inline def `blake2b-288`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-288` = "blake2b-288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-288`]
    
    inline def `blake2b-296`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-296` = "blake2b-296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-296`]
    
    inline def `blake2b-304`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-304` = "blake2b-304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-304`]
    
    inline def `blake2b-312`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-312` = "blake2b-312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-312`]
    
    inline def `blake2b-32`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-32` = "blake2b-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-32`]
    
    inline def `blake2b-320`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-320` = "blake2b-320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-320`]
    
    inline def `blake2b-328`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-328` = "blake2b-328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-328`]
    
    inline def `blake2b-336`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-336` = "blake2b-336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-336`]
    
    inline def `blake2b-344`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-344` = "blake2b-344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-344`]
    
    inline def `blake2b-352`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-352` = "blake2b-352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-352`]
    
    inline def `blake2b-360`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-360` = "blake2b-360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-360`]
    
    inline def `blake2b-368`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-368` = "blake2b-368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-368`]
    
    inline def `blake2b-376`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-376` = "blake2b-376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-376`]
    
    inline def `blake2b-384`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-384` = "blake2b-384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-384`]
    
    inline def `blake2b-392`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-392` = "blake2b-392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-392`]
    
    inline def `blake2b-40`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-40` = "blake2b-40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-40`]
    
    inline def `blake2b-400`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-400` = "blake2b-400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-400`]
    
    inline def `blake2b-408`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-408` = "blake2b-408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-408`]
    
    inline def `blake2b-416`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-416` = "blake2b-416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-416`]
    
    inline def `blake2b-424`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-424` = "blake2b-424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-424`]
    
    inline def `blake2b-432`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-432` = "blake2b-432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-432`]
    
    inline def `blake2b-440`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-440` = "blake2b-440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-440`]
    
    inline def `blake2b-448`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-448` = "blake2b-448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-448`]
    
    inline def `blake2b-456`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-456` = "blake2b-456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-456`]
    
    inline def `blake2b-464`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-464` = "blake2b-464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-464`]
    
    inline def `blake2b-472`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-472` = "blake2b-472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-472`]
    
    inline def `blake2b-48`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-48` = "blake2b-48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-48`]
    
    inline def `blake2b-480`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-480` = "blake2b-480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-480`]
    
    inline def `blake2b-488`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-488` = "blake2b-488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-488`]
    
    inline def `blake2b-496`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-496` = "blake2b-496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-496`]
    
    inline def `blake2b-504`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-504` = "blake2b-504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-504`]
    
    inline def `blake2b-512`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-512` = "blake2b-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-512`]
    
    inline def `blake2b-56`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-56` = "blake2b-56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-56`]
    
    inline def `blake2b-64`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-64` = "blake2b-64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-64`]
    
    inline def `blake2b-72`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-72` = "blake2b-72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-72`]
    
    inline def `blake2b-8`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-8` = "blake2b-8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-8`]
    
    inline def `blake2b-80`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-80` = "blake2b-80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-80`]
    
    inline def `blake2b-88`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-88` = "blake2b-88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-88`]
    
    inline def `blake2b-96`: typingsJapgolly.multicodec.multicodecStrings.`blake2b-96` = "blake2b-96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2b-96`]
    
    inline def `blake2s-104`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-104` = "blake2s-104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-104`]
    
    inline def `blake2s-112`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-112` = "blake2s-112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-112`]
    
    inline def `blake2s-120`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-120` = "blake2s-120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-120`]
    
    inline def `blake2s-128`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-128` = "blake2s-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-128`]
    
    inline def `blake2s-136`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-136` = "blake2s-136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-136`]
    
    inline def `blake2s-144`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-144` = "blake2s-144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-144`]
    
    inline def `blake2s-152`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-152` = "blake2s-152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-152`]
    
    inline def `blake2s-16`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-16` = "blake2s-16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-16`]
    
    inline def `blake2s-160`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-160` = "blake2s-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-160`]
    
    inline def `blake2s-168`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-168` = "blake2s-168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-168`]
    
    inline def `blake2s-176`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-176` = "blake2s-176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-176`]
    
    inline def `blake2s-184`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-184` = "blake2s-184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-184`]
    
    inline def `blake2s-192`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-192` = "blake2s-192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-192`]
    
    inline def `blake2s-200`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-200` = "blake2s-200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-200`]
    
    inline def `blake2s-208`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-208` = "blake2s-208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-208`]
    
    inline def `blake2s-216`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-216` = "blake2s-216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-216`]
    
    inline def `blake2s-224`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-224` = "blake2s-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-224`]
    
    inline def `blake2s-232`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-232` = "blake2s-232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-232`]
    
    inline def `blake2s-24`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-24` = "blake2s-24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-24`]
    
    inline def `blake2s-240`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-240` = "blake2s-240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-240`]
    
    inline def `blake2s-248`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-248` = "blake2s-248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-248`]
    
    inline def `blake2s-256`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-256` = "blake2s-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-256`]
    
    inline def `blake2s-32`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-32` = "blake2s-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-32`]
    
    inline def `blake2s-40`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-40` = "blake2s-40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-40`]
    
    inline def `blake2s-48`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-48` = "blake2s-48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-48`]
    
    inline def `blake2s-56`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-56` = "blake2s-56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-56`]
    
    inline def `blake2s-64`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-64` = "blake2s-64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-64`]
    
    inline def `blake2s-72`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-72` = "blake2s-72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-72`]
    
    inline def `blake2s-8`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-8` = "blake2s-8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-8`]
    
    inline def `blake2s-80`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-80` = "blake2s-80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-80`]
    
    inline def `blake2s-88`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-88` = "blake2s-88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-88`]
    
    inline def `blake2s-96`: typingsJapgolly.multicodec.multicodecStrings.`blake2s-96` = "blake2s-96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`blake2s-96`]
    
    inline def blake3: blake3_ = "blake3".asInstanceOf[blake3_]
    
    inline def `bls12_381-g1-pub`: typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1-pub` = "bls12_381-g1-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1-pub`]
    
    inline def `bls12_381-g1g2-pub`: typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1g2-pub` = "bls12_381-g1g2-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g1g2-pub`]
    
    inline def `bls12_381-g2-pub`: typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g2-pub` = "bls12_381-g2-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`bls12_381-g2-pub`]
    
    inline def bmt: bmt_ = "bmt".asInstanceOf[bmt_]
    
    inline def `caip-50`: typingsJapgolly.multicodec.multicodecStrings.`caip-50` = "caip-50".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`caip-50`]
    
    inline def `car-index-sorted`: typingsJapgolly.multicodec.multicodecStrings.`car-index-sorted` = "car-index-sorted".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`car-index-sorted`]
    
    inline def cbor: cbor_ = "cbor".asInstanceOf[cbor_]
    
    inline def cidv1: cidv1_ = "cidv1".asInstanceOf[cidv1_]
    
    inline def cidv2: cidv2_ = "cidv2".asInstanceOf[cidv2_]
    
    inline def cidv3: cidv3_ = "cidv3".asInstanceOf[cidv3_]
    
    inline def `dag-cbor`: typingsJapgolly.multicodec.multicodecStrings.`dag-cbor` = "dag-cbor".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dag-cbor`]
    
    inline def `dag-cose`: typingsJapgolly.multicodec.multicodecStrings.`dag-cose` = "dag-cose".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dag-cose`]
    
    inline def `dag-jose`: typingsJapgolly.multicodec.multicodecStrings.`dag-jose` = "dag-jose".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dag-jose`]
    
    inline def `dag-json`: typingsJapgolly.multicodec.multicodecStrings.`dag-json` = "dag-json".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dag-json`]
    
    inline def `dag-pb`: typingsJapgolly.multicodec.multicodecStrings.`dag-pb` = "dag-pb".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dag-pb`]
    
    inline def `dash-block`: typingsJapgolly.multicodec.multicodecStrings.`dash-block` = "dash-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dash-block`]
    
    inline def `dash-tx`: typingsJapgolly.multicodec.multicodecStrings.`dash-tx` = "dash-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dash-tx`]
    
    inline def `dbl-sha2-256`: typingsJapgolly.multicodec.multicodecStrings.`dbl-sha2-256` = "dbl-sha2-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`dbl-sha2-256`]
    
    inline def dccp: dccp_ = "dccp".asInstanceOf[dccp_]
    
    inline def `decred-block`: typingsJapgolly.multicodec.multicodecStrings.`decred-block` = "decred-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`decred-block`]
    
    inline def `decred-tx`: typingsJapgolly.multicodec.multicodecStrings.`decred-tx` = "decred-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`decred-tx`]
    
    inline def dns: dns_ = "dns".asInstanceOf[dns_]
    
    inline def dns4: dns4_ = "dns4".asInstanceOf[dns4_]
    
    inline def dns6: dns6_ = "dns6".asInstanceOf[dns6_]
    
    inline def dnsaddr: dnsaddr_ = "dnsaddr".asInstanceOf[dnsaddr_]
    
    inline def `ed25519-priv`: typingsJapgolly.multicodec.multicodecStrings.`ed25519-priv` = "ed25519-priv".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ed25519-priv`]
    
    inline def `ed25519-pub`: typingsJapgolly.multicodec.multicodecStrings.`ed25519-pub` = "ed25519-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ed25519-pub`]
    
    inline def `ed448-pub`: typingsJapgolly.multicodec.multicodecStrings.`ed448-pub` = "ed448-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ed448-pub`]
    
    inline def `eth-account-snapshot`: typingsJapgolly.multicodec.multicodecStrings.`eth-account-snapshot` = "eth-account-snapshot".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-account-snapshot`]
    
    inline def `eth-block`: typingsJapgolly.multicodec.multicodecStrings.`eth-block` = "eth-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-block`]
    
    inline def `eth-block-list`: typingsJapgolly.multicodec.multicodecStrings.`eth-block-list` = "eth-block-list".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-block-list`]
    
    inline def `eth-receipt-log-trie`: typingsJapgolly.multicodec.multicodecStrings.`eth-receipt-log-trie` = "eth-receipt-log-trie".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-receipt-log-trie`]
    
    inline def `eth-reciept-log`: typingsJapgolly.multicodec.multicodecStrings.`eth-reciept-log` = "eth-reciept-log".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-reciept-log`]
    
    inline def `eth-state-trie`: typingsJapgolly.multicodec.multicodecStrings.`eth-state-trie` = "eth-state-trie".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-state-trie`]
    
    inline def `eth-storage-trie`: typingsJapgolly.multicodec.multicodecStrings.`eth-storage-trie` = "eth-storage-trie".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-storage-trie`]
    
    inline def `eth-tx`: typingsJapgolly.multicodec.multicodecStrings.`eth-tx` = "eth-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-tx`]
    
    inline def `eth-tx-receipt`: typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt` = "eth-tx-receipt".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt`]
    
    inline def `eth-tx-receipt-trie`: typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt-trie` = "eth-tx-receipt-trie".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-tx-receipt-trie`]
    
    inline def `eth-tx-trie`: typingsJapgolly.multicodec.multicodecStrings.`eth-tx-trie` = "eth-tx-trie".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`eth-tx-trie`]
    
    inline def `fil-commitment-sealed`: typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-sealed` = "fil-commitment-sealed".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-sealed`]
    
    inline def `fil-commitment-unsealed`: typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-unsealed` = "fil-commitment-unsealed".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`fil-commitment-unsealed`]
    
    inline def garlic32: garlic32_ = "garlic32".asInstanceOf[garlic32_]
    
    inline def garlic64: garlic64_ = "garlic64".asInstanceOf[garlic64_]
    
    inline def `git-raw`: typingsJapgolly.multicodec.multicodecStrings.`git-raw` = "git-raw".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`git-raw`]
    
    inline def `holochain-adr-v0`: typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v0` = "holochain-adr-v0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v0`]
    
    inline def `holochain-adr-v1`: typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v1` = "holochain-adr-v1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-adr-v1`]
    
    inline def `holochain-key-v0`: typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v0` = "holochain-key-v0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v0`]
    
    inline def `holochain-key-v1`: typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v1` = "holochain-key-v1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-key-v1`]
    
    inline def `holochain-sig-v0`: typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v0` = "holochain-sig-v0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v0`]
    
    inline def `holochain-sig-v1`: typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v1` = "holochain-sig-v1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`holochain-sig-v1`]
    
    inline def http: http_ = "http".asInstanceOf[http_]
    
    inline def https: https_ = "https".asInstanceOf[https_]
    
    inline def identity: identity_ = "identity".asInstanceOf[identity_]
    
    inline def ip4: ip4_ = "ip4".asInstanceOf[ip4_]
    
    inline def ip6: ip6_ = "ip6".asInstanceOf[ip6_]
    
    inline def ip6zone: ip6zone_ = "ip6zone".asInstanceOf[ip6zone_]
    
    inline def ipfs: ipfs_ = "ipfs".asInstanceOf[ipfs_]
    
    inline def `ipfs-ns`: typingsJapgolly.multicodec.multicodecStrings.`ipfs-ns` = "ipfs-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ipfs-ns`]
    
    inline def `ipld-ns`: typingsJapgolly.multicodec.multicodecStrings.`ipld-ns` = "ipld-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ipld-ns`]
    
    inline def `ipns-ns`: typingsJapgolly.multicodec.multicodecStrings.`ipns-ns` = "ipns-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ipns-ns`]
    
    inline def json: json_ = "json".asInstanceOf[json_]
    
    inline def kangarootwelve: kangarootwelve_ = "kangarootwelve".asInstanceOf[kangarootwelve_]
    
    inline def `keccak-224`: typingsJapgolly.multicodec.multicodecStrings.`keccak-224` = "keccak-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`keccak-224`]
    
    inline def `keccak-256`: typingsJapgolly.multicodec.multicodecStrings.`keccak-256` = "keccak-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`keccak-256`]
    
    inline def `keccak-384`: typingsJapgolly.multicodec.multicodecStrings.`keccak-384` = "keccak-384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`keccak-384`]
    
    inline def `keccak-512`: typingsJapgolly.multicodec.multicodecStrings.`keccak-512` = "keccak-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`keccak-512`]
    
    inline def `leofcoin-block`: typingsJapgolly.multicodec.multicodecStrings.`leofcoin-block` = "leofcoin-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`leofcoin-block`]
    
    inline def `leofcoin-pr`: typingsJapgolly.multicodec.multicodecStrings.`leofcoin-pr` = "leofcoin-pr".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`leofcoin-pr`]
    
    inline def `leofcoin-tx`: typingsJapgolly.multicodec.multicodecStrings.`leofcoin-tx` = "leofcoin-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`leofcoin-tx`]
    
    inline def `libp2p-key`: typingsJapgolly.multicodec.multicodecStrings.`libp2p-key` = "libp2p-key".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`libp2p-key`]
    
    inline def `libp2p-peer-record`: typingsJapgolly.multicodec.multicodecStrings.`libp2p-peer-record` = "libp2p-peer-record".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`libp2p-peer-record`]
    
    inline def `libp2p-relay-rsvp`: typingsJapgolly.multicodec.multicodecStrings.`libp2p-relay-rsvp` = "libp2p-relay-rsvp".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`libp2p-relay-rsvp`]
    
    inline def md4: md4_ = "md4".asInstanceOf[md4_]
    
    inline def md5: md5_ = "md5".asInstanceOf[md5_]
    
    inline def messagepack: messagepack_ = "messagepack".asInstanceOf[messagepack_]
    
    inline def multiaddr: multiaddr_ = "multiaddr".asInstanceOf[multiaddr_]
    
    inline def multibase: multibase_ = "multibase".asInstanceOf[multibase_]
    
    inline def multicodec: multicodec_ = "multicodec".asInstanceOf[multicodec_]
    
    inline def multihash: multihash_ = "multihash".asInstanceOf[multihash_]
    
    inline def `murmur3-128`: typingsJapgolly.multicodec.multicodecStrings.`murmur3-128` = "murmur3-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`murmur3-128`]
    
    inline def `murmur3-32`: typingsJapgolly.multicodec.multicodecStrings.`murmur3-32` = "murmur3-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`murmur3-32`]
    
    inline def noise: noise_ = "noise".asInstanceOf[noise_]
    
    inline def onion: onion_ = "onion".asInstanceOf[onion_]
    
    inline def onion3: onion3_ = "onion3".asInstanceOf[onion3_]
    
    inline def `p256-pub`: typingsJapgolly.multicodec.multicodecStrings.`p256-pub` = "p256-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p256-pub`]
    
    inline def p2p: p2p_ = "p2p".asInstanceOf[p2p_]
    
    inline def `p2p-circuit`: typingsJapgolly.multicodec.multicodecStrings.`p2p-circuit` = "p2p-circuit".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p2p-circuit`]
    
    inline def `p2p-stardust`: typingsJapgolly.multicodec.multicodecStrings.`p2p-stardust` = "p2p-stardust".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p2p-stardust`]
    
    inline def `p2p-webrtc-direct`: typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-direct` = "p2p-webrtc-direct".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-direct`]
    
    inline def `p2p-webrtc-star`: typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-star` = "p2p-webrtc-star".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p2p-webrtc-star`]
    
    inline def `p2p-websocket-star`: typingsJapgolly.multicodec.multicodecStrings.`p2p-websocket-star` = "p2p-websocket-star".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p2p-websocket-star`]
    
    inline def `p384-pub`: typingsJapgolly.multicodec.multicodecStrings.`p384-pub` = "p384-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p384-pub`]
    
    inline def `p521-pub`: typingsJapgolly.multicodec.multicodecStrings.`p521-pub` = "p521-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`p521-pub`]
    
    inline def path: path_ = "path".asInstanceOf[path_]
    
    inline def `poseidon-bls12_381-a2-fc1`: typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1` = "poseidon-bls12_381-a2-fc1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1`]
    
    inline def `poseidon-bls12_381-a2-fc1-sc`: typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc` = "poseidon-bls12_381-a2-fc1-sc".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`poseidon-bls12_381-a2-fc1-sc`]
    
    inline def protobuf: protobuf_ = "protobuf".asInstanceOf[protobuf_]
    
    inline def quic: quic_ = "quic".asInstanceOf[quic_]
    
    inline def raw: raw_ = "raw".asInstanceOf[raw_]
    
    inline def `ripemd-128`: typingsJapgolly.multicodec.multicodecStrings.`ripemd-128` = "ripemd-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ripemd-128`]
    
    inline def `ripemd-160`: typingsJapgolly.multicodec.multicodecStrings.`ripemd-160` = "ripemd-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ripemd-160`]
    
    inline def `ripemd-256`: typingsJapgolly.multicodec.multicodecStrings.`ripemd-256` = "ripemd-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ripemd-256`]
    
    inline def `ripemd-320`: typingsJapgolly.multicodec.multicodecStrings.`ripemd-320` = "ripemd-320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`ripemd-320`]
    
    inline def rlp: rlp_ = "rlp".asInstanceOf[rlp_]
    
    inline def sctp: sctp_ = "sctp".asInstanceOf[sctp_]
    
    inline def `secp256k1-priv`: typingsJapgolly.multicodec.multicodecStrings.`secp256k1-priv` = "secp256k1-priv".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`secp256k1-priv`]
    
    inline def `secp256k1-pub`: typingsJapgolly.multicodec.multicodecStrings.`secp256k1-pub` = "secp256k1-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`secp256k1-pub`]
    
    inline def sha1: sha1_ = "sha1".asInstanceOf[sha1_]
    
    inline def `sha2-256`: typingsJapgolly.multicodec.multicodecStrings.`sha2-256` = "sha2-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha2-256`]
    
    inline def `sha2-256-trunc254-padded`: typingsJapgolly.multicodec.multicodecStrings.`sha2-256-trunc254-padded` = "sha2-256-trunc254-padded".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha2-256-trunc254-padded`]
    
    inline def `sha2-512`: typingsJapgolly.multicodec.multicodecStrings.`sha2-512` = "sha2-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha2-512`]
    
    inline def `sha3-224`: typingsJapgolly.multicodec.multicodecStrings.`sha3-224` = "sha3-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha3-224`]
    
    inline def `sha3-256`: typingsJapgolly.multicodec.multicodecStrings.`sha3-256` = "sha3-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha3-256`]
    
    inline def `sha3-384`: typingsJapgolly.multicodec.multicodecStrings.`sha3-384` = "sha3-384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha3-384`]
    
    inline def `sha3-512`: typingsJapgolly.multicodec.multicodecStrings.`sha3-512` = "sha3-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sha3-512`]
    
    inline def `shake-128`: typingsJapgolly.multicodec.multicodecStrings.`shake-128` = "shake-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`shake-128`]
    
    inline def `shake-256`: typingsJapgolly.multicodec.multicodecStrings.`shake-256` = "shake-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`shake-256`]
    
    inline def `skein1024-1000`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-1000` = "skein1024-1000".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-1000`]
    
    inline def `skein1024-1008`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-1008` = "skein1024-1008".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-1008`]
    
    inline def `skein1024-1016`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-1016` = "skein1024-1016".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-1016`]
    
    inline def `skein1024-1024`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-1024` = "skein1024-1024".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-1024`]
    
    inline def `skein1024-104`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-104` = "skein1024-104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-104`]
    
    inline def `skein1024-112`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-112` = "skein1024-112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-112`]
    
    inline def `skein1024-120`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-120` = "skein1024-120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-120`]
    
    inline def `skein1024-128`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-128` = "skein1024-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-128`]
    
    inline def `skein1024-136`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-136` = "skein1024-136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-136`]
    
    inline def `skein1024-144`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-144` = "skein1024-144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-144`]
    
    inline def `skein1024-152`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-152` = "skein1024-152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-152`]
    
    inline def `skein1024-16`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-16` = "skein1024-16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-16`]
    
    inline def `skein1024-160`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-160` = "skein1024-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-160`]
    
    inline def `skein1024-168`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-168` = "skein1024-168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-168`]
    
    inline def `skein1024-176`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-176` = "skein1024-176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-176`]
    
    inline def `skein1024-184`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-184` = "skein1024-184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-184`]
    
    inline def `skein1024-192`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-192` = "skein1024-192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-192`]
    
    inline def `skein1024-200`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-200` = "skein1024-200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-200`]
    
    inline def `skein1024-208`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-208` = "skein1024-208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-208`]
    
    inline def `skein1024-216`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-216` = "skein1024-216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-216`]
    
    inline def `skein1024-224`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-224` = "skein1024-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-224`]
    
    inline def `skein1024-232`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-232` = "skein1024-232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-232`]
    
    inline def `skein1024-24`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-24` = "skein1024-24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-24`]
    
    inline def `skein1024-240`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-240` = "skein1024-240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-240`]
    
    inline def `skein1024-248`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-248` = "skein1024-248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-248`]
    
    inline def `skein1024-256`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-256` = "skein1024-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-256`]
    
    inline def `skein1024-264`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-264` = "skein1024-264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-264`]
    
    inline def `skein1024-272`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-272` = "skein1024-272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-272`]
    
    inline def `skein1024-280`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-280` = "skein1024-280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-280`]
    
    inline def `skein1024-288`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-288` = "skein1024-288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-288`]
    
    inline def `skein1024-296`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-296` = "skein1024-296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-296`]
    
    inline def `skein1024-304`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-304` = "skein1024-304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-304`]
    
    inline def `skein1024-312`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-312` = "skein1024-312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-312`]
    
    inline def `skein1024-32`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-32` = "skein1024-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-32`]
    
    inline def `skein1024-320`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-320` = "skein1024-320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-320`]
    
    inline def `skein1024-328`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-328` = "skein1024-328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-328`]
    
    inline def `skein1024-336`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-336` = "skein1024-336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-336`]
    
    inline def `skein1024-344`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-344` = "skein1024-344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-344`]
    
    inline def `skein1024-352`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-352` = "skein1024-352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-352`]
    
    inline def `skein1024-360`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-360` = "skein1024-360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-360`]
    
    inline def `skein1024-368`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-368` = "skein1024-368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-368`]
    
    inline def `skein1024-376`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-376` = "skein1024-376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-376`]
    
    inline def `skein1024-384`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-384` = "skein1024-384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-384`]
    
    inline def `skein1024-392`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-392` = "skein1024-392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-392`]
    
    inline def `skein1024-40`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-40` = "skein1024-40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-40`]
    
    inline def `skein1024-400`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-400` = "skein1024-400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-400`]
    
    inline def `skein1024-408`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-408` = "skein1024-408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-408`]
    
    inline def `skein1024-416`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-416` = "skein1024-416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-416`]
    
    inline def `skein1024-424`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-424` = "skein1024-424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-424`]
    
    inline def `skein1024-432`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-432` = "skein1024-432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-432`]
    
    inline def `skein1024-440`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-440` = "skein1024-440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-440`]
    
    inline def `skein1024-448`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-448` = "skein1024-448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-448`]
    
    inline def `skein1024-456`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-456` = "skein1024-456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-456`]
    
    inline def `skein1024-464`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-464` = "skein1024-464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-464`]
    
    inline def `skein1024-472`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-472` = "skein1024-472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-472`]
    
    inline def `skein1024-48`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-48` = "skein1024-48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-48`]
    
    inline def `skein1024-480`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-480` = "skein1024-480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-480`]
    
    inline def `skein1024-488`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-488` = "skein1024-488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-488`]
    
    inline def `skein1024-496`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-496` = "skein1024-496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-496`]
    
    inline def `skein1024-504`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-504` = "skein1024-504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-504`]
    
    inline def `skein1024-512`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-512` = "skein1024-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-512`]
    
    inline def `skein1024-520`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-520` = "skein1024-520".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-520`]
    
    inline def `skein1024-528`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-528` = "skein1024-528".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-528`]
    
    inline def `skein1024-536`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-536` = "skein1024-536".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-536`]
    
    inline def `skein1024-544`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-544` = "skein1024-544".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-544`]
    
    inline def `skein1024-552`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-552` = "skein1024-552".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-552`]
    
    inline def `skein1024-56`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-56` = "skein1024-56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-56`]
    
    inline def `skein1024-560`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-560` = "skein1024-560".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-560`]
    
    inline def `skein1024-568`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-568` = "skein1024-568".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-568`]
    
    inline def `skein1024-576`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-576` = "skein1024-576".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-576`]
    
    inline def `skein1024-584`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-584` = "skein1024-584".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-584`]
    
    inline def `skein1024-592`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-592` = "skein1024-592".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-592`]
    
    inline def `skein1024-600`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-600` = "skein1024-600".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-600`]
    
    inline def `skein1024-608`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-608` = "skein1024-608".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-608`]
    
    inline def `skein1024-616`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-616` = "skein1024-616".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-616`]
    
    inline def `skein1024-624`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-624` = "skein1024-624".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-624`]
    
    inline def `skein1024-632`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-632` = "skein1024-632".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-632`]
    
    inline def `skein1024-64`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-64` = "skein1024-64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-64`]
    
    inline def `skein1024-640`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-640` = "skein1024-640".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-640`]
    
    inline def `skein1024-648`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-648` = "skein1024-648".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-648`]
    
    inline def `skein1024-656`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-656` = "skein1024-656".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-656`]
    
    inline def `skein1024-664`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-664` = "skein1024-664".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-664`]
    
    inline def `skein1024-672`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-672` = "skein1024-672".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-672`]
    
    inline def `skein1024-680`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-680` = "skein1024-680".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-680`]
    
    inline def `skein1024-688`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-688` = "skein1024-688".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-688`]
    
    inline def `skein1024-696`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-696` = "skein1024-696".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-696`]
    
    inline def `skein1024-704`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-704` = "skein1024-704".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-704`]
    
    inline def `skein1024-712`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-712` = "skein1024-712".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-712`]
    
    inline def `skein1024-72`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-72` = "skein1024-72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-72`]
    
    inline def `skein1024-720`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-720` = "skein1024-720".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-720`]
    
    inline def `skein1024-728`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-728` = "skein1024-728".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-728`]
    
    inline def `skein1024-736`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-736` = "skein1024-736".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-736`]
    
    inline def `skein1024-744`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-744` = "skein1024-744".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-744`]
    
    inline def `skein1024-752`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-752` = "skein1024-752".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-752`]
    
    inline def `skein1024-760`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-760` = "skein1024-760".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-760`]
    
    inline def `skein1024-768`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-768` = "skein1024-768".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-768`]
    
    inline def `skein1024-776`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-776` = "skein1024-776".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-776`]
    
    inline def `skein1024-784`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-784` = "skein1024-784".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-784`]
    
    inline def `skein1024-792`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-792` = "skein1024-792".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-792`]
    
    inline def `skein1024-8`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-8` = "skein1024-8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-8`]
    
    inline def `skein1024-80`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-80` = "skein1024-80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-80`]
    
    inline def `skein1024-800`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-800` = "skein1024-800".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-800`]
    
    inline def `skein1024-808`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-808` = "skein1024-808".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-808`]
    
    inline def `skein1024-816`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-816` = "skein1024-816".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-816`]
    
    inline def `skein1024-824`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-824` = "skein1024-824".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-824`]
    
    inline def `skein1024-832`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-832` = "skein1024-832".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-832`]
    
    inline def `skein1024-840`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-840` = "skein1024-840".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-840`]
    
    inline def `skein1024-848`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-848` = "skein1024-848".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-848`]
    
    inline def `skein1024-856`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-856` = "skein1024-856".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-856`]
    
    inline def `skein1024-864`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-864` = "skein1024-864".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-864`]
    
    inline def `skein1024-872`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-872` = "skein1024-872".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-872`]
    
    inline def `skein1024-88`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-88` = "skein1024-88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-88`]
    
    inline def `skein1024-880`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-880` = "skein1024-880".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-880`]
    
    inline def `skein1024-888`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-888` = "skein1024-888".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-888`]
    
    inline def `skein1024-896`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-896` = "skein1024-896".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-896`]
    
    inline def `skein1024-904`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-904` = "skein1024-904".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-904`]
    
    inline def `skein1024-912`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-912` = "skein1024-912".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-912`]
    
    inline def `skein1024-920`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-920` = "skein1024-920".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-920`]
    
    inline def `skein1024-928`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-928` = "skein1024-928".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-928`]
    
    inline def `skein1024-936`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-936` = "skein1024-936".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-936`]
    
    inline def `skein1024-944`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-944` = "skein1024-944".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-944`]
    
    inline def `skein1024-952`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-952` = "skein1024-952".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-952`]
    
    inline def `skein1024-96`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-96` = "skein1024-96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-96`]
    
    inline def `skein1024-960`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-960` = "skein1024-960".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-960`]
    
    inline def `skein1024-968`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-968` = "skein1024-968".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-968`]
    
    inline def `skein1024-976`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-976` = "skein1024-976".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-976`]
    
    inline def `skein1024-984`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-984` = "skein1024-984".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-984`]
    
    inline def `skein1024-992`: typingsJapgolly.multicodec.multicodecStrings.`skein1024-992` = "skein1024-992".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein1024-992`]
    
    inline def `skein256-104`: typingsJapgolly.multicodec.multicodecStrings.`skein256-104` = "skein256-104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-104`]
    
    inline def `skein256-112`: typingsJapgolly.multicodec.multicodecStrings.`skein256-112` = "skein256-112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-112`]
    
    inline def `skein256-120`: typingsJapgolly.multicodec.multicodecStrings.`skein256-120` = "skein256-120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-120`]
    
    inline def `skein256-128`: typingsJapgolly.multicodec.multicodecStrings.`skein256-128` = "skein256-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-128`]
    
    inline def `skein256-136`: typingsJapgolly.multicodec.multicodecStrings.`skein256-136` = "skein256-136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-136`]
    
    inline def `skein256-144`: typingsJapgolly.multicodec.multicodecStrings.`skein256-144` = "skein256-144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-144`]
    
    inline def `skein256-152`: typingsJapgolly.multicodec.multicodecStrings.`skein256-152` = "skein256-152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-152`]
    
    inline def `skein256-16`: typingsJapgolly.multicodec.multicodecStrings.`skein256-16` = "skein256-16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-16`]
    
    inline def `skein256-160`: typingsJapgolly.multicodec.multicodecStrings.`skein256-160` = "skein256-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-160`]
    
    inline def `skein256-168`: typingsJapgolly.multicodec.multicodecStrings.`skein256-168` = "skein256-168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-168`]
    
    inline def `skein256-176`: typingsJapgolly.multicodec.multicodecStrings.`skein256-176` = "skein256-176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-176`]
    
    inline def `skein256-184`: typingsJapgolly.multicodec.multicodecStrings.`skein256-184` = "skein256-184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-184`]
    
    inline def `skein256-192`: typingsJapgolly.multicodec.multicodecStrings.`skein256-192` = "skein256-192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-192`]
    
    inline def `skein256-200`: typingsJapgolly.multicodec.multicodecStrings.`skein256-200` = "skein256-200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-200`]
    
    inline def `skein256-208`: typingsJapgolly.multicodec.multicodecStrings.`skein256-208` = "skein256-208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-208`]
    
    inline def `skein256-216`: typingsJapgolly.multicodec.multicodecStrings.`skein256-216` = "skein256-216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-216`]
    
    inline def `skein256-224`: typingsJapgolly.multicodec.multicodecStrings.`skein256-224` = "skein256-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-224`]
    
    inline def `skein256-232`: typingsJapgolly.multicodec.multicodecStrings.`skein256-232` = "skein256-232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-232`]
    
    inline def `skein256-24`: typingsJapgolly.multicodec.multicodecStrings.`skein256-24` = "skein256-24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-24`]
    
    inline def `skein256-240`: typingsJapgolly.multicodec.multicodecStrings.`skein256-240` = "skein256-240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-240`]
    
    inline def `skein256-248`: typingsJapgolly.multicodec.multicodecStrings.`skein256-248` = "skein256-248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-248`]
    
    inline def `skein256-256`: typingsJapgolly.multicodec.multicodecStrings.`skein256-256` = "skein256-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-256`]
    
    inline def `skein256-32`: typingsJapgolly.multicodec.multicodecStrings.`skein256-32` = "skein256-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-32`]
    
    inline def `skein256-40`: typingsJapgolly.multicodec.multicodecStrings.`skein256-40` = "skein256-40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-40`]
    
    inline def `skein256-48`: typingsJapgolly.multicodec.multicodecStrings.`skein256-48` = "skein256-48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-48`]
    
    inline def `skein256-56`: typingsJapgolly.multicodec.multicodecStrings.`skein256-56` = "skein256-56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-56`]
    
    inline def `skein256-64`: typingsJapgolly.multicodec.multicodecStrings.`skein256-64` = "skein256-64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-64`]
    
    inline def `skein256-72`: typingsJapgolly.multicodec.multicodecStrings.`skein256-72` = "skein256-72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-72`]
    
    inline def `skein256-8`: typingsJapgolly.multicodec.multicodecStrings.`skein256-8` = "skein256-8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-8`]
    
    inline def `skein256-80`: typingsJapgolly.multicodec.multicodecStrings.`skein256-80` = "skein256-80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-80`]
    
    inline def `skein256-88`: typingsJapgolly.multicodec.multicodecStrings.`skein256-88` = "skein256-88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-88`]
    
    inline def `skein256-96`: typingsJapgolly.multicodec.multicodecStrings.`skein256-96` = "skein256-96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein256-96`]
    
    inline def `skein512-104`: typingsJapgolly.multicodec.multicodecStrings.`skein512-104` = "skein512-104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-104`]
    
    inline def `skein512-112`: typingsJapgolly.multicodec.multicodecStrings.`skein512-112` = "skein512-112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-112`]
    
    inline def `skein512-120`: typingsJapgolly.multicodec.multicodecStrings.`skein512-120` = "skein512-120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-120`]
    
    inline def `skein512-128`: typingsJapgolly.multicodec.multicodecStrings.`skein512-128` = "skein512-128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-128`]
    
    inline def `skein512-136`: typingsJapgolly.multicodec.multicodecStrings.`skein512-136` = "skein512-136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-136`]
    
    inline def `skein512-144`: typingsJapgolly.multicodec.multicodecStrings.`skein512-144` = "skein512-144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-144`]
    
    inline def `skein512-152`: typingsJapgolly.multicodec.multicodecStrings.`skein512-152` = "skein512-152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-152`]
    
    inline def `skein512-16`: typingsJapgolly.multicodec.multicodecStrings.`skein512-16` = "skein512-16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-16`]
    
    inline def `skein512-160`: typingsJapgolly.multicodec.multicodecStrings.`skein512-160` = "skein512-160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-160`]
    
    inline def `skein512-168`: typingsJapgolly.multicodec.multicodecStrings.`skein512-168` = "skein512-168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-168`]
    
    inline def `skein512-176`: typingsJapgolly.multicodec.multicodecStrings.`skein512-176` = "skein512-176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-176`]
    
    inline def `skein512-184`: typingsJapgolly.multicodec.multicodecStrings.`skein512-184` = "skein512-184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-184`]
    
    inline def `skein512-192`: typingsJapgolly.multicodec.multicodecStrings.`skein512-192` = "skein512-192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-192`]
    
    inline def `skein512-200`: typingsJapgolly.multicodec.multicodecStrings.`skein512-200` = "skein512-200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-200`]
    
    inline def `skein512-208`: typingsJapgolly.multicodec.multicodecStrings.`skein512-208` = "skein512-208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-208`]
    
    inline def `skein512-216`: typingsJapgolly.multicodec.multicodecStrings.`skein512-216` = "skein512-216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-216`]
    
    inline def `skein512-224`: typingsJapgolly.multicodec.multicodecStrings.`skein512-224` = "skein512-224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-224`]
    
    inline def `skein512-232`: typingsJapgolly.multicodec.multicodecStrings.`skein512-232` = "skein512-232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-232`]
    
    inline def `skein512-24`: typingsJapgolly.multicodec.multicodecStrings.`skein512-24` = "skein512-24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-24`]
    
    inline def `skein512-240`: typingsJapgolly.multicodec.multicodecStrings.`skein512-240` = "skein512-240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-240`]
    
    inline def `skein512-248`: typingsJapgolly.multicodec.multicodecStrings.`skein512-248` = "skein512-248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-248`]
    
    inline def `skein512-256`: typingsJapgolly.multicodec.multicodecStrings.`skein512-256` = "skein512-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-256`]
    
    inline def `skein512-264`: typingsJapgolly.multicodec.multicodecStrings.`skein512-264` = "skein512-264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-264`]
    
    inline def `skein512-272`: typingsJapgolly.multicodec.multicodecStrings.`skein512-272` = "skein512-272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-272`]
    
    inline def `skein512-280`: typingsJapgolly.multicodec.multicodecStrings.`skein512-280` = "skein512-280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-280`]
    
    inline def `skein512-288`: typingsJapgolly.multicodec.multicodecStrings.`skein512-288` = "skein512-288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-288`]
    
    inline def `skein512-296`: typingsJapgolly.multicodec.multicodecStrings.`skein512-296` = "skein512-296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-296`]
    
    inline def `skein512-304`: typingsJapgolly.multicodec.multicodecStrings.`skein512-304` = "skein512-304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-304`]
    
    inline def `skein512-312`: typingsJapgolly.multicodec.multicodecStrings.`skein512-312` = "skein512-312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-312`]
    
    inline def `skein512-32`: typingsJapgolly.multicodec.multicodecStrings.`skein512-32` = "skein512-32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-32`]
    
    inline def `skein512-320`: typingsJapgolly.multicodec.multicodecStrings.`skein512-320` = "skein512-320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-320`]
    
    inline def `skein512-328`: typingsJapgolly.multicodec.multicodecStrings.`skein512-328` = "skein512-328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-328`]
    
    inline def `skein512-336`: typingsJapgolly.multicodec.multicodecStrings.`skein512-336` = "skein512-336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-336`]
    
    inline def `skein512-344`: typingsJapgolly.multicodec.multicodecStrings.`skein512-344` = "skein512-344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-344`]
    
    inline def `skein512-352`: typingsJapgolly.multicodec.multicodecStrings.`skein512-352` = "skein512-352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-352`]
    
    inline def `skein512-360`: typingsJapgolly.multicodec.multicodecStrings.`skein512-360` = "skein512-360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-360`]
    
    inline def `skein512-368`: typingsJapgolly.multicodec.multicodecStrings.`skein512-368` = "skein512-368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-368`]
    
    inline def `skein512-376`: typingsJapgolly.multicodec.multicodecStrings.`skein512-376` = "skein512-376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-376`]
    
    inline def `skein512-384`: typingsJapgolly.multicodec.multicodecStrings.`skein512-384` = "skein512-384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-384`]
    
    inline def `skein512-392`: typingsJapgolly.multicodec.multicodecStrings.`skein512-392` = "skein512-392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-392`]
    
    inline def `skein512-40`: typingsJapgolly.multicodec.multicodecStrings.`skein512-40` = "skein512-40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-40`]
    
    inline def `skein512-400`: typingsJapgolly.multicodec.multicodecStrings.`skein512-400` = "skein512-400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-400`]
    
    inline def `skein512-408`: typingsJapgolly.multicodec.multicodecStrings.`skein512-408` = "skein512-408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-408`]
    
    inline def `skein512-416`: typingsJapgolly.multicodec.multicodecStrings.`skein512-416` = "skein512-416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-416`]
    
    inline def `skein512-424`: typingsJapgolly.multicodec.multicodecStrings.`skein512-424` = "skein512-424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-424`]
    
    inline def `skein512-432`: typingsJapgolly.multicodec.multicodecStrings.`skein512-432` = "skein512-432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-432`]
    
    inline def `skein512-440`: typingsJapgolly.multicodec.multicodecStrings.`skein512-440` = "skein512-440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-440`]
    
    inline def `skein512-448`: typingsJapgolly.multicodec.multicodecStrings.`skein512-448` = "skein512-448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-448`]
    
    inline def `skein512-456`: typingsJapgolly.multicodec.multicodecStrings.`skein512-456` = "skein512-456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-456`]
    
    inline def `skein512-464`: typingsJapgolly.multicodec.multicodecStrings.`skein512-464` = "skein512-464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-464`]
    
    inline def `skein512-472`: typingsJapgolly.multicodec.multicodecStrings.`skein512-472` = "skein512-472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-472`]
    
    inline def `skein512-48`: typingsJapgolly.multicodec.multicodecStrings.`skein512-48` = "skein512-48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-48`]
    
    inline def `skein512-480`: typingsJapgolly.multicodec.multicodecStrings.`skein512-480` = "skein512-480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-480`]
    
    inline def `skein512-488`: typingsJapgolly.multicodec.multicodecStrings.`skein512-488` = "skein512-488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-488`]
    
    inline def `skein512-496`: typingsJapgolly.multicodec.multicodecStrings.`skein512-496` = "skein512-496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-496`]
    
    inline def `skein512-504`: typingsJapgolly.multicodec.multicodecStrings.`skein512-504` = "skein512-504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-504`]
    
    inline def `skein512-512`: typingsJapgolly.multicodec.multicodecStrings.`skein512-512` = "skein512-512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-512`]
    
    inline def `skein512-56`: typingsJapgolly.multicodec.multicodecStrings.`skein512-56` = "skein512-56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-56`]
    
    inline def `skein512-64`: typingsJapgolly.multicodec.multicodecStrings.`skein512-64` = "skein512-64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-64`]
    
    inline def `skein512-72`: typingsJapgolly.multicodec.multicodecStrings.`skein512-72` = "skein512-72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-72`]
    
    inline def `skein512-8`: typingsJapgolly.multicodec.multicodecStrings.`skein512-8` = "skein512-8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-8`]
    
    inline def `skein512-80`: typingsJapgolly.multicodec.multicodecStrings.`skein512-80` = "skein512-80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-80`]
    
    inline def `skein512-88`: typingsJapgolly.multicodec.multicodecStrings.`skein512-88` = "skein512-88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-88`]
    
    inline def `skein512-96`: typingsJapgolly.multicodec.multicodecStrings.`skein512-96` = "skein512-96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skein512-96`]
    
    inline def `skynet-ns`: typingsJapgolly.multicodec.multicodecStrings.`skynet-ns` = "skynet-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`skynet-ns`]
    
    inline def `sm3-256`: typingsJapgolly.multicodec.multicodecStrings.`sm3-256` = "sm3-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`sm3-256`]
    
    inline def `stellar-block`: typingsJapgolly.multicodec.multicodecStrings.`stellar-block` = "stellar-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`stellar-block`]
    
    inline def `stellar-tx`: typingsJapgolly.multicodec.multicodecStrings.`stellar-tx` = "stellar-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`stellar-tx`]
    
    inline def streamid: streamid_ = "streamid".asInstanceOf[streamid_]
    
    inline def `swarm-feed`: typingsJapgolly.multicodec.multicodecStrings.`swarm-feed` = "swarm-feed".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`swarm-feed`]
    
    inline def `swarm-manifest`: typingsJapgolly.multicodec.multicodecStrings.`swarm-manifest` = "swarm-manifest".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`swarm-manifest`]
    
    inline def `swarm-ns`: typingsJapgolly.multicodec.multicodecStrings.`swarm-ns` = "swarm-ns".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`swarm-ns`]
    
    inline def `swhid-1-snp`: typingsJapgolly.multicodec.multicodecStrings.`swhid-1-snp` = "swhid-1-snp".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`swhid-1-snp`]
    
    inline def tcp: tcp_ = "tcp".asInstanceOf[tcp_]
    
    inline def thread: thread_ = "thread".asInstanceOf[thread_]
    
    inline def tls: tls_ = "tls".asInstanceOf[tls_]
    
    inline def `torrent-file`: typingsJapgolly.multicodec.multicodecStrings.`torrent-file` = "torrent-file".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`torrent-file`]
    
    inline def `torrent-info`: typingsJapgolly.multicodec.multicodecStrings.`torrent-info` = "torrent-info".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`torrent-info`]
    
    inline def udp: udp_ = "udp".asInstanceOf[udp_]
    
    inline def udt: udt_ = "udt".asInstanceOf[udt_]
    
    inline def unix: unix_ = "unix".asInstanceOf[unix_]
    
    inline def utp: utp_ = "utp".asInstanceOf[utp_]
    
    inline def ws: ws_ = "ws".asInstanceOf[ws_]
    
    inline def wss: wss_ = "wss".asInstanceOf[wss_]
    
    inline def x11: x11_ = "x11".asInstanceOf[x11_]
    
    inline def `x25519-priv`: typingsJapgolly.multicodec.multicodecStrings.`x25519-priv` = "x25519-priv".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`x25519-priv`]
    
    inline def `x25519-pub`: typingsJapgolly.multicodec.multicodecStrings.`x25519-pub` = "x25519-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`x25519-pub`]
    
    inline def `x448-pub`: typingsJapgolly.multicodec.multicodecStrings.`x448-pub` = "x448-pub".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`x448-pub`]
    
    inline def `zcash-block`: typingsJapgolly.multicodec.multicodecStrings.`zcash-block` = "zcash-block".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`zcash-block`]
    
    inline def `zcash-tx`: typingsJapgolly.multicodec.multicodecStrings.`zcash-tx` = "zcash-tx".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`zcash-tx`]
    
    inline def zeronet: zeronet_ = "zeronet".asInstanceOf[zeronet_]
    
    inline def `zeroxcert-imprint-256`: typingsJapgolly.multicodec.multicodecStrings.`zeroxcert-imprint-256` = "zeroxcert-imprint-256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.`zeroxcert-imprint-256`]
  }
}
