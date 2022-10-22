package typingsJapgolly.socialLogos

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("social-logos", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  trait Props extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: SocialIcon
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(icon: SocialIcon): Props = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(value: SocialIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.socialLogos.socialLogosStrings.amazon
    - typingsJapgolly.socialLogos.socialLogosStrings.behance
    - typingsJapgolly.socialLogos.socialLogosStrings.`blogger-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.blogger
    - typingsJapgolly.socialLogos.socialLogosStrings.codepen
    - typingsJapgolly.socialLogos.socialLogosStrings.dribbble
    - typingsJapgolly.socialLogos.socialLogosStrings.dropbox
    - typingsJapgolly.socialLogos.socialLogosStrings.eventbrite
    - typingsJapgolly.socialLogos.socialLogosStrings.facebook
    - typingsJapgolly.socialLogos.socialLogosStrings.feed
    - typingsJapgolly.socialLogos.socialLogosStrings.flickr
    - typingsJapgolly.socialLogos.socialLogosStrings.foursquare
    - typingsJapgolly.socialLogos.socialLogosStrings.ghost
    - typingsJapgolly.socialLogos.socialLogosStrings.github
    - typingsJapgolly.socialLogos.socialLogosStrings.`google-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.`google-plus-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.`google-plus`
    - typingsJapgolly.socialLogos.socialLogosStrings.google
    - typingsJapgolly.socialLogos.socialLogosStrings.instagram
    - typingsJapgolly.socialLogos.socialLogosStrings.linkedin
    - typingsJapgolly.socialLogos.socialLogosStrings.mail
    - typingsJapgolly.socialLogos.socialLogosStrings.`medium-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.medium
    - typingsJapgolly.socialLogos.socialLogosStrings.patreon
    - typingsJapgolly.socialLogos.socialLogosStrings.`pinterest-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.pinterest
    - typingsJapgolly.socialLogos.socialLogosStrings.pocket
    - typingsJapgolly.socialLogos.socialLogosStrings.polldaddy
    - typingsJapgolly.socialLogos.socialLogosStrings.print
    - typingsJapgolly.socialLogos.socialLogosStrings.reddit
    - typingsJapgolly.socialLogos.socialLogosStrings.share
    - typingsJapgolly.socialLogos.socialLogosStrings.skype
    - typingsJapgolly.socialLogos.socialLogosStrings.spotify
    - typingsJapgolly.socialLogos.socialLogosStrings.squarespace
    - typingsJapgolly.socialLogos.socialLogosStrings.stumbleupon
    - typingsJapgolly.socialLogos.socialLogosStrings.telegram
    - typingsJapgolly.socialLogos.socialLogosStrings.`tiktok-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.tiktok
    - typingsJapgolly.socialLogos.socialLogosStrings.`tumblr-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.tumblr
    - typingsJapgolly.socialLogos.socialLogosStrings.twitch
    - typingsJapgolly.socialLogos.socialLogosStrings.`twitter-alt`
    - typingsJapgolly.socialLogos.socialLogosStrings.twitter
    - typingsJapgolly.socialLogos.socialLogosStrings.vimeo
    - typingsJapgolly.socialLogos.socialLogosStrings.whatsapp
    - typingsJapgolly.socialLogos.socialLogosStrings.woocommerce
    - typingsJapgolly.socialLogos.socialLogosStrings.wordpress
    - typingsJapgolly.socialLogos.socialLogosStrings.xanga
    - typingsJapgolly.socialLogos.socialLogosStrings.youtube
  */
  trait SocialIcon extends StObject
  object SocialIcon {
    
    inline def amazon: typingsJapgolly.socialLogos.socialLogosStrings.amazon = "amazon".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.amazon]
    
    inline def behance: typingsJapgolly.socialLogos.socialLogosStrings.behance = "behance".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.behance]
    
    inline def blogger: typingsJapgolly.socialLogos.socialLogosStrings.blogger = "blogger".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.blogger]
    
    inline def `blogger-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`blogger-alt` = "blogger-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`blogger-alt`]
    
    inline def codepen: typingsJapgolly.socialLogos.socialLogosStrings.codepen = "codepen".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.codepen]
    
    inline def dribbble: typingsJapgolly.socialLogos.socialLogosStrings.dribbble = "dribbble".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.dribbble]
    
    inline def dropbox: typingsJapgolly.socialLogos.socialLogosStrings.dropbox = "dropbox".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.dropbox]
    
    inline def eventbrite: typingsJapgolly.socialLogos.socialLogosStrings.eventbrite = "eventbrite".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.eventbrite]
    
    inline def facebook: typingsJapgolly.socialLogos.socialLogosStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.facebook]
    
    inline def feed: typingsJapgolly.socialLogos.socialLogosStrings.feed = "feed".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.feed]
    
    inline def flickr: typingsJapgolly.socialLogos.socialLogosStrings.flickr = "flickr".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.flickr]
    
    inline def foursquare: typingsJapgolly.socialLogos.socialLogosStrings.foursquare = "foursquare".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.foursquare]
    
    inline def ghost: typingsJapgolly.socialLogos.socialLogosStrings.ghost = "ghost".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.ghost]
    
    inline def github: typingsJapgolly.socialLogos.socialLogosStrings.github = "github".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.github]
    
    inline def google: typingsJapgolly.socialLogos.socialLogosStrings.google = "google".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.google]
    
    inline def `google-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`google-alt` = "google-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`google-alt`]
    
    inline def `google-plus`: typingsJapgolly.socialLogos.socialLogosStrings.`google-plus` = "google-plus".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`google-plus`]
    
    inline def `google-plus-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`google-plus-alt` = "google-plus-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`google-plus-alt`]
    
    inline def instagram: typingsJapgolly.socialLogos.socialLogosStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.instagram]
    
    inline def linkedin: typingsJapgolly.socialLogos.socialLogosStrings.linkedin = "linkedin".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.linkedin]
    
    inline def mail: typingsJapgolly.socialLogos.socialLogosStrings.mail = "mail".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.mail]
    
    inline def medium: typingsJapgolly.socialLogos.socialLogosStrings.medium = "medium".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.medium]
    
    inline def `medium-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`medium-alt` = "medium-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`medium-alt`]
    
    inline def patreon: typingsJapgolly.socialLogos.socialLogosStrings.patreon = "patreon".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.patreon]
    
    inline def pinterest: typingsJapgolly.socialLogos.socialLogosStrings.pinterest = "pinterest".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.pinterest]
    
    inline def `pinterest-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`pinterest-alt` = "pinterest-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`pinterest-alt`]
    
    inline def pocket: typingsJapgolly.socialLogos.socialLogosStrings.pocket = "pocket".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.pocket]
    
    inline def polldaddy: typingsJapgolly.socialLogos.socialLogosStrings.polldaddy = "polldaddy".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.polldaddy]
    
    inline def print: typingsJapgolly.socialLogos.socialLogosStrings.print = "print".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.print]
    
    inline def reddit: typingsJapgolly.socialLogos.socialLogosStrings.reddit = "reddit".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.reddit]
    
    inline def share: typingsJapgolly.socialLogos.socialLogosStrings.share = "share".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.share]
    
    inline def skype: typingsJapgolly.socialLogos.socialLogosStrings.skype = "skype".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.skype]
    
    inline def spotify: typingsJapgolly.socialLogos.socialLogosStrings.spotify = "spotify".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.spotify]
    
    inline def squarespace: typingsJapgolly.socialLogos.socialLogosStrings.squarespace = "squarespace".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.squarespace]
    
    inline def stumbleupon: typingsJapgolly.socialLogos.socialLogosStrings.stumbleupon = "stumbleupon".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.stumbleupon]
    
    inline def telegram: typingsJapgolly.socialLogos.socialLogosStrings.telegram = "telegram".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.telegram]
    
    inline def tiktok: typingsJapgolly.socialLogos.socialLogosStrings.tiktok = "tiktok".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.tiktok]
    
    inline def `tiktok-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`tiktok-alt` = "tiktok-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`tiktok-alt`]
    
    inline def tumblr: typingsJapgolly.socialLogos.socialLogosStrings.tumblr = "tumblr".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.tumblr]
    
    inline def `tumblr-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`tumblr-alt` = "tumblr-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`tumblr-alt`]
    
    inline def twitch: typingsJapgolly.socialLogos.socialLogosStrings.twitch = "twitch".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.twitch]
    
    inline def twitter: typingsJapgolly.socialLogos.socialLogosStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.twitter]
    
    inline def `twitter-alt`: typingsJapgolly.socialLogos.socialLogosStrings.`twitter-alt` = "twitter-alt".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.`twitter-alt`]
    
    inline def vimeo: typingsJapgolly.socialLogos.socialLogosStrings.vimeo = "vimeo".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.vimeo]
    
    inline def whatsapp: typingsJapgolly.socialLogos.socialLogosStrings.whatsapp = "whatsapp".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.whatsapp]
    
    inline def woocommerce: typingsJapgolly.socialLogos.socialLogosStrings.woocommerce = "woocommerce".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.woocommerce]
    
    inline def wordpress: typingsJapgolly.socialLogos.socialLogosStrings.wordpress = "wordpress".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.wordpress]
    
    inline def xanga: typingsJapgolly.socialLogos.socialLogosStrings.xanga = "xanga".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.xanga]
    
    inline def youtube: typingsJapgolly.socialLogos.socialLogosStrings.youtube = "youtube".asInstanceOf[typingsJapgolly.socialLogos.socialLogosStrings.youtube]
  }
  
  type SocialLogo = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
}
