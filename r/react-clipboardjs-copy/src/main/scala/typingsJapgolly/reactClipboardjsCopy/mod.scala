package typingsJapgolly.reactClipboardjsCopy

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactClipboardjsCopy.mod.ReactClipboard.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-clipboardjs-copy", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[Props, js.Object, Any]
  object default {
    
    @JSImport("react-clipboardjs-copy", "default.ReactClipboard")
    @js.native
    open class ReactClipboard ()
      extends PureComponent[Props, js.Object, Any]
  }
  
  object ReactClipboard {
    
    trait Options extends StObject {
      
      var container: js.UndefOr[HTMLElement] = js.undefined
      
      var target: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
        
        inline def setTarget(value: (/* text */ String, /* result */ Boolean) => Callback): Self = StObject.set(x, "target", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    trait Props extends StObject {
      
      var action: js.UndefOr[String] = js.undefined
      
      var onError: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
      
      var onSuccess: js.UndefOr[js.Function2[/* text */ String, /* result */ Boolean, Unit]] = js.undefined
      
      var options: js.UndefOr[Options] = js.undefined
      
      var selection: js.UndefOr[Boolean] = js.undefined
      
      var target: js.UndefOr[String] = js.undefined
      
      var text: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
        inline def setOnError(value: (/* text */ String, /* result */ Boolean) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
        
        inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
        
        inline def setOnSuccess(value: (/* text */ String, /* result */ Boolean) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* text */ String, t1: /* result */ Boolean) => (value(t0, t1)).runNow()))
        
        inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
        
        inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
        
        inline def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
        
        inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
        
        inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
        
        inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      }
    }
    
    type ReactClipboard = PureComponent[Props, js.Object, Any]
  }
  type ReactClipboard = PureComponent[Props, js.Object, Any]
}
