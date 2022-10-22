package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.enzyme.mod.MountRendererProps
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.anon.DataHook
import typingsJapgolly.wixUiTestUtils.anon.DataHookString
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.wixUiTestUtilsStrings.`data-hook`
import typingsJapgolly.wixUiTestUtils.wixUiTestUtilsStrings.dataHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEnzymeEnzymeMod {
  
  @JSImport("wix-ui-test-utils/dist/src/enzyme/enzyme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enzymeTestkitFactoryCreator[T /* <: BaseDriver */](driverFactory: EnzymeDriverFactory[T]): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  inline def enzymeUniTestkitFactoryCreator[T /* <: BaseUniDriver */](
    driverFactory: js.Function3[/* base */ UniDriver[Any], /* body */ UniDriver[Any], /* data */ DataHookString, T]
  ): js.Function1[/* obj */ WrapperData, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enzymeUniTestkitFactoryCreator")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ WrapperData, T]]
  
  inline def isEnzymeTestkitExists[T /* <: BaseDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ WrapperData, T], mount: MountFunctionType): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEnzymeTestkitExists[T /* <: BaseDriver */](
    Element: Element,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    options: Options
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](Element: Element, testkitFactory: js.Function1[/* obj */ WrapperData, T], mount: MountFunctionType): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def isUniEnzymeTestkitExists[T /* <: BaseUniDriver */](
    Element: Element,
    testkitFactory: js.Function1[/* obj */ WrapperData, T],
    mount: MountFunctionType,
    hasWithoutDataHookDataHookPropName: Options
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isUniEnzymeTestkitExists")(Element.asInstanceOf[js.Any], testkitFactory.asInstanceOf[js.Any], mount.asInstanceOf[js.Any], hasWithoutDataHookDataHookPropName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  type EnzymeDriverFactory[T /* <: BaseDriver */] = js.Function1[/* data */ DataHook, T]
  
  type MountFunctionType = js.Function2[
    /* node */ Element, 
    /* options */ js.UndefOr[MountRendererProps], 
    ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]
  ]
  
  trait Options extends StObject {
    
    /** The dataHookPropName exists in order to support legacy CamelCase `dataHook`
      *  which is used in Wix-Style-React, while the current prop name used in
      * `wix-ui-core` is snake-case `data-hook`.
      * */
    var dataHookPropName: js.UndefOr[`data-hook` | dataHook] = js.undefined
    
    var withoutDataHook: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDataHookPropName(value: `data-hook` | dataHook): Self = StObject.set(x, "dataHookPropName", value.asInstanceOf[js.Any])
      
      inline def setDataHookPropNameUndefined: Self = StObject.set(x, "dataHookPropName", js.undefined)
      
      inline def setWithoutDataHook(value: Boolean): Self = StObject.set(x, "withoutDataHook", value.asInstanceOf[js.Any])
      
      inline def setWithoutDataHookUndefined: Self = StObject.set(x, "withoutDataHook", js.undefined)
    }
  }
  
  trait WrapperData extends StObject {
    
    var dataHook: String
    
    var wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]
  }
  object WrapperData {
    
    inline def apply(dataHook: String, wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]): WrapperData = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrapperData]
    }
    
    extension [Self <: WrapperData](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
