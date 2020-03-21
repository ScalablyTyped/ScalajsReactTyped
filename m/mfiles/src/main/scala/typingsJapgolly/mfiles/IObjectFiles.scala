package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFiles extends js.Object {
  val Count: Double
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double
  def Item(Index: Double): IObjectFile
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit
  def ToJSON(): String
}

object IObjectFiles {
  @scala.inline
  def apply(
    Count: Double,
    GetObjectFileByNameForFileSystem: String => CallbackTo[IObjectFile],
    GetObjectFileIndexByNameForFileSystem: String => CallbackTo[Double],
    Item: Double => CallbackTo[IObjectFile],
    Sort: IObjectFileComparer => Callback,
    ToJSON: CallbackTo[String]
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("GetObjectFileByNameForFileSystem")(js.Any.fromFunction1((t0: java.lang.String) => GetObjectFileByNameForFileSystem(t0).runNow()))
    __obj.updateDynamic("GetObjectFileIndexByNameForFileSystem")(js.Any.fromFunction1((t0: java.lang.String) => GetObjectFileIndexByNameForFileSystem(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Sort")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjectFileComparer) => Sort(t0).runNow()))
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IObjectFiles]
  }
}

