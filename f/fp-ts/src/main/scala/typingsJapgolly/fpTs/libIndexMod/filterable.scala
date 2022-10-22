package typingsJapgolly.fpTs.libIndexMod

import typingsJapgolly.fpTs.anon.Fn10
import typingsJapgolly.fpTs.anon.Fn11
import typingsJapgolly.fpTs.anon.Fn9
import typingsJapgolly.fpTs.anon.FnCallRefinement
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFilterableMod.Filterable
import typingsJapgolly.fpTs.libFilterableMod.Filterable1
import typingsJapgolly.fpTs.libFilterableMod.Filterable2
import typingsJapgolly.fpTs.libFilterableMod.Filterable2C
import typingsJapgolly.fpTs.libFilterableMod.Filterable3C
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition11
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition12
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition12C
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition21
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition22
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition22C
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition23C
import typingsJapgolly.fpTs.libFilterableMod.FilterableComposition2C1
import typingsJapgolly.fpTs.libFunctorMod.Functor
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libFunctorMod.Functor2C
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterable {
  
  @JSImport("fp-ts/lib/index", "filterable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Filterable1[G]): Fn9 = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn9]
  inline def filter[F, G](F: Functor[F], G: Filterable[G]): Fn9 = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn9]
  inline def filter[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Filterable2C[G, E]): Fn9 = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn9]
  inline def filter[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Filterable2C[G, E]): FnCallRefinement = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FnCallRefinement]
  
  inline def filterMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Filterable1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
    ]
  ]]
  inline def filterMap[F, G](F: Functor[F], G: Filterable[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
    ]
  ]]
  inline def filterMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Filterable2C[G, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
    ]
  ]]
  inline def filterMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Filterable2C[G, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fga */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any
    ]
  ]]
  
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Filterable1[G]): FilterableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition11[F, G]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor1[F], G: Filterable2[G]): FilterableComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition12[F, G]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor2[F], G: Filterable1[G]): FilterableComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition21[F, G]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F], G: Filterable2[G]): FilterableComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition22[F, G]]
  inline def getFilterableComposition[F, G](F: Functor[F], G: Filterable[G]): FilterableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition[F, G]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Filterable2C[G, E]): FilterableComposition12C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition12C[F, G, E]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](F: Functor2C[F, E], G: Filterable1[G]): FilterableComposition2C1[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition2C1[F, G, E]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Filterable2C[G, E]): FilterableComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition22C[F, G, E]]
  inline def getFilterableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor2[F], G: Filterable3C[G, E]): FilterableComposition23C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FilterableComposition23C[F, G, E]]
  
  inline def partition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Filterable1[G]): Fn11 = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn11]
  inline def partition[F, G](F: Functor[F], G: Filterable[G]): Fn11 = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn11]
  inline def partition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Filterable2C[G, E]): Fn11 = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn11]
  inline def partition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Filterable2C[G, E]): Fn10 = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn10]
  
  inline def partitionMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Filterable1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, C>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, C>> */ Any
      ]
    ]
  ]]
  inline def partitionMap[F, G](F: Functor[F], G: Filterable[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, C>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, C>> */ Any
      ]
    ]
  ]]
  inline def partitionMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Filterable2C[G, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, C>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, C>> */ Any
      ]
    ]
  ]]
  inline def partitionMap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Filterable2C[G, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Either_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fa */ Any, 
      Separated_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, B>> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, C>> */ Any
      ]
    ]
  ]]
}
