package typingsJapgolly.fpTs.libFilterableMod

import typingsJapgolly.fpTs.libCompactableMod.Compactable2C
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFunctorMod.Functor2C
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import typingsJapgolly.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filterable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
  extends StObject
     with Functor2C[F, E]
     with Compactable2C[F, E] {
  
  /* InferMemberOverrides */
  override val URI: F = js.native
  
  /* InferMemberOverrides */
  override val _E: E = js.native
  
  def filter[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    predicate: Predicate[A]
  ): Any = js.native
  
  def filterMap[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    f: js.Function1[/* a */ A, Option_[B]]
  ): Any = js.native
  
  @JSName("filter")
  def filter_AB[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    refinement: Refinement[A, B]
  ): Any = js.native
  
  def partition[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    predicate: Predicate[A]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ] = js.native
  
  def partitionMap[A, B, C](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    f: js.Function1[/* a */ A, Either_[B, C]]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, C> */ Any
  ] = js.native
  
  @JSName("partition")
  def partition_AB[A, B /* <: A */](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
    refinement: Refinement[A, B]
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
  ] = js.native
}
