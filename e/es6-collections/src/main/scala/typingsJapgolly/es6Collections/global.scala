package typingsJapgolly.es6Collections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Map")
  @js.native
  open class Map[K, V] ()
    extends StObject
       with typingsJapgolly.es6Collections.Map[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSGlobal("Map")
  @js.native
  def Map: MapConstructor = js.native
  inline def Map_=(x: MapConstructor): Unit = js.Dynamic.global.updateDynamic("Map")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Set")
  @js.native
  open class Set[T] ()
    extends StObject
       with typingsJapgolly.es6Collections.Set[T] {
    def this(iterable: ForEachable[T]) = this()
  }
  @JSGlobal("Set")
  @js.native
  def Set: SetConstructor = js.native
  inline def Set_=(x: SetConstructor): Unit = js.Dynamic.global.updateDynamic("Set")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakMap")
  @js.native
  open class WeakMap[K /* <: js.Object */, V] ()
    extends StObject
       with typingsJapgolly.es6Collections.WeakMap[K, V] {
    def this(iterable: ForEachable[js.Tuple2[K, V]]) = this()
  }
  @JSGlobal("WeakMap")
  @js.native
  def WeakMap: WeakMapConstructor = js.native
  inline def WeakMap_=(x: WeakMapConstructor): Unit = js.Dynamic.global.updateDynamic("WeakMap")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WeakSet")
  @js.native
  open class WeakSet[T] ()
    extends StObject
       with typingsJapgolly.es6Collections.WeakSet[T] {
    def this(iterable: ForEachable[T]) = this()
    
    /* CompleteClass */
    override def add(value: T): typingsJapgolly.es6Collections.WeakSet[T] = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(value: T): Boolean = js.native
    
    /* CompleteClass */
    override def has(value: T): Boolean = js.native
  }
  @JSGlobal("WeakSet")
  @js.native
  def WeakSet: WeakSetConstructor = js.native
  inline def WeakSet_=(x: WeakSetConstructor): Unit = js.Dynamic.global.updateDynamic("WeakSet")(x.asInstanceOf[js.Any])
}
