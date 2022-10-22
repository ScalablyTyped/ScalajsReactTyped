package typingsJapgolly.multicodec

import typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecCode
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

object distSrcMapsMod {
  
  @JSImport("multicodec/dist/src/maps", "codeToName")
  @js.native
  val codeToName: CodeNameMap = js.native
  
  @JSImport("multicodec/dist/src/maps", "constantToCode")
  @js.native
  val constantToCode: ConstantCodeMap = js.native
  
  /* Inlined std.Readonly<std.Record<multicodec.multicodec/dist/src/generated-types.CodecName, multicodec.multicodec/dist/src/generated-types.CodecCode>> */
  object nameToCode {
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.arweave-ns")
    @js.native
    val arweaveNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bencode")
    @js.native
    val bencode: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bitcoin-block")
    @js.native
    val bitcoinBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bitcoin-tx")
    @js.native
    val bitcoinTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bitcoin-witness-commitment")
    @js.native
    val bitcoinWitnessCommitment: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-104")
    @js.native
    val blake2b104: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-112")
    @js.native
    val blake2b112: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-120")
    @js.native
    val blake2b120: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-128")
    @js.native
    val blake2b128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-136")
    @js.native
    val blake2b136: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-144")
    @js.native
    val blake2b144: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-152")
    @js.native
    val blake2b152: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-16")
    @js.native
    val blake2b16: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-160")
    @js.native
    val blake2b160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-168")
    @js.native
    val blake2b168: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-176")
    @js.native
    val blake2b176: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-184")
    @js.native
    val blake2b184: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-192")
    @js.native
    val blake2b192: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-200")
    @js.native
    val blake2b200: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-208")
    @js.native
    val blake2b208: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-216")
    @js.native
    val blake2b216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-224")
    @js.native
    val blake2b224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-232")
    @js.native
    val blake2b232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-24")
    @js.native
    val blake2b24: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-240")
    @js.native
    val blake2b240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-248")
    @js.native
    val blake2b248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-256")
    @js.native
    val blake2b256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-264")
    @js.native
    val blake2b264: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-272")
    @js.native
    val blake2b272: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-280")
    @js.native
    val blake2b280: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-288")
    @js.native
    val blake2b288: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-296")
    @js.native
    val blake2b296: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-304")
    @js.native
    val blake2b304: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-312")
    @js.native
    val blake2b312: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-32")
    @js.native
    val blake2b32: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-320")
    @js.native
    val blake2b320: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-328")
    @js.native
    val blake2b328: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-336")
    @js.native
    val blake2b336: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-344")
    @js.native
    val blake2b344: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-352")
    @js.native
    val blake2b352: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-360")
    @js.native
    val blake2b360: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-368")
    @js.native
    val blake2b368: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-376")
    @js.native
    val blake2b376: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-384")
    @js.native
    val blake2b384: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-392")
    @js.native
    val blake2b392: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-40")
    @js.native
    val blake2b40: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-400")
    @js.native
    val blake2b400: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-408")
    @js.native
    val blake2b408: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-416")
    @js.native
    val blake2b416: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-424")
    @js.native
    val blake2b424: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-432")
    @js.native
    val blake2b432: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-440")
    @js.native
    val blake2b440: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-448")
    @js.native
    val blake2b448: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-456")
    @js.native
    val blake2b456: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-464")
    @js.native
    val blake2b464: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-472")
    @js.native
    val blake2b472: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-48")
    @js.native
    val blake2b48: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-480")
    @js.native
    val blake2b480: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-488")
    @js.native
    val blake2b488: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-496")
    @js.native
    val blake2b496: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-504")
    @js.native
    val blake2b504: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-512")
    @js.native
    val blake2b512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-56")
    @js.native
    val blake2b56: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-64")
    @js.native
    val blake2b64: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-72")
    @js.native
    val blake2b72: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-8")
    @js.native
    val blake2b8: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-80")
    @js.native
    val blake2b80: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-88")
    @js.native
    val blake2b88: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2b-96")
    @js.native
    val blake2b96: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-104")
    @js.native
    val blake2s104: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-112")
    @js.native
    val blake2s112: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-120")
    @js.native
    val blake2s120: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-128")
    @js.native
    val blake2s128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-136")
    @js.native
    val blake2s136: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-144")
    @js.native
    val blake2s144: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-152")
    @js.native
    val blake2s152: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-16")
    @js.native
    val blake2s16: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-160")
    @js.native
    val blake2s160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-168")
    @js.native
    val blake2s168: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-176")
    @js.native
    val blake2s176: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-184")
    @js.native
    val blake2s184: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-192")
    @js.native
    val blake2s192: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-200")
    @js.native
    val blake2s200: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-208")
    @js.native
    val blake2s208: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-216")
    @js.native
    val blake2s216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-224")
    @js.native
    val blake2s224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-232")
    @js.native
    val blake2s232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-24")
    @js.native
    val blake2s24: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-240")
    @js.native
    val blake2s240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-248")
    @js.native
    val blake2s248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-256")
    @js.native
    val blake2s256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-32")
    @js.native
    val blake2s32: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-40")
    @js.native
    val blake2s40: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-48")
    @js.native
    val blake2s48: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-56")
    @js.native
    val blake2s56: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-64")
    @js.native
    val blake2s64: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-72")
    @js.native
    val blake2s72: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-8")
    @js.native
    val blake2s8: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-80")
    @js.native
    val blake2s80: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-88")
    @js.native
    val blake2s88: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake2s-96")
    @js.native
    val blake2s96: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.blake3")
    @js.native
    val blake3: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bls12_381-g1-pub")
    @js.native
    val bls12381G1Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bls12_381-g1g2-pub")
    @js.native
    val bls12381G1g2Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bls12_381-g2-pub")
    @js.native
    val bls12381G2Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.bmt")
    @js.native
    val bmt: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.caip-50")
    @js.native
    val caip50: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.car-index-sorted")
    @js.native
    val carIndexSorted: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.cbor")
    @js.native
    val cbor: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.cidv1")
    @js.native
    val cidv1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.cidv2")
    @js.native
    val cidv2: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.cidv3")
    @js.native
    val cidv3: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dag-cbor")
    @js.native
    val dagCbor: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dag-cose")
    @js.native
    val dagCose: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dag-jose")
    @js.native
    val dagJose: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dag-json")
    @js.native
    val dagJson: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dag-pb")
    @js.native
    val dagPb: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dash-block")
    @js.native
    val dashBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dash-tx")
    @js.native
    val dashTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dbl-sha2-256")
    @js.native
    val dblSha2256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dccp")
    @js.native
    val dccp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.decred-block")
    @js.native
    val decredBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.decred-tx")
    @js.native
    val decredTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dns")
    @js.native
    val dns: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dns4")
    @js.native
    val dns4: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dns6")
    @js.native
    val dns6: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.dnsaddr")
    @js.native
    val dnsaddr: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ed25519-priv")
    @js.native
    val ed25519Priv: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ed25519-pub")
    @js.native
    val ed25519Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ed448-pub")
    @js.native
    val ed448Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-account-snapshot")
    @js.native
    val ethAccountSnapshot: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-block")
    @js.native
    val ethBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-block-list")
    @js.native
    val ethBlockList: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-receipt-log-trie")
    @js.native
    val ethReceiptLogTrie: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-reciept-log")
    @js.native
    val ethRecieptLog: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-state-trie")
    @js.native
    val ethStateTrie: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-storage-trie")
    @js.native
    val ethStorageTrie: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-tx")
    @js.native
    val ethTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-tx-receipt")
    @js.native
    val ethTxReceipt: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-tx-receipt-trie")
    @js.native
    val ethTxReceiptTrie: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.eth-tx-trie")
    @js.native
    val ethTxTrie: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.fil-commitment-sealed")
    @js.native
    val filCommitmentSealed: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.fil-commitment-unsealed")
    @js.native
    val filCommitmentUnsealed: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.garlic32")
    @js.native
    val garlic32: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.garlic64")
    @js.native
    val garlic64: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.git-raw")
    @js.native
    val gitRaw: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-adr-v0")
    @js.native
    val holochainAdrV0: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-adr-v1")
    @js.native
    val holochainAdrV1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-key-v0")
    @js.native
    val holochainKeyV0: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-key-v1")
    @js.native
    val holochainKeyV1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-sig-v0")
    @js.native
    val holochainSigV0: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.holochain-sig-v1")
    @js.native
    val holochainSigV1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.http")
    @js.native
    val http: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.https")
    @js.native
    val https: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.identity")
    @js.native
    val identity: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ip4")
    @js.native
    val ip4: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ip6")
    @js.native
    val ip6: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ip6zone")
    @js.native
    val ip6zone: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ipfs")
    @js.native
    val ipfs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ipfs-ns")
    @js.native
    val ipfsNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ipld-ns")
    @js.native
    val ipldNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ipns-ns")
    @js.native
    val ipnsNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.json")
    @js.native
    val json: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.kangarootwelve")
    @js.native
    val kangarootwelve: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.keccak-224")
    @js.native
    val keccak224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.keccak-256")
    @js.native
    val keccak256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.keccak-384")
    @js.native
    val keccak384: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.keccak-512")
    @js.native
    val keccak512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.leofcoin-block")
    @js.native
    val leofcoinBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.leofcoin-pr")
    @js.native
    val leofcoinPr: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.leofcoin-tx")
    @js.native
    val leofcoinTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.libp2p-key")
    @js.native
    val libp2pKey: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.libp2p-peer-record")
    @js.native
    val libp2pPeerRecord: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.libp2p-relay-rsvp")
    @js.native
    val libp2pRelayRsvp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.md4")
    @js.native
    val md4: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.md5")
    @js.native
    val md5: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.messagepack")
    @js.native
    val messagepack: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.multiaddr")
    @js.native
    val multiaddr: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.multibase")
    @js.native
    val multibase: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.multicodec")
    @js.native
    val multicodec: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.multihash")
    @js.native
    val multihash: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.murmur3-128")
    @js.native
    val murmur3128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.murmur3-32")
    @js.native
    val murmur332: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.noise")
    @js.native
    val noise: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.onion")
    @js.native
    val onion: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.onion3")
    @js.native
    val onion3: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p256-pub")
    @js.native
    val p256Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p")
    @js.native
    val p2p: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p-circuit")
    @js.native
    val p2pCircuit: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p-stardust")
    @js.native
    val p2pStardust: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p-webrtc-direct")
    @js.native
    val p2pWebrtcDirect: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p-webrtc-star")
    @js.native
    val p2pWebrtcStar: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p2p-websocket-star")
    @js.native
    val p2pWebsocketStar: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p384-pub")
    @js.native
    val p384Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.p521-pub")
    @js.native
    val p521Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.path")
    @js.native
    val path: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.poseidon-bls12_381-a2-fc1")
    @js.native
    val poseidonBls12381A2Fc1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.poseidon-bls12_381-a2-fc1-sc")
    @js.native
    val poseidonBls12381A2Fc1Sc: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.protobuf")
    @js.native
    val protobuf: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.quic")
    @js.native
    val quic: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.raw")
    @js.native
    val raw: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ripemd-128")
    @js.native
    val ripemd128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ripemd-160")
    @js.native
    val ripemd160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ripemd-256")
    @js.native
    val ripemd256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ripemd-320")
    @js.native
    val ripemd320: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.rlp")
    @js.native
    val rlp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sctp")
    @js.native
    val sctp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.secp256k1-priv")
    @js.native
    val secp256k1Priv: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.secp256k1-pub")
    @js.native
    val secp256k1Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha1")
    @js.native
    val sha1: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha2-256")
    @js.native
    val sha2256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha2-256-trunc254-padded")
    @js.native
    val sha2256Trunc254Padded: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha2-512")
    @js.native
    val sha2512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha3-224")
    @js.native
    val sha3224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha3-256")
    @js.native
    val sha3256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha3-384")
    @js.native
    val sha3384: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sha3-512")
    @js.native
    val sha3512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.shake-128")
    @js.native
    val shake128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.shake-256")
    @js.native
    val shake256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-1000")
    @js.native
    val skein10241000: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-1008")
    @js.native
    val skein10241008: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-1016")
    @js.native
    val skein10241016: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-1024")
    @js.native
    val skein10241024: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-104")
    @js.native
    val skein1024104: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-112")
    @js.native
    val skein1024112: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-120")
    @js.native
    val skein1024120: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-128")
    @js.native
    val skein1024128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-136")
    @js.native
    val skein1024136: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-144")
    @js.native
    val skein1024144: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-152")
    @js.native
    val skein1024152: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-16")
    @js.native
    val skein102416: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-160")
    @js.native
    val skein1024160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-168")
    @js.native
    val skein1024168: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-176")
    @js.native
    val skein1024176: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-184")
    @js.native
    val skein1024184: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-192")
    @js.native
    val skein1024192: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-200")
    @js.native
    val skein1024200: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-208")
    @js.native
    val skein1024208: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-216")
    @js.native
    val skein1024216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-224")
    @js.native
    val skein1024224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-232")
    @js.native
    val skein1024232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-24")
    @js.native
    val skein102424: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-240")
    @js.native
    val skein1024240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-248")
    @js.native
    val skein1024248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-256")
    @js.native
    val skein1024256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-264")
    @js.native
    val skein1024264: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-272")
    @js.native
    val skein1024272: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-280")
    @js.native
    val skein1024280: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-288")
    @js.native
    val skein1024288: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-296")
    @js.native
    val skein1024296: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-304")
    @js.native
    val skein1024304: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-312")
    @js.native
    val skein1024312: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-32")
    @js.native
    val skein102432: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-320")
    @js.native
    val skein1024320: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-328")
    @js.native
    val skein1024328: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-336")
    @js.native
    val skein1024336: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-344")
    @js.native
    val skein1024344: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-352")
    @js.native
    val skein1024352: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-360")
    @js.native
    val skein1024360: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-368")
    @js.native
    val skein1024368: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-376")
    @js.native
    val skein1024376: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-384")
    @js.native
    val skein1024384: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-392")
    @js.native
    val skein1024392: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-40")
    @js.native
    val skein102440: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-400")
    @js.native
    val skein1024400: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-408")
    @js.native
    val skein1024408: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-416")
    @js.native
    val skein1024416: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-424")
    @js.native
    val skein1024424: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-432")
    @js.native
    val skein1024432: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-440")
    @js.native
    val skein1024440: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-448")
    @js.native
    val skein1024448: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-456")
    @js.native
    val skein1024456: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-464")
    @js.native
    val skein1024464: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-472")
    @js.native
    val skein1024472: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-48")
    @js.native
    val skein102448: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-480")
    @js.native
    val skein1024480: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-488")
    @js.native
    val skein1024488: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-496")
    @js.native
    val skein1024496: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-504")
    @js.native
    val skein1024504: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-512")
    @js.native
    val skein1024512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-520")
    @js.native
    val skein1024520: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-528")
    @js.native
    val skein1024528: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-536")
    @js.native
    val skein1024536: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-544")
    @js.native
    val skein1024544: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-552")
    @js.native
    val skein1024552: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-56")
    @js.native
    val skein102456: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-560")
    @js.native
    val skein1024560: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-568")
    @js.native
    val skein1024568: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-576")
    @js.native
    val skein1024576: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-584")
    @js.native
    val skein1024584: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-592")
    @js.native
    val skein1024592: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-600")
    @js.native
    val skein1024600: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-608")
    @js.native
    val skein1024608: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-616")
    @js.native
    val skein1024616: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-624")
    @js.native
    val skein1024624: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-632")
    @js.native
    val skein1024632: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-64")
    @js.native
    val skein102464: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-640")
    @js.native
    val skein1024640: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-648")
    @js.native
    val skein1024648: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-656")
    @js.native
    val skein1024656: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-664")
    @js.native
    val skein1024664: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-672")
    @js.native
    val skein1024672: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-680")
    @js.native
    val skein1024680: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-688")
    @js.native
    val skein1024688: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-696")
    @js.native
    val skein1024696: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-704")
    @js.native
    val skein1024704: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-712")
    @js.native
    val skein1024712: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-72")
    @js.native
    val skein102472: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-720")
    @js.native
    val skein1024720: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-728")
    @js.native
    val skein1024728: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-736")
    @js.native
    val skein1024736: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-744")
    @js.native
    val skein1024744: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-752")
    @js.native
    val skein1024752: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-760")
    @js.native
    val skein1024760: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-768")
    @js.native
    val skein1024768: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-776")
    @js.native
    val skein1024776: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-784")
    @js.native
    val skein1024784: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-792")
    @js.native
    val skein1024792: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-8")
    @js.native
    val skein10248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-80")
    @js.native
    val skein102480: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-800")
    @js.native
    val skein1024800: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-808")
    @js.native
    val skein1024808: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-816")
    @js.native
    val skein1024816: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-824")
    @js.native
    val skein1024824: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-832")
    @js.native
    val skein1024832: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-840")
    @js.native
    val skein1024840: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-848")
    @js.native
    val skein1024848: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-856")
    @js.native
    val skein1024856: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-864")
    @js.native
    val skein1024864: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-872")
    @js.native
    val skein1024872: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-88")
    @js.native
    val skein102488: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-880")
    @js.native
    val skein1024880: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-888")
    @js.native
    val skein1024888: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-896")
    @js.native
    val skein1024896: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-904")
    @js.native
    val skein1024904: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-912")
    @js.native
    val skein1024912: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-920")
    @js.native
    val skein1024920: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-928")
    @js.native
    val skein1024928: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-936")
    @js.native
    val skein1024936: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-944")
    @js.native
    val skein1024944: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-952")
    @js.native
    val skein1024952: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-96")
    @js.native
    val skein102496: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-960")
    @js.native
    val skein1024960: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-968")
    @js.native
    val skein1024968: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-976")
    @js.native
    val skein1024976: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-984")
    @js.native
    val skein1024984: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein1024-992")
    @js.native
    val skein1024992: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-104")
    @js.native
    val skein256104: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-112")
    @js.native
    val skein256112: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-120")
    @js.native
    val skein256120: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-128")
    @js.native
    val skein256128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-136")
    @js.native
    val skein256136: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-144")
    @js.native
    val skein256144: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-152")
    @js.native
    val skein256152: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-16")
    @js.native
    val skein25616: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-160")
    @js.native
    val skein256160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-168")
    @js.native
    val skein256168: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-176")
    @js.native
    val skein256176: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-184")
    @js.native
    val skein256184: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-192")
    @js.native
    val skein256192: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-200")
    @js.native
    val skein256200: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-208")
    @js.native
    val skein256208: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-216")
    @js.native
    val skein256216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-224")
    @js.native
    val skein256224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-232")
    @js.native
    val skein256232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-24")
    @js.native
    val skein25624: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-240")
    @js.native
    val skein256240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-248")
    @js.native
    val skein256248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-256")
    @js.native
    val skein256256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-32")
    @js.native
    val skein25632: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-40")
    @js.native
    val skein25640: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-48")
    @js.native
    val skein25648: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-56")
    @js.native
    val skein25656: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-64")
    @js.native
    val skein25664: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-72")
    @js.native
    val skein25672: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-8")
    @js.native
    val skein2568: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-80")
    @js.native
    val skein25680: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-88")
    @js.native
    val skein25688: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein256-96")
    @js.native
    val skein25696: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-104")
    @js.native
    val skein512104: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-112")
    @js.native
    val skein512112: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-120")
    @js.native
    val skein512120: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-128")
    @js.native
    val skein512128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-136")
    @js.native
    val skein512136: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-144")
    @js.native
    val skein512144: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-152")
    @js.native
    val skein512152: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-16")
    @js.native
    val skein51216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-160")
    @js.native
    val skein512160: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-168")
    @js.native
    val skein512168: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-176")
    @js.native
    val skein512176: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-184")
    @js.native
    val skein512184: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-192")
    @js.native
    val skein512192: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-200")
    @js.native
    val skein512200: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-208")
    @js.native
    val skein512208: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-216")
    @js.native
    val skein512216: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-224")
    @js.native
    val skein512224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-232")
    @js.native
    val skein512232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-24")
    @js.native
    val skein51224: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-240")
    @js.native
    val skein512240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-248")
    @js.native
    val skein512248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-256")
    @js.native
    val skein512256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-264")
    @js.native
    val skein512264: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-272")
    @js.native
    val skein512272: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-280")
    @js.native
    val skein512280: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-288")
    @js.native
    val skein512288: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-296")
    @js.native
    val skein512296: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-304")
    @js.native
    val skein512304: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-312")
    @js.native
    val skein512312: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-32")
    @js.native
    val skein51232: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-320")
    @js.native
    val skein512320: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-328")
    @js.native
    val skein512328: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-336")
    @js.native
    val skein512336: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-344")
    @js.native
    val skein512344: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-352")
    @js.native
    val skein512352: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-360")
    @js.native
    val skein512360: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-368")
    @js.native
    val skein512368: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-376")
    @js.native
    val skein512376: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-384")
    @js.native
    val skein512384: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-392")
    @js.native
    val skein512392: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-40")
    @js.native
    val skein51240: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-400")
    @js.native
    val skein512400: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-408")
    @js.native
    val skein512408: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-416")
    @js.native
    val skein512416: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-424")
    @js.native
    val skein512424: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-432")
    @js.native
    val skein512432: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-440")
    @js.native
    val skein512440: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-448")
    @js.native
    val skein512448: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-456")
    @js.native
    val skein512456: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-464")
    @js.native
    val skein512464: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-472")
    @js.native
    val skein512472: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-48")
    @js.native
    val skein51248: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-480")
    @js.native
    val skein512480: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-488")
    @js.native
    val skein512488: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-496")
    @js.native
    val skein512496: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-504")
    @js.native
    val skein512504: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-512")
    @js.native
    val skein512512: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-56")
    @js.native
    val skein51256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-64")
    @js.native
    val skein51264: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-72")
    @js.native
    val skein51272: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-8")
    @js.native
    val skein5128: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-80")
    @js.native
    val skein51280: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-88")
    @js.native
    val skein51288: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skein512-96")
    @js.native
    val skein51296: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.skynet-ns")
    @js.native
    val skynetNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.sm3-256")
    @js.native
    val sm3256: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.stellar-block")
    @js.native
    val stellarBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.stellar-tx")
    @js.native
    val stellarTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.streamid")
    @js.native
    val streamid: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.swarm-feed")
    @js.native
    val swarmFeed: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.swarm-manifest")
    @js.native
    val swarmManifest: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.swarm-ns")
    @js.native
    val swarmNs: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.swhid-1-snp")
    @js.native
    val swhid1Snp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.tcp")
    @js.native
    val tcp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.thread")
    @js.native
    val thread: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.tls")
    @js.native
    val tls: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.torrent-file")
    @js.native
    val torrentFile: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.torrent-info")
    @js.native
    val torrentInfo: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.udp")
    @js.native
    val udp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.udt")
    @js.native
    val udt: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.unix")
    @js.native
    val unix: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.utp")
    @js.native
    val utp: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.ws")
    @js.native
    val ws: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.wss")
    @js.native
    val wss: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.x11")
    @js.native
    val x11: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.x25519-priv")
    @js.native
    val x25519Priv: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.x25519-pub")
    @js.native
    val x25519Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.x448-pub")
    @js.native
    val x448Pub: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.zcash-block")
    @js.native
    val zcashBlock: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.zcash-tx")
    @js.native
    val zcashTx: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.zeronet")
    @js.native
    val zeronet: CodecCode = js.native
    
    @JSImport("multicodec/dist/src/maps", "nameToCode.zeroxcert-imprint-256")
    @js.native
    val zeroxcertImprint256: CodecCode = js.native
  }
  
  @JSImport("multicodec/dist/src/maps", "nameToVarint")
  @js.native
  val nameToVarint: NameUint8ArrayMap = js.native
  
  trait CodeNameMap extends StObject {
    
