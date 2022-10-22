package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tapable.mod.Append
import typingsJapgolly.tapable.mod.AsArray
import typingsJapgolly.tapable.mod.InnerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesWaterfallHook<[std.Array<any>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>> */
trait FakeHookPickAsyncSeriesWa extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  @JSName("tapAsync")
  def tapAsync_0(
    options: String,
    fn: js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ]
  ): Unit
  @JSName("tapAsync")
  var tapAsync_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ], 
    Unit
  ]
  
  @JSName("tapPromise")
  def tapPromise_0(
    options: String,
    fn: js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ]
  ): Unit
  @JSName("tapPromise")
  var tapPromise_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ], 
    Unit
  ]
  
  @JSName("tap")
  def tap_0(
    options: String,
    fn: js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ]
  ): Unit
  @JSName("tap")
  var tap_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ], 
    Unit
  ]
}
object FakeHookPickAsyncSeriesWa {
  
  inline def apply(
    tap: (/* options */ String, /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ]) => Callback,
    tapAsync: (/* options */ String, /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ]) => Callback,
    tapPromise: (/* options */ String, /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ]) => Callback
  ): FakeHookPickAsyncSeriesWa = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ]) => (tap(t0, t1)).runNow()), tapAsync = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ]) => (tapAsync(t0, t1)).runNow()), tapPromise = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ]) => (tapPromise(t0, t1)).runNow()))
    __obj.asInstanceOf[FakeHookPickAsyncSeriesWa]
  }
  
  extension [Self <: FakeHookPickAsyncSeriesWa](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTap(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]) => Callback
    ): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]) => (value(t0, t1)).runNow()))
    
    inline def setTapAsync(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ Append[
            AsArray[js.Array[js.Array[Any]]], 
            InnerCallback[
              js.Error, 
              /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
            ]
          ], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "tapAsync", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
          /* args */ Append[
            AsArray[js.Array[js.Array[Any]]], 
            InnerCallback[
              js.Error, 
              /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
            ]
          ], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setTapPromise(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
          ]
        ]) => Callback
    ): Self = StObject.set(x, "tapPromise", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
          ]
        ]) => (value(t0, t1)).runNow()))
  }
}
