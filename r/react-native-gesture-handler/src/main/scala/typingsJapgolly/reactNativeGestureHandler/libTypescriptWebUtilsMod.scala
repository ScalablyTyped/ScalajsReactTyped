package typingsJapgolly.reactNativeGestureHandler

import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactNativeGestureHandler.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebUtilsMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPointerInBounds(view: HTMLElement, hasXY: X): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPointerInBounds")(view.asInstanceOf[js.Any], hasXY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
