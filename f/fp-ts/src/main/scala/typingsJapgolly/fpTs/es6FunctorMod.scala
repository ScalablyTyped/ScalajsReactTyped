package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libFunctorMod.Functor
import typingsJapgolly.fpTs.libFunctorMod.Functor1
import typingsJapgolly.fpTs.libFunctorMod.Functor2
import typingsJapgolly.fpTs.libFunctorMod.Functor2C
import typingsJapgolly.fpTs.libFunctorMod.Functor3
import typingsJapgolly.fpTs.libFunctorMod.Functor3C
import typingsJapgolly.fpTs.libFunctorMod.Functor4
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition11
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition12
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition12C
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition21
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition22
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition22C
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition23C
import typingsJapgolly.fpTs.libFunctorMod.FunctorComposition2C1
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6FunctorMod {
  
  @JSImport("fp-ts/es6/Functor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bindTo[F](F: Functor[F]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  inline def bindTo[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* name */ String, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in N ]: A}> */ Any
    ]
  ]]
  
  inline def flap[F](F: Functor[F]): js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ]]
  inline def flap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ]]
  inline def flap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ]]
  inline def flap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  inline def flap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ]]
  
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Functor1[G]): FunctorComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition11[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor1[F], G: Functor2[G]): FunctorComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition12[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor2[F], G: Functor1[G]): FunctorComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition21[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F], G: Functor2[G]): FunctorComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition22[F, G]]
  inline def getFunctorComposition[F, G](F: Functor[F], G: Functor[G]): FunctorComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition[F, G]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor1[F], G: Functor2C[G, E]): FunctorComposition12C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition12C[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, E](F: Functor2C[F, E], G: Functor1[G]): FunctorComposition2C1[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition2C1[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2[F], G: Functor2C[G, E]): FunctorComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition22C[F, G, E]]
  inline def getFunctorComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor2[F], G: Functor3C[G, E]): FunctorComposition23C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFunctorComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FunctorComposition23C[F, G, E]]
  
  inline def let[F](F: Functor[F]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  /**
    * @since 2.13.0
    */
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Functor2C[F, E]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  inline def let[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Functor3C[F, E]): js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("let")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* name */ Exclude[String, /* keyof any */ String], 
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}> */ Any
    ]
  ]]
  
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F], G: Functor1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor1[F], G: Functor2[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor1[F], G: Functor3[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<G, R, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<G, R, E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<G, R, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind3<G, R, E, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor2[F], G: Functor1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F], G: Functor2[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, EF, Kind2<G, EG, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, EF, Kind2<G, EG, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, EF, Kind2<G, EG, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, EF, Kind2<G, EG, B>> */ Any
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor3[F], G: Functor1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Kind<G, B>> */ Any
    ]
  ]]
  inline def map[F, G](F: Functor[F], G: Functor[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, B>> */ Any
    ]
  ]]
  inline def map[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor[F], G: Functor1[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind<G, B>> */ Any
    ]
  ]]
  inline def map[F, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor[F], G: Functor2[G]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, B>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, A>> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Kind2<G, E, B>> */ Any
    ]
  ]]
}
