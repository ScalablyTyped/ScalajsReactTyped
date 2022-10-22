package typingsJapgolly.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsErrorsMod {
  
  @JSImport("playable/dist/src/constants/errors", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Error & String] = js.native
    
    /* "error-content-load" */ val CONTENT_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_LOAD & String = js.native
    
    /* "error-content-parse" */ val CONTENT_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.CONTENT_PARSE & String = js.native
    
    /* "error-level-load" */ val LEVEL_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.LEVEL_LOAD & String = js.native
    
    /* "error-manifest-incompatible" */ val MANIFEST_INCOMPATIBLE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_INCOMPATIBLE & String = js.native
    
    /* "error-manifest-load" */ val MANIFEST_LOAD: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_LOAD & String = js.native
    
    /* "error-manifest-parse" */ val MANIFEST_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MANIFEST_PARSE & String = js.native
    
    /* "error-media" */ val MEDIA: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.MEDIA & String = js.native
    
    /* "error-src-parse" */ val SRC_PARSE: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.SRC_PARSE & String = js.native
    
    /* "error-unknown" */ val UNKNOWN: typingsJapgolly.playable.distSrcConstantsErrorsMod.Error.UNKNOWN & String = js.native
  }
  
  @js.native
  sealed trait Error extends StObject
  @JSImport("playable/dist/src/constants/errors", "Error")
  @js.native
  object Error extends StObject {
    
    @js.native
    sealed trait CONTENT_LOAD
      extends StObject
         with Error
    
    @js.native
    sealed trait CONTENT_PARSE
      extends StObject
         with Error
    
    @js.native
    sealed trait LEVEL_LOAD
      extends StObject
         with Error
    
    @js.native
    sealed trait MANIFEST_INCOMPATIBLE
      extends StObject
         with Error
    
    @js.native
    sealed trait MANIFEST_LOAD
      extends StObject
         with Error
    
    @js.native
    sealed trait MANIFEST_PARSE
      extends StObject
         with Error
    
    @js.native
    sealed trait MEDIA
      extends StObject
         with Error
    
    @js.native
    sealed trait SRC_PARSE
      extends StObject
         with Error
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with Error
  }
}
