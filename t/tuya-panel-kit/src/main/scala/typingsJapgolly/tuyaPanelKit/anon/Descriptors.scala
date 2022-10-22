package typingsJapgolly.tuyaPanelKit.anon

import typingsJapgolly.std.Record
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.Descriptor
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventConsumer
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventEmitter
import typingsJapgolly.tuyaPanelKit.`@reactNavigationCoreTypesMod`.PrivateValueStore
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptors[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */] extends StObject {
  
  var descriptors: Record[
    String, 
    Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
  ]
  
  var navigation: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, Any]) & ActionHelpers
  
  var state: State
}
object Descriptors {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](
    descriptors: Record[
      String, 
      Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
    ],
    navigation: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, Any]) & ActionHelpers,
    state: State
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  }
  
  extension [Self <: Descriptors[?, ?, ?, ?], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */](x: Self & (Descriptors[State, EventMap, ActionHelpers, ScreenOptions])) {
    
    inline def setDescriptors(
      value: Record[
          String, 
          Descriptor[Record[String, js.UndefOr[js.Object]], String, State, ScreenOptions, js.Object]
        ]
    ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setNavigation(
      value: CanGoBack & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, js.Object]) & EventEmitter[EventMap] & EventConsumer[Any] & (PrivateValueStore[Record[String, js.UndefOr[js.Object]], String, Any]) & ActionHelpers
    ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
