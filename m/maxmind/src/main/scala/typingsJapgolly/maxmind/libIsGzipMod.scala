package typingsJapgolly.maxmind

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsGzipMod {
  
  @JSImport("maxmind/lib/is-gzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
