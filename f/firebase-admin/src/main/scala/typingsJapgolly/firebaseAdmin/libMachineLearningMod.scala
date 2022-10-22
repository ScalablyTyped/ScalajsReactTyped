package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMod {
  
  @JSImport("firebase-admin/lib/machine-learning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/machine-learning", "MachineLearning")
  @js.native
  open class MachineLearning ()
    extends typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning
  
  @JSImport("firebase-admin/lib/machine-learning", "Model")
  @js.native
  open class Model ()
    extends typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.Model
  /* static members */
  object Model {
    
    @JSImport("firebase-admin/lib/machine-learning", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/machine-learning", "Model.validateAndClone")
    @js.native
    def validateAndClone: Any = js.native
    inline def validateAndClone_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateAndClone")(x.asInstanceOf[js.Any])
  }
  
  inline def getMachineLearning(): typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")().asInstanceOf[typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
  inline def getMachineLearning(app: App): typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
}
