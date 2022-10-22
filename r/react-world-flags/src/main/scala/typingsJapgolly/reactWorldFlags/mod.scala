package typingsJapgolly.reactWorldFlags

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Easy to use SVG flags of the world for react
    */
  @JSImport("react-world-flags", JSImport.Default)
  @js.native
  val default: FC[FlagProps] = js.native
  
  trait FlagProps
    extends StObject
       with HTMLProps[HTMLImageElement] {
    
    /**
      * code is the two letter, three letter or three digit country code.
      */
    var code: js.UndefOr[String] = js.undefined
    
    /**
      * You can also pass an optional fallback which renders if the given code doesn't correspond to a flag
      */
    var fallback: js.UndefOr[Node | Null] = js.undefined
  }
  object FlagProps {
    
    inline def apply(): FlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagProps]
    }
    
    extension [Self <: FlagProps](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setFallback(value: VdomNode): Self = StObject.set(x, "fallback", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFallbackNull: Self = StObject.set(x, "fallback", null)
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFallbackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "fallback", js.Array(value*))
      
      inline def setFallbackVdomElement(value: VdomElement): Self = StObject.set(x, "fallback", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[FlagProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[FlagProps] = default
}
