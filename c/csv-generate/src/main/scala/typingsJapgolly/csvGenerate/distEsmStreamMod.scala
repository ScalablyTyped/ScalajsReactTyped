package typingsJapgolly.csvGenerate

import org.scalajs.dom.ReadableStream
import typingsJapgolly.csvGenerate.mod.Options
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmStreamMod {
  
  @JSImport("csv-generate/dist/esm/stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): ReadableStream[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[ReadableStream[Buffer]]
  inline def generate(options: Options): ReadableStream[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[ReadableStream[Buffer]]
}