    var `0`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `1`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `1024`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `10645796`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `10711332`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `112`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `113`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `114`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `11639056`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `11704592`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `120`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `123`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `124`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `129`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `130`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `131`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `132`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `133`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `134`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `144`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `145`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `146`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `147`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `148`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `149`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `150`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `151`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `152`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `153`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `154`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `17`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `176`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `177`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `178`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `18`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `19`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `192`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `193`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `2`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `20`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `202`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `206`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `208`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `209`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `21`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `212`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `213`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `21325`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `214`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `22`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `224`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `225`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `226`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `227`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `228`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `229`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `23`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `230`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `231`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `234`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `235`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `236`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `237`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `238`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `24`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `240`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `241`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `25`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `250`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `251`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `26`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `27`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `273`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `275`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `276`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `277`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `28`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `29`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `290`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `297`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `3`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `30`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `301`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `302`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `33`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `34`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `35`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `400`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `406`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `41`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4114`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4178`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4179`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4180`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4181`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `42`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `421`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4352`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `443`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `444`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `445`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `446`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `447`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `448`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `454`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45569`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45570`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45571`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45572`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45573`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45574`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45575`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45576`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45577`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45578`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45579`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45580`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45581`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45582`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45583`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45584`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45585`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45586`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45587`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45588`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45589`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45590`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45591`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45592`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45593`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45594`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45595`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45596`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45597`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45598`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45599`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45600`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45601`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45602`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45603`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45604`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45605`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45606`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45607`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45608`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45609`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45610`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45611`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45612`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45613`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45614`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45615`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45616`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45617`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45618`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45619`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45620`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45621`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45622`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45623`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45624`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45625`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45626`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45627`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45628`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45629`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45630`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45631`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45632`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45633`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45634`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45635`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45636`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45637`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45638`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45639`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45640`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45641`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45642`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45643`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45644`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45645`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45646`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45647`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45648`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45649`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45650`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45651`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45652`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45653`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45654`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45655`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45656`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45657`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45658`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45659`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45660`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45661`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45662`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45663`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45664`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45825`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45826`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45827`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45828`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45829`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45830`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45831`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45832`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45833`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45834`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45835`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45836`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45837`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45838`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45839`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45840`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45841`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45842`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45843`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45844`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45845`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45846`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45847`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45848`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45849`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45850`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45851`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45852`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45853`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45854`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45855`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45856`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45857`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45858`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45859`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45860`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45861`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45862`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45863`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45864`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45865`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45866`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45867`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45868`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45869`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45870`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45871`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45872`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45873`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45874`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45875`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45876`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45877`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45878`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45879`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45880`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45881`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45882`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45883`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45884`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45885`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45886`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45887`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45888`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45889`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45890`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45891`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45892`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45893`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45894`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45895`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45896`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45897`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45898`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45899`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45900`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45901`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45902`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45903`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45904`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45905`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45906`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45907`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45908`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45909`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45910`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45911`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45912`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45913`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45914`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45915`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45916`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45917`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45918`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45919`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45920`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45921`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45922`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45923`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45924`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45925`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45926`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45927`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45928`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45929`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45930`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45931`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45932`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45933`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45934`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45935`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45936`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45937`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45938`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45939`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45940`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45941`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45942`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45943`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45944`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45945`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45946`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45947`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45948`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45949`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45950`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45951`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45952`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45953`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45954`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45955`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45956`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45957`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45958`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45959`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45960`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45961`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45962`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45963`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45964`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45965`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45966`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45967`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45968`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45969`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45970`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45971`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45972`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45973`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45974`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45975`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45976`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45977`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45978`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45979`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45980`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45981`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45982`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45983`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45984`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45985`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45986`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45987`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45988`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45989`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45990`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45991`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45992`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45993`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45994`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45995`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45996`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45997`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45998`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `45999`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `460`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46000`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46001`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46002`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46003`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46004`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46005`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46006`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46007`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46008`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46009`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46010`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46011`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46012`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46013`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46014`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46015`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46016`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46017`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46018`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46019`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46020`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46021`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46022`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46023`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46024`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46025`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46026`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46027`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46028`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46029`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46030`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46031`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46032`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46033`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46034`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46035`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46036`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46037`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46038`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46039`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46040`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46041`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46042`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46043`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46044`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46045`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46046`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46047`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46048`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4608`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46081`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `46082`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4609`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4610`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4611`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4612`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `47`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `477`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `478`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `479`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `48`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `480`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4864`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4865`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `4866`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `49`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `496`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `50`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `51`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `512`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `513`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `52753`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `53`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `54`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `55`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `56`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `6`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `61697`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `61698`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `7425`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `769`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `770`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `80`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `81`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `8417572`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `8483108`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `85`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `86`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `96`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `9728292`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `9793828`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
    
    var `99`: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName
  }
  object CodeNameMap {
    
    extension [Self <: CodeNameMap](x: Self) {
      
      inline def set0(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set1024(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "1024", value.asInstanceOf[js.Any])
      
      inline def set10645796(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "10645796", value.asInstanceOf[js.Any])
      
      inline def set10711332(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "10711332", value.asInstanceOf[js.Any])
      
      inline def set112(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "112", value.asInstanceOf[js.Any])
      
      inline def set113(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "113", value.asInstanceOf[js.Any])
      
      inline def set114(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "114", value.asInstanceOf[js.Any])
      
      inline def set11639056(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "11639056", value.asInstanceOf[js.Any])
      
      inline def set11704592(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "11704592", value.asInstanceOf[js.Any])
      
      inline def set120(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "120", value.asInstanceOf[js.Any])
      
      inline def set123(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "123", value.asInstanceOf[js.Any])
      
      inline def set124(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "124", value.asInstanceOf[js.Any])
      
      inline def set129(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "129", value.asInstanceOf[js.Any])
      
      inline def set130(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "130", value.asInstanceOf[js.Any])
      
      inline def set131(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "131", value.asInstanceOf[js.Any])
      
      inline def set132(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "132", value.asInstanceOf[js.Any])
      
      inline def set133(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "133", value.asInstanceOf[js.Any])
      
      inline def set134(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "134", value.asInstanceOf[js.Any])
      
      inline def set144(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "144", value.asInstanceOf[js.Any])
      
      inline def set145(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "145", value.asInstanceOf[js.Any])
      
      inline def set146(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "146", value.asInstanceOf[js.Any])
      
      inline def set147(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "147", value.asInstanceOf[js.Any])
      
      inline def set148(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "148", value.asInstanceOf[js.Any])
      
      inline def set149(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "149", value.asInstanceOf[js.Any])
      
      inline def set150(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "150", value.asInstanceOf[js.Any])
      
      inline def set151(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "151", value.asInstanceOf[js.Any])
      
      inline def set152(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "152", value.asInstanceOf[js.Any])
      
      inline def set153(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "153", value.asInstanceOf[js.Any])
      
      inline def set154(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "154", value.asInstanceOf[js.Any])
      
      inline def set17(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "17", value.asInstanceOf[js.Any])
      
      inline def set176(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "176", value.asInstanceOf[js.Any])
      
      inline def set177(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "177", value.asInstanceOf[js.Any])
      
      inline def set178(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "178", value.asInstanceOf[js.Any])
      
      inline def set18(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "18", value.asInstanceOf[js.Any])
      
      inline def set19(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "19", value.asInstanceOf[js.Any])
      
      inline def set192(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "192", value.asInstanceOf[js.Any])
      
      inline def set193(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "193", value.asInstanceOf[js.Any])
      
      inline def set2(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set20(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
      
      inline def set202(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
      
      inline def set206(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "206", value.asInstanceOf[js.Any])
      
      inline def set208(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "208", value.asInstanceOf[js.Any])
      
      inline def set209(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "209", value.asInstanceOf[js.Any])
      
      inline def set21(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "21", value.asInstanceOf[js.Any])
      
      inline def set212(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "212", value.asInstanceOf[js.Any])
      
      inline def set213(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "213", value.asInstanceOf[js.Any])
      
      inline def set21325(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "21325", value.asInstanceOf[js.Any])
      
      inline def set214(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "214", value.asInstanceOf[js.Any])
      
      inline def set22(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "22", value.asInstanceOf[js.Any])
      
      inline def set224(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "224", value.asInstanceOf[js.Any])
      
      inline def set225(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "225", value.asInstanceOf[js.Any])
      
      inline def set226(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "226", value.asInstanceOf[js.Any])
      
      inline def set227(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "227", value.asInstanceOf[js.Any])
      
      inline def set228(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "228", value.asInstanceOf[js.Any])
      
      inline def set229(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "229", value.asInstanceOf[js.Any])
      
      inline def set23(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "23", value.asInstanceOf[js.Any])
      
      inline def set230(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "230", value.asInstanceOf[js.Any])
      
      inline def set231(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "231", value.asInstanceOf[js.Any])
      
      inline def set234(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "234", value.asInstanceOf[js.Any])
      
      inline def set235(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "235", value.asInstanceOf[js.Any])
      
      inline def set236(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "236", value.asInstanceOf[js.Any])
      
      inline def set237(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "237", value.asInstanceOf[js.Any])
      
      inline def set238(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "238", value.asInstanceOf[js.Any])
      
      inline def set24(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
      
      inline def set240(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "240", value.asInstanceOf[js.Any])
      
      inline def set241(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "241", value.asInstanceOf[js.Any])
      
      inline def set25(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "25", value.asInstanceOf[js.Any])
      
      inline def set250(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "250", value.asInstanceOf[js.Any])
      
      inline def set251(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "251", value.asInstanceOf[js.Any])
      
      inline def set26(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "26", value.asInstanceOf[js.Any])
      
      inline def set27(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "27", value.asInstanceOf[js.Any])
      
      inline def set273(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "273", value.asInstanceOf[js.Any])
      
      inline def set275(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "275", value.asInstanceOf[js.Any])
      
      inline def set276(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "276", value.asInstanceOf[js.Any])
      
      inline def set277(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "277", value.asInstanceOf[js.Any])
      
      inline def set28(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "28", value.asInstanceOf[js.Any])
      
      inline def set29(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "29", value.asInstanceOf[js.Any])
      
      inline def set290(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "290", value.asInstanceOf[js.Any])
      
      inline def set297(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "297", value.asInstanceOf[js.Any])
      
      inline def set3(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set30(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
      
      inline def set301(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
      
      inline def set302(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "302", value.asInstanceOf[js.Any])
      
      inline def set33(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "33", value.asInstanceOf[js.Any])
      
      inline def set34(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "34", value.asInstanceOf[js.Any])
      
      inline def set35(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "35", value.asInstanceOf[js.Any])
      
      inline def set4(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set400(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      inline def set406(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "406", value.asInstanceOf[js.Any])
      
      inline def set41(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "41", value.asInstanceOf[js.Any])
      
      inline def set4114(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4114", value.asInstanceOf[js.Any])
      
      inline def set4178(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4178", value.asInstanceOf[js.Any])
      
      inline def set4179(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4179", value.asInstanceOf[js.Any])
      
      inline def set4180(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4180", value.asInstanceOf[js.Any])
      
      inline def set4181(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4181", value.asInstanceOf[js.Any])
      
      inline def set42(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "42", value.asInstanceOf[js.Any])
      
      inline def set421(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "421", value.asInstanceOf[js.Any])
      
      inline def set4352(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4352", value.asInstanceOf[js.Any])
      
      inline def set443(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "443", value.asInstanceOf[js.Any])
      
      inline def set444(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "444", value.asInstanceOf[js.Any])
      
      inline def set445(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "445", value.asInstanceOf[js.Any])
      
      inline def set446(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "446", value.asInstanceOf[js.Any])
      
      inline def set447(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "447", value.asInstanceOf[js.Any])
      
      inline def set448(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "448", value.asInstanceOf[js.Any])
      
      inline def set454(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "454", value.asInstanceOf[js.Any])
      
      inline def set45569(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45569", value.asInstanceOf[js.Any])
      
      inline def set45570(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45570", value.asInstanceOf[js.Any])
      
      inline def set45571(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45571", value.asInstanceOf[js.Any])
      
      inline def set45572(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45572", value.asInstanceOf[js.Any])
      
      inline def set45573(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45573", value.asInstanceOf[js.Any])
      
      inline def set45574(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45574", value.asInstanceOf[js.Any])
      
      inline def set45575(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45575", value.asInstanceOf[js.Any])
      
      inline def set45576(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45576", value.asInstanceOf[js.Any])
      
      inline def set45577(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45577", value.asInstanceOf[js.Any])
      
      inline def set45578(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45578", value.asInstanceOf[js.Any])
      
      inline def set45579(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45579", value.asInstanceOf[js.Any])
      
      inline def set45580(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45580", value.asInstanceOf[js.Any])
      
      inline def set45581(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45581", value.asInstanceOf[js.Any])
      
      inline def set45582(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45582", value.asInstanceOf[js.Any])
      
      inline def set45583(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45583", value.asInstanceOf[js.Any])
      
      inline def set45584(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45584", value.asInstanceOf[js.Any])
      
      inline def set45585(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45585", value.asInstanceOf[js.Any])
      
      inline def set45586(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45586", value.asInstanceOf[js.Any])
      
      inline def set45587(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45587", value.asInstanceOf[js.Any])
      
      inline def set45588(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45588", value.asInstanceOf[js.Any])
      
      inline def set45589(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45589", value.asInstanceOf[js.Any])
      
      inline def set45590(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45590", value.asInstanceOf[js.Any])
      
      inline def set45591(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45591", value.asInstanceOf[js.Any])
      
      inline def set45592(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45592", value.asInstanceOf[js.Any])
      
      inline def set45593(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45593", value.asInstanceOf[js.Any])
      
      inline def set45594(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45594", value.asInstanceOf[js.Any])
      
      inline def set45595(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45595", value.asInstanceOf[js.Any])
      
      inline def set45596(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45596", value.asInstanceOf[js.Any])
      
      inline def set45597(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45597", value.asInstanceOf[js.Any])
      
      inline def set45598(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45598", value.asInstanceOf[js.Any])
      
      inline def set45599(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45599", value.asInstanceOf[js.Any])
      
      inline def set45600(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45600", value.asInstanceOf[js.Any])
      
      inline def set45601(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45601", value.asInstanceOf[js.Any])
      
      inline def set45602(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45602", value.asInstanceOf[js.Any])
      
      inline def set45603(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45603", value.asInstanceOf[js.Any])
      
      inline def set45604(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45604", value.asInstanceOf[js.Any])
      
      inline def set45605(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45605", value.asInstanceOf[js.Any])
      
      inline def set45606(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45606", value.asInstanceOf[js.Any])
      
      inline def set45607(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45607", value.asInstanceOf[js.Any])
      
      inline def set45608(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45608", value.asInstanceOf[js.Any])
      
      inline def set45609(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45609", value.asInstanceOf[js.Any])
      
      inline def set45610(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45610", value.asInstanceOf[js.Any])
      
      inline def set45611(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45611", value.asInstanceOf[js.Any])
      
      inline def set45612(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45612", value.asInstanceOf[js.Any])
      
      inline def set45613(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45613", value.asInstanceOf[js.Any])
      
      inline def set45614(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45614", value.asInstanceOf[js.Any])
      
      inline def set45615(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45615", value.asInstanceOf[js.Any])
      
      inline def set45616(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45616", value.asInstanceOf[js.Any])
      
      inline def set45617(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45617", value.asInstanceOf[js.Any])
      
      inline def set45618(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45618", value.asInstanceOf[js.Any])
      
      inline def set45619(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45619", value.asInstanceOf[js.Any])
      
      inline def set45620(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45620", value.asInstanceOf[js.Any])
      
      inline def set45621(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45621", value.asInstanceOf[js.Any])
      
      inline def set45622(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45622", value.asInstanceOf[js.Any])
      
      inline def set45623(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45623", value.asInstanceOf[js.Any])
      
      inline def set45624(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45624", value.asInstanceOf[js.Any])
      
      inline def set45625(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45625", value.asInstanceOf[js.Any])
      
      inline def set45626(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45626", value.asInstanceOf[js.Any])
      
      inline def set45627(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45627", value.asInstanceOf[js.Any])
      
      inline def set45628(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45628", value.asInstanceOf[js.Any])
      
      inline def set45629(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45629", value.asInstanceOf[js.Any])
      
      inline def set45630(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45630", value.asInstanceOf[js.Any])
      
      inline def set45631(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45631", value.asInstanceOf[js.Any])
      
      inline def set45632(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45632", value.asInstanceOf[js.Any])
      
      inline def set45633(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45633", value.asInstanceOf[js.Any])
      
      inline def set45634(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45634", value.asInstanceOf[js.Any])
      
      inline def set45635(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45635", value.asInstanceOf[js.Any])
      
      inline def set45636(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45636", value.asInstanceOf[js.Any])
      
      inline def set45637(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45637", value.asInstanceOf[js.Any])
      
      inline def set45638(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45638", value.asInstanceOf[js.Any])
      
      inline def set45639(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45639", value.asInstanceOf[js.Any])
      
      inline def set45640(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45640", value.asInstanceOf[js.Any])
      
      inline def set45641(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45641", value.asInstanceOf[js.Any])
      
      inline def set45642(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45642", value.asInstanceOf[js.Any])
      
      inline def set45643(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45643", value.asInstanceOf[js.Any])
      
      inline def set45644(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45644", value.asInstanceOf[js.Any])
      
      inline def set45645(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45645", value.asInstanceOf[js.Any])
      
      inline def set45646(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45646", value.asInstanceOf[js.Any])
      
      inline def set45647(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45647", value.asInstanceOf[js.Any])
      
      inline def set45648(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45648", value.asInstanceOf[js.Any])
      
      inline def set45649(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45649", value.asInstanceOf[js.Any])
      
      inline def set45650(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45650", value.asInstanceOf[js.Any])
      
      inline def set45651(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45651", value.asInstanceOf[js.Any])
      
      inline def set45652(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45652", value.asInstanceOf[js.Any])
      
      inline def set45653(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45653", value.asInstanceOf[js.Any])
      
      inline def set45654(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45654", value.asInstanceOf[js.Any])
      
      inline def set45655(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45655", value.asInstanceOf[js.Any])
      
      inline def set45656(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45656", value.asInstanceOf[js.Any])
      
      inline def set45657(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45657", value.asInstanceOf[js.Any])
      
      inline def set45658(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45658", value.asInstanceOf[js.Any])
      
      inline def set45659(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45659", value.asInstanceOf[js.Any])
      
      inline def set45660(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45660", value.asInstanceOf[js.Any])
      
      inline def set45661(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45661", value.asInstanceOf[js.Any])
      
      inline def set45662(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45662", value.asInstanceOf[js.Any])
      
      inline def set45663(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45663", value.asInstanceOf[js.Any])
      
      inline def set45664(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45664", value.asInstanceOf[js.Any])
      
      inline def set45825(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45825", value.asInstanceOf[js.Any])
      
      inline def set45826(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45826", value.asInstanceOf[js.Any])
      
      inline def set45827(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45827", value.asInstanceOf[js.Any])
      
      inline def set45828(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45828", value.asInstanceOf[js.Any])
      
      inline def set45829(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45829", value.asInstanceOf[js.Any])
      
      inline def set45830(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45830", value.asInstanceOf[js.Any])
      
      inline def set45831(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45831", value.asInstanceOf[js.Any])
      
      inline def set45832(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45832", value.asInstanceOf[js.Any])
      
      inline def set45833(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45833", value.asInstanceOf[js.Any])
      
      inline def set45834(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45834", value.asInstanceOf[js.Any])
      
      inline def set45835(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45835", value.asInstanceOf[js.Any])
      
      inline def set45836(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45836", value.asInstanceOf[js.Any])
      
      inline def set45837(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45837", value.asInstanceOf[js.Any])
      
      inline def set45838(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45838", value.asInstanceOf[js.Any])
      
      inline def set45839(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45839", value.asInstanceOf[js.Any])
      
      inline def set45840(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45840", value.asInstanceOf[js.Any])
      
      inline def set45841(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45841", value.asInstanceOf[js.Any])
      
      inline def set45842(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45842", value.asInstanceOf[js.Any])
      
      inline def set45843(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45843", value.asInstanceOf[js.Any])
      
      inline def set45844(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45844", value.asInstanceOf[js.Any])
      
      inline def set45845(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45845", value.asInstanceOf[js.Any])
      
      inline def set45846(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45846", value.asInstanceOf[js.Any])
      
      inline def set45847(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45847", value.asInstanceOf[js.Any])
      
      inline def set45848(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45848", value.asInstanceOf[js.Any])
      
      inline def set45849(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45849", value.asInstanceOf[js.Any])
      
      inline def set45850(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45850", value.asInstanceOf[js.Any])
      
      inline def set45851(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45851", value.asInstanceOf[js.Any])
      
      inline def set45852(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45852", value.asInstanceOf[js.Any])
      
      inline def set45853(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45853", value.asInstanceOf[js.Any])
      
      inline def set45854(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45854", value.asInstanceOf[js.Any])
      
      inline def set45855(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45855", value.asInstanceOf[js.Any])
      
      inline def set45856(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45856", value.asInstanceOf[js.Any])
      
      inline def set45857(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45857", value.asInstanceOf[js.Any])
      
      inline def set45858(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45858", value.asInstanceOf[js.Any])
      
      inline def set45859(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45859", value.asInstanceOf[js.Any])
      
      inline def set45860(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45860", value.asInstanceOf[js.Any])
      
      inline def set45861(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45861", value.asInstanceOf[js.Any])
      
      inline def set45862(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45862", value.asInstanceOf[js.Any])
      
      inline def set45863(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45863", value.asInstanceOf[js.Any])
      
      inline def set45864(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45864", value.asInstanceOf[js.Any])
      
      inline def set45865(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45865", value.asInstanceOf[js.Any])
      
      inline def set45866(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45866", value.asInstanceOf[js.Any])
      
      inline def set45867(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45867", value.asInstanceOf[js.Any])
      
      inline def set45868(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45868", value.asInstanceOf[js.Any])
      
      inline def set45869(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45869", value.asInstanceOf[js.Any])
      
      inline def set45870(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45870", value.asInstanceOf[js.Any])
      
      inline def set45871(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45871", value.asInstanceOf[js.Any])
      
      inline def set45872(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45872", value.asInstanceOf[js.Any])
      
      inline def set45873(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45873", value.asInstanceOf[js.Any])
      
      inline def set45874(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45874", value.asInstanceOf[js.Any])
      
      inline def set45875(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45875", value.asInstanceOf[js.Any])
      
      inline def set45876(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45876", value.asInstanceOf[js.Any])
      
      inline def set45877(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45877", value.asInstanceOf[js.Any])
      
      inline def set45878(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45878", value.asInstanceOf[js.Any])
      
      inline def set45879(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45879", value.asInstanceOf[js.Any])
      
      inline def set45880(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45880", value.asInstanceOf[js.Any])
      
      inline def set45881(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45881", value.asInstanceOf[js.Any])
      
      inline def set45882(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45882", value.asInstanceOf[js.Any])
      
      inline def set45883(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45883", value.asInstanceOf[js.Any])
      
      inline def set45884(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45884", value.asInstanceOf[js.Any])
      
      inline def set45885(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45885", value.asInstanceOf[js.Any])
      
      inline def set45886(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45886", value.asInstanceOf[js.Any])
      
      inline def set45887(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45887", value.asInstanceOf[js.Any])
      
      inline def set45888(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45888", value.asInstanceOf[js.Any])
      
      inline def set45889(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45889", value.asInstanceOf[js.Any])
      
      inline def set45890(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45890", value.asInstanceOf[js.Any])
      
      inline def set45891(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45891", value.asInstanceOf[js.Any])
      
      inline def set45892(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45892", value.asInstanceOf[js.Any])
      
      inline def set45893(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45893", value.asInstanceOf[js.Any])
      
      inline def set45894(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45894", value.asInstanceOf[js.Any])
      
      inline def set45895(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45895", value.asInstanceOf[js.Any])
      
      inline def set45896(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45896", value.asInstanceOf[js.Any])
      
      inline def set45897(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45897", value.asInstanceOf[js.Any])
      
      inline def set45898(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45898", value.asInstanceOf[js.Any])
      
      inline def set45899(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45899", value.asInstanceOf[js.Any])
      
      inline def set45900(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45900", value.asInstanceOf[js.Any])
      
      inline def set45901(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45901", value.asInstanceOf[js.Any])
      
      inline def set45902(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45902", value.asInstanceOf[js.Any])
      
      inline def set45903(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45903", value.asInstanceOf[js.Any])
      
      inline def set45904(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45904", value.asInstanceOf[js.Any])
      
      inline def set45905(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45905", value.asInstanceOf[js.Any])
      
      inline def set45906(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45906", value.asInstanceOf[js.Any])
      
      inline def set45907(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45907", value.asInstanceOf[js.Any])
      
      inline def set45908(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45908", value.asInstanceOf[js.Any])
      
      inline def set45909(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45909", value.asInstanceOf[js.Any])
      
      inline def set45910(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45910", value.asInstanceOf[js.Any])
      
      inline def set45911(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45911", value.asInstanceOf[js.Any])
      
      inline def set45912(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45912", value.asInstanceOf[js.Any])
      
      inline def set45913(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45913", value.asInstanceOf[js.Any])
      
      inline def set45914(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45914", value.asInstanceOf[js.Any])
      
      inline def set45915(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45915", value.asInstanceOf[js.Any])
      
      inline def set45916(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45916", value.asInstanceOf[js.Any])
      
      inline def set45917(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45917", value.asInstanceOf[js.Any])
      
      inline def set45918(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45918", value.asInstanceOf[js.Any])
      
      inline def set45919(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45919", value.asInstanceOf[js.Any])
      
      inline def set45920(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45920", value.asInstanceOf[js.Any])
      
      inline def set45921(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45921", value.asInstanceOf[js.Any])
      
      inline def set45922(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45922", value.asInstanceOf[js.Any])
      
      inline def set45923(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45923", value.asInstanceOf[js.Any])
      
      inline def set45924(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45924", value.asInstanceOf[js.Any])
      
      inline def set45925(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45925", value.asInstanceOf[js.Any])
      
      inline def set45926(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45926", value.asInstanceOf[js.Any])
      
      inline def set45927(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45927", value.asInstanceOf[js.Any])
      
      inline def set45928(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45928", value.asInstanceOf[js.Any])
      
      inline def set45929(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45929", value.asInstanceOf[js.Any])
      
      inline def set45930(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45930", value.asInstanceOf[js.Any])
      
      inline def set45931(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45931", value.asInstanceOf[js.Any])
      
      inline def set45932(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45932", value.asInstanceOf[js.Any])
      
      inline def set45933(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45933", value.asInstanceOf[js.Any])
      
      inline def set45934(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45934", value.asInstanceOf[js.Any])
      
      inline def set45935(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45935", value.asInstanceOf[js.Any])
      
      inline def set45936(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45936", value.asInstanceOf[js.Any])
      
      inline def set45937(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45937", value.asInstanceOf[js.Any])
      
      inline def set45938(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45938", value.asInstanceOf[js.Any])
      
      inline def set45939(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45939", value.asInstanceOf[js.Any])
      
      inline def set45940(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45940", value.asInstanceOf[js.Any])
      
      inline def set45941(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45941", value.asInstanceOf[js.Any])
      
      inline def set45942(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45942", value.asInstanceOf[js.Any])
      
      inline def set45943(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45943", value.asInstanceOf[js.Any])
      
      inline def set45944(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45944", value.asInstanceOf[js.Any])
      
      inline def set45945(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45945", value.asInstanceOf[js.Any])
      
      inline def set45946(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45946", value.asInstanceOf[js.Any])
      
      inline def set45947(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45947", value.asInstanceOf[js.Any])
      
      inline def set45948(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45948", value.asInstanceOf[js.Any])
      
      inline def set45949(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45949", value.asInstanceOf[js.Any])
      
      inline def set45950(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45950", value.asInstanceOf[js.Any])
      
      inline def set45951(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45951", value.asInstanceOf[js.Any])
      
      inline def set45952(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45952", value.asInstanceOf[js.Any])
      
      inline def set45953(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45953", value.asInstanceOf[js.Any])
      
      inline def set45954(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45954", value.asInstanceOf[js.Any])
      
      inline def set45955(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45955", value.asInstanceOf[js.Any])
      
      inline def set45956(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45956", value.asInstanceOf[js.Any])
      
      inline def set45957(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45957", value.asInstanceOf[js.Any])
      
      inline def set45958(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45958", value.asInstanceOf[js.Any])
      
      inline def set45959(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45959", value.asInstanceOf[js.Any])
      
      inline def set45960(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45960", value.asInstanceOf[js.Any])
      
      inline def set45961(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45961", value.asInstanceOf[js.Any])
      
      inline def set45962(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45962", value.asInstanceOf[js.Any])
      
      inline def set45963(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45963", value.asInstanceOf[js.Any])
      
      inline def set45964(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45964", value.asInstanceOf[js.Any])
      
      inline def set45965(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45965", value.asInstanceOf[js.Any])
      
      inline def set45966(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45966", value.asInstanceOf[js.Any])
      
      inline def set45967(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45967", value.asInstanceOf[js.Any])
      
      inline def set45968(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45968", value.asInstanceOf[js.Any])
      
      inline def set45969(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45969", value.asInstanceOf[js.Any])
      
      inline def set45970(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45970", value.asInstanceOf[js.Any])
      
      inline def set45971(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45971", value.asInstanceOf[js.Any])
      
      inline def set45972(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45972", value.asInstanceOf[js.Any])
      
      inline def set45973(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45973", value.asInstanceOf[js.Any])
      
      inline def set45974(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45974", value.asInstanceOf[js.Any])
      
      inline def set45975(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45975", value.asInstanceOf[js.Any])
      
      inline def set45976(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45976", value.asInstanceOf[js.Any])
      
      inline def set45977(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45977", value.asInstanceOf[js.Any])
      
      inline def set45978(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45978", value.asInstanceOf[js.Any])
      
      inline def set45979(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45979", value.asInstanceOf[js.Any])
      
      inline def set45980(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45980", value.asInstanceOf[js.Any])
      
      inline def set45981(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45981", value.asInstanceOf[js.Any])
      
      inline def set45982(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45982", value.asInstanceOf[js.Any])
      
      inline def set45983(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45983", value.asInstanceOf[js.Any])
      
      inline def set45984(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45984", value.asInstanceOf[js.Any])
      
      inline def set45985(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45985", value.asInstanceOf[js.Any])
      
      inline def set45986(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45986", value.asInstanceOf[js.Any])
      
      inline def set45987(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45987", value.asInstanceOf[js.Any])
      
      inline def set45988(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45988", value.asInstanceOf[js.Any])
      
      inline def set45989(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45989", value.asInstanceOf[js.Any])
      
      inline def set45990(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45990", value.asInstanceOf[js.Any])
      
      inline def set45991(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45991", value.asInstanceOf[js.Any])
      
      inline def set45992(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45992", value.asInstanceOf[js.Any])
      
      inline def set45993(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45993", value.asInstanceOf[js.Any])
      
      inline def set45994(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45994", value.asInstanceOf[js.Any])
      
      inline def set45995(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45995", value.asInstanceOf[js.Any])
      
      inline def set45996(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45996", value.asInstanceOf[js.Any])
      
      inline def set45997(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45997", value.asInstanceOf[js.Any])
      
      inline def set45998(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45998", value.asInstanceOf[js.Any])
      
      inline def set45999(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "45999", value.asInstanceOf[js.Any])
      
      inline def set460(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "460", value.asInstanceOf[js.Any])
      
      inline def set46000(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46000", value.asInstanceOf[js.Any])
      
      inline def set46001(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46001", value.asInstanceOf[js.Any])
      
      inline def set46002(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46002", value.asInstanceOf[js.Any])
      
      inline def set46003(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46003", value.asInstanceOf[js.Any])
      
      inline def set46004(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46004", value.asInstanceOf[js.Any])
      
      inline def set46005(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46005", value.asInstanceOf[js.Any])
      
      inline def set46006(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46006", value.asInstanceOf[js.Any])
      
      inline def set46007(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46007", value.asInstanceOf[js.Any])
      
      inline def set46008(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46008", value.asInstanceOf[js.Any])
      
      inline def set46009(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46009", value.asInstanceOf[js.Any])
      
      inline def set46010(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46010", value.asInstanceOf[js.Any])
      
      inline def set46011(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46011", value.asInstanceOf[js.Any])
      
      inline def set46012(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46012", value.asInstanceOf[js.Any])
      
      inline def set46013(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46013", value.asInstanceOf[js.Any])
      
      inline def set46014(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46014", value.asInstanceOf[js.Any])
      
      inline def set46015(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46015", value.asInstanceOf[js.Any])
      
      inline def set46016(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46016", value.asInstanceOf[js.Any])
      
      inline def set46017(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46017", value.asInstanceOf[js.Any])
      
      inline def set46018(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46018", value.asInstanceOf[js.Any])
      
      inline def set46019(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46019", value.asInstanceOf[js.Any])
      
      inline def set46020(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46020", value.asInstanceOf[js.Any])
      
      inline def set46021(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46021", value.asInstanceOf[js.Any])
      
      inline def set46022(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46022", value.asInstanceOf[js.Any])
      
      inline def set46023(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46023", value.asInstanceOf[js.Any])
      
      inline def set46024(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46024", value.asInstanceOf[js.Any])
      
      inline def set46025(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46025", value.asInstanceOf[js.Any])
      
      inline def set46026(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46026", value.asInstanceOf[js.Any])
      
      inline def set46027(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46027", value.asInstanceOf[js.Any])
      
      inline def set46028(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46028", value.asInstanceOf[js.Any])
      
      inline def set46029(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46029", value.asInstanceOf[js.Any])
      
      inline def set46030(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46030", value.asInstanceOf[js.Any])
      
      inline def set46031(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46031", value.asInstanceOf[js.Any])
      
      inline def set46032(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46032", value.asInstanceOf[js.Any])
      
      inline def set46033(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46033", value.asInstanceOf[js.Any])
      
      inline def set46034(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46034", value.asInstanceOf[js.Any])
      
      inline def set46035(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46035", value.asInstanceOf[js.Any])
      
      inline def set46036(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46036", value.asInstanceOf[js.Any])
      
      inline def set46037(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46037", value.asInstanceOf[js.Any])
      
      inline def set46038(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46038", value.asInstanceOf[js.Any])
      
      inline def set46039(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46039", value.asInstanceOf[js.Any])
      
      inline def set46040(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46040", value.asInstanceOf[js.Any])
      
      inline def set46041(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46041", value.asInstanceOf[js.Any])
      
      inline def set46042(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46042", value.asInstanceOf[js.Any])
      
      inline def set46043(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46043", value.asInstanceOf[js.Any])
      
      inline def set46044(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46044", value.asInstanceOf[js.Any])
      
      inline def set46045(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46045", value.asInstanceOf[js.Any])
      
      inline def set46046(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46046", value.asInstanceOf[js.Any])
      
      inline def set46047(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46047", value.asInstanceOf[js.Any])
      
      inline def set46048(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46048", value.asInstanceOf[js.Any])
      
      inline def set4608(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4608", value.asInstanceOf[js.Any])
      
      inline def set46081(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46081", value.asInstanceOf[js.Any])
      
      inline def set46082(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "46082", value.asInstanceOf[js.Any])
      
      inline def set4609(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4609", value.asInstanceOf[js.Any])
      
      inline def set4610(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4610", value.asInstanceOf[js.Any])
      
      inline def set4611(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4611", value.asInstanceOf[js.Any])
      
      inline def set4612(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4612", value.asInstanceOf[js.Any])
      
      inline def set47(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "47", value.asInstanceOf[js.Any])
      
      inline def set477(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "477", value.asInstanceOf[js.Any])
      
      inline def set478(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "478", value.asInstanceOf[js.Any])
      
      inline def set479(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "479", value.asInstanceOf[js.Any])
      
      inline def set48(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
      
      inline def set480(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "480", value.asInstanceOf[js.Any])
      
      inline def set4864(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4864", value.asInstanceOf[js.Any])
      
      inline def set4865(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4865", value.asInstanceOf[js.Any])
      
      inline def set4866(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "4866", value.asInstanceOf[js.Any])
      
      inline def set49(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "49", value.asInstanceOf[js.Any])
      
      inline def set496(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "496", value.asInstanceOf[js.Any])
      
      inline def set50(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set51(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "51", value.asInstanceOf[js.Any])
      
      inline def set512(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "512", value.asInstanceOf[js.Any])
      
      inline def set513(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "513", value.asInstanceOf[js.Any])
      
      inline def set52753(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "52753", value.asInstanceOf[js.Any])
      
      inline def set53(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "53", value.asInstanceOf[js.Any])
      
      inline def set54(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "54", value.asInstanceOf[js.Any])
      
      inline def set55(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "55", value.asInstanceOf[js.Any])
      
      inline def set56(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "56", value.asInstanceOf[js.Any])
      
      inline def set6(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set61697(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "61697", value.asInstanceOf[js.Any])
      
      inline def set61698(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "61698", value.asInstanceOf[js.Any])
      
      inline def set7425(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "7425", value.asInstanceOf[js.Any])
      
      inline def set769(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "769", value.asInstanceOf[js.Any])
      
      inline def set770(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "770", value.asInstanceOf[js.Any])
      
      inline def set80(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "80", value.asInstanceOf[js.Any])
      
      inline def set81(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "81", value.asInstanceOf[js.Any])
      
      inline def set8417572(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "8417572", value.asInstanceOf[js.Any])
      
      inline def set8483108(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "8483108", value.asInstanceOf[js.Any])
      
      inline def set85(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "85", value.asInstanceOf[js.Any])
      
      inline def set86(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "86", value.asInstanceOf[js.Any])
      
      inline def set96(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "96", value.asInstanceOf[js.Any])
      
      inline def set9728292(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "9728292", value.asInstanceOf[js.Any])
      
      inline def set9793828(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "9793828", value.asInstanceOf[js.Any])
      
      inline def set99(value: typingsJapgolly.multicodec.distSrcGeneratedTypesMod.CodecName): Self = StObject.set(x, "99", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.multicodec.multicodecStrings.IDENTITY
    - typingsJapgolly.multicodec.multicodecStrings.CIDV1
    - typingsJapgolly.multicodec.multicodecStrings.CIDV2
    - typingsJapgolly.multicodec.multicodecStrings.CIDV3
    - typingsJapgolly.multicodec.multicodecStrings.IP4
    - typingsJapgolly.multicodec.multicodecStrings.TCP
    - typingsJapgolly.multicodec.multicodecStrings.SHA1
    - typingsJapgolly.multicodec.multicodecStrings.SHA2_256
    - typingsJapgolly.multicodec.multicodecStrings.SHA2_512
    - typingsJapgolly.multicodec.multicodecStrings.SHA3_512
    - typingsJapgolly.multicodec.multicodecStrings.SHA3_384
    - typingsJapgolly.multicodec.multicodecStrings.SHA3_256
    - typingsJapgolly.multicodec.multicodecStrings.SHA3_224
    - typingsJapgolly.multicodec.multicodecStrings.SHAKE_128
    - typingsJapgolly.multicodec.multicodecStrings.SHAKE_256
    - typingsJapgolly.multicodec.multicodecStrings.KECCAK_224
    - typingsJapgolly.multicodec.multicodecStrings.KECCAK_256
    - typingsJapgolly.multicodec.multicodecStrings.KECCAK_384
    - typingsJapgolly.multicodec.multicodecStrings.KECCAK_512
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE3
    - typingsJapgolly.multicodec.multicodecStrings.DCCP
    - typingsJapgolly.multicodec.multicodecStrings.MURMUR3_128
    - typingsJapgolly.multicodec.multicodecStrings.MURMUR3_32
    - typingsJapgolly.multicodec.multicodecStrings.IP6
    - typingsJapgolly.multicodec.multicodecStrings.IP6ZONE
    - typingsJapgolly.multicodec.multicodecStrings.PATH
    - typingsJapgolly.multicodec.multicodecStrings.MULTICODEC
    - typingsJapgolly.multicodec.multicodecStrings.MULTIHASH
    - typingsJapgolly.multicodec.multicodecStrings.MULTIADDR
    - typingsJapgolly.multicodec.multicodecStrings.MULTIBASE
    - typingsJapgolly.multicodec.multicodecStrings.DNS
    - typingsJapgolly.multicodec.multicodecStrings.DNS4
    - typingsJapgolly.multicodec.multicodecStrings.DNS6
    - typingsJapgolly.multicodec.multicodecStrings.DNSADDR
    - typingsJapgolly.multicodec.multicodecStrings.PROTOBUF
    - typingsJapgolly.multicodec.multicodecStrings.CBOR
    - typingsJapgolly.multicodec.multicodecStrings.RAW
    - typingsJapgolly.multicodec.multicodecStrings.DBL_SHA2_256
    - typingsJapgolly.multicodec.multicodecStrings.RLP
    - typingsJapgolly.multicodec.multicodecStrings.BENCODE
    - typingsJapgolly.multicodec.multicodecStrings.DAG_PB
    - typingsJapgolly.multicodec.multicodecStrings.DAG_CBOR
    - typingsJapgolly.multicodec.multicodecStrings.LIBP2P_KEY
    - typingsJapgolly.multicodec.multicodecStrings.GIT_RAW
    - typingsJapgolly.multicodec.multicodecStrings.TORRENT_INFO
    - typingsJapgolly.multicodec.multicodecStrings.TORRENT_FILE
    - typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_TX
    - typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_PR
    - typingsJapgolly.multicodec.multicodecStrings.SCTP
    - typingsJapgolly.multicodec.multicodecStrings.DAG_JOSE
    - typingsJapgolly.multicodec.multicodecStrings.DAG_COSE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK_LIST
    - typingsJapgolly.multicodec.multicodecStrings.ETH_TX_TRIE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_TX
    - typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT_TRIE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT
    - typingsJapgolly.multicodec.multicodecStrings.ETH_STATE_TRIE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_ACCOUNT_SNAPSHOT
    - typingsJapgolly.multicodec.multicodecStrings.ETH_STORAGE_TRIE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_RECEIPT_LOG_TRIE
    - typingsJapgolly.multicodec.multicodecStrings.ETH_RECIEPT_LOG
    - typingsJapgolly.multicodec.multicodecStrings.BITCOIN_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.BITCOIN_TX
    - typingsJapgolly.multicodec.multicodecStrings.BITCOIN_WITNESS_COMMITMENT
    - typingsJapgolly.multicodec.multicodecStrings.ZCASH_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.ZCASH_TX
    - typingsJapgolly.multicodec.multicodecStrings.CAIP_50
    - typingsJapgolly.multicodec.multicodecStrings.STREAMID
    - typingsJapgolly.multicodec.multicodecStrings.STELLAR_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.STELLAR_TX
    - typingsJapgolly.multicodec.multicodecStrings.MD4
    - typingsJapgolly.multicodec.multicodecStrings.MD5
    - typingsJapgolly.multicodec.multicodecStrings.BMT
    - typingsJapgolly.multicodec.multicodecStrings.DECRED_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.DECRED_TX
    - typingsJapgolly.multicodec.multicodecStrings.IPLD_NS
    - typingsJapgolly.multicodec.multicodecStrings.IPFS_NS
    - typingsJapgolly.multicodec.multicodecStrings.SWARM_NS
    - typingsJapgolly.multicodec.multicodecStrings.IPNS_NS
    - typingsJapgolly.multicodec.multicodecStrings.ZERONET
    - typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PUB
    - typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1_PUB
    - typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G2_PUB
    - typingsJapgolly.multicodec.multicodecStrings.X25519_PUB
    - typingsJapgolly.multicodec.multicodecStrings.ED25519_PUB
    - typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1G2_PUB
    - typingsJapgolly.multicodec.multicodecStrings.DASH_BLOCK
    - typingsJapgolly.multicodec.multicodecStrings.DASH_TX
    - typingsJapgolly.multicodec.multicodecStrings.SWARM_MANIFEST
    - typingsJapgolly.multicodec.multicodecStrings.SWARM_FEED
    - typingsJapgolly.multicodec.multicodecStrings.UDP
    - typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_STAR
    - typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_DIRECT
    - typingsJapgolly.multicodec.multicodecStrings.P2P_STARDUST
    - typingsJapgolly.multicodec.multicodecStrings.P2P_CIRCUIT
    - typingsJapgolly.multicodec.multicodecStrings.DAG_JSON
    - typingsJapgolly.multicodec.multicodecStrings.UDT
    - typingsJapgolly.multicodec.multicodecStrings.UTP
    - typingsJapgolly.multicodec.multicodecStrings.UNIX
    - typingsJapgolly.multicodec.multicodecStrings.THREAD
    - typingsJapgolly.multicodec.multicodecStrings.P2P
    - typingsJapgolly.multicodec.multicodecStrings.IPFS
    - typingsJapgolly.multicodec.multicodecStrings.HTTPS
    - typingsJapgolly.multicodec.multicodecStrings.ONION
    - typingsJapgolly.multicodec.multicodecStrings.ONION3
    - typingsJapgolly.multicodec.multicodecStrings.GARLIC64
    - typingsJapgolly.multicodec.multicodecStrings.GARLIC32
    - typingsJapgolly.multicodec.multicodecStrings.TLS
    - typingsJapgolly.multicodec.multicodecStrings.NOISE
    - typingsJapgolly.multicodec.multicodecStrings.QUIC
    - typingsJapgolly.multicodec.multicodecStrings.WS
    - typingsJapgolly.multicodec.multicodecStrings.WSS
    - typingsJapgolly.multicodec.multicodecStrings.P2P_WEBSOCKET_STAR
    - typingsJapgolly.multicodec.multicodecStrings.HTTP
    - typingsJapgolly.multicodec.multicodecStrings.SWHID_1_SNP
    - typingsJapgolly.multicodec.multicodecStrings.JSON
    - typingsJapgolly.multicodec.multicodecStrings.MESSAGEPACK
    - typingsJapgolly.multicodec.multicodecStrings.LIBP2P_PEER_RECORD
    - typingsJapgolly.multicodec.multicodecStrings.LIBP2P_RELAY_RSVP
    - typingsJapgolly.multicodec.multicodecStrings.CAR_INDEX_SORTED
    - typingsJapgolly.multicodec.multicodecStrings.SHA2_256_TRUNC254_PADDED
    - typingsJapgolly.multicodec.multicodecStrings.RIPEMD_128
    - typingsJapgolly.multicodec.multicodecStrings.RIPEMD_160
    - typingsJapgolly.multicodec.multicodecStrings.RIPEMD_256
    - typingsJapgolly.multicodec.multicodecStrings.RIPEMD_320
    - typingsJapgolly.multicodec.multicodecStrings.X11
    - typingsJapgolly.multicodec.multicodecStrings.P256_PUB
    - typingsJapgolly.multicodec.multicodecStrings.P384_PUB
    - typingsJapgolly.multicodec.multicodecStrings.P521_PUB
    - typingsJapgolly.multicodec.multicodecStrings.ED448_PUB
    - typingsJapgolly.multicodec.multicodecStrings.X448_PUB
    - typingsJapgolly.multicodec.multicodecStrings.ED25519_PRIV
    - typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PRIV
    - typingsJapgolly.multicodec.multicodecStrings.X25519_PRIV
    - typingsJapgolly.multicodec.multicodecStrings.KANGAROOTWELVE
    - typingsJapgolly.multicodec.multicodecStrings.SM3_256
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_8
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_16
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_24
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_32
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_40
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_48
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_56
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_64
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_72
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_80
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_88
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_96
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_104
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_112
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_120
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_128
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_136
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_144
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_152
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_160
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_168
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_176
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_184
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_192
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_200
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_208
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_216
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_224
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_232
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_240
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_248
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_256
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_264
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_272
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_280
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_288
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_296
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_304
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_312
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_320
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_328
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_336
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_344
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_352
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_360
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_368
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_376
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_384
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_392
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_400
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_408
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_416
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_424
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_432
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_440
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_448
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_456
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_464
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_472
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_480
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_488
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_496
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_504
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_512
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_8
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_16
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_24
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_32
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_40
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_48
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_56
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_64
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_72
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_80
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_88
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_96
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_104
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_112
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_120
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_128
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_136
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_144
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_152
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_160
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_168
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_176
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_184
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_192
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_200
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_208
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_216
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_224
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_232
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_240
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_248
    - typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_256
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_8
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_16
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_24
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_32
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_40
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_48
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_56
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_64
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_72
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_80
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_88
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_96
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_104
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_112
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_120
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_128
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_136
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_144
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_152
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_160
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_168
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_176
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_184
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_192
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_200
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_208
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_216
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_224
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_232
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_240
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_248
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN256_256
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_8
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_16
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_24
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_32
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_40
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_48
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_56
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_64
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_72
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_80
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_88
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_96
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_104
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_112
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_120
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_128
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_136
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_144
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_152
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_160
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_168
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_176
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_184
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_192
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_200
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_208
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_216
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_224
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_232
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_240
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_248
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_256
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_264
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_272
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_280
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_288
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_296
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_304
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_312
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_320
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_328
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_336
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_344
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_352
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_360
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_368
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_376
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_384
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_392
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_400
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_408
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_416
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_424
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_432
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_440
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_448
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_456
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_464
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_472
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_480
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_488
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_496
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_504
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN512_512
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_8
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_16
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_24
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_32
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_40
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_48
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_56
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_64
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_72
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_80
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_88
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_96
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_104
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_112
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_120
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_128
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_136
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_144
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_152
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_160
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_168
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_176
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_184
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_192
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_200
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_208
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_216
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_224
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_232
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_240
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_248
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_256
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_264
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_272
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_280
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_288
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_296
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_304
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_312
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_320
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_328
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_336
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_344
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_352
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_360
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_368
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_376
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_384
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_392
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_400
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_408
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_416
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_424
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_432
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_440
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_448
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_456
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_464
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_472
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_480
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_488
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_496
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_504
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_512
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_520
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_528
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_536
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_544
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_552
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_560
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_568
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_576
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_584
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_592
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_600
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_608
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_616
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_624
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_632
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_640
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_648
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_656
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_664
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_672
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_680
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_688
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_696
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_704
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_712
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_720
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_728
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_736
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_744
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_752
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_760
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_768
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_776
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_784
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_792
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_800
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_808
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_816
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_824
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_832
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_840
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_848
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_856
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_864
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_872
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_880
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_888
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_896
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_904
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_912
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_920
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_928
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_936
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_944
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_952
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_960
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_968
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_976
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_984
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_992
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1000
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1008
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1016
    - typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1024
    - typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1
    - typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1_SC
    - typingsJapgolly.multicodec.multicodecStrings.ZEROXCERT_IMPRINT_256
    - typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_UNSEALED
    - typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_SEALED
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V0
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V1
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V0
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V1
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V0
    - typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V1
    - typingsJapgolly.multicodec.multicodecStrings.SKYNET_NS
    - typingsJapgolly.multicodec.multicodecStrings.ARWEAVE_NS
  */
  trait CodecConstant extends StObject
  object CodecConstant {
    
    inline def ARWEAVE_NS: typingsJapgolly.multicodec.multicodecStrings.ARWEAVE_NS = "ARWEAVE_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ARWEAVE_NS]
    
    inline def BENCODE: typingsJapgolly.multicodec.multicodecStrings.BENCODE = "BENCODE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BENCODE]
    
    inline def BITCOIN_BLOCK: typingsJapgolly.multicodec.multicodecStrings.BITCOIN_BLOCK = "BITCOIN_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BITCOIN_BLOCK]
    
    inline def BITCOIN_TX: typingsJapgolly.multicodec.multicodecStrings.BITCOIN_TX = "BITCOIN_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BITCOIN_TX]
    
    inline def BITCOIN_WITNESS_COMMITMENT: typingsJapgolly.multicodec.multicodecStrings.BITCOIN_WITNESS_COMMITMENT = "BITCOIN_WITNESS_COMMITMENT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BITCOIN_WITNESS_COMMITMENT]
    
    inline def BLAKE2B_104: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_104 = "BLAKE2B_104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_104]
    
    inline def BLAKE2B_112: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_112 = "BLAKE2B_112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_112]
    
    inline def BLAKE2B_120: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_120 = "BLAKE2B_120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_120]
    
    inline def BLAKE2B_128: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_128 = "BLAKE2B_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_128]
    
    inline def BLAKE2B_136: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_136 = "BLAKE2B_136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_136]
    
    inline def BLAKE2B_144: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_144 = "BLAKE2B_144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_144]
    
    inline def BLAKE2B_152: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_152 = "BLAKE2B_152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_152]
    
    inline def BLAKE2B_16: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_16 = "BLAKE2B_16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_16]
    
    inline def BLAKE2B_160: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_160 = "BLAKE2B_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_160]
    
    inline def BLAKE2B_168: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_168 = "BLAKE2B_168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_168]
    
    inline def BLAKE2B_176: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_176 = "BLAKE2B_176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_176]
    
    inline def BLAKE2B_184: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_184 = "BLAKE2B_184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_184]
    
    inline def BLAKE2B_192: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_192 = "BLAKE2B_192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_192]
    
    inline def BLAKE2B_200: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_200 = "BLAKE2B_200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_200]
    
    inline def BLAKE2B_208: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_208 = "BLAKE2B_208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_208]
    
    inline def BLAKE2B_216: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_216 = "BLAKE2B_216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_216]
    
    inline def BLAKE2B_224: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_224 = "BLAKE2B_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_224]
    
    inline def BLAKE2B_232: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_232 = "BLAKE2B_232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_232]
    
    inline def BLAKE2B_24: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_24 = "BLAKE2B_24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_24]
    
    inline def BLAKE2B_240: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_240 = "BLAKE2B_240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_240]
    
    inline def BLAKE2B_248: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_248 = "BLAKE2B_248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_248]
    
    inline def BLAKE2B_256: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_256 = "BLAKE2B_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_256]
    
    inline def BLAKE2B_264: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_264 = "BLAKE2B_264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_264]
    
    inline def BLAKE2B_272: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_272 = "BLAKE2B_272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_272]
    
    inline def BLAKE2B_280: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_280 = "BLAKE2B_280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_280]
    
    inline def BLAKE2B_288: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_288 = "BLAKE2B_288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_288]
    
    inline def BLAKE2B_296: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_296 = "BLAKE2B_296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_296]
    
    inline def BLAKE2B_304: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_304 = "BLAKE2B_304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_304]
    
    inline def BLAKE2B_312: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_312 = "BLAKE2B_312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_312]
    
    inline def BLAKE2B_32: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_32 = "BLAKE2B_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_32]
    
    inline def BLAKE2B_320: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_320 = "BLAKE2B_320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_320]
    
    inline def BLAKE2B_328: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_328 = "BLAKE2B_328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_328]
    
    inline def BLAKE2B_336: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_336 = "BLAKE2B_336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_336]
    
    inline def BLAKE2B_344: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_344 = "BLAKE2B_344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_344]
    
    inline def BLAKE2B_352: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_352 = "BLAKE2B_352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_352]
    
    inline def BLAKE2B_360: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_360 = "BLAKE2B_360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_360]
    
    inline def BLAKE2B_368: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_368 = "BLAKE2B_368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_368]
    
    inline def BLAKE2B_376: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_376 = "BLAKE2B_376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_376]
    
    inline def BLAKE2B_384: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_384 = "BLAKE2B_384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_384]
    
    inline def BLAKE2B_392: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_392 = "BLAKE2B_392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_392]
    
    inline def BLAKE2B_40: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_40 = "BLAKE2B_40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_40]
    
    inline def BLAKE2B_400: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_400 = "BLAKE2B_400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_400]
    
    inline def BLAKE2B_408: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_408 = "BLAKE2B_408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_408]
    
    inline def BLAKE2B_416: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_416 = "BLAKE2B_416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_416]
    
    inline def BLAKE2B_424: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_424 = "BLAKE2B_424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_424]
    
    inline def BLAKE2B_432: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_432 = "BLAKE2B_432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_432]
    
    inline def BLAKE2B_440: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_440 = "BLAKE2B_440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_440]
    
    inline def BLAKE2B_448: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_448 = "BLAKE2B_448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_448]
    
    inline def BLAKE2B_456: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_456 = "BLAKE2B_456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_456]
    
    inline def BLAKE2B_464: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_464 = "BLAKE2B_464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_464]
    
    inline def BLAKE2B_472: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_472 = "BLAKE2B_472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_472]
    
    inline def BLAKE2B_48: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_48 = "BLAKE2B_48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_48]
    
    inline def BLAKE2B_480: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_480 = "BLAKE2B_480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_480]
    
    inline def BLAKE2B_488: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_488 = "BLAKE2B_488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_488]
    
    inline def BLAKE2B_496: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_496 = "BLAKE2B_496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_496]
    
    inline def BLAKE2B_504: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_504 = "BLAKE2B_504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_504]
    
    inline def BLAKE2B_512: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_512 = "BLAKE2B_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_512]
    
    inline def BLAKE2B_56: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_56 = "BLAKE2B_56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_56]
    
    inline def BLAKE2B_64: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_64 = "BLAKE2B_64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_64]
    
    inline def BLAKE2B_72: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_72 = "BLAKE2B_72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_72]
    
    inline def BLAKE2B_8: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_8 = "BLAKE2B_8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_8]
    
    inline def BLAKE2B_80: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_80 = "BLAKE2B_80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_80]
    
    inline def BLAKE2B_88: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_88 = "BLAKE2B_88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_88]
    
    inline def BLAKE2B_96: typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_96 = "BLAKE2B_96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2B_96]
    
    inline def BLAKE2S_104: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_104 = "BLAKE2S_104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_104]
    
    inline def BLAKE2S_112: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_112 = "BLAKE2S_112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_112]
    
    inline def BLAKE2S_120: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_120 = "BLAKE2S_120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_120]
    
    inline def BLAKE2S_128: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_128 = "BLAKE2S_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_128]
    
    inline def BLAKE2S_136: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_136 = "BLAKE2S_136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_136]
    
    inline def BLAKE2S_144: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_144 = "BLAKE2S_144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_144]
    
    inline def BLAKE2S_152: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_152 = "BLAKE2S_152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_152]
    
    inline def BLAKE2S_16: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_16 = "BLAKE2S_16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_16]
    
    inline def BLAKE2S_160: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_160 = "BLAKE2S_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_160]
    
    inline def BLAKE2S_168: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_168 = "BLAKE2S_168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_168]
    
    inline def BLAKE2S_176: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_176 = "BLAKE2S_176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_176]
    
    inline def BLAKE2S_184: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_184 = "BLAKE2S_184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_184]
    
    inline def BLAKE2S_192: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_192 = "BLAKE2S_192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_192]
    
    inline def BLAKE2S_200: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_200 = "BLAKE2S_200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_200]
    
    inline def BLAKE2S_208: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_208 = "BLAKE2S_208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_208]
    
    inline def BLAKE2S_216: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_216 = "BLAKE2S_216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_216]
    
    inline def BLAKE2S_224: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_224 = "BLAKE2S_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_224]
    
    inline def BLAKE2S_232: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_232 = "BLAKE2S_232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_232]
    
    inline def BLAKE2S_24: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_24 = "BLAKE2S_24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_24]
    
    inline def BLAKE2S_240: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_240 = "BLAKE2S_240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_240]
    
    inline def BLAKE2S_248: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_248 = "BLAKE2S_248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_248]
    
    inline def BLAKE2S_256: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_256 = "BLAKE2S_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_256]
    
    inline def BLAKE2S_32: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_32 = "BLAKE2S_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_32]
    
    inline def BLAKE2S_40: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_40 = "BLAKE2S_40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_40]
    
    inline def BLAKE2S_48: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_48 = "BLAKE2S_48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_48]
    
    inline def BLAKE2S_56: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_56 = "BLAKE2S_56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_56]
    
    inline def BLAKE2S_64: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_64 = "BLAKE2S_64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_64]
    
    inline def BLAKE2S_72: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_72 = "BLAKE2S_72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_72]
    
    inline def BLAKE2S_8: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_8 = "BLAKE2S_8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_8]
    
    inline def BLAKE2S_80: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_80 = "BLAKE2S_80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_80]
    
    inline def BLAKE2S_88: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_88 = "BLAKE2S_88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_88]
    
    inline def BLAKE2S_96: typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_96 = "BLAKE2S_96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE2S_96]
    
    inline def BLAKE3: typingsJapgolly.multicodec.multicodecStrings.BLAKE3 = "BLAKE3".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLAKE3]
    
    inline def BLS12_381_G1G2_PUB: typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1G2_PUB = "BLS12_381_G1G2_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1G2_PUB]
    
    inline def BLS12_381_G1_PUB: typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1_PUB = "BLS12_381_G1_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G1_PUB]
    
    inline def BLS12_381_G2_PUB: typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G2_PUB = "BLS12_381_G2_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BLS12_381_G2_PUB]
    
    inline def BMT: typingsJapgolly.multicodec.multicodecStrings.BMT = "BMT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.BMT]
    
    inline def CAIP_50: typingsJapgolly.multicodec.multicodecStrings.CAIP_50 = "CAIP_50".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CAIP_50]
    
    inline def CAR_INDEX_SORTED: typingsJapgolly.multicodec.multicodecStrings.CAR_INDEX_SORTED = "CAR_INDEX_SORTED".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CAR_INDEX_SORTED]
    
    inline def CBOR: typingsJapgolly.multicodec.multicodecStrings.CBOR = "CBOR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CBOR]
    
    inline def CIDV1: typingsJapgolly.multicodec.multicodecStrings.CIDV1 = "CIDV1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CIDV1]
    
    inline def CIDV2: typingsJapgolly.multicodec.multicodecStrings.CIDV2 = "CIDV2".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CIDV2]
    
    inline def CIDV3: typingsJapgolly.multicodec.multicodecStrings.CIDV3 = "CIDV3".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.CIDV3]
    
    inline def DAG_CBOR: typingsJapgolly.multicodec.multicodecStrings.DAG_CBOR = "DAG_CBOR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DAG_CBOR]
    
    inline def DAG_COSE: typingsJapgolly.multicodec.multicodecStrings.DAG_COSE = "DAG_COSE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DAG_COSE]
    
    inline def DAG_JOSE: typingsJapgolly.multicodec.multicodecStrings.DAG_JOSE = "DAG_JOSE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DAG_JOSE]
    
    inline def DAG_JSON: typingsJapgolly.multicodec.multicodecStrings.DAG_JSON = "DAG_JSON".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DAG_JSON]
    
    inline def DAG_PB: typingsJapgolly.multicodec.multicodecStrings.DAG_PB = "DAG_PB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DAG_PB]
    
    inline def DASH_BLOCK: typingsJapgolly.multicodec.multicodecStrings.DASH_BLOCK = "DASH_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DASH_BLOCK]
    
    inline def DASH_TX: typingsJapgolly.multicodec.multicodecStrings.DASH_TX = "DASH_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DASH_TX]
    
    inline def DBL_SHA2_256: typingsJapgolly.multicodec.multicodecStrings.DBL_SHA2_256 = "DBL_SHA2_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DBL_SHA2_256]
    
    inline def DCCP: typingsJapgolly.multicodec.multicodecStrings.DCCP = "DCCP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DCCP]
    
    inline def DECRED_BLOCK: typingsJapgolly.multicodec.multicodecStrings.DECRED_BLOCK = "DECRED_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DECRED_BLOCK]
    
    inline def DECRED_TX: typingsJapgolly.multicodec.multicodecStrings.DECRED_TX = "DECRED_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DECRED_TX]
    
    inline def DNS: typingsJapgolly.multicodec.multicodecStrings.DNS = "DNS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DNS]
    
    inline def DNS4: typingsJapgolly.multicodec.multicodecStrings.DNS4 = "DNS4".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DNS4]
    
    inline def DNS6: typingsJapgolly.multicodec.multicodecStrings.DNS6 = "DNS6".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DNS6]
    
    inline def DNSADDR: typingsJapgolly.multicodec.multicodecStrings.DNSADDR = "DNSADDR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.DNSADDR]
    
    inline def ED25519_PRIV: typingsJapgolly.multicodec.multicodecStrings.ED25519_PRIV = "ED25519_PRIV".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ED25519_PRIV]
    
    inline def ED25519_PUB: typingsJapgolly.multicodec.multicodecStrings.ED25519_PUB = "ED25519_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ED25519_PUB]
    
    inline def ED448_PUB: typingsJapgolly.multicodec.multicodecStrings.ED448_PUB = "ED448_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ED448_PUB]
    
    inline def ETH_ACCOUNT_SNAPSHOT: typingsJapgolly.multicodec.multicodecStrings.ETH_ACCOUNT_SNAPSHOT = "ETH_ACCOUNT_SNAPSHOT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_ACCOUNT_SNAPSHOT]
    
    inline def ETH_BLOCK: typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK = "ETH_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK]
    
    inline def ETH_BLOCK_LIST: typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK_LIST = "ETH_BLOCK_LIST".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_BLOCK_LIST]
    
    inline def ETH_RECEIPT_LOG_TRIE: typingsJapgolly.multicodec.multicodecStrings.ETH_RECEIPT_LOG_TRIE = "ETH_RECEIPT_LOG_TRIE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_RECEIPT_LOG_TRIE]
    
    inline def ETH_RECIEPT_LOG: typingsJapgolly.multicodec.multicodecStrings.ETH_RECIEPT_LOG = "ETH_RECIEPT_LOG".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_RECIEPT_LOG]
    
    inline def ETH_STATE_TRIE: typingsJapgolly.multicodec.multicodecStrings.ETH_STATE_TRIE = "ETH_STATE_TRIE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_STATE_TRIE]
    
    inline def ETH_STORAGE_TRIE: typingsJapgolly.multicodec.multicodecStrings.ETH_STORAGE_TRIE = "ETH_STORAGE_TRIE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_STORAGE_TRIE]
    
    inline def ETH_TX: typingsJapgolly.multicodec.multicodecStrings.ETH_TX = "ETH_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_TX]
    
    inline def ETH_TX_RECEIPT: typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT = "ETH_TX_RECEIPT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT]
    
    inline def ETH_TX_RECEIPT_TRIE: typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT_TRIE = "ETH_TX_RECEIPT_TRIE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_TX_RECEIPT_TRIE]
    
    inline def ETH_TX_TRIE: typingsJapgolly.multicodec.multicodecStrings.ETH_TX_TRIE = "ETH_TX_TRIE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ETH_TX_TRIE]
    
    inline def FIL_COMMITMENT_SEALED: typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_SEALED = "FIL_COMMITMENT_SEALED".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_SEALED]
    
    inline def FIL_COMMITMENT_UNSEALED: typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_UNSEALED = "FIL_COMMITMENT_UNSEALED".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.FIL_COMMITMENT_UNSEALED]
    
    inline def GARLIC32: typingsJapgolly.multicodec.multicodecStrings.GARLIC32 = "GARLIC32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.GARLIC32]
    
    inline def GARLIC64: typingsJapgolly.multicodec.multicodecStrings.GARLIC64 = "GARLIC64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.GARLIC64]
    
    inline def GIT_RAW: typingsJapgolly.multicodec.multicodecStrings.GIT_RAW = "GIT_RAW".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.GIT_RAW]
    
    inline def HOLOCHAIN_ADR_V0: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V0 = "HOLOCHAIN_ADR_V0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V0]
    
    inline def HOLOCHAIN_ADR_V1: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V1 = "HOLOCHAIN_ADR_V1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_ADR_V1]
    
    inline def HOLOCHAIN_KEY_V0: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V0 = "HOLOCHAIN_KEY_V0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V0]
    
    inline def HOLOCHAIN_KEY_V1: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V1 = "HOLOCHAIN_KEY_V1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_KEY_V1]
    
    inline def HOLOCHAIN_SIG_V0: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V0 = "HOLOCHAIN_SIG_V0".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V0]
    
    inline def HOLOCHAIN_SIG_V1: typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V1 = "HOLOCHAIN_SIG_V1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HOLOCHAIN_SIG_V1]
    
    inline def HTTP: typingsJapgolly.multicodec.multicodecStrings.HTTP = "HTTP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HTTP]
    
    inline def HTTPS: typingsJapgolly.multicodec.multicodecStrings.HTTPS = "HTTPS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.HTTPS]
    
    inline def IDENTITY: typingsJapgolly.multicodec.multicodecStrings.IDENTITY = "IDENTITY".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IDENTITY]
    
    inline def IP4: typingsJapgolly.multicodec.multicodecStrings.IP4 = "IP4".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IP4]
    
    inline def IP6: typingsJapgolly.multicodec.multicodecStrings.IP6 = "IP6".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IP6]
    
    inline def IP6ZONE: typingsJapgolly.multicodec.multicodecStrings.IP6ZONE = "IP6ZONE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IP6ZONE]
    
    inline def IPFS: typingsJapgolly.multicodec.multicodecStrings.IPFS = "IPFS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IPFS]
    
    inline def IPFS_NS: typingsJapgolly.multicodec.multicodecStrings.IPFS_NS = "IPFS_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IPFS_NS]
    
    inline def IPLD_NS: typingsJapgolly.multicodec.multicodecStrings.IPLD_NS = "IPLD_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IPLD_NS]
    
    inline def IPNS_NS: typingsJapgolly.multicodec.multicodecStrings.IPNS_NS = "IPNS_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.IPNS_NS]
    
    inline def JSON: typingsJapgolly.multicodec.multicodecStrings.JSON = "JSON".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.JSON]
    
    inline def KANGAROOTWELVE: typingsJapgolly.multicodec.multicodecStrings.KANGAROOTWELVE = "KANGAROOTWELVE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.KANGAROOTWELVE]
    
    inline def KECCAK_224: typingsJapgolly.multicodec.multicodecStrings.KECCAK_224 = "KECCAK_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.KECCAK_224]
    
    inline def KECCAK_256: typingsJapgolly.multicodec.multicodecStrings.KECCAK_256 = "KECCAK_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.KECCAK_256]
    
    inline def KECCAK_384: typingsJapgolly.multicodec.multicodecStrings.KECCAK_384 = "KECCAK_384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.KECCAK_384]
    
    inline def KECCAK_512: typingsJapgolly.multicodec.multicodecStrings.KECCAK_512 = "KECCAK_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.KECCAK_512]
    
    inline def LEOFCOIN_BLOCK: typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_BLOCK = "LEOFCOIN_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_BLOCK]
    
    inline def LEOFCOIN_PR: typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_PR = "LEOFCOIN_PR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_PR]
    
    inline def LEOFCOIN_TX: typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_TX = "LEOFCOIN_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LEOFCOIN_TX]
    
    inline def LIBP2P_KEY: typingsJapgolly.multicodec.multicodecStrings.LIBP2P_KEY = "LIBP2P_KEY".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LIBP2P_KEY]
    
    inline def LIBP2P_PEER_RECORD: typingsJapgolly.multicodec.multicodecStrings.LIBP2P_PEER_RECORD = "LIBP2P_PEER_RECORD".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LIBP2P_PEER_RECORD]
    
    inline def LIBP2P_RELAY_RSVP: typingsJapgolly.multicodec.multicodecStrings.LIBP2P_RELAY_RSVP = "LIBP2P_RELAY_RSVP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.LIBP2P_RELAY_RSVP]
    
    inline def MD4: typingsJapgolly.multicodec.multicodecStrings.MD4 = "MD4".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MD4]
    
    inline def MD5: typingsJapgolly.multicodec.multicodecStrings.MD5 = "MD5".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MD5]
    
    inline def MESSAGEPACK: typingsJapgolly.multicodec.multicodecStrings.MESSAGEPACK = "MESSAGEPACK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MESSAGEPACK]
    
    inline def MULTIADDR: typingsJapgolly.multicodec.multicodecStrings.MULTIADDR = "MULTIADDR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MULTIADDR]
    
    inline def MULTIBASE: typingsJapgolly.multicodec.multicodecStrings.MULTIBASE = "MULTIBASE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MULTIBASE]
    
    inline def MULTICODEC: typingsJapgolly.multicodec.multicodecStrings.MULTICODEC = "MULTICODEC".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MULTICODEC]
    
    inline def MULTIHASH: typingsJapgolly.multicodec.multicodecStrings.MULTIHASH = "MULTIHASH".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MULTIHASH]
    
    inline def MURMUR3_128: typingsJapgolly.multicodec.multicodecStrings.MURMUR3_128 = "MURMUR3_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MURMUR3_128]
    
    inline def MURMUR3_32: typingsJapgolly.multicodec.multicodecStrings.MURMUR3_32 = "MURMUR3_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.MURMUR3_32]
    
    inline def NOISE: typingsJapgolly.multicodec.multicodecStrings.NOISE = "NOISE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.NOISE]
    
    inline def ONION: typingsJapgolly.multicodec.multicodecStrings.ONION = "ONION".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ONION]
    
    inline def ONION3: typingsJapgolly.multicodec.multicodecStrings.ONION3 = "ONION3".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ONION3]
    
    inline def P256_PUB: typingsJapgolly.multicodec.multicodecStrings.P256_PUB = "P256_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P256_PUB]
    
    inline def P2P: typingsJapgolly.multicodec.multicodecStrings.P2P = "P2P".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P]
    
    inline def P2P_CIRCUIT: typingsJapgolly.multicodec.multicodecStrings.P2P_CIRCUIT = "P2P_CIRCUIT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P_CIRCUIT]
    
    inline def P2P_STARDUST: typingsJapgolly.multicodec.multicodecStrings.P2P_STARDUST = "P2P_STARDUST".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P_STARDUST]
    
    inline def P2P_WEBRTC_DIRECT: typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_DIRECT = "P2P_WEBRTC_DIRECT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_DIRECT]
    
    inline def P2P_WEBRTC_STAR: typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_STAR = "P2P_WEBRTC_STAR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P_WEBRTC_STAR]
    
    inline def P2P_WEBSOCKET_STAR: typingsJapgolly.multicodec.multicodecStrings.P2P_WEBSOCKET_STAR = "P2P_WEBSOCKET_STAR".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P2P_WEBSOCKET_STAR]
    
    inline def P384_PUB: typingsJapgolly.multicodec.multicodecStrings.P384_PUB = "P384_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P384_PUB]
    
    inline def P521_PUB: typingsJapgolly.multicodec.multicodecStrings.P521_PUB = "P521_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.P521_PUB]
    
    inline def PATH: typingsJapgolly.multicodec.multicodecStrings.PATH = "PATH".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.PATH]
    
    inline def POSEIDON_BLS12_381_A2_FC1: typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1 = "POSEIDON_BLS12_381_A2_FC1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1]
    
    inline def POSEIDON_BLS12_381_A2_FC1_SC: typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1_SC = "POSEIDON_BLS12_381_A2_FC1_SC".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.POSEIDON_BLS12_381_A2_FC1_SC]
    
    inline def PROTOBUF: typingsJapgolly.multicodec.multicodecStrings.PROTOBUF = "PROTOBUF".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.PROTOBUF]
    
    inline def QUIC: typingsJapgolly.multicodec.multicodecStrings.QUIC = "QUIC".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.QUIC]
    
    inline def RAW: typingsJapgolly.multicodec.multicodecStrings.RAW = "RAW".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RAW]
    
    inline def RIPEMD_128: typingsJapgolly.multicodec.multicodecStrings.RIPEMD_128 = "RIPEMD_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RIPEMD_128]
    
    inline def RIPEMD_160: typingsJapgolly.multicodec.multicodecStrings.RIPEMD_160 = "RIPEMD_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RIPEMD_160]
    
    inline def RIPEMD_256: typingsJapgolly.multicodec.multicodecStrings.RIPEMD_256 = "RIPEMD_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RIPEMD_256]
    
    inline def RIPEMD_320: typingsJapgolly.multicodec.multicodecStrings.RIPEMD_320 = "RIPEMD_320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RIPEMD_320]
    
    inline def RLP: typingsJapgolly.multicodec.multicodecStrings.RLP = "RLP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.RLP]
    
    inline def SCTP: typingsJapgolly.multicodec.multicodecStrings.SCTP = "SCTP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SCTP]
    
    inline def SECP256K1_PRIV: typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PRIV = "SECP256K1_PRIV".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PRIV]
    
    inline def SECP256K1_PUB: typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PUB = "SECP256K1_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SECP256K1_PUB]
    
    inline def SHA1: typingsJapgolly.multicodec.multicodecStrings.SHA1 = "SHA1".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA1]
    
    inline def SHA2_256: typingsJapgolly.multicodec.multicodecStrings.SHA2_256 = "SHA2_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA2_256]
    
    inline def SHA2_256_TRUNC254_PADDED: typingsJapgolly.multicodec.multicodecStrings.SHA2_256_TRUNC254_PADDED = "SHA2_256_TRUNC254_PADDED".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA2_256_TRUNC254_PADDED]
    
    inline def SHA2_512: typingsJapgolly.multicodec.multicodecStrings.SHA2_512 = "SHA2_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA2_512]
    
    inline def SHA3_224: typingsJapgolly.multicodec.multicodecStrings.SHA3_224 = "SHA3_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA3_224]
    
    inline def SHA3_256: typingsJapgolly.multicodec.multicodecStrings.SHA3_256 = "SHA3_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA3_256]
    
    inline def SHA3_384: typingsJapgolly.multicodec.multicodecStrings.SHA3_384 = "SHA3_384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA3_384]
    
    inline def SHA3_512: typingsJapgolly.multicodec.multicodecStrings.SHA3_512 = "SHA3_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHA3_512]
    
    inline def SHAKE_128: typingsJapgolly.multicodec.multicodecStrings.SHAKE_128 = "SHAKE_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHAKE_128]
    
    inline def SHAKE_256: typingsJapgolly.multicodec.multicodecStrings.SHAKE_256 = "SHAKE_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SHAKE_256]
    
    inline def SKEIN1024_1000: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1000 = "SKEIN1024_1000".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1000]
    
    inline def SKEIN1024_1008: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1008 = "SKEIN1024_1008".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1008]
    
    inline def SKEIN1024_1016: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1016 = "SKEIN1024_1016".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1016]
    
    inline def SKEIN1024_1024: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1024 = "SKEIN1024_1024".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_1024]
    
    inline def SKEIN1024_104: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_104 = "SKEIN1024_104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_104]
    
    inline def SKEIN1024_112: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_112 = "SKEIN1024_112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_112]
    
    inline def SKEIN1024_120: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_120 = "SKEIN1024_120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_120]
    
    inline def SKEIN1024_128: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_128 = "SKEIN1024_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_128]
    
    inline def SKEIN1024_136: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_136 = "SKEIN1024_136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_136]
    
    inline def SKEIN1024_144: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_144 = "SKEIN1024_144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_144]
    
    inline def SKEIN1024_152: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_152 = "SKEIN1024_152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_152]
    
    inline def SKEIN1024_16: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_16 = "SKEIN1024_16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_16]
    
    inline def SKEIN1024_160: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_160 = "SKEIN1024_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_160]
    
    inline def SKEIN1024_168: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_168 = "SKEIN1024_168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_168]
    
    inline def SKEIN1024_176: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_176 = "SKEIN1024_176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_176]
    
    inline def SKEIN1024_184: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_184 = "SKEIN1024_184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_184]
    
    inline def SKEIN1024_192: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_192 = "SKEIN1024_192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_192]
    
    inline def SKEIN1024_200: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_200 = "SKEIN1024_200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_200]
    
    inline def SKEIN1024_208: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_208 = "SKEIN1024_208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_208]
    
    inline def SKEIN1024_216: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_216 = "SKEIN1024_216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_216]
    
    inline def SKEIN1024_224: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_224 = "SKEIN1024_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_224]
    
    inline def SKEIN1024_232: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_232 = "SKEIN1024_232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_232]
    
    inline def SKEIN1024_24: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_24 = "SKEIN1024_24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_24]
    
    inline def SKEIN1024_240: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_240 = "SKEIN1024_240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_240]
    
    inline def SKEIN1024_248: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_248 = "SKEIN1024_248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_248]
    
    inline def SKEIN1024_256: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_256 = "SKEIN1024_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_256]
    
    inline def SKEIN1024_264: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_264 = "SKEIN1024_264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_264]
    
    inline def SKEIN1024_272: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_272 = "SKEIN1024_272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_272]
    
    inline def SKEIN1024_280: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_280 = "SKEIN1024_280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_280]
    
    inline def SKEIN1024_288: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_288 = "SKEIN1024_288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_288]
    
    inline def SKEIN1024_296: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_296 = "SKEIN1024_296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_296]
    
    inline def SKEIN1024_304: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_304 = "SKEIN1024_304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_304]
    
    inline def SKEIN1024_312: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_312 = "SKEIN1024_312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_312]
    
    inline def SKEIN1024_32: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_32 = "SKEIN1024_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_32]
    
    inline def SKEIN1024_320: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_320 = "SKEIN1024_320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_320]
    
    inline def SKEIN1024_328: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_328 = "SKEIN1024_328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_328]
    
    inline def SKEIN1024_336: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_336 = "SKEIN1024_336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_336]
    
    inline def SKEIN1024_344: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_344 = "SKEIN1024_344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_344]
    
    inline def SKEIN1024_352: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_352 = "SKEIN1024_352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_352]
    
    inline def SKEIN1024_360: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_360 = "SKEIN1024_360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_360]
    
    inline def SKEIN1024_368: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_368 = "SKEIN1024_368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_368]
    
    inline def SKEIN1024_376: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_376 = "SKEIN1024_376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_376]
    
    inline def SKEIN1024_384: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_384 = "SKEIN1024_384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_384]
    
    inline def SKEIN1024_392: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_392 = "SKEIN1024_392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_392]
    
    inline def SKEIN1024_40: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_40 = "SKEIN1024_40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_40]
    
    inline def SKEIN1024_400: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_400 = "SKEIN1024_400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_400]
    
    inline def SKEIN1024_408: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_408 = "SKEIN1024_408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_408]
    
    inline def SKEIN1024_416: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_416 = "SKEIN1024_416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_416]
    
    inline def SKEIN1024_424: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_424 = "SKEIN1024_424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_424]
    
    inline def SKEIN1024_432: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_432 = "SKEIN1024_432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_432]
    
    inline def SKEIN1024_440: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_440 = "SKEIN1024_440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_440]
    
    inline def SKEIN1024_448: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_448 = "SKEIN1024_448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_448]
    
    inline def SKEIN1024_456: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_456 = "SKEIN1024_456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_456]
    
    inline def SKEIN1024_464: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_464 = "SKEIN1024_464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_464]
    
    inline def SKEIN1024_472: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_472 = "SKEIN1024_472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_472]
    
    inline def SKEIN1024_48: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_48 = "SKEIN1024_48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_48]
    
    inline def SKEIN1024_480: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_480 = "SKEIN1024_480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_480]
    
    inline def SKEIN1024_488: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_488 = "SKEIN1024_488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_488]
    
    inline def SKEIN1024_496: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_496 = "SKEIN1024_496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_496]
    
    inline def SKEIN1024_504: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_504 = "SKEIN1024_504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_504]
    
    inline def SKEIN1024_512: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_512 = "SKEIN1024_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_512]
    
    inline def SKEIN1024_520: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_520 = "SKEIN1024_520".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_520]
    
    inline def SKEIN1024_528: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_528 = "SKEIN1024_528".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_528]
    
    inline def SKEIN1024_536: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_536 = "SKEIN1024_536".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_536]
    
    inline def SKEIN1024_544: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_544 = "SKEIN1024_544".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_544]
    
    inline def SKEIN1024_552: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_552 = "SKEIN1024_552".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_552]
    
    inline def SKEIN1024_56: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_56 = "SKEIN1024_56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_56]
    
    inline def SKEIN1024_560: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_560 = "SKEIN1024_560".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_560]
    
    inline def SKEIN1024_568: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_568 = "SKEIN1024_568".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_568]
    
    inline def SKEIN1024_576: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_576 = "SKEIN1024_576".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_576]
    
    inline def SKEIN1024_584: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_584 = "SKEIN1024_584".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_584]
    
    inline def SKEIN1024_592: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_592 = "SKEIN1024_592".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_592]
    
    inline def SKEIN1024_600: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_600 = "SKEIN1024_600".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_600]
    
    inline def SKEIN1024_608: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_608 = "SKEIN1024_608".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_608]
    
    inline def SKEIN1024_616: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_616 = "SKEIN1024_616".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_616]
    
    inline def SKEIN1024_624: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_624 = "SKEIN1024_624".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_624]
    
    inline def SKEIN1024_632: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_632 = "SKEIN1024_632".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_632]
    
    inline def SKEIN1024_64: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_64 = "SKEIN1024_64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_64]
    
    inline def SKEIN1024_640: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_640 = "SKEIN1024_640".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_640]
    
    inline def SKEIN1024_648: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_648 = "SKEIN1024_648".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_648]
    
    inline def SKEIN1024_656: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_656 = "SKEIN1024_656".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_656]
    
    inline def SKEIN1024_664: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_664 = "SKEIN1024_664".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_664]
    
    inline def SKEIN1024_672: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_672 = "SKEIN1024_672".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_672]
    
    inline def SKEIN1024_680: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_680 = "SKEIN1024_680".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_680]
    
    inline def SKEIN1024_688: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_688 = "SKEIN1024_688".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_688]
    
    inline def SKEIN1024_696: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_696 = "SKEIN1024_696".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_696]
    
    inline def SKEIN1024_704: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_704 = "SKEIN1024_704".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_704]
    
    inline def SKEIN1024_712: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_712 = "SKEIN1024_712".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_712]
    
    inline def SKEIN1024_72: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_72 = "SKEIN1024_72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_72]
    
    inline def SKEIN1024_720: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_720 = "SKEIN1024_720".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_720]
    
    inline def SKEIN1024_728: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_728 = "SKEIN1024_728".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_728]
    
    inline def SKEIN1024_736: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_736 = "SKEIN1024_736".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_736]
    
    inline def SKEIN1024_744: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_744 = "SKEIN1024_744".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_744]
    
    inline def SKEIN1024_752: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_752 = "SKEIN1024_752".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_752]
    
    inline def SKEIN1024_760: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_760 = "SKEIN1024_760".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_760]
    
    inline def SKEIN1024_768: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_768 = "SKEIN1024_768".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_768]
    
    inline def SKEIN1024_776: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_776 = "SKEIN1024_776".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_776]
    
    inline def SKEIN1024_784: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_784 = "SKEIN1024_784".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_784]
    
    inline def SKEIN1024_792: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_792 = "SKEIN1024_792".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_792]
    
    inline def SKEIN1024_8: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_8 = "SKEIN1024_8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_8]
    
    inline def SKEIN1024_80: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_80 = "SKEIN1024_80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_80]
    
    inline def SKEIN1024_800: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_800 = "SKEIN1024_800".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_800]
    
    inline def SKEIN1024_808: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_808 = "SKEIN1024_808".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_808]
    
    inline def SKEIN1024_816: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_816 = "SKEIN1024_816".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_816]
    
    inline def SKEIN1024_824: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_824 = "SKEIN1024_824".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_824]
    
    inline def SKEIN1024_832: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_832 = "SKEIN1024_832".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_832]
    
    inline def SKEIN1024_840: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_840 = "SKEIN1024_840".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_840]
    
    inline def SKEIN1024_848: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_848 = "SKEIN1024_848".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_848]
    
    inline def SKEIN1024_856: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_856 = "SKEIN1024_856".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_856]
    
    inline def SKEIN1024_864: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_864 = "SKEIN1024_864".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_864]
    
    inline def SKEIN1024_872: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_872 = "SKEIN1024_872".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_872]
    
    inline def SKEIN1024_88: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_88 = "SKEIN1024_88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_88]
    
    inline def SKEIN1024_880: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_880 = "SKEIN1024_880".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_880]
    
    inline def SKEIN1024_888: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_888 = "SKEIN1024_888".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_888]
    
    inline def SKEIN1024_896: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_896 = "SKEIN1024_896".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_896]
    
    inline def SKEIN1024_904: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_904 = "SKEIN1024_904".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_904]
    
    inline def SKEIN1024_912: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_912 = "SKEIN1024_912".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_912]
    
    inline def SKEIN1024_920: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_920 = "SKEIN1024_920".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_920]
    
    inline def SKEIN1024_928: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_928 = "SKEIN1024_928".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_928]
    
    inline def SKEIN1024_936: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_936 = "SKEIN1024_936".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_936]
    
    inline def SKEIN1024_944: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_944 = "SKEIN1024_944".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_944]
    
    inline def SKEIN1024_952: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_952 = "SKEIN1024_952".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_952]
    
    inline def SKEIN1024_96: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_96 = "SKEIN1024_96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_96]
    
    inline def SKEIN1024_960: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_960 = "SKEIN1024_960".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_960]
    
    inline def SKEIN1024_968: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_968 = "SKEIN1024_968".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_968]
    
    inline def SKEIN1024_976: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_976 = "SKEIN1024_976".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_976]
    
    inline def SKEIN1024_984: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_984 = "SKEIN1024_984".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_984]
    
    inline def SKEIN1024_992: typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_992 = "SKEIN1024_992".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN1024_992]
    
    inline def SKEIN256_104: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_104 = "SKEIN256_104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_104]
    
    inline def SKEIN256_112: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_112 = "SKEIN256_112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_112]
    
    inline def SKEIN256_120: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_120 = "SKEIN256_120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_120]
    
    inline def SKEIN256_128: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_128 = "SKEIN256_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_128]
    
    inline def SKEIN256_136: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_136 = "SKEIN256_136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_136]
    
    inline def SKEIN256_144: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_144 = "SKEIN256_144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_144]
    
    inline def SKEIN256_152: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_152 = "SKEIN256_152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_152]
    
    inline def SKEIN256_16: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_16 = "SKEIN256_16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_16]
    
    inline def SKEIN256_160: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_160 = "SKEIN256_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_160]
    
    inline def SKEIN256_168: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_168 = "SKEIN256_168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_168]
    
    inline def SKEIN256_176: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_176 = "SKEIN256_176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_176]
    
    inline def SKEIN256_184: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_184 = "SKEIN256_184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_184]
    
    inline def SKEIN256_192: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_192 = "SKEIN256_192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_192]
    
    inline def SKEIN256_200: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_200 = "SKEIN256_200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_200]
    
    inline def SKEIN256_208: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_208 = "SKEIN256_208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_208]
    
    inline def SKEIN256_216: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_216 = "SKEIN256_216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_216]
    
    inline def SKEIN256_224: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_224 = "SKEIN256_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_224]
    
    inline def SKEIN256_232: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_232 = "SKEIN256_232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_232]
    
    inline def SKEIN256_24: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_24 = "SKEIN256_24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_24]
    
    inline def SKEIN256_240: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_240 = "SKEIN256_240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_240]
    
    inline def SKEIN256_248: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_248 = "SKEIN256_248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_248]
    
    inline def SKEIN256_256: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_256 = "SKEIN256_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_256]
    
    inline def SKEIN256_32: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_32 = "SKEIN256_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_32]
    
    inline def SKEIN256_40: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_40 = "SKEIN256_40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_40]
    
    inline def SKEIN256_48: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_48 = "SKEIN256_48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_48]
    
    inline def SKEIN256_56: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_56 = "SKEIN256_56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_56]
    
    inline def SKEIN256_64: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_64 = "SKEIN256_64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_64]
    
    inline def SKEIN256_72: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_72 = "SKEIN256_72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_72]
    
    inline def SKEIN256_8: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_8 = "SKEIN256_8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_8]
    
    inline def SKEIN256_80: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_80 = "SKEIN256_80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_80]
    
    inline def SKEIN256_88: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_88 = "SKEIN256_88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_88]
    
    inline def SKEIN256_96: typingsJapgolly.multicodec.multicodecStrings.SKEIN256_96 = "SKEIN256_96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN256_96]
    
    inline def SKEIN512_104: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_104 = "SKEIN512_104".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_104]
    
    inline def SKEIN512_112: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_112 = "SKEIN512_112".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_112]
    
    inline def SKEIN512_120: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_120 = "SKEIN512_120".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_120]
    
    inline def SKEIN512_128: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_128 = "SKEIN512_128".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_128]
    
    inline def SKEIN512_136: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_136 = "SKEIN512_136".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_136]
    
    inline def SKEIN512_144: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_144 = "SKEIN512_144".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_144]
    
    inline def SKEIN512_152: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_152 = "SKEIN512_152".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_152]
    
    inline def SKEIN512_16: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_16 = "SKEIN512_16".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_16]
    
    inline def SKEIN512_160: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_160 = "SKEIN512_160".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_160]
    
    inline def SKEIN512_168: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_168 = "SKEIN512_168".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_168]
    
    inline def SKEIN512_176: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_176 = "SKEIN512_176".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_176]
    
    inline def SKEIN512_184: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_184 = "SKEIN512_184".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_184]
    
    inline def SKEIN512_192: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_192 = "SKEIN512_192".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_192]
    
    inline def SKEIN512_200: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_200 = "SKEIN512_200".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_200]
    
    inline def SKEIN512_208: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_208 = "SKEIN512_208".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_208]
    
    inline def SKEIN512_216: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_216 = "SKEIN512_216".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_216]
    
    inline def SKEIN512_224: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_224 = "SKEIN512_224".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_224]
    
    inline def SKEIN512_232: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_232 = "SKEIN512_232".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_232]
    
    inline def SKEIN512_24: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_24 = "SKEIN512_24".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_24]
    
    inline def SKEIN512_240: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_240 = "SKEIN512_240".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_240]
    
    inline def SKEIN512_248: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_248 = "SKEIN512_248".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_248]
    
    inline def SKEIN512_256: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_256 = "SKEIN512_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_256]
    
    inline def SKEIN512_264: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_264 = "SKEIN512_264".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_264]
    
    inline def SKEIN512_272: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_272 = "SKEIN512_272".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_272]
    
    inline def SKEIN512_280: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_280 = "SKEIN512_280".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_280]
    
    inline def SKEIN512_288: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_288 = "SKEIN512_288".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_288]
    
    inline def SKEIN512_296: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_296 = "SKEIN512_296".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_296]
    
    inline def SKEIN512_304: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_304 = "SKEIN512_304".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_304]
    
    inline def SKEIN512_312: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_312 = "SKEIN512_312".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_312]
    
    inline def SKEIN512_32: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_32 = "SKEIN512_32".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_32]
    
    inline def SKEIN512_320: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_320 = "SKEIN512_320".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_320]
    
    inline def SKEIN512_328: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_328 = "SKEIN512_328".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_328]
    
    inline def SKEIN512_336: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_336 = "SKEIN512_336".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_336]
    
    inline def SKEIN512_344: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_344 = "SKEIN512_344".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_344]
    
    inline def SKEIN512_352: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_352 = "SKEIN512_352".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_352]
    
    inline def SKEIN512_360: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_360 = "SKEIN512_360".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_360]
    
    inline def SKEIN512_368: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_368 = "SKEIN512_368".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_368]
    
    inline def SKEIN512_376: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_376 = "SKEIN512_376".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_376]
    
    inline def SKEIN512_384: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_384 = "SKEIN512_384".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_384]
    
    inline def SKEIN512_392: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_392 = "SKEIN512_392".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_392]
    
    inline def SKEIN512_40: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_40 = "SKEIN512_40".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_40]
    
    inline def SKEIN512_400: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_400 = "SKEIN512_400".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_400]
    
    inline def SKEIN512_408: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_408 = "SKEIN512_408".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_408]
    
    inline def SKEIN512_416: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_416 = "SKEIN512_416".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_416]
    
    inline def SKEIN512_424: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_424 = "SKEIN512_424".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_424]
    
    inline def SKEIN512_432: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_432 = "SKEIN512_432".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_432]
    
    inline def SKEIN512_440: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_440 = "SKEIN512_440".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_440]
    
    inline def SKEIN512_448: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_448 = "SKEIN512_448".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_448]
    
    inline def SKEIN512_456: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_456 = "SKEIN512_456".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_456]
    
    inline def SKEIN512_464: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_464 = "SKEIN512_464".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_464]
    
    inline def SKEIN512_472: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_472 = "SKEIN512_472".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_472]
    
    inline def SKEIN512_48: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_48 = "SKEIN512_48".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_48]
    
    inline def SKEIN512_480: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_480 = "SKEIN512_480".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_480]
    
    inline def SKEIN512_488: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_488 = "SKEIN512_488".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_488]
    
    inline def SKEIN512_496: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_496 = "SKEIN512_496".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_496]
    
    inline def SKEIN512_504: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_504 = "SKEIN512_504".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_504]
    
    inline def SKEIN512_512: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_512 = "SKEIN512_512".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_512]
    
    inline def SKEIN512_56: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_56 = "SKEIN512_56".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_56]
    
    inline def SKEIN512_64: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_64 = "SKEIN512_64".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_64]
    
    inline def SKEIN512_72: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_72 = "SKEIN512_72".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_72]
    
    inline def SKEIN512_8: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_8 = "SKEIN512_8".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_8]
    
    inline def SKEIN512_80: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_80 = "SKEIN512_80".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_80]
    
    inline def SKEIN512_88: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_88 = "SKEIN512_88".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_88]
    
    inline def SKEIN512_96: typingsJapgolly.multicodec.multicodecStrings.SKEIN512_96 = "SKEIN512_96".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKEIN512_96]
    
    inline def SKYNET_NS: typingsJapgolly.multicodec.multicodecStrings.SKYNET_NS = "SKYNET_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SKYNET_NS]
    
    inline def SM3_256: typingsJapgolly.multicodec.multicodecStrings.SM3_256 = "SM3_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SM3_256]
    
    inline def STELLAR_BLOCK: typingsJapgolly.multicodec.multicodecStrings.STELLAR_BLOCK = "STELLAR_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.STELLAR_BLOCK]
    
    inline def STELLAR_TX: typingsJapgolly.multicodec.multicodecStrings.STELLAR_TX = "STELLAR_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.STELLAR_TX]
    
    inline def STREAMID: typingsJapgolly.multicodec.multicodecStrings.STREAMID = "STREAMID".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.STREAMID]
    
    inline def SWARM_FEED: typingsJapgolly.multicodec.multicodecStrings.SWARM_FEED = "SWARM_FEED".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SWARM_FEED]
    
    inline def SWARM_MANIFEST: typingsJapgolly.multicodec.multicodecStrings.SWARM_MANIFEST = "SWARM_MANIFEST".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SWARM_MANIFEST]
    
    inline def SWARM_NS: typingsJapgolly.multicodec.multicodecStrings.SWARM_NS = "SWARM_NS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SWARM_NS]
    
    inline def SWHID_1_SNP: typingsJapgolly.multicodec.multicodecStrings.SWHID_1_SNP = "SWHID_1_SNP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.SWHID_1_SNP]
    
    inline def TCP: typingsJapgolly.multicodec.multicodecStrings.TCP = "TCP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.TCP]
    
    inline def THREAD: typingsJapgolly.multicodec.multicodecStrings.THREAD = "THREAD".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.THREAD]
    
    inline def TLS: typingsJapgolly.multicodec.multicodecStrings.TLS = "TLS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.TLS]
    
    inline def TORRENT_FILE: typingsJapgolly.multicodec.multicodecStrings.TORRENT_FILE = "TORRENT_FILE".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.TORRENT_FILE]
    
    inline def TORRENT_INFO: typingsJapgolly.multicodec.multicodecStrings.TORRENT_INFO = "TORRENT_INFO".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.TORRENT_INFO]
    
    inline def UDP: typingsJapgolly.multicodec.multicodecStrings.UDP = "UDP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.UDP]
    
    inline def UDT: typingsJapgolly.multicodec.multicodecStrings.UDT = "UDT".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.UDT]
    
    inline def UNIX: typingsJapgolly.multicodec.multicodecStrings.UNIX = "UNIX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.UNIX]
    
    inline def UTP: typingsJapgolly.multicodec.multicodecStrings.UTP = "UTP".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.UTP]
    
    inline def WS: typingsJapgolly.multicodec.multicodecStrings.WS = "WS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.WS]
    
    inline def WSS: typingsJapgolly.multicodec.multicodecStrings.WSS = "WSS".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.WSS]
    
    inline def X11: typingsJapgolly.multicodec.multicodecStrings.X11 = "X11".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.X11]
    
    inline def X25519_PRIV: typingsJapgolly.multicodec.multicodecStrings.X25519_PRIV = "X25519_PRIV".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.X25519_PRIV]
    
    inline def X25519_PUB: typingsJapgolly.multicodec.multicodecStrings.X25519_PUB = "X25519_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.X25519_PUB]
    
    inline def X448_PUB: typingsJapgolly.multicodec.multicodecStrings.X448_PUB = "X448_PUB".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.X448_PUB]
    
    inline def ZCASH_BLOCK: typingsJapgolly.multicodec.multicodecStrings.ZCASH_BLOCK = "ZCASH_BLOCK".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ZCASH_BLOCK]
    
    inline def ZCASH_TX: typingsJapgolly.multicodec.multicodecStrings.ZCASH_TX = "ZCASH_TX".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ZCASH_TX]
    
    inline def ZERONET: typingsJapgolly.multicodec.multicodecStrings.ZERONET = "ZERONET".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ZERONET]
    
    inline def ZEROXCERT_IMPRINT_256: typingsJapgolly.multicodec.multicodecStrings.ZEROXCERT_IMPRINT_256 = "ZEROXCERT_IMPRINT_256".asInstanceOf[typingsJapgolly.multicodec.multicodecStrings.ZEROXCERT_IMPRINT_256]
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
  
  trait ConstantCodeMap extends StObject {
    
    var ARWEAVE_NS: CodecCode
    
    var BENCODE: CodecCode
    
    var BITCOIN_BLOCK: CodecCode
    
    var BITCOIN_TX: CodecCode
    
    var BITCOIN_WITNESS_COMMITMENT: CodecCode
    
    var BLAKE2B_104: CodecCode
    
    var BLAKE2B_112: CodecCode
    
    var BLAKE2B_120: CodecCode
    
    var BLAKE2B_128: CodecCode
    
    var BLAKE2B_136: CodecCode
    
    var BLAKE2B_144: CodecCode
    
    var BLAKE2B_152: CodecCode
    
    var BLAKE2B_16: CodecCode
    
    var BLAKE2B_160: CodecCode
    
    var BLAKE2B_168: CodecCode
    
    var BLAKE2B_176: CodecCode
    
    var BLAKE2B_184: CodecCode
    
    var BLAKE2B_192: CodecCode
    
    var BLAKE2B_200: CodecCode
    
    var BLAKE2B_208: CodecCode
    
    var BLAKE2B_216: CodecCode
    
    var BLAKE2B_224: CodecCode
    
    var BLAKE2B_232: CodecCode
    
    var BLAKE2B_24: CodecCode
    
    var BLAKE2B_240: CodecCode
    
    var BLAKE2B_248: CodecCode
    
    var BLAKE2B_256: CodecCode
    
    var BLAKE2B_264: CodecCode
    
    var BLAKE2B_272: CodecCode
    
    var BLAKE2B_280: CodecCode
    
    var BLAKE2B_288: CodecCode
    
    var BLAKE2B_296: CodecCode
    
    var BLAKE2B_304: CodecCode
    
    var BLAKE2B_312: CodecCode
    
    var BLAKE2B_32: CodecCode
    
    var BLAKE2B_320: CodecCode
    
    var BLAKE2B_328: CodecCode
    
    var BLAKE2B_336: CodecCode
    
    var BLAKE2B_344: CodecCode
    
    var BLAKE2B_352: CodecCode
    
    var BLAKE2B_360: CodecCode
    
    var BLAKE2B_368: CodecCode
    
    var BLAKE2B_376: CodecCode
    
    var BLAKE2B_384: CodecCode
    
    var BLAKE2B_392: CodecCode
    
    var BLAKE2B_40: CodecCode
    
    var BLAKE2B_400: CodecCode
    
    var BLAKE2B_408: CodecCode
    
    var BLAKE2B_416: CodecCode
    
    var BLAKE2B_424: CodecCode
    
    var BLAKE2B_432: CodecCode
    
    var BLAKE2B_440: CodecCode
    
    var BLAKE2B_448: CodecCode
    
    var BLAKE2B_456: CodecCode
    
    var BLAKE2B_464: CodecCode
    
    var BLAKE2B_472: CodecCode
    
    var BLAKE2B_48: CodecCode
    
    var BLAKE2B_480: CodecCode
    
    var BLAKE2B_488: CodecCode
    
    var BLAKE2B_496: CodecCode
    
    var BLAKE2B_504: CodecCode
    
    var BLAKE2B_512: CodecCode
    
    var BLAKE2B_56: CodecCode
    
    var BLAKE2B_64: CodecCode
    
    var BLAKE2B_72: CodecCode
    
    var BLAKE2B_8: CodecCode
    
    var BLAKE2B_80: CodecCode
    
    var BLAKE2B_88: CodecCode
    
    var BLAKE2B_96: CodecCode
    
    var BLAKE2S_104: CodecCode
    
    var BLAKE2S_112: CodecCode
    
    var BLAKE2S_120: CodecCode
    
    var BLAKE2S_128: CodecCode
    
    var BLAKE2S_136: CodecCode
    
    var BLAKE2S_144: CodecCode
    
    var BLAKE2S_152: CodecCode
    
    var BLAKE2S_16: CodecCode
    
    var BLAKE2S_160: CodecCode
    
    var BLAKE2S_168: CodecCode
    
    var BLAKE2S_176: CodecCode
    
    var BLAKE2S_184: CodecCode
    
    var BLAKE2S_192: CodecCode
    
    var BLAKE2S_200: CodecCode
    
    var BLAKE2S_208: CodecCode
    
    var BLAKE2S_216: CodecCode
    
    var BLAKE2S_224: CodecCode
    
    var BLAKE2S_232: CodecCode
    
    var BLAKE2S_24: CodecCode
    
    var BLAKE2S_240: CodecCode
    
    var BLAKE2S_248: CodecCode
    
    var BLAKE2S_256: CodecCode
    
    var BLAKE2S_32: CodecCode
    
    var BLAKE2S_40: CodecCode
    
    var BLAKE2S_48: CodecCode
    
    var BLAKE2S_56: CodecCode
    
    var BLAKE2S_64: CodecCode
    
    var BLAKE2S_72: CodecCode
    
    var BLAKE2S_8: CodecCode
    
    var BLAKE2S_80: CodecCode
    
    var BLAKE2S_88: CodecCode
    
    var BLAKE2S_96: CodecCode
    
    var BLAKE3: CodecCode
    
    var BLS12_381_G1G2_PUB: CodecCode
    
    var BLS12_381_G1_PUB: CodecCode
    
    var BLS12_381_G2_PUB: CodecCode
    
    var BMT: CodecCode
    
    var CAIP_50: CodecCode
    
    var CAR_INDEX_SORTED: CodecCode
    
    var CBOR: CodecCode
    
    var CIDV1: CodecCode
    
    var CIDV2: CodecCode
    
    var CIDV3: CodecCode
    
    var DAG_CBOR: CodecCode
    
    var DAG_COSE: CodecCode
    
    var DAG_JOSE: CodecCode
    
    var DAG_JSON: CodecCode
    
    var DAG_PB: CodecCode
    
    var DASH_BLOCK: CodecCode
    
    var DASH_TX: CodecCode
    
    var DBL_SHA2_256: CodecCode
    
    var DCCP: CodecCode
    
    var DECRED_BLOCK: CodecCode
    
    var DECRED_TX: CodecCode
    
    var DNS: CodecCode
    
    var DNS4: CodecCode
    
    var DNS6: CodecCode
    
    var DNSADDR: CodecCode
    
    var ED25519_PRIV: CodecCode
    
    var ED25519_PUB: CodecCode
    
    var ED448_PUB: CodecCode
    
    var ETH_ACCOUNT_SNAPSHOT: CodecCode
    
    var ETH_BLOCK: CodecCode
    
    var ETH_BLOCK_LIST: CodecCode
    
    var ETH_RECEIPT_LOG_TRIE: CodecCode
    
    var ETH_RECIEPT_LOG: CodecCode
    
    var ETH_STATE_TRIE: CodecCode
    
    var ETH_STORAGE_TRIE: CodecCode
    
    var ETH_TX: CodecCode
    
    var ETH_TX_RECEIPT: CodecCode
    
    var ETH_TX_RECEIPT_TRIE: CodecCode
    
    var ETH_TX_TRIE: CodecCode
    
    var FIL_COMMITMENT_SEALED: CodecCode
    
    var FIL_COMMITMENT_UNSEALED: CodecCode
    
    var GARLIC32: CodecCode
    
    var GARLIC64: CodecCode
    
    var GIT_RAW: CodecCode
    
    var HOLOCHAIN_ADR_V0: CodecCode
    
    var HOLOCHAIN_ADR_V1: CodecCode
    
    var HOLOCHAIN_KEY_V0: CodecCode
    
    var HOLOCHAIN_KEY_V1: CodecCode
    
    var HOLOCHAIN_SIG_V0: CodecCode
    
    var HOLOCHAIN_SIG_V1: CodecCode
    
    var HTTP: CodecCode
    
    var HTTPS: CodecCode
    
    var IDENTITY: CodecCode
    
    var IP4: CodecCode
    
    var IP6: CodecCode
    
    var IP6ZONE: CodecCode
    
    var IPFS: CodecCode
    
    var IPFS_NS: CodecCode
    
    var IPLD_NS: CodecCode
    
    var IPNS_NS: CodecCode
    
    var JSON: CodecCode
    
    var KANGAROOTWELVE: CodecCode
    
    var KECCAK_224: CodecCode
    
    var KECCAK_256: CodecCode
    
    var KECCAK_384: CodecCode
    
    var KECCAK_512: CodecCode
    
    var LEOFCOIN_BLOCK: CodecCode
    
    var LEOFCOIN_PR: CodecCode
    
    var LEOFCOIN_TX: CodecCode
    
    var LIBP2P_KEY: CodecCode
    
    var LIBP2P_PEER_RECORD: CodecCode
    
    var LIBP2P_RELAY_RSVP: CodecCode
    
    var MD4: CodecCode
    
    var MD5: CodecCode
    
    var MESSAGEPACK: CodecCode
    
    var MULTIADDR: CodecCode
    
    var MULTIBASE: CodecCode
    
    var MULTICODEC: CodecCode
    
    var MULTIHASH: CodecCode
    
    var MURMUR3_128: CodecCode
    
    var MURMUR3_32: CodecCode
    
    var NOISE: CodecCode
    
    var ONION: CodecCode
    
    var ONION3: CodecCode
    
    var P256_PUB: CodecCode
    
    var P2P: CodecCode
    
    var P2P_CIRCUIT: CodecCode
    
    var P2P_STARDUST: CodecCode
    
    var P2P_WEBRTC_DIRECT: CodecCode
    
    var P2P_WEBRTC_STAR: CodecCode
    
    var P2P_WEBSOCKET_STAR: CodecCode
    
    var P384_PUB: CodecCode
    
    var P521_PUB: CodecCode
    
    var PATH: CodecCode
    
    var POSEIDON_BLS12_381_A2_FC1: CodecCode
    
    var POSEIDON_BLS12_381_A2_FC1_SC: CodecCode
    
    var PROTOBUF: CodecCode
    
    var QUIC: CodecCode
    
    var RAW: CodecCode
    
    var RIPEMD_128: CodecCode
    
    var RIPEMD_160: CodecCode
    
    var RIPEMD_256: CodecCode
    
    var RIPEMD_320: CodecCode
    
    var RLP: CodecCode
    
    var SCTP: CodecCode
    
    var SECP256K1_PRIV: CodecCode
    
    var SECP256K1_PUB: CodecCode
    
    var SHA1: CodecCode
    
    var SHA2_256: CodecCode
    
    var SHA2_256_TRUNC254_PADDED: CodecCode
    
    var SHA2_512: CodecCode
    
    var SHA3_224: CodecCode
    
    var SHA3_256: CodecCode
    
    var SHA3_384: CodecCode
    
    var SHA3_512: CodecCode
    
    var SHAKE_128: CodecCode
    
    var SHAKE_256: CodecCode
    
    var SKEIN1024_1000: CodecCode
    
    var SKEIN1024_1008: CodecCode
    
    var SKEIN1024_1016: CodecCode
    
    var SKEIN1024_1024: CodecCode
    
    var SKEIN1024_104: CodecCode
    
    var SKEIN1024_112: CodecCode
    
    var SKEIN1024_120: CodecCode
    
    var SKEIN1024_128: CodecCode
    
    var SKEIN1024_136: CodecCode
    
    var SKEIN1024_144: CodecCode
    
    var SKEIN1024_152: CodecCode
    
    var SKEIN1024_16: CodecCode
    
    var SKEIN1024_160: CodecCode
    
    var SKEIN1024_168: CodecCode
    
    var SKEIN1024_176: CodecCode
    
    var SKEIN1024_184: CodecCode
    
    var SKEIN1024_192: CodecCode
    
    var SKEIN1024_200: CodecCode
    
    var SKEIN1024_208: CodecCode
    
    var SKEIN1024_216: CodecCode
    
    var SKEIN1024_224: CodecCode
    
    var SKEIN1024_232: CodecCode
    
    var SKEIN1024_24: CodecCode
    
    var SKEIN1024_240: CodecCode
    
    var SKEIN1024_248: CodecCode
    
    var SKEIN1024_256: CodecCode
    
    var SKEIN1024_264: CodecCode
    
    var SKEIN1024_272: CodecCode
    
    var SKEIN1024_280: CodecCode
    
    var SKEIN1024_288: CodecCode
    
    var SKEIN1024_296: CodecCode
    
    var SKEIN1024_304: CodecCode
    
    var SKEIN1024_312: CodecCode
    
    var SKEIN1024_32: CodecCode
    
    var SKEIN1024_320: CodecCode
    
    var SKEIN1024_328: CodecCode
    
    var SKEIN1024_336: CodecCode
    
    var SKEIN1024_344: CodecCode
    
    var SKEIN1024_352: CodecCode
    
    var SKEIN1024_360: CodecCode
    
    var SKEIN1024_368: CodecCode
    
    var SKEIN1024_376: CodecCode
    
    var SKEIN1024_384: CodecCode
    
    var SKEIN1024_392: CodecCode
    
    var SKEIN1024_40: CodecCode
    
    var SKEIN1024_400: CodecCode
    
    var SKEIN1024_408: CodecCode
    
    var SKEIN1024_416: CodecCode
    
    var SKEIN1024_424: CodecCode
    
    var SKEIN1024_432: CodecCode
    
    var SKEIN1024_440: CodecCode
    
    var SKEIN1024_448: CodecCode
    
    var SKEIN1024_456: CodecCode
    
    var SKEIN1024_464: CodecCode
    
    var SKEIN1024_472: CodecCode
    
    var SKEIN1024_48: CodecCode
    
    var SKEIN1024_480: CodecCode
    
    var SKEIN1024_488: CodecCode
    
    var SKEIN1024_496: CodecCode
    
    var SKEIN1024_504: CodecCode
    
    var SKEIN1024_512: CodecCode
    
    var SKEIN1024_520: CodecCode
    
    var SKEIN1024_528: CodecCode
    
    var SKEIN1024_536: CodecCode
    
    var SKEIN1024_544: CodecCode
    
    var SKEIN1024_552: CodecCode
    
    var SKEIN1024_56: CodecCode
    
    var SKEIN1024_560: CodecCode
    
    var SKEIN1024_568: CodecCode
    
    var SKEIN1024_576: CodecCode
    
    var SKEIN1024_584: CodecCode
    
    var SKEIN1024_592: CodecCode
    
    var SKEIN1024_600: CodecCode
    
    var SKEIN1024_608: CodecCode
    
    var SKEIN1024_616: CodecCode
    
    var SKEIN1024_624: CodecCode
    
    var SKEIN1024_632: CodecCode
    
    var SKEIN1024_64: CodecCode
    
    var SKEIN1024_640: CodecCode
    
    var SKEIN1024_648: CodecCode
    
    var SKEIN1024_656: CodecCode
    
    var SKEIN1024_664: CodecCode
    
    var SKEIN1024_672: CodecCode
    
    var SKEIN1024_680: CodecCode
    
    var SKEIN1024_688: CodecCode
    
    var SKEIN1024_696: CodecCode
    
    var SKEIN1024_704: CodecCode
    
    var SKEIN1024_712: CodecCode
    
    var SKEIN1024_72: CodecCode
    
    var SKEIN1024_720: CodecCode
    
    var SKEIN1024_728: CodecCode
    
    var SKEIN1024_736: CodecCode
    
    var SKEIN1024_744: CodecCode
    
    var SKEIN1024_752: CodecCode
    
    var SKEIN1024_760: CodecCode
    
    var SKEIN1024_768: CodecCode
    
    var SKEIN1024_776: CodecCode
    
    var SKEIN1024_784: CodecCode
    
    var SKEIN1024_792: CodecCode
    
    var SKEIN1024_8: CodecCode
    
    var SKEIN1024_80: CodecCode
    
    var SKEIN1024_800: CodecCode
    
    var SKEIN1024_808: CodecCode
    
    var SKEIN1024_816: CodecCode
    
    var SKEIN1024_824: CodecCode
    
    var SKEIN1024_832: CodecCode
    
    var SKEIN1024_840: CodecCode
    
    var SKEIN1024_848: CodecCode
    
    var SKEIN1024_856: CodecCode
    
    var SKEIN1024_864: CodecCode
    
    var SKEIN1024_872: CodecCode
    
    var SKEIN1024_88: CodecCode
    
    var SKEIN1024_880: CodecCode
    
    var SKEIN1024_888: CodecCode
    
    var SKEIN1024_896: CodecCode
    
    var SKEIN1024_904: CodecCode
    
    var SKEIN1024_912: CodecCode
    
    var SKEIN1024_920: CodecCode
    
    var SKEIN1024_928: CodecCode
    
    var SKEIN1024_936: CodecCode
    
    var SKEIN1024_944: CodecCode
    
    var SKEIN1024_952: CodecCode
    
    var SKEIN1024_96: CodecCode
    
    var SKEIN1024_960: CodecCode
    
    var SKEIN1024_968: CodecCode
    
    var SKEIN1024_976: CodecCode
    
    var SKEIN1024_984: CodecCode
    
    var SKEIN1024_992: CodecCode
    
    var SKEIN256_104: CodecCode
    
    var SKEIN256_112: CodecCode
    
    var SKEIN256_120: CodecCode
    
    var SKEIN256_128: CodecCode
    
    var SKEIN256_136: CodecCode
    
    var SKEIN256_144: CodecCode
    
    var SKEIN256_152: CodecCode
    
    var SKEIN256_16: CodecCode
    
    var SKEIN256_160: CodecCode
    
    var SKEIN256_168: CodecCode
    
    var SKEIN256_176: CodecCode
    
    var SKEIN256_184: CodecCode
    
    var SKEIN256_192: CodecCode
    
    var SKEIN256_200: CodecCode
    
    var SKEIN256_208: CodecCode
    
    var SKEIN256_216: CodecCode
    
    var SKEIN256_224: CodecCode
    
    var SKEIN256_232: CodecCode
    
    var SKEIN256_24: CodecCode
    
    var SKEIN256_240: CodecCode
    
    var SKEIN256_248: CodecCode
    
    var SKEIN256_256: CodecCode
    
    var SKEIN256_32: CodecCode
    
    var SKEIN256_40: CodecCode
    
    var SKEIN256_48: CodecCode
    
    var SKEIN256_56: CodecCode
    
    var SKEIN256_64: CodecCode
    
    var SKEIN256_72: CodecCode
    
    var SKEIN256_8: CodecCode
    
    var SKEIN256_80: CodecCode
    
    var SKEIN256_88: CodecCode
    
    var SKEIN256_96: CodecCode
    
    var SKEIN512_104: CodecCode
    
    var SKEIN512_112: CodecCode
    
    var SKEIN512_120: CodecCode
    
    var SKEIN512_128: CodecCode
    
    var SKEIN512_136: CodecCode
    
    var SKEIN512_144: CodecCode
    
    var SKEIN512_152: CodecCode
    
    var SKEIN512_16: CodecCode
    
    var SKEIN512_160: CodecCode
    
    var SKEIN512_168: CodecCode
    
    var SKEIN512_176: CodecCode
    
    var SKEIN512_184: CodecCode
    
    var SKEIN512_192: CodecCode
    
    var SKEIN512_200: CodecCode
    
    var SKEIN512_208: CodecCode
    
    var SKEIN512_216: CodecCode
    
    var SKEIN512_224: CodecCode
    
    var SKEIN512_232: CodecCode
    
    var SKEIN512_24: CodecCode
    
    var SKEIN512_240: CodecCode
    
    var SKEIN512_248: CodecCode
    
    var SKEIN512_256: CodecCode
    
    var SKEIN512_264: CodecCode
    
    var SKEIN512_272: CodecCode
    
    var SKEIN512_280: CodecCode
    
    var SKEIN512_288: CodecCode
    
    var SKEIN512_296: CodecCode
    
    var SKEIN512_304: CodecCode
    
    var SKEIN512_312: CodecCode
    
    var SKEIN512_32: CodecCode
    
    var SKEIN512_320: CodecCode
    
    var SKEIN512_328: CodecCode
    
    var SKEIN512_336: CodecCode
    
    var SKEIN512_344: CodecCode
    
    var SKEIN512_352: CodecCode
    
    var SKEIN512_360: CodecCode
    
    var SKEIN512_368: CodecCode
    
    var SKEIN512_376: CodecCode
    
    var SKEIN512_384: CodecCode
    
    var SKEIN512_392: CodecCode
    
    var SKEIN512_40: CodecCode
    
    var SKEIN512_400: CodecCode
    
    var SKEIN512_408: CodecCode
    
    var SKEIN512_416: CodecCode
    
    var SKEIN512_424: CodecCode
    
    var SKEIN512_432: CodecCode
    
    var SKEIN512_440: CodecCode
    
    var SKEIN512_448: CodecCode
    
    var SKEIN512_456: CodecCode
    
    var SKEIN512_464: CodecCode
    
    var SKEIN512_472: CodecCode
    
    var SKEIN512_48: CodecCode
    
    var SKEIN512_480: CodecCode
    
    var SKEIN512_488: CodecCode
    
    var SKEIN512_496: CodecCode
    
    var SKEIN512_504: CodecCode
    
    var SKEIN512_512: CodecCode
    
    var SKEIN512_56: CodecCode
    
    var SKEIN512_64: CodecCode
    
    var SKEIN512_72: CodecCode
    
    var SKEIN512_8: CodecCode
    
    var SKEIN512_80: CodecCode
    
    var SKEIN512_88: CodecCode
    
    var SKEIN512_96: CodecCode
    
    var SKYNET_NS: CodecCode
    
    var SM3_256: CodecCode
    
    var STELLAR_BLOCK: CodecCode
    
    var STELLAR_TX: CodecCode
    
    var STREAMID: CodecCode
    
    var SWARM_FEED: CodecCode
    
    var SWARM_MANIFEST: CodecCode
    
    var SWARM_NS: CodecCode
    
    var SWHID_1_SNP: CodecCode
    
    var TCP: CodecCode
    
    var THREAD: CodecCode
    
    var TLS: CodecCode
    
    var TORRENT_FILE: CodecCode
    
    var TORRENT_INFO: CodecCode
    
    var UDP: CodecCode
    
    var UDT: CodecCode
    
    var UNIX: CodecCode
    
    var UTP: CodecCode
    
    var WS: CodecCode
    
    var WSS: CodecCode
    
    var X11: CodecCode
    
    var X25519_PRIV: CodecCode
    
    var X25519_PUB: CodecCode
    
    var X448_PUB: CodecCode
    
    var ZCASH_BLOCK: CodecCode
    
    var ZCASH_TX: CodecCode
    
    var ZERONET: CodecCode
    
    var ZEROXCERT_IMPRINT_256: CodecCode
  }
  object ConstantCodeMap {
    
    extension [Self <: ConstantCodeMap](x: Self) {
      
      inline def setARWEAVE_NS(value: CodecCode): Self = StObject.set(x, "ARWEAVE_NS", value.asInstanceOf[js.Any])
      
      inline def setBENCODE(value: CodecCode): Self = StObject.set(x, "BENCODE", value.asInstanceOf[js.Any])
      
      inline def setBITCOIN_BLOCK(value: CodecCode): Self = StObject.set(x, "BITCOIN_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setBITCOIN_TX(value: CodecCode): Self = StObject.set(x, "BITCOIN_TX", value.asInstanceOf[js.Any])
      
      inline def setBITCOIN_WITNESS_COMMITMENT(value: CodecCode): Self = StObject.set(x, "BITCOIN_WITNESS_COMMITMENT", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_104(value: CodecCode): Self = StObject.set(x, "BLAKE2B_104", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_112(value: CodecCode): Self = StObject.set(x, "BLAKE2B_112", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_120(value: CodecCode): Self = StObject.set(x, "BLAKE2B_120", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_128(value: CodecCode): Self = StObject.set(x, "BLAKE2B_128", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_136(value: CodecCode): Self = StObject.set(x, "BLAKE2B_136", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_144(value: CodecCode): Self = StObject.set(x, "BLAKE2B_144", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_152(value: CodecCode): Self = StObject.set(x, "BLAKE2B_152", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_16(value: CodecCode): Self = StObject.set(x, "BLAKE2B_16", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_160(value: CodecCode): Self = StObject.set(x, "BLAKE2B_160", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_168(value: CodecCode): Self = StObject.set(x, "BLAKE2B_168", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_176(value: CodecCode): Self = StObject.set(x, "BLAKE2B_176", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_184(value: CodecCode): Self = StObject.set(x, "BLAKE2B_184", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_192(value: CodecCode): Self = StObject.set(x, "BLAKE2B_192", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_200(value: CodecCode): Self = StObject.set(x, "BLAKE2B_200", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_208(value: CodecCode): Self = StObject.set(x, "BLAKE2B_208", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_216(value: CodecCode): Self = StObject.set(x, "BLAKE2B_216", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_224(value: CodecCode): Self = StObject.set(x, "BLAKE2B_224", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_232(value: CodecCode): Self = StObject.set(x, "BLAKE2B_232", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_24(value: CodecCode): Self = StObject.set(x, "BLAKE2B_24", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_240(value: CodecCode): Self = StObject.set(x, "BLAKE2B_240", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_248(value: CodecCode): Self = StObject.set(x, "BLAKE2B_248", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_256(value: CodecCode): Self = StObject.set(x, "BLAKE2B_256", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_264(value: CodecCode): Self = StObject.set(x, "BLAKE2B_264", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_272(value: CodecCode): Self = StObject.set(x, "BLAKE2B_272", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_280(value: CodecCode): Self = StObject.set(x, "BLAKE2B_280", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_288(value: CodecCode): Self = StObject.set(x, "BLAKE2B_288", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_296(value: CodecCode): Self = StObject.set(x, "BLAKE2B_296", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_304(value: CodecCode): Self = StObject.set(x, "BLAKE2B_304", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_312(value: CodecCode): Self = StObject.set(x, "BLAKE2B_312", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_32(value: CodecCode): Self = StObject.set(x, "BLAKE2B_32", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_320(value: CodecCode): Self = StObject.set(x, "BLAKE2B_320", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_328(value: CodecCode): Self = StObject.set(x, "BLAKE2B_328", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_336(value: CodecCode): Self = StObject.set(x, "BLAKE2B_336", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_344(value: CodecCode): Self = StObject.set(x, "BLAKE2B_344", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_352(value: CodecCode): Self = StObject.set(x, "BLAKE2B_352", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_360(value: CodecCode): Self = StObject.set(x, "BLAKE2B_360", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_368(value: CodecCode): Self = StObject.set(x, "BLAKE2B_368", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_376(value: CodecCode): Self = StObject.set(x, "BLAKE2B_376", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_384(value: CodecCode): Self = StObject.set(x, "BLAKE2B_384", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_392(value: CodecCode): Self = StObject.set(x, "BLAKE2B_392", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_40(value: CodecCode): Self = StObject.set(x, "BLAKE2B_40", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_400(value: CodecCode): Self = StObject.set(x, "BLAKE2B_400", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_408(value: CodecCode): Self = StObject.set(x, "BLAKE2B_408", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_416(value: CodecCode): Self = StObject.set(x, "BLAKE2B_416", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_424(value: CodecCode): Self = StObject.set(x, "BLAKE2B_424", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_432(value: CodecCode): Self = StObject.set(x, "BLAKE2B_432", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_440(value: CodecCode): Self = StObject.set(x, "BLAKE2B_440", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_448(value: CodecCode): Self = StObject.set(x, "BLAKE2B_448", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_456(value: CodecCode): Self = StObject.set(x, "BLAKE2B_456", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_464(value: CodecCode): Self = StObject.set(x, "BLAKE2B_464", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_472(value: CodecCode): Self = StObject.set(x, "BLAKE2B_472", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_48(value: CodecCode): Self = StObject.set(x, "BLAKE2B_48", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_480(value: CodecCode): Self = StObject.set(x, "BLAKE2B_480", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_488(value: CodecCode): Self = StObject.set(x, "BLAKE2B_488", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_496(value: CodecCode): Self = StObject.set(x, "BLAKE2B_496", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_504(value: CodecCode): Self = StObject.set(x, "BLAKE2B_504", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_512(value: CodecCode): Self = StObject.set(x, "BLAKE2B_512", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_56(value: CodecCode): Self = StObject.set(x, "BLAKE2B_56", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_64(value: CodecCode): Self = StObject.set(x, "BLAKE2B_64", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_72(value: CodecCode): Self = StObject.set(x, "BLAKE2B_72", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_8(value: CodecCode): Self = StObject.set(x, "BLAKE2B_8", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_80(value: CodecCode): Self = StObject.set(x, "BLAKE2B_80", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_88(value: CodecCode): Self = StObject.set(x, "BLAKE2B_88", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2B_96(value: CodecCode): Self = StObject.set(x, "BLAKE2B_96", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_104(value: CodecCode): Self = StObject.set(x, "BLAKE2S_104", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_112(value: CodecCode): Self = StObject.set(x, "BLAKE2S_112", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_120(value: CodecCode): Self = StObject.set(x, "BLAKE2S_120", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_128(value: CodecCode): Self = StObject.set(x, "BLAKE2S_128", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_136(value: CodecCode): Self = StObject.set(x, "BLAKE2S_136", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_144(value: CodecCode): Self = StObject.set(x, "BLAKE2S_144", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_152(value: CodecCode): Self = StObject.set(x, "BLAKE2S_152", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_16(value: CodecCode): Self = StObject.set(x, "BLAKE2S_16", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_160(value: CodecCode): Self = StObject.set(x, "BLAKE2S_160", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_168(value: CodecCode): Self = StObject.set(x, "BLAKE2S_168", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_176(value: CodecCode): Self = StObject.set(x, "BLAKE2S_176", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_184(value: CodecCode): Self = StObject.set(x, "BLAKE2S_184", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_192(value: CodecCode): Self = StObject.set(x, "BLAKE2S_192", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_200(value: CodecCode): Self = StObject.set(x, "BLAKE2S_200", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_208(value: CodecCode): Self = StObject.set(x, "BLAKE2S_208", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_216(value: CodecCode): Self = StObject.set(x, "BLAKE2S_216", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_224(value: CodecCode): Self = StObject.set(x, "BLAKE2S_224", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_232(value: CodecCode): Self = StObject.set(x, "BLAKE2S_232", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_24(value: CodecCode): Self = StObject.set(x, "BLAKE2S_24", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_240(value: CodecCode): Self = StObject.set(x, "BLAKE2S_240", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_248(value: CodecCode): Self = StObject.set(x, "BLAKE2S_248", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_256(value: CodecCode): Self = StObject.set(x, "BLAKE2S_256", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_32(value: CodecCode): Self = StObject.set(x, "BLAKE2S_32", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_40(value: CodecCode): Self = StObject.set(x, "BLAKE2S_40", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_48(value: CodecCode): Self = StObject.set(x, "BLAKE2S_48", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_56(value: CodecCode): Self = StObject.set(x, "BLAKE2S_56", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_64(value: CodecCode): Self = StObject.set(x, "BLAKE2S_64", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_72(value: CodecCode): Self = StObject.set(x, "BLAKE2S_72", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_8(value: CodecCode): Self = StObject.set(x, "BLAKE2S_8", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_80(value: CodecCode): Self = StObject.set(x, "BLAKE2S_80", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_88(value: CodecCode): Self = StObject.set(x, "BLAKE2S_88", value.asInstanceOf[js.Any])
      
      inline def setBLAKE2S_96(value: CodecCode): Self = StObject.set(x, "BLAKE2S_96", value.asInstanceOf[js.Any])
      
      inline def setBLAKE3(value: CodecCode): Self = StObject.set(x, "BLAKE3", value.asInstanceOf[js.Any])
      
      inline def setBLS12_381_G1G2_PUB(value: CodecCode): Self = StObject.set(x, "BLS12_381_G1G2_PUB", value.asInstanceOf[js.Any])
      
      inline def setBLS12_381_G1_PUB(value: CodecCode): Self = StObject.set(x, "BLS12_381_G1_PUB", value.asInstanceOf[js.Any])
      
      inline def setBLS12_381_G2_PUB(value: CodecCode): Self = StObject.set(x, "BLS12_381_G2_PUB", value.asInstanceOf[js.Any])
      
      inline def setBMT(value: CodecCode): Self = StObject.set(x, "BMT", value.asInstanceOf[js.Any])
      
      inline def setCAIP_50(value: CodecCode): Self = StObject.set(x, "CAIP_50", value.asInstanceOf[js.Any])
      
      inline def setCAR_INDEX_SORTED(value: CodecCode): Self = StObject.set(x, "CAR_INDEX_SORTED", value.asInstanceOf[js.Any])
      
      inline def setCBOR(value: CodecCode): Self = StObject.set(x, "CBOR", value.asInstanceOf[js.Any])
      
      inline def setCIDV1(value: CodecCode): Self = StObject.set(x, "CIDV1", value.asInstanceOf[js.Any])
      
      inline def setCIDV2(value: CodecCode): Self = StObject.set(x, "CIDV2", value.asInstanceOf[js.Any])
      
      inline def setCIDV3(value: CodecCode): Self = StObject.set(x, "CIDV3", value.asInstanceOf[js.Any])
      
      inline def setDAG_CBOR(value: CodecCode): Self = StObject.set(x, "DAG_CBOR", value.asInstanceOf[js.Any])
      
      inline def setDAG_COSE(value: CodecCode): Self = StObject.set(x, "DAG_COSE", value.asInstanceOf[js.Any])
      
      inline def setDAG_JOSE(value: CodecCode): Self = StObject.set(x, "DAG_JOSE", value.asInstanceOf[js.Any])
      
      inline def setDAG_JSON(value: CodecCode): Self = StObject.set(x, "DAG_JSON", value.asInstanceOf[js.Any])
      
      inline def setDAG_PB(value: CodecCode): Self = StObject.set(x, "DAG_PB", value.asInstanceOf[js.Any])
      
      inline def setDASH_BLOCK(value: CodecCode): Self = StObject.set(x, "DASH_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setDASH_TX(value: CodecCode): Self = StObject.set(x, "DASH_TX", value.asInstanceOf[js.Any])
      
      inline def setDBL_SHA2_256(value: CodecCode): Self = StObject.set(x, "DBL_SHA2_256", value.asInstanceOf[js.Any])
      
      inline def setDCCP(value: CodecCode): Self = StObject.set(x, "DCCP", value.asInstanceOf[js.Any])
      
      inline def setDECRED_BLOCK(value: CodecCode): Self = StObject.set(x, "DECRED_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setDECRED_TX(value: CodecCode): Self = StObject.set(x, "DECRED_TX", value.asInstanceOf[js.Any])
      
      inline def setDNS(value: CodecCode): Self = StObject.set(x, "DNS", value.asInstanceOf[js.Any])
      
      inline def setDNS4(value: CodecCode): Self = StObject.set(x, "DNS4", value.asInstanceOf[js.Any])
      
      inline def setDNS6(value: CodecCode): Self = StObject.set(x, "DNS6", value.asInstanceOf[js.Any])
      
      inline def setDNSADDR(value: CodecCode): Self = StObject.set(x, "DNSADDR", value.asInstanceOf[js.Any])
      
      inline def setED25519_PRIV(value: CodecCode): Self = StObject.set(x, "ED25519_PRIV", value.asInstanceOf[js.Any])
      
      inline def setED25519_PUB(value: CodecCode): Self = StObject.set(x, "ED25519_PUB", value.asInstanceOf[js.Any])
      
      inline def setED448_PUB(value: CodecCode): Self = StObject.set(x, "ED448_PUB", value.asInstanceOf[js.Any])
      
      inline def setETH_ACCOUNT_SNAPSHOT(value: CodecCode): Self = StObject.set(x, "ETH_ACCOUNT_SNAPSHOT", value.asInstanceOf[js.Any])
      
      inline def setETH_BLOCK(value: CodecCode): Self = StObject.set(x, "ETH_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setETH_BLOCK_LIST(value: CodecCode): Self = StObject.set(x, "ETH_BLOCK_LIST", value.asInstanceOf[js.Any])
      
      inline def setETH_RECEIPT_LOG_TRIE(value: CodecCode): Self = StObject.set(x, "ETH_RECEIPT_LOG_TRIE", value.asInstanceOf[js.Any])
      
      inline def setETH_RECIEPT_LOG(value: CodecCode): Self = StObject.set(x, "ETH_RECIEPT_LOG", value.asInstanceOf[js.Any])
      
      inline def setETH_STATE_TRIE(value: CodecCode): Self = StObject.set(x, "ETH_STATE_TRIE", value.asInstanceOf[js.Any])
      
      inline def setETH_STORAGE_TRIE(value: CodecCode): Self = StObject.set(x, "ETH_STORAGE_TRIE", value.asInstanceOf[js.Any])
      
      inline def setETH_TX(value: CodecCode): Self = StObject.set(x, "ETH_TX", value.asInstanceOf[js.Any])
      
      inline def setETH_TX_RECEIPT(value: CodecCode): Self = StObject.set(x, "ETH_TX_RECEIPT", value.asInstanceOf[js.Any])
      
      inline def setETH_TX_RECEIPT_TRIE(value: CodecCode): Self = StObject.set(x, "ETH_TX_RECEIPT_TRIE", value.asInstanceOf[js.Any])
      
      inline def setETH_TX_TRIE(value: CodecCode): Self = StObject.set(x, "ETH_TX_TRIE", value.asInstanceOf[js.Any])
      
      inline def setFIL_COMMITMENT_SEALED(value: CodecCode): Self = StObject.set(x, "FIL_COMMITMENT_SEALED", value.asInstanceOf[js.Any])
      
      inline def setFIL_COMMITMENT_UNSEALED(value: CodecCode): Self = StObject.set(x, "FIL_COMMITMENT_UNSEALED", value.asInstanceOf[js.Any])
      
      inline def setGARLIC32(value: CodecCode): Self = StObject.set(x, "GARLIC32", value.asInstanceOf[js.Any])
      
      inline def setGARLIC64(value: CodecCode): Self = StObject.set(x, "GARLIC64", value.asInstanceOf[js.Any])
      
      inline def setGIT_RAW(value: CodecCode): Self = StObject.set(x, "GIT_RAW", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_ADR_V0(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_ADR_V0", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_ADR_V1(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_ADR_V1", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_KEY_V0(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_KEY_V0", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_KEY_V1(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_KEY_V1", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_SIG_V0(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_SIG_V0", value.asInstanceOf[js.Any])
      
      inline def setHOLOCHAIN_SIG_V1(value: CodecCode): Self = StObject.set(x, "HOLOCHAIN_SIG_V1", value.asInstanceOf[js.Any])
      
      inline def setHTTP(value: CodecCode): Self = StObject.set(x, "HTTP", value.asInstanceOf[js.Any])
      
      inline def setHTTPS(value: CodecCode): Self = StObject.set(x, "HTTPS", value.asInstanceOf[js.Any])
      
      inline def setIDENTITY(value: CodecCode): Self = StObject.set(x, "IDENTITY", value.asInstanceOf[js.Any])
      
      inline def setIP4(value: CodecCode): Self = StObject.set(x, "IP4", value.asInstanceOf[js.Any])
      
      inline def setIP6(value: CodecCode): Self = StObject.set(x, "IP6", value.asInstanceOf[js.Any])
      
      inline def setIP6ZONE(value: CodecCode): Self = StObject.set(x, "IP6ZONE", value.asInstanceOf[js.Any])
      
      inline def setIPFS(value: CodecCode): Self = StObject.set(x, "IPFS", value.asInstanceOf[js.Any])
      
      inline def setIPFS_NS(value: CodecCode): Self = StObject.set(x, "IPFS_NS", value.asInstanceOf[js.Any])
      
      inline def setIPLD_NS(value: CodecCode): Self = StObject.set(x, "IPLD_NS", value.asInstanceOf[js.Any])
      
      inline def setIPNS_NS(value: CodecCode): Self = StObject.set(x, "IPNS_NS", value.asInstanceOf[js.Any])
      
      inline def setJSON(value: CodecCode): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setKANGAROOTWELVE(value: CodecCode): Self = StObject.set(x, "KANGAROOTWELVE", value.asInstanceOf[js.Any])
      
      inline def setKECCAK_224(value: CodecCode): Self = StObject.set(x, "KECCAK_224", value.asInstanceOf[js.Any])
      
      inline def setKECCAK_256(value: CodecCode): Self = StObject.set(x, "KECCAK_256", value.asInstanceOf[js.Any])
      
      inline def setKECCAK_384(value: CodecCode): Self = StObject.set(x, "KECCAK_384", value.asInstanceOf[js.Any])
      
      inline def setKECCAK_512(value: CodecCode): Self = StObject.set(x, "KECCAK_512", value.asInstanceOf[js.Any])
      
      inline def setLEOFCOIN_BLOCK(value: CodecCode): Self = StObject.set(x, "LEOFCOIN_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setLEOFCOIN_PR(value: CodecCode): Self = StObject.set(x, "LEOFCOIN_PR", value.asInstanceOf[js.Any])
      
      inline def setLEOFCOIN_TX(value: CodecCode): Self = StObject.set(x, "LEOFCOIN_TX", value.asInstanceOf[js.Any])
      
      inline def setLIBP2P_KEY(value: CodecCode): Self = StObject.set(x, "LIBP2P_KEY", value.asInstanceOf[js.Any])
      
      inline def setLIBP2P_PEER_RECORD(value: CodecCode): Self = StObject.set(x, "LIBP2P_PEER_RECORD", value.asInstanceOf[js.Any])
      
      inline def setLIBP2P_RELAY_RSVP(value: CodecCode): Self = StObject.set(x, "LIBP2P_RELAY_RSVP", value.asInstanceOf[js.Any])
      
      inline def setMD4(value: CodecCode): Self = StObject.set(x, "MD4", value.asInstanceOf[js.Any])
      
      inline def setMD5(value: CodecCode): Self = StObject.set(x, "MD5", value.asInstanceOf[js.Any])
      
      inline def setMESSAGEPACK(value: CodecCode): Self = StObject.set(x, "MESSAGEPACK", value.asInstanceOf[js.Any])
      
      inline def setMULTIADDR(value: CodecCode): Self = StObject.set(x, "MULTIADDR", value.asInstanceOf[js.Any])
      
      inline def setMULTIBASE(value: CodecCode): Self = StObject.set(x, "MULTIBASE", value.asInstanceOf[js.Any])
      
      inline def setMULTICODEC(value: CodecCode): Self = StObject.set(x, "MULTICODEC", value.asInstanceOf[js.Any])
      
      inline def setMULTIHASH(value: CodecCode): Self = StObject.set(x, "MULTIHASH", value.asInstanceOf[js.Any])
      
      inline def setMURMUR3_128(value: CodecCode): Self = StObject.set(x, "MURMUR3_128", value.asInstanceOf[js.Any])
      
      inline def setMURMUR3_32(value: CodecCode): Self = StObject.set(x, "MURMUR3_32", value.asInstanceOf[js.Any])
      
      inline def setNOISE(value: CodecCode): Self = StObject.set(x, "NOISE", value.asInstanceOf[js.Any])
      
      inline def setONION(value: CodecCode): Self = StObject.set(x, "ONION", value.asInstanceOf[js.Any])
      
      inline def setONION3(value: CodecCode): Self = StObject.set(x, "ONION3", value.asInstanceOf[js.Any])
      
      inline def setP256_PUB(value: CodecCode): Self = StObject.set(x, "P256_PUB", value.asInstanceOf[js.Any])
      
      inline def setP2P(value: CodecCode): Self = StObject.set(x, "P2P", value.asInstanceOf[js.Any])
      
      inline def setP2P_CIRCUIT(value: CodecCode): Self = StObject.set(x, "P2P_CIRCUIT", value.asInstanceOf[js.Any])
      
      inline def setP2P_STARDUST(value: CodecCode): Self = StObject.set(x, "P2P_STARDUST", value.asInstanceOf[js.Any])
      
      inline def setP2P_WEBRTC_DIRECT(value: CodecCode): Self = StObject.set(x, "P2P_WEBRTC_DIRECT", value.asInstanceOf[js.Any])
      
      inline def setP2P_WEBRTC_STAR(value: CodecCode): Self = StObject.set(x, "P2P_WEBRTC_STAR", value.asInstanceOf[js.Any])
      
      inline def setP2P_WEBSOCKET_STAR(value: CodecCode): Self = StObject.set(x, "P2P_WEBSOCKET_STAR", value.asInstanceOf[js.Any])
      
      inline def setP384_PUB(value: CodecCode): Self = StObject.set(x, "P384_PUB", value.asInstanceOf[js.Any])
      
      inline def setP521_PUB(value: CodecCode): Self = StObject.set(x, "P521_PUB", value.asInstanceOf[js.Any])
      
      inline def setPATH(value: CodecCode): Self = StObject.set(x, "PATH", value.asInstanceOf[js.Any])
      
      inline def setPOSEIDON_BLS12_381_A2_FC1(value: CodecCode): Self = StObject.set(x, "POSEIDON_BLS12_381_A2_FC1", value.asInstanceOf[js.Any])
      
      inline def setPOSEIDON_BLS12_381_A2_FC1_SC(value: CodecCode): Self = StObject.set(x, "POSEIDON_BLS12_381_A2_FC1_SC", value.asInstanceOf[js.Any])
      
      inline def setPROTOBUF(value: CodecCode): Self = StObject.set(x, "PROTOBUF", value.asInstanceOf[js.Any])
      
      inline def setQUIC(value: CodecCode): Self = StObject.set(x, "QUIC", value.asInstanceOf[js.Any])
      
      inline def setRAW(value: CodecCode): Self = StObject.set(x, "RAW", value.asInstanceOf[js.Any])
      
      inline def setRIPEMD_128(value: CodecCode): Self = StObject.set(x, "RIPEMD_128", value.asInstanceOf[js.Any])
      
      inline def setRIPEMD_160(value: CodecCode): Self = StObject.set(x, "RIPEMD_160", value.asInstanceOf[js.Any])
      
      inline def setRIPEMD_256(value: CodecCode): Self = StObject.set(x, "RIPEMD_256", value.asInstanceOf[js.Any])
      
      inline def setRIPEMD_320(value: CodecCode): Self = StObject.set(x, "RIPEMD_320", value.asInstanceOf[js.Any])
      
      inline def setRLP(value: CodecCode): Self = StObject.set(x, "RLP", value.asInstanceOf[js.Any])
      
      inline def setSCTP(value: CodecCode): Self = StObject.set(x, "SCTP", value.asInstanceOf[js.Any])
      
      inline def setSECP256K1_PRIV(value: CodecCode): Self = StObject.set(x, "SECP256K1_PRIV", value.asInstanceOf[js.Any])
      
      inline def setSECP256K1_PUB(value: CodecCode): Self = StObject.set(x, "SECP256K1_PUB", value.asInstanceOf[js.Any])
      
      inline def setSHA1(value: CodecCode): Self = StObject.set(x, "SHA1", value.asInstanceOf[js.Any])
      
      inline def setSHA2_256(value: CodecCode): Self = StObject.set(x, "SHA2_256", value.asInstanceOf[js.Any])
      
      inline def setSHA2_256_TRUNC254_PADDED(value: CodecCode): Self = StObject.set(x, "SHA2_256_TRUNC254_PADDED", value.asInstanceOf[js.Any])
      
      inline def setSHA2_512(value: CodecCode): Self = StObject.set(x, "SHA2_512", value.asInstanceOf[js.Any])
      
      inline def setSHA3_224(value: CodecCode): Self = StObject.set(x, "SHA3_224", value.asInstanceOf[js.Any])
      
      inline def setSHA3_256(value: CodecCode): Self = StObject.set(x, "SHA3_256", value.asInstanceOf[js.Any])
      
      inline def setSHA3_384(value: CodecCode): Self = StObject.set(x, "SHA3_384", value.asInstanceOf[js.Any])
      
      inline def setSHA3_512(value: CodecCode): Self = StObject.set(x, "SHA3_512", value.asInstanceOf[js.Any])
      
      inline def setSHAKE_128(value: CodecCode): Self = StObject.set(x, "SHAKE_128", value.asInstanceOf[js.Any])
      
      inline def setSHAKE_256(value: CodecCode): Self = StObject.set(x, "SHAKE_256", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_1000(value: CodecCode): Self = StObject.set(x, "SKEIN1024_1000", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_1008(value: CodecCode): Self = StObject.set(x, "SKEIN1024_1008", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_1016(value: CodecCode): Self = StObject.set(x, "SKEIN1024_1016", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_1024(value: CodecCode): Self = StObject.set(x, "SKEIN1024_1024", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_104(value: CodecCode): Self = StObject.set(x, "SKEIN1024_104", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_112(value: CodecCode): Self = StObject.set(x, "SKEIN1024_112", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_120(value: CodecCode): Self = StObject.set(x, "SKEIN1024_120", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_128(value: CodecCode): Self = StObject.set(x, "SKEIN1024_128", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_136(value: CodecCode): Self = StObject.set(x, "SKEIN1024_136", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_144(value: CodecCode): Self = StObject.set(x, "SKEIN1024_144", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_152(value: CodecCode): Self = StObject.set(x, "SKEIN1024_152", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_16(value: CodecCode): Self = StObject.set(x, "SKEIN1024_16", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_160(value: CodecCode): Self = StObject.set(x, "SKEIN1024_160", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_168(value: CodecCode): Self = StObject.set(x, "SKEIN1024_168", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_176(value: CodecCode): Self = StObject.set(x, "SKEIN1024_176", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_184(value: CodecCode): Self = StObject.set(x, "SKEIN1024_184", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_192(value: CodecCode): Self = StObject.set(x, "SKEIN1024_192", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_200(value: CodecCode): Self = StObject.set(x, "SKEIN1024_200", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_208(value: CodecCode): Self = StObject.set(x, "SKEIN1024_208", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_216(value: CodecCode): Self = StObject.set(x, "SKEIN1024_216", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_224(value: CodecCode): Self = StObject.set(x, "SKEIN1024_224", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_232(value: CodecCode): Self = StObject.set(x, "SKEIN1024_232", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_24(value: CodecCode): Self = StObject.set(x, "SKEIN1024_24", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_240(value: CodecCode): Self = StObject.set(x, "SKEIN1024_240", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_248(value: CodecCode): Self = StObject.set(x, "SKEIN1024_248", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_256(value: CodecCode): Self = StObject.set(x, "SKEIN1024_256", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_264(value: CodecCode): Self = StObject.set(x, "SKEIN1024_264", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_272(value: CodecCode): Self = StObject.set(x, "SKEIN1024_272", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_280(value: CodecCode): Self = StObject.set(x, "SKEIN1024_280", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_288(value: CodecCode): Self = StObject.set(x, "SKEIN1024_288", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_296(value: CodecCode): Self = StObject.set(x, "SKEIN1024_296", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_304(value: CodecCode): Self = StObject.set(x, "SKEIN1024_304", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_312(value: CodecCode): Self = StObject.set(x, "SKEIN1024_312", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_32(value: CodecCode): Self = StObject.set(x, "SKEIN1024_32", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_320(value: CodecCode): Self = StObject.set(x, "SKEIN1024_320", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_328(value: CodecCode): Self = StObject.set(x, "SKEIN1024_328", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_336(value: CodecCode): Self = StObject.set(x, "SKEIN1024_336", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_344(value: CodecCode): Self = StObject.set(x, "SKEIN1024_344", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_352(value: CodecCode): Self = StObject.set(x, "SKEIN1024_352", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_360(value: CodecCode): Self = StObject.set(x, "SKEIN1024_360", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_368(value: CodecCode): Self = StObject.set(x, "SKEIN1024_368", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_376(value: CodecCode): Self = StObject.set(x, "SKEIN1024_376", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_384(value: CodecCode): Self = StObject.set(x, "SKEIN1024_384", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_392(value: CodecCode): Self = StObject.set(x, "SKEIN1024_392", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_40(value: CodecCode): Self = StObject.set(x, "SKEIN1024_40", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_400(value: CodecCode): Self = StObject.set(x, "SKEIN1024_400", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_408(value: CodecCode): Self = StObject.set(x, "SKEIN1024_408", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_416(value: CodecCode): Self = StObject.set(x, "SKEIN1024_416", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_424(value: CodecCode): Self = StObject.set(x, "SKEIN1024_424", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_432(value: CodecCode): Self = StObject.set(x, "SKEIN1024_432", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_440(value: CodecCode): Self = StObject.set(x, "SKEIN1024_440", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_448(value: CodecCode): Self = StObject.set(x, "SKEIN1024_448", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_456(value: CodecCode): Self = StObject.set(x, "SKEIN1024_456", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_464(value: CodecCode): Self = StObject.set(x, "SKEIN1024_464", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_472(value: CodecCode): Self = StObject.set(x, "SKEIN1024_472", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_48(value: CodecCode): Self = StObject.set(x, "SKEIN1024_48", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_480(value: CodecCode): Self = StObject.set(x, "SKEIN1024_480", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_488(value: CodecCode): Self = StObject.set(x, "SKEIN1024_488", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_496(value: CodecCode): Self = StObject.set(x, "SKEIN1024_496", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_504(value: CodecCode): Self = StObject.set(x, "SKEIN1024_504", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_512(value: CodecCode): Self = StObject.set(x, "SKEIN1024_512", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_520(value: CodecCode): Self = StObject.set(x, "SKEIN1024_520", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_528(value: CodecCode): Self = StObject.set(x, "SKEIN1024_528", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_536(value: CodecCode): Self = StObject.set(x, "SKEIN1024_536", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_544(value: CodecCode): Self = StObject.set(x, "SKEIN1024_544", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_552(value: CodecCode): Self = StObject.set(x, "SKEIN1024_552", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_56(value: CodecCode): Self = StObject.set(x, "SKEIN1024_56", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_560(value: CodecCode): Self = StObject.set(x, "SKEIN1024_560", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_568(value: CodecCode): Self = StObject.set(x, "SKEIN1024_568", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_576(value: CodecCode): Self = StObject.set(x, "SKEIN1024_576", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_584(value: CodecCode): Self = StObject.set(x, "SKEIN1024_584", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_592(value: CodecCode): Self = StObject.set(x, "SKEIN1024_592", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_600(value: CodecCode): Self = StObject.set(x, "SKEIN1024_600", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_608(value: CodecCode): Self = StObject.set(x, "SKEIN1024_608", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_616(value: CodecCode): Self = StObject.set(x, "SKEIN1024_616", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_624(value: CodecCode): Self = StObject.set(x, "SKEIN1024_624", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_632(value: CodecCode): Self = StObject.set(x, "SKEIN1024_632", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_64(value: CodecCode): Self = StObject.set(x, "SKEIN1024_64", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_640(value: CodecCode): Self = StObject.set(x, "SKEIN1024_640", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_648(value: CodecCode): Self = StObject.set(x, "SKEIN1024_648", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_656(value: CodecCode): Self = StObject.set(x, "SKEIN1024_656", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_664(value: CodecCode): Self = StObject.set(x, "SKEIN1024_664", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_672(value: CodecCode): Self = StObject.set(x, "SKEIN1024_672", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_680(value: CodecCode): Self = StObject.set(x, "SKEIN1024_680", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_688(value: CodecCode): Self = StObject.set(x, "SKEIN1024_688", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_696(value: CodecCode): Self = StObject.set(x, "SKEIN1024_696", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_704(value: CodecCode): Self = StObject.set(x, "SKEIN1024_704", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_712(value: CodecCode): Self = StObject.set(x, "SKEIN1024_712", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_72(value: CodecCode): Self = StObject.set(x, "SKEIN1024_72", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_720(value: CodecCode): Self = StObject.set(x, "SKEIN1024_720", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_728(value: CodecCode): Self = StObject.set(x, "SKEIN1024_728", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_736(value: CodecCode): Self = StObject.set(x, "SKEIN1024_736", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_744(value: CodecCode): Self = StObject.set(x, "SKEIN1024_744", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_752(value: CodecCode): Self = StObject.set(x, "SKEIN1024_752", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_760(value: CodecCode): Self = StObject.set(x, "SKEIN1024_760", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_768(value: CodecCode): Self = StObject.set(x, "SKEIN1024_768", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_776(value: CodecCode): Self = StObject.set(x, "SKEIN1024_776", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_784(value: CodecCode): Self = StObject.set(x, "SKEIN1024_784", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_792(value: CodecCode): Self = StObject.set(x, "SKEIN1024_792", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_8(value: CodecCode): Self = StObject.set(x, "SKEIN1024_8", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_80(value: CodecCode): Self = StObject.set(x, "SKEIN1024_80", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_800(value: CodecCode): Self = StObject.set(x, "SKEIN1024_800", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_808(value: CodecCode): Self = StObject.set(x, "SKEIN1024_808", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_816(value: CodecCode): Self = StObject.set(x, "SKEIN1024_816", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_824(value: CodecCode): Self = StObject.set(x, "SKEIN1024_824", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_832(value: CodecCode): Self = StObject.set(x, "SKEIN1024_832", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_840(value: CodecCode): Self = StObject.set(x, "SKEIN1024_840", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_848(value: CodecCode): Self = StObject.set(x, "SKEIN1024_848", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_856(value: CodecCode): Self = StObject.set(x, "SKEIN1024_856", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_864(value: CodecCode): Self = StObject.set(x, "SKEIN1024_864", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_872(value: CodecCode): Self = StObject.set(x, "SKEIN1024_872", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_88(value: CodecCode): Self = StObject.set(x, "SKEIN1024_88", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_880(value: CodecCode): Self = StObject.set(x, "SKEIN1024_880", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_888(value: CodecCode): Self = StObject.set(x, "SKEIN1024_888", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_896(value: CodecCode): Self = StObject.set(x, "SKEIN1024_896", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_904(value: CodecCode): Self = StObject.set(x, "SKEIN1024_904", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_912(value: CodecCode): Self = StObject.set(x, "SKEIN1024_912", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_920(value: CodecCode): Self = StObject.set(x, "SKEIN1024_920", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_928(value: CodecCode): Self = StObject.set(x, "SKEIN1024_928", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_936(value: CodecCode): Self = StObject.set(x, "SKEIN1024_936", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_944(value: CodecCode): Self = StObject.set(x, "SKEIN1024_944", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_952(value: CodecCode): Self = StObject.set(x, "SKEIN1024_952", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_96(value: CodecCode): Self = StObject.set(x, "SKEIN1024_96", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_960(value: CodecCode): Self = StObject.set(x, "SKEIN1024_960", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_968(value: CodecCode): Self = StObject.set(x, "SKEIN1024_968", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_976(value: CodecCode): Self = StObject.set(x, "SKEIN1024_976", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_984(value: CodecCode): Self = StObject.set(x, "SKEIN1024_984", value.asInstanceOf[js.Any])
      
      inline def setSKEIN1024_992(value: CodecCode): Self = StObject.set(x, "SKEIN1024_992", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_104(value: CodecCode): Self = StObject.set(x, "SKEIN256_104", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_112(value: CodecCode): Self = StObject.set(x, "SKEIN256_112", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_120(value: CodecCode): Self = StObject.set(x, "SKEIN256_120", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_128(value: CodecCode): Self = StObject.set(x, "SKEIN256_128", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_136(value: CodecCode): Self = StObject.set(x, "SKEIN256_136", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_144(value: CodecCode): Self = StObject.set(x, "SKEIN256_144", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_152(value: CodecCode): Self = StObject.set(x, "SKEIN256_152", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_16(value: CodecCode): Self = StObject.set(x, "SKEIN256_16", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_160(value: CodecCode): Self = StObject.set(x, "SKEIN256_160", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_168(value: CodecCode): Self = StObject.set(x, "SKEIN256_168", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_176(value: CodecCode): Self = StObject.set(x, "SKEIN256_176", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_184(value: CodecCode): Self = StObject.set(x, "SKEIN256_184", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_192(value: CodecCode): Self = StObject.set(x, "SKEIN256_192", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_200(value: CodecCode): Self = StObject.set(x, "SKEIN256_200", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_208(value: CodecCode): Self = StObject.set(x, "SKEIN256_208", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_216(value: CodecCode): Self = StObject.set(x, "SKEIN256_216", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_224(value: CodecCode): Self = StObject.set(x, "SKEIN256_224", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_232(value: CodecCode): Self = StObject.set(x, "SKEIN256_232", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_24(value: CodecCode): Self = StObject.set(x, "SKEIN256_24", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_240(value: CodecCode): Self = StObject.set(x, "SKEIN256_240", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_248(value: CodecCode): Self = StObject.set(x, "SKEIN256_248", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_256(value: CodecCode): Self = StObject.set(x, "SKEIN256_256", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_32(value: CodecCode): Self = StObject.set(x, "SKEIN256_32", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_40(value: CodecCode): Self = StObject.set(x, "SKEIN256_40", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_48(value: CodecCode): Self = StObject.set(x, "SKEIN256_48", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_56(value: CodecCode): Self = StObject.set(x, "SKEIN256_56", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_64(value: CodecCode): Self = StObject.set(x, "SKEIN256_64", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_72(value: CodecCode): Self = StObject.set(x, "SKEIN256_72", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_8(value: CodecCode): Self = StObject.set(x, "SKEIN256_8", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_80(value: CodecCode): Self = StObject.set(x, "SKEIN256_80", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_88(value: CodecCode): Self = StObject.set(x, "SKEIN256_88", value.asInstanceOf[js.Any])
      
      inline def setSKEIN256_96(value: CodecCode): Self = StObject.set(x, "SKEIN256_96", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_104(value: CodecCode): Self = StObject.set(x, "SKEIN512_104", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_112(value: CodecCode): Self = StObject.set(x, "SKEIN512_112", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_120(value: CodecCode): Self = StObject.set(x, "SKEIN512_120", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_128(value: CodecCode): Self = StObject.set(x, "SKEIN512_128", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_136(value: CodecCode): Self = StObject.set(x, "SKEIN512_136", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_144(value: CodecCode): Self = StObject.set(x, "SKEIN512_144", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_152(value: CodecCode): Self = StObject.set(x, "SKEIN512_152", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_16(value: CodecCode): Self = StObject.set(x, "SKEIN512_16", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_160(value: CodecCode): Self = StObject.set(x, "SKEIN512_160", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_168(value: CodecCode): Self = StObject.set(x, "SKEIN512_168", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_176(value: CodecCode): Self = StObject.set(x, "SKEIN512_176", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_184(value: CodecCode): Self = StObject.set(x, "SKEIN512_184", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_192(value: CodecCode): Self = StObject.set(x, "SKEIN512_192", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_200(value: CodecCode): Self = StObject.set(x, "SKEIN512_200", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_208(value: CodecCode): Self = StObject.set(x, "SKEIN512_208", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_216(value: CodecCode): Self = StObject.set(x, "SKEIN512_216", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_224(value: CodecCode): Self = StObject.set(x, "SKEIN512_224", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_232(value: CodecCode): Self = StObject.set(x, "SKEIN512_232", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_24(value: CodecCode): Self = StObject.set(x, "SKEIN512_24", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_240(value: CodecCode): Self = StObject.set(x, "SKEIN512_240", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_248(value: CodecCode): Self = StObject.set(x, "SKEIN512_248", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_256(value: CodecCode): Self = StObject.set(x, "SKEIN512_256", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_264(value: CodecCode): Self = StObject.set(x, "SKEIN512_264", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_272(value: CodecCode): Self = StObject.set(x, "SKEIN512_272", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_280(value: CodecCode): Self = StObject.set(x, "SKEIN512_280", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_288(value: CodecCode): Self = StObject.set(x, "SKEIN512_288", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_296(value: CodecCode): Self = StObject.set(x, "SKEIN512_296", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_304(value: CodecCode): Self = StObject.set(x, "SKEIN512_304", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_312(value: CodecCode): Self = StObject.set(x, "SKEIN512_312", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_32(value: CodecCode): Self = StObject.set(x, "SKEIN512_32", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_320(value: CodecCode): Self = StObject.set(x, "SKEIN512_320", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_328(value: CodecCode): Self = StObject.set(x, "SKEIN512_328", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_336(value: CodecCode): Self = StObject.set(x, "SKEIN512_336", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_344(value: CodecCode): Self = StObject.set(x, "SKEIN512_344", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_352(value: CodecCode): Self = StObject.set(x, "SKEIN512_352", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_360(value: CodecCode): Self = StObject.set(x, "SKEIN512_360", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_368(value: CodecCode): Self = StObject.set(x, "SKEIN512_368", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_376(value: CodecCode): Self = StObject.set(x, "SKEIN512_376", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_384(value: CodecCode): Self = StObject.set(x, "SKEIN512_384", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_392(value: CodecCode): Self = StObject.set(x, "SKEIN512_392", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_40(value: CodecCode): Self = StObject.set(x, "SKEIN512_40", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_400(value: CodecCode): Self = StObject.set(x, "SKEIN512_400", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_408(value: CodecCode): Self = StObject.set(x, "SKEIN512_408", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_416(value: CodecCode): Self = StObject.set(x, "SKEIN512_416", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_424(value: CodecCode): Self = StObject.set(x, "SKEIN512_424", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_432(value: CodecCode): Self = StObject.set(x, "SKEIN512_432", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_440(value: CodecCode): Self = StObject.set(x, "SKEIN512_440", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_448(value: CodecCode): Self = StObject.set(x, "SKEIN512_448", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_456(value: CodecCode): Self = StObject.set(x, "SKEIN512_456", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_464(value: CodecCode): Self = StObject.set(x, "SKEIN512_464", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_472(value: CodecCode): Self = StObject.set(x, "SKEIN512_472", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_48(value: CodecCode): Self = StObject.set(x, "SKEIN512_48", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_480(value: CodecCode): Self = StObject.set(x, "SKEIN512_480", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_488(value: CodecCode): Self = StObject.set(x, "SKEIN512_488", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_496(value: CodecCode): Self = StObject.set(x, "SKEIN512_496", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_504(value: CodecCode): Self = StObject.set(x, "SKEIN512_504", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_512(value: CodecCode): Self = StObject.set(x, "SKEIN512_512", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_56(value: CodecCode): Self = StObject.set(x, "SKEIN512_56", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_64(value: CodecCode): Self = StObject.set(x, "SKEIN512_64", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_72(value: CodecCode): Self = StObject.set(x, "SKEIN512_72", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_8(value: CodecCode): Self = StObject.set(x, "SKEIN512_8", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_80(value: CodecCode): Self = StObject.set(x, "SKEIN512_80", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_88(value: CodecCode): Self = StObject.set(x, "SKEIN512_88", value.asInstanceOf[js.Any])
      
      inline def setSKEIN512_96(value: CodecCode): Self = StObject.set(x, "SKEIN512_96", value.asInstanceOf[js.Any])
      
      inline def setSKYNET_NS(value: CodecCode): Self = StObject.set(x, "SKYNET_NS", value.asInstanceOf[js.Any])
      
      inline def setSM3_256(value: CodecCode): Self = StObject.set(x, "SM3_256", value.asInstanceOf[js.Any])
      
      inline def setSTELLAR_BLOCK(value: CodecCode): Self = StObject.set(x, "STELLAR_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setSTELLAR_TX(value: CodecCode): Self = StObject.set(x, "STELLAR_TX", value.asInstanceOf[js.Any])
      
      inline def setSTREAMID(value: CodecCode): Self = StObject.set(x, "STREAMID", value.asInstanceOf[js.Any])
      
      inline def setSWARM_FEED(value: CodecCode): Self = StObject.set(x, "SWARM_FEED", value.asInstanceOf[js.Any])
      
      inline def setSWARM_MANIFEST(value: CodecCode): Self = StObject.set(x, "SWARM_MANIFEST", value.asInstanceOf[js.Any])
      
      inline def setSWARM_NS(value: CodecCode): Self = StObject.set(x, "SWARM_NS", value.asInstanceOf[js.Any])
      
      inline def setSWHID_1_SNP(value: CodecCode): Self = StObject.set(x, "SWHID_1_SNP", value.asInstanceOf[js.Any])
      
      inline def setTCP(value: CodecCode): Self = StObject.set(x, "TCP", value.asInstanceOf[js.Any])
      
      inline def setTHREAD(value: CodecCode): Self = StObject.set(x, "THREAD", value.asInstanceOf[js.Any])
      
      inline def setTLS(value: CodecCode): Self = StObject.set(x, "TLS", value.asInstanceOf[js.Any])
      
      inline def setTORRENT_FILE(value: CodecCode): Self = StObject.set(x, "TORRENT_FILE", value.asInstanceOf[js.Any])
      
      inline def setTORRENT_INFO(value: CodecCode): Self = StObject.set(x, "TORRENT_INFO", value.asInstanceOf[js.Any])
      
      inline def setUDP(value: CodecCode): Self = StObject.set(x, "UDP", value.asInstanceOf[js.Any])
      
      inline def setUDT(value: CodecCode): Self = StObject.set(x, "UDT", value.asInstanceOf[js.Any])
      
      inline def setUNIX(value: CodecCode): Self = StObject.set(x, "UNIX", value.asInstanceOf[js.Any])
      
      inline def setUTP(value: CodecCode): Self = StObject.set(x, "UTP", value.asInstanceOf[js.Any])
      
      inline def setWS(value: CodecCode): Self = StObject.set(x, "WS", value.asInstanceOf[js.Any])
      
      inline def setWSS(value: CodecCode): Self = StObject.set(x, "WSS", value.asInstanceOf[js.Any])
      
      inline def setX11(value: CodecCode): Self = StObject.set(x, "X11", value.asInstanceOf[js.Any])
      
      inline def setX25519_PRIV(value: CodecCode): Self = StObject.set(x, "X25519_PRIV", value.asInstanceOf[js.Any])
      
      inline def setX25519_PUB(value: CodecCode): Self = StObject.set(x, "X25519_PUB", value.asInstanceOf[js.Any])
      
      inline def setX448_PUB(value: CodecCode): Self = StObject.set(x, "X448_PUB", value.asInstanceOf[js.Any])
      
      inline def setZCASH_BLOCK(value: CodecCode): Self = StObject.set(x, "ZCASH_BLOCK", value.asInstanceOf[js.Any])
      
      inline def setZCASH_TX(value: CodecCode): Self = StObject.set(x, "ZCASH_TX", value.asInstanceOf[js.Any])
      
      inline def setZERONET(value: CodecCode): Self = StObject.set(x, "ZERONET", value.asInstanceOf[js.Any])
      
      inline def setZEROXCERT_IMPRINT_256(value: CodecCode): Self = StObject.set(x, "ZEROXCERT_IMPRINT_256", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameUint8ArrayMap extends StObject {
    
    var `arweave-ns`: js.typedarray.Uint8Array
    
    var bencode: js.typedarray.Uint8Array
    
    var `bitcoin-block`: js.typedarray.Uint8Array
    
    var `bitcoin-tx`: js.typedarray.Uint8Array
    
    var `bitcoin-witness-commitment`: js.typedarray.Uint8Array
    
    var `blake2b-104`: js.typedarray.Uint8Array
    
    var `blake2b-112`: js.typedarray.Uint8Array
    
    var `blake2b-120`: js.typedarray.Uint8Array
    
    var `blake2b-128`: js.typedarray.Uint8Array
    
    var `blake2b-136`: js.typedarray.Uint8Array
    
    var `blake2b-144`: js.typedarray.Uint8Array
    
    var `blake2b-152`: js.typedarray.Uint8Array
    
    var `blake2b-16`: js.typedarray.Uint8Array
    
    var `blake2b-160`: js.typedarray.Uint8Array
    
    var `blake2b-168`: js.typedarray.Uint8Array
    
    var `blake2b-176`: js.typedarray.Uint8Array
    
    var `blake2b-184`: js.typedarray.Uint8Array
    
    var `blake2b-192`: js.typedarray.Uint8Array
    
    var `blake2b-200`: js.typedarray.Uint8Array
    
    var `blake2b-208`: js.typedarray.Uint8Array
    
    var `blake2b-216`: js.typedarray.Uint8Array
    
    var `blake2b-224`: js.typedarray.Uint8Array
    
    var `blake2b-232`: js.typedarray.Uint8Array
    
    var `blake2b-24`: js.typedarray.Uint8Array
    
    var `blake2b-240`: js.typedarray.Uint8Array
    
    var `blake2b-248`: js.typedarray.Uint8Array
    
    var `blake2b-256`: js.typedarray.Uint8Array
    
    var `blake2b-264`: js.typedarray.Uint8Array
    
    var `blake2b-272`: js.typedarray.Uint8Array
    
    var `blake2b-280`: js.typedarray.Uint8Array
    
    var `blake2b-288`: js.typedarray.Uint8Array
    
    var `blake2b-296`: js.typedarray.Uint8Array
    
    var `blake2b-304`: js.typedarray.Uint8Array
    
    var `blake2b-312`: js.typedarray.Uint8Array
    
    var `blake2b-32`: js.typedarray.Uint8Array
    
    var `blake2b-320`: js.typedarray.Uint8Array
    
    var `blake2b-328`: js.typedarray.Uint8Array
    
    var `blake2b-336`: js.typedarray.Uint8Array
    
    var `blake2b-344`: js.typedarray.Uint8Array
    
    var `blake2b-352`: js.typedarray.Uint8Array
    
    var `blake2b-360`: js.typedarray.Uint8Array
    
    var `blake2b-368`: js.typedarray.Uint8Array
    
    var `blake2b-376`: js.typedarray.Uint8Array
    
    var `blake2b-384`: js.typedarray.Uint8Array
    
    var `blake2b-392`: js.typedarray.Uint8Array
    
    var `blake2b-40`: js.typedarray.Uint8Array
    
    var `blake2b-400`: js.typedarray.Uint8Array
    
    var `blake2b-408`: js.typedarray.Uint8Array
    
    var `blake2b-416`: js.typedarray.Uint8Array
    
    var `blake2b-424`: js.typedarray.Uint8Array
    
    var `blake2b-432`: js.typedarray.Uint8Array
    
    var `blake2b-440`: js.typedarray.Uint8Array
    
    var `blake2b-448`: js.typedarray.Uint8Array
    
    var `blake2b-456`: js.typedarray.Uint8Array
    
    var `blake2b-464`: js.typedarray.Uint8Array
    
    var `blake2b-472`: js.typedarray.Uint8Array
    
    var `blake2b-48`: js.typedarray.Uint8Array
    
    var `blake2b-480`: js.typedarray.Uint8Array
    
    var `blake2b-488`: js.typedarray.Uint8Array
    
    var `blake2b-496`: js.typedarray.Uint8Array
    
    var `blake2b-504`: js.typedarray.Uint8Array
    
    var `blake2b-512`: js.typedarray.Uint8Array
    
    var `blake2b-56`: js.typedarray.Uint8Array
    
    var `blake2b-64`: js.typedarray.Uint8Array
    
    var `blake2b-72`: js.typedarray.Uint8Array
    
    var `blake2b-8`: js.typedarray.Uint8Array
    
    var `blake2b-80`: js.typedarray.Uint8Array
    
    var `blake2b-88`: js.typedarray.Uint8Array
    
    var `blake2b-96`: js.typedarray.Uint8Array
    
    var `blake2s-104`: js.typedarray.Uint8Array
    
    var `blake2s-112`: js.typedarray.Uint8Array
    
    var `blake2s-120`: js.typedarray.Uint8Array
    
    var `blake2s-128`: js.typedarray.Uint8Array
    
    var `blake2s-136`: js.typedarray.Uint8Array
    
    var `blake2s-144`: js.typedarray.Uint8Array
    
    var `blake2s-152`: js.typedarray.Uint8Array
    
    var `blake2s-16`: js.typedarray.Uint8Array
    
    var `blake2s-160`: js.typedarray.Uint8Array
    
    var `blake2s-168`: js.typedarray.Uint8Array
    
    var `blake2s-176`: js.typedarray.Uint8Array
    
    var `blake2s-184`: js.typedarray.Uint8Array
    
    var `blake2s-192`: js.typedarray.Uint8Array
    
    var `blake2s-200`: js.typedarray.Uint8Array
    
    var `blake2s-208`: js.typedarray.Uint8Array
    
    var `blake2s-216`: js.typedarray.Uint8Array
    
    var `blake2s-224`: js.typedarray.Uint8Array
    
    var `blake2s-232`: js.typedarray.Uint8Array
    
    var `blake2s-24`: js.typedarray.Uint8Array
    
    var `blake2s-240`: js.typedarray.Uint8Array
    
    var `blake2s-248`: js.typedarray.Uint8Array
    
    var `blake2s-256`: js.typedarray.Uint8Array
    
    var `blake2s-32`: js.typedarray.Uint8Array
    
    var `blake2s-40`: js.typedarray.Uint8Array
    
    var `blake2s-48`: js.typedarray.Uint8Array
    
    var `blake2s-56`: js.typedarray.Uint8Array
    
    var `blake2s-64`: js.typedarray.Uint8Array
    
    var `blake2s-72`: js.typedarray.Uint8Array
    
    var `blake2s-8`: js.typedarray.Uint8Array
    
    var `blake2s-80`: js.typedarray.Uint8Array
    
    var `blake2s-88`: js.typedarray.Uint8Array
    
    var `blake2s-96`: js.typedarray.Uint8Array
    
    var blake3: js.typedarray.Uint8Array
    
    var `bls12_381-g1-pub`: js.typedarray.Uint8Array
    
    var `bls12_381-g1g2-pub`: js.typedarray.Uint8Array
    
    var `bls12_381-g2-pub`: js.typedarray.Uint8Array
    
    var bmt: js.typedarray.Uint8Array
    
    var `caip-50`: js.typedarray.Uint8Array
    
    var `car-index-sorted`: js.typedarray.Uint8Array
    
    var cbor: js.typedarray.Uint8Array
    
    var cidv1: js.typedarray.Uint8Array
    
    var cidv2: js.typedarray.Uint8Array
    
    var cidv3: js.typedarray.Uint8Array
    
    var `dag-cbor`: js.typedarray.Uint8Array
    
    var `dag-cose`: js.typedarray.Uint8Array
    
    var `dag-jose`: js.typedarray.Uint8Array
    
    var `dag-json`: js.typedarray.Uint8Array
    
    var `dag-pb`: js.typedarray.Uint8Array
    
    var `dash-block`: js.typedarray.Uint8Array
    
    var `dash-tx`: js.typedarray.Uint8Array
    
    var `dbl-sha2-256`: js.typedarray.Uint8Array
    
    var dccp: js.typedarray.Uint8Array
    
    var `decred-block`: js.typedarray.Uint8Array
    
    var `decred-tx`: js.typedarray.Uint8Array
    
    var dns: js.typedarray.Uint8Array
    
    var dns4: js.typedarray.Uint8Array
    
    var dns6: js.typedarray.Uint8Array
    
    var dnsaddr: js.typedarray.Uint8Array
    
    var `ed25519-priv`: js.typedarray.Uint8Array
    
    var `ed25519-pub`: js.typedarray.Uint8Array
    
    var `ed448-pub`: js.typedarray.Uint8Array
    
    var `eth-account-snapshot`: js.typedarray.Uint8Array
    
    var `eth-block`: js.typedarray.Uint8Array
    
    var `eth-block-list`: js.typedarray.Uint8Array
    
    var `eth-receipt-log-trie`: js.typedarray.Uint8Array
    
    var `eth-reciept-log`: js.typedarray.Uint8Array
    
    var `eth-state-trie`: js.typedarray.Uint8Array
    
    var `eth-storage-trie`: js.typedarray.Uint8Array
    
    var `eth-tx`: js.typedarray.Uint8Array
    
    var `eth-tx-receipt`: js.typedarray.Uint8Array
    
    var `eth-tx-receipt-trie`: js.typedarray.Uint8Array
    
    var `eth-tx-trie`: js.typedarray.Uint8Array
    
    var `fil-commitment-sealed`: js.typedarray.Uint8Array
    
    var `fil-commitment-unsealed`: js.typedarray.Uint8Array
    
    var garlic32: js.typedarray.Uint8Array
    
    var garlic64: js.typedarray.Uint8Array
    
    var `git-raw`: js.typedarray.Uint8Array
    
    var `holochain-adr-v0`: js.typedarray.Uint8Array
    
    var `holochain-adr-v1`: js.typedarray.Uint8Array
    
    var `holochain-key-v0`: js.typedarray.Uint8Array
    
    var `holochain-key-v1`: js.typedarray.Uint8Array
    
    var `holochain-sig-v0`: js.typedarray.Uint8Array
    
    var `holochain-sig-v1`: js.typedarray.Uint8Array
    
    var http: js.typedarray.Uint8Array
    
    var https: js.typedarray.Uint8Array
    
    var identity: js.typedarray.Uint8Array
    
    var ip4: js.typedarray.Uint8Array
    
    var ip6: js.typedarray.Uint8Array
    
    var ip6zone: js.typedarray.Uint8Array
    
    var ipfs: js.typedarray.Uint8Array
    
    var `ipfs-ns`: js.typedarray.Uint8Array
    
    var `ipld-ns`: js.typedarray.Uint8Array
    
    var `ipns-ns`: js.typedarray.Uint8Array
    
    var json: js.typedarray.Uint8Array
    
    var kangarootwelve: js.typedarray.Uint8Array
    
    var `keccak-224`: js.typedarray.Uint8Array
    
    var `keccak-256`: js.typedarray.Uint8Array
    
    var `keccak-384`: js.typedarray.Uint8Array
    
    var `keccak-512`: js.typedarray.Uint8Array
    
    var `leofcoin-block`: js.typedarray.Uint8Array
    
    var `leofcoin-pr`: js.typedarray.Uint8Array
    
    var `leofcoin-tx`: js.typedarray.Uint8Array
    
    var `libp2p-key`: js.typedarray.Uint8Array
    
    var `libp2p-peer-record`: js.typedarray.Uint8Array
    
    var `libp2p-relay-rsvp`: js.typedarray.Uint8Array
    
    var md4: js.typedarray.Uint8Array
    
    var md5: js.typedarray.Uint8Array
    
    var messagepack: js.typedarray.Uint8Array
    
    var multiaddr: js.typedarray.Uint8Array
    
    var multibase: js.typedarray.Uint8Array
    
    var multicodec: js.typedarray.Uint8Array
    
    var multihash: js.typedarray.Uint8Array
    
    var `murmur3-128`: js.typedarray.Uint8Array
    
    var `murmur3-32`: js.typedarray.Uint8Array
    
    var noise: js.typedarray.Uint8Array
    
    var onion: js.typedarray.Uint8Array
    
    var onion3: js.typedarray.Uint8Array
    
    var `p256-pub`: js.typedarray.Uint8Array
    
    var p2p: js.typedarray.Uint8Array
    
    var `p2p-circuit`: js.typedarray.Uint8Array
    
    var `p2p-stardust`: js.typedarray.Uint8Array
    
    var `p2p-webrtc-direct`: js.typedarray.Uint8Array
    
    var `p2p-webrtc-star`: js.typedarray.Uint8Array
    
    var `p2p-websocket-star`: js.typedarray.Uint8Array
    
    var `p384-pub`: js.typedarray.Uint8Array
    
    var `p521-pub`: js.typedarray.Uint8Array
    
    var path: js.typedarray.Uint8Array
    
    var `poseidon-bls12_381-a2-fc1`: js.typedarray.Uint8Array
    
    var `poseidon-bls12_381-a2-fc1-sc`: js.typedarray.Uint8Array
    
    var protobuf: js.typedarray.Uint8Array
    
    var quic: js.typedarray.Uint8Array
    
    var raw: js.typedarray.Uint8Array
    
    var `ripemd-128`: js.typedarray.Uint8Array
    
    var `ripemd-160`: js.typedarray.Uint8Array
    
    var `ripemd-256`: js.typedarray.Uint8Array
    
    var `ripemd-320`: js.typedarray.Uint8Array
    
    var rlp: js.typedarray.Uint8Array
    
    var sctp: js.typedarray.Uint8Array
    
    var `secp256k1-priv`: js.typedarray.Uint8Array
    
    var `secp256k1-pub`: js.typedarray.Uint8Array
    
    var sha1: js.typedarray.Uint8Array
    
    var `sha2-256`: js.typedarray.Uint8Array
    
    var `sha2-256-trunc254-padded`: js.typedarray.Uint8Array
    
    var `sha2-512`: js.typedarray.Uint8Array
    
    var `sha3-224`: js.typedarray.Uint8Array
    
    var `sha3-256`: js.typedarray.Uint8Array
    
    var `sha3-384`: js.typedarray.Uint8Array
    
    var `sha3-512`: js.typedarray.Uint8Array
    
    var `shake-128`: js.typedarray.Uint8Array
    
    var `shake-256`: js.typedarray.Uint8Array
    
    var `skein1024-1000`: js.typedarray.Uint8Array
    
    var `skein1024-1008`: js.typedarray.Uint8Array
    
    var `skein1024-1016`: js.typedarray.Uint8Array
    
    var `skein1024-1024`: js.typedarray.Uint8Array
    
    var `skein1024-104`: js.typedarray.Uint8Array
    
    var `skein1024-112`: js.typedarray.Uint8Array
    
    var `skein1024-120`: js.typedarray.Uint8Array
    
    var `skein1024-128`: js.typedarray.Uint8Array
    
    var `skein1024-136`: js.typedarray.Uint8Array
    
    var `skein1024-144`: js.typedarray.Uint8Array
    
    var `skein1024-152`: js.typedarray.Uint8Array
    
    var `skein1024-16`: js.typedarray.Uint8Array
    
    var `skein1024-160`: js.typedarray.Uint8Array
    
    var `skein1024-168`: js.typedarray.Uint8Array
    
    var `skein1024-176`: js.typedarray.Uint8Array
    
    var `skein1024-184`: js.typedarray.Uint8Array
    
    var `skein1024-192`: js.typedarray.Uint8Array
    
    var `skein1024-200`: js.typedarray.Uint8Array
    
    var `skein1024-208`: js.typedarray.Uint8Array
    
    var `skein1024-216`: js.typedarray.Uint8Array
    
    var `skein1024-224`: js.typedarray.Uint8Array
    
    var `skein1024-232`: js.typedarray.Uint8Array
    
    var `skein1024-24`: js.typedarray.Uint8Array
    
    var `skein1024-240`: js.typedarray.Uint8Array
    
    var `skein1024-248`: js.typedarray.Uint8Array
    
    var `skein1024-256`: js.typedarray.Uint8Array
    
    var `skein1024-264`: js.typedarray.Uint8Array
    
    var `skein1024-272`: js.typedarray.Uint8Array
    
    var `skein1024-280`: js.typedarray.Uint8Array
    
    var `skein1024-288`: js.typedarray.Uint8Array
    
    var `skein1024-296`: js.typedarray.Uint8Array
    
    var `skein1024-304`: js.typedarray.Uint8Array
    
    var `skein1024-312`: js.typedarray.Uint8Array
    
    var `skein1024-32`: js.typedarray.Uint8Array
    
    var `skein1024-320`: js.typedarray.Uint8Array
    
    var `skein1024-328`: js.typedarray.Uint8Array
    
    var `skein1024-336`: js.typedarray.Uint8Array
    
    var `skein1024-344`: js.typedarray.Uint8Array
    
    var `skein1024-352`: js.typedarray.Uint8Array
    
    var `skein1024-360`: js.typedarray.Uint8Array
    
    var `skein1024-368`: js.typedarray.Uint8Array
    
    var `skein1024-376`: js.typedarray.Uint8Array
    
    var `skein1024-384`: js.typedarray.Uint8Array
    
    var `skein1024-392`: js.typedarray.Uint8Array
    
    var `skein1024-40`: js.typedarray.Uint8Array
    
    var `skein1024-400`: js.typedarray.Uint8Array
    
    var `skein1024-408`: js.typedarray.Uint8Array
    
    var `skein1024-416`: js.typedarray.Uint8Array
    
    var `skein1024-424`: js.typedarray.Uint8Array
    
    var `skein1024-432`: js.typedarray.Uint8Array
    
    var `skein1024-440`: js.typedarray.Uint8Array
    
    var `skein1024-448`: js.typedarray.Uint8Array
    
    var `skein1024-456`: js.typedarray.Uint8Array
    
    var `skein1024-464`: js.typedarray.Uint8Array
    
    var `skein1024-472`: js.typedarray.Uint8Array
    
    var `skein1024-48`: js.typedarray.Uint8Array
    
    var `skein1024-480`: js.typedarray.Uint8Array
    
    var `skein1024-488`: js.typedarray.Uint8Array
    
    var `skein1024-496`: js.typedarray.Uint8Array
    
    var `skein1024-504`: js.typedarray.Uint8Array
    
    var `skein1024-512`: js.typedarray.Uint8Array
    
    var `skein1024-520`: js.typedarray.Uint8Array
    
    var `skein1024-528`: js.typedarray.Uint8Array
    
    var `skein1024-536`: js.typedarray.Uint8Array
    
    var `skein1024-544`: js.typedarray.Uint8Array
    
    var `skein1024-552`: js.typedarray.Uint8Array
    
    var `skein1024-56`: js.typedarray.Uint8Array
    
    var `skein1024-560`: js.typedarray.Uint8Array
    
    var `skein1024-568`: js.typedarray.Uint8Array
    
    var `skein1024-576`: js.typedarray.Uint8Array
    
    var `skein1024-584`: js.typedarray.Uint8Array
    
    var `skein1024-592`: js.typedarray.Uint8Array
    
    var `skein1024-600`: js.typedarray.Uint8Array
    
    var `skein1024-608`: js.typedarray.Uint8Array
    
    var `skein1024-616`: js.typedarray.Uint8Array
    
    var `skein1024-624`: js.typedarray.Uint8Array
    
    var `skein1024-632`: js.typedarray.Uint8Array
    
    var `skein1024-64`: js.typedarray.Uint8Array
    
    var `skein1024-640`: js.typedarray.Uint8Array
    
    var `skein1024-648`: js.typedarray.Uint8Array
    
    var `skein1024-656`: js.typedarray.Uint8Array
    
    var `skein1024-664`: js.typedarray.Uint8Array
    
    var `skein1024-672`: js.typedarray.Uint8Array
    
    var `skein1024-680`: js.typedarray.Uint8Array
    
    var `skein1024-688`: js.typedarray.Uint8Array
    
    var `skein1024-696`: js.typedarray.Uint8Array
    
    var `skein1024-704`: js.typedarray.Uint8Array
    
    var `skein1024-712`: js.typedarray.Uint8Array
    
    var `skein1024-72`: js.typedarray.Uint8Array
    
    var `skein1024-720`: js.typedarray.Uint8Array
    
    var `skein1024-728`: js.typedarray.Uint8Array
    
    var `skein1024-736`: js.typedarray.Uint8Array
    
    var `skein1024-744`: js.typedarray.Uint8Array
    
    var `skein1024-752`: js.typedarray.Uint8Array
    
    var `skein1024-760`: js.typedarray.Uint8Array
    
    var `skein1024-768`: js.typedarray.Uint8Array
    
    var `skein1024-776`: js.typedarray.Uint8Array
    
    var `skein1024-784`: js.typedarray.Uint8Array
    
    var `skein1024-792`: js.typedarray.Uint8Array
    
    var `skein1024-8`: js.typedarray.Uint8Array
    
    var `skein1024-80`: js.typedarray.Uint8Array
    
    var `skein1024-800`: js.typedarray.Uint8Array
    
    var `skein1024-808`: js.typedarray.Uint8Array
    
    var `skein1024-816`: js.typedarray.Uint8Array
    
    var `skein1024-824`: js.typedarray.Uint8Array
    
    var `skein1024-832`: js.typedarray.Uint8Array
    
    var `skein1024-840`: js.typedarray.Uint8Array
    
    var `skein1024-848`: js.typedarray.Uint8Array
    
    var `skein1024-856`: js.typedarray.Uint8Array
    
    var `skein1024-864`: js.typedarray.Uint8Array
    
    var `skein1024-872`: js.typedarray.Uint8Array
    
    var `skein1024-88`: js.typedarray.Uint8Array
    
    var `skein1024-880`: js.typedarray.Uint8Array
    
    var `skein1024-888`: js.typedarray.Uint8Array
    
    var `skein1024-896`: js.typedarray.Uint8Array
    
    var `skein1024-904`: js.typedarray.Uint8Array
    
    var `skein1024-912`: js.typedarray.Uint8Array
    
    var `skein1024-920`: js.typedarray.Uint8Array
    
    var `skein1024-928`: js.typedarray.Uint8Array
    
    var `skein1024-936`: js.typedarray.Uint8Array
    
    var `skein1024-944`: js.typedarray.Uint8Array
    
    var `skein1024-952`: js.typedarray.Uint8Array
    
    var `skein1024-96`: js.typedarray.Uint8Array
    
    var `skein1024-960`: js.typedarray.Uint8Array
    
    var `skein1024-968`: js.typedarray.Uint8Array
    
    var `skein1024-976`: js.typedarray.Uint8Array
    
    var `skein1024-984`: js.typedarray.Uint8Array
    
    var `skein1024-992`: js.typedarray.Uint8Array
    
    var `skein256-104`: js.typedarray.Uint8Array
    
    var `skein256-112`: js.typedarray.Uint8Array
    
    var `skein256-120`: js.typedarray.Uint8Array
    
    var `skein256-128`: js.typedarray.Uint8Array
    
    var `skein256-136`: js.typedarray.Uint8Array
    
    var `skein256-144`: js.typedarray.Uint8Array
    
    var `skein256-152`: js.typedarray.Uint8Array
    
    var `skein256-16`: js.typedarray.Uint8Array
    
    var `skein256-160`: js.typedarray.Uint8Array
    
    var `skein256-168`: js.typedarray.Uint8Array
    
    var `skein256-176`: js.typedarray.Uint8Array
    
    var `skein256-184`: js.typedarray.Uint8Array
    
    var `skein256-192`: js.typedarray.Uint8Array
    
    var `skein256-200`: js.typedarray.Uint8Array
    
    var `skein256-208`: js.typedarray.Uint8Array
    
    var `skein256-216`: js.typedarray.Uint8Array
    
    var `skein256-224`: js.typedarray.Uint8Array
    
    var `skein256-232`: js.typedarray.Uint8Array
    
    var `skein256-24`: js.typedarray.Uint8Array
    
    var `skein256-240`: js.typedarray.Uint8Array
    
    var `skein256-248`: js.typedarray.Uint8Array
    
    var `skein256-256`: js.typedarray.Uint8Array
    
    var `skein256-32`: js.typedarray.Uint8Array
    
    var `skein256-40`: js.typedarray.Uint8Array
    
    var `skein256-48`: js.typedarray.Uint8Array
    
    var `skein256-56`: js.typedarray.Uint8Array
    
    var `skein256-64`: js.typedarray.Uint8Array
    
    var `skein256-72`: js.typedarray.Uint8Array
    
    var `skein256-8`: js.typedarray.Uint8Array
    
    var `skein256-80`: js.typedarray.Uint8Array
    
    var `skein256-88`: js.typedarray.Uint8Array
    
    var `skein256-96`: js.typedarray.Uint8Array
    
    var `skein512-104`: js.typedarray.Uint8Array
    
    var `skein512-112`: js.typedarray.Uint8Array
    
    var `skein512-120`: js.typedarray.Uint8Array
    
    var `skein512-128`: js.typedarray.Uint8Array
    
    var `skein512-136`: js.typedarray.Uint8Array
    
    var `skein512-144`: js.typedarray.Uint8Array
    
    var `skein512-152`: js.typedarray.Uint8Array
    
    var `skein512-16`: js.typedarray.Uint8Array
    
    var `skein512-160`: js.typedarray.Uint8Array
    
    var `skein512-168`: js.typedarray.Uint8Array
    
    var `skein512-176`: js.typedarray.Uint8Array
    
    var `skein512-184`: js.typedarray.Uint8Array
    
    var `skein512-192`: js.typedarray.Uint8Array
    
    var `skein512-200`: js.typedarray.Uint8Array
    
    var `skein512-208`: js.typedarray.Uint8Array
    
    var `skein512-216`: js.typedarray.Uint8Array
    
    var `skein512-224`: js.typedarray.Uint8Array
    
    var `skein512-232`: js.typedarray.Uint8Array
    
    var `skein512-24`: js.typedarray.Uint8Array
    
    var `skein512-240`: js.typedarray.Uint8Array
    
    var `skein512-248`: js.typedarray.Uint8Array
    
    var `skein512-256`: js.typedarray.Uint8Array
    
    var `skein512-264`: js.typedarray.Uint8Array
    
    var `skein512-272`: js.typedarray.Uint8Array
    
    var `skein512-280`: js.typedarray.Uint8Array
    
    var `skein512-288`: js.typedarray.Uint8Array
    
    var `skein512-296`: js.typedarray.Uint8Array
    
    var `skein512-304`: js.typedarray.Uint8Array
    
    var `skein512-312`: js.typedarray.Uint8Array
    
    var `skein512-32`: js.typedarray.Uint8Array
    
    var `skein512-320`: js.typedarray.Uint8Array
    
    var `skein512-328`: js.typedarray.Uint8Array
    
    var `skein512-336`: js.typedarray.Uint8Array
    
    var `skein512-344`: js.typedarray.Uint8Array
    
    var `skein512-352`: js.typedarray.Uint8Array
    
    var `skein512-360`: js.typedarray.Uint8Array
    
    var `skein512-368`: js.typedarray.Uint8Array
    
    var `skein512-376`: js.typedarray.Uint8Array
    
    var `skein512-384`: js.typedarray.Uint8Array
    
    var `skein512-392`: js.typedarray.Uint8Array
    
    var `skein512-40`: js.typedarray.Uint8Array
    
    var `skein512-400`: js.typedarray.Uint8Array
    
    var `skein512-408`: js.typedarray.Uint8Array
    
    var `skein512-416`: js.typedarray.Uint8Array
    
    var `skein512-424`: js.typedarray.Uint8Array
    
    var `skein512-432`: js.typedarray.Uint8Array
    
    var `skein512-440`: js.typedarray.Uint8Array
    
    var `skein512-448`: js.typedarray.Uint8Array
    
    var `skein512-456`: js.typedarray.Uint8Array
    
    var `skein512-464`: js.typedarray.Uint8Array
    
    var `skein512-472`: js.typedarray.Uint8Array
    
    var `skein512-48`: js.typedarray.Uint8Array
    
    var `skein512-480`: js.typedarray.Uint8Array
    
    var `skein512-488`: js.typedarray.Uint8Array
    
    var `skein512-496`: js.typedarray.Uint8Array
    
    var `skein512-504`: js.typedarray.Uint8Array
    
    var `skein512-512`: js.typedarray.Uint8Array
    
    var `skein512-56`: js.typedarray.Uint8Array
    
    var `skein512-64`: js.typedarray.Uint8Array
    
    var `skein512-72`: js.typedarray.Uint8Array
    
    var `skein512-8`: js.typedarray.Uint8Array
    
    var `skein512-80`: js.typedarray.Uint8Array
    
    var `skein512-88`: js.typedarray.Uint8Array
    
    var `skein512-96`: js.typedarray.Uint8Array
    
    var `skynet-ns`: js.typedarray.Uint8Array
    
    var `sm3-256`: js.typedarray.Uint8Array
    
    var `stellar-block`: js.typedarray.Uint8Array
    
    var `stellar-tx`: js.typedarray.Uint8Array
    
    var streamid: js.typedarray.Uint8Array
    
    var `swarm-feed`: js.typedarray.Uint8Array
    
    var `swarm-manifest`: js.typedarray.Uint8Array
    
    var `swarm-ns`: js.typedarray.Uint8Array
    
    var `swhid-1-snp`: js.typedarray.Uint8Array
    
    var tcp: js.typedarray.Uint8Array
    
    var thread: js.typedarray.Uint8Array
    
    var tls: js.typedarray.Uint8Array
    
    var `torrent-file`: js.typedarray.Uint8Array
    
    var `torrent-info`: js.typedarray.Uint8Array
    
    var udp: js.typedarray.Uint8Array
    
    var udt: js.typedarray.Uint8Array
    
    var unix: js.typedarray.Uint8Array
    
    var utp: js.typedarray.Uint8Array
    
    var ws: js.typedarray.Uint8Array
    
    var wss: js.typedarray.Uint8Array
    
    var x11: js.typedarray.Uint8Array
    
    var `x25519-priv`: js.typedarray.Uint8Array
    
    var `x25519-pub`: js.typedarray.Uint8Array
    
    var `x448-pub`: js.typedarray.Uint8Array
    
    var `zcash-block`: js.typedarray.Uint8Array
    
    var `zcash-tx`: js.typedarray.Uint8Array
    
    var zeronet: js.typedarray.Uint8Array
    
    var `zeroxcert-imprint-256`: js.typedarray.Uint8Array
  }
  object NameUint8ArrayMap {
    
    inline def apply(
      `arweave-ns`: js.typedarray.Uint8Array,
      bencode: js.typedarray.Uint8Array,
      `bitcoin-block`: js.typedarray.Uint8Array,
      `bitcoin-tx`: js.typedarray.Uint8Array,
      `bitcoin-witness-commitment`: js.typedarray.Uint8Array,
      `blake2b-104`: js.typedarray.Uint8Array,
      `blake2b-112`: js.typedarray.Uint8Array,
      `blake2b-120`: js.typedarray.Uint8Array,
      `blake2b-128`: js.typedarray.Uint8Array,
      `blake2b-136`: js.typedarray.Uint8Array,
      `blake2b-144`: js.typedarray.Uint8Array,
      `blake2b-152`: js.typedarray.Uint8Array,
      `blake2b-16`: js.typedarray.Uint8Array,
      `blake2b-160`: js.typedarray.Uint8Array,
      `blake2b-168`: js.typedarray.Uint8Array,
      `blake2b-176`: js.typedarray.Uint8Array,
      `blake2b-184`: js.typedarray.Uint8Array,
      `blake2b-192`: js.typedarray.Uint8Array,
      `blake2b-200`: js.typedarray.Uint8Array,
      `blake2b-208`: js.typedarray.Uint8Array,
      `blake2b-216`: js.typedarray.Uint8Array,
      `blake2b-224`: js.typedarray.Uint8Array,
      `blake2b-232`: js.typedarray.Uint8Array,
      `blake2b-24`: js.typedarray.Uint8Array,
      `blake2b-240`: js.typedarray.Uint8Array,
      `blake2b-248`: js.typedarray.Uint8Array,
      `blake2b-256`: js.typedarray.Uint8Array,
      `blake2b-264`: js.typedarray.Uint8Array,
      `blake2b-272`: js.typedarray.Uint8Array,
      `blake2b-280`: js.typedarray.Uint8Array,
      `blake2b-288`: js.typedarray.Uint8Array,
      `blake2b-296`: js.typedarray.Uint8Array,
      `blake2b-304`: js.typedarray.Uint8Array,
      `blake2b-312`: js.typedarray.Uint8Array,
      `blake2b-32`: js.typedarray.Uint8Array,
      `blake2b-320`: js.typedarray.Uint8Array,
      `blake2b-328`: js.typedarray.Uint8Array,
      `blake2b-336`: js.typedarray.Uint8Array,
      `blake2b-344`: js.typedarray.Uint8Array,
      `blake2b-352`: js.typedarray.Uint8Array,
      `blake2b-360`: js.typedarray.Uint8Array,
      `blake2b-368`: js.typedarray.Uint8Array,
      `blake2b-376`: js.typedarray.Uint8Array,
      `blake2b-384`: js.typedarray.Uint8Array,
      `blake2b-392`: js.typedarray.Uint8Array,
      `blake2b-40`: js.typedarray.Uint8Array,
      `blake2b-400`: js.typedarray.Uint8Array,
      `blake2b-408`: js.typedarray.Uint8Array,
      `blake2b-416`: js.typedarray.Uint8Array,
      `blake2b-424`: js.typedarray.Uint8Array,
      `blake2b-432`: js.typedarray.Uint8Array,
      `blake2b-440`: js.typedarray.Uint8Array,
      `blake2b-448`: js.typedarray.Uint8Array,
      `blake2b-456`: js.typedarray.Uint8Array,
      `blake2b-464`: js.typedarray.Uint8Array,
      `blake2b-472`: js.typedarray.Uint8Array,
      `blake2b-48`: js.typedarray.Uint8Array,
      `blake2b-480`: js.typedarray.Uint8Array,
      `blake2b-488`: js.typedarray.Uint8Array,
      `blake2b-496`: js.typedarray.Uint8Array,
      `blake2b-504`: js.typedarray.Uint8Array,
      `blake2b-512`: js.typedarray.Uint8Array,
      `blake2b-56`: js.typedarray.Uint8Array,
      `blake2b-64`: js.typedarray.Uint8Array,
      `blake2b-72`: js.typedarray.Uint8Array,
      `blake2b-8`: js.typedarray.Uint8Array,
      `blake2b-80`: js.typedarray.Uint8Array,
      `blake2b-88`: js.typedarray.Uint8Array,
      `blake2b-96`: js.typedarray.Uint8Array,
      `blake2s-104`: js.typedarray.Uint8Array,
      `blake2s-112`: js.typedarray.Uint8Array,
      `blake2s-120`: js.typedarray.Uint8Array,
      `blake2s-128`: js.typedarray.Uint8Array,
      `blake2s-136`: js.typedarray.Uint8Array,
      `blake2s-144`: js.typedarray.Uint8Array,
      `blake2s-152`: js.typedarray.Uint8Array,
      `blake2s-16`: js.typedarray.Uint8Array,
      `blake2s-160`: js.typedarray.Uint8Array,
      `blake2s-168`: js.typedarray.Uint8Array,
      `blake2s-176`: js.typedarray.Uint8Array,
      `blake2s-184`: js.typedarray.Uint8Array,
      `blake2s-192`: js.typedarray.Uint8Array,
      `blake2s-200`: js.typedarray.Uint8Array,
      `blake2s-208`: js.typedarray.Uint8Array,
      `blake2s-216`: js.typedarray.Uint8Array,
      `blake2s-224`: js.typedarray.Uint8Array,
      `blake2s-232`: js.typedarray.Uint8Array,
      `blake2s-24`: js.typedarray.Uint8Array,
      `blake2s-240`: js.typedarray.Uint8Array,
      `blake2s-248`: js.typedarray.Uint8Array,
      `blake2s-256`: js.typedarray.Uint8Array,
      `blake2s-32`: js.typedarray.Uint8Array,
      `blake2s-40`: js.typedarray.Uint8Array,
      `blake2s-48`: js.typedarray.Uint8Array,
      `blake2s-56`: js.typedarray.Uint8Array,
      `blake2s-64`: js.typedarray.Uint8Array,
      `blake2s-72`: js.typedarray.Uint8Array,
      `blake2s-8`: js.typedarray.Uint8Array,
      `blake2s-80`: js.typedarray.Uint8Array,
      `blake2s-88`: js.typedarray.Uint8Array,
      `blake2s-96`: js.typedarray.Uint8Array,
      blake3: js.typedarray.Uint8Array,
      `bls12_381-g1-pub`: js.typedarray.Uint8Array,
      `bls12_381-g1g2-pub`: js.typedarray.Uint8Array,
      `bls12_381-g2-pub`: js.typedarray.Uint8Array,
      bmt: js.typedarray.Uint8Array,
      `caip-50`: js.typedarray.Uint8Array,
      `car-index-sorted`: js.typedarray.Uint8Array,
      cbor: js.typedarray.Uint8Array,
      cidv1: js.typedarray.Uint8Array,
      cidv2: js.typedarray.Uint8Array,
      cidv3: js.typedarray.Uint8Array,
      `dag-cbor`: js.typedarray.Uint8Array,
      `dag-cose`: js.typedarray.Uint8Array,
      `dag-jose`: js.typedarray.Uint8Array,
      `dag-json`: js.typedarray.Uint8Array,
      `dag-pb`: js.typedarray.Uint8Array,
      `dash-block`: js.typedarray.Uint8Array,
      `dash-tx`: js.typedarray.Uint8Array,
      `dbl-sha2-256`: js.typedarray.Uint8Array,
      dccp: js.typedarray.Uint8Array,
      `decred-block`: js.typedarray.Uint8Array,
      `decred-tx`: js.typedarray.Uint8Array,
      dns: js.typedarray.Uint8Array,
      dns4: js.typedarray.Uint8Array,
      dns6: js.typedarray.Uint8Array,
      dnsaddr: js.typedarray.Uint8Array,
      `ed25519-priv`: js.typedarray.Uint8Array,
      `ed25519-pub`: js.typedarray.Uint8Array,
      `ed448-pub`: js.typedarray.Uint8Array,
      `eth-account-snapshot`: js.typedarray.Uint8Array,
      `eth-block`: js.typedarray.Uint8Array,
      `eth-block-list`: js.typedarray.Uint8Array,
      `eth-receipt-log-trie`: js.typedarray.Uint8Array,
      `eth-reciept-log`: js.typedarray.Uint8Array,
      `eth-state-trie`: js.typedarray.Uint8Array,
      `eth-storage-trie`: js.typedarray.Uint8Array,
      `eth-tx`: js.typedarray.Uint8Array,
      `eth-tx-receipt`: js.typedarray.Uint8Array,
      `eth-tx-receipt-trie`: js.typedarray.Uint8Array,
      `eth-tx-trie`: js.typedarray.Uint8Array,
      `fil-commitment-sealed`: js.typedarray.Uint8Array,
      `fil-commitment-unsealed`: js.typedarray.Uint8Array,
      garlic32: js.typedarray.Uint8Array,
      garlic64: js.typedarray.Uint8Array,
      `git-raw`: js.typedarray.Uint8Array,
      `holochain-adr-v0`: js.typedarray.Uint8Array,
      `holochain-adr-v1`: js.typedarray.Uint8Array,
      `holochain-key-v0`: js.typedarray.Uint8Array,
      `holochain-key-v1`: js.typedarray.Uint8Array,
      `holochain-sig-v0`: js.typedarray.Uint8Array,
      `holochain-sig-v1`: js.typedarray.Uint8Array,
      http: js.typedarray.Uint8Array,
      https: js.typedarray.Uint8Array,
      identity: js.typedarray.Uint8Array,
      ip4: js.typedarray.Uint8Array,
      ip6: js.typedarray.Uint8Array,
      ip6zone: js.typedarray.Uint8Array,
      ipfs: js.typedarray.Uint8Array,
      `ipfs-ns`: js.typedarray.Uint8Array,
      `ipld-ns`: js.typedarray.Uint8Array,
      `ipns-ns`: js.typedarray.Uint8Array,
      json: js.typedarray.Uint8Array,
      kangarootwelve: js.typedarray.Uint8Array,
      `keccak-224`: js.typedarray.Uint8Array,
      `keccak-256`: js.typedarray.Uint8Array,
      `keccak-384`: js.typedarray.Uint8Array,
      `keccak-512`: js.typedarray.Uint8Array,
      `leofcoin-block`: js.typedarray.Uint8Array,
      `leofcoin-pr`: js.typedarray.Uint8Array,
      `leofcoin-tx`: js.typedarray.Uint8Array,
      `libp2p-key`: js.typedarray.Uint8Array,
      `libp2p-peer-record`: js.typedarray.Uint8Array,
      `libp2p-relay-rsvp`: js.typedarray.Uint8Array,
      md4: js.typedarray.Uint8Array,
      md5: js.typedarray.Uint8Array,
      messagepack: js.typedarray.Uint8Array,
      multiaddr: js.typedarray.Uint8Array,
      multibase: js.typedarray.Uint8Array,
      multicodec: js.typedarray.Uint8Array,
      multihash: js.typedarray.Uint8Array,
      `murmur3-128`: js.typedarray.Uint8Array,
      `murmur3-32`: js.typedarray.Uint8Array,
      noise: js.typedarray.Uint8Array,
      onion: js.typedarray.Uint8Array,
      onion3: js.typedarray.Uint8Array,
      `p256-pub`: js.typedarray.Uint8Array,
      p2p: js.typedarray.Uint8Array,
      `p2p-circuit`: js.typedarray.Uint8Array,
      `p2p-stardust`: js.typedarray.Uint8Array,
      `p2p-webrtc-direct`: js.typedarray.Uint8Array,
      `p2p-webrtc-star`: js.typedarray.Uint8Array,
      `p2p-websocket-star`: js.typedarray.Uint8Array,
      `p384-pub`: js.typedarray.Uint8Array,
      `p521-pub`: js.typedarray.Uint8Array,
      path: js.typedarray.Uint8Array,
      `poseidon-bls12_381-a2-fc1`: js.typedarray.Uint8Array,
      `poseidon-bls12_381-a2-fc1-sc`: js.typedarray.Uint8Array,
      protobuf: js.typedarray.Uint8Array,
      quic: js.typedarray.Uint8Array,
      raw: js.typedarray.Uint8Array,
      `ripemd-128`: js.typedarray.Uint8Array,
      `ripemd-160`: js.typedarray.Uint8Array,
      `ripemd-256`: js.typedarray.Uint8Array,
      `ripemd-320`: js.typedarray.Uint8Array,
      rlp: js.typedarray.Uint8Array,
      sctp: js.typedarray.Uint8Array,
      `secp256k1-priv`: js.typedarray.Uint8Array,
      `secp256k1-pub`: js.typedarray.Uint8Array,
      sha1: js.typedarray.Uint8Array,
      `sha2-256`: js.typedarray.Uint8Array,
      `sha2-256-trunc254-padded`: js.typedarray.Uint8Array,
      `sha2-512`: js.typedarray.Uint8Array,
      `sha3-224`: js.typedarray.Uint8Array,
      `sha3-256`: js.typedarray.Uint8Array,
      `sha3-384`: js.typedarray.Uint8Array,
      `sha3-512`: js.typedarray.Uint8Array,
      `shake-128`: js.typedarray.Uint8Array,
      `shake-256`: js.typedarray.Uint8Array,
      `skein1024-1000`: js.typedarray.Uint8Array,
      `skein1024-1008`: js.typedarray.Uint8Array,
      `skein1024-1016`: js.typedarray.Uint8Array,
      `skein1024-1024`: js.typedarray.Uint8Array,
      `skein1024-104`: js.typedarray.Uint8Array,
      `skein1024-112`: js.typedarray.Uint8Array,
      `skein1024-120`: js.typedarray.Uint8Array,
      `skein1024-128`: js.typedarray.Uint8Array,
      `skein1024-136`: js.typedarray.Uint8Array,
      `skein1024-144`: js.typedarray.Uint8Array,
      `skein1024-152`: js.typedarray.Uint8Array,
      `skein1024-16`: js.typedarray.Uint8Array,
      `skein1024-160`: js.typedarray.Uint8Array,
      `skein1024-168`: js.typedarray.Uint8Array,
      `skein1024-176`: js.typedarray.Uint8Array,
      `skein1024-184`: js.typedarray.Uint8Array,
      `skein1024-192`: js.typedarray.Uint8Array,
      `skein1024-200`: js.typedarray.Uint8Array,
      `skein1024-208`: js.typedarray.Uint8Array,
      `skein1024-216`: js.typedarray.Uint8Array,
      `skein1024-224`: js.typedarray.Uint8Array,
      `skein1024-232`: js.typedarray.Uint8Array,
      `skein1024-24`: js.typedarray.Uint8Array,
      `skein1024-240`: js.typedarray.Uint8Array,
      `skein1024-248`: js.typedarray.Uint8Array,
      `skein1024-256`: js.typedarray.Uint8Array,
      `skein1024-264`: js.typedarray.Uint8Array,
      `skein1024-272`: js.typedarray.Uint8Array,
      `skein1024-280`: js.typedarray.Uint8Array,
      `skein1024-288`: js.typedarray.Uint8Array,
      `skein1024-296`: js.typedarray.Uint8Array,
      `skein1024-304`: js.typedarray.Uint8Array,
      `skein1024-312`: js.typedarray.Uint8Array,
      `skein1024-32`: js.typedarray.Uint8Array,
      `skein1024-320`: js.typedarray.Uint8Array
    ): NameUint8ArrayMap = {
      val __obj = js.Dynamic.literal(bencode = bencode.asInstanceOf[js.Any], blake3 = blake3.asInstanceOf[js.Any], bmt = bmt.asInstanceOf[js.Any], cbor = cbor.asInstanceOf[js.Any], cidv1 = cidv1.asInstanceOf[js.Any], cidv2 = cidv2.asInstanceOf[js.Any], cidv3 = cidv3.asInstanceOf[js.Any], dccp = dccp.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], dns4 = dns4.asInstanceOf[js.Any], dns6 = dns6.asInstanceOf[js.Any], dnsaddr = dnsaddr.asInstanceOf[js.Any], garlic32 = garlic32.asInstanceOf[js.Any], garlic64 = garlic64.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], ip4 = ip4.asInstanceOf[js.Any], ip6 = ip6.asInstanceOf[js.Any], ip6zone = ip6zone.asInstanceOf[js.Any], ipfs = ipfs.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], kangarootwelve = kangarootwelve.asInstanceOf[js.Any], md4 = md4.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], messagepack = messagepack.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multibase = multibase.asInstanceOf[js.Any], multicodec = multicodec.asInstanceOf[js.Any], multihash = multihash.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], onion = onion.asInstanceOf[js.Any], onion3 = onion3.asInstanceOf[js.Any], p2p = p2p.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protobuf = protobuf.asInstanceOf[js.Any], quic = quic.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rlp = rlp.asInstanceOf[js.Any], sctp = sctp.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
      __obj.updateDynamic("arweave-ns")(`arweave-ns`.asInstanceOf[js.Any])
      __obj.updateDynamic("bitcoin-block")(`bitcoin-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("bitcoin-tx")(`bitcoin-tx`.asInstanceOf[js.Any])
      __obj.updateDynamic("bitcoin-witness-commitment")(`bitcoin-witness-commitment`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-104")(`blake2b-104`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-112")(`blake2b-112`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-120")(`blake2b-120`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-128")(`blake2b-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-136")(`blake2b-136`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-144")(`blake2b-144`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-152")(`blake2b-152`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-16")(`blake2b-16`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-160")(`blake2b-160`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-168")(`blake2b-168`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-176")(`blake2b-176`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-184")(`blake2b-184`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-192")(`blake2b-192`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-200")(`blake2b-200`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-208")(`blake2b-208`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-216")(`blake2b-216`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-224")(`blake2b-224`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-232")(`blake2b-232`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-24")(`blake2b-24`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-240")(`blake2b-240`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-248")(`blake2b-248`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-256")(`blake2b-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-264")(`blake2b-264`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-272")(`blake2b-272`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-280")(`blake2b-280`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-288")(`blake2b-288`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-296")(`blake2b-296`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-304")(`blake2b-304`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-312")(`blake2b-312`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-32")(`blake2b-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-320")(`blake2b-320`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-328")(`blake2b-328`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-336")(`blake2b-336`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-344")(`blake2b-344`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-352")(`blake2b-352`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-360")(`blake2b-360`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-368")(`blake2b-368`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-376")(`blake2b-376`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-384")(`blake2b-384`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-392")(`blake2b-392`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-40")(`blake2b-40`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-400")(`blake2b-400`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-408")(`blake2b-408`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-416")(`blake2b-416`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-424")(`blake2b-424`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-432")(`blake2b-432`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-440")(`blake2b-440`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-448")(`blake2b-448`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-456")(`blake2b-456`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-464")(`blake2b-464`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-472")(`blake2b-472`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-48")(`blake2b-48`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-480")(`blake2b-480`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-488")(`blake2b-488`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-496")(`blake2b-496`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-504")(`blake2b-504`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-512")(`blake2b-512`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-56")(`blake2b-56`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-64")(`blake2b-64`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-72")(`blake2b-72`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-8")(`blake2b-8`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-80")(`blake2b-80`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-88")(`blake2b-88`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2b-96")(`blake2b-96`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-104")(`blake2s-104`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-112")(`blake2s-112`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-120")(`blake2s-120`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-128")(`blake2s-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-136")(`blake2s-136`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-144")(`blake2s-144`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-152")(`blake2s-152`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-16")(`blake2s-16`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-160")(`blake2s-160`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-168")(`blake2s-168`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-176")(`blake2s-176`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-184")(`blake2s-184`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-192")(`blake2s-192`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-200")(`blake2s-200`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-208")(`blake2s-208`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-216")(`blake2s-216`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-224")(`blake2s-224`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-232")(`blake2s-232`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-24")(`blake2s-24`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-240")(`blake2s-240`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-248")(`blake2s-248`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-256")(`blake2s-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-32")(`blake2s-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-40")(`blake2s-40`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-48")(`blake2s-48`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-56")(`blake2s-56`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-64")(`blake2s-64`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-72")(`blake2s-72`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-8")(`blake2s-8`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-80")(`blake2s-80`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-88")(`blake2s-88`.asInstanceOf[js.Any])
      __obj.updateDynamic("blake2s-96")(`blake2s-96`.asInstanceOf[js.Any])
      __obj.updateDynamic("bls12_381-g1-pub")(`bls12_381-g1-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("bls12_381-g1g2-pub")(`bls12_381-g1g2-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("bls12_381-g2-pub")(`bls12_381-g2-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("caip-50")(`caip-50`.asInstanceOf[js.Any])
      __obj.updateDynamic("car-index-sorted")(`car-index-sorted`.asInstanceOf[js.Any])
      __obj.updateDynamic("dag-cbor")(`dag-cbor`.asInstanceOf[js.Any])
      __obj.updateDynamic("dag-cose")(`dag-cose`.asInstanceOf[js.Any])
      __obj.updateDynamic("dag-jose")(`dag-jose`.asInstanceOf[js.Any])
      __obj.updateDynamic("dag-json")(`dag-json`.asInstanceOf[js.Any])
      __obj.updateDynamic("dag-pb")(`dag-pb`.asInstanceOf[js.Any])
      __obj.updateDynamic("dash-block")(`dash-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("dash-tx")(`dash-tx`.asInstanceOf[js.Any])
      __obj.updateDynamic("dbl-sha2-256")(`dbl-sha2-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("decred-block")(`decred-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("decred-tx")(`decred-tx`.asInstanceOf[js.Any])
      __obj.updateDynamic("ed25519-priv")(`ed25519-priv`.asInstanceOf[js.Any])
      __obj.updateDynamic("ed25519-pub")(`ed25519-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("ed448-pub")(`ed448-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-account-snapshot")(`eth-account-snapshot`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-block")(`eth-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-block-list")(`eth-block-list`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-receipt-log-trie")(`eth-receipt-log-trie`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-reciept-log")(`eth-reciept-log`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-state-trie")(`eth-state-trie`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-storage-trie")(`eth-storage-trie`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-tx")(`eth-tx`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-tx-receipt")(`eth-tx-receipt`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-tx-receipt-trie")(`eth-tx-receipt-trie`.asInstanceOf[js.Any])
      __obj.updateDynamic("eth-tx-trie")(`eth-tx-trie`.asInstanceOf[js.Any])
      __obj.updateDynamic("fil-commitment-sealed")(`fil-commitment-sealed`.asInstanceOf[js.Any])
      __obj.updateDynamic("fil-commitment-unsealed")(`fil-commitment-unsealed`.asInstanceOf[js.Any])
      __obj.updateDynamic("git-raw")(`git-raw`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-adr-v0")(`holochain-adr-v0`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-adr-v1")(`holochain-adr-v1`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-key-v0")(`holochain-key-v0`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-key-v1")(`holochain-key-v1`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-sig-v0")(`holochain-sig-v0`.asInstanceOf[js.Any])
      __obj.updateDynamic("holochain-sig-v1")(`holochain-sig-v1`.asInstanceOf[js.Any])
      __obj.updateDynamic("ipfs-ns")(`ipfs-ns`.asInstanceOf[js.Any])
      __obj.updateDynamic("ipld-ns")(`ipld-ns`.asInstanceOf[js.Any])
      __obj.updateDynamic("ipns-ns")(`ipns-ns`.asInstanceOf[js.Any])
      __obj.updateDynamic("keccak-224")(`keccak-224`.asInstanceOf[js.Any])
      __obj.updateDynamic("keccak-256")(`keccak-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("keccak-384")(`keccak-384`.asInstanceOf[js.Any])
      __obj.updateDynamic("keccak-512")(`keccak-512`.asInstanceOf[js.Any])
      __obj.updateDynamic("leofcoin-block")(`leofcoin-block`.asInstanceOf[js.Any])
      __obj.updateDynamic("leofcoin-pr")(`leofcoin-pr`.asInstanceOf[js.Any])
      __obj.updateDynamic("leofcoin-tx")(`leofcoin-tx`.asInstanceOf[js.Any])
      __obj.updateDynamic("libp2p-key")(`libp2p-key`.asInstanceOf[js.Any])
      __obj.updateDynamic("libp2p-peer-record")(`libp2p-peer-record`.asInstanceOf[js.Any])
      __obj.updateDynamic("libp2p-relay-rsvp")(`libp2p-relay-rsvp`.asInstanceOf[js.Any])
      __obj.updateDynamic("murmur3-128")(`murmur3-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("murmur3-32")(`murmur3-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("p256-pub")(`p256-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("p2p-circuit")(`p2p-circuit`.asInstanceOf[js.Any])
      __obj.updateDynamic("p2p-stardust")(`p2p-stardust`.asInstanceOf[js.Any])
      __obj.updateDynamic("p2p-webrtc-direct")(`p2p-webrtc-direct`.asInstanceOf[js.Any])
      __obj.updateDynamic("p2p-webrtc-star")(`p2p-webrtc-star`.asInstanceOf[js.Any])
      __obj.updateDynamic("p2p-websocket-star")(`p2p-websocket-star`.asInstanceOf[js.Any])
      __obj.updateDynamic("p384-pub")(`p384-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("p521-pub")(`p521-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("poseidon-bls12_381-a2-fc1")(`poseidon-bls12_381-a2-fc1`.asInstanceOf[js.Any])
      __obj.updateDynamic("poseidon-bls12_381-a2-fc1-sc")(`poseidon-bls12_381-a2-fc1-sc`.asInstanceOf[js.Any])
      __obj.updateDynamic("ripemd-128")(`ripemd-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("ripemd-160")(`ripemd-160`.asInstanceOf[js.Any])
      __obj.updateDynamic("ripemd-256")(`ripemd-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("ripemd-320")(`ripemd-320`.asInstanceOf[js.Any])
      __obj.updateDynamic("secp256k1-priv")(`secp256k1-priv`.asInstanceOf[js.Any])
      __obj.updateDynamic("secp256k1-pub")(`secp256k1-pub`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha2-256")(`sha2-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha2-256-trunc254-padded")(`sha2-256-trunc254-padded`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha2-512")(`sha2-512`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha3-224")(`sha3-224`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha3-256")(`sha3-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha3-384")(`sha3-384`.asInstanceOf[js.Any])
      __obj.updateDynamic("sha3-512")(`sha3-512`.asInstanceOf[js.Any])
      __obj.updateDynamic("shake-128")(`shake-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("shake-256")(`shake-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-1000")(`skein1024-1000`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-1008")(`skein1024-1008`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-1016")(`skein1024-1016`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-1024")(`skein1024-1024`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-104")(`skein1024-104`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-112")(`skein1024-112`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-120")(`skein1024-120`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-128")(`skein1024-128`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-136")(`skein1024-136`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-144")(`skein1024-144`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-152")(`skein1024-152`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-16")(`skein1024-16`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-160")(`skein1024-160`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-168")(`skein1024-168`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-176")(`skein1024-176`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-184")(`skein1024-184`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-192")(`skein1024-192`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-200")(`skein1024-200`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-208")(`skein1024-208`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-216")(`skein1024-216`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-224")(`skein1024-224`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-232")(`skein1024-232`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-24")(`skein1024-24`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-240")(`skein1024-240`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-248")(`skein1024-248`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-256")(`skein1024-256`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-264")(`skein1024-264`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-272")(`skein1024-272`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-280")(`skein1024-280`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-288")(`skein1024-288`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-296")(`skein1024-296`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-304")(`skein1024-304`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-312")(`skein1024-312`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-32")(`skein1024-32`.asInstanceOf[js.Any])
      __obj.updateDynamic("skein1024-320")(`skein1024-320`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameUint8ArrayMap]
    }
    
    extension [Self <: NameUint8ArrayMap](x: Self) {
      
      inline def `setArweave-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "arweave-ns", value.asInstanceOf[js.Any])
      
      inline def setBencode(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bencode", value.asInstanceOf[js.Any])
      
      inline def `setBitcoin-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bitcoin-block", value.asInstanceOf[js.Any])
      
      inline def `setBitcoin-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bitcoin-tx", value.asInstanceOf[js.Any])
      
      inline def `setBitcoin-witness-commitment`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bitcoin-witness-commitment", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-104`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-104", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-112`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-112", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-120`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-120", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-128", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-136`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-136", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-144`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-144", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-152`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-152", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-16`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-16", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-160", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-168`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-168", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-176`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-176", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-184`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-184", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-192`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-192", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-200`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-200", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-208`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-208", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-216`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-216", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-224", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-232`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-232", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-24`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-24", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-240`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-240", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-248`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-248", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-256", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-264`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-264", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-272`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-272", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-280`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-280", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-288`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-288", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-296`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-296", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-304`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-304", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-312`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-312", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-32", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-320`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-320", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-328`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-328", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-336`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-336", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-344`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-344", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-352`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-352", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-360`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-360", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-368`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-368", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-376`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-376", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-384`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-384", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-392`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-392", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-40`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-40", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-400`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-400", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-408`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-408", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-416`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-416", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-424`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-424", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-432`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-432", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-440`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-440", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-448`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-448", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-456`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-456", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-464`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-464", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-472`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-472", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-48`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-48", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-480`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-480", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-488`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-488", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-496`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-496", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-504`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-504", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-512", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-56`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-56", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-64`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-64", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-72`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-72", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-8`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-8", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-80`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-80", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-88`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-88", value.asInstanceOf[js.Any])
      
      inline def `setBlake2b-96`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2b-96", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-104`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-104", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-112`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-112", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-120`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-120", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-128", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-136`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-136", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-144`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-144", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-152`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-152", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-16`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-16", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-160", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-168`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-168", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-176`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-176", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-184`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-184", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-192`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-192", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-200`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-200", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-208`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-208", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-216`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-216", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-224", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-232`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-232", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-24`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-24", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-240`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-240", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-248`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-248", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-256", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-32", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-40`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-40", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-48`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-48", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-56`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-56", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-64`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-64", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-72`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-72", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-8`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-8", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-80`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-80", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-88`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-88", value.asInstanceOf[js.Any])
      
      inline def `setBlake2s-96`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake2s-96", value.asInstanceOf[js.Any])
      
      inline def setBlake3(value: js.typedarray.Uint8Array): Self = StObject.set(x, "blake3", value.asInstanceOf[js.Any])
      
      inline def `setBls12_381-g1-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bls12_381-g1-pub", value.asInstanceOf[js.Any])
      
      inline def `setBls12_381-g1g2-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bls12_381-g1g2-pub", value.asInstanceOf[js.Any])
      
      inline def `setBls12_381-g2-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bls12_381-g2-pub", value.asInstanceOf[js.Any])
      
      inline def setBmt(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bmt", value.asInstanceOf[js.Any])
      
      inline def `setCaip-50`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "caip-50", value.asInstanceOf[js.Any])
      
      inline def `setCar-index-sorted`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "car-index-sorted", value.asInstanceOf[js.Any])
      
      inline def setCbor(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cbor", value.asInstanceOf[js.Any])
      
      inline def setCidv1(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cidv1", value.asInstanceOf[js.Any])
      
      inline def setCidv2(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cidv2", value.asInstanceOf[js.Any])
      
      inline def setCidv3(value: js.typedarray.Uint8Array): Self = StObject.set(x, "cidv3", value.asInstanceOf[js.Any])
      
      inline def `setDag-cbor`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dag-cbor", value.asInstanceOf[js.Any])
      
      inline def `setDag-cose`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dag-cose", value.asInstanceOf[js.Any])
      
      inline def `setDag-jose`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dag-jose", value.asInstanceOf[js.Any])
      
      inline def `setDag-json`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dag-json", value.asInstanceOf[js.Any])
      
      inline def `setDag-pb`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dag-pb", value.asInstanceOf[js.Any])
      
      inline def `setDash-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dash-block", value.asInstanceOf[js.Any])
      
      inline def `setDash-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dash-tx", value.asInstanceOf[js.Any])
      
      inline def `setDbl-sha2-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dbl-sha2-256", value.asInstanceOf[js.Any])
      
      inline def setDccp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dccp", value.asInstanceOf[js.Any])
      
      inline def `setDecred-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "decred-block", value.asInstanceOf[js.Any])
      
      inline def `setDecred-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "decred-tx", value.asInstanceOf[js.Any])
      
      inline def setDns(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
      
      inline def setDns4(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dns4", value.asInstanceOf[js.Any])
      
      inline def setDns6(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dns6", value.asInstanceOf[js.Any])
      
      inline def setDnsaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "dnsaddr", value.asInstanceOf[js.Any])
      
      inline def `setEd25519-priv`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ed25519-priv", value.asInstanceOf[js.Any])
      
      inline def `setEd25519-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ed25519-pub", value.asInstanceOf[js.Any])
      
      inline def `setEd448-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ed448-pub", value.asInstanceOf[js.Any])
      
      inline def `setEth-account-snapshot`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-account-snapshot", value.asInstanceOf[js.Any])
      
      inline def `setEth-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-block", value.asInstanceOf[js.Any])
      
      inline def `setEth-block-list`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-block-list", value.asInstanceOf[js.Any])
      
      inline def `setEth-receipt-log-trie`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-receipt-log-trie", value.asInstanceOf[js.Any])
      
      inline def `setEth-reciept-log`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-reciept-log", value.asInstanceOf[js.Any])
      
      inline def `setEth-state-trie`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-state-trie", value.asInstanceOf[js.Any])
      
      inline def `setEth-storage-trie`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-storage-trie", value.asInstanceOf[js.Any])
      
      inline def `setEth-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-tx", value.asInstanceOf[js.Any])
      
      inline def `setEth-tx-receipt`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-tx-receipt", value.asInstanceOf[js.Any])
      
      inline def `setEth-tx-receipt-trie`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-tx-receipt-trie", value.asInstanceOf[js.Any])
      
      inline def `setEth-tx-trie`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "eth-tx-trie", value.asInstanceOf[js.Any])
      
      inline def `setFil-commitment-sealed`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "fil-commitment-sealed", value.asInstanceOf[js.Any])
      
      inline def `setFil-commitment-unsealed`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "fil-commitment-unsealed", value.asInstanceOf[js.Any])
      
      inline def setGarlic32(value: js.typedarray.Uint8Array): Self = StObject.set(x, "garlic32", value.asInstanceOf[js.Any])
      
      inline def setGarlic64(value: js.typedarray.Uint8Array): Self = StObject.set(x, "garlic64", value.asInstanceOf[js.Any])
      
      inline def `setGit-raw`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "git-raw", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-adr-v0`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-adr-v0", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-adr-v1`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-adr-v1", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-key-v0`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-key-v0", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-key-v1`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-key-v1", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-sig-v0`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-sig-v0", value.asInstanceOf[js.Any])
      
      inline def `setHolochain-sig-v1`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "holochain-sig-v1", value.asInstanceOf[js.Any])
      
      inline def setHttp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttps(value: js.typedarray.Uint8Array): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIp4(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ip4", value.asInstanceOf[js.Any])
      
      inline def setIp6(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ip6", value.asInstanceOf[js.Any])
      
      inline def setIp6zone(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ip6zone", value.asInstanceOf[js.Any])
      
      inline def setIpfs(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def `setIpfs-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ipfs-ns", value.asInstanceOf[js.Any])
      
      inline def `setIpld-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ipld-ns", value.asInstanceOf[js.Any])
      
      inline def `setIpns-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ipns-ns", value.asInstanceOf[js.Any])
      
      inline def setJson(value: js.typedarray.Uint8Array): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setKangarootwelve(value: js.typedarray.Uint8Array): Self = StObject.set(x, "kangarootwelve", value.asInstanceOf[js.Any])
      
      inline def `setKeccak-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "keccak-224", value.asInstanceOf[js.Any])
      
      inline def `setKeccak-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "keccak-256", value.asInstanceOf[js.Any])
      
      inline def `setKeccak-384`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "keccak-384", value.asInstanceOf[js.Any])
      
      inline def `setKeccak-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "keccak-512", value.asInstanceOf[js.Any])
      
      inline def `setLeofcoin-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "leofcoin-block", value.asInstanceOf[js.Any])
      
      inline def `setLeofcoin-pr`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "leofcoin-pr", value.asInstanceOf[js.Any])
      
      inline def `setLeofcoin-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "leofcoin-tx", value.asInstanceOf[js.Any])
      
      inline def `setLibp2p-key`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "libp2p-key", value.asInstanceOf[js.Any])
      
      inline def `setLibp2p-peer-record`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "libp2p-peer-record", value.asInstanceOf[js.Any])
      
      inline def `setLibp2p-relay-rsvp`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "libp2p-relay-rsvp", value.asInstanceOf[js.Any])
      
      inline def setMd4(value: js.typedarray.Uint8Array): Self = StObject.set(x, "md4", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: js.typedarray.Uint8Array): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
      
      inline def setMessagepack(value: js.typedarray.Uint8Array): Self = StObject.set(x, "messagepack", value.asInstanceOf[js.Any])
      
      inline def setMultiaddr(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multiaddr", value.asInstanceOf[js.Any])
      
      inline def setMultibase(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multibase", value.asInstanceOf[js.Any])
      
      inline def setMulticodec(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multicodec", value.asInstanceOf[js.Any])
      
      inline def setMultihash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "multihash", value.asInstanceOf[js.Any])
      
      inline def `setMurmur3-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "murmur3-128", value.asInstanceOf[js.Any])
      
      inline def `setMurmur3-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "murmur3-32", value.asInstanceOf[js.Any])
      
      inline def setNoise(value: js.typedarray.Uint8Array): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
      
      inline def setOnion(value: js.typedarray.Uint8Array): Self = StObject.set(x, "onion", value.asInstanceOf[js.Any])
      
      inline def setOnion3(value: js.typedarray.Uint8Array): Self = StObject.set(x, "onion3", value.asInstanceOf[js.Any])
      
      inline def `setP256-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p256-pub", value.asInstanceOf[js.Any])
      
      inline def setP2p(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p", value.asInstanceOf[js.Any])
      
      inline def `setP2p-circuit`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p-circuit", value.asInstanceOf[js.Any])
      
      inline def `setP2p-stardust`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p-stardust", value.asInstanceOf[js.Any])
      
      inline def `setP2p-webrtc-direct`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p-webrtc-direct", value.asInstanceOf[js.Any])
      
      inline def `setP2p-webrtc-star`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p-webrtc-star", value.asInstanceOf[js.Any])
      
      inline def `setP2p-websocket-star`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p2p-websocket-star", value.asInstanceOf[js.Any])
      
      inline def `setP384-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p384-pub", value.asInstanceOf[js.Any])
      
      inline def `setP521-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "p521-pub", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.typedarray.Uint8Array): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def `setPoseidon-bls12_381-a2-fc1`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "poseidon-bls12_381-a2-fc1", value.asInstanceOf[js.Any])
      
      inline def `setPoseidon-bls12_381-a2-fc1-sc`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "poseidon-bls12_381-a2-fc1-sc", value.asInstanceOf[js.Any])
      
      inline def setProtobuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "protobuf", value.asInstanceOf[js.Any])
      
      inline def setQuic(value: js.typedarray.Uint8Array): Self = StObject.set(x, "quic", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: js.typedarray.Uint8Array): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def `setRipemd-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ripemd-128", value.asInstanceOf[js.Any])
      
      inline def `setRipemd-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ripemd-160", value.asInstanceOf[js.Any])
      
      inline def `setRipemd-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ripemd-256", value.asInstanceOf[js.Any])
      
      inline def `setRipemd-320`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ripemd-320", value.asInstanceOf[js.Any])
      
      inline def setRlp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rlp", value.asInstanceOf[js.Any])
      
      inline def setSctp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sctp", value.asInstanceOf[js.Any])
      
      inline def `setSecp256k1-priv`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secp256k1-priv", value.asInstanceOf[js.Any])
      
      inline def `setSecp256k1-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "secp256k1-pub", value.asInstanceOf[js.Any])
      
      inline def setSha1(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      inline def `setSha2-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha2-256", value.asInstanceOf[js.Any])
      
      inline def `setSha2-256-trunc254-padded`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha2-256-trunc254-padded", value.asInstanceOf[js.Any])
      
      inline def `setSha2-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha2-512", value.asInstanceOf[js.Any])
      
      inline def `setSha3-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha3-224", value.asInstanceOf[js.Any])
      
      inline def `setSha3-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha3-256", value.asInstanceOf[js.Any])
      
      inline def `setSha3-384`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha3-384", value.asInstanceOf[js.Any])
      
      inline def `setSha3-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sha3-512", value.asInstanceOf[js.Any])
      
      inline def `setShake-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "shake-128", value.asInstanceOf[js.Any])
      
      inline def `setShake-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "shake-256", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-1000`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-1000", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-1008`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-1008", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-1016`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-1016", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-1024`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-1024", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-104`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-104", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-112`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-112", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-120`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-120", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-128", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-136`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-136", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-144`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-144", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-152`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-152", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-16`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-16", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-160", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-168`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-168", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-176`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-176", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-184`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-184", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-192`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-192", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-200`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-200", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-208`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-208", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-216`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-216", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-224", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-232`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-232", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-24`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-24", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-240`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-240", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-248`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-248", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-256", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-264`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-264", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-272`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-272", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-280`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-280", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-288`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-288", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-296`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-296", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-304`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-304", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-312`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-312", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-32", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-320`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-320", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-328`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-328", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-336`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-336", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-344`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-344", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-352`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-352", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-360`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-360", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-368`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-368", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-376`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-376", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-384`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-384", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-392`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-392", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-40`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-40", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-400`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-400", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-408`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-408", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-416`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-416", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-424`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-424", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-432`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-432", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-440`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-440", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-448`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-448", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-456`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-456", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-464`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-464", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-472`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-472", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-48`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-48", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-480`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-480", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-488`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-488", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-496`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-496", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-504`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-504", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-512", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-520`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-520", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-528`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-528", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-536`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-536", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-544`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-544", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-552`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-552", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-56`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-56", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-560`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-560", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-568`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-568", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-576`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-576", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-584`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-584", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-592`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-592", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-600`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-600", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-608`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-608", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-616`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-616", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-624`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-624", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-632`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-632", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-64`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-64", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-640`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-640", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-648`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-648", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-656`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-656", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-664`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-664", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-672`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-672", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-680`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-680", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-688`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-688", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-696`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-696", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-704`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-704", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-712`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-712", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-72`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-72", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-720`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-720", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-728`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-728", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-736`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-736", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-744`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-744", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-752`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-752", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-760`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-760", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-768`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-768", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-776`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-776", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-784`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-784", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-792`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-792", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-8`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-8", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-80`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-80", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-800`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-800", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-808`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-808", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-816`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-816", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-824`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-824", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-832`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-832", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-840`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-840", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-848`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-848", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-856`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-856", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-864`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-864", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-872`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-872", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-88`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-88", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-880`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-880", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-888`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-888", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-896`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-896", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-904`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-904", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-912`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-912", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-920`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-920", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-928`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-928", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-936`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-936", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-944`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-944", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-952`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-952", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-96`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-96", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-960`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-960", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-968`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-968", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-976`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-976", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-984`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-984", value.asInstanceOf[js.Any])
      
      inline def `setSkein1024-992`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein1024-992", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-104`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-104", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-112`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-112", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-120`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-120", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-128", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-136`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-136", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-144`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-144", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-152`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-152", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-16`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-16", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-160", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-168`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-168", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-176`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-176", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-184`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-184", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-192`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-192", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-200`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-200", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-208`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-208", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-216`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-216", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-224", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-232`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-232", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-24`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-24", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-240`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-240", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-248`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-248", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-256", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-32", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-40`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-40", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-48`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-48", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-56`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-56", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-64`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-64", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-72`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-72", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-8`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-8", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-80`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-80", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-88`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-88", value.asInstanceOf[js.Any])
      
      inline def `setSkein256-96`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein256-96", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-104`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-104", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-112`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-112", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-120`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-120", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-128`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-128", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-136`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-136", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-144`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-144", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-152`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-152", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-16`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-16", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-160`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-160", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-168`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-168", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-176`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-176", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-184`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-184", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-192`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-192", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-200`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-200", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-208`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-208", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-216`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-216", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-224`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-224", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-232`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-232", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-24`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-24", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-240`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-240", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-248`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-248", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-256", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-264`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-264", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-272`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-272", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-280`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-280", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-288`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-288", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-296`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-296", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-304`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-304", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-312`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-312", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-32`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-32", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-320`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-320", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-328`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-328", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-336`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-336", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-344`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-344", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-352`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-352", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-360`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-360", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-368`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-368", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-376`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-376", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-384`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-384", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-392`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-392", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-40`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-40", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-400`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-400", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-408`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-408", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-416`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-416", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-424`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-424", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-432`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-432", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-440`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-440", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-448`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-448", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-456`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-456", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-464`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-464", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-472`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-472", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-48`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-48", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-480`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-480", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-488`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-488", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-496`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-496", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-504`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-504", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-512`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-512", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-56`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-56", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-64`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-64", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-72`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-72", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-8`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-8", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-80`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-80", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-88`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-88", value.asInstanceOf[js.Any])
      
      inline def `setSkein512-96`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skein512-96", value.asInstanceOf[js.Any])
      
      inline def `setSkynet-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "skynet-ns", value.asInstanceOf[js.Any])
      
      inline def `setSm3-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sm3-256", value.asInstanceOf[js.Any])
      
      inline def `setStellar-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "stellar-block", value.asInstanceOf[js.Any])
      
      inline def `setStellar-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "stellar-tx", value.asInstanceOf[js.Any])
      
      inline def setStreamid(value: js.typedarray.Uint8Array): Self = StObject.set(x, "streamid", value.asInstanceOf[js.Any])
      
      inline def `setSwarm-feed`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "swarm-feed", value.asInstanceOf[js.Any])
      
