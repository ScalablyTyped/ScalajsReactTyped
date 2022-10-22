package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libHeytingAlgebraMod.HeytingAlgebra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBooleanAlgebraMod {
  
  @JSImport("fp-ts/lib/BooleanAlgebra", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/BooleanAlgebra", "booleanAlgebraBoolean")
  @js.native
  val booleanAlgebraBoolean: BooleanAlgebra[Boolean] = js.native
  
  @JSImport("fp-ts/lib/BooleanAlgebra", "booleanAlgebraVoid")
  @js.native
  val booleanAlgebraVoid: BooleanAlgebra[Unit] = js.native
  
  inline def getDualBooleanAlgebra[A](B: BooleanAlgebra[A]): BooleanAlgebra[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDualBooleanAlgebra")(B.asInstanceOf[js.Any]).asInstanceOf[BooleanAlgebra[A]]
  
  inline def getFunctionBooleanAlgebra[B](B: BooleanAlgebra[B]): js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionBooleanAlgebra")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function0[BooleanAlgebra[js.Function1[/* a */ scala.Nothing, B]]]]
  
  inline def reverse[A](B: BooleanAlgebra[A]): BooleanAlgebra[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(B.asInstanceOf[js.Any]).asInstanceOf[BooleanAlgebra[A]]
  
  type BooleanAlgebra[A] = HeytingAlgebra[A]
}
