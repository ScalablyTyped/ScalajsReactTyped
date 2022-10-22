package typingsJapgolly.fpTs.indexMod

import typingsJapgolly.fpTs.libCategoryMod.Category
import typingsJapgolly.fpTs.libCategoryMod.Category2
import typingsJapgolly.fpTs.libCategoryMod.Category3
import typingsJapgolly.fpTs.libCategoryMod.Category4
import typingsJapgolly.fpTs.libStrongMod.Strong
import typingsJapgolly.fpTs.libStrongMod.Strong2
import typingsJapgolly.fpTs.libStrongMod.Strong3
import typingsJapgolly.fpTs.libStrongMod.Strong4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strong {
  
  @JSImport("fp-ts/index", "strong")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fanOut_[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Strong2[F], C: Category2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, [B, C]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanOut")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, [B, C]> */ Any
  ]]
  inline def fanOut_[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](S: Strong3[F], C: Category3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, [B, C]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanOut")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, [B, C]> */ Any
  ]]
  inline def fanOut_[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](S: Strong4[F], C: Category4[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, [B, C]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanOut")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, [B, C]> */ Any
  ]]
  inline def fanOut_[F](S: Strong[F], C: Category[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, [B, C]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("fanOut")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, [B, C]> */ Any
  ]]
  
  inline def fanout[F](F: Category[F] & Strong[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, [B, C]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanout")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, [B, C]> */ Any
  ]]
  inline def fanout[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Category4[F] & Strong4[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, [B, C]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanout")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, [B, C]> */ Any
  ]]
  inline def fanout[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Category2[F] & Strong2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, [B, C]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanout")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, [B, C]> */ Any
  ]]
  inline def fanout[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Category3[F] & Strong3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, [B, C]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fanout")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, C> */ /* pac */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, [B, C]> */ Any
  ]]
  
  inline def split[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Strong2[F], C: Category2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, D]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, D]> */ Any
  ]]
  inline def split[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](S: Strong3[F], C: Category3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, [A, C], [B, D]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, [A, C], [B, D]> */ Any
  ]]
  inline def split[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](S: Strong4[F], C: Category4[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, [A, C], [B, D]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, [A, C], [B, D]> */ Any
  ]]
  inline def split[F](S: Strong[F], C: Category[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, [A, C], [B, D]> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(S.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, [A, C], [B, D]> */ Any
  ]]
  
  inline def splitStrong[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Category3[F] & Strong3[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, [A, C], [B, D]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStrong")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, [A, C], [B, D]> */ Any
  ]]
  inline def splitStrong[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Category2[F] & Strong2[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, D]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStrong")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, [A, C], [B, D]> */ Any
  ]]
  inline def splitStrong[F](F: Category[F] & Strong[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, [A, C], [B, D]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStrong")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, [A, C], [B, D]> */ Any
  ]]
  inline def splitStrong[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Category4[F] & Strong4[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, [A, C], [B, D]> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitStrong")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ /* pab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, C, D> */ /* pcd */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, [A, C], [B, D]> */ Any
  ]]
}
