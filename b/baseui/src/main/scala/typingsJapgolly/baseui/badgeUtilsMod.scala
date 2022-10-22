package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeUtilsMod {
  
  @JSImport("baseui/badge/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnchorFromChildren(): ReactChild | ReactFragment | ReactPortal = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorFromChildren")().asInstanceOf[ReactChild | ReactFragment | ReactPortal]
  inline def getAnchorFromChildren(children: Node): ReactChild | ReactFragment | ReactPortal = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnchorFromChildren")(children.asInstanceOf[js.Any]).asInstanceOf[ReactChild | ReactFragment | ReactPortal]
}
