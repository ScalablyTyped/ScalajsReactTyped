package typingsJapgolly.novncCore

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.Touch
import org.scalajs.dom.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilEventsMod {
  
  @JSImport("novnc-core/lib/util/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPointerEvent(event: Event): TouchList | js.Array[Touch] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerEvent")(event.asInstanceOf[js.Any]).asInstanceOf[TouchList | js.Array[Touch]]
  
  inline def releaseCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")().asInstanceOf[Unit]
  
  inline def setCapture(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCapture")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopEvent(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
