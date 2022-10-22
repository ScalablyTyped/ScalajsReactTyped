package typingsJapgolly.wixUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsImageConstsMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/image/consts", "FALLBACK_IMAGE")
  @js.native
  val FALLBACK_IMAGE: String = js.native
  
  @js.native
  sealed trait ImageStatus extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/image/consts", "ImageStatus")
  @js.native
  object ImageStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageStatus & String] = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with ImageStatus
    /* "error" */ val error: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.error & String = js.native
    
    @js.native
    sealed trait loaded
      extends StObject
         with ImageStatus
    /* "loaded" */ val loaded: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.loaded & String = js.native
    
    @js.native
    sealed trait loading
      extends StObject
         with ImageStatus
    /* "loading" */ val loading: typingsJapgolly.wixUiCore.distEsSrcComponentsImageConstsMod.ImageStatus.loading & String = js.native
  }
}
