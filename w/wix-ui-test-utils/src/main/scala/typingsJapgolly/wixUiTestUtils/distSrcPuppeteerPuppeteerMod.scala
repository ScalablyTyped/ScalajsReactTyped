package typingsJapgolly.wixUiTestUtils

import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.anon.DataHookPage
import typingsJapgolly.wixUiTestUtils.anon.Page
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPuppeteerPuppeteerMod {
  
  @JSImport("wix-ui-test-utils/dist/src/puppeteer/puppeteer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def puppeteerTestkitFactoryCreator[T](driverFactory: js.Function3[/* e */ Any, /* page */ Any, /* options */ DriverFactoryOptions, T]): js.Function1[/* obj */ Page, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Page, js.Promise[T]]]
  
  inline def puppeteerUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[
      /* base */ UniDriver[Any], 
      /* body */ UniDriver[Any], 
      /* options */ DriverFactoryOptions, 
      T
    ]
  ): js.Function1[/* obj */ DataHookPage, js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("puppeteerUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookPage, js.Promise[T]]]
  
  trait DriverFactoryOptions extends StObject {
    
    var dataHook: String
  }
  object DriverFactoryOptions {
    
    inline def apply(dataHook: String): DriverFactoryOptions = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[DriverFactoryOptions]
    }
    
    extension [Self <: DriverFactoryOptions](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    }
  }
}
