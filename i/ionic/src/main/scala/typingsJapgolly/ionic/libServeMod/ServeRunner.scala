package typingsJapgolly.ionic.libServeMod

import typingsJapgolly.ionic.PartialCommandMetadata
import typingsJapgolly.ionic.definitionsMod.DevAppDetails
import typingsJapgolly.ionic.definitionsMod.LabServeDetails
import typingsJapgolly.ionic.definitionsMod.Runner
import typingsJapgolly.ionic.definitionsMod.ServeDetails
import typingsJapgolly.ionic.definitionsMod.ServeOptions
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import typingsJapgolly.ionicUtilsNetwork.mod.NetworkInterface
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/serve", "ServeRunner")
@js.native
abstract class ServeRunner[T /* <: ServeOptions */] () extends Runner[T, ServeDetails] {
  var devAppConnectionMade: Boolean = js.native
  val e: ServeRunnerDeps = js.native
  def afterServe(options: T, details: ServeDetails): js.Promise[Unit] = js.native
  def beforeServe(options: T): js.Promise[Unit] = js.native
  def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): ServeOptions = js.native
  def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
  def displayDevAppMessage(options: T): js.Promise[Unit] = js.native
  def gatherDevAppDetails(options: T, details: ServeDetails): js.Promise[js.UndefOr[DevAppDetails]] = js.native
  def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
  def getPkgManagerServeCLI(): PkgManagerServeCLI = js.native
  def getSupportedDevAppPlugins(): js.Promise[Set[String]] = js.native
  def getUsedPorts(options: T, details: ServeDetails): js.Array[Double] = js.native
  def modifyOpenUrl(url: String, options: T): String = js.native
  def publishDevApp(options: T, details: DevAppDetails): js.Promise[js.UndefOr[String]] = js.native
  /* CompleteClass */
  override def run(options: T): js.Promise[ServeDetails] = js.native
  def runLab(options: T, serveDetails: ServeDetails): js.Promise[LabServeDetails] = js.native
  def scheduleAfterServe(options: T, details: ServeDetails): Unit = js.native
  def selectExternalIP(options: T): js.Promise[js.Tuple2[String, js.Array[NetworkInterface]]] = js.native
  def serveProject(options: T): js.Promise[ServeDetails] = js.native
}

