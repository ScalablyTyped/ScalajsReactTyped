package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.wixStyleReact.anon.Delta
import typingsJapgolly.wixStyleReact.anon.GetBoundingClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselWIPUtilsMod {
  
  @JSImport("wix-style-react/dist/types/CarouselWIP/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animate(el: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def animate(el: Any, hasDeltaImmediateDurationEasingProp: Delta): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(el.asInstanceOf[js.Any], hasDeltaImmediateDurationEasingProp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def easeOutQuint(t: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easeOutQuint")(t.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def includes(`val`: Any, arr: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(`val`.asInstanceOf[js.Any], arr.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isWhollyInView(parent: Any): js.Function1[/* child */ js.UndefOr[GetBoundingClientRect], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhollyInView")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* child */ js.UndefOr[GetBoundingClientRect], Boolean]]
  
  inline def nop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nop")().asInstanceOf[Unit]
  
  inline def normalizeIndex(idx: Any, len: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIndex")(idx.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def normalizeIndex(idx: Any, len: Any, wrap: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIndex")(idx.asInstanceOf[js.Any], len.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def values(o: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def values[T](o: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def values[T](o: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
