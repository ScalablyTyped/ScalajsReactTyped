package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonTestUtilitiesMod {
  
  @JSImport("office-ui-fabric-react/lib/common/testUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delay(millisecond: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(millisecond.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def expectMissing(wrapper: ReactWrapper[Any, Any, Component[js.Object, js.Object]], className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectMissing")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectNodes(wrapper: ReactWrapper[Any, Any, Component[js.Object, js.Object]], className: String, n: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectNodes")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def expectOne(wrapper: ReactWrapper[Any, Any, Component[js.Object, js.Object]], className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("expectOne")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findNodes(wrapper: ReactWrapper[Any, Any, Component[js.Object, js.Object]], className: String): ReactWrapper[Any, Any, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findNodes")(wrapper.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[Any, Any, Component[js.Object, js.Object]]]
  
  inline def flushPromises(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushPromises")().asInstanceOf[js.Promise[Unit]]
  
  inline def mockEvent(): SyntheticEventData = ^.asInstanceOf[js.Dynamic].applyDynamic("mockEvent")().asInstanceOf[SyntheticEventData]
  inline def mockEvent(targetValue: String): SyntheticEventData = ^.asInstanceOf[js.Dynamic].applyDynamic("mockEvent")(targetValue.asInstanceOf[js.Any]).asInstanceOf[SyntheticEventData]
  
  inline def mountAttached[C /* <: Component[js.Object, js.Object] */, P, S](element: Element): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountAttached")(element.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  
  inline def renderIntoDocument(element: Element): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("renderIntoDocument")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
