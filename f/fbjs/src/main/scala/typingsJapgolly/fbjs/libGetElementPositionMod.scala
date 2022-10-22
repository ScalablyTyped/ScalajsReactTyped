package typingsJapgolly.fbjs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.fbjs.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetElementPositionMod {
  
  inline def apply(element: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].apply(element.asInstanceOf[js.Any]).asInstanceOf[Height]
  
  @JSImport("fbjs/lib/getElementPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
