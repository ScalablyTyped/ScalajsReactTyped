package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.Scale
import typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsMediaImageMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/media-image", "MediaImage")
  @js.native
  open class MediaImage protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaImage {
    def this(props: MediaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MediaProps, context: Any) = this()
  }
  /* static members */
  object MediaImage {
    
    @JSImport("wix-ui-core/dist/es/src/components/media-image", "MediaImage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/media-image", "MediaImage.defaultProps")
    @js.native
    def defaultProps: Scale = js.native
    inline def defaultProps_=(x: Scale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/media-image", "MediaImage.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/media-image", "MediaImageScaling")
  @js.native
  object MediaImageScaling extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaImageScaling & String
      ] = js.native
    
    /* "fill" */ val FILL: typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaImageScaling.FILL & String = js.native
    
    /* "fit" */ val FIT: typingsJapgolly.wixUiCore.distEsSrcComponentsMediaImageMediaImageMod.MediaImageScaling.FIT & String = js.native
  }
}
