package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.libTypesCommonMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDomMod {
  
  @JSImport("@antv/g2plot/lib/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContainerSize(ele: HTMLElement): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("getContainerSize")(ele.asInstanceOf[js.Any]).asInstanceOf[Size]
}
