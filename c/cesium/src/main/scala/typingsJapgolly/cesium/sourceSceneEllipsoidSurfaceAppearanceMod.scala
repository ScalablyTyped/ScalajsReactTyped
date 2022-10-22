package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.AboveGround
import typingsJapgolly.cesium.mod.EllipsoidSurfaceAppearance
import typingsJapgolly.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneEllipsoidSurfaceAppearanceMod {
  
  @JSImport("cesium/Source/Scene/EllipsoidSurfaceAppearance", JSImport.Default)
  @js.native
  open class default () extends EllipsoidSurfaceAppearance {
    def this(options: AboveGround) = this()
  }
  /* static members */
  object default {
    
    /**
      * The {@link VertexFormat} that all {@link EllipsoidSurfaceAppearance} instances
      * are compatible with, which requires only <code>position</code> and <code>st</code>
      * attributes.  Other attributes are procedurally computed in the fragment shader.
      */
    @JSImport("cesium/Source/Scene/EllipsoidSurfaceAppearance", "default.VERTEX_FORMAT")
    @js.native
    val VERTEX_FORMAT: VertexFormat = js.native
  }
}
