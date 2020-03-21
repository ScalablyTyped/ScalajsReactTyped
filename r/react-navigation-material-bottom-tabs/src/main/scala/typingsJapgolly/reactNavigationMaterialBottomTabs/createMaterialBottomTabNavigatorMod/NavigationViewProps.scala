package typingsJapgolly.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationMaterialBottomTabOptions
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationTabProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.typesMod.NavigationTabState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationViewProps extends js.Object {
  var descriptors: StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationMaterialBottomTabOptions, 
      NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ]
  var navigation: NavigationProp[NavigationTabState]
  var navigationConfig: js.Any
  var screenProps: js.UndefOr[js.Any] = js.undefined
  def getAccessibilityLabel(props: AnonRoute): js.UndefOr[String]
  def getLabelText(props: AnonRoute): js.UndefOr[String]
  def getTestID(props: AnonRoute): js.UndefOr[String]
  def onIndexChange(index: Double): Unit
  def onTabPress(props: AnonRoute): Unit
  def renderIcon(props: RenderIconProps): Node
  def renderScene(props: AnonRoute): Node
}

object NavigationViewProps {
  @scala.inline
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        NavigationParams, 
        NavigationMaterialBottomTabOptions, 
        NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    getAccessibilityLabel: AnonRoute => CallbackTo[js.UndefOr[String]],
    getLabelText: AnonRoute => CallbackTo[js.UndefOr[String]],
    getTestID: AnonRoute => CallbackTo[js.UndefOr[String]],
    navigation: NavigationProp[NavigationTabState],
    navigationConfig: js.Any,
    onIndexChange: Double => Callback,
    onTabPress: AnonRoute => Callback,
    renderIcon: RenderIconProps => CallbackTo[Node],
    renderScene: AnonRoute => CallbackTo[Node],
    screenProps: js.Any = null
  ): NavigationViewProps = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
    __obj.updateDynamic("getAccessibilityLabel")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute) => getAccessibilityLabel(t0).runNow()))
    __obj.updateDynamic("getLabelText")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute) => getLabelText(t0).runNow()))
    __obj.updateDynamic("getTestID")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute) => getTestID(t0).runNow()))
    __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: scala.Double) => onIndexChange(t0).runNow()))
    __obj.updateDynamic("onTabPress")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute) => onTabPress(t0).runNow()))
    __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.createMaterialBottomTabNavigatorMod.RenderIconProps) => renderIcon(t0).runNow()))
    __obj.updateDynamic("renderScene")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonRoute) => renderScene(t0).runNow()))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationViewProps]
  }
}

