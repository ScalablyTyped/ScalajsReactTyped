package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.CallHasIndexTotalStyleThemeRest
import typingsJapgolly.reactNativePaper.anon.ImagePropsRefAttributesIm
import typingsJapgolly.reactNativePaper.anon.PickImagePropsRefAttributAccessibilityActions
import typingsJapgolly.reactNativePaper.anon.Theme
import typingsJapgolly.reactNativePaper.anon.TypeofImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsCardCardCoverMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Card/CardCover", JSImport.Default)
  @js.native
  val default: ComponentType[PickImagePropsRefAttributAccessibilityActions] & (NonReactStatics[
    ComponentType[ImagePropsRefAttributesIm] & CallHasIndexTotalStyleThemeRest, 
    js.Object
  ]) = js.native
  
  /**
    * A component to show a cover image inside a Card.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/card-cover.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Card } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Card>
    *     <Card.Cover source={{ uri: 'https://picsum.photos/700' }} />
    *   </Card>
    * );
    *
    * export default MyComponent;
    * ```
    *
    * @extends Image props https://reactnative.dev/docs/image#props
    */
  object CardCover {
    
    inline def apply(hasIndexTotalStyleThemeRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasIndexTotalStyleThemeRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardCover", "CardCover")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Card/CardCover", "CardCover.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[TypeofImage] & Theme
  
  type _To = ComponentType[PickImagePropsRefAttributAccessibilityActions] & (NonReactStatics[
    ComponentType[ImagePropsRefAttributesIm] & CallHasIndexTotalStyleThemeRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsCardCardCoverMod.foo` */
  override def _to: ComponentType[PickImagePropsRefAttributAccessibilityActions] & (NonReactStatics[
    ComponentType[ImagePropsRefAttributesIm] & CallHasIndexTotalStyleThemeRest, 
    js.Object
  ]) = default
}
