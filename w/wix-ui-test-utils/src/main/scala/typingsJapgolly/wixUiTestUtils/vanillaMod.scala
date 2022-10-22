package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.unidriverCore.mod.DriverContext
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.unidriverJsdomReact.mod.ElementOrElementFinder
import typingsJapgolly.wixUiTestUtils.anon.DataHookPropName
import typingsJapgolly.wixUiTestUtils.anon.Wrapper
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitArgs
import typingsJapgolly.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitOutputRegular
import typingsJapgolly.wixUiTestUtils.distSrcVanillaVanillaMod.TestkitOutputUni
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaMod {
  
  @JSImport("wix-ui-test-utils/vanilla", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTestkitExists[T /* <: BaseDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTestkitExists[T /* <: BaseDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T], options: DataHookPropName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniTestkitExists[T /* <: BaseUniDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ Wrapper, T], options: DataHookPropName): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[org.scalajs.dom.Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[org.scalajs.dom.Element]]
  inline def jsdomReactUniDriver(containerOrFn: ElementOrElementFinder, context: DriverContext): UniDriver[org.scalajs.dom.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsdomReactUniDriver")(containerOrFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[org.scalajs.dom.Element]]
  
  inline def reactUniDriver(containerOrFn: ElementOrElementFinder): UniDriver[org.scalajs.dom.Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactUniDriver")(containerOrFn.asInstanceOf[js.Any]).asInstanceOf[UniDriver[org.scalajs.dom.Element]]
  inline def reactUniDriver(containerOrFn: ElementOrElementFinder, context: DriverContext): UniDriver[org.scalajs.dom.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("reactUniDriver")(containerOrFn.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[UniDriver[org.scalajs.dom.Element]]
  
  inline def testkitFactoryCreator[T /* <: BaseDriver */](driverFactory: TestkitOutputRegular[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("testkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
  
  inline def uniTestkitFactoryCreator[T /* <: BaseUniDriver */](driverFactory: TestkitOutputUni[T]): js.Function1[/* testkitArgs */ TestkitArgs, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* testkitArgs */ TestkitArgs, T]]
}
