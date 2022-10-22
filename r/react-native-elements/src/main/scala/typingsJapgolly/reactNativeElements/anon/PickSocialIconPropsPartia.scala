package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distSocialSocialIconMod.SocialMediaType
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-native-elements.react-native-elements/dist/social/SocialIcon.SocialIconProps & std.Partial<react-native-elements.react-native-elements/dist/config.ThemeProps<react-native-elements.react-native-elements/dist/social/SocialIcon.SocialIconProps>>, 'style' | 'light' | 'button' | 'raised' | 'disabled' | 'iconStyle' | 'onPress' | 'onLongPress' | 'underlayColor' | 'type' | 'Component' | 'small' | 'title' | 'loading' | 'iconType' | 'fontFamily' | 'activityIndicatorStyle' | 'fontStyle' | 'fontWeight' | 'iconColor' | 'iconSize'> */
trait PickSocialIconPropsPartia extends StObject {
  
  var Component: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      japgolly.scalajs.react.facade.React.Component[
        typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component & js.Object, 
        js.Object
      ]
    ])
  ] = js.undefined
  
  var activityIndicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var button: js.UndefOr[Boolean] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var iconStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var iconType: js.UndefOr[String] = js.undefined
  
  var light: js.UndefOr[Boolean] = js.undefined
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var raised: js.UndefOr[Boolean] = js.undefined
  
  var small: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[SocialMediaType] = js.undefined
  
  var underlayColor: js.UndefOr[String] = js.undefined
}
object PickSocialIconPropsPartia {
  
  inline def apply(): PickSocialIconPropsPartia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSocialIconPropsPartia]
  }
  
  extension [Self <: PickSocialIconPropsPartia](x: Self) {
    
    inline def setActivityIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activityIndicatorStyle", value.asInstanceOf[js.Any])
    
    inline def setActivityIndicatorStyleNull: Self = StObject.set(x, "activityIndicatorStyle", null)
    
    inline def setActivityIndicatorStyleUndefined: Self = StObject.set(x, "activityIndicatorStyle", js.undefined)
    
    inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[Component & js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleNull: Self = StObject.set(x, "fontStyle", null)
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setIconStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    inline def setIconStyleNull: Self = StObject.set(x, "iconStyle", null)
    
    inline def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    inline def setIconType(value: String): Self = StObject.set(x, "iconType", value.asInstanceOf[js.Any])
    
    inline def setIconTypeUndefined: Self = StObject.set(x, "iconType", js.undefined)
    
    inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setOnLongPress(value: Callback): Self = StObject.set(x, "onLongPress", value.toJsFn)
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: SocialMediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
  }
}
