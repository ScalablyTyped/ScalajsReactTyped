package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libMonadMod.Monad
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import typingsJapgolly.fpTs.libValidationTMod.ValidationM
import typingsJapgolly.fpTs.libValidationTMod.ValidationM1
import typingsJapgolly.fpTs.libValidationTMod.ValidationM2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6ValidationTMod {
  
  @JSImport("fp-ts/es6/ValidationT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValidationM[E, M](S: Semigroup[E], M: Monad[M]): ValidationM[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](S: Semigroup[E], M: Monad1[M]): ValidationM1[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM1[M, E]]
  inline def getValidationM[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Semigroup[E], M: Monad2[M]): ValidationM2[M, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationM")(S.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[ValidationM2[M, E]]
}
