package typingsJapgolly.reactWithStyles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libThemedStyleSheetMod {
  
  object default {
    
    @JSImport("react-with-styles/lib/ThemedStyleSheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createLTR(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createLTR")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def createRTL(makeFromTheme: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRTL")(makeFromTheme.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def get(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[Any]
    
    inline def registerInterface(registerInterface: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInterface")(registerInterface.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerTheme(theme: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resolve(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Any]
    
    inline def resolveLTR(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveLTR")().asInstanceOf[Any]
    
    inline def resolveRTL(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveRTL")().asInstanceOf[Any]
  }
  
  trait ThemedStyleSheet extends StObject {
    
    def create(makeFromTheme: Any): Any
    
    def createLTR(makeFromTheme: Any): Any
    
    def createRTL(makeFromTheme: Any): Any
    
    def flush(): Unit
    
    def get(): Any
    
    def registerInterface(registerInterface: Any): Unit
    
    def registerTheme(theme: Any): Unit
    
    def resolve(): Any
    
    def resolveLTR(): Any
    
    def resolveRTL(): Any
  }
  object ThemedStyleSheet {
    
    inline def apply(
      create: Any => Any,
      createLTR: Any => Any,
      createRTL: Any => Any,
      flush: Callback,
      get: CallbackTo[Any],
      registerInterface: Any => Callback,
      registerTheme: Any => Callback,
      resolve: CallbackTo[Any],
      resolveLTR: CallbackTo[Any],
      resolveRTL: CallbackTo[Any]
    ): ThemedStyleSheet = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createLTR = js.Any.fromFunction1(createLTR), createRTL = js.Any.fromFunction1(createRTL), flush = flush.toJsFn, get = get.toJsFn, registerInterface = js.Any.fromFunction1((t0: Any) => registerInterface(t0).runNow()), registerTheme = js.Any.fromFunction1((t0: Any) => registerTheme(t0).runNow()), resolve = resolve.toJsFn, resolveLTR = resolveLTR.toJsFn, resolveRTL = resolveRTL.toJsFn)
      __obj.asInstanceOf[ThemedStyleSheet]
    }
    
    extension [Self <: ThemedStyleSheet](x: Self) {
      
      inline def setCreate(value: Any => Any): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateLTR(value: Any => Any): Self = StObject.set(x, "createLTR", js.Any.fromFunction1(value))
      
      inline def setCreateRTL(value: Any => Any): Self = StObject.set(x, "createRTL", js.Any.fromFunction1(value))
      
      inline def setFlush(value: Callback): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setRegisterInterface(value: Any => Callback): Self = StObject.set(x, "registerInterface", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRegisterTheme(value: Any => Callback): Self = StObject.set(x, "registerTheme", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setResolve(value: CallbackTo[Any]): Self = StObject.set(x, "resolve", value.toJsFn)
      
      inline def setResolveLTR(value: CallbackTo[Any]): Self = StObject.set(x, "resolveLTR", value.toJsFn)
      
      inline def setResolveRTL(value: CallbackTo[Any]): Self = StObject.set(x, "resolveRTL", value.toJsFn)
    }
  }
}
