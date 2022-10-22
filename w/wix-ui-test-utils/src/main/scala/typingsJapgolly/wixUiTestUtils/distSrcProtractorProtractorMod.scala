package typingsJapgolly.wixUiTestUtils

import typingsJapgolly.protractor.mod.ElementFinder
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.anon.DataHookString
import typingsJapgolly.wixUiTestUtils.anon.DataHookWrapper
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtractorProtractorMod {
  
  @JSImport("wix-ui-test-utils/dist/src/protractor/protractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def protractorTestkitFactoryCreator[T](
    driverFactory: js.Function3[/* wrapper */ ElementFinder, /* body */ ElementFinder, /* options */ DataHookString, T]
  ): js.Function1[/* obj */ DataHookWrapper, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookWrapper, T]]
  
  inline def protractorUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[/* base */ UniDriver[Any], /* body */ UniDriver[Any], /* options */ DataHookString, T]
  ): js.Function1[/* obj */ DataHookString, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("protractorUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ DataHookString, T]]
}
