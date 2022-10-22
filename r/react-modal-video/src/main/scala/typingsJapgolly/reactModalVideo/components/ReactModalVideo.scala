package typingsJapgolly.reactModalVideo.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactModalVideo.mod.Aria
import typingsJapgolly.reactModalVideo.mod.ClassNames
import typingsJapgolly.reactModalVideo.mod.Custom
import typingsJapgolly.reactModalVideo.mod.ModalVideoBaseProps
import typingsJapgolly.reactModalVideo.mod.Vimeo
import typingsJapgolly.reactModalVideo.mod.VimeoApi
import typingsJapgolly.reactModalVideo.mod.Youku
import typingsJapgolly.reactModalVideo.mod.YoukuApi
import typingsJapgolly.reactModalVideo.mod.Youtube
import typingsJapgolly.reactModalVideo.mod.YoutubeApi
import typingsJapgolly.reactModalVideo.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactModalVideo {
  
  object CustomModalVideoBaseProps {
    
    inline def apply(
      allowFullScreen: Boolean,
      animationSpeed: Double,
      aria: Aria,
      classNames: ClassNames,
      isOpen: Boolean,
      ratio: /* template literal string: ${number}:${number} */ String,
      url: String
    ): Builder = {
      val __props = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], animationSpeed = animationSpeed.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], channel = "custom", classNames = classNames.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[Custom & ModalVideoBaseProps]))
    }
    
    @JSImport("react-modal-video", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    }
    
    def withProps(p: Custom & ModalVideoBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object VimeoModalVideoBaseProps {
    
    inline def apply(
      allowFullScreen: Boolean,
      animationSpeed: Double,
      aria: Aria,
      classNames: ClassNames,
      isOpen: Boolean,
      ratio: /* template literal string: ${number}:${number} */ String,
      videoId: String
    ): Builder = {
      val __props = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], animationSpeed = animationSpeed.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], channel = "vimeo", classNames = classNames.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[Vimeo & ModalVideoBaseProps]))
    }
    
    @JSImport("react-modal-video", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
      
      inline def vimeo(value: VimeoApi): this.type = set("vimeo", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Vimeo & ModalVideoBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object YoukuModalVideoBaseProps {
    
    inline def apply(
      allowFullScreen: Boolean,
      animationSpeed: Double,
      aria: Aria,
      classNames: ClassNames,
      isOpen: Boolean,
      ratio: /* template literal string: ${number}:${number} */ String,
      videoId: String
    ): Builder = {
      val __props = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], animationSpeed = animationSpeed.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], channel = "youku", classNames = classNames.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[Youku & ModalVideoBaseProps]))
    }
    
    @JSImport("react-modal-video", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
      
      inline def youku(value: YoukuApi): this.type = set("youku", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Youku & ModalVideoBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object YoutubeModalVideoBaseProps {
    
    inline def apply(
      allowFullScreen: Boolean,
      animationSpeed: Double,
      aria: Aria,
      classNames: ClassNames,
      isOpen: Boolean,
      ratio: /* template literal string: ${number}:${number} */ String,
      videoId: String
    ): Builder = {
      val __props = js.Dynamic.literal(allowFullScreen = allowFullScreen.asInstanceOf[js.Any], animationSpeed = animationSpeed.asInstanceOf[js.Any], aria = aria.asInstanceOf[js.Any], channel = "youtube", classNames = classNames.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[Youtube & ModalVideoBaseProps]))
    }
    
    @JSImport("react-modal-video", JSImport.Default)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[default] {
      
      inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
      
      inline def youtube(value: YoutubeApi): this.type = set("youtube", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: Youtube & ModalVideoBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
