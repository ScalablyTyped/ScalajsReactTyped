package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNavigationCore.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseComponentMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(render: Render): js.Function1[/* hasChildren */ Children, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(render.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasChildren */ Children, Element]]
  
  type Render = js.Function1[/* children */ Node, Element]
}
