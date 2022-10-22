package typingsJapgolly.rcUtil

import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcUtil.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetScrollBarSizeMod {
  
  @JSImport("rc-util/lib/getScrollBarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  inline def default(fresh: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fresh.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTargetScrollBarSize(target: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetScrollBarSize")(target.asInstanceOf[js.Any]).asInstanceOf[Height]
}
