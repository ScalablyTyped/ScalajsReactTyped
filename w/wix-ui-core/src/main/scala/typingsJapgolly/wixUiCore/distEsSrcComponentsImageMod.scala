package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.distEsSrcComponentsImageImageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsImageMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/image", "FALLBACK_IMAGE")
  @js.native
  val FALLBACK_IMAGE: String = js.native
  
  @JSImport("wix-ui-core/dist/es/src/components/image", "Image")
  @js.native
  open class Image protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsImageImageMod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: Any) = this()
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/image", "ImageStatus")
  @js.native
  object ImageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus & String] = js.native
    
    /* "error" */ val error: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.error & String = js.native
    
    /* "loaded" */ val loaded: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.loaded & String = js.native
    
    /* "loading" */ val loading: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.loading & String = js.native
  }
}
