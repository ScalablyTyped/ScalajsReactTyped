package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IActionProps
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.ILinkProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsBreadcrumbsBreadcrumbMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/breadcrumbs/breadcrumb", "Breadcrumb")
  @js.native
  val Breadcrumb: FC[BreadcrumbProps] = js.native
  
  type BreadcrumbProps = IBreadcrumbProps
  
  trait IBreadcrumbProps
    extends StObject
       with IActionProps
       with ILinkProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /** Whether this breadcrumb is the current breadcrumb. */
    var current: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass through value to icon's title attribute. Should be used for breadcrumbs without
      * text or children defined.
      */
    var iconTitle: js.UndefOr[String] = js.undefined
  }
  object IBreadcrumbProps {
    
    inline def apply(): IBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBreadcrumbProps]
    }
    
    extension [Self <: IBreadcrumbProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setIconTitle(value: String): Self = StObject.set(x, "iconTitle", value.asInstanceOf[js.Any])
      
      inline def setIconTitleUndefined: Self = StObject.set(x, "iconTitle", js.undefined)
    }
  }
}
