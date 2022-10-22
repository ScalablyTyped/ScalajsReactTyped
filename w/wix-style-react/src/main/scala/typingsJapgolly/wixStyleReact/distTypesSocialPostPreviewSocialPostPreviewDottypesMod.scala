package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.facebook
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.instagram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSocialPostPreviewSocialPostPreviewDottypesMod {
  
  trait SocialPostPreviewProps extends StObject {
    
    /** Adds textual post content */
    var caption: js.UndefOr[Node] = js.undefined
    
    /** Applies a CSS class to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Applies a data-hook HTML attribute to be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Adds visual post content (most commonly, <Image/> is added as a child item) */
    var media: js.UndefOr[Node] = js.undefined
    
    /** Contains a URL link to the post’s profile picture */
    var profileImageSrc: js.UndefOr[String] = js.undefined
    
    /** Contains the post’s profile name (a username in Facebook or Instagram) */
    var profileName: js.UndefOr[Node] = js.undefined
    
    /** Controls the appearance and layout of the component */
    var skin: js.UndefOr[facebook | instagram] = js.undefined
  }
  object SocialPostPreviewProps {
    
    inline def apply(): SocialPostPreviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialPostPreviewProps]
    }
    
    extension [Self <: SocialPostPreviewProps](x: Self) {
      
      inline def setCaption(value: VdomNode): Self = StObject.set(x, "caption", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCaptionNull: Self = StObject.set(x, "caption", null)
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setCaptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "caption", js.Array(value*))
      
      inline def setCaptionVdomElement(value: VdomElement): Self = StObject.set(x, "caption", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMedia(value: VdomNode): Self = StObject.set(x, "media", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMediaNull: Self = StObject.set(x, "media", null)
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMediaVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "media", js.Array(value*))
      
      inline def setMediaVdomElement(value: VdomElement): Self = StObject.set(x, "media", value.rawElement.asInstanceOf[js.Any])
      
      inline def setProfileImageSrc(value: String): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
      
      inline def setProfileImageSrcUndefined: Self = StObject.set(x, "profileImageSrc", js.undefined)
      
      inline def setProfileName(value: VdomNode): Self = StObject.set(x, "profileName", value.rawNode.asInstanceOf[js.Any])
      
      inline def setProfileNameNull: Self = StObject.set(x, "profileName", null)
      
      inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
      
      inline def setProfileNameVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "profileName", js.Array(value*))
      
      inline def setProfileNameVdomElement(value: VdomElement): Self = StObject.set(x, "profileName", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSkin(value: facebook | instagram): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
}
