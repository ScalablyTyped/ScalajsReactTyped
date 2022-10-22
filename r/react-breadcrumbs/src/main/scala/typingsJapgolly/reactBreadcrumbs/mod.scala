package typingsJapgolly.reactBreadcrumbs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactBreadcrumbs.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  open class Breadcrumb protected ()
    extends Component[PropsWithChildren[BreadcrumbProps], js.Object, Any] {
    def this(props: PropsWithChildren[BreadcrumbProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[BreadcrumbProps], context: Any) = this()
  }
  
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  open class Breadcrumbs protected ()
    extends Component[PropsWithChildren[BreadcrumbsProps], js.Object, Any] {
    def this(props: PropsWithChildren[BreadcrumbsProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PropsWithChildren[BreadcrumbsProps], context: Any) = this()
  }
  
  trait BreadcrumbProps extends StObject {
    
    var data: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
    
    var hidden: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(
      data: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
    ): BreadcrumbProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    extension [Self <: BreadcrumbProps](x: Self) {
      
      inline def setData(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[Node] = js.undefined
    
    var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, Node]] = js.undefined
    
    var wrapper: js.UndefOr[FunctionComponent[js.Object] | ComponentClassP[js.Object]] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setSeparator(value: VdomNode): Self = StObject.set(x, "separator", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSeparatorNull: Self = StObject.set(x, "separator", null)
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSeparatorVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "separator", js.Array(value*))
      
      inline def setSeparatorVdomElement(value: VdomElement): Self = StObject.set(x, "separator", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSetCrumbs(value: /* crumbs */ Crumbs => Node): Self = StObject.set(x, "setCrumbs", js.Any.fromFunction1(value))
      
      inline def setSetCrumbsUndefined: Self = StObject.set(x, "setCrumbs", js.undefined)
      
      inline def setWrapper(value: FunctionComponent[js.Object] | ComponentClassP[js.Object]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  trait Crumbs extends StObject
}
