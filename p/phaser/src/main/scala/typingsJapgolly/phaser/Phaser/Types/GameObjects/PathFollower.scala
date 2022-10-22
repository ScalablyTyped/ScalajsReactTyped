package typingsJapgolly.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PathFollower {
  
  /**
    * Settings for a PathFollower.
    */
  trait PathConfig extends StObject {
    
    /**
      * The duration of the path follow in ms. Must be `> 0`.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * The start position of the path follow, between 0 and 1. Must be less than `to`.
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to position the PathFollower on the Path using its path offset.
      */
    var positionOnPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the PathFollower automatically rotate to point in the direction of the Path?
      */
    var rotateToPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the PathFollower is rotating to match the Path, this value is added to the rotation value. This allows you to rotate objects to a path but control the angle of the rotation as well.
      */
    var rotationOffset: js.UndefOr[Double] = js.undefined
    
    /**
      * Current start position of the path follow, must be between `from` and `to`.
      */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /**
      * The end position of the path follow, between 0 and 1. Must be more than `from`.
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object PathConfig {
    
    inline def apply(): PathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfig]
    }
    
    extension [Self <: PathConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setPositionOnPath(value: Boolean): Self = StObject.set(x, "positionOnPath", value.asInstanceOf[js.Any])
      
      inline def setPositionOnPathUndefined: Self = StObject.set(x, "positionOnPath", js.undefined)
      
      inline def setRotateToPath(value: Boolean): Self = StObject.set(x, "rotateToPath", value.asInstanceOf[js.Any])
      
      inline def setRotateToPathUndefined: Self = StObject.set(x, "rotateToPath", js.undefined)
      
      inline def setRotationOffset(value: Double): Self = StObject.set(x, "rotationOffset", value.asInstanceOf[js.Any])
      
      inline def setRotationOffsetUndefined: Self = StObject.set(x, "rotationOffset", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
