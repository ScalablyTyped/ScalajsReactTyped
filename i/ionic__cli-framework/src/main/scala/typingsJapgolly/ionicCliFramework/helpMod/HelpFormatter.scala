package typingsJapgolly.ionicCliFramework.helpMod

import typingsJapgolly.ionicCliFramework.AnonColors
import typingsJapgolly.ionicCliFramework.colorsMod.Colors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", "HelpFormatter")
@js.native
abstract class HelpFormatter protected () extends js.Object {
  def this(hasColors: AnonColors) = this()
  val colors: Colors = js.native
  def format(): js.Promise[String] = js.native
}

