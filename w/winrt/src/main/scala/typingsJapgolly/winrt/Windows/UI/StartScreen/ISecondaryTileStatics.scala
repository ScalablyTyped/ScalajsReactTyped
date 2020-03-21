package typingsJapgolly.winrt.Windows.UI.StartScreen

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecondaryTileStatics extends js.Object {
  def exists(tileId: String): Boolean = js.native
  def findAllAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllForPackageAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
}