      inline def `setSwarm-manifest`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "swarm-manifest", value.asInstanceOf[js.Any])
      
      inline def `setSwarm-ns`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "swarm-ns", value.asInstanceOf[js.Any])
      
      inline def `setSwhid-1-snp`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "swhid-1-snp", value.asInstanceOf[js.Any])
      
      inline def setTcp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setThread(value: js.typedarray.Uint8Array): Self = StObject.set(x, "thread", value.asInstanceOf[js.Any])
      
      inline def setTls(value: js.typedarray.Uint8Array): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def `setTorrent-file`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "torrent-file", value.asInstanceOf[js.Any])
      
      inline def `setTorrent-info`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "torrent-info", value.asInstanceOf[js.Any])
      
      inline def setUdp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdt(value: js.typedarray.Uint8Array): Self = StObject.set(x, "udt", value.asInstanceOf[js.Any])
      
      inline def setUnix(value: js.typedarray.Uint8Array): Self = StObject.set(x, "unix", value.asInstanceOf[js.Any])
      
      inline def setUtp(value: js.typedarray.Uint8Array): Self = StObject.set(x, "utp", value.asInstanceOf[js.Any])
      
      inline def setWs(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      inline def setWss(value: js.typedarray.Uint8Array): Self = StObject.set(x, "wss", value.asInstanceOf[js.Any])
      
      inline def setX11(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x11", value.asInstanceOf[js.Any])
      
      inline def `setX25519-priv`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x25519-priv", value.asInstanceOf[js.Any])
      
      inline def `setX25519-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x25519-pub", value.asInstanceOf[js.Any])
      
      inline def `setX448-pub`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "x448-pub", value.asInstanceOf[js.Any])
      
      inline def `setZcash-block`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "zcash-block", value.asInstanceOf[js.Any])
      
      inline def `setZcash-tx`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "zcash-tx", value.asInstanceOf[js.Any])
      
      inline def setZeronet(value: js.typedarray.Uint8Array): Self = StObject.set(x, "zeronet", value.asInstanceOf[js.Any])
      
      inline def `setZeroxcert-imprint-256`(value: js.typedarray.Uint8Array): Self = StObject.set(x, "zeroxcert-imprint-256", value.asInstanceOf[js.Any])
    }
  }
}
