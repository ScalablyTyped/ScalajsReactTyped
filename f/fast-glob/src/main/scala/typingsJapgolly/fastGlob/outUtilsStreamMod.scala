package typingsJapgolly.fastGlob

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilsStreamMod {
  
  @JSImport("fast-glob/out/utils/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(streams: js.Array[Readable]): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streams.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
}
