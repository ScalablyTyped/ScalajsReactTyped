package typingsJapgolly.libp2pMultistreamSelect

import typingsJapgolly.itPushable.mod.Pushable_
import typingsJapgolly.itReader.mod.Reader_
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.libp2pMultistreamSelect.mod.MultistreamSelectInit
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultistreamMod {
  
  @JSImport("@libp2p/multistream-select/dist/src/multistream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encode(buffer: js.typedarray.Uint8Array): Uint8ArrayList = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8ArrayList]
  inline def encode(buffer: Uint8ArrayList): Uint8ArrayList = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Uint8ArrayList]
  
  inline def read(reader: Reader_): js.Promise[Uint8ArrayList] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Uint8ArrayList]]
  inline def read(reader: Reader_, options: AbortOptions): js.Promise[Uint8ArrayList] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8ArrayList]]
  
  inline def readString(reader: Reader_): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readString")(reader.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def readString(reader: Reader_, options: AbortOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readString")(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def write(writer: Pushable_[Any], buffer: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(writer.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(writer: Pushable_[Any], buffer: js.typedarray.Uint8Array, options: MultistreamSelectInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(writer.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(writer: Pushable_[Any], buffer: Uint8ArrayList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(writer.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(writer: Pushable_[Any], buffer: Uint8ArrayList, options: MultistreamSelectInit): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(writer.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAll(writer: Pushable_[Any], buffers: js.Array[js.typedarray.Uint8Array]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAll")(writer.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAll(
    writer: Pushable_[Any],
    buffers: js.Array[js.typedarray.Uint8Array],
    options: MultistreamSelectInit
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAll")(writer.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
