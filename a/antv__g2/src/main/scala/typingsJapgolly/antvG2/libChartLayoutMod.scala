package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libChartViewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartLayoutMod {
  
  @JSImport("@antv/g2/lib/chart/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(view: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Layout = js.Function1[/* view */ View, Unit]
}
