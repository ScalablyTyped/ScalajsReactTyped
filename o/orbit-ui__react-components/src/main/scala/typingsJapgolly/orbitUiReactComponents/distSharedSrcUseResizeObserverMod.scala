package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.ResizeObserverEntry
import typingsJapgolly.std.ResizeObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseResizeObserverMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useResizeObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit]): RefFn[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[RefFn[HTMLElement]]
  inline def useResizeObserver(
    onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit],
    hasIsDisabledBox: UseResizeObserverOptions
  ): RefFn[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], hasIsDisabledBox.asInstanceOf[js.Any])).asInstanceOf[RefFn[HTMLElement]]
  
  trait UseResizeObserverOptions
    extends StObject
       with ResizeObserverOptions {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object UseResizeObserverOptions {
    
    inline def apply(): UseResizeObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseResizeObserverOptions]
    }
    
    extension [Self <: UseResizeObserverOptions](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
}
