package typingsJapgolly.fslightboxReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fslightboxReact.mod.FsLightboxProps
import typingsJapgolly.fslightboxReact.mod.SourceType
import typingsJapgolly.fslightboxReact.mod.VideoDimensions
import typingsJapgolly.fslightboxReact.mod.VideoPoster
import typingsJapgolly.fslightboxReact.mod.default
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FslightboxReact {
  
  inline def apply(toggler: Boolean): Builder = {
    val __props = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FsLightboxProps]))
  }
  
  @JSImport("fslightbox-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def customSources(value: js.Array[Element]): this.type = set("customSources", value.asInstanceOf[js.Any])
    
    inline def customSourcesVarargs(value: Element*): this.type = set("customSources", js.Array(value*))
    
    inline def disableLocalStorage(value: Boolean): this.type = set("disableLocalStorage", value.asInstanceOf[js.Any])
    
    inline def loadOnlyCurrentSource(value: Boolean): this.type = set("loadOnlyCurrentSource", value.asInstanceOf[js.Any])
    
    inline def maxYoutubeVideoDimensions(value: VideoDimensions): this.type = set("maxYoutubeVideoDimensions", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onInit(value: Callback): this.type = set("onInit", value.toJsFn)
    
    inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def openOnMount(value: Boolean): this.type = set("openOnMount", value.asInstanceOf[js.Any])
    
    inline def showThumbsOnMount(value: Boolean): this.type = set("showThumbsOnMount", value.asInstanceOf[js.Any])
    
    inline def slide(value: Double): this.type = set("slide", value.asInstanceOf[js.Any])
    
    inline def slideDistance(value: Double): this.type = set("slideDistance", value.asInstanceOf[js.Any])
    
    inline def source(value: String): this.type = set("source", value.asInstanceOf[js.Any])
    
    inline def sourceIndex(value: Double): this.type = set("sourceIndex", value.asInstanceOf[js.Any])
    
    inline def sources(value: js.Array[String]): this.type = set("sources", value.asInstanceOf[js.Any])
    
    inline def sourcesVarargs(value: String*): this.type = set("sources", js.Array(value*))
    
    inline def `type`(value: SourceType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def typeNull: this.type = set("type", null)
    
    inline def types(value: js.Array[SourceType]): this.type = set("types", value.asInstanceOf[js.Any])
    
    inline def typesVarargs(value: SourceType*): this.type = set("types", js.Array(value*))
    
    inline def videosPosters(value: js.Array[VideoPoster]): this.type = set("videosPosters", value.asInstanceOf[js.Any])
    
    inline def videosPostersVarargs(value: VideoPoster*): this.type = set("videosPosters", js.Array(value*))
  }
  
  def withProps(p: FsLightboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
