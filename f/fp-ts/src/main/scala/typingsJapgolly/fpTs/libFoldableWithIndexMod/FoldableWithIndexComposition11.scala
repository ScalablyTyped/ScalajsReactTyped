package typingsJapgolly.fpTs.libFoldableWithIndexMod

import typingsJapgolly.fpTs.libFoldableMod.FoldableComposition11
import typingsJapgolly.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableWithIndexComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, GI]
  extends StObject
     with FoldableComposition11[F, G] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, M], 
    M
  ]
  
  def reduceRightWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  
  def reduceWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}
object FoldableWithIndexComposition11 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, GI](
    foldMap: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fa */ Any, 
      /* f */ js.Function1[/* a */ Any, Any], 
      Any
    ],
    foldMapWithIndex: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, Any], 
      Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRightWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any,
    reduceWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
  ): FoldableWithIndexComposition11[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), reduceRightWithIndex = js.Any.fromFunction3(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
    __obj.asInstanceOf[FoldableWithIndexComposition11[F, FI, G, GI]]
  }
  
  extension [Self <: FoldableWithIndexComposition11[?, ?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, GI](x: Self & (FoldableWithIndexComposition11[F, FI, G, GI])) {
    
    inline def setFoldMapWithIndex(
      value: Monoid[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
          /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ Any, Any], 
          Any
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    inline def setReduceRightWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction3(value))
    
    inline def setReduceWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ Any, Any, js.Function3[/* i */ js.Tuple2[FI, GI], Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction3(value))
  }
}
