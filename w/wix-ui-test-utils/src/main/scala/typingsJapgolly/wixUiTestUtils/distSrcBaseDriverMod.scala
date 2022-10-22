package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseDriverMod {
  
  @JSImport("wix-ui-test-utils/dist/src/base-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseUniDriverFactory(base: UniDriver[Any]): BaseUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("baseUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[BaseUniDriver]
  
  trait BaseUniDriver extends StObject {
    
    /** click on the element */
    def click(): js.Promise[Unit]
    
    /** returns the component element */
    def element(): js.Promise[Any]
    
    /** returns true if component exists */
    def exists(): js.Promise[Boolean]
  }
  object BaseUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]]
    ): BaseUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn)
      __obj.asInstanceOf[BaseUniDriver]
    }
    
    extension [Self <: BaseUniDriver](x: Self) {
      
      inline def setClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setElement(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    }
  }
}
