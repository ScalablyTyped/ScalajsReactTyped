package typingsJapgolly.ngCordova.ngCordova

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.cordovaPluginCamera.CameraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraService extends js.Object {
  def cleanup(): IPromise[Unit] = js.native
  def getPicture(): IPromise[String] = js.native
  def getPicture(options: CameraOptions): IPromise[String] = js.native
}

