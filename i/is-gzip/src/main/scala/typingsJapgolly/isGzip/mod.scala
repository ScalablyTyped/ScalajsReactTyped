package typingsJapgolly.isGzip

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(buf: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("is-gzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
