package typingsJapgolly.k6

import typingsJapgolly.k6.cryptoMod.Algorithm
import typingsJapgolly.k6.cryptoMod.StringEncoding
import typingsJapgolly.k6.encodingMod.Base64Variant
import typingsJapgolly.k6.httpMod.AuthMethod
import typingsJapgolly.k6.httpMod.CipherSuite
import typingsJapgolly.k6.httpMod.Protocol
import typingsJapgolly.k6.httpMod.ResponseType
import typingsJapgolly.k6.wsMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object k6Strings {
  @js.native
  sealed trait BatchResponses extends js.Object
  
  @js.native
  sealed trait HTTPSlash1Dot0 extends Protocol
  
  @js.native
  sealed trait HTTPSlash1Dot1 extends Protocol
  
  @js.native
  sealed trait HTTPSlash2Dot0 extends Protocol
  
  @js.native
  sealed trait TLS_AES_128_GCM_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_AES_256_GCM_SHA384 extends CipherSuite
  
  @js.native
  sealed trait TLS_CHACHA20_POLY1305_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_ECDSA_WITH_RC4_128_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305 extends CipherSuite
  
  @js.native
  sealed trait TLS_ECDHE_RSA_WITH_RC4_128_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_3DES_EDE_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_CBC_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_128_GCM_SHA256 extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_256_CBC_SHA extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_AES_256_GCM_SHA384 extends CipherSuite
  
  @js.native
  sealed trait TLS_RSA_WITH_RC4_128_SHA extends CipherSuite
  
  @js.native
  sealed trait aa_compromise extends js.Object
  
  @js.native
  sealed trait affiliation_changed extends js.Object
  
  @js.native
  sealed trait b extends js.Object
  
  @js.native
  sealed trait base64 extends StringEncoding
  
  @js.native
  sealed trait base64rawurl extends StringEncoding
  
  @js.native
  sealed trait base64url extends StringEncoding
  
  @js.native
  sealed trait basic extends AuthMethod
  
  @js.native
  sealed trait binary extends ResponseType
  
  @js.native
  sealed trait ca_compromise extends js.Object
  
  @js.native
  sealed trait certificate_hold extends js.Object
  
  @js.native
  sealed trait cessation_of_operation extends js.Object
  
  @js.native
  sealed trait close extends EventType
  
  @js.native
  sealed trait digest extends AuthMethod
  
  @js.native
  sealed trait error extends EventType
  
  @js.native
  sealed trait good extends js.Object
  
  @js.native
  sealed trait hex extends StringEncoding
  
  @js.native
  sealed trait key_compromise extends js.Object
  
  @js.native
  sealed trait md4 extends Algorithm
  
  @js.native
  sealed trait md5 extends Algorithm
  
  @js.native
  sealed trait message extends EventType
  
  @js.native
  sealed trait none extends ResponseType
  
  @js.native
  sealed trait ntlm extends AuthMethod
  
  @js.native
  sealed trait open extends EventType
  
  @js.native
  sealed trait ping extends EventType
  
  @js.native
  sealed trait pong extends EventType
  
  @js.native
  sealed trait privilege_withdrawn extends js.Object
  
  @js.native
  sealed trait rawstd extends Base64Variant
  
  @js.native
  sealed trait rawurl extends Base64Variant
  
  @js.native
  sealed trait remove_from_crl extends js.Object
  
  @js.native
  sealed trait revoked extends js.Object
  
  @js.native
  sealed trait ripemd160 extends Algorithm
  
  @js.native
  sealed trait server_failed extends js.Object
  
  @js.native
  sealed trait sha1 extends Algorithm
  
  @js.native
  sealed trait sha256 extends Algorithm
  
  @js.native
  sealed trait sha384 extends Algorithm
  
  @js.native
  sealed trait sha512 extends Algorithm
  
  @js.native
  sealed trait sha512_224 extends Algorithm
  
  @js.native
  sealed trait sha512_256 extends Algorithm
  
  @js.native
  sealed trait ssl3Dot0 extends js.Object
  
  @js.native
  sealed trait std extends Base64Variant
  
  @js.native
  sealed trait superseded extends js.Object
  
  @js.native
  sealed trait text extends ResponseType
  
  @js.native
  sealed trait tls1Dot0 extends js.Object
  
  @js.native
  sealed trait tls1Dot1 extends js.Object
  
  @js.native
  sealed trait tls1Dot2 extends js.Object
  
  @js.native
  sealed trait tls1Dot3 extends js.Object
  
  @js.native
  sealed trait unknown extends js.Object
  
  @js.native
  sealed trait unspecified extends js.Object
  
  @js.native
  sealed trait url extends Base64Variant
  
  @scala.inline
  def BatchResponses: BatchResponses = "BatchResponses".asInstanceOf[BatchResponses]
  @scala.inline
  def HTTPSlash1Dot0: HTTPSlash1Dot0 = "HTTP/1.0".asInstanceOf[HTTPSlash1Dot0]
  @scala.inline
  def HTTPSlash1Dot1: HTTPSlash1Dot1 = "HTTP/1.1".asInstanceOf[HTTPSlash1Dot1]
  @scala.inline
  def HTTPSlash2Dot0: HTTPSlash2Dot0 = "HTTP/2.0".asInstanceOf[HTTPSlash2Dot0]
  @scala.inline
  def TLS_AES_128_GCM_SHA256: TLS_AES_128_GCM_SHA256 = "TLS_AES_128_GCM_SHA256".asInstanceOf[TLS_AES_128_GCM_SHA256]
  @scala.inline
  def TLS_AES_256_GCM_SHA384: TLS_AES_256_GCM_SHA384 = "TLS_AES_256_GCM_SHA384".asInstanceOf[TLS_AES_256_GCM_SHA384]
  @scala.inline
  def TLS_CHACHA20_POLY1305_SHA256: TLS_CHACHA20_POLY1305_SHA256 = "TLS_CHACHA20_POLY1305_SHA256".asInstanceOf[TLS_CHACHA20_POLY1305_SHA256]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA: TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256: TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256: TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA: TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384: TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305: TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305".asInstanceOf[TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305]
  @scala.inline
  def TLS_ECDHE_ECDSA_WITH_RC4_128_SHA: TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA".asInstanceOf[TLS_ECDHE_ECDSA_WITH_RC4_128_SHA]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA: TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA: TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256: TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256: TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA: TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384: TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305: TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305".asInstanceOf[TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305]
  @scala.inline
  def TLS_ECDHE_RSA_WITH_RC4_128_SHA: TLS_ECDHE_RSA_WITH_RC4_128_SHA = "TLS_ECDHE_RSA_WITH_RC4_128_SHA".asInstanceOf[TLS_ECDHE_RSA_WITH_RC4_128_SHA]
  @scala.inline
  def TLS_RSA_WITH_3DES_EDE_CBC_SHA: TLS_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[TLS_RSA_WITH_3DES_EDE_CBC_SHA]
  @scala.inline
  def TLS_RSA_WITH_AES_128_CBC_SHA: TLS_RSA_WITH_AES_128_CBC_SHA = "TLS_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[TLS_RSA_WITH_AES_128_CBC_SHA]
  @scala.inline
  def TLS_RSA_WITH_AES_128_CBC_SHA256: TLS_RSA_WITH_AES_128_CBC_SHA256 = "TLS_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[TLS_RSA_WITH_AES_128_CBC_SHA256]
  @scala.inline
  def TLS_RSA_WITH_AES_128_GCM_SHA256: TLS_RSA_WITH_AES_128_GCM_SHA256 = "TLS_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[TLS_RSA_WITH_AES_128_GCM_SHA256]
  @scala.inline
  def TLS_RSA_WITH_AES_256_CBC_SHA: TLS_RSA_WITH_AES_256_CBC_SHA = "TLS_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[TLS_RSA_WITH_AES_256_CBC_SHA]
  @scala.inline
  def TLS_RSA_WITH_AES_256_GCM_SHA384: TLS_RSA_WITH_AES_256_GCM_SHA384 = "TLS_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[TLS_RSA_WITH_AES_256_GCM_SHA384]
  @scala.inline
  def TLS_RSA_WITH_RC4_128_SHA: TLS_RSA_WITH_RC4_128_SHA = "TLS_RSA_WITH_RC4_128_SHA".asInstanceOf[TLS_RSA_WITH_RC4_128_SHA]
  @scala.inline
  def aa_compromise: aa_compromise = "aa_compromise".asInstanceOf[aa_compromise]
  @scala.inline
  def affiliation_changed: affiliation_changed = "affiliation_changed".asInstanceOf[affiliation_changed]
  @scala.inline
  def b: b = "b".asInstanceOf[b]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64rawurl: base64rawurl = "base64rawurl".asInstanceOf[base64rawurl]
  @scala.inline
  def base64url: base64url = "base64url".asInstanceOf[base64url]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def ca_compromise: ca_compromise = "ca_compromise".asInstanceOf[ca_compromise]
  @scala.inline
  def certificate_hold: certificate_hold = "certificate_hold".asInstanceOf[certificate_hold]
  @scala.inline
  def cessation_of_operation: cessation_of_operation = "cessation_of_operation".asInstanceOf[cessation_of_operation]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def digest: digest = "digest".asInstanceOf[digest]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def good: good = "good".asInstanceOf[good]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def key_compromise: key_compromise = "key_compromise".asInstanceOf[key_compromise]
  @scala.inline
  def md4: md4 = "md4".asInstanceOf[md4]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def ntlm: ntlm = "ntlm".asInstanceOf[ntlm]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  @scala.inline
  def pong: pong = "pong".asInstanceOf[pong]
  @scala.inline
  def privilege_withdrawn: privilege_withdrawn = "privilege_withdrawn".asInstanceOf[privilege_withdrawn]
  @scala.inline
  def rawstd: rawstd = "rawstd".asInstanceOf[rawstd]
  @scala.inline
  def rawurl: rawurl = "rawurl".asInstanceOf[rawurl]
  @scala.inline
  def remove_from_crl: remove_from_crl = "remove_from_crl".asInstanceOf[remove_from_crl]
  @scala.inline
  def revoked: revoked = "revoked".asInstanceOf[revoked]
  @scala.inline
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  @scala.inline
  def server_failed: server_failed = "server_failed".asInstanceOf[server_failed]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def sha512_224: sha512_224 = "sha512_224".asInstanceOf[sha512_224]
  @scala.inline
  def sha512_256: sha512_256 = "sha512_256".asInstanceOf[sha512_256]
  @scala.inline
  def ssl3Dot0: ssl3Dot0 = "ssl3.0".asInstanceOf[ssl3Dot0]
  @scala.inline
  def std: std = "std".asInstanceOf[std]
  @scala.inline
  def superseded: superseded = "superseded".asInstanceOf[superseded]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def tls1Dot0: tls1Dot0 = "tls1.0".asInstanceOf[tls1Dot0]
  @scala.inline
  def tls1Dot1: tls1Dot1 = "tls1.1".asInstanceOf[tls1Dot1]
  @scala.inline
  def tls1Dot2: tls1Dot2 = "tls1.2".asInstanceOf[tls1Dot2]
  @scala.inline
  def tls1Dot3: tls1Dot3 = "tls1.3".asInstanceOf[tls1Dot3]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

