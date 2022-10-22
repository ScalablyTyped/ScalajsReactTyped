package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BundleId extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "BundleId")
@js.native
object BundleId extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BundleId & String] = js.native
  
  @js.native
  sealed trait Beta
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.beta" */ val Beta: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.Beta & String = js.native
  
  @js.native
  sealed trait Experimental
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.experimental" */ val Experimental: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.Experimental & String = js.native
  
  @js.native
  sealed trait FeaturePreview
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.feature-preview" */ val FeaturePreview: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.FeaturePreview & String = js.native
  
  @js.native
  sealed trait Internal
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.internal" */ val Internal: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.Internal & String = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.private" */ val Private: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.Private & String = js.native
  
  @js.native
  sealed trait PublicRelease
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3" */ val PublicRelease: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.PublicRelease & String = js.native
  
  @js.native
  sealed trait Testing
    extends StObject
       with BundleId
  /* "com.bohemiancoding.sketch3.testing" */ val Testing: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.BundleId.Testing & String = js.native
}
