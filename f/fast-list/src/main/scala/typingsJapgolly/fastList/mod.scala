package typingsJapgolly.fastList

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fast-list", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with typingsJapgolly.fastList.mod.List[T]
  @JSImport("fast-list", JSImport.Namespace)
  @js.native
  val ^ : FastListFactory = js.native
  
  @js.native
  trait FastListFactory
    extends StObject
       with Instantiable0[typingsJapgolly.fastList.mod.List[js.Object]] {
    
    def apply[T](): typingsJapgolly.fastList.mod.List[T] = js.native
  }
  
  @js.native
  trait List[T] extends StObject {
    
    def drop(): Unit = js.native
    
    def filter[U](
      callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Boolean]
    ): typingsJapgolly.fastList.mod.List[T] = js.native
    def filter[U](
      callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Boolean],
      thisArg: U
    ): typingsJapgolly.fastList.mod.List[T] = js.native
    
    def forEach[U](
      callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit]
    ): Unit = js.native
    def forEach[U](
      callbackfn: js.ThisFunction3[/* this */ U, /* value */ T, /* index */ Double, /* list */ this.type, Unit],
      thisArg: U
    ): Unit = js.native
    
    def item(index: Double): js.UndefOr[T] = js.native
    
    val length: Double = js.native
    
    def map[U, V](
      callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ Double, /* list */ this.type, U]
    ): typingsJapgolly.fastList.mod.List[U] = js.native
    def map[U, V](
      callbackfn: js.ThisFunction3[/* this */ V, /* value */ T, /* index */ Double, /* list */ this.type, U],
      thisArg: V
    ): typingsJapgolly.fastList.mod.List[U] = js.native
    
    def pop(): js.UndefOr[T] = js.native
    
    def push(item: T): Unit = js.native
    
    def reduce[U, V](
      callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U]
    ): U = js.native
    def reduce[U, V](
      callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U],
      initialValue: U
    ): U = js.native
    def reduce[U, V](
      callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U],
      initialValue: U,
      thisArg: V
    ): U = js.native
    def reduce[U, V](
      callbackfn: js.ThisFunction4[/* this */ V, /* acc */ U, /* value */ T, /* index */ Double, /* list */ this.type, U],
      initialValue: Unit,
      thisArg: V
    ): U = js.native
    
    def shift(): js.UndefOr[T] = js.native
    
    def slice(): js.Array[T] = js.native
    def slice(start: Double): js.Array[T] = js.native
    def slice(start: Double, end: Double): js.Array[T] = js.native
    def slice(start: Unit, end: Double): js.Array[T] = js.native
    
    def unshift(item: T): Unit = js.native
  }
  
  type _To = FastListFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FastListFactory = ^
}
