package typingsJapgolly.itConcat

import typingsJapgolly.itConcat.anon.Type
import typingsJapgolly.itConcat.anon.`0`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(source: AsyncIterable[Buffer | String | typingsJapgolly.bl.mod.^]): js.Promise[typingsJapgolly.bl.mod.^] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.bl.mod.^]]
  inline def apply(source: AsyncIterable[Buffer | String | typingsJapgolly.bl.mod.^], options: Type): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(source: AsyncIterable[Buffer | typingsJapgolly.bl.mod.^], options: `0`): js.Promise[typingsJapgolly.bl.mod.^] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.bl.mod.^]]
  
  @JSImport("it-concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
