package typingsJapgolly.nodeGzip

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.zlibMod.InputType
import typingsJapgolly.node.zlibMod.ZlibOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-gzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gzip(input: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def gzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def ungzip(input: InputType): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def ungzip(input: InputType, options: ZlibOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
}
