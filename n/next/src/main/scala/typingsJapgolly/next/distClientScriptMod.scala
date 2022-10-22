package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLScriptElement
import typingsJapgolly.next.nextStrings.afterInteractive
import typingsJapgolly.next.nextStrings.beforeInteractive
import typingsJapgolly.next.nextStrings.lazyOnload
import typingsJapgolly.next.nextStrings.worker_
import typingsJapgolly.react.mod.ScriptHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientScriptMod {
  
  @JSImport("next/dist/client/script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ScriptProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def handleClientScriptLoad(props: ScriptProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleClientScriptLoad")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initScriptLoader(scriptLoaderItems: js.Array[ScriptProps]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initScriptLoader")(scriptLoaderItems.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Props = ScriptProps
  
  trait ScriptProps
    extends StObject
       with ScriptHTMLAttributes[HTMLScriptElement] {
    
    @JSName("onError")
    var onError_ScriptProps: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    @JSName("onLoad")
    var onLoad_ScriptProps: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit | Null]] = js.undefined
    
    var strategy: js.UndefOr[afterInteractive | lazyOnload | beforeInteractive | worker_] = js.undefined
  }
  object ScriptProps {
    
    inline def apply(): ScriptProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScriptProps]
    }
    
    extension [Self <: ScriptProps](x: Self) {
      
      inline def setOnError(value: /* e */ Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: /* e */ Any => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnReady(value: CallbackTo[Unit | Null]): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setStrategy(value: afterInteractive | lazyOnload | beforeInteractive | worker_): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
