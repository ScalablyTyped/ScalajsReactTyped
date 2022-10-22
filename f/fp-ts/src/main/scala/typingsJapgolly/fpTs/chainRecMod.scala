package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libEitherMod.Either_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object chainRecMod {
  
  @JSImport("fp-ts/ChainRec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tailRec[A, B](startWith: A, f: js.Function1[/* a */ A, Either_[A, B]]): B = (^.asInstanceOf[js.Dynamic].applyDynamic("tailRec")(startWith.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[B]
}
