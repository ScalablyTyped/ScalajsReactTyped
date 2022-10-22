package typingsJapgolly.firebaseAdmin

import typingsJapgolly.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMachineLearningNamespaceMod {
  
  object machineLearning {
    
    inline def apply(): MachineLearning = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MachineLearning]
    inline def apply(app: App): MachineLearning = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[MachineLearning]
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning-namespace", "machineLearning")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#AutoMLTfliteModelOptions}.
      */
    type AutoMLTfliteModelOptions = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.AutoMLTfliteModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#GcsTfliteModelOptions}.
      */
    type GcsTfliteModelOptions = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.GcsTfliteModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ListModelsOptions}.
      */
    type ListModelsOptions = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ListModelsOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ListModelsResult}.
      */
    type ListModelsResult = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.ListModelsResult
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#MachineLearning}.
      */
    type MachineLearning = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#Model}.
      */
    type Model = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.Model
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ModelOptions}.
      */
    type ModelOptions = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ModelOptionsBase}.
      */
    type ModelOptionsBase = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptionsBase
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#TFLiteModel}.
      */
    type TFLiteModel = typingsJapgolly.firebaseAdmin.libMachineLearningMachineLearningMod.TFLiteModel
  }
}
