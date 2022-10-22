package typingsJapgolly.rcUtil

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.SVGGraphicsElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomIsVisibleMod {
  
  @JSImport("rc-util/lib/Dom/isVisible", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(element: SVGGraphicsElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
