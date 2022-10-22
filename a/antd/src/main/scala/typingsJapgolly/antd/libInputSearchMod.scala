package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.antd.libInputInputMod.InputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputSearchMod extends Shortcut {
  
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = js.native
  
  trait SearchProps
    extends StObject
       with InputProps {
    
    var enterButton: js.UndefOr[Node] = js.undefined
    
    var inputPrefixCls: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onSearch: js.UndefOr[
        js.Function2[
          /* value */ String, 
          /* event */ js.UndefOr[
            ReactEventFrom[HTMLInputElement] | ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLInputElement]
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object SearchProps {
    
    inline def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
    
    extension [Self <: SearchProps](x: Self) {
      
      inline def setEnterButton(value: VdomNode): Self = StObject.set(x, "enterButton", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEnterButtonNull: Self = StObject.set(x, "enterButton", null)
      
      inline def setEnterButtonUndefined: Self = StObject.set(x, "enterButton", js.undefined)
      
      inline def setEnterButtonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "enterButton", js.Array(value*))
      
      inline def setEnterButtonVdomElement(value: VdomElement): Self = StObject.set(x, "enterButton", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnSearch(
        value: (/* value */ String, /* event */ js.UndefOr[
              ReactEventFrom[HTMLInputElement] | ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLInputElement]
            ]) => Callback
      ): Self = StObject.set(x, "onSearch", js.Any.fromFunction2((t0: /* value */ String, t1: /* event */ js.UndefOr[
              ReactEventFrom[HTMLInputElement] | ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLInputElement]
            ]) => (value(t0, t1)).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libInputSearchMod.foo` */
  override def _to: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = default
}
