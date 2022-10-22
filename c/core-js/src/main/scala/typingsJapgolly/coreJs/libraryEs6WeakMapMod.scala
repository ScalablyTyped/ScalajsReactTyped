package typingsJapgolly.coreJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.WeakMap
import typingsJapgolly.std.WeakMapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryEs6WeakMapMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/library/es6/weak-map", JSImport.Namespace)
  @js.native
  /* standard es2015.collection */
  open class ^[K /* <: js.Object */, V] ()
    extends StObject
       with WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/library/es6/weak-map", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeakMapConstructor = js.native
  
  type _To = js.Object & WeakMapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `libraryEs6WeakMapMod.foo` */
  override def _to: js.Object & WeakMapConstructor = ^
}
