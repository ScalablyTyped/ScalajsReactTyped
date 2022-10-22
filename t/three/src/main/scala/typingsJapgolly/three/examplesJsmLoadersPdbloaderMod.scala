package typingsJapgolly.three

import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.three.anon.Atoms
import typingsJapgolly.three.srcThreeMod.BufferGeometry
import typingsJapgolly.three.srcThreeMod.Loader
import typingsJapgolly.three.srcThreeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersPdbloaderMod {
  
  @JSImport("three/examples/jsm/loaders/PDBLoader", "PDBLoader")
  @js.native
  open class PDBLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* pdb */ PDB, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* pdb */ PDB, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    def parse(text: String): PDB = js.native
  }
  
  trait PDB extends StObject {
    
    var geometryAtoms: BufferGeometry
    
    var geometryBonds: BufferGeometry
    
    var json: Atoms
  }
  object PDB {
    
    inline def apply(geometryAtoms: BufferGeometry, geometryBonds: BufferGeometry, json: Atoms): PDB = {
      val __obj = js.Dynamic.literal(geometryAtoms = geometryAtoms.asInstanceOf[js.Any], geometryBonds = geometryBonds.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[PDB]
    }
    
    extension [Self <: PDB](x: Self) {
      
      inline def setGeometryAtoms(value: BufferGeometry): Self = StObject.set(x, "geometryAtoms", value.asInstanceOf[js.Any])
      
      inline def setGeometryBonds(value: BufferGeometry): Self = StObject.set(x, "geometryBonds", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Atoms): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
}
