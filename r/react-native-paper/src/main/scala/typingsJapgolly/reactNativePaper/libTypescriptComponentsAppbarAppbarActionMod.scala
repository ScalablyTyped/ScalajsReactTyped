package typingsJapgolly.reactNativePaper

import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithoutRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.AccessibilityLabel
import typingsJapgolly.reactNativePaper.anon.Call
import typingsJapgolly.reactNativePaper.anon.Color
import typingsJapgolly.reactNativePaper.anon.PickRemoveChildrenCompone
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedb
import typingsJapgolly.reactNativePaper.anon.TouchableWithoutFeedbackP
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsAppbarAppbarActionMod {
  
  /**
    * A component used to display an action item in the appbar.
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-action-android.png" />
    *       <figcaption>Android</figcaption>
    *   </figure>
    * </div>
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-action-ios.png" />
    *       <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Appbar } from 'react-native-paper';
    * import { Platform } from 'react-native';
    *
    * const MORE_ICON = Platform.OS === 'ios' ? 'dots-horizontal' : 'dots-vertical';
    *
    * const MyComponent = () => (
    *     <Appbar.Header>
    *        <Appbar.Content title="Title" subtitle={'Subtitle'} />
    *         <Appbar.Action icon="magnify" onPress={() => {}} />
    *         <Appbar.Action icon={MORE_ICON} onPress={() => {}} />
    *     </Appbar.Header>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object default {
    
    inline def apply(hasSizeIconColorIconDisabledOnPressAccessibilityLabelRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasSizeIconColorIconDisabledOnPressAccessibilityLabelRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarAction", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A component used to display an action item in the appbar.
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-action-android.png" />
    *       <figcaption>Android</figcaption>
    *   </figure>
    * </div>
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/appbar-action-ios.png" />
    *       <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Appbar } from 'react-native-paper';
    * import { Platform } from 'react-native';
    *
    * const MORE_ICON = Platform.OS === 'ios' ? 'dots-horizontal' : 'dots-vertical';
    *
    * const MyComponent = () => (
    *     <Appbar.Header>
    *        <Appbar.Content title="Title" subtitle={'Subtitle'} />
    *         <Appbar.Action icon="magnify" onPress={() => {}} />
    *         <Appbar.Action icon={MORE_ICON} onPress={() => {}} />
    *     </Appbar.Header>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object AppbarAction {
    
    inline def apply(hasSizeIconColorIconDisabledOnPressAccessibilityLabelRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasSizeIconColorIconDisabledOnPressAccessibilityLabelRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarAction", "AppbarAction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Appbar/AppbarAction", "AppbarAction.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = (ComponentPropsWithoutRef[
    ComponentType[PickRemoveChildrenCompone] & (NonReactStatics[
      (ComponentType[
        (RemoveChildren[
          ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
        ]) & AccessibilityLabel
      ]) & (js.Function1[
        /* hasIconCustomColorSizeAccessibilityLabelDisabledOnPressAnimatedThemeStyleRest */ typingsJapgolly.reactNativePaper.libTypescriptComponentsIconButtonMod.Props, 
        Element
      ]), 
      js.Object
    ])
  ]) & Color
}
