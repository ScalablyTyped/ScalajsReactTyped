package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.wordpressComponents.sandboxMod.SandBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sandboxMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/sandbox", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object SandBox {
    
    trait Props extends StObject {
      
      /**
        * HTML for the document `<body>` of the sandbox.
        */
      var html: js.UndefOr[String] = js.undefined
      
      var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
      
      /**
        * Inline JS to apply to the sandboxed document.
        */
      var scripts: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Inline CSS to apply to the sandboxed document.
        */
      var styles: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Text for the document `<title>` of the sandbox.
        */
      var title: js.UndefOr[String] = js.undefined
      
      /**
        * `className` that is applied to both the sandbox `<html>` element and
        * `<body>` element.
        */
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
        
        inline def setOnFocus(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
        
        inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
        
        inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
        
        inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
        
        inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
        
        inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
  }
}
