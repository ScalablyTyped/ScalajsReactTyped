package typingsJapgolly.rcComponentPortal

import typingsJapgolly.rcComponentPortal.esPortalMod.PortalProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PortalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def inlineMock(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")().asInstanceOf[Boolean]
  inline def inlineMock(nextInline: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineMock")(nextInline.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
