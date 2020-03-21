package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.imageTypesMod.IImageProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Image", JSImport.Namespace)
@js.native
object libImageMod extends js.Object {
  @js.native
  class ImageBase protected ()
    extends typingsJapgolly.officeUiFabricReact.imageMod.ImageBase {
    def this(props: IImageProps) = this()
  }
  
  val Image: FunctionComponent[IImageProps] = js.native
  /* static members */
  @js.native
  object ImageBase extends js.Object {
    var _svgRegex: js.Any = js.native
    var defaultProps: AnonShouldFadeIn = js.native
  }
  
  @js.native
  object ImageCoverStyle extends js.Object {
    /* 0 */ val landscape: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageCoverStyle.landscape with Double = js.native
    /* 1 */ val portrait: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageCoverStyle.portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageCoverStyle with Double] = js.native
  }
  
  @js.native
  object ImageFit extends js.Object {
    /* 0 */ val center: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.center with Double = js.native
    /* 5 */ val centerContain: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.centerContain with Double = js.native
    /* 4 */ val centerCover: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.centerCover with Double = js.native
    /* 1 */ val contain: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.contain with Double = js.native
    /* 2 */ val cover: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.cover with Double = js.native
    /* 3 */ val none: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit.none with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageFit with Double] = js.native
  }
  
  @js.native
  object ImageLoadState extends js.Object {
    /* 2 */ val error: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState.error with Double = js.native
    /* 3 */ val errorLoaded: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState.errorLoaded with Double = js.native
    /* 1 */ val loaded: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState.loaded with Double = js.native
    /* 0 */ val notLoaded: typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState.notLoaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.officeUiFabricReact.imageTypesMod.ImageLoadState with Double] = js.native
  }
  
}

