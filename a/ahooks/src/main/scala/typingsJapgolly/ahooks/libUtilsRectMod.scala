package typingsJapgolly.ahooks

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsRectMod {
  
  @JSImport("ahooks/lib/utils/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClientHeight(el: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getClientHeight(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScrollHeight(el: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollHeight(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScrollTop(el: Document): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollTop(el: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollTop")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
}
