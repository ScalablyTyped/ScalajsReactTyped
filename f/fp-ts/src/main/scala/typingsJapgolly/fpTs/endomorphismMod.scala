package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libEndomorphismMod.Endomorphism
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object endomorphismMod {
  
  @JSImport("fp-ts/Endomorphism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/Endomorphism", "URI")
  @js.native
  val URI: /* "Endomorphism" */ String = js.native
  
  inline def getMonoid[A](): Monoid[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")().asInstanceOf[Monoid[Endomorphism[A]]]
  
  inline def getSemigroup[A](): Semigroup[Endomorphism[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")().asInstanceOf[Semigroup[Endomorphism[A]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
