package typingsJapgolly.tuyaPanelKit

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.DefaultNavigatorOptions
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.TypedNavigator
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackNavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationConfig
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationEventMap
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationStackNavigatorsCreateStackNavigatorMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/stack/navigators/createStackNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // tslint:disable-next-line max-line-length prefer-declare-function no-unnecessary-generics
  inline def default[ParamList /* <: Record[String, js.UndefOr[js.Object]] */](): TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[TypedNavigator[
    ParamList, 
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    StackNavigationOptions, 
    StackNavigationEventMap, 
    js.Function1[/* hasInitialRouteNameChildrenScreenOptionsRest */ Props, Element]
  ]]
  
  // tslint:disable-next-line strict-export-declare-modifiers
  trait Props
    extends StObject
       with DefaultNavigatorOptions[StackNavigationOptions, ParamListBase]
       with StackNavigationConfig
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props]
    }
  }
}
