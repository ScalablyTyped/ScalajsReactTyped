package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libCategoryMod.Category
import typingsJapgolly.fpTs.libCategoryMod.Category2
import typingsJapgolly.fpTs.libCategoryMod.Category3
import typingsJapgolly.fpTs.libCategoryMod.Category4
import typingsJapgolly.fpTs.libChoiceMod.Choice
import typingsJapgolly.fpTs.libChoiceMod.Choice2
import typingsJapgolly.fpTs.libChoiceMod.Choice3
import typingsJapgolly.fpTs.libChoiceMod.Choice4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6ChoiceMod {
  
  @JSImport("fp-ts/es6/Choice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fanIn_[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](P: Choice2[P], C: Category2[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, Either<A, B>, C> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanIn")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, Either<A, B>, C> */ Any
  ]]
  inline def fanIn_[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](P: Choice3[P], C: Category3[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, Either<A, B>, C> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanIn")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, Either<A, B>, C> */ Any
  ]]
  inline def fanIn_[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](P: Choice4[P], C: Category4[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, Either<A, B>, C> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanIn")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, Either<A, B>, C> */ Any
  ]]
  inline def fanIn_[P](P: Choice[P], C: Category[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, Either<A, B>, C> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanIn")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, Either<A, B>, C> */ Any
  ]]
  
  inline def fanin[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, B>, C> */ Any
  ]]
  inline def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, B>, C> */ Any
  ]]
  inline def fanin[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanin")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ /* pbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, B>, C> */ Any
  ]]
  
  inline def split[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](P: Choice2[P], C: Category2[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, Either<A, C>, Either<B, D>> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<P, Either<A, C>, Either<B, D>> */ Any
  ]]
  inline def split[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](P: Choice3[P], C: Category3[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, Either<A, C>, Either<B, D>> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<P, R, Either<A, C>, Either<B, D>> */ Any
  ]]
  inline def split[P /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](P: Choice4[P], C: Category4[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, Either<A, C>, Either<B, D>> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<P, S, R, Either<A, C>, Either<B, D>> */ Any
  ]]
  inline def split[P](P: Choice[P], C: Category[P]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, Either<A, C>, Either<B, D>> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(P.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<P, Either<A, C>, Either<B, D>> */ Any
  ]]
  
  inline def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Category2[F] & Choice2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, Either<A, C>, Either<B, D>> */ Any
  ]]
  inline def splitChoice[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Category3[F] & Choice3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, Either<A, C>, Either<B, D>> */ Any
  ]]
  inline def splitChoice[F](F: Category[F] & Choice[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitChoice")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, Either<A, C>, Either<B, D>> */ Any
  ]]
}
