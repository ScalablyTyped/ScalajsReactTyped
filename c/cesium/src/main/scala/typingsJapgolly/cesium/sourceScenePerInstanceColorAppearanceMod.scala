package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.Flat
import typingsJapgolly.cesium.mod.PerInstanceColorAppearance
import typingsJapgolly.cesium.mod.VertexFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceScenePerInstanceColorAppearanceMod {
  
  @JSImport("cesium/Source/Scene/PerInstanceColorAppearance", JSImport.Default)
  @js.native
  open class default () extends PerInstanceColorAppearance {
    def this(options: Flat) = this()
  }
  /* static members */
  object default {
    
    /**
      * The {@link VertexFormat} that all {@link PerInstanceColorAppearance} instances
      * are compatible with when {@link PerInstanceColorAppearance#flat} is <code>true</code>.
      * This requires only a <code>position</code> attribute.
      */
    @JSImport("cesium/Source/Scene/PerInstanceColorAppearance", "default.FLAT_VERTEX_FORMAT")
    @js.native
    val FLAT_VERTEX_FORMAT: VertexFormat = js.native
    
    /**
      * The {@link VertexFormat} that all {@link PerInstanceColorAppearance} instances
      * are compatible with.  This requires only <code>position</code> and <code>normal</code>
      * attributes.
      */
    @JSImport("cesium/Source/Scene/PerInstanceColorAppearance", "default.VERTEX_FORMAT")
    @js.native
    val VERTEX_FORMAT: VertexFormat = js.native
  }
}
