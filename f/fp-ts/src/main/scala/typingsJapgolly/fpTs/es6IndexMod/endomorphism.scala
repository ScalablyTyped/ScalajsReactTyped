package typingsJapgolly.fpTs.es6IndexMod

import typingsJapgolly.fpTs.libEndomorphismMod.Endomorphism
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import typingsJapgolly.fpTs.libSemigroupMod.Semigroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endomorphism {
  
  @JSImport("fp-ts/es6/index", "endomorphism")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/es6/index", "endomorphism.URI")
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
