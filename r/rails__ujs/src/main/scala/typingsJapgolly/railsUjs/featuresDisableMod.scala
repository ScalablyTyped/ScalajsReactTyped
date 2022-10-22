package typingsJapgolly.railsUjs

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresDisableMod {
  
  @JSImport("@rails/ujs/features/disable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableElement(e: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleDisabledElement(e: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleDisabledElement")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
