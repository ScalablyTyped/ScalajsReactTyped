package typingsJapgolly.reactBreadcrumbsDynamic

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  open class Breadcrumbs protected ()
    extends Component[BreadcrumbsProps, js.Object, Any] {
    def this(props: BreadcrumbsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProps, context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsItem")
  @js.native
  open class BreadcrumbsItem protected ()
    extends Component[BreadcrumbsItemProps, js.Object, Any] {
    def this(props: BreadcrumbsItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsItemProps, context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  open class BreadcrumbsProvider protected ()
    extends Component[BreadcrumbsProviderProps, js.Object, Any] {
    def this(props: BreadcrumbsProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProviderProps, context: Any) = this()
  }
  
  trait BreadcrumbsItemProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var to: String
  }
  object BreadcrumbsItemProps {
    
    inline def apply(to: String): BreadcrumbsItemProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsItemProps]
    }
    
    extension [Self <: BreadcrumbsItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var container: js.UndefOr[String | org.scalajs.dom.Element | js.Object] = js.undefined
    
    var containerProps: js.UndefOr[js.Object] = js.undefined
    
    var duplicateProps: js.UndefOr[js.Object] = js.undefined
    
    var finalItem: js.UndefOr[String | org.scalajs.dom.Element | js.Object] = js.undefined
    
    var finalProps: js.UndefOr[js.Object] = js.undefined
    
    var item: js.UndefOr[String | org.scalajs.dom.Element | js.Object] = js.undefined
    
    var renameProps: js.UndefOr[js.Object] = js.undefined
    
    var separator: js.UndefOr[String | org.scalajs.dom.Element | js.Object] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def setContainer(value: String | org.scalajs.dom.Element | js.Object): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerProps(value: js.Object): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDuplicateProps(value: js.Object): Self = StObject.set(x, "duplicateProps", value.asInstanceOf[js.Any])
      
      inline def setDuplicatePropsUndefined: Self = StObject.set(x, "duplicateProps", js.undefined)
      
      inline def setFinalItem(value: String | org.scalajs.dom.Element | js.Object): Self = StObject.set(x, "finalItem", value.asInstanceOf[js.Any])
      
      inline def setFinalItemUndefined: Self = StObject.set(x, "finalItem", js.undefined)
      
      inline def setFinalProps(value: js.Object): Self = StObject.set(x, "finalProps", value.asInstanceOf[js.Any])
      
      inline def setFinalPropsUndefined: Self = StObject.set(x, "finalProps", js.undefined)
      
      inline def setItem(value: String | org.scalajs.dom.Element | js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setRenameProps(value: js.Object): Self = StObject.set(x, "renameProps", value.asInstanceOf[js.Any])
      
      inline def setRenamePropsUndefined: Self = StObject.set(x, "renameProps", js.undefined)
      
      inline def setSeparator(value: String | org.scalajs.dom.Element | js.Object): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait BreadcrumbsProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var shouldBreadcrumbsUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object BreadcrumbsProviderProps {
    
    inline def apply(): BreadcrumbsProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProviderProps]
    }
    
    extension [Self <: BreadcrumbsProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShouldBreadcrumbsUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.Any.fromFunction1(value))
      
      inline def setShouldBreadcrumbsUpdateUndefined: Self = StObject.set(x, "shouldBreadcrumbsUpdate", js.undefined)
    }
  }
}
