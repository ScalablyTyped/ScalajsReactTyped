package typingsJapgolly.forgeViewer.global.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  */
object ImageUtils {
  
  @JSGlobal("THREE.ImageUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("THREE.ImageUtils.crossOrigin")
  @js.native
  def crossOrigin: String = js.native
  inline def crossOrigin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crossOrigin")(x.asInstanceOf[js.Any])
  
  inline def loadTexture(url: String): typingsJapgolly.forgeViewer.THREE.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(
    url: String,
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(url: String, mapping: Unit, onLoad: Unit, onError: js.Function1[/* message */ String, Unit]): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(url: String, mapping: typingsJapgolly.forgeViewer.THREE.Mapping): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTexture(
    url: String,
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTexture")(url.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  
  inline def loadTextureCube(array: js.Array[String]): typingsJapgolly.forgeViewer.THREE.Texture = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: Unit,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(array: js.Array[String], mapping: typingsJapgolly.forgeViewer.THREE.Mapping): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: js.Function1[/* texture */ typingsJapgolly.forgeViewer.THREE.Texture, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
  inline def loadTextureCube(
    array: js.Array[String],
    mapping: typingsJapgolly.forgeViewer.THREE.Mapping,
    onLoad: Unit,
    onError: js.Function1[/* message */ String, Unit]
  ): typingsJapgolly.forgeViewer.THREE.Texture = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTextureCube")(array.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], onLoad.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.forgeViewer.THREE.Texture]
}
