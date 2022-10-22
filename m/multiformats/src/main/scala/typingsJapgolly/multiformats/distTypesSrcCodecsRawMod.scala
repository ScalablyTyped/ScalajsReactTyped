package typingsJapgolly.multiformats

import typingsJapgolly.multiformats.multiformatsInts.`85`
import typingsJapgolly.multiformats.multiformatsStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSrcCodecsRawMod {
  
  @JSImport("multiformats/dist/types/src/codecs/raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multiformats/dist/types/src/codecs/raw", "code")
  @js.native
  val code: `85` = js.native
  
  inline def decode(data: ByteView[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(node: js.typedarray.Uint8Array): ByteView[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(node.asInstanceOf[js.Any]).asInstanceOf[ByteView[js.typedarray.Uint8Array]]
  
  @JSImport("multiformats/dist/types/src/codecs/raw", "name")
  @js.native
  val name: raw = js.native
  
  type ByteView[T] = typingsJapgolly.multiformats.distTypesSrcBlockInterfaceMod.ByteView[T]
}
