package typingsJapgolly.concatStream

import typingsJapgolly.concatStream.anon.Encoding
import typingsJapgolly.concatStream.anon.`0`
import typingsJapgolly.concatStream.anon.`1`
import typingsJapgolly.concatStream.anon.`2`
import typingsJapgolly.concatStream.anon.`3`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def apply(opts: js.Object, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: Encoding, cb: js.Function1[/* buf */ js.Array[js.Object], Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `0`, cb: js.Function1[/* buf */ js.typedarray.Uint8Array, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `1`, cb: js.Function1[/* buf */ js.Array[js.BigInt], Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `2`, cb: js.Function1[/* buf */ String, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  inline def apply(opts: `3`, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = (^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Writable]
  
  @JSImport("concat-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
