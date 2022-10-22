package typingsJapgolly.cloneableReadable

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cloneableReadable.anon.Clone
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("cloneable-readable", JSImport.Namespace)
  @js.native
  val ^ : CloneableFn = js.native
  
  type Cloneable[T /* <: Readable */] = T & Clone[T]
  
  @js.native
  trait CloneableFn extends StObject {
    
    def apply[T /* <: Readable */](x: T): Cloneable[T] = js.native
    
    def isCloneable(x: Readable): /* is cloneable-readable.cloneable-readable.Cloneable<node.stream.Readable> */ Boolean = js.native
  }
  
  type _To = CloneableFn
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CloneableFn = ^
}
