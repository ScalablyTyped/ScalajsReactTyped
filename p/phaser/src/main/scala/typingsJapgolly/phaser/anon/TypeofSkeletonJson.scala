package typingsJapgolly.phaser.anon

import typingsJapgolly.phaser.spine.BlendMode
import typingsJapgolly.phaser.spine.PositionMode
import typingsJapgolly.phaser.spine.RotateMode
import typingsJapgolly.phaser.spine.SpacingMode
import typingsJapgolly.phaser.spine.TransformMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSkeletonJson extends StObject {
  
  /* static member */
  def blendModeFromString(str: String): BlendMode
  
  /* static member */
  def positionModeFromString(str: String): PositionMode
  
  /* static member */
  def rotateModeFromString(str: String): RotateMode
  
  /* static member */
  def spacingModeFromString(str: String): SpacingMode
  
  /* static member */
  def transformModeFromString(str: String): TransformMode
}
object TypeofSkeletonJson {
  
  inline def apply(
    blendModeFromString: String => BlendMode,
    positionModeFromString: String => PositionMode,
    rotateModeFromString: String => RotateMode,
    spacingModeFromString: String => SpacingMode,
    transformModeFromString: String => TransformMode
  ): TypeofSkeletonJson = {
    val __obj = js.Dynamic.literal(blendModeFromString = js.Any.fromFunction1(blendModeFromString), positionModeFromString = js.Any.fromFunction1(positionModeFromString), rotateModeFromString = js.Any.fromFunction1(rotateModeFromString), spacingModeFromString = js.Any.fromFunction1(spacingModeFromString), transformModeFromString = js.Any.fromFunction1(transformModeFromString))
    __obj.asInstanceOf[TypeofSkeletonJson]
  }
  
  extension [Self <: TypeofSkeletonJson](x: Self) {
    
    inline def setBlendModeFromString(value: String => BlendMode): Self = StObject.set(x, "blendModeFromString", js.Any.fromFunction1(value))
    
    inline def setPositionModeFromString(value: String => PositionMode): Self = StObject.set(x, "positionModeFromString", js.Any.fromFunction1(value))
    
    inline def setRotateModeFromString(value: String => RotateMode): Self = StObject.set(x, "rotateModeFromString", js.Any.fromFunction1(value))
    
    inline def setSpacingModeFromString(value: String => SpacingMode): Self = StObject.set(x, "spacingModeFromString", js.Any.fromFunction1(value))
    
    inline def setTransformModeFromString(value: String => TransformMode): Self = StObject.set(x, "transformModeFromString", js.Any.fromFunction1(value))
  }
}
