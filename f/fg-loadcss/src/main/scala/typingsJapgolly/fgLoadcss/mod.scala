package typingsJapgolly.fgLoadcss

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLinkElement
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fg-loadcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadCSS(href: String): HTMLLinkElement = ^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any]).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: String): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: String, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: HTMLElement, media: Unit, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: String): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: String, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  inline def loadCSS(href: String, before: Unit, media: Unit, attributes: Record[String, String]): HTMLLinkElement = (^.asInstanceOf[js.Dynamic].applyDynamic("loadCSS")(href.asInstanceOf[js.Any], before.asInstanceOf[js.Any], media.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[HTMLLinkElement]
  
  object global {
    
    trait Window extends StObject {
      
      def onloadCSS(stylesheet: HTMLLinkElement, callback: js.Function0[Unit]): Unit
    }
    object Window {
      
      inline def apply(onloadCSS: (HTMLLinkElement, js.Function0[Unit]) => Callback): Window = {
        val __obj = js.Dynamic.literal(onloadCSS = js.Any.fromFunction2((t0: HTMLLinkElement, t1: js.Function0[Unit]) => (onloadCSS(t0, t1)).runNow()))
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setOnloadCSS(value: (HTMLLinkElement, js.Function0[Unit]) => Callback): Self = StObject.set(x, "onloadCSS", js.Any.fromFunction2((t0: HTMLLinkElement, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      }
    }
  }
}
