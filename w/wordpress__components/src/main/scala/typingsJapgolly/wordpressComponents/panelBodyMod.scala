package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.iconMod.Icon.IconType
import typingsJapgolly.wordpressComponents.panelBodyMod.PanelBody.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelBodyMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/panel/body", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PanelBody {
    
    trait Props extends StObject {
      
      var children: Node
      
      /**
        * The class that will be added with `components-panel__body`, if the
        * panel is currently open, the `is-opened` class will also be passed
        * to the classes of the wrapper div. If no `className` is passed then
        * only `components-panel__body` and `is-opened` is used.
        */
      var className: js.UndefOr[Any] = js.undefined
      
      /**
        * An icon to be shown next to the `PanelBody` title.
        */
      var icon: js.UndefOr[IconType[js.Object]] = js.undefined
      
      /**
        * Whether or not the panel will start open.
        * @defaultValue true
        */
      var initialOpen: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A function that is called when the user clicks on the `PanelBody`
        * title after the open state is changed.
        */
      var onToggle: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * If opened is true then the `Panel` will remain open regardless of
        * the `initialOpen` prop and the panel will be prevented from being
        * closed.
        */
      var opened: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Title of the `PanelBody`. This shows even when it is closed.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setIcon(value: IconType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
        
        inline def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
        
        inline def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
        
        inline def setOnToggle(value: Callback): Self = StObject.set(x, "onToggle", value.toJsFn)
        
        inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
        
        inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
        
        inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
