package typingsJapgolly.ionicCore

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsContentMod {
  
  @JSImport("@ionic/core/dist/types/utils/content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/content", "ION_CONTENT_CLASS_SELECTOR")
  @js.native
  val ION_CONTENT_CLASS_SELECTOR: /* ".ion-content-scroll-host" */ String = js.native
  
  @JSImport("@ionic/core/dist/types/utils/content", "ION_CONTENT_ELEMENT_SELECTOR")
  @js.native
  val ION_CONTENT_ELEMENT_SELECTOR: /* "ion-content" */ String = js.native
  
  inline def disableContentScrollY(contentEl: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("disableContentScrollY")(contentEl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def findClosestIonContent(el: Element): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findClosestIonContent")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def findIonContent(el: Element): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findIonContent")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getScrollElement(el: Element): js.Promise[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollElement")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement]]
  
  inline def isIonContent(el: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIonContent")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def printIonContentErrorMsg(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printIonContentErrorMsg")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetContentScrollY(contentEl: HTMLElement, initialScrollY: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetContentScrollY")(contentEl.asInstanceOf[js.Any], initialScrollY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scrollByPoint(el: HTMLElement, x: Double, y: Double, durationMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollByPoint")(el.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], durationMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def scrollToTop(el: HTMLElement, durationMs: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollToTop")(el.asInstanceOf[js.Any], durationMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
