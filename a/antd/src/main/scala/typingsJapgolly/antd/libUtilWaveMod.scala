package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.anon.Cancel
import typingsJapgolly.antd.libConfigProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilWaveMod extends Shortcut {
  
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[WaveProps & RefAttributes[InternalWave]] = js.native
  
  @js.native
  trait InternalWave
    extends Component[WaveProps, js.Object, Any] {
    
    /* private */ var animationStart: Any = js.native
    
    /* private */ var animationStartId: Any = js.native
    
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[Cancel] = js.native
    
    /* private */ var clickWaveTimeoutId: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInternalWave(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInternalWave(): Unit = js.native
    
    /* private */ var containerRef: Any = js.native
    
    @JSName("context")
    var context_InternalWave: ConfigConsumerProps = js.native
    
    /* private */ var csp: Any = js.native
    
    /* private */ var destroyed: Any = js.native
    
    /* private */ var extraNode: Any = js.native
    
    def getAttributeName(): String = js.native
    
    /* private */ var instance: Any = js.native
    
    def onClick(node: HTMLElement, waveColor: String): Unit = js.native
    
    def onTransitionEnd(e: AnimationEvent): Unit = js.native
    
    def onTransitionStart(e: AnimationEvent): Unit = js.native
    
    def renderWave(hasCsp: ConfigConsumerProps): js.UndefOr[String | Double | Boolean | ReactFragment | Element | Null] = js.native
    
    def resetEffect(node: HTMLElement): Unit = js.native
  }
  
  trait WaveProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var insertExtraNode: js.UndefOr[Boolean] = js.undefined
  }
  object WaveProps {
    
    inline def apply(): WaveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaveProps]
    }
    
    extension [Self <: WaveProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInsertExtraNode(value: Boolean): Self = StObject.set(x, "insertExtraNode", value.asInstanceOf[js.Any])
      
      inline def setInsertExtraNodeUndefined: Self = StObject.set(x, "insertExtraNode", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[WaveProps & RefAttributes[InternalWave]]
  
  /* This means you don't have to write `default`, but can instead just say `libUtilWaveMod.foo` */
  override def _to: ForwardRefExoticComponent[WaveProps & RefAttributes[InternalWave]] = default
}
