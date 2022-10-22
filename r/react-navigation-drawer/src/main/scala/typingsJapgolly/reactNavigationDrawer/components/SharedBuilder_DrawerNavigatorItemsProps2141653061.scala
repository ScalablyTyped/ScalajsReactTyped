package typingsJapgolly.reactNavigationDrawer.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.ThemedColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DrawerNavigatorItemsProps2141653061[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activeBackgroundColor(value: String | ThemedColor): this.type = set("activeBackgroundColor", value.asInstanceOf[js.Any])
  
  inline def activeItemKey(value: String): this.type = set("activeItemKey", value.asInstanceOf[js.Any])
  
  inline def activeItemKeyNull: this.type = set("activeItemKey", null)
  
  inline def activeLabelStyle(value: StyleProp[TextStyle]): this.type = set("activeLabelStyle", value.asInstanceOf[js.Any])
  
  inline def activeLabelStyleNull: this.type = set("activeLabelStyle", null)
  
  inline def activeTintColor(value: String | ThemedColor): this.type = set("activeTintColor", value.asInstanceOf[js.Any])
  
  inline def iconContainerStyle(value: StyleProp[ViewStyle]): this.type = set("iconContainerStyle", value.asInstanceOf[js.Any])
  
  inline def iconContainerStyleNull: this.type = set("iconContainerStyle", null)
  
  inline def inactiveBackgroundColor(value: String | ThemedColor): this.type = set("inactiveBackgroundColor", value.asInstanceOf[js.Any])
  
  inline def inactiveLabelStyle(value: StyleProp[TextStyle]): this.type = set("inactiveLabelStyle", value.asInstanceOf[js.Any])
  
  inline def inactiveLabelStyleNull: this.type = set("inactiveLabelStyle", null)
  
  inline def inactiveTintColor(value: String | ThemedColor): this.type = set("inactiveTintColor", value.asInstanceOf[js.Any])
  
  inline def itemStyle(value: StyleProp[ViewStyle]): this.type = set("itemStyle", value.asInstanceOf[js.Any])
  
  inline def itemStyleNull: this.type = set("itemStyle", null)
  
  inline def itemsContainerStyle(value: StyleProp[ViewStyle]): this.type = set("itemsContainerStyle", value.asInstanceOf[js.Any])
  
  inline def itemsContainerStyleNull: this.type = set("itemsContainerStyle", null)
  
  inline def labelStyle(value: StyleProp[TextStyle]): this.type = set("labelStyle", value.asInstanceOf[js.Any])
  
  inline def labelStyleNull: this.type = set("labelStyle", null)
}
