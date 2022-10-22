package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.DefaultColor
import typingsJapgolly.cesium.mod.Cesium3DTileset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCreateOsmBuildingsMod {
  
  @JSImport("cesium/Source/Scene/createOsmBuildings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Cesium3DTileset = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Cesium3DTileset]
  inline def default(options: DefaultColor): Cesium3DTileset = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Cesium3DTileset]
}
