package typingsJapgolly.wixUiCore

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsPopoverUtilsGetAppendToElementMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/popover/utils/getAppendToElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAppendToElement(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")().asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Unit, node: Element): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Elm): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Elm, node: Element): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Predicate): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Predicate, node: Element): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Preset): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getAppendToElement(appendTo: Preset, node: Element): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppendToElement")(appendTo.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Elm = HTMLDivElement | Element
  
  type Predicate = js.Function1[/* s */ Element, Boolean]
  
  type Preset = String
}
