package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.anon.DataHookPropName
import typingsJapgolly.wixUiTestUtils.anon.DataHookString
import typingsJapgolly.wixUiTestUtils.anon.Wrapper
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcVanillaVanillaMod {
  
  @JSImport("wix-ui-test-utils/dist/src/vanilla/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTestkitExists[T /* <: BaseDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTestkitExists[T /* <: BaseDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T], options: DataHookPropName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T], options: DataHookPropName): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  inline def uniTestkitFactoryCreator[T /* <: BaseUniDriver */](driverFactory: TestkitOutputUni[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  trait TestkitArgs extends StObject {
    
    var dataHook: String
    
    var wrapper: org.scalajs.dom.Element
  }
  object TestkitArgs {
    
    inline def apply(dataHook: String, wrapper: org.scalajs.dom.Element): TestkitArgs = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestkitArgs]
    }
    
    extension [Self <: TestkitArgs](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: org.scalajs.dom.Element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
  
  type TestkitOutputRegular[T /* <: BaseDriver */] = js.Function1[/* data */ typingsJapgolly.wixUiTestUtils.anon.Element, T]
  
  type TestkitOutputUni[T /* <: BaseUniDriver */] = js.Function3[/* base */ UniDriver[Any], /* body */ UniDriver[Any], /* options */ DataHookString, T]
}
