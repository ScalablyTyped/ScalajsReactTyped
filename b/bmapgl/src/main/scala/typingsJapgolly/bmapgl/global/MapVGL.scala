package typingsJapgolly.bmapgl.global

import typingsJapgolly.bmapgl.BMapGL.Map
import typingsJapgolly.bmapgl.MapVGL.GeoJSON
import typingsJapgolly.bmapgl.MapVGL.LayerOptions
import typingsJapgolly.bmapgl.MapVGL.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  @JSGlobal("MapVGL.Effects")
  @js.native
  open class Effects ()
    extends StObject
       with typingsJapgolly.bmapgl.MapVGL.Effects {
    def this(opts: js.Object) = this()
  }
  
  @JSGlobal("MapVGL.Layer")
  @js.native
  open class Layer protected ()
    extends StObject
       with typingsJapgolly.bmapgl.MapVGL.Layer {
    def this(map: Map) = this()
    def this(map: Map, opts: LayerOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getData(): js.Array[GeoJSON] = js.native
    
    /* CompleteClass */
    override def getDefaultOptions(): LayerOptions = js.native
    
    /* CompleteClass */
    override def getOptions(): LayerOptions = js.native
    
    /* CompleteClass */
    override def setData(x: js.Array[GeoJSON]): Unit = js.native
    
    /* CompleteClass */
    override def setOptions(x: LayerOptions): Unit = js.native
  }
  
  @JSGlobal("MapVGL.View")
  @js.native
  open class View protected ()
    extends StObject
       with typingsJapgolly.bmapgl.MapVGL.View {
    def this(opts: ViewOptions) = this()
    
    /* CompleteClass */
    override def addLayer(x: typingsJapgolly.bmapgl.MapVGL.Layer): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getAllLayers(x: typingsJapgolly.bmapgl.MapVGL.Layer): js.Array[typingsJapgolly.bmapgl.MapVGL.Layer] = js.native
    
    /* CompleteClass */
    override def getAllThreeLayers(x: typingsJapgolly.bmapgl.MapVGL.Layer): js.Array[typingsJapgolly.bmapgl.MapVGL.Layer] = js.native
    
    /* CompleteClass */
    override def removeLayer(x: typingsJapgolly.bmapgl.MapVGL.Layer): Unit = js.native
  }
}
