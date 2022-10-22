package typingsJapgolly.loadicons

import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Load SVG icon sprites safely and asynchronously
    */
  inline def apply(svgURL: String, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(svgURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("loadicons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* svg */ SVGElement, Unit]
}
