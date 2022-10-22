package typingsJapgolly.popperjsCore

import org.scalajs.dom.Element
import typingsJapgolly.popperjsCore.libEnumsMod.Boundary
import typingsJapgolly.popperjsCore.libEnumsMod.RootBoundary
import typingsJapgolly.popperjsCore.libTypesMod.ClientRectObject
import typingsJapgolly.popperjsCore.libTypesMod.PositioningStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetClippingRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getClippingRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, boundary: Boundary, rootBoundary: RootBoundary, strategy: PositioningStrategy): ClientRectObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any], rootBoundary.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any])).asInstanceOf[ClientRectObject]
}
