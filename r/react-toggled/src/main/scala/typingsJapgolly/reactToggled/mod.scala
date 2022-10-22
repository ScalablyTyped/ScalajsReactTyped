package typingsJapgolly.reactToggled

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[ReactToggledProps, js.Object, Any] {
    def this(props: ReactToggledProps) = this()
    def this(props: ReactToggledProps, context: Any) = this()
  }
  @JSImport("react-toggled", JSImport.Default)
  @js.native
  val default: ComponentClassP[ReactToggledProps & js.Object] = js.native
  
  type ChildrenFunction = js.Function1[/* options */ TogglerStateAndHelpers, Node]
  
  type GetButtonPropsOptions = HTMLProps[HTMLButtonElement]
  
  type GetElementPropsOptions = HTMLProps[HTMLElement]
  
  type GetInputPropsOptions = HTMLProps[HTMLInputElement]
  
  type ReactToggledInterface = ComponentClassP[ReactToggledProps & js.Object]
  
  trait ReactToggledProps extends StObject {
    
    val children: ChildrenFunction
    
    val defaultOn: js.UndefOr[Boolean] = js.undefined
    
    val on: js.UndefOr[Boolean] = js.undefined
    
    val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.undefined
  }
  object ReactToggledProps {
    
    inline def apply(children: /* options */ TogglerStateAndHelpers => Node): ReactToggledProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[ReactToggledProps]
    }
    
    extension [Self <: ReactToggledProps](x: Self) {
      
      inline def setChildren(value: /* options */ TogglerStateAndHelpers => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDefaultOn(value: Boolean): Self = StObject.set(x, "defaultOn", value.asInstanceOf[js.Any])
      
      inline def setDefaultOnUndefined: Self = StObject.set(x, "defaultOn", js.undefined)
      
      inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction2((t0: /* on */ Boolean, t1: /* object */ TogglerStateAndHelpers) => (value(t0, t1)).runNow()))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    }
  }
  
  @js.native
  trait TogglerStateAndHelpers extends StObject {
    
    def getElementTogglerProps(): Any = js.native
    def getElementTogglerProps(options: GetElementPropsOptions): Any = js.native
    
    def getInputTogglerProps(): Any = js.native
    def getInputTogglerProps(options: GetButtonPropsOptions): Any = js.native
    
    def getTogglerProps(): Any = js.native
    def getTogglerProps(options: GetButtonPropsOptions): Any = js.native
    
    val on: Boolean = js.native
    
    def setOff(): Unit = js.native
    
    def setOn(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  type _To = ComponentClassP[ReactToggledProps & js.Object]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClassP[ReactToggledProps & js.Object] = default
}
