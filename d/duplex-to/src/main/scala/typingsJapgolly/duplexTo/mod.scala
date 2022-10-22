package typingsJapgolly.duplexTo

import typingsJapgolly.duplexTo.anon.FnCall
import typingsJapgolly.duplexTo.anon.FnCallDuplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("duplex-to", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("duplex-to", "readable")
  @js.native
  def readable: FnCall = js.native
  inline def readable(duplex: Stream): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(duplex.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def readable(duplex: typingsJapgolly.readableStream.mod.Stream): typingsJapgolly.readableStream.mod.Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(duplex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.readableStream.mod.Readable]
  inline def readable_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readable")(x.asInstanceOf[js.Any])
  
  @JSImport("duplex-to", "writable")
  @js.native
  def writable: FnCallDuplex = js.native
  inline def writable(duplex: Stream): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(duplex.asInstanceOf[js.Any]).asInstanceOf[Writable]
  inline def writable(duplex: typingsJapgolly.readableStream.mod.Stream): typingsJapgolly.readableStream.mod.Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(duplex.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.readableStream.mod.Writable]
  inline def writable_=(x: FnCallDuplex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writable")(x.asInstanceOf[js.Any])
}
