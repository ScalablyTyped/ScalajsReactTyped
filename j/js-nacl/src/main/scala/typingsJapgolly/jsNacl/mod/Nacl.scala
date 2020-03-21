package typingsJapgolly.jsNacl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nacl extends js.Object {
  def crypto_box(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    rcpt: scala.scalajs.js.typedarray.Uint8Array,
    sender: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array
  // crypto_box
  def crypto_box_keypair(): BoxKeyPair
  def crypto_box_keypair_from_raw_sk(seed: scala.scalajs.js.typedarray.Uint8Array): BoxKeyPair
  def crypto_box_open(
    cipher: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    sender: scala.scalajs.js.typedarray.Uint8Array,
    rcpt: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array
  def crypto_box_open_precomputed(
    cipher: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    shared: BoxSharedSecret
  ): scala.scalajs.js.typedarray.Uint8Array
  def crypto_box_precompute(sender: scala.scalajs.js.typedarray.Uint8Array, rcpt: scala.scalajs.js.typedarray.Uint8Array): BoxSharedSecret
  def crypto_box_precomputed(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    shared: BoxSharedSecret
  ): scala.scalajs.js.typedarray.Uint8Array
  def crypto_box_random_nonce(): scala.scalajs.js.typedarray.Uint8Array
  def crypto_box_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array): BoxKeyPair
  // hash
  def crypto_hash(raw: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array
  def crypto_hash_sha256(raw: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array
  def crypto_secretbox(
    msg: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array
  def crypto_secretbox_open(
    cipher: scala.scalajs.js.typedarray.Uint8Array,
    nonce: scala.scalajs.js.typedarray.Uint8Array,
    key: scala.scalajs.js.typedarray.Uint8Array
  ): scala.scalajs.js.typedarray.Uint8Array
  // crypto_secretbox
  def crypto_secretbox_random_nonce(): scala.scalajs.js.typedarray.Uint8Array
  def crypto_sign(msg: scala.scalajs.js.typedarray.Uint8Array, sk: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array
  def crypto_sign_detached(msg: scala.scalajs.js.typedarray.Uint8Array, sk: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array
  // crypto_sign
  def crypto_sign_keypair(): SignKeyPair
  def crypto_sign_open(packet: scala.scalajs.js.typedarray.Uint8Array, pk: scala.scalajs.js.typedarray.Uint8Array): scala.scalajs.js.typedarray.Uint8Array | Null
  // derived keys
  def crypto_sign_seed_keypair(seed: scala.scalajs.js.typedarray.Uint8Array): SignKeyPair
  def crypto_sign_verify_detached(
    sig: scala.scalajs.js.typedarray.Uint8Array,
    msg: scala.scalajs.js.typedarray.Uint8Array,
    pk: scala.scalajs.js.typedarray.Uint8Array
  ): Boolean
  def decode_latin1(arr: scala.scalajs.js.typedarray.Uint8Array): String
  def decode_utf8(arr: scala.scalajs.js.typedarray.Uint8Array): String
  def encode_latin1(latin1: String): scala.scalajs.js.typedarray.Uint8Array
  def encode_utf8(utf8: String): scala.scalajs.js.typedarray.Uint8Array
  def from_hex(hex: String): scala.scalajs.js.typedarray.Uint8Array
  // strings vs. binary
  def to_hex(arr: scala.scalajs.js.typedarray.Uint8Array): String
}

object Nacl {
  @scala.inline
  def apply(
    crypto_box: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_box_keypair: CallbackTo[BoxKeyPair],
    crypto_box_keypair_from_raw_sk: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[BoxKeyPair],
    crypto_box_open: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_box_open_precomputed: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, BoxSharedSecret) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_box_precompute: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[BoxSharedSecret],
    crypto_box_precomputed: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, BoxSharedSecret) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_box_random_nonce: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_box_seed_keypair: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[BoxKeyPair],
    crypto_hash: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_hash_sha256: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_secretbox: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_secretbox_open: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_secretbox_random_nonce: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_sign: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_sign_detached: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    crypto_sign_keypair: CallbackTo[SignKeyPair],
    crypto_sign_open: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array | Null],
    crypto_sign_seed_keypair: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[SignKeyPair],
    crypto_sign_verify_detached: (scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array, scala.scalajs.js.typedarray.Uint8Array) => CallbackTo[Boolean],
    decode_latin1: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String],
    decode_utf8: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String],
    encode_latin1: String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    encode_utf8: String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    from_hex: String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    to_hex: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String]
  ): Nacl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crypto_box")(js.Any.fromFunction4((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.scalajs.js.typedarray.Uint8Array, t3: scala.scalajs.js.typedarray.Uint8Array) => crypto_box(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("crypto_box_keypair")(crypto_box_keypair.toJsFn)
    __obj.updateDynamic("crypto_box_keypair_from_raw_sk")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => crypto_box_keypair_from_raw_sk(t0).runNow()))
    __obj.updateDynamic("crypto_box_open")(js.Any.fromFunction4((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.scalajs.js.typedarray.Uint8Array, t3: scala.scalajs.js.typedarray.Uint8Array) => crypto_box_open(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("crypto_box_open_precomputed")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: typingsJapgolly.jsNacl.mod.BoxSharedSecret) => crypto_box_open_precomputed(t0, t1, t2).runNow()))
    __obj.updateDynamic("crypto_box_precompute")(js.Any.fromFunction2((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array) => crypto_box_precompute(t0, t1).runNow()))
    __obj.updateDynamic("crypto_box_precomputed")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: typingsJapgolly.jsNacl.mod.BoxSharedSecret) => crypto_box_precomputed(t0, t1, t2).runNow()))
    __obj.updateDynamic("crypto_box_random_nonce")(crypto_box_random_nonce.toJsFn)
    __obj.updateDynamic("crypto_box_seed_keypair")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => crypto_box_seed_keypair(t0).runNow()))
    __obj.updateDynamic("crypto_hash")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => crypto_hash(t0).runNow()))
    __obj.updateDynamic("crypto_hash_sha256")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => crypto_hash_sha256(t0).runNow()))
    __obj.updateDynamic("crypto_secretbox")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.scalajs.js.typedarray.Uint8Array) => crypto_secretbox(t0, t1, t2).runNow()))
    __obj.updateDynamic("crypto_secretbox_open")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.scalajs.js.typedarray.Uint8Array) => crypto_secretbox_open(t0, t1, t2).runNow()))
    __obj.updateDynamic("crypto_secretbox_random_nonce")(crypto_secretbox_random_nonce.toJsFn)
    __obj.updateDynamic("crypto_sign")(js.Any.fromFunction2((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array) => crypto_sign(t0, t1).runNow()))
    __obj.updateDynamic("crypto_sign_detached")(js.Any.fromFunction2((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array) => crypto_sign_detached(t0, t1).runNow()))
    __obj.updateDynamic("crypto_sign_keypair")(crypto_sign_keypair.toJsFn)
    __obj.updateDynamic("crypto_sign_open")(js.Any.fromFunction2((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array) => crypto_sign_open(t0, t1).runNow()))
    __obj.updateDynamic("crypto_sign_seed_keypair")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => crypto_sign_seed_keypair(t0).runNow()))
    __obj.updateDynamic("crypto_sign_verify_detached")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.Uint8Array, t1: scala.scalajs.js.typedarray.Uint8Array, t2: scala.scalajs.js.typedarray.Uint8Array) => crypto_sign_verify_detached(t0, t1, t2).runNow()))
    __obj.updateDynamic("decode_latin1")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => decode_latin1(t0).runNow()))
    __obj.updateDynamic("decode_utf8")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => decode_utf8(t0).runNow()))
    __obj.updateDynamic("encode_latin1")(js.Any.fromFunction1((t0: java.lang.String) => encode_latin1(t0).runNow()))
    __obj.updateDynamic("encode_utf8")(js.Any.fromFunction1((t0: java.lang.String) => encode_utf8(t0).runNow()))
    __obj.updateDynamic("from_hex")(js.Any.fromFunction1((t0: java.lang.String) => from_hex(t0).runNow()))
    __obj.updateDynamic("to_hex")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => to_hex(t0).runNow()))
    __obj.asInstanceOf[Nacl]
  }
}

