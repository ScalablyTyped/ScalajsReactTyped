package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcUtilsMod {
  
  @JSImport("wix-ui-core/dist/es/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildChildrenObject[T](children: Node, childrenObject: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("buildChildrenObject")(children.asInstanceOf[js.Any], childrenObject.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createComponentThatRendersItsChildren(displayName: String): FunctionComponent[ElementProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponentThatRendersItsChildren")(displayName.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[ElementProps]]
  
  inline def isReactElement[T](child: Any, Element: ComponentType[T]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactElement")(child.asInstanceOf[js.Any], Element.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def isStatelessComponent(Component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatelessComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]
  
  trait ElementProps extends StObject {
    
    var children: Any
  }
  object ElementProps {
    
    inline def apply(children: Any): ElementProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementProps]
    }
    
    extension [Self <: ElementProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
