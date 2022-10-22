package typingsJapgolly.iconv

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.iconv.iconvBooleans.`true`
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait Iconv extends Stream {
    
    def convert(input: String): Buffer = js.native
    def convert(input: String, encoding: BufferEncoding): Buffer = js.native
    def convert(input: Buffer): Buffer = js.native
    
    def end(): Unit = js.native
    def end(input: String): Unit = js.native
    def end(input: String, encoding: BufferEncoding): Unit = js.native
    def end(input: Buffer): Unit = js.native
    
    val writable: `true` = js.native
    
    def write(input: String): Boolean = js.native
    def write(input: String, encoding: BufferEncoding): Boolean = js.native
    def write(input: Buffer): Boolean = js.native
  }
  @JSImport("iconv", "Iconv")
  @js.native
  val Iconv: Static = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("iconv", "Iconv")
  @js.native
  open class IconvCls protected ()
    extends typingsJapgolly.iconv.mod.Iconv {
    def this(fromEncoding: String, toEncoding: String) = this()
  }
  
  @js.native
  trait Static
    extends StObject
       with Instantiable2[/* fromEncoding */ String, /* toEncoding */ String, typingsJapgolly.iconv.mod.Iconv] {
    
    def apply(fromEncoding: String, toEncoding: String): typingsJapgolly.iconv.mod.Iconv = js.native
  }
}
