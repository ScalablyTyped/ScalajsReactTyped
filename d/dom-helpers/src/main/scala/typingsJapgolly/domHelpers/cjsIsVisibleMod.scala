package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsIsVisibleMod {
  
  @JSImport("dom-helpers/cjs/isVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
