package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object machineLearningMod {
  
  @JSImport("firebase-admin/machine-learning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/machine-learning", "MachineLearning")
  @js.native
  open class MachineLearning ()
    extends typingsJapgolly.firebaseAdmin.libMachineLearningMod.MachineLearning
  
  @JSImport("firebase-admin/machine-learning", "Model")
  @js.native
  open class Model ()
    extends typingsJapgolly.firebaseAdmin.libMachineLearningMod.Model
  /* static members */
  object Model {
    
    @JSImport("firebase-admin/machine-learning", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/machine-learning", "Model.validateAndClone")
    @js.native
    def validateAndClone: Any = js.native
    inline def validateAndClone_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateAndClone")(x.asInstanceOf[js.Any])
  }
  
  inline def getMachineLearning(): typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")().asInstanceOf[typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
  inline def getMachineLearning(app: App): typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
}
