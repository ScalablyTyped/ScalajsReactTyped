package typingsJapgolly.reactNativeElements

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.anon.PickSocialIconPropsPartia
import typingsJapgolly.reactNativeElements.anon.SocialIconPropsPartialThe
import typingsJapgolly.reactNativeElements.anon.TypeofComponent
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSocialSocialIconMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/social/SocialIcon", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe] = js.native
  
  @JSImport("react-native-elements/dist/social/SocialIcon", "SocialIcon")
  @js.native
  val SocialIcon: RneFunctionComponent[SocialIconProps] = js.native
  
  trait SocialIconProps extends StObject {
    
    var Component: js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]
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
  object SocialIconProps {
    
    inline def apply(): SocialIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialIconProps]
    }
    
    extension [Self <: SocialIconProps](x: Self) {
      
      inline def setActivityIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "activityIndicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setActivityIndicatorStyleNull: Self = StObject.set(x, "activityIndicatorStyle", null)
      
      inline def setActivityIndicatorStyleUndefined: Self = StObject.set(x, "activityIndicatorStyle", js.undefined)
      
      inline def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setComponent(
        value: TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object]
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.facebook
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`facebook-messenger`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.whatsapp
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitter
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`google-plus-official`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.google
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.pinterest
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.linkedin
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.youtube
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vimeo
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.tumblr
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.instagram
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.quora
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.flickr
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.foursquare
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.wordpress
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.stumbleupon
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.github
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`github-alt`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitch
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.medium
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.soundcloud
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`stack-overflow`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.gitlab
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.angellist
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.codepen
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.weibo
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vk
  */
  trait SocialMediaType extends StObject
  object SocialMediaType {
    
    inline def angellist: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.angellist = "angellist".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.angellist]
    
    inline def codepen: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.codepen = "codepen".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.codepen]
    
    inline def facebook: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.facebook]
    
    inline def `facebook-messenger`: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`facebook-messenger` = "facebook-messenger".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`facebook-messenger`]
    
    inline def flickr: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.flickr = "flickr".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.flickr]
    
    inline def foursquare: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.foursquare = "foursquare".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.foursquare]
    
    inline def github: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.github = "github".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.github]
    
    inline def `github-alt`: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`github-alt` = "github-alt".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`github-alt`]
    
    inline def gitlab: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.gitlab = "gitlab".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.gitlab]
    
    inline def google: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.google = "google".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.google]
    
    inline def `google-plus-official`: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`google-plus-official` = "google-plus-official".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`google-plus-official`]
    
    inline def instagram: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.instagram]
    
    inline def linkedin: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.linkedin = "linkedin".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.linkedin]
    
    inline def medium: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.medium = "medium".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.medium]
    
    inline def pinterest: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.pinterest = "pinterest".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.pinterest]
    
    inline def quora: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.quora = "quora".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.quora]
    
    inline def soundcloud: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.soundcloud = "soundcloud".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.soundcloud]
    
    inline def `stack-overflow`: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`stack-overflow` = "stack-overflow".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`stack-overflow`]
    
    inline def stumbleupon: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.stumbleupon = "stumbleupon".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.stumbleupon]
    
    inline def tumblr: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.tumblr = "tumblr".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.tumblr]
    
    inline def twitch: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitch = "twitch".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitch]
    
    inline def twitter: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.twitter]
    
    inline def vimeo: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vimeo = "vimeo".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vimeo]
    
    inline def vk: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vk = "vk".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.vk]
    
    inline def weibo: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.weibo = "weibo".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.weibo]
    
    inline def whatsapp: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.whatsapp = "whatsapp".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.whatsapp]
    
    inline def wordpress: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.wordpress = "wordpress".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.wordpress]
    
    inline def youtube: typingsJapgolly.reactNativeElements.reactNativeElementsStrings.youtube = "youtube".asInstanceOf[typingsJapgolly.reactNativeElements.reactNativeElementsStrings.youtube]
  }
  
  type _To = FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe]
  
  /* This means you don't have to write `default`, but can instead just say `distSocialSocialIconMod.foo` */
  override def _to: FunctionComponent[PickSocialIconPropsPartia] | ForwardRefExoticComponent[SocialIconPropsPartialThe] = default
}
