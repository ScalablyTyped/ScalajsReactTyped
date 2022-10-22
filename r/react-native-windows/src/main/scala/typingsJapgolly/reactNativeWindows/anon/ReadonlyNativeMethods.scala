package typingsJapgolly.reactNativeWindows.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeWindows.rntypesMod.HostComponent
import typingsJapgolly.reactNativeWindows.rntypesMod.MeasureInWindowOnSuccessCallback
import typingsJapgolly.reactNativeWindows.rntypesMod.MeasureLayoutOnSuccessCallback
import typingsJapgolly.reactNativeWindows.rntypesMod.MeasureOnSuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-windows.react-native-windows/rntypes.NativeMethods> */
trait ReadonlyNativeMethods extends StObject {
  
  val blur: js.Function0[Unit]
  
  val focus: js.Function0[Unit]
  
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit]
  
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit]
  
  val measureLayout: js.Function3[
    /* relativeToNativeComponentRef */ HostComponent[Any] | Double, 
    /* onSuccess */ MeasureLayoutOnSuccessCallback, 
    /* onFail */ js.Function0[Unit], 
    Unit
  ]
  
  val refs: StringDictionary[Component[Any & js.Object, js.Object]]
  
  val setNativeProps: js.Function1[/* nativeProps */ js.Object, Unit]
}
object ReadonlyNativeMethods {
  
  inline def apply(
    blur: Callback,
    focus: Callback,
    measure: /* callback */ MeasureOnSuccessCallback => Callback,
    measureInWindow: /* callback */ MeasureInWindowOnSuccessCallback => Callback,
    measureLayout: (/* relativeToNativeComponentRef */ HostComponent[Any] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Callback,
    refs: StringDictionary[Component[Any & js.Object, js.Object]],
    setNativeProps: /* nativeProps */ js.Object => Callback
  ): ReadonlyNativeMethods = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn, measure = js.Any.fromFunction1((t0: /* callback */ MeasureOnSuccessCallback) => measure(t0).runNow()), measureInWindow = js.Any.fromFunction1((t0: /* callback */ MeasureInWindowOnSuccessCallback) => measureInWindow(t0).runNow()), measureLayout = js.Any.fromFunction3((t0: /* relativeToNativeComponentRef */ HostComponent[Any] | Double, t1: /* onSuccess */ MeasureLayoutOnSuccessCallback, t2: /* onFail */ js.Function0[Unit]) => (measureLayout(t0, t1, t2)).runNow()), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1((t0: /* nativeProps */ js.Object) => setNativeProps(t0).runNow()))
    __obj.asInstanceOf[ReadonlyNativeMethods]
  }
  
  extension [Self <: ReadonlyNativeMethods](x: Self) {
    
    inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setMeasure(value: /* callback */ MeasureOnSuccessCallback => Callback): Self = StObject.set(x, "measure", js.Any.fromFunction1((t0: /* callback */ MeasureOnSuccessCallback) => value(t0).runNow()))
    
    inline def setMeasureInWindow(value: /* callback */ MeasureInWindowOnSuccessCallback => Callback): Self = StObject.set(x, "measureInWindow", js.Any.fromFunction1((t0: /* callback */ MeasureInWindowOnSuccessCallback) => value(t0).runNow()))
    
    inline def setMeasureLayout(
      value: (/* relativeToNativeComponentRef */ HostComponent[Any] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Callback
    ): Self = StObject.set(x, "measureLayout", js.Any.fromFunction3((t0: /* relativeToNativeComponentRef */ HostComponent[Any] | Double, t1: /* onSuccess */ MeasureLayoutOnSuccessCallback, t2: /* onFail */ js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRefs(value: StringDictionary[Component[Any & js.Object, js.Object]]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setSetNativeProps(value: /* nativeProps */ js.Object => Callback): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction1((t0: /* nativeProps */ js.Object) => value(t0).runNow()))
  }
}
