package typingsJapgolly.winrt.Windows.ApplicationModel.Background

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundExecutionManagerStatics extends js.Object {
  def getAccessStatus(): BackgroundAccessStatus = js.native
  def getAccessStatus(applicationId: String): BackgroundAccessStatus = js.native
  def removeAccess(): Unit = js.native
  def removeAccess(applicationId: String): Unit = js.native
  def requestAccessAsync(): IAsyncOperation[BackgroundAccessStatus] = js.native
  def requestAccessAsync(applicationId: String): IAsyncOperation[BackgroundAccessStatus] = js.native
}

