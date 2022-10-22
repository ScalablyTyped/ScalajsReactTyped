package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.DefaultAvailability
import typingsJapgolly.cesium.mod.exportKmlResultKml
import typingsJapgolly.cesium.mod.exportKmlResultKmz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDataSourcesExportKmlMod {
  
  @JSImport("cesium/Source/DataSources/exportKml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: DefaultAvailability): js.Promise[exportKmlResultKml | exportKmlResultKmz] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[exportKmlResultKml | exportKmlResultKmz]]
}
