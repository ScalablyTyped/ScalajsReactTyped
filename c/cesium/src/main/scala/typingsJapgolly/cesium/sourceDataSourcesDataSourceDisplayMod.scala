package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.DataSourceCollection
import typingsJapgolly.cesium.mod.DataSourceDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesDataSourceDisplayMod {
  
  @JSImport("cesium/Source/DataSources/DataSourceDisplay", JSImport.Default)
  @js.native
  open class default protected () extends DataSourceDisplay {
    def this(options: DataSourceCollection) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/DataSources/DataSourceDisplay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets the default function which creates an array of visualizers used for visualization.
      * By default, this function uses all standard visualizers.
      */
    inline def defaultVisualizersCallback(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultVisualizersCallback")().asInstanceOf[Unit]
  }
}
