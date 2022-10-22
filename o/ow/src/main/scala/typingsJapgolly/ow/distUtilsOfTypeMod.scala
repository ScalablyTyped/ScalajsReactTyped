package typingsJapgolly.ow

import typingsJapgolly.ow.distPredicatesBasePredicateMod.BasePredicate
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsOfTypeMod {
  
  @JSImport("ow/dist/utils/of-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](source: js.Array[T], name: String, predicate: BasePredicate[T]): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  /**
  Test all the values in the collection against a provided predicate.
  @hidden
  @param source Source collection to test.
  @param name The name to call the collection of values, such as `values` or `keys`.
  @param predicate Predicate to test every item in the source collection against.
  */
  inline def default[T](source: IterableIterator[T], name: String, predicate: BasePredicate[T]): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
  inline def default[T](source: Set[T], name: String, predicate: BasePredicate[T]): Boolean | String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean | String]
}
