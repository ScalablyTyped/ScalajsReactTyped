package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.anon.Bytes
import typingsJapgolly.multiformats.anon.BytesCid
import typingsJapgolly.multiformats.anon.Cid
import typingsJapgolly.multiformats.anon.CodecHasher
import typingsJapgolly.multiformats.anon.Hasher
import typingsJapgolly.multiformats.anon.Value
import typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.BlockView
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import typingsJapgolly.multiformats.multiformatsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object blockMod {
  
  @JSImport("multiformats/block", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/block", "Block")
  @js.native
  open class Block[T /* <: Any */, C /* <: Double */, A /* <: Double */, V /* <: Version */] protected ()
    extends typingsJapgolly.multiformats.distTypesSrcBlockMod.Block[T, C, A, V] {
    /**
      * @param {object} options
      * @param {CID<T, C, A, V>} options.cid
      * @param {API.ByteView<T>} options.bytes
      * @param {T} options.value
      */
    def this(hasCidBytesValue: Bytes[T, C, A, V]) = this()
  }
  
  inline def create[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](hasBytesCidHasherCodec: Cid[T, Code, Alg, V]): js.Promise[BlockView[T, Code, Alg, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(hasBytesCidHasherCodec.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, V]]]
  
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](hasBytesCidMaybeValueCodec: BytesCid[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(hasBytesCidMaybeValueCodec.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  inline def createUnsafe[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */, V /* <: Version */](hasBytesCidMaybeValueCodec: Value[T, Code, Alg, V]): BlockView[T, Code, Alg, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnsafe")(hasBytesCidMaybeValueCodec.asInstanceOf[js.Any]).asInstanceOf[BlockView[T, Code, Alg, V]]
  
  inline def decode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](hasBytesCodecHasher: Hasher[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hasBytesCodecHasher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
  
  inline def encode[T /* <: Any */, Code /* <: Double */, Alg /* <: Double */](hasValueCodecHasher: CodecHasher[T, Code, Alg]): js.Promise[BlockView[T, Code, Alg, `1`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(hasValueCodecHasher.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BlockView[T, Code, Alg, `1`]]]
}
