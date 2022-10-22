package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.tapable.mod.Append
import typingsJapgolly.tapable.mod.AsArray
import typingsJapgolly.tapable.mod.InnerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>> */
trait FakeHookPickAsyncSeriesHo extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  def tap(options: String, fn: js.Function1[/* args */ AsArray[js.Array[Any]], Unit]): Unit
  
  def tapAsync(
    options: String,
    fn: js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]
  ): Unit
  @JSName("tapAsync")
  var tapAsync_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit], 
    Unit
  ]
  
  def tapPromise(options: String, fn: js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]): Unit
  @JSName("tapPromise")
  var tapPromise_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]], 
    Unit
  ]
  
  @JSName("tap")
  var tap_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit], 
    Unit
  ]
}
object FakeHookPickAsyncSeriesHo {
  
  inline def apply(
    tap: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => Callback,
    tapAsync: (/* options */ String, /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => Callback,
    tapPromise: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => Callback
  ): FakeHookPickAsyncSeriesHo = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => (tap(t0, t1)).runNow()), tapAsync = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => (tapAsync(t0, t1)).runNow()), tapPromise = js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => (tapPromise(t0, t1)).runNow()))
    __obj.asInstanceOf[FakeHookPickAsyncSeriesHo]
  }
  
  extension [Self <: FakeHookPickAsyncSeriesHo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTap(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => Callback
    ): Self = StObject.set(x, "tap", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setTapAsync(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => Callback
    ): Self = StObject.set(x, "tapAsync", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => (value(t0, t1)).runNow()))
    
    inline def setTapPromise(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => Callback
    ): Self = StObject.set(x, "tapPromise", js.Any.fromFunction2((t0: /* options */ String, t1: /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => (value(t0, t1)).runNow()))
  }
}
