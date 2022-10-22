package typingsJapgolly.coreJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.MapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6MapMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/es6/map", JSImport.Namespace)
  @js.native
  /* standard es2015.collection */
  open class ^[K, V] ()
    extends StObject
       with typingsJapgolly.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/es6/map", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MapConstructor = js.native
  
  type _To = js.Object & MapConstructor
  
  /* This means you don't have to write `^`, but can instead just say `es6MapMod.foo` */
  override def _to: js.Object & MapConstructor = ^
}
