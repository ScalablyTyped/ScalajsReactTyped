package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonUtilsReactUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/reactUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureElement(): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")().asInstanceOf[js.UndefOr[Element]]
  inline def ensureElement(child: Node): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  inline def ensureElement(
    child: Node,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
  ): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  inline def ensureElement(
    child: Unit,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.a, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.abbr, typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.address */ Any
  ): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureElement")(child.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  
  inline def getDisplayName(ComponentClass: INamed): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getDisplayName(ComponentClass: ComponentType[js.Object]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayName")(ComponentClass.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isElementOfType[P](element: Any, ComponentType: ComponentType[P]): /* is react.react.ReactElement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementOfType")(element.asInstanceOf[js.Any], ComponentType.asInstanceOf[js.Any])).asInstanceOf[/* is react.react.ReactElement */ Boolean]
  
  inline def isReactNodeEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")().asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: Node, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isReactNodeEmpty(node: Unit, skipArray: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isReactNodeEmpty")(node.asInstanceOf[js.Any], skipArray.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Represents anything that has a `name` property such as Functions.
    */
  trait INamed extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object INamed {
    
    inline def apply(): INamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[INamed]
    }
    
    extension [Self <: INamed](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
