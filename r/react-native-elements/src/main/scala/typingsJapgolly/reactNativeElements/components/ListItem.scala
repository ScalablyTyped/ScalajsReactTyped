package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distListListItemBaseMod.ListItemProps
import typingsJapgolly.reactNativeElements.distListListItemSwipeableMod.ListItemSwipeableProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItem {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[ListItemProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): SharedBuilder_ListItemPropsPartial528462880 = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new SharedBuilder_ListItemPropsPartial528462880(js.Array(this.component, __props.asInstanceOf[ListItemProps & Partial[ThemeProps[ListItemProps]]]))
  }
  
  object Swipeable {
    
    inline def apply(
      replaceTheme: RecursivePartialFullThemeAvatar => Callback,
      theme: Theme[ListItemSwipeableProps],
      updateTheme: RecursivePartialFullThemeAvatar => Callback
    ): SharedBuilder_ListItemSwipeablePropsPartial_1320616765 = {
      val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
      new SharedBuilder_ListItemSwipeablePropsPartial_1320616765(js.Array(this.component, __props.asInstanceOf[ListItemSwipeableProps & Partial[ThemeProps[ListItemSwipeableProps]]]))
    }
    
    @JSImport("react-native-elements/dist/list/ListItem", "ListItem.Swipeable")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: ListItemSwipeableProps & Partial[ThemeProps[ListItemSwipeableProps]]): SharedBuilder_ListItemSwipeablePropsPartial_1320616765 = new SharedBuilder_ListItemSwipeablePropsPartial_1320616765(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-elements/dist/list/ListItem", "ListItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ListItemProps & Partial[ThemeProps[ListItemProps]]): SharedBuilder_ListItemPropsPartial528462880 = new SharedBuilder_ListItemPropsPartial528462880(js.Array(this.component, p.asInstanceOf[js.Any]))
}
