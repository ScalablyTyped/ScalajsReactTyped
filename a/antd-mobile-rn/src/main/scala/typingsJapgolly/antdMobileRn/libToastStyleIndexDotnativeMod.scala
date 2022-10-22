package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.BackgroundColorMinWidth
import typingsJapgolly.antdMobileRn.anon.BackgroundColorString
import typingsJapgolly.antdMobileRn.anon.BorderRadiusPadding
import typingsJapgolly.antdMobileRn.anon.BorderRadiusPaddingHorizontal
import typingsJapgolly.antdMobileRn.anon.BottomJustifyContent
import typingsJapgolly.antdMobileRn.anon.HeightMarginBottom
import typingsJapgolly.antdMobileRn.anon.JustifyContentPadding
import typingsJapgolly.antdMobileRn.anon.`0`
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastStyleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.centering")
    @js.native
    def centering: JustifyContentPadding = js.native
    inline def centering_=(x: JustifyContentPadding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("centering")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.container")
    @js.native
    def container: BottomJustifyContent = js.native
    inline def container_=(x: BottomJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.content")
    @js.native
    def content: `0` = js.native
    inline def content_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.iconToast")
    @js.native
    def iconToast: BorderRadiusPadding = js.native
    inline def iconToast_=(x: BorderRadiusPadding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconToast")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.image")
    @js.native
    def image: HeightMarginBottom = js.native
    inline def image_=(x: HeightMarginBottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.innerContainer")
    @js.native
    def innerContainer: BackgroundColorString = js.native
    inline def innerContainer_=(x: BackgroundColorString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.innerWrap")
    @js.native
    def innerWrap: BackgroundColorMinWidth = js.native
    inline def innerWrap_=(x: BackgroundColorMinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("innerWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/toast/style/index.native", "default.textToast")
    @js.native
    def textToast: BorderRadiusPaddingHorizontal = js.native
    inline def textToast_=(x: BorderRadiusPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textToast")(x.asInstanceOf[js.Any])
  }
  
  trait IToastStyle extends StObject {
    
    var centering: ViewStyle
    
    var container: ViewStyle
    
    var content: TextStyle
    
    var iconToast: ViewStyle
    
    var image: ImageStyle
    
    var innerContainer: ViewStyle
    
    var innerWrap: ViewStyle
    
    var textToast: ViewStyle
  }
  object IToastStyle {
    
    inline def apply(
      centering: ViewStyle,
      container: ViewStyle,
      content: TextStyle,
      iconToast: ViewStyle,
      image: ImageStyle,
      innerContainer: ViewStyle,
      innerWrap: ViewStyle,
      textToast: ViewStyle
    ): IToastStyle = {
      val __obj = js.Dynamic.literal(centering = centering.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], iconToast = iconToast.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], innerWrap = innerWrap.asInstanceOf[js.Any], textToast = textToast.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToastStyle]
    }
    
    extension [Self <: IToastStyle](x: Self) {
      
      inline def setCentering(value: ViewStyle): Self = StObject.set(x, "centering", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIconToast(value: ViewStyle): Self = StObject.set(x, "iconToast", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ImageStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      inline def setInnerWrap(value: ViewStyle): Self = StObject.set(x, "innerWrap", value.asInstanceOf[js.Any])
      
      inline def setTextToast(value: ViewStyle): Self = StObject.set(x, "textToast", value.asInstanceOf[js.Any])
    }
  }
}
