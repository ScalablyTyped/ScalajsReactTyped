package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.wixUiTestUtils.anon.TypeofSimulate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDriverFactoryCreateDriverFactoryMod {
  
  @JSImport("wix-ui-test-utils/dist/src/driver-factory/createDriverFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDriverFactory[TDriver /* <: BaseDriver */](driverFactory: DriverFactory[TDriver]): js.Function1[/* Component */ Element, TDriver] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriverFactory")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ Element, TDriver]]
  
  trait BaseDriver extends StObject {
    
    def exists(): Boolean
  }
  object BaseDriver {
    
    inline def apply(exists: CallbackTo[Boolean]): BaseDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn)
      __obj.asInstanceOf[BaseDriver]
    }
    
    extension [Self <: BaseDriver](x: Self) {
      
      inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    }
  }
  
  trait ComponentFactory extends StObject {
    
    var component: js.UndefOr[Element] = js.undefined
    
    var element: js.UndefOr[org.scalajs.dom.Element] = js.undefined
    
    var eventTrigger: TypeofSimulate
    
    var wrapper: Any
  }
  object ComponentFactory {
    
    inline def apply(eventTrigger: TypeofSimulate, wrapper: Any): ComponentFactory = {
      val __obj = js.Dynamic.literal(eventTrigger = eventTrigger.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentFactory]
    }
    
    extension [Self <: ComponentFactory](x: Self) {
      
      inline def setComponent(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEventTrigger(value: TypeofSimulate): Self = StObject.set(x, "eventTrigger", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: Any): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type DriverFactory[TDriver /* <: BaseDriver */] = js.Function1[/* compFactory */ ComponentFactory, TDriver]
}
