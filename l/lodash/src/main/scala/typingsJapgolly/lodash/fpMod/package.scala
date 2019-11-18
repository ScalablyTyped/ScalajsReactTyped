package typingsJapgolly.lodash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fpMod {
  import typingsJapgolly.lodash.Typeoflodash
  import typingsJapgolly.lodash.lodashMod.AssignCustomizer
  import typingsJapgolly.lodash.lodashMod.Cancelable
  import typingsJapgolly.lodash.lodashMod.CloneDeepWithCustomizer
  import typingsJapgolly.lodash.lodashMod.Comparator
  import typingsJapgolly.lodash.lodashMod.Comparator2
  import typingsJapgolly.lodash.lodashMod.CondPair
  import typingsJapgolly.lodash.lodashMod.ConformsPredicateObject
  import typingsJapgolly.lodash.lodashMod.CurriedFunction1
  import typingsJapgolly.lodash.lodashMod.CurriedFunction2
  import typingsJapgolly.lodash.lodashMod.CurriedFunction3
  import typingsJapgolly.lodash.lodashMod.CurriedFunction4
  import typingsJapgolly.lodash.lodashMod.CurriedFunction5
  import typingsJapgolly.lodash.lodashMod.Dictionary
  import typingsJapgolly.lodash.lodashMod.Function0
  import typingsJapgolly.lodash.lodashMod.Function1
  import typingsJapgolly.lodash.lodashMod.Function2
  import typingsJapgolly.lodash.lodashMod.Function3
  import typingsJapgolly.lodash.lodashMod.Function4
  import typingsJapgolly.lodash.lodashMod.IsEqualCustomizer
  import typingsJapgolly.lodash.lodashMod.List
  import typingsJapgolly.lodash.lodashMod.ListOfRecursiveArraysOrValues
  import typingsJapgolly.lodash.lodashMod.LoDashStatic
  import typingsJapgolly.lodash.lodashMod.Many
  import typingsJapgolly.lodash.lodashMod.MemoIteratorCapped
  import typingsJapgolly.lodash.lodashMod.MemoIteratorCappedRight
  import typingsJapgolly.lodash.lodashMod.MemoVoidIteratorCapped
  import typingsJapgolly.lodash.lodashMod.MemoizedFunction
  import typingsJapgolly.lodash.lodashMod.MergeWithCustomizer
  import typingsJapgolly.lodash.lodashMod.NotVoid
  import typingsJapgolly.lodash.lodashMod.NumericDictionary
  import typingsJapgolly.lodash.lodashMod.Omit
  import typingsJapgolly.lodash.lodashMod.PartialDeep
  import typingsJapgolly.lodash.lodashMod.PartialObject
  import typingsJapgolly.lodash.lodashMod.PropertyName
  import typingsJapgolly.lodash.lodashMod.PropertyPath
  import typingsJapgolly.lodash.lodashMod.ReplaceFunction
  import typingsJapgolly.lodash.lodashMod.RightCurriedFunction1
  import typingsJapgolly.lodash.lodashMod.RightCurriedFunction2
  import typingsJapgolly.lodash.lodashMod.RightCurriedFunction3
  import typingsJapgolly.lodash.lodashMod.RightCurriedFunction4
  import typingsJapgolly.lodash.lodashMod.RightCurriedFunction5
  import typingsJapgolly.lodash.lodashMod.SetWithCustomizer
  import typingsJapgolly.lodash.lodashMod.TemplateExecutor
  import typingsJapgolly.lodash.lodashMod.TruncateOptions
  import typingsJapgolly.lodash.lodashMod.ValueIteratee
  import typingsJapgolly.lodash.lodashMod.ValueIterateeCustom
  import typingsJapgolly.lodash.lodashMod.ValueKeyIteratee
  import typingsJapgolly.lodash.lodashMod.isMatchWithCustomizer
  import typingsJapgolly.lodash.lodashNumbers.`0`
  import typingsJapgolly.lodash.lodashNumbers.`false`
  import typingsJapgolly.lodash.lodashNumbers.`true`
  import typingsJapgolly.lodash.lodashStrings.Empty
  import typingsJapgolly.lodash.lodashStrings.asc
  import typingsJapgolly.lodash.lodashStrings.desc
  import typingsJapgolly.std.Error
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.NonNullable
  import typingsJapgolly.std.Pick
  import typingsJapgolly.std.RegExp

  type LodashAdd1x1 = js.Function1[/* addend */ Double, Double]
  type LodashAdd1x2 = js.Function1[/* augend */ Double, Double]
  type LodashAfter1x1[TFunc] = js.Function1[/* n */ Double, TFunc]
  type LodashAfter1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashApply = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashAry1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashAry1x2 = js.Function1[/* n */ Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashAssign1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssign1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashAssignAllWith1x2 = js.Function1[/* customizer */ AssignCustomizer, js.Any]
  type LodashAssignIn1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignIn1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignInAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashAssignInAllWith1x2 = js.Function1[/* customizer */ AssignCustomizer, js.Any]
  type LodashAssignInWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignInWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignInWith1x6[TObject, TSource] = js.Function1[/* customizer */ AssignCustomizer, TObject with TSource]
  type LodashAssignWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashAssignWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashAssignWith1x6[TObject, TSource] = js.Function1[/* customizer */ AssignCustomizer, TObject with TSource]
  type LodashAt1x1 = js.Function1[
    /* object */ js.UndefOr[List[js.Any] | Dictionary[js.Any] | NumericDictionary[js.Any] | Null], 
    js.Array[js.Any]
  ]
  type LodashAt1x2[T] = js.Function1[/* props */ PropertyPath, js.Array[T]]
  type LodashAt2x1[T] = js.Function1[
    /* object */ js.UndefOr[T | Null], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashAt2x2[T] = js.Function1[
    /* props */ Many[String], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashAttempt = js.Function1[/* func */ js.Function1[/* repeated */ js.Any, js.Any], js.Any | Error]
  type LodashBefore1x1[TFunc] = js.Function1[/* n */ Double, TFunc]
  type LodashBefore1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashBind1x1 = js.Function1[/* thisArg */ js.Any, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashBind1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashBindAll1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashBindAll1x2[T] = js.Function1[/* methodNames */ Many[String], T]
  type LodashBindKey1x1 = js.Function1[/* key */ String, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashBindKey1x2 = js.Function1[/* object */ js.Object, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashCamelCase = js.Function1[/* string */ String, String]
  type LodashCapitalize = js.Function1[/* string */ String, String]
  type LodashCastArray = js.Function1[/* value */ Many[js.Any], js.Array[js.Any]]
  type LodashCeil = js.Function1[/* n */ Double, Double]
  type LodashChunk1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Array[js.Any]]]
  type LodashChunk1x2[T] = js.Function1[/* size */ Double, js.Array[js.Array[T]]]
  type LodashClamp1x3 = js.Function1[/* number */ Double, Double]
  type LodashClamp1x5 = js.Function1[/* upper */ Double, Double]
  type LodashClamp1x6 = js.Function1[/* lower */ Double, Double]
  type LodashClone = js.Function1[/* value */ js.Any, js.Any]
  type LodashCloneDeep = js.Function1[/* value */ js.Any, js.Any]
  type LodashCloneDeepWith1x1[T] = js.Function1[/* value */ T, js.Any]
  type LodashCloneDeepWith1x2[T] = js.Function1[/* customizer */ CloneDeepWithCustomizer[T], js.Any]
  type LodashCloneWith1x1[T, TResult] = js.Function1[/* value */ T, TResult]
  type LodashCloneWith2x1[T, TResult] = js.Function1[/* value */ T, TResult | T]
  type LodashCompact = js.Function1[
    /* array */ js.UndefOr[(List[js.UndefOr[js.Any | Null | `false` | Empty | `0`]]) | Null], 
    js.Array[js.Any]
  ]
  type LodashConcat1x1[T] = js.Function1[/* values */ Many[T], js.Array[T]]
  type LodashConcat1x2[T] = js.Function1[/* array */ Many[T], js.Array[T]]
  type LodashCond = js.Function1[
    /* pairs */ js.Array[CondPair[js.Any, js.Any]], 
    js.Function1[/* Target */ js.Any, js.Any]
  ]
  type LodashConformsTo1x1[T] = js.Function1[/* object */ T, Boolean]
  type LodashConformsTo1x2[T] = js.Function1[/* source */ ConformsPredicateObject[T], Boolean]
  type LodashConstant = js.Function1[/* value */ js.Any, js.Function0[js.Any]]
  type LodashContains1x1[T] = js.Function1[
    /* collection */ js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null], 
    Boolean
  ]
  type LodashContains1x2[T] = js.Function1[/* target */ T, Boolean]
  type LodashCountBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], Dictionary[Double]]
  type LodashCountBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], Dictionary[Double]]
  type LodashCountBy2x2[T] = js.Function1[
    /* iteratee */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    Dictionary[Double]
  ]
  type LodashCreate = js.Function1[/* prototype */ js.Object, js.Object]
  type LodashCurryN1x2[T1, R] = js.Function1[/* arity */ Double, CurriedFunction1[T1, R]]
  type LodashCurryN2x2[T1, T2, R] = js.Function1[/* arity */ Double, CurriedFunction2[T1, T2, R]]
  type LodashCurryN3x2[T1, T2, T3, R] = js.Function1[/* arity */ Double, CurriedFunction3[T1, T2, T3, R]]
  type LodashCurryN4x2[T1, T2, T3, T4, R] = js.Function1[/* arity */ Double, CurriedFunction4[T1, T2, T3, T4, R]]
  type LodashCurryN5x2[T1, T2, T3, T4, T5, R] = js.Function1[/* arity */ Double, CurriedFunction5[T1, T2, T3, T4, T5, R]]
  type LodashCurryN6x2 = js.Function1[/* arity */ Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashCurryRightN1x2[T1, R] = js.Function1[/* arity */ Double, RightCurriedFunction1[T1, R]]
  type LodashCurryRightN2x2[T1, T2, R] = js.Function1[/* arity */ Double, RightCurriedFunction2[T1, T2, R]]
  type LodashCurryRightN3x2[T1, T2, T3, R] = js.Function1[/* arity */ Double, RightCurriedFunction3[T1, T2, T3, R]]
  type LodashCurryRightN4x2[T1, T2, T3, T4, R] = js.Function1[/* arity */ Double, RightCurriedFunction4[T1, T2, T3, T4, R]]
  type LodashCurryRightN5x2[T1, T2, T3, T4, T5, R] = js.Function1[/* arity */ Double, RightCurriedFunction5[T1, T2, T3, T4, T5, R]]
  type LodashCurryRightN6x2 = js.Function1[/* arity */ Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashDebounce1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with Cancelable
  ]
  type LodashDebounce1x2[T] = js.Function1[/* wait */ Double, T with Cancelable]
  type LodashDeburr = js.Function1[/* string */ String, String]
  type LodashDefaultTo1x1[T] = js.Function1[/* value */ js.UndefOr[T | Null], T]
  type LodashDefaultTo2x1[TDefault] = js.Function1[/* value */ js.UndefOr[js.Any | Null], js.Any | TDefault]
  type LodashDefaults1x1[TSource] = js.Function1[/* object */ js.Any, NonNullable[TSource with js.Any]]
  type LodashDefaults1x2[TObject] = js.Function1[/* source */ js.Any, NonNullable[js.Any with TObject]]
  type LodashDefaultsDeep1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashDefaultsDeep1x2 = js.Function1[/* sources */ js.Any, js.Any]
  type LodashDefaultsDeepAll = js.Function1[/* object */ js.Array[js.Any], js.Any]
  type LodashDefer = js.Function2[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    /* repeated */ js.Any, 
    Double
  ]
  type LodashDelay1x1 = js.Function1[/* func */ js.Function1[/* repeated */ js.Any, js.Any], Double]
  type LodashDelay1x2 = js.Function1[/* wait */ Double, Double]
  type LodashDifference1x1[T] = js.Function1[/* values */ List[T], js.Array[T]]
  type LodashDifference1x2[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashDifferenceBy1x3[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashDifferenceBy1x5[T1] = js.Function1[/* array */ js.UndefOr[List[T1] | Null], js.Array[T1]]
  type LodashDifferenceBy1x6[T1, T2] = js.Function1[/* iteratee */ ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashDifferenceWith1x3[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashDifferenceWith1x5[T1] = js.Function1[/* array */ js.UndefOr[List[T1] | Null], js.Array[T1]]
  type LodashDifferenceWith1x6[T1, T2] = js.Function1[/* comparator */ Comparator2[T1, T2], js.Array[T1]]
  type LodashDivide1x1 = js.Function1[/* divisor */ Double, Double]
  type LodashDivide1x2 = js.Function1[/* dividend */ Double, Double]
  type LodashDrop1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashDrop1x2[T] = js.Function1[/* n */ Double, js.Array[T]]
  type LodashDropRight1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashDropRight1x2[T] = js.Function1[/* n */ Double, js.Array[T]]
  type LodashDropRightWhile1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashDropRightWhile1x2[T] = js.Function1[/* predicate */ ValueIteratee[T], js.Array[T]]
  type LodashDropWhile1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashDropWhile1x2[T] = js.Function1[/* predicate */ ValueIteratee[T], js.Array[T]]
  type LodashEndsWith1x1 = js.Function1[/* string */ String, Boolean]
  type LodashEndsWith1x2 = js.Function1[/* target */ String, Boolean]
  type LodashEq1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashEq1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashEscape = js.Function1[/* string */ String, String]
  type LodashEscapeRegExp = js.Function1[/* string */ String, String]
  type LodashEvery1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], Boolean]
  type LodashEvery1x2[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Boolean]
  type LodashEvery2x2[T] = js.Function1[
    /* predicate */ ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ], 
    Boolean
  ]
  type LodashExtend1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashExtend1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashExtendAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashExtendAllWith1x2 = js.Function1[/* customizer */ AssignCustomizer, js.Any]
  type LodashExtendWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashExtendWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashExtendWith1x6[TObject, TSource] = js.Function1[/* customizer */ AssignCustomizer, TObject with TSource]
  type LodashFill1x11[U] = js.Function1[/* value */ js.Any, js.Array[js.Any | U]]
  type LodashFill1x13[T, U] = js.Function1[/* end */ Double, js.Array[T | U]]
  type LodashFill1x14[T, U] = js.Function1[/* start */ Double, js.Array[T | U]]
  type LodashFill2x11[U] = js.Function1[/* value */ js.Any, List[js.Any | U]]
  type LodashFill2x13[T, U] = js.Function1[/* end */ Double, List[T | U]]
  type LodashFill2x14[T, U] = js.Function1[/* start */ Double, List[T | U]]
  type LodashFilter1x1[T, S] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.Array[S]]
  type LodashFilter2x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], js.Array[T]]
  type LodashFilter3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | Null], js.Array[S]]
  type LodashFind1x1[T, S] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[S]]
  type LodashFind2x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], js.UndefOr[T]]
  type LodashFind3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | Null], js.UndefOr[S]]
  type LodashFindFrom1x3[T, S] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[S]]
  type LodashFindFrom1x5[S] = js.Function1[/* fromIndex */ Double, js.UndefOr[S]]
  type LodashFindFrom2x5[T] = js.Function1[/* fromIndex */ Double, js.UndefOr[T]]
  type LodashFindFrom3x3[T, S] = js.Function1[/* collection */ js.UndefOr[T | Null], js.UndefOr[S]]
  type LodashFindFrom3x5[S] = js.Function1[/* fromIndex */ Double, js.UndefOr[S]]
  type LodashFindFrom4x5[T] = js.Function1[
    /* fromIndex */ Double, 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashFindIndex1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashFindIndex1x2[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Double]
  type LodashFindIndexFrom1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashFindIndexFrom1x5 = js.Function1[/* fromIndex */ Double, Double]
  type LodashFindIndexFrom1x6[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Double]
  type LodashFindKey1x1[T] = js.Function1[/* object */ js.UndefOr[js.Object | Null], js.UndefOr[String]]
  type LodashFindKey1x2[T] = js.Function1[
    /* predicate */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.UndefOr[String]
  ]
  type LodashFindLast1x1[T, S] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[S]]
  type LodashFindLast2x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], js.UndefOr[T]]
  type LodashFindLast3x1[T, S] = js.Function1[/* collection */ js.UndefOr[T | Null], js.UndefOr[S]]
  type LodashFindLastFrom1x3[T, S] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[S]]
  type LodashFindLastFrom1x5[S] = js.Function1[/* fromIndex */ Double, js.UndefOr[S]]
  type LodashFindLastFrom2x5[T] = js.Function1[/* fromIndex */ Double, js.UndefOr[T]]
  type LodashFindLastFrom3x3[T, S] = js.Function1[/* collection */ js.UndefOr[T | Null], js.UndefOr[S]]
  type LodashFindLastFrom3x5[S] = js.Function1[/* fromIndex */ Double, js.UndefOr[S]]
  type LodashFindLastFrom4x5[T] = js.Function1[
    /* fromIndex */ Double, 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashFindLastIndex1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashFindLastIndex1x2[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Double]
  type LodashFindLastIndexFrom1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashFindLastIndexFrom1x5 = js.Function1[/* fromIndex */ Double, Double]
  type LodashFindLastIndexFrom1x6[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Double]
  type LodashFindLastKey1x1[T] = js.Function1[/* object */ js.UndefOr[js.Object | Null], js.UndefOr[String]]
  type LodashFindLastKey1x2[T] = js.Function1[
    /* predicate */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.UndefOr[String]
  ]
  type LodashFlatMap1x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.Array[TResult]]
  type LodashFlatMap1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, Many[js.Any]], js.Array[js.Any]]
  type LodashFlatMap2x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], js.Array[TResult]]
  type LodashFlatMap2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[js.Any]
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMap3x1 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[js.Any]]
  type LodashFlatMap4x1 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[Boolean]]
  type LodashFlatMapDeep1x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.Array[TResult]]
  type LodashFlatMapDeep1x2[T] = js.Function1[
    /* iteratee */ js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[js.Any] | js.Any], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDeep2x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], js.Array[TResult]]
  type LodashFlatMapDeep2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[js.Any] | js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDeep3x1 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[js.Any]]
  type LodashFlatMapDeep4x1 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[Boolean]]
  type LodashFlatMapDepth1x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.Array[TResult]]
  type LodashFlatMapDepth1x5[TResult] = js.Function1[/* depth */ Double, js.Array[TResult]]
  type LodashFlatMapDepth1x6[T] = js.Function1[
    /* iteratee */ js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[js.Any] | js.Any], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDepth2x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], js.Array[TResult]]
  type LodashFlatMapDepth2x5[TResult] = js.Function1[/* depth */ Double, js.Array[TResult]]
  type LodashFlatMapDepth2x6[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      ListOfRecursiveArraysOrValues[js.Any] | js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashFlatMapDepth3x3 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[js.Any]]
  type LodashFlatMapDepth3x5 = js.Function1[/* depth */ Double, js.Array[js.Any]]
  type LodashFlatMapDepth4x3 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[Boolean]]
  type LodashFlatMapDepth4x5 = js.Function1[/* depth */ Double, js.Array[Boolean]]
  type LodashFlatten = js.Function1[/* array */ js.UndefOr[List[Many[js.Any]] | Null], js.Array[js.Any]]
  type LodashFlattenDeep = js.Function1[
    /* array */ js.UndefOr[ListOfRecursiveArraysOrValues[js.Any] | Null], 
    js.Array[js.Any]
  ]
  type LodashFlattenDepth1x1 = js.Function1[
    /* array */ js.UndefOr[ListOfRecursiveArraysOrValues[js.Any] | Null], 
    js.Array[js.Any]
  ]
  type LodashFlattenDepth1x2[T] = js.Function1[/* depth */ Double, js.Array[T]]
  type LodashFlip = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashFloor = js.Function1[/* n */ Double, Double]
  type LodashForEach1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[T]]
  type LodashForEach2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], List[T]]
  type LodashForEach3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForEach4x2[T, TArray] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TArray]
  type LodashForEach5x2[T, TList] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TList]
  type LodashForEach6x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashForEachRight1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[T]]
  type LodashForEachRight2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], List[T]]
  type LodashForEachRight3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForEachRight4x2[T, TArray] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TArray]
  type LodashForEachRight5x2[T, TList] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], TList]
  type LodashForEachRight6x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashForIn1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForIn2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashForInRight1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForInRight2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashForOwn1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForOwn2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashForOwnRight1x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    T
  ]
  type LodashForOwnRight2x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.UndefOr[T | Null]
  ]
  type LodashFunctions = js.Function1[/* object */ js.Any, js.Array[String]]
  type LodashFunctionsIn = js.Function1[/* object */ js.Any, js.Array[String]]
  type LodashGet1x2[TObject] = js.Function1[
    /* path */ String | js.Array[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashGet3x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ]
  type LodashGet4x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ]
  type LodashGet5x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ]
  type LodashGet6x2[T] = js.Function1[/* path */ Double, T]
  type LodashGet7x2[T] = js.Function1[/* path */ Double, js.UndefOr[T]]
  type LodashGet8x2 = js.Function1[/* path */ PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashGet9x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashGetOr1x3[TObject, TKey /* <: String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr1x6[TObject, TKey /* <: String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashGetOr2x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr2x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashGetOr3x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr3x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashGetOr4x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashGetOr4x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashGetOr5x3[TDefault] = js.Function1[/* object */ js.UndefOr[NumericDictionary[js.Any] | Null], js.Any | TDefault]
  type LodashGetOr5x5[T, TDefault] = js.Function1[/* path */ Double, T | TDefault]
  type LodashGetOr5x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashGetOr6x3[TDefault] = js.Function1[/* object */ js.UndefOr[Null], TDefault]
  type LodashGetOr6x5[TDefault] = js.Function1[/* path */ PropertyPath, TDefault]
  type LodashGetOr6x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashGetOr7x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashGetOr7x5 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashGetOr7x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashGroupBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], Dictionary[js.Array[T]]]
  type LodashGroupBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], Dictionary[js.Array[T]]]
  type LodashGroupBy2x2[T] = js.Function1[
    /* iteratee */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    Dictionary[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ]
  type LodashGt1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashGt1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashGte1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashGte1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashHas1x1 = js.Function1[/* object */ js.Any, Boolean]
  type LodashHas1x2 = js.Function1[/* path */ PropertyPath, Boolean]
  type LodashHasIn1x1 = js.Function1[/* object */ js.Any, Boolean]
  type LodashHasIn1x2 = js.Function1[/* path */ PropertyPath, Boolean]
  type LodashHead = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.UndefOr[js.Any]]
  type LodashInRange1x3 = js.Function1[/* n */ Double, Boolean]
  type LodashInRange1x5 = js.Function1[/* end */ Double, Boolean]
  type LodashInRange1x6 = js.Function1[/* start */ Double, Boolean]
  type LodashIncludes1x1[T] = js.Function1[
    /* collection */ js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null], 
    Boolean
  ]
  type LodashIncludes1x2[T] = js.Function1[/* target */ T, Boolean]
  type LodashIncludesFrom1x3[T] = js.Function1[
    /* collection */ js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null], 
    Boolean
  ]
  type LodashIncludesFrom1x5 = js.Function1[/* fromIndex */ Double, Boolean]
  type LodashIncludesFrom1x6[T] = js.Function1[/* target */ T, Boolean]
  type LodashIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashIndexOf1x2[T] = js.Function1[/* value */ T, Double]
  type LodashIndexOfFrom1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashIndexOfFrom1x5 = js.Function1[/* fromIndex */ Double, Double]
  type LodashIndexOfFrom1x6[T] = js.Function1[/* value */ T, Double]
  type LodashInitial = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashIntersection1x1[T] = js.Function1[/* arrays */ List[T], js.Array[T]]
  type LodashIntersection1x2[T] = js.Function1[/* arrays2 */ List[T], js.Array[T]]
  type LodashIntersectionBy1x3[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashIntersectionBy1x5[T1] = js.Function1[/* array */ List[T1] | Null, js.Array[T1]]
  type LodashIntersectionBy1x6[T1, T2] = js.Function1[/* iteratee */ ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashIntersectionWith1x3[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashIntersectionWith1x5[T1] = js.Function1[/* array */ js.UndefOr[List[T1] | Null], js.Array[T1]]
  type LodashIntersectionWith1x6[T1, T2] = js.Function1[/* comparator */ Comparator2[T1, T2], js.Array[T1]]
  type LodashInvert = js.Function1[/* object */ js.Object, Dictionary[String]]
  type LodashInvertBy1x1[T] = js.Function1[
    /* object */ js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | js.Object | Null], 
    Dictionary[js.Array[String]]
  ]
  type LodashInvertBy1x2[T] = js.Function1[/* interatee */ ValueIteratee[T], Dictionary[js.Array[String]]]
  type LodashInvertBy2x2[T] = js.Function1[
    /* interatee */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    Dictionary[js.Array[String]]
  ]
  type LodashInvoke1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashInvoke1x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashInvokeArgs1x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashInvokeArgs1x5 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashInvokeArgs1x6 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashInvokeArgsMap1x3 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[js.Any]]
  type LodashInvokeArgsMap1x5 = js.Function1[/* args */ js.Array[js.Any], js.Array[js.Any]]
  type LodashInvokeArgsMap2x3[TResult] = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[TResult]]
  type LodashInvokeArgsMap2x5[TResult] = js.Function1[/* args */ js.Array[js.Any], js.Array[TResult]]
  type LodashInvokeMap1x1 = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[js.Any]]
  type LodashInvokeMap2x1[TResult] = js.Function1[/* collection */ js.UndefOr[js.Object | Null], js.Array[TResult]]
  type LodashIsArguments = js.Function1[/* value */ js.Any, /* is std.IArguments */ Boolean]
  type LodashIsArray = js.Function1[/* value */ js.Any, /* is std.Array<any> */ Boolean]
  type LodashIsArrayBuffer = js.Function1[/* value */ js.Any, /* is std.ArrayBuffer */ Boolean]
  type LodashIsBoolean = js.Function1[/* value */ js.Any, /* is boolean */ Boolean]
  type LodashIsBuffer = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsDate = js.Function1[/* value */ js.Any, /* is std.Date */ Boolean]
  type LodashIsElement = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsEmpty = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsEqual1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashIsEqual1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsEqualWith1x3 = js.Function1[/* other */ js.Any, Boolean]
  type LodashIsEqualWith1x5 = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsEqualWith1x6 = js.Function1[/* customizer */ IsEqualCustomizer, Boolean]
  type LodashIsError = js.Function1[/* value */ js.Any, /* is std.Error */ Boolean]
  type LodashIsFinite = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsFunction = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsInteger = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsLength = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsMap = js.Function1[/* value */ js.Any, /* is lodash.lodash._Global_.Map<any, any> */ Boolean]
  type LodashIsMatch1x1 = js.Function1[/* object */ js.Object, Boolean]
  type LodashIsMatch1x2 = js.Function1[/* source */ js.Object, Boolean]
  type LodashIsMatchWith1x3 = js.Function1[/* object */ js.Object, Boolean]
  type LodashIsMatchWith1x5 = js.Function1[/* source */ js.Object, Boolean]
  type LodashIsMatchWith1x6 = js.Function1[/* customizer */ isMatchWithCustomizer, Boolean]
  type LodashIsNaN = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsNative = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsNil = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsNull = js.Function1[/* value */ js.Any, /* is null */ Boolean]
  type LodashIsNumber = js.Function1[/* value */ js.Any, /* is number */ Boolean]
  type LodashIsObject = js.Function1[/* value */ js.Any, /* is object */ Boolean]
  type LodashIsObjectLike = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsPlainObject = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsRegExp = js.Function1[/* value */ js.Any, /* is std.RegExp */ Boolean]
  type LodashIsSafeInteger = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsSet = js.Function1[/* value */ js.Any, /* is lodash.lodash._Global_.Set<any> */ Boolean]
  type LodashIsString = js.Function1[/* value */ js.Any, /* is string */ Boolean]
  type LodashIsSymbol = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsTypedArray = js.Function1[/* value */ js.Any, Boolean]
  type LodashIsUndefined = js.Function1[/* value */ js.Any, /* is undefined */ Boolean]
  type LodashIsWeakMap = js.Function1[/* value */ js.Any, /* is lodash.lodash._Global_.WeakMap<object, any> */ Boolean]
  type LodashIsWeakSet = js.Function1[/* value */ js.Any, /* is lodash.lodash._Global_.WeakSet<object> */ Boolean]
  type LodashJoin1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], String]
  type LodashJoin1x2 = js.Function1[/* separator */ String, String]
  type LodashKebabCase = js.Function1[/* string */ String, String]
  type LodashKeyBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], Dictionary[T]]
  type LodashKeyBy1x2[T] = js.Function1[/* iteratee */ ValueIterateeCustom[T, PropertyName], Dictionary[T]]
  type LodashKeyBy2x2[T] = js.Function1[
    /* iteratee */ ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      PropertyName
    ], 
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashKeys = js.Function1[/* object */ js.Any, js.Array[String]]
  type LodashKeysIn = js.Function1[/* object */ js.Any, js.Array[String]]
  type LodashLast = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.UndefOr[js.Any]]
  type LodashLastIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashLastIndexOf1x2[T] = js.Function1[/* value */ T, Double]
  type LodashLastIndexOfFrom1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashLastIndexOfFrom1x5 = js.Function1[/* fromIndex */ `true` | Double, Double]
  type LodashLastIndexOfFrom1x6[T] = js.Function1[/* value */ T, Double]
  type LodashLowerCase = js.Function1[/* string */ String, String]
  type LodashLowerFirst = js.Function1[/* string */ String, String]
  type LodashLt1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashLt1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashLte1x1 = js.Function1[/* other */ js.Any, Boolean]
  type LodashLte1x2 = js.Function1[/* value */ js.Any, Boolean]
  type LodashMap1x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[js.Array[T] | List[T] | Null], js.Array[TResult]]
  type LodashMap1x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[js.Any]]
  type LodashMap2x2[T] = js.Function1[/* iteratee */ js.Function1[/* value */ T, js.Any], js.Array[js.Any]]
  type LodashMap3x1[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], js.Array[TResult]]
  type LodashMap3x2[T] = js.Function1[
    /* iteratee */ js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      js.Any
    ], 
    js.Array[js.Any]
  ]
  type LodashMap4x1[T, K /* <: String */] = js.Function1[
    /* collection */ js.UndefOr[List[T] | Dictionary[T] | NumericDictionary[T] | Null], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ]
  type LodashMap5x1 = js.Function1[
    /* collection */ js.UndefOr[List[js.Any] | Dictionary[js.Any] | NumericDictionary[js.Any] | Null], 
    js.Array[js.Any]
  ]
  type LodashMap6x1 = js.Function1[
    /* collection */ js.UndefOr[List[js.Any] | Dictionary[js.Any] | NumericDictionary[js.Any] | Null], 
    js.Array[Boolean]
  ]
  type LodashMapKeys1x1 = js.Function1[/* object */ js.UndefOr[List[js.Any] | Null], Dictionary[js.Any]]
  type LodashMapKeys1x2[T] = js.Function1[/* iteratee */ ValueIteratee[Double], Dictionary[T]]
  type LodashMapKeys2x1 = js.Function1[
    /* object */ js.UndefOr[js.Object | Null], 
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: object[keyof object] */ js.Any
    ]
  ]
  type LodashMapKeys2x2[T] = js.Function1[
    /* iteratee */ ValueIteratee[String], 
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashMapValues1x1[T, TResult] = js.Function1[
    /* obj */ js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null], 
    Dictionary[TResult]
  ]
  type LodashMapValues2x1[T, TResult] = js.Function1[
    /* obj */ js.UndefOr[T | Null], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: TResult}
    */ typingsJapgolly.lodash.lodashStrings.LodashMapValues2x1 with js.Any
  ]
  type LodashMapValues5x1[T, TKey /* <: String */] = js.Function1[
    /* obj */ js.UndefOr[Dictionary[T] | NumericDictionary[T] | Null], 
    Dictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ]
  type LodashMatchesProperty1x1 = js.Function1[/* srcValue */ js.Any, js.Function1[/* value */ js.Any, Boolean]]
  type LodashMatchesProperty1x2 = js.Function1[/* path */ PropertyPath, js.Function1[/* value */ js.Any, Boolean]]
  type LodashMax = js.Function1[/* collection */ js.UndefOr[List[js.Any] | Null], js.UndefOr[js.Any]]
  type LodashMaxBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[T]]
  type LodashMaxBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.UndefOr[T]]
  type LodashMean = js.Function1[/* collection */ js.UndefOr[List[js.Any] | Null], Double]
  type LodashMeanBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], Double]
  type LodashMeanBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], Double]
  type LodashMemoize = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with MemoizedFunction
  ]
  type LodashMerge1x1[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashMerge1x2[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashMergeAllWith1x1 = js.Function1[/* args */ js.Array[js.Any], js.Any]
  type LodashMergeAllWith1x2 = js.Function1[/* customizer */ MergeWithCustomizer, js.Any]
  type LodashMergeWith1x3[TObject] = js.Function1[/* source */ js.Any, TObject with js.Any]
  type LodashMergeWith1x5[TSource] = js.Function1[/* object */ js.Any, js.Any with TSource]
  type LodashMergeWith1x6[TObject, TSource] = js.Function1[/* customizer */ MergeWithCustomizer, TObject with TSource]
  type LodashMethod = js.Function1[/* path */ PropertyPath, js.Function1[/* object */ js.Any, js.Any]]
  type LodashMethodOf = js.Function1[/* object */ js.Object, js.Function1[/* path */ PropertyPath, js.Any]]
  type LodashMin = js.Function1[/* collection */ js.UndefOr[List[js.Any] | Null], js.UndefOr[js.Any]]
  type LodashMinBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], js.UndefOr[T]]
  type LodashMinBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.UndefOr[T]]
  type LodashMultiply1x1 = js.Function1[/* multiplicand */ Double, Double]
  type LodashMultiply1x2 = js.Function1[/* multiplier */ Double, Double]
  type LodashNoConflict = js.Function0[Typeoflodash]
  type LodashNoop = js.Function1[/* repeated */ js.Any, Unit]
  type LodashNow = js.Function0[Double]
  type LodashNth1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.UndefOr[js.Any]]
  type LodashNth1x2[T] = js.Function1[/* n */ Double, js.UndefOr[T]]
  type LodashNthArg = js.Function1[/* n */ Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashOmit1x2[T] = js.Function1[/* paths */ Many[PropertyName], T]
  type LodashOmit2x1[T, K /* <: String */] = js.Function1[/* object */ js.UndefOr[T | Null], Omit[T, K]]
  type LodashOmitBy1x2[T] = js.Function1[/* predicate */ ValueKeyIteratee[T], Dictionary[T]]
  type LodashOmitBy2x2[T] = js.Function1[/* predicate */ ValueKeyIteratee[T], NumericDictionary[T]]
  type LodashOmitBy3x2[T] = js.Function1[
    /* predicate */ ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    PartialObject[T]
  ]
  type LodashOnce = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOrderBy1x5[T] = js.Function1[/* orders */ Many[Boolean | asc | desc], js.Array[T]]
  type LodashOrderBy1x6[T] = js.Function1[
    /* iteratees */ Many[(js.Function1[/* value */ T, NotVoid]) | ValueIteratee[T]], 
    js.Array[T]
  ]
  type LodashOrderBy2x5[T] = js.Function1[/* orders */ Many[Boolean | asc | desc], js.Array[T]]
  type LodashOrderBy3x5[T] = js.Function1[
    /* orders */ Many[Boolean | asc | desc], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashOrderBy3x6[T] = js.Function1[
    /* iteratees */ Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashOrderBy4x5[T] = js.Function1[
    /* orders */ Many[Boolean | asc | desc], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashOver = js.Function1[
    /* iteratees */ Many[js.Function1[/* repeated */ js.Any, js.Any]], 
    js.Function1[/* repeated */ js.Any, js.Array[js.Any]]
  ]
  type LodashOverArgs1x1 = js.Function1[
    /* transforms */ Many[js.Function1[/* repeated */ js.Any, js.Any]], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOverArgs1x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashOverEvery = js.Function1[
    /* predicates */ Many[js.Function1[/* repeated */ js.Any, Boolean]], 
    js.Function1[/* repeated */ js.Any, Boolean]
  ]
  type LodashOverSome = js.Function1[
    /* predicates */ Many[js.Function1[/* repeated */ js.Any, Boolean]], 
    js.Function1[/* repeated */ js.Any, Boolean]
  ]
  type LodashPad1x1 = js.Function1[/* string */ String, String]
  type LodashPad1x2 = js.Function1[/* length */ Double, String]
  type LodashPadChars1x3 = js.Function1[/* string */ String, String]
  type LodashPadChars1x5 = js.Function1[/* length */ Double, String]
  type LodashPadChars1x6 = js.Function1[/* chars */ String, String]
  type LodashPadCharsEnd1x3 = js.Function1[/* string */ String, String]
  type LodashPadCharsEnd1x5 = js.Function1[/* length */ Double, String]
  type LodashPadCharsEnd1x6 = js.Function1[/* chars */ String, String]
  type LodashPadCharsStart1x3 = js.Function1[/* string */ String, String]
  type LodashPadCharsStart1x5 = js.Function1[/* length */ Double, String]
  type LodashPadCharsStart1x6 = js.Function1[/* chars */ String, String]
  type LodashPadEnd1x1 = js.Function1[/* string */ String, String]
  type LodashPadEnd1x2 = js.Function1[/* length */ Double, String]
  type LodashPadStart1x1 = js.Function1[/* string */ String, String]
  type LodashPadStart1x2 = js.Function1[/* length */ Double, String]
  type LodashParseInt1x1 = js.Function1[/* string */ String, Double]
  type LodashParseInt1x2 = js.Function1[/* radix */ Double, Double]
  type LodashPartial19x2[T4] = js.Function1[
    /* func */ Function4[js.Any, js.Any, js.Any, T4, js.Any], 
    Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartial1x1[T1, R] = js.Function1[/* arg1 */ js.Array[T1], Function0[R]]
  type LodashPartial20x2[T1, T4] = js.Function1[
    /* func */ Function4[T1, js.Any, js.Any, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial21x2[T2, T4] = js.Function1[
    /* func */ Function4[js.Any, T2, js.Any, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial22x2[T1, T2, T4] = js.Function1[/* func */ Function4[T1, T2, js.Any, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartial23x2[T3, T4] = js.Function1[
    /* func */ Function4[js.Any, js.Any, T3, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartial24x2[T1, T3, T4] = js.Function1[/* func */ Function4[T1, js.Any, T3, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartial25x2[T2, T3, T4] = js.Function1[/* func */ Function4[js.Any, T2, T3, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartial26x2[T1, T2, T3, T4] = js.Function1[/* func */ Function4[T1, T2, T3, T4, js.Any], Function0[js.Any]]
  type LodashPartial27x1 = js.Function1[/* args */ js.Array[js.Any], js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashPartial27x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashPartialRight10x2[T2, T3] = js.Function1[/* func */ Function3[js.Any, T2, T3, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight11x2[T1, T2, T3] = js.Function1[/* func */ Function3[T1, T2, T3, js.Any], Function0[js.Any]]
  type LodashPartialRight12x2[T1] = js.Function1[
    /* func */ Function4[T1, js.Any, js.Any, js.Any, js.Any], 
    Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight13x2[T2] = js.Function1[
    /* func */ Function4[js.Any, T2, js.Any, js.Any, js.Any], 
    Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight14x2[T1, T2] = js.Function1[
    /* func */ Function4[T1, T2, js.Any, js.Any, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight15x2[T3] = js.Function1[
    /* func */ Function4[js.Any, js.Any, T3, js.Any, js.Any], 
    Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight16x2[T1, T3] = js.Function1[
    /* func */ Function4[T1, js.Any, T3, js.Any, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight17x2[T2, T3] = js.Function1[
    /* func */ Function4[js.Any, T2, T3, js.Any, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight18x2[T1, T2, T3] = js.Function1[/* func */ Function4[T1, T2, T3, js.Any, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight19x2[T4] = js.Function1[
    /* func */ Function4[js.Any, js.Any, js.Any, T4, js.Any], 
    Function3[js.Any, js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight1x1[T1, R] = js.Function1[/* arg1 */ js.Array[T1], Function0[R]]
  type LodashPartialRight1x2[T1] = js.Function1[/* func */ Function1[T1, js.Any], Function0[js.Any]]
  type LodashPartialRight20x2[T1, T4] = js.Function1[
    /* func */ Function4[T1, js.Any, js.Any, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight21x2[T2, T4] = js.Function1[
    /* func */ Function4[js.Any, T2, js.Any, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight22x2[T1, T2, T4] = js.Function1[/* func */ Function4[T1, T2, js.Any, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight23x2[T3, T4] = js.Function1[
    /* func */ Function4[js.Any, js.Any, T3, T4, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight24x2[T1, T3, T4] = js.Function1[/* func */ Function4[T1, js.Any, T3, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight25x2[T2, T3, T4] = js.Function1[/* func */ Function4[js.Any, T2, T3, T4, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight26x2[T1, T2, T3, T4] = js.Function1[/* func */ Function4[T1, T2, T3, T4, js.Any], Function0[js.Any]]
  type LodashPartialRight27x1 = js.Function1[/* args */ js.Array[js.Any], js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashPartialRight27x2 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashPartialRight2x2[T1] = js.Function1[/* func */ Function2[T1, js.Any, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight3x2[T2] = js.Function1[/* func */ Function2[js.Any, T2, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight4x2[T1, T2] = js.Function1[/* func */ Function2[T1, T2, js.Any], Function0[js.Any]]
  type LodashPartialRight5x2[T1] = js.Function1[
    /* func */ Function3[T1, js.Any, js.Any, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight6x2[T2] = js.Function1[
    /* func */ Function3[js.Any, T2, js.Any, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight7x2[T1, T2] = js.Function1[/* func */ Function3[T1, T2, js.Any, js.Any], Function1[js.Any, js.Any]]
  type LodashPartialRight8x2[T3] = js.Function1[
    /* func */ Function3[js.Any, js.Any, T3, js.Any], 
    Function2[js.Any, js.Any, js.Any]
  ]
  type LodashPartialRight9x2[T1, T3] = js.Function1[/* func */ Function3[T1, js.Any, T3, js.Any], Function1[js.Any, js.Any]]
  type LodashPartition1x1[T, U] = js.Function1[
    /* collection */ js.UndefOr[List[T] | Null], 
    js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]]
  ]
  type LodashPartition2x1[T] = js.Function1[
    /* collection */ js.UndefOr[List[T] | js.Object | Null], 
    js.Tuple2[js.Array[T], js.Array[T]]
  ]
  type LodashPartition3x2[T] = js.Function1[
    /* callback */ ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.Tuple2[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ], 
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ]
  type LodashPath1x2[TObject] = js.Function1[
    /* path */ String | js.Array[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashPath3x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ]
  type LodashPath4x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ]
  type LodashPath5x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ]
  type LodashPath6x2[T] = js.Function1[/* path */ Double, T]
  type LodashPath7x2[T] = js.Function1[/* path */ Double, js.UndefOr[T]]
  type LodashPath8x2 = js.Function1[/* path */ PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashPath9x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPathOr1x3[TObject, TKey /* <: String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr1x6[TObject, TKey /* <: String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPathOr2x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr2x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPathOr3x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr3x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPathOr4x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPathOr4x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPathOr5x3[TDefault] = js.Function1[/* object */ js.UndefOr[NumericDictionary[js.Any] | Null], js.Any | TDefault]
  type LodashPathOr5x5[T, TDefault] = js.Function1[/* path */ Double, T | TDefault]
  type LodashPathOr5x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashPathOr6x3[TDefault] = js.Function1[/* object */ js.UndefOr[Null], TDefault]
  type LodashPathOr6x5[TDefault] = js.Function1[/* path */ PropertyPath, TDefault]
  type LodashPathOr6x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPathOr7x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashPathOr7x5 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPathOr7x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPick1x1[T, U /* <: String */] = js.Function1[/* object */ T, Pick[T, U]]
  type LodashPick1x2[T] = js.Function1[/* props */ Many[String], Pick[T, String]]
  type LodashPick2x1 = js.Function1[/* object */ js.UndefOr[js.Any | Null], PartialDeep[js.Any]]
  type LodashPick2x2[T] = js.Function1[/* props */ PropertyPath, PartialDeep[T]]
  type LodashPickBy5x2[T] = js.Function1[
    /* predicate */ ValueKeyIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    PartialObject[T]
  ]
  type LodashProp1x2[TObject] = js.Function1[
    /* path */ String | js.Array[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashProp3x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ]
  type LodashProp4x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ]
  type LodashProp5x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ]
  type LodashProp6x2[T] = js.Function1[/* path */ Double, T]
  type LodashProp7x2[T] = js.Function1[/* path */ Double, js.UndefOr[T]]
  type LodashProp8x2 = js.Function1[/* path */ PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashProp9x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPropOr1x3[TObject, TKey /* <: String */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr1x6[TObject, TKey /* <: String */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPropOr2x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr2x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPropOr3x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr3x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPropOr4x3[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */, TDefault] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | TDefault
  ]
  type LodashPropOr4x6[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* defaultValue */ js.Any, 
    (Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | js.Any
  ]
  type LodashPropOr5x3[TDefault] = js.Function1[/* object */ js.UndefOr[NumericDictionary[js.Any] | Null], js.Any | TDefault]
  type LodashPropOr5x5[T, TDefault] = js.Function1[/* path */ Double, T | TDefault]
  type LodashPropOr5x6[T] = js.Function1[/* defaultValue */ js.Any, T | js.Any]
  type LodashPropOr6x3[TDefault] = js.Function1[/* object */ js.UndefOr[Null], TDefault]
  type LodashPropOr6x5[TDefault] = js.Function1[/* path */ PropertyPath, TDefault]
  type LodashPropOr6x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashPropOr7x3 = js.Function1[/* object */ js.Any, js.Any]
  type LodashPropOr7x5 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPropOr7x6 = js.Function1[/* defaultValue */ js.Any, js.Any]
  type LodashProperty1x2[TObject] = js.Function1[
    /* path */ String | js.Array[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashProperty3x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ]
  type LodashProperty4x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ]
  type LodashProperty5x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ]
  type LodashProperty6x2[T] = js.Function1[/* path */ Double, T]
  type LodashProperty7x2[T] = js.Function1[/* path */ Double, js.UndefOr[T]]
  type LodashProperty8x2 = js.Function1[/* path */ PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashProperty9x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPropertyOf1x2[TObject] = js.Function1[
    /* path */ String | js.Array[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[keyof TObject] */ js.Any
  ]
  type LodashPropertyOf3x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2] */ js.Any
    ]
  ]
  type LodashPropertyOf4x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3] */ js.Any
    ]
  ]
  type LodashPropertyOf5x1[TObject, TKey1 /* <: String */, TKey2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1] */ js.Any */, TKey3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2] */ js.Any */, TKey4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof TObject[TKey1][TKey2][TKey3] */ js.Any */] = js.Function1[
    /* object */ js.UndefOr[TObject | Null], 
    js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey1][TKey2][TKey3][TKey4] */ js.Any
    ]
  ]
  type LodashPropertyOf6x2[T] = js.Function1[/* path */ Double, T]
  type LodashPropertyOf7x2[T] = js.Function1[/* path */ Double, js.UndefOr[T]]
  type LodashPropertyOf8x2 = js.Function1[/* path */ PropertyPath, js.UndefOr[scala.Nothing]]
  type LodashPropertyOf9x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashPull1x2[T] = js.Function1[/* values */ T, js.Array[T]]
  type LodashPull2x2[T] = js.Function1[/* values */ T, List[T]]
  type LodashPullAll1x2[T] = js.Function1[/* values */ List[T], js.Array[T]]
  type LodashPullAll2x2[T] = js.Function1[/* values */ List[T], List[T]]
  type LodashPullAllBy1x5[T] = js.Function1[/* values */ List[T], js.Array[T]]
  type LodashPullAllBy1x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.Array[T]]
  type LodashPullAllBy2x5[T] = js.Function1[/* values */ List[T], List[T]]
  type LodashPullAllBy2x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], List[T]]
  type LodashPullAllBy3x5[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashPullAllBy3x6[T1, T2] = js.Function1[/* iteratee */ ValueIteratee[T1 | T2], js.Array[T1]]
  type LodashPullAllBy4x5[T1, T2] = js.Function1[/* values */ List[T2], List[T1]]
  type LodashPullAllBy4x6[T1, T2] = js.Function1[/* iteratee */ ValueIteratee[T1 | T2], List[T1]]
  type LodashPullAllWith1x5[T] = js.Function1[/* values */ List[T], js.Array[T]]
  type LodashPullAllWith1x6[T] = js.Function1[/* comparator */ Comparator[T], js.Array[T]]
  type LodashPullAllWith2x5[T] = js.Function1[/* values */ List[T], List[T]]
  type LodashPullAllWith2x6[T] = js.Function1[/* comparator */ Comparator[T], List[T]]
  type LodashPullAllWith3x5[T1, T2] = js.Function1[/* values */ List[T2], js.Array[T1]]
  type LodashPullAllWith3x6[T1, T2] = js.Function1[/* comparator */ Comparator2[T1, T2], js.Array[T1]]
  type LodashPullAllWith4x5[T1, T2] = js.Function1[/* values */ List[T2], List[T1]]
  type LodashPullAllWith4x6[T1, T2] = js.Function1[/* comparator */ Comparator2[T1, T2], List[T1]]
  type LodashPullAt1x2[T] = js.Function1[/* indexes */ Many[Double], js.Array[T]]
  type LodashPullAt2x2[T] = js.Function1[/* indexes */ Many[Double], List[T]]
  type LodashRandom1x1 = js.Function1[/* floatingOrMax */ Boolean | Double, Double]
  type LodashRandom1x2 = js.Function1[/* max */ Double, Double]
  type LodashRandom2x2 = js.Function1[/* min */ Double, Double]
  type LodashRange1x1 = js.Function1[/* end */ Double, js.Array[Double]]
  type LodashRange1x2 = js.Function1[/* start */ Double, js.Array[Double]]
  type LodashRangeRight1x1 = js.Function1[/* end */ Double, js.Array[Double]]
  type LodashRangeRight1x2 = js.Function1[/* start */ Double, js.Array[Double]]
  type LodashRangeStep1x3 = js.Function1[/* step */ Double, js.Array[Double]]
  type LodashRangeStep1x5 = js.Function1[/* end */ Double, js.Array[Double]]
  type LodashRangeStep1x6 = js.Function1[/* start */ Double, js.Array[Double]]
  type LodashRangeStepRight1x3 = js.Function1[/* step */ Double, js.Array[Double]]
  type LodashRangeStepRight1x5 = js.Function1[/* end */ Double, js.Array[Double]]
  type LodashRangeStepRight1x6 = js.Function1[/* start */ Double, js.Array[Double]]
  type LodashRearg1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRearg1x2 = js.Function1[/* indexes */ Many[Double], js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashReduce1x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[js.Array[T] | List[T] | Null], TResult]
  type LodashReduce1x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce1x6[T, TResult] = js.Function1[/* callback */ MemoIteratorCapped[T, TResult], TResult]
  type LodashReduce2x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce2x6[T, TResult] = js.Function1[/* callback */ MemoIteratorCapped[T, TResult], TResult]
  type LodashReduce3x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], TResult]
  type LodashReduce3x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduce3x6[T, TResult] = js.Function1[
    /* callback */ MemoIteratorCapped[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ], 
    TResult
  ]
  type LodashReduceRight1x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[js.Array[T] | List[T] | Null], TResult]
  type LodashReduceRight1x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight1x6[T, TResult] = js.Function1[/* callback */ MemoIteratorCappedRight[T, TResult], TResult]
  type LodashReduceRight2x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight2x6[T, TResult] = js.Function1[/* callback */ MemoIteratorCappedRight[T, TResult], TResult]
  type LodashReduceRight3x3[T, TResult] = js.Function1[/* collection */ js.UndefOr[T | Null], TResult]
  type LodashReduceRight3x5[TResult] = js.Function1[/* accumulator */ TResult, TResult]
  type LodashReduceRight3x6[T, TResult] = js.Function1[
    /* callback */ MemoIteratorCappedRight[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      TResult
    ], 
    TResult
  ]
  type LodashReject1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], js.Array[T]]
  type LodashReject1x2[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], js.Array[T]]
  type LodashReject2x2[T] = js.Function1[
    /* predicate */ ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashRemove1x1[T] = js.Function1[/* array */ List[T], js.Array[T]]
  type LodashRemove1x2[T] = js.Function1[/* predicate */ ValueIteratee[T], js.Array[T]]
  type LodashRepeat1x1 = js.Function1[/* string */ String, String]
  type LodashRepeat1x2 = js.Function1[/* n */ Double, String]
  type LodashReplace1x3 = js.Function1[/* string */ String, String]
  type LodashReplace1x5 = js.Function1[/* replacement */ ReplaceFunction | String, String]
  type LodashReplace1x6 = js.Function1[/* pattern */ RegExp | String, String]
  type LodashRest = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRestFrom1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashRestFrom1x2 = js.Function1[/* start */ Double, js.Function1[/* repeated */ js.Any, js.Any]]
  type LodashResult1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashResult1x2 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashReverse = js.Function1[/* array */ List[js.Any], List[js.Any]]
  type LodashRound = js.Function1[/* n */ Double, Double]
  type LodashRunInContext = js.Function1[/* context */ js.Object, LoDashStatic]
  type LodashSampleSize1x2[T] = js.Function1[/* n */ Double, js.Array[T]]
  type LodashSampleSize2x2[T] = js.Function1[
    /* n */ Double, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashSet1x5[T] = js.Function1[/* value */ js.Any, T]
  type LodashSet1x6[T] = js.Function1[/* path */ PropertyPath, T]
  type LodashSet2x5 = js.Function1[/* value */ js.Any, js.Any]
  type LodashSet2x6 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashSetWith1x11[T] = js.Function1[/* value */ js.Any, T]
  type LodashSetWith1x13[T] = js.Function1[/* path */ PropertyPath, T]
  type LodashSetWith1x14[T] = js.Function1[/* customizer */ SetWithCustomizer[T], T]
  type LodashSetWith1x7[T] = js.Function1[/* object */ T, T]
  type LodashSize = js.Function1[/* collection */ js.UndefOr[js.Object | String | Null], Double]
  type LodashSlice1x3 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashSlice1x5[T] = js.Function1[/* end */ Double, js.Array[T]]
  type LodashSlice1x6[T] = js.Function1[/* start */ Double, js.Array[T]]
  type LodashSnakeCase = js.Function1[/* string */ String, String]
  type LodashSome1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], Boolean]
  type LodashSome1x2[T] = js.Function1[/* predicate */ ValueIterateeCustom[T, Boolean], Boolean]
  type LodashSome2x2[T] = js.Function1[
    /* predicate */ ValueIterateeCustom[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any, 
      Boolean
    ], 
    Boolean
  ]
  type LodashSortBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | js.Object | Null], js.Array[T]]
  type LodashSortBy1x2[T] = js.Function1[/* iteratees */ Many[ValueIteratee[T]], js.Array[T]]
  type LodashSortBy2x2[T] = js.Function1[
    /* iteratees */ Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ]
  type LodashSortedIndex1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedIndex1x2[T] = js.Function1[/* value */ T, Double]
  type LodashSortedIndexBy1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedIndexBy1x5[T] = js.Function1[/* value */ T, Double]
  type LodashSortedIndexBy1x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], Double]
  type LodashSortedIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedIndexOf1x2[T] = js.Function1[/* value */ T, Double]
  type LodashSortedLastIndex1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedLastIndex1x2[T] = js.Function1[/* value */ T, Double]
  type LodashSortedLastIndexBy1x3[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedLastIndexBy1x5[T] = js.Function1[/* value */ T, Double]
  type LodashSortedLastIndexBy1x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], Double]
  type LodashSortedLastIndexOf1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], Double]
  type LodashSortedLastIndexOf1x2[T] = js.Function1[/* value */ T, Double]
  type LodashSortedUniq = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashSortedUniqBy1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashSortedUniqBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.Array[T]]
  type LodashSplit1x1 = js.Function1[/* string */ String, js.Array[String]]
  type LodashSplit1x2 = js.Function1[/* separator */ RegExp | String, js.Array[String]]
  type LodashSpread = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashSpreadFrom1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashSpreadFrom1x2[TResult] = js.Function1[/* start */ Double, js.Function1[/* repeated */ js.Any, TResult]]
  type LodashStartCase = js.Function1[/* string */ String, String]
  type LodashStartsWith1x1 = js.Function1[/* string */ String, Boolean]
  type LodashStartsWith1x2 = js.Function1[/* target */ String, Boolean]
  type LodashStubArray = js.Function0[js.Array[js.Any]]
  type LodashStubFalse = js.Function0[`false`]
  type LodashStubObject = js.Function0[js.Any]
  type LodashStubString = js.Function0[String]
  type LodashStubTrue = js.Function0[`true`]
  type LodashSubtract1x1 = js.Function1[/* subtrahend */ Double, Double]
  type LodashSubtract1x2 = js.Function1[/* minuend */ Double, Double]
  type LodashSum = js.Function1[/* collection */ js.UndefOr[List[js.Any] | Null], Double]
  type LodashSumBy1x1[T] = js.Function1[/* collection */ js.UndefOr[List[T] | Null], Double]
  type LodashSumBy1x2[T] = js.Function1[/* iteratee */ (js.Function1[/* value */ T, Double]) | String, Double]
  type LodashTail = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashTake1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashTake1x2[T] = js.Function1[/* n */ Double, js.Array[T]]
  type LodashTakeRight1x1 = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashTakeRight1x2[T] = js.Function1[/* n */ Double, js.Array[T]]
  type LodashTakeRightWhile1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashTakeRightWhile1x2[T] = js.Function1[/* predicate */ ValueIteratee[T], js.Array[T]]
  type LodashTakeWhile1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashTakeWhile1x2[T] = js.Function1[/* predicate */ ValueIteratee[T], js.Array[T]]
  type LodashTap1x1[T] = js.Function1[/* value */ T, T]
  type LodashTap1x2[T] = js.Function1[/* interceptor */ js.Function1[/* value */ T, Unit], T]
  type LodashTemplate = js.Function1[/* string */ String, TemplateExecutor]
  type LodashThrottle1x1 = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    (js.Function1[/* repeated */ js.Any, _]) with Cancelable
  ]
  type LodashThrottle1x2[T] = js.Function1[/* wait */ Double, T with Cancelable]
  type LodashThru1x1[T, TResult] = js.Function1[/* value */ T, TResult]
  type LodashThru1x2[T] = js.Function1[/* interceptor */ js.Function1[/* value */ T, js.Any], js.Any]
  type LodashTimes1x1[TResult] = js.Function1[/* n */ Double, js.Array[TResult]]
  type LodashTimes1x2 = js.Function1[/* iteratee */ js.Function1[/* num */ Double, js.Any], js.Array[js.Any]]
  type LodashToFinite = js.Function1[/* value */ js.Any, Double]
  type LodashToInteger = js.Function1[/* value */ js.Any, Double]
  type LodashToLength = js.Function1[/* value */ js.Any, Double]
  type LodashToLower = js.Function1[/* string */ String, String]
  type LodashToNumber = js.Function1[/* value */ js.Any, Double]
  type LodashToPath = js.Function1[/* value */ js.Any, js.Array[String]]
  type LodashToPlainObject = js.Function1[/* value */ js.Any, js.Any]
  type LodashToSafeInteger = js.Function1[/* value */ js.Any, Double]
  type LodashToString = js.Function1[/* value */ js.Any, String]
  type LodashToUpper = js.Function1[/* string */ String, String]
  type LodashTransform1x3[T, TResult] = js.Function1[/* object */ js.Array[T] | Dictionary[T], js.Array[TResult]]
  type LodashTransform1x5[TResult] = js.Function1[/* accumulator */ js.Array[TResult], js.Array[TResult]]
  type LodashTransform1x6[T, TResult] = js.Function1[/* iteratee */ MemoVoidIteratorCapped[T, js.Array[TResult]], js.Array[TResult]]
  type LodashTransform2x3[T, TResult] = js.Function1[/* object */ js.Array[T] | Dictionary[T], Dictionary[TResult]]
  type LodashTransform2x5[TResult] = js.Function1[/* accumulator */ Dictionary[TResult], Dictionary[TResult]]
  type LodashTransform2x6[T, TResult] = js.Function1[/* iteratee */ MemoVoidIteratorCapped[T, Dictionary[TResult]], Dictionary[TResult]]
  type LodashTransform3x5[TResult] = js.Function1[/* accumulator */ Dictionary[TResult], Dictionary[TResult]]
  type LodashTransform3x6[T, TResult] = js.Function1[/* iteratee */ MemoVoidIteratorCapped[T, Dictionary[TResult]], Dictionary[TResult]]
  type LodashTransform4x5[TResult] = js.Function1[/* accumulator */ js.Array[TResult], js.Array[TResult]]
  type LodashTransform4x6[T, TResult] = js.Function1[/* iteratee */ MemoVoidIteratorCapped[T, js.Array[TResult]], js.Array[TResult]]
  type LodashTrim = js.Function1[/* string */ String, String]
  type LodashTrimChars1x1 = js.Function1[/* string */ String, String]
  type LodashTrimChars1x2 = js.Function1[/* chars */ String, String]
  type LodashTrimCharsEnd1x1 = js.Function1[/* string */ String, String]
  type LodashTrimCharsEnd1x2 = js.Function1[/* chars */ String, String]
  type LodashTrimCharsStart1x1 = js.Function1[/* string */ String, String]
  type LodashTrimCharsStart1x2 = js.Function1[/* chars */ String, String]
  type LodashTrimEnd = js.Function1[/* string */ String, String]
  type LodashTrimStart = js.Function1[/* string */ String, String]
  type LodashTruncate1x1 = js.Function1[/* string */ String, String]
  type LodashTruncate1x2 = js.Function1[/* options */ TruncateOptions, String]
  type LodashUnapply = js.Function1[
    /* func */ js.Function1[/* repeated */ js.Any, js.Any], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
  type LodashUnary = js.Function1[
    /* func */ js.Function2[/* arg1 */ js.Any, /* repeated */ js.Any, js.Any], 
    js.Function1[/* arg1 */ js.Any, js.Any]
  ]
  type LodashUnescape = js.Function1[/* string */ String, String]
  type LodashUnion1x1[T] = js.Function1[/* arrays */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnion1x2[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnionBy1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnionBy1x5[T] = js.Function1[/* arrays1 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnionBy1x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.Array[T]]
  type LodashUnionWith1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnionWith1x5[T] = js.Function1[/* arrays */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUnionWith1x6[T] = js.Function1[/* comparator */ Comparator[T], js.Array[T]]
  type LodashUniq = js.Function1[/* array */ js.UndefOr[List[js.Any] | Null], js.Array[js.Any]]
  type LodashUniqBy1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUniqBy1x2[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.Array[T]]
  type LodashUniqWith1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashUniqWith1x2[T] = js.Function1[/* comparator */ Comparator[T], js.Array[T]]
  type LodashUniqueId = js.Function1[/* prefix */ String, String]
  type LodashUnset1x1 = js.Function1[/* object */ js.Any, js.Any]
  type LodashUnset1x2[T] = js.Function1[/* path */ PropertyPath, T]
  type LodashUnzip = js.Function1[
    /* array */ js.UndefOr[js.Array[js.Array[js.Any]] | List[List[js.Any]] | Null], 
    js.Array[js.Array[js.Any]]
  ]
  type LodashUnzipWith1x1[T, TResult] = js.Function1[/* array */ js.UndefOr[List[List[T]] | Null], js.Array[TResult]]
  type LodashUnzipWith1x2[T] = js.Function1[/* iteratee */ js.Function1[/* repeated */ T, js.Any], js.Array[js.Any]]
  type LodashUpdate1x3 = js.Function1[/* object */ js.Object, js.Any]
  type LodashUpdate1x5 = js.Function1[/* updater */ js.Function1[/* value */ js.Any, js.Any], js.Any]
  type LodashUpdate1x6 = js.Function1[/* path */ PropertyPath, js.Any]
  type LodashUpdateWith1x11[T] = js.Function1[/* updater */ js.Function1[/* oldValue */ js.Any, js.Any], T]
  type LodashUpdateWith1x13[T] = js.Function1[/* path */ PropertyPath, T]
  type LodashUpdateWith1x14[T] = js.Function1[/* customizer */ SetWithCustomizer[T], T]
  type LodashUpdateWith1x7[T] = js.Function1[/* object */ T, T]
  type LodashUpperCase = js.Function1[/* string */ String, String]
  type LodashUpperFirst = js.Function1[/* string */ String, String]
  type LodashWithout1x1[T] = js.Function1[/* array */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashWithout1x2[T] = js.Function1[/* values */ js.Array[T], js.Array[T]]
  type LodashWords = js.Function1[/* string */ String, js.Array[String]]
  type LodashWrap1x1[T, TArgs, TResult] = js.Function1[/* value */ T, js.Function1[/* repeated */ TArgs, TResult]]
  type LodashWrap2x1[T, TResult] = js.Function1[/* value */ T, js.Function1[/* repeated */ js.Any, TResult]]
  type LodashXor1x1[T] = js.Function1[/* arrays */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXor1x2[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXorBy1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXorBy1x5[T] = js.Function1[/* arrays */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXorBy1x6[T] = js.Function1[/* iteratee */ ValueIteratee[T], js.Array[T]]
  type LodashXorWith1x3[T] = js.Function1[/* arrays2 */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXorWith1x5[T] = js.Function1[/* arrays */ js.UndefOr[List[T] | Null], js.Array[T]]
  type LodashXorWith1x6[T] = js.Function1[/* comparator */ Comparator[T], js.Array[T]]
  type LodashZip1x1[T1] = js.Function1[
    /* arrays2 */ List[js.Any], 
    js.Array[js.Tuple2[js.UndefOr[T1], js.UndefOr[js.Any]]]
  ]
  type LodashZip1x2[T2] = js.Function1[
    /* arrays1 */ List[js.Any], 
    js.Array[js.Tuple2[js.UndefOr[js.Any], js.UndefOr[T2]]]
  ]
  type LodashZipObject1x1 = js.Function1[/* values */ List[js.Any], Dictionary[js.Any]]
  type LodashZipObject1x2[T] = js.Function1[/* props */ List[PropertyName], Dictionary[T]]
  type LodashZipObjectDeep1x1 = js.Function1[/* values */ List[js.Any], js.Object]
  type LodashZipObjectDeep1x2 = js.Function1[/* paths */ List[PropertyPath], js.Object]
  type LodashZipWith1x3[T2, TResult] = js.Function1[/* arrays2 */ List[T2], js.Array[TResult]]
  type LodashZipWith1x5[T1, TResult] = js.Function1[/* arrays1 */ List[T1], js.Array[TResult]]
  type LodashZipWith1x6[T1, T2] = js.Function1[
    /* iteratee */ js.Function2[/* value1 */ T1, /* value2 */ T2, js.Any], 
    js.Array[js.Any]
  ]
}
