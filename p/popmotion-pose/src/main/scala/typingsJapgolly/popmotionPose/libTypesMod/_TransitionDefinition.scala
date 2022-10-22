package typingsJapgolly.popmotionPose.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _TransitionDefinition extends StObject
object _TransitionDefinition {
  
  inline def DecayDefinition(ease: Unit): typingsJapgolly.popmotionPose.libTypesMod.DecayDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("decay")
    __obj.asInstanceOf[typingsJapgolly.popmotionPose.libTypesMod.DecayDefinition]
  }
  
  inline def KeyframesDefinition(): typingsJapgolly.popmotionPose.libTypesMod.KeyframesDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("keyframes")
    __obj.asInstanceOf[typingsJapgolly.popmotionPose.libTypesMod.KeyframesDefinition]
  }
  
  inline def PhysicsDefinition(ease: Unit): typingsJapgolly.popmotionPose.libTypesMod.PhysicsDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("physics")
    __obj.asInstanceOf[typingsJapgolly.popmotionPose.libTypesMod.PhysicsDefinition]
  }
  
  inline def SpringDefinition(ease: Unit): typingsJapgolly.popmotionPose.libTypesMod.SpringDefinition = {
    val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("spring")
    __obj.asInstanceOf[typingsJapgolly.popmotionPose.libTypesMod.SpringDefinition]
  }
}
