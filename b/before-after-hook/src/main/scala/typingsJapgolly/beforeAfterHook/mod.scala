package typingsJapgolly.beforeAfterHook

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Error
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Options
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Result
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.after
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.before
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.error_
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.remove
import typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.wrap
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("before-after-hook", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a collection of hooks
      */
    @JSImport("before-after-hook", "default.Collection")
    @js.native
    def Collection: typingsJapgolly.beforeAfterHook.mod.Collection = js.native
    
    /**
      * Creates a collection of hooks
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "default.Collection")
    @js.native
    open class CollectionCls[HooksType /* <: Record[String, TypeStore] */] ()
      extends StObject
         with HookCollection[HooksType, /* keyof HooksType */ String]
    
    inline def Collection_=(x: Collection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    @JSImport("before-after-hook", "default.Singular")
    @js.native
    def Singular: typingsJapgolly.beforeAfterHook.mod.Singular = js.native
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("before-after-hook", "default.Singular")
    @js.native
    open class SingularCls[Options, Result, Error] ()
      extends StObject
         with HookSingular[Options, Result, Error]
    
    inline def Singular_=(x: Singular): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Singular")(x.asInstanceOf[js.Any])
  }
  
  type AfterHook[Options, Result] = js.Function2[/* result */ Result, /* options */ Options, Unit | js.Promise[Unit]]
  
  type AnyHook[Options, Result, Error] = BeforeHook[Options] | (ErrorHook[Options, Error]) | (AfterHook[Options, Result]) | (WrapHook[Options, Result])
  
  type BeforeHook[Options] = js.Function1[/* options */ Options, Unit | js.Promise[Unit]]
  
  type Collection = Instantiable0[
    HookCollection[
      Record[String, TypeStore], 
      /* keyof std.Record<string, before-after-hook.before-after-hook.TypeStore> */ String
    ]
  ]
  
  type ErrorHook[Options, Error] = js.Function2[/* error */ Error, /* options */ Options, Any | js.Promise[Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TKey extends keyof TStore ? TStore[TKey] : any
    }}}
    */
  @js.native
  trait GetType[TStore /* <: TypeStore */, TKey /* <: TypeStoreKey */] extends StObject
  
  trait Hook extends StObject {
    
    /**
      * Creates a collection of hooks
      */
    var Collection: typingsJapgolly.beforeAfterHook.mod.Collection
    
    /**
      * Creates a nameless hook that supports strict typings
      */
    var Singular: typingsJapgolly.beforeAfterHook.mod.Singular
  }
  object Hook {
    
    inline def apply(Collection: Collection, Singular: Singular): Hook = {
      val __obj = js.Dynamic.literal(Collection = Collection.asInstanceOf[js.Any], Singular = Singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook]
    }
    
    extension [Self <: Hook](x: Self) {
      
      inline def setCollection(value: Collection): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: Singular): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HookCollection[HooksType /* <: Record[String, TypeStore] */, HookName /* <: /* keyof HooksType */ String */] extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply[Name /* <: HookName */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: Name,
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Options
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result
        ]
      ] = js.native
    def apply[Name /* <: HookName */](
      name: js.Array[Name],
      hookMethod: HookMethod[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ],
      options: GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Options
        ]
    ): js.Promise[
        GetType[
          /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
          Result
        ]
      ] = js.native
    
    /**
      * Add `after` hook for given `name`
      */
    def after[Name /* <: HookName */](
      name: Name,
      afterHook: AfterHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ]
    ): Unit = js.native
    
    /**
      * Public API
      */
    var api: Pick[
        HookCollection[HooksType, /* keyof HooksType */ String], 
        before | error_ | after | wrap | remove
      ] = js.native
    
    /**
      * Add `before` hook for given `name`
      */
    @JSName("before")
    def before_Options[Name /* <: HookName */](
      name: Name,
      beforeHook: BeforeHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ]
        ]
    ): Unit = js.native
    
    /**
      * Add `error` hook for given `name`
      */
    def error[Name /* <: HookName */](
      name: Name,
      errorHook: ErrorHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Error
          ]
        ]
    ): Unit = js.native
    
    /**
      * Remove added hook for given `name`
      */
    def remove[Name /* <: HookName */](
      name: Name,
      hook: AnyHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Error
          ]
        ]
    ): Unit = js.native
    
    /**
      * Add `wrap` hook for given `name`
      */
    def wrap[Name /* <: HookName */](
      name: Name,
      wrapHook: WrapHook[
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Options
          ], 
          GetType[
            /* import warning: importer.ImportType#apply Failed type conversion: HooksType[Name] */ js.Any, 
            Result
          ]
        ]
    ): Unit = js.native
  }
  
  type HookMethod[Options, Result] = js.Function1[/* options */ Options, Result | js.Promise[Result]]
  
  @js.native
  trait HookSingular[Options, Result, Error] extends StObject {
    
    /**
      * Invoke before and after hooks
      */
    def apply(hookMethod: HookMethod[Options, Result]): js.Promise[Result] = js.native
    def apply(hookMethod: HookMethod[Options, Result], options: Options): js.Promise[Result] = js.native
    
    /**
      * Add `after` hook
      */
    def after(afterHook: AfterHook[Options, Result]): Unit = js.native
    
    /**
      * Public API
      */
    var api: Pick[HookSingular[Options, Result, Error], before | error_ | after | wrap | remove] = js.native
    
    /**
      * Add `before` hook
      */
    def before(beforeHook: BeforeHook[Options]): Unit = js.native
    
    /**
      * Add `error` hook
      */
    def error(errorHook: ErrorHook[Options, Error]): Unit = js.native
    
    /**
      * Remove added hook
      */
    def remove(hook: AnyHook[Options, Result, Error]): Unit = js.native
    
    /**
      * Add `wrap` hook
      */
    def wrap(wrapHook: WrapHook[Options, Result]): Unit = js.native
  }
  
  type Singular = Instantiable0[HookSingular[js.Object, js.Object, js.Object]]
  
  /* Inlined {[ key in before-after-hook.before-after-hook.TypeStoreKey ]:? any} */
  trait TypeStore extends StObject {
    
    var Error: js.UndefOr[Any] = js.undefined
    
    var Options: js.UndefOr[Any] = js.undefined
    
    var Result: js.UndefOr[Any] = js.undefined
  }
  object TypeStore {
    
    inline def apply(): TypeStore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeStore]
    }
    
    extension [Self <: TypeStore](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Options
    - typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Result
    - typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Error
  */
  trait TypeStoreKey extends StObject
  object TypeStoreKey {
    
    inline def Error: typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Error = "Error".asInstanceOf[typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Error]
    
    inline def Options: typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Options = "Options".asInstanceOf[typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Options]
    
    inline def Result: typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Result = "Result".asInstanceOf[typingsJapgolly.beforeAfterHook.beforeAfterHookStrings.Result]
  }
  
  type WrapHook[Options, Result] = js.Function2[
    /* hookMethod */ HookMethod[Options, Result], 
    /* options */ Options, 
    Result | js.Promise[Result]
  ]
}
