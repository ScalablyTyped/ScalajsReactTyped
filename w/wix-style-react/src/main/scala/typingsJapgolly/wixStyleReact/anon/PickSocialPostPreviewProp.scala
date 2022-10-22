package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-style-react.wix-style-react/dist/types/SocialPostPreview/SocialPostPreview.types.SocialPostPreviewProps, 'profileName' | 'profileImageSrc' | 'caption' | 'media'> */
trait PickSocialPostPreviewProp extends StObject {
  
  var caption: js.UndefOr[Node] = js.undefined
  
  var media: js.UndefOr[Node] = js.undefined
  
  var profileImageSrc: js.UndefOr[String] = js.undefined
  
  var profileName: js.UndefOr[Node] = js.undefined
}
object PickSocialPostPreviewProp {
  
  inline def apply(): PickSocialPostPreviewProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickSocialPostPreviewProp]
  }
  
  extension [Self <: PickSocialPostPreviewProp](x: Self) {
    
    inline def setCaption(value: VdomNode): Self = StObject.set(x, "caption", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCaptionNull: Self = StObject.set(x, "caption", null)
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setCaptionVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "caption", js.Array(value*))
    
    inline def setCaptionVdomElement(value: VdomElement): Self = StObject.set(x, "caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def setMedia(value: VdomNode): Self = StObject.set(x, "media", value.rawNode.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMediaVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setMediaVdomElement(value: VdomElement): Self = StObject.set(x, "media", value.rawElement.asInstanceOf[js.Any])
    
    inline def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
    
    inline def setProfileImageSrcUndefined: Self = StObject.set(x, "profileImageSrc", js.undefined)
    
    inline def setProfileName(value: VdomNode): Self = StObject.set(x, "profileName", value.rawNode.asInstanceOf[js.Any])
    
    inline def setProfileNameNull: Self = StObject.set(x, "profileName", null)
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
    
    inline def setProfileNameVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "profileName", js.Array(value*))
    
    inline def setProfileNameVdomElement(value: VdomElement): Self = StObject.set(x, "profileName", value.rawElement.asInstanceOf[js.Any])
  }
}
