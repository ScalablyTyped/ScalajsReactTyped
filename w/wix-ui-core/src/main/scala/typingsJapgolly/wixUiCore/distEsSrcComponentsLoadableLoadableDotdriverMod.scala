package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLoadableLoadableDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/loadable/Loadable.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadableDriverFactory(hasElement: ComponentFactory): LoadableDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("loadableDriverFactory")(hasElement.asInstanceOf[js.Any]).asInstanceOf[LoadableDriver]
  
  trait LoadableDriver
    extends StObject
       with BaseDriver {
    
    def existsChild(selector: String): Boolean
  }
  object LoadableDriver {
    
    inline def apply(exists: CallbackTo[Boolean], existsChild: String => Boolean): LoadableDriver = {
      val __obj = js.Dynamic.literal(exists = exists.toJsFn, existsChild = js.Any.fromFunction1(existsChild))
      __obj.asInstanceOf[LoadableDriver]
    }
    
    extension [Self <: LoadableDriver](x: Self) {
      
      inline def setExistsChild(value: String => Boolean): Self = StObject.set(x, "existsChild", js.Any.fromFunction1(value))
    }
  }
}
