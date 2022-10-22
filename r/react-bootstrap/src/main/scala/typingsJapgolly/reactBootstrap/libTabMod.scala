package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.mod.TransitionCallbacks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabMod {
  
  @JSImport("react-bootstrap/lib/Tab", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[TabProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Container")
  @js.native
  open class Container ()
    extends typingsJapgolly.reactBootstrap.libTabContainerMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Container")
  @js.native
  def Container: Instantiable0[typingsJapgolly.reactBootstrap.libTabContainerMod.^] = js.native
  inline def Container_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libTabContainerMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Content")
  @js.native
  open class Content ()
    extends typingsJapgolly.reactBootstrap.libTabContentMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Content")
  @js.native
  def Content: Instantiable0[typingsJapgolly.reactBootstrap.libTabContentMod.^] = js.native
  inline def Content_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libTabContentMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Tab", "Pane")
  @js.native
  open class Pane ()
    extends typingsJapgolly.reactBootstrap.libTabPaneMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Tab", "Pane")
  @js.native
  def Pane: Instantiable0[typingsJapgolly.reactBootstrap.libTabPaneMod.^] = js.native
  inline def Pane_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libTabPaneMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pane")(x.asInstanceOf[js.Any])
  
  type Tab = japgolly.scalajs.react.facade.React.Component[TabProps & js.Object, js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab> ]: P} & {[ P in 'title' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>] ]: react.react.HTMLProps<react-bootstrap.react-bootstrap/lib/Tab.Tab>[P]} */ trait TabProps
    extends StObject
       with TransitionCallbacks {
    
    var animation: js.UndefOr[Boolean] = js.undefined
    
    var `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var eventKey: js.UndefOr[Any] = js.undefined
    
    var tabClassName: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    // TODO: Add more specific type
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setEventKey(value: Any): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setTabClassName(value: String): Self = StObject.set(x, "tabClassName", value.asInstanceOf[js.Any])
      
      inline def setTabClassNameUndefined: Self = StObject.set(x, "tabClassName", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
