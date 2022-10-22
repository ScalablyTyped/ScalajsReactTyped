package typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookRouter.distTs3Dot9ModulesReactRouterNodeModulesHistoryIndexMod.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@storybook/router.@storybook/router/dist/ts3.9/_modules/react-router-node_modules-history-index.History, 'action' | 'location' | 'back' | 'forward' | 'listen' | 'block'> */
trait Navigator extends StObject {
  
  var createHref: js.Function1[/* to */ To, String]
  
  var go: js.Function1[/* delta */ Double, Unit]
  
  var push: js.Function2[/* to */ To, /* state */ js.UndefOr[Any], Unit]
  
  var replace: js.Function2[/* to */ To, /* state */ js.UndefOr[Any], Unit]
}
object Navigator {
  
  inline def apply(
    createHref: /* to */ To => String,
    go: /* delta */ Double => Callback,
    push: (/* to */ To, /* state */ js.UndefOr[Any]) => Callback,
    replace: (/* to */ To, /* state */ js.UndefOr[Any]) => Callback
  ): Navigator = {
    val __obj = js.Dynamic.literal(createHref = js.Any.fromFunction1(createHref), go = js.Any.fromFunction1((t0: /* delta */ Double) => go(t0).runNow()), push = js.Any.fromFunction2((t0: /* to */ To, t1: /* state */ js.UndefOr[Any]) => (push(t0, t1)).runNow()), replace = js.Any.fromFunction2((t0: /* to */ To, t1: /* state */ js.UndefOr[Any]) => (replace(t0, t1)).runNow()))
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setCreateHref(value: /* to */ To => String): Self = StObject.set(x, "createHref", js.Any.fromFunction1(value))
    
    inline def setGo(value: /* delta */ Double => Callback): Self = StObject.set(x, "go", js.Any.fromFunction1((t0: /* delta */ Double) => value(t0).runNow()))
    
    inline def setPush(value: (/* to */ To, /* state */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "push", js.Any.fromFunction2((t0: /* to */ To, t1: /* state */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setReplace(value: (/* to */ To, /* state */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: /* to */ To, t1: /* state */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
  }
}
