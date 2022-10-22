package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsRenderToContainerMod {
  
  @JSImport("antd-mobile/es/utils/render-to-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToContainer(getContainer: GetContainer, node: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToContainer")(getContainer.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type GetContainer = HTMLElement | js.Function0[HTMLElement] | Null
}
