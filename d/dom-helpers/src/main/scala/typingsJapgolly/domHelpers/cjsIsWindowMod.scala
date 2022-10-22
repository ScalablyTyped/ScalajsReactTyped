package typingsJapgolly.domHelpers

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Window
import typingsJapgolly.domHelpers.domHelpersBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsIsWindowMod {
  
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Document): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
  inline def default(node: Element): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
  inline def default(node: Window): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
}
