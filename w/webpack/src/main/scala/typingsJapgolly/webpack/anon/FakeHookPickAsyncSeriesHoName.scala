package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Set
import typingsJapgolly.tapable.mod.Append
import typingsJapgolly.tapable.mod.AsArray
import typingsJapgolly.tapable.mod.InnerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[std.Set<webpack.webpack.Chunk>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>> */
trait FakeHookPickAsyncSeriesHoName extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  def tap(
    options: String,
    fn: js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit]
  ): Unit
  
  def tapAsync(
    options: String,
    fn: js.Function1[
      /* args */ Append[
        AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
        InnerCallback[js.Error, Unit]
      ], 
      Unit
    ]
  ): Unit
  @JSName("tapAsync")
  var tapAsync_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
        InnerCallback[js.Error, Unit]
      ], 
      Unit
    ], 
    Unit
  ]
  
  def tapPromise(
    options: String,
    fn: js.Function1[
      /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
      js.Promise[Unit]
    ]
  ): Unit
  @JSName("tapPromise")
  var tapPromise_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
      js.Promise[Unit]
    ], 
    Unit
  ]
  
  @JSName("tap")
  var tap_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit], 
    Unit
  ]
}
object FakeHookPickAsyncSeriesHoName {
  
  inline def apply(
    tap: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit]) => Callback,
    tapAsync: (/* options */ String, /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
        InnerCallback[js.Error, Unit]
      ], 
      Unit
    ]) => Callback,
    tapPromise: (/* options */ String, /* fn */ js.Function1[
      /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
      js.Promise[Unit]
    ]) => Callback
  ): FakeHookPickAsyncSeriesHoName = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit]) => (tap(t0, t1)).runNow()), tapAsync = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
        InnerCallback[js.Error, Unit]
      ], 
      Unit
    ]) => (tapAsync(t0, t1)).runNow()), tapPromise = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
      /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
      js.Promise[Unit]
    ]) => (tapPromise(t0, t1)).runNow()))
    __obj.asInstanceOf[FakeHookPickAsyncSeriesHoName]
  }
  
  extension [Self <: FakeHookPickAsyncSeriesHoName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTap(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit]) => Callback
    ): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setTapAsync(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ Append[
            AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
            InnerCallback[js.Error, Unit]
          ], 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "tapAsync", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
          /* args */ Append[
            AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
            InnerCallback[js.Error, Unit]
          ], 
          Unit
        ]) => (value(t0, t1)).runNow()))
    
    inline def setTapPromise(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
          js.Promise[Unit]
        ]) => Callback
    ): Self = StObject.set(x, "tapPromise", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[
          /* args */ AsArray[js.Array[Set[typingsJapgolly.webpack.mod.Chunk]]], 
          js.Promise[Unit]
        ]) => (value(t0, t1)).runNow()))
  }
}
