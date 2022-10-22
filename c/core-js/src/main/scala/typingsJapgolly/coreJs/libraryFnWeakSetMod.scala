package typingsJapgolly.coreJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.WeakSet
import typingsJapgolly.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnWeakSetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/fn/weak-set", JSImport.Namespace)
  @js.native
  /* standard es2015.collection */
  open class ^[T /* <: js.Object */] ()
    extends StObject
       with WeakSet[T] {
    /* standard es2015.iterable */
    def this(iterable: js.Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/library/fn/weak-set", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeakSetConstructor = js.native
  
  type _To = js.Object & WeakSetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `libraryFnWeakSetMod.foo` */
  override def _to: js.Object & WeakSetConstructor = ^
}
