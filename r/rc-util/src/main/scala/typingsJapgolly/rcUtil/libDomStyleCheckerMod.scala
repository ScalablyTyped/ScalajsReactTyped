package typingsJapgolly.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomStyleCheckerMod {
  
  @JSImport("rc-util/lib/Dom/styleChecker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isStyleSupport(styleName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isStyleSupport(styleName: String, styleValue: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any], styleValue.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isStyleSupport(styleName: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleSupport")(styleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
