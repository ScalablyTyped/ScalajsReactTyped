package typingsJapgolly.ionicUtilsFs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileTreeOptions[RE, DE] extends js.Object {
  /**
    * Called whenever a directory node is added to the tree.
    *
    * Directory nodes can be supplemented by returning a new object from this
    * function.
    */
  val onDirectoryNode: js.UndefOr[js.Function1[/* node */ DirectoryNode, DirectoryNode with DE]] = js.undefined
  /**
    * Called whenever an error occurs during the walk process.
    *
    * If excluded, the function will throw an error when first encountered.
    */
  val onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  /**
    * Called whenever a file node is added to the tree.
    *
    * File nodes can be supplemented by returning a new object from this
    * function.
    */
  val onFileNode: js.UndefOr[js.Function1[/* node */ RegularFileNode, RegularFileNode with RE]] = js.undefined
  val walkerOptions: js.UndefOr[WalkerOptions] = js.undefined
}

object GetFileTreeOptions {
  @scala.inline
  def apply[RE, DE](
    onDirectoryNode: /* node */ DirectoryNode => CallbackTo[DirectoryNode with DE] = null,
    onError: /* err */ js.Error => Callback = null,
    onFileNode: /* node */ RegularFileNode => CallbackTo[RegularFileNode with RE] = null,
    walkerOptions: WalkerOptions = null
  ): GetFileTreeOptions[RE, DE] = {
    val __obj = js.Dynamic.literal()
    if (onDirectoryNode != null) __obj.updateDynamic("onDirectoryNode")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.ionicUtilsFs.mod.DirectoryNode) => onDirectoryNode(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()))
    if (onFileNode != null) __obj.updateDynamic("onFileNode")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.ionicUtilsFs.mod.RegularFileNode) => onFileNode(t0).runNow()))
    if (walkerOptions != null) __obj.updateDynamic("walkerOptions")(walkerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileTreeOptions[RE, DE]]
  }
}

