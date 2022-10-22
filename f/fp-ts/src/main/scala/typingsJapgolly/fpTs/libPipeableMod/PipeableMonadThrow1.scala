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
trait PipeableMonadThrow1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
  
  def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  @JSName("filterOrElse")
  def filterOrElse_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* ma */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ] = js.native
  
  def fromEither[E, A](ma: Either_[E, A]): Any = js.native
  
  def fromOption[E](onNone: Lazy[E]): js.Function1[
    /* ma */ Option_[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  @JSName("fromPredicate")
  def fromPredicate_EAB[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[
    /* a */ A, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ] = js.native
}
