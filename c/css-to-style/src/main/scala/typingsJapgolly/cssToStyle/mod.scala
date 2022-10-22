package typingsJapgolly.cssToStyle

import org.scalajs.dom.CSSStyleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-to-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(cssText: String): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cssText.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
}
