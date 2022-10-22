package typingsJapgolly.wegameApi.anon

import typingsJapgolly.wegameApi.wegameApiStrings.en
import typingsJapgolly.wegameApi.wegameApiStrings.zh_CN
import typingsJapgolly.wegameApi.wegameApiStrings.zh_TW
import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  /**
    * 按钮的背景图片，仅当 type 为 image 时有效
    */
  var image: js.UndefOr[String] = js.undefined
  
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  
  /**
    * 按钮的样式
    */
  var style: js.UndefOr[ButtonStyle] = js.undefined
  
  /**
    * 按钮上的文本，仅当 type 为 text 时有效
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * 按钮类型
    */
  var `type`: ButtonType
  
  /**
    * 是否带上登录态信息。当 withCredentials 为 true 时，要求此前有调用过 wx.login 且登录态尚未过期，此时返回的数据会包含 encryptedData, iv 等敏感信息；当 withCredentials 为 false 时，不要求有登录态，返回的数据不包含 encryptedData, iv 等敏感信息。
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object Image {
  
  inline def apply(`type`: ButtonType): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLang(value: en | zh_CN | zh_TW): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
