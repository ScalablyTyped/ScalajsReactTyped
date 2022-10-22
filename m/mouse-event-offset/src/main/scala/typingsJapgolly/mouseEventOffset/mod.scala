package typingsJapgolly.mouseEventOffset

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(e: ReactMouseEventFrom[Element]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: ReactMouseEventFrom[Element], element: HTMLElement): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: ReactTouchEventFrom[Element]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: ReactTouchEventFrom[Element], element: HTMLElement): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @JSImport("mouse-event-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
