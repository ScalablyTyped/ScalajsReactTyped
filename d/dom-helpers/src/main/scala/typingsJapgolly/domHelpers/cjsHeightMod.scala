package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsHeightMod {
  
  @JSImport("dom-helpers/cjs/height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(node: HTMLElement, client: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Double]
}
