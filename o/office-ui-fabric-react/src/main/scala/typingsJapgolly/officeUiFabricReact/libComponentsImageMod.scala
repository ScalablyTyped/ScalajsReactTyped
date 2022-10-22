package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.ShouldFadeIn
import typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.IImageProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsImageMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "Image")
  @js.native
  val Image: FunctionComponent[IImageProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
  @js.native
  open class ImageBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsImageImageDotbaseMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  /* static members */
  object ImageBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase._svgRegex")
    @js.native
    def _svgRegex: Any = js.native
    inline def _svgRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_svgRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/Image", "ImageBase.defaultProps")
    @js.native
    def defaultProps: ShouldFadeIn = js.native
    inline def defaultProps_=(x: ShouldFadeIn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageCoverStyle")
  @js.native
  object ImageCoverStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle & Double
      ] = js.native
    
    /* 0 */ val landscape: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.landscape & Double = js.native
    
    /* 1 */ val portrait: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageCoverStyle.portrait & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageFit")
  @js.native
  object ImageFit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit & Double
      ] = js.native
    
    /* 0 */ val center: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.center & Double = js.native
    
    /* 5 */ val centerContain: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerContain & Double = js.native
    
    /* 4 */ val centerCover: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.centerCover & Double = js.native
    
    /* 1 */ val contain: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.contain & Double = js.native
    
    /* 2 */ val cover: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.cover & Double = js.native
    
    /* 3 */ val none: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit.none & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Image", "ImageLoadState")
  @js.native
  object ImageLoadState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState & Double
      ] = js.native
    
    /* 2 */ val error: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.error & Double = js.native
    
    /* 3 */ val errorLoaded: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.errorLoaded & Double = js.native
    
    /* 1 */ val loaded: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.loaded & Double = js.native
    
    /* 0 */ val notLoaded: typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageLoadState.notLoaded & Double = js.native
  }
}
