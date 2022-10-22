package typingsJapgolly.reactMdPortal

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdPortal.typesConditionalPortalMod.ConditionalPortalProps
import typingsJapgolly.reactMdPortal.typesPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ConditionalPortal(hasPortalPortalIntoPortalIntoIdChildren: ConditionalPortalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalPortal")(hasPortalPortalIntoPortalIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Portal(hasIntoIntoIdChildren: PortalProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasIntoIntoIdChildren.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
}
