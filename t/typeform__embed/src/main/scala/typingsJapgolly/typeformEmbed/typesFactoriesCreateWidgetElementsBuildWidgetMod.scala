package typingsJapgolly.typeformEmbed

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateWidgetElementsBuildWidgetMod {
  
  @JSImport("@typeform/embed/types/factories/create-widget/elements/build-widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildWidget(iframe: HTMLIFrameElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWidget")(iframe.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  inline def buildWidget(iframe: HTMLIFrameElement, width: Double): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("buildWidget")(iframe.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def buildWidget(iframe: HTMLIFrameElement, width: Double, height: Double): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("buildWidget")(iframe.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
  inline def buildWidget(iframe: HTMLIFrameElement, width: Unit, height: Double): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("buildWidget")(iframe.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
}
