package typingsJapgolly.reactMdUtils

import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.height
import typingsJapgolly.reactMdUtils.reactMdUtilsStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPositioningGetViewportSizeMod {
  
  @JSImport("@react-md/utils/types/positioning/getViewportSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getViewportSize(direction: height | width): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSize")(direction.asInstanceOf[js.Any]).asInstanceOf[Double]
}
