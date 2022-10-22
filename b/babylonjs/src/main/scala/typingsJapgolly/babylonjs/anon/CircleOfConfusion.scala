package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.PostProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleOfConfusion extends StObject {
  
  var blurSteps: js.Array[PostProcess]
  
  var circleOfConfusion: PostProcess
}
object CircleOfConfusion {
  
  inline def apply(blurSteps: js.Array[PostProcess], circleOfConfusion: PostProcess): CircleOfConfusion = {
    val __obj = js.Dynamic.literal(blurSteps = blurSteps.asInstanceOf[js.Any], circleOfConfusion = circleOfConfusion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOfConfusion]
  }
  
  extension [Self <: CircleOfConfusion](x: Self) {
    
    inline def setBlurSteps(value: js.Array[PostProcess]): Self = StObject.set(x, "blurSteps", value.asInstanceOf[js.Any])
    
    inline def setBlurStepsVarargs(value: PostProcess*): Self = StObject.set(x, "blurSteps", js.Array(value*))
    
    inline def setCircleOfConfusion(value: PostProcess): Self = StObject.set(x, "circleOfConfusion", value.asInstanceOf[js.Any])
  }
}
