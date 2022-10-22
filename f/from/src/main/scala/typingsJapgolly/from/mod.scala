package typingsJapgolly.from

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("from", JSImport.Namespace)
  @js.native
  val ^ : From = js.native
  
  @js.native
  trait From extends StObject {
    
    def apply(chunks: js.Array[Any]): ReadableStream = js.native
    def apply(getChunk: js.Function2[/* count */ Double, /* next */ js.Function0[Any], Any]): ReadableStream = js.native
    
    def emit(`type`: String, data: Any): Unit = js.native
  }
  
  type _To = From
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: From = ^
}
