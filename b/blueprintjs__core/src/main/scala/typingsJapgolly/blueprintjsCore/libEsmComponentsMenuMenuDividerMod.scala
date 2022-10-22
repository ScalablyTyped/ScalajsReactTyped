package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsMenuMenuDividerMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider")
  @js.native
  open class MenuDivider protected ()
    extends Component[MenuDividerProps, js.Object, Any] {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  /* static members */
  object MenuDivider {
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuDivider", "MenuDivider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IMenuDividerProps
    extends StObject
       with IProps {
    
    /** This component does not support children. */
    var children: js.UndefOr[scala.Nothing] = js.undefined
    
    /** Optional header title. */
    var title: js.UndefOr[Node] = js.undefined
  }
  object IMenuDividerProps {
    
    inline def apply(): IMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMenuDividerProps]
    }
    
    extension [Self <: IMenuDividerProps](x: Self) {
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type MenuDividerProps = IMenuDividerProps
}
