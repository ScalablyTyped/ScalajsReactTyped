package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_PickSocialPostPreviewProp_1225398424 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def caption(value: VdomNode): this.type = set("caption", value.rawNode.asInstanceOf[js.Any])
  
  inline def captionNull: this.type = set("caption", null)
  
  inline def captionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("caption", js.Array(value*))
  
  inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
  
  inline def media(value: VdomNode): this.type = set("media", value.rawNode.asInstanceOf[js.Any])
  
  inline def mediaNull: this.type = set("media", null)
  
  inline def mediaVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("media", js.Array(value*))
  
  inline def mediaVdomElement(value: VdomElement): this.type = set("media", value.rawElement.asInstanceOf[js.Any])
  
  inline def profileImageSrc(value: String): this.type = set("profileImageSrc", value.asInstanceOf[js.Any])
  
  inline def profileName(value: VdomNode): this.type = set("profileName", value.rawNode.asInstanceOf[js.Any])
  
  inline def profileNameNull: this.type = set("profileName", null)
  
  inline def profileNameVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("profileName", js.Array(value*))
  
  inline def profileNameVdomElement(value: VdomElement): this.type = set("profileName", value.rawElement.asInstanceOf[js.Any])
}
