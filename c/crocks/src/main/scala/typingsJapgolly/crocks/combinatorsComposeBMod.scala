package typingsJapgolly.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combinatorsComposeBMod {
  
  @JSImport("crocks/combinators/composeB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[A, B, C](f: js.Function1[/* b */ B, C]): js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* g */ js.Function1[/* a */ A, B], js.Function1[/* x */ A, C]]]
  inline def default[A, B, C](f: js.Function1[/* b */ B, C], g: js.Function1[/* a */ A, B]): js.Function1[/* x */ A, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, C]]
}
