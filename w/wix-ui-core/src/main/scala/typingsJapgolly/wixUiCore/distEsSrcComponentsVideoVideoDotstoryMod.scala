package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.ConfigSrc
import typingsJapgolly.wixUiCore.anon.Controls
import typingsJapgolly.wixUiCore.anon.TypeofVideo
import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoMod.Video
import typingsJapgolly.wixUiCore.distEsSrcComponentsVideoVideoMod.IVideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsVideoVideoDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.category")
    @js.native
    def category: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ Any = js.native
    inline def category_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.component")
    @js.native
    open class component protected () extends Video {
      def this(props: IVideoProps) = this()
    }
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.component")
    @js.native
    def component: TypeofVideo = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    inline def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.componentProps")
    @js.native
    def componentProps: Controls = js.native
    inline def componentProps_=(x: Controls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    inline def component_=(x: TypeofVideo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.exampleProps")
    @js.native
    def exampleProps: ConfigSrc = js.native
    inline def exampleProps_=(x: ConfigSrc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/video/Video.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    inline def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
