package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.CallHasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle
import typingsJapgolly.reactNativePaper.anon.Left
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityLabelledBy
import typingsJapgolly.reactNativePaper.anon.TypeofView
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCardCardTitleMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Card/CardTitle", JSImport.Default)
  @js.native
  val default: ComponentType[PickViewPropsRefAttributeAccessibilityLabelledBy] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLabel] & CallHasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle, 
    js.Object
  ]) = js.native
  
  /**
    * A component to show a title, subtitle and an avatar inside a Card.
    *
    * <div class="screenshots">
    *   <img class="medium" src="screenshots/card-title-1.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Avatar, Card, IconButton } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Card.Title
    *     title="Card Title"
    *     subtitle="Card Subtitle"
    *     left={(props) => <Avatar.Icon {...props} icon="folder" />}
    *     right={(props) => <IconButton {...props} icon="more-vert" onPress={() => {}} />}
    *   />
    * );
    *
    * export default MyComponent;
    * ```
    */
  object CardTitle {
    
    inline def apply(
      hasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle: Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardTitle", "CardTitle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardTitle", "CardTitle.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofView] & Left
  
  type _To = ComponentType[PickViewPropsRefAttributeAccessibilityLabelledBy] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLabel] & CallHasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsCardCardTitleMod.foo` */
  override def _to: ComponentType[PickViewPropsRefAttributeAccessibilityLabelledBy] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityLabel] & CallHasTitleTitleStyleTitleNumberOfLinesSubtitleSubtitleStyleSubtitleNumberOfLinesLeftLeftStyleRightRightStyleStyle, 
    js.Object
  ]) = default
}
