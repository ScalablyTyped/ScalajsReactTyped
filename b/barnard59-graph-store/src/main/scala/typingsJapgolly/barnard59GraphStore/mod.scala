package typingsJapgolly.barnard59GraphStore

import typingsJapgolly.barnard59GraphStore.getMod.Options
import typingsJapgolly.rdfjsTypes.dataModelMod.Quad
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import typingsJapgolly.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("barnard59-graph-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(arg: Options): Stream[Quad] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(arg.asInstanceOf[js.Any]).asInstanceOf[Stream[Quad]]
  
  inline def post(arg: typingsJapgolly.barnard59GraphStore.postMod.Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(arg.asInstanceOf[js.Any]).asInstanceOf[Writable]
  
  inline def put(arg: typingsJapgolly.barnard59GraphStore.putMod.Options): Writable = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(arg.asInstanceOf[js.Any]).asInstanceOf[Writable]
}
