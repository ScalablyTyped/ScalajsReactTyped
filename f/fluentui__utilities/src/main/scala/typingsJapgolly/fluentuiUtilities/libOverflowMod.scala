package typingsJapgolly.fluentuiUtilities

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOverflowMod {
  
  @JSImport("@fluentui/utilities/lib/overflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasHorizontalOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasHorizontalOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasVerticalOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasVerticalOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
