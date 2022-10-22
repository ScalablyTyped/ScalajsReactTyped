package typingsJapgolly.reselect

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reselect.anon.ClearCache
import typingsJapgolly.reselect.anon.FnCall
import typingsJapgolly.reselect.esDefaultMemoizeMod.DefaultMemoizeOptions
import typingsJapgolly.reselect.esTypesMod.DropFirst
import typingsJapgolly.reselect.esTypesMod.EqualityFn
import typingsJapgolly.reselect.esTypesMod.Expand
import typingsJapgolly.reselect.esTypesMod.ExtractParams
import typingsJapgolly.reselect.esTypesMod.GetParamsFromSelectors
import typingsJapgolly.reselect.esTypesMod.Head
import typingsJapgolly.reselect.esTypesMod.LastOf
import typingsJapgolly.reselect.esTypesMod.LongestArray
import typingsJapgolly.reselect.esTypesMod.MergeParameters
import typingsJapgolly.reselect.esTypesMod.OutputSelector
import typingsJapgolly.reselect.esTypesMod.Selector
import typingsJapgolly.reselect.esTypesMod.SelectorArray
import typingsJapgolly.reselect.esTypesMod.SelectorResultArray
import typingsJapgolly.reselect.esTypesMod.Tail
import typingsJapgolly.reselect.esTypesMod.Transpose
import typingsJapgolly.reselect.esTypesMod.TuplifyUnion
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.Pick
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reselect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("reselect", "createSelector")
  @js.native
  val createSelector: CreateSelectorFunction[
    js.Function1[/* repeated */ Any, Any], 
    FnCall, 
    js.Array[/* equalityCheckOrOptions */ js.UndefOr[EqualityFn | DefaultMemoizeOptions]], 
    ClearCache
  ] = js.native
  
  inline def createSelectorCreator[/** Selectors will eventually accept some function to be memoized */
  F /* <: js.Function1[/* repeated */ Any, Any] */, /** A memoizer such as defaultMemoize that accepts a function + some possible options */
  MemoizeFunction /* <: js.Function2[/* func */ F, /* repeated */ Any, F] */, /** The additional options arguments to the memoizer */
  MemoizeOptions /* <: js.Array[Any] */](
    memoize: MemoizeFunction,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param memoizeOptionsFromArgs because its type DropFirst<Parameters<MemoizeFunction>> is not an array type */ memoizeOptionsFromArgs: DropFirst[Parameters[MemoizeFunction]]
  ): CreateSelectorFunction[
    F, 
    MemoizeFunction, 
    MemoizeOptions, 
    Expand[
      Pick[ReturnType[MemoizeFunction], /* keyof std.ReturnType<MemoizeFunction> */ String]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSelectorCreator")(memoize.asInstanceOf[js.Any], memoizeOptionsFromArgs.asInstanceOf[js.Any])).asInstanceOf[CreateSelectorFunction[
    F, 
    MemoizeFunction, 
    MemoizeOptions, 
    Expand[
      Pick[ReturnType[MemoizeFunction], /* keyof std.ReturnType<MemoizeFunction> */ String]
    ]
  ]]
  
  @JSImport("reselect", "createStructuredSelector")
  @js.native
  val createStructuredSelector: StructuredSelectorCreator = js.native
  
  @JSImport("reselect", "defaultEqualityCheck")
  @js.native
  val defaultEqualityCheck: EqualityFn = js.native
  
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F & ClearCache = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any]).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: DefaultMemoizeOptions): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  inline def defaultMemoize[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: EqualityFn): F & ClearCache = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMemoize")(func.asInstanceOf[js.Any], equalityCheckOrOptions.asInstanceOf[js.Any])).asInstanceOf[F & ClearCache]
  
  @js.native
  trait CreateSelectorFunction[F /* <: js.Function1[/* repeated */ Any, Any] */, MemoizeFunction /* <: js.Function2[/* func */ F, /* repeated */ Any, F] */, MemoizeOptions /* <: js.Array[Any] */, Keys] extends StObject {
    
    /** Input selectors as separate inline arguments */
    /** Input selectors as separate inline arguments with memoizeOptions passed */
    def apply[Selectors /* <: SelectorArray */, Result](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param items because its type [...Selectors, (args : SelectorResultArray<Selectors>): Result] is not an array type */ items: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
    /** Input selectors as a separate array */
    def apply[Selectors /* <: SelectorArray */, Result](
      selectors: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors],
      combiner: js.Function1[/* args */ SelectorResultArray[Selectors], Result]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
    def apply[Selectors /* <: SelectorArray */, Result](
      selectors: /* import warning: importer.ImportType#apply c repeated non-array type: Selectors */ js.Array[Selectors],
      combiner: js.Function1[/* args */ SelectorResultArray[Selectors], Result],
      options: CreateSelectorOptions[MemoizeOptions]
    ): (OutputSelector[
        Selectors, 
        Result, 
        js.Function1[/* args */ SelectorResultArray[Selectors], Result & Keys], 
        GetParamsFromSelectors[
          Selectors, 
          Tail[
            MergeParameters[
              Selectors, 
              ExtractParams[Selectors], 
              Transpose[ExtractParams[Selectors]], 
              TuplifyUnion[
                Transpose[ExtractParams[Selectors]], 
                LastOf[Transpose[ExtractParams[Selectors]]], 
                /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
              ], 
              LongestArray[
                TuplifyUnion[
                  Transpose[ExtractParams[Selectors]], 
                  LastOf[Transpose[ExtractParams[Selectors]]], 
                  /* import warning: importer.ImportType#apply Failed type conversion: [reselect.reselect/es/types.Transpose<reselect.reselect/es/types.ExtractParams<Selectors>>] extends [never] ? true : false */ js.Any
                ]
              ]
            ]
          ]
        ]
      ]) & Keys = js.native
  }
  
  trait CreateSelectorOptions[MemoizeOptions /* <: js.Array[Any] */] extends StObject {
    
    var memoizeOptions: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
  }
  object CreateSelectorOptions {
    
    inline def apply[MemoizeOptions /* <: js.Array[Any] */](
      memoizeOptions: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
    ): CreateSelectorOptions[MemoizeOptions] = {
      val __obj = js.Dynamic.literal(memoizeOptions = memoizeOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSelectorOptions[MemoizeOptions]]
    }
    
    extension [Self <: CreateSelectorOptions[?], MemoizeOptions /* <: js.Array[Any] */](x: Self & CreateSelectorOptions[MemoizeOptions]) {
      
      inline def setMemoizeOptions(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: MemoizeOptions[0] */ js.Any) | MemoizeOptions
      ): Self = StObject.set(x, "memoizeOptions", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectorsObject = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  @js.native
  trait StructuredSelectorCreator extends StObject {
    
    def apply[SelectorMap /* <: SelectorsObject */, SelectorParams](selectorMap: SelectorMap): js.Function2[
        /* state */ Head[SelectorParams], 
        /* params */ Tail[SelectorParams], 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof SelectorMap ]: std.ReturnType<SelectorMap[Key]>} */ js.Any
      ] = js.native
    def apply[SelectorMap /* <: SelectorsObject */, SelectorParams](
      selectorMap: SelectorMap,
      selectorCreator: CreateSelectorFunction[Any, Any, Any, Expand[Pick[ReturnType[Any], /* keyof std.ReturnType<any> */ String]]]
    ): js.Function2[
        /* state */ Head[SelectorParams], 
        /* params */ Tail[SelectorParams], 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof SelectorMap ]: std.ReturnType<SelectorMap[Key]>} */ js.Any
      ] = js.native
    def apply[State, Result](
      selectors: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Result ]: reselect.reselect/es/types.Selector<State, Result[K], never>} */ js.Any
    ): Selector[State, Result, scala.Nothing] = js.native
    def apply[State, Result](
      selectors: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof Result ]: reselect.reselect/es/types.Selector<State, Result[K], never>} */ js.Any,
      selectorCreator: CreateSelectorFunction[Any, Any, Any, Expand[Pick[ReturnType[Any], /* keyof std.ReturnType<any> */ String]]]
    ): Selector[State, Result, scala.Nothing] = js.native
  }
}
