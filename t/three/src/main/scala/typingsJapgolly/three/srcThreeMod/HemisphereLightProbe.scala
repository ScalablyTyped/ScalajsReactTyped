package typingsJapgolly.three.srcThreeMod

import typingsJapgolly.three.srcUtilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "HemisphereLightProbe")
@js.native
open class HemisphereLightProbe ()
  extends typingsJapgolly.three.srcLightsHemisphereLightProbeMod.HemisphereLightProbe {
  def this(skyColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation) = this()
  def this(skyColor: Unit, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: Unit, groundColor: ColorRepresentation, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: Unit, intensity: Double) = this()
  def this(skyColor: ColorRepresentation, groundColor: ColorRepresentation, intensity: Double) = this()
}
