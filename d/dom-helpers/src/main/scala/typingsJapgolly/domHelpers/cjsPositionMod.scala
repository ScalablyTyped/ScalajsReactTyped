package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import typingsJapgolly.domHelpers.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsPositionMod {
  
  @JSImport("dom-helpers/cjs/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def default(node: HTMLElement, offsetParent: HTMLElement): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Height]
}
