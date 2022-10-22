package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libOrdMod.Ord_
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6StringMod {
  
  @JSImport("fp-ts/es6/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/string", "Eq")
  @js.native
  val Eq: typingsJapgolly.fpTs.libEqMod.Eq[String] = js.native
  
  @JSImport("fp-ts/es6/string", "Monoid")
  @js.native
  val Monoid: typingsJapgolly.fpTs.libMonoidMod.Monoid[String] = js.native
  
  @JSImport("fp-ts/es6/string", "Ord")
  @js.native
  val Ord: Ord_[String] = js.native
  
  @JSImport("fp-ts/es6/string", "Semigroup")
  @js.native
  val Semigroup: typingsJapgolly.fpTs.libSemigroupMod.Semigroup[String] = js.native
  
  @JSImport("fp-ts/es6/string", "Show")
  @js.native
  val Show: typingsJapgolly.fpTs.libShowMod.Show[String] = js.native
  
  @JSImport("fp-ts/es6/string", "empty")
  @js.native
  val empty: /* "" */ String = js.native
  
  inline def endsWith(searchString: String): js.Function1[/* s */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(searchString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  inline def endsWith(searchString: String, position: Double): js.Function1[/* s */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  
  inline def includes(searchString: String): js.Function1[/* s */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  inline def includes(searchString: String, position: Double): js.Function1[/* s */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  
  inline def isEmpty(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("fp-ts/es6/string", "isString")
  @js.native
  val isString: Refinement[Any, String] = js.native
  
  inline def replace(searchValue: String, replaceValue: String): js.Function1[/* s */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(searchValue.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, String]]
  inline def replace(searchValue: js.RegExp, replaceValue: String): js.Function1[/* s */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(searchValue.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, String]]
  
  inline def size(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def slice(start: Double, end: Double): js.Function1[/* s */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, String]]
  
  inline def split(separator: String): js.Function1[/* s */ String, ReadonlyNonEmptyArray_[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(separator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, ReadonlyNonEmptyArray_[String]]]
  inline def split(separator: js.RegExp): js.Function1[/* s */ String, ReadonlyNonEmptyArray_[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(separator.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, ReadonlyNonEmptyArray_[String]]]
  
  inline def startsWith(searchString: String): js.Function1[/* s */ String, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(searchString.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  inline def startsWith(searchString: String, position: Double): js.Function1[/* s */ String, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(searchString.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* s */ String, Boolean]]
  
  inline def toLowerCase(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLowerCase")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toUpperCase(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperCase")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trim(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimLeft(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimLeft")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimRight(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimRight")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
