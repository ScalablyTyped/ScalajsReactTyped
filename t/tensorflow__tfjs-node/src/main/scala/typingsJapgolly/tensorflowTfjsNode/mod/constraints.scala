package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.MaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.MinMaxNormArgs
import typingsJapgolly.tensorflowTfjsLayers.distConstraintsMod.UnitNormArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraints {
  
  @JSImport("@tensorflow/tfjs-node", "constraints")
  @js.native
  val ^ : js.Any = js.native
  
  inline def maxNorm(args: MaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("maxNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def minMaxNorm(config: MinMaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("minMaxNorm")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  
  inline def nonNeg(): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNeg")().asInstanceOf[Constraint]
  
  inline def unitNorm(args: UnitNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("unitNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
}
