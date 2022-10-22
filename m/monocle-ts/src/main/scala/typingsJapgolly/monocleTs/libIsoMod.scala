package typingsJapgolly.monocleTs

import typingsJapgolly.fpTs.libCategoryMod.Category2
import typingsJapgolly.fpTs.libEitherMod.Either_
import typingsJapgolly.fpTs.libFunctionMod.Predicate
import typingsJapgolly.fpTs.libFunctionMod.Refinement
import typingsJapgolly.fpTs.libFunctorMod.Functor
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libFunctorMod.Functor3
import typingsJapgolly.fpTs.libInvariantMod.Invariant2
import typingsJapgolly.fpTs.libOptionMod.Option_
import typingsJapgolly.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typingsJapgolly.fpTs.libSemigroupoidMod.Semigroupoid2
import typingsJapgolly.fpTs.libTraversableMod.Traversable1
import typingsJapgolly.monocleTs.libLensMod.Lens_
import typingsJapgolly.monocleTs.libOptionalMod.Optional_
import typingsJapgolly.monocleTs.libPrismMod.Prism_
import typingsJapgolly.monocleTs.libTraversalMod.Traversal_
import typingsJapgolly.std.NonNullable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsoMod {
  
  @JSImport("monocle-ts/lib/Iso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts/lib/Iso", "Category")
  @js.native
  val Category: Category2[typingsJapgolly.monocleTs.libIsoMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Iso", "Invariant")
  @js.native
  val Invariant: Invariant2[typingsJapgolly.monocleTs.libIsoMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Iso", "Semigroupoid")
  @js.native
  val Semigroupoid: Semigroupoid2[typingsJapgolly.monocleTs.libIsoMod.URI] = js.native
  
  @JSImport("monocle-ts/lib/Iso", "URI")
  @js.native
  val URI: /* "monocle-ts/Iso" */ String = js.native
  type URI = /* "monocle-ts/Iso" */ String
  
  inline def asLens[S, A](sa: Iso_[S, A]): Lens_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asLens")(sa.asInstanceOf[js.Any]).asInstanceOf[Lens_[S, A]]
  
  inline def asOptional[S, A](sa: Iso_[S, A]): Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[Optional_[S, A]]
  
  inline def asPrism[S, A](sa: Iso_[S, A]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asPrism")(sa.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def asTraversal[S, A](sa: Iso_[S, A]): Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[Traversal_[S, A]]
  
  inline def atKey(key: String): js.Function1[/* sa */ Iso_[Any, Record[String, Any]], Lens_[Any, Option_[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, Record[String, Any]], Lens_[Any, Option_[Any]]]]
  
  inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def compose[A, B](ab: Iso_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]]]
  
  inline def composeIso[A, B](ab: Iso_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]]]
  
  inline def composeLens[A, B](ab: Lens_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Lens_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Lens_[Any, B]]]
  
  inline def composeOptional[A, B](ab: Optional_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Optional_[Any, B]]]
  
  inline def composePrism[A, B](ab: Prism_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, B]]]
  
  inline def composeTraversal[A, B](ab: Traversal_[A, B]): js.Function1[/* sa */ Iso_[Any, A], Traversal_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Traversal_[Any, B]]]
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, A]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Prism_[Any, B]]]
  
  inline def findFirst[A](predicate: Predicate[A]): js.Function1[/* sa */ Iso_[Any, js.Array[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, js.Array[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, A]]]
  
  inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[A]], Optional_[Any, B]]]
  
  inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* sa */ Iso_[Any, js.Array[A]], Optional_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, js.Array[A]], Optional_[Any, B]]]
  
  inline def fromNullable[S, A](sa: Iso_[S, A]): Prism_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, NonNullable[A]]]
  
  inline def id[S](): Iso_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Iso_[S, S]]
  
  inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], Iso_[Any, B]]]
  
  inline def index(i: Double): js.Function1[/* sa */ Iso_[Any, js.Array[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, js.Array[Any]], Optional_[Any, Any]]]
  
  inline def indexNonEmpty(i: Double): js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, ReadonlyNonEmptyArray_[Any]], Optional_[Any, Any]]]
  
  inline def iso[S, A](get: js.Function1[/* s */ S, A], reverseGet: js.Function1[/* a */ A, S]): Iso_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("iso")(get.asInstanceOf[js.Any], reverseGet.asInstanceOf[js.Any])).asInstanceOf[Iso_[S, A]]
  
  inline def key(key: String): js.Function1[/* sa */ Iso_[Any, Record[String, Any]], Optional_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, Record[String, Any]], Optional_[Any, Any]]]
  
  inline def left[S, E, A](sea: Iso_[S, Either_[E, A]]): Prism_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, E]]
  
  inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ Iso_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ Iso_[Any, A], js.Function1[/* s */ Any, Any]]]
  
  inline def modifyF[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
      ]
    ]
  ]]
  inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
    ], 
    js.Function1[
      /* sa */ Iso_[Any, Any], 
      js.Function1[
        /* s */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
      ]
    ]
  ]]
  
  inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
    ]
  ]]
  
  inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: A[K]} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
    /* sa */ Iso_[Any, A], 
    Lens_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in P ]: A[K]} */ js.Any
    ]
  ]]
  
  inline def reverse[S, A](sa: Iso_[S, A]): Iso_[A, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(sa.asInstanceOf[js.Any]).asInstanceOf[Iso_[A, S]]
  
  inline def right[S, E, A](sea: Iso_[S, Either_[E, A]]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def some[S, A](soa: Iso_[S, Option_[A]]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
    /* sta */ Iso_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* sta */ Iso_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
    ], 
    Traversal_[Any, Any]
  ]]
  
  trait Iso_[S, A] extends StObject {
    
    def get(s: S): A
    
    def reverseGet(a: A): S
  }
  object Iso_ {
    
    inline def apply[S, A](get: S => A, reverseGet: A => S): Iso_[S, A] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reverseGet = js.Any.fromFunction1(reverseGet))
      __obj.asInstanceOf[Iso_[S, A]]
    }
    
    extension [Self <: Iso_[?, ?], S, A](x: Self & (Iso_[S, A])) {
      
      inline def setGet(value: S => A): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setReverseGet(value: A => S): Self = StObject.set(x, "reverseGet", js.Any.fromFunction1(value))
    }
  }
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
