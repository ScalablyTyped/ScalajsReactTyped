package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.srcThreeMod.AnimationClip
import typingsJapgolly.three.srcThreeMod.BufferAttribute
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersMddloaderMod {
  
  @JSImport("three/examples/jsm/loaders/MDDLoader", "MDDLoader")
  @js.native
  open class MDDLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* result */ MDD, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ MDD, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ MDD, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ MDD, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(data: js.typedarray.ArrayBuffer): MDD = js.native
  }
  
  trait MDD extends StObject {
    
    var clip: AnimationClip
    
    var morphTargets: js.Array[BufferAttribute]
  }
  object MDD {
    
    inline def apply(clip: AnimationClip, morphTargets: js.Array[BufferAttribute]): MDD = {
      val __obj = js.Dynamic.literal(clip = clip.asInstanceOf[js.Any], morphTargets = morphTargets.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDD]
    }
    
    extension [Self <: MDD](x: Self) {
      
      inline def setClip(value: AnimationClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setMorphTargets(value: js.Array[BufferAttribute]): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
      
      inline def setMorphTargetsVarargs(value: BufferAttribute*): Self = StObject.set(x, "morphTargets", js.Array(value*))
    }
  }
}
