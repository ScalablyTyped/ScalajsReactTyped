package typingsJapgolly.winrt.Windows.UI.StartScreen

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
class SecondaryTile () extends ISecondaryTile {
  def this(tileId: String) = this()
  def this(
    tileId: String,
    shortName: String,
    displayName: String,
    args: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ) = this()
  def this(
    tileId: String,
    shortName: String,
    displayName: String,
    args: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ) = this()
}

/* static members */
@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
object SecondaryTile extends js.Object {
  def exists(tileId: String): Boolean = js.native
  def findAllAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllForPackageAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
}

