package typingsJapgolly.popperjsCore

import org.scalajs.dom.Element
import typingsJapgolly.popperjsCore.anon.Height
import typingsJapgolly.popperjsCore.libTypesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetViewportRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getViewportRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, strategy: PositioningStrategy): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[Height]
}
