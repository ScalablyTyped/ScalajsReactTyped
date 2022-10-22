package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import typingsJapgolly.three.srcThreeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersColladaLoaderMod {
  
  @JSImport("three/examples/jsm/loaders/ColladaLoader", "ColladaLoader")
  @js.native
  open class ColladaLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* collada */ Collada, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* collada */ Collada, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* collada */ Collada, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* collada */ Collada, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(text: String, path: String): Collada = js.native
  }
  
  trait Collada extends StObject {
    
    var kinematics: js.Object
    
    var library: js.Object
    
    var scene: Scene
  }
  object Collada {
    
    inline def apply(kinematics: js.Object, library: js.Object, scene: Scene): Collada = {
      val __obj = js.Dynamic.literal(kinematics = kinematics.asInstanceOf[js.Any], library = library.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collada]
    }
    
    extension [Self <: Collada](x: Self) {
      
      inline def setKinematics(value: js.Object): Self = StObject.set(x, "kinematics", value.asInstanceOf[js.Any])
      
      inline def setLibrary(value: js.Object): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
}
