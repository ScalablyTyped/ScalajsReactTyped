package typingsJapgolly.tensorflowTfjsNode.mod

import typingsJapgolly.tensorflowTfjsLayers.initializersMod.ConstantArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.IdentityArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.Initializer
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.OrthogonalArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.RandomNormalArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.RandomUniformArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.SeedOnlyInitializerArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.TruncatedNormalArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.VarianceScalingArgs
import typingsJapgolly.tensorflowTfjsLayers.initializersMod.Zeros
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "initializers")
@js.native
object initializers extends js.Object {
  def constant(args: ConstantArgs): Initializer = js.native
  def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def identity(args: IdentityArgs): Initializer = js.native
  def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
  def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
  def ones(): Initializer = js.native
  def orthogonal(args: OrthogonalArgs): Initializer = js.native
  def randomNormal(args: RandomNormalArgs): Initializer = js.native
  def randomUniform(args: RandomUniformArgs): Initializer = js.native
  def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
  def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
  def zeros(): Zeros = js.native
}

