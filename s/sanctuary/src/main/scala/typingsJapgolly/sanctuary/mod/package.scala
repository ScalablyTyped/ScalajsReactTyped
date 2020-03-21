package typingsJapgolly.sanctuary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Alt[A] = typingsJapgolly.sanctuary.mod.Functor[A]
  type Applicative[A] = typingsJapgolly.sanctuary.mod.Apply[A]
  type Apply[A] = typingsJapgolly.sanctuary.mod.Functor[A]
  type Bifunctor[A, C] = typingsJapgolly.sanctuary.mod.Functor[C]
  type Category[A] = typingsJapgolly.sanctuary.mod.Semigroupoid[A, A]
  type Chain[A] = typingsJapgolly.sanctuary.mod.Apply[A]
  type ChainRec[A] = typingsJapgolly.sanctuary.mod.Chain[A]
  type Comonad[A] = typingsJapgolly.sanctuary.mod.Extend[A]
  type Extend[A] = typingsJapgolly.sanctuary.mod.Functor[A]
  type FiniteNumber = scala.Double
  type Fn[A, B] = js.Function1[/* a */ A, B]
  type Fn2[A, B, C] = js.Function1[/* a */ A, js.Function1[/* b */ B, C]]
  type Fn2_[A, B, C] = js.Function2[/* a */ A, /* b */ B, C]
  type Fn3[A, B, C, D] = js.Function1[/* a */ A, js.Function1[/* b */ B, js.Function1[/* c */ C, D]]]
  type Fn3_[A, B, C, D] = js.Function3[/* a */ A, /* b */ B, /* c */ C, D]
  type Fn4[A, B, C, D, E] = js.Function1[
    /* a */ A, 
    js.Function1[/* b */ B, js.Function1[/* c */ C, js.Function1[/* d */ D, E]]]
  ]
  type Fn4_[A, B, C, D, E] = js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]
  type Fn5[A, B, C, D, E, F] = js.Function1[
    /* a */ A, 
    js.Function1[
      /* b */ B, 
      js.Function1[/* c */ C, js.Function1[/* d */ D, js.Function1[/* e */ E, F]]]
    ]
  ]
  type Fn5_[A, B, C, D, E, F] = js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F]
  type Integer = scala.Double
  type Monoid[A] = typingsJapgolly.sanctuary.mod.Semigroup[A]
  type NonNegativeInteger = scala.Double
  type NonZeroFiniteNumber = scala.Double
  type Nullable[A] = A | scala.Null
  type Ord[A] = typingsJapgolly.sanctuary.mod.Setoid[A]
  type Pair[A, B] = js.Tuple2[A, B]
  type Plus[A] = typingsJapgolly.sanctuary.mod.Alt[A]
  type Predicate[A] = js.Function1[/* a */ A, scala.Boolean]
  type Profunctor[B, C] = typingsJapgolly.sanctuary.mod.Functor[C]
  type StrMap[A] = org.scalablytyped.runtime.StringDictionary[A]
  type Thunk[A] = js.Function0[A]
  type ValidNumber = scala.Double
}
