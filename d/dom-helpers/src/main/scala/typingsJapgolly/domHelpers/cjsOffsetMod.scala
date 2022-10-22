package typingsJapgolly.domHelpers

import org.scalajs.dom.HTMLElement
import typingsJapgolly.domHelpers.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsOffsetMod {
  
  @JSImport("dom-helpers/cjs/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
}
