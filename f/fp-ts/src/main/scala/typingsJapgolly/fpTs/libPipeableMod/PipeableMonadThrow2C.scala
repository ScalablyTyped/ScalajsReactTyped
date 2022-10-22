package typingsJapgolly.fpTs.libPipeableMod

import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFunctionMod.Lazy
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libPredicateMod.Predicate
import typingsJapgolly.fpTs.libRefinementMod.Refinement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipeableMonadThrow2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
  
  def filterOrElse[A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_AB[A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
  ] = js.native
  
  def fromEither[A](ma: Either_[E, A]): Any = js.native
  
  def fromOption(onNone: Lazy[E]): js.Function1[
    /* ma */ Option_[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ] = js.native
  
  def fromPredicate[A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ] = js.native
  @JSName("fromPredicate")
  def fromPredicate_AB[A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
  ] = js.native
}
