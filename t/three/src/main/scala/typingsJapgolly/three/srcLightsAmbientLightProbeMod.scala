package typingsJapgolly.three

import typingsJapgolly.three.srcLightsLightProbeMod.LightProbe
import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import typingsJapgolly.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsAmbientLightProbeMod {
  
  @JSImport("three/src/lights/AmbientLightProbe", "AmbientLightProbe")
  @js.native
  open class AmbientLightProbe () extends LightProbe {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    val isAmbientLightProbe: `true` = js.native
  }
}
