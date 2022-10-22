package typingsJapgolly.iarnaToml

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseStreamMod {
  
  /** Returns a transform stream in object mode. When it completes, emit the resulting object. Only one object will ever be emitted. */
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  /** Given a readable stream, parse it as it feeds us data. Return a promise of the resulting object. */
  inline def apply(readable: Readable): js.Promise[Record[String, Any]] = ^.asInstanceOf[js.Dynamic].apply(readable.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Record[String, Any]]]
  
  @JSImport("@iarna/toml/parse-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
