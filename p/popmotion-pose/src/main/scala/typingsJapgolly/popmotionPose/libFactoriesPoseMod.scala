package typingsJapgolly.popmotionPose

import typingsJapgolly.popmotionPose.libTypesMod.PopmotionPoserFactoryConfig
import typingsJapgolly.popmotionPose.libTypesMod.TransitionDefinition
import typingsJapgolly.popmotionPose.libTypesMod.Value
import typingsJapgolly.poseCore.libTypesMod.Poser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesPoseMod {
  
  @JSImport("popmotion-pose/lib/factories/pose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserConfig<Value> */ /* config */ Any, 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_lib.PoserConfig<Value> */ /* config */ Any, 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ Any, 
      P
    ]
  ]]
}
