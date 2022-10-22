package typingsJapgolly.ionicCore

import org.scalajs.dom.Element
import typingsJapgolly.ionicCore.anon.ClassName
import typingsJapgolly.ionicCore.anon.X
import typingsJapgolly.puppeteer.mod.ElementHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestUtilsMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkComponentModeClasses(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EElement */ Any,
    globalMode: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponentModeClasses")(el.asInstanceOf[js.Any], globalMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def checkComponentModeClasses(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EElement */ Any,
    globalMode: String,
    selector: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkComponentModeClasses")(el.asInstanceOf[js.Any], globalMode.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def checkModeClasses(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EElement */ Any,
    globalMode: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkModeClasses")(el.asInstanceOf[js.Any], globalMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def dragElementBy(element: ElementHandle[Element], page: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Double, y: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Double, y: Double, startCoordinates: X): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startCoordinates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Double, y: Unit, startCoordinates: X): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startCoordinates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Unit, y: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Unit, y: Double, startCoordinates: X): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startCoordinates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(element: ElementHandle[Element], page: Any, x: Unit, y: Unit, startCoordinates: X): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(element.asInstanceOf[js.Any], page.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], startCoordinates.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def generateE2EUrl(component: String, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateE2EUrl")(component.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateE2EUrl(component: String, `type`: String, rtl: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateE2EUrl")(component.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], rtl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getActiveElement(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any
  ): js.Promise[ClassName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClassName]]
  
  inline def getActiveElementParent(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any
  ): js.Promise[ClassName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElementParent")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClassName]]
  
  inline def getElementProperty(element: Any, property: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementProperty")(element.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def listenForEvent(page: Any, eventType: String, element: Any, callbackName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenForEvent")(page.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], element.asInstanceOf[js.Any], callbackName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def queryDeep(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    selectors: String*
  ): js.Promise[ElementHandle[Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryDeep")(scala.List(page.asInstanceOf[js.Any]).`++`(selectors.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Promise[ElementHandle[Element]]]
  
  inline def scrollTo(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    selector: String,
    x: Double,
    y: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(page.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def scrollToBottom(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    selector: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollToBottom")(page.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitForFunctionTestContext(fn: Any, params: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForFunctionTestContext")(fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def waitForFunctionTestContext(fn: Any, params: Any, interval: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForFunctionTestContext")(fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
