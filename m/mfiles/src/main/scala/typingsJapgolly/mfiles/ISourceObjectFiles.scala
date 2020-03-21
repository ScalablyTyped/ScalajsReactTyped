package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFiles extends js.Object {
  val Count: Double
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile
  def Item(Index: Double): ISourceObjectFile
  def Remove(Index: Double): Unit
}

object ISourceObjectFiles {
  @scala.inline
  def apply(
    Add: (Double, ISourceObjectFile) => Callback,
    AddEmptyFile: (String, String) => CallbackTo[ISourceObjectFile],
    AddFile: (String, String, String) => CallbackTo[ISourceObjectFile],
    Count: Double,
    Item: Double => CallbackTo[ISourceObjectFile],
    Remove: Double => Callback
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.updateDynamic("Add")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.mfiles.ISourceObjectFile) => Add(t0, t1).runNow()))
    __obj.updateDynamic("AddEmptyFile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => AddEmptyFile(t0, t1).runNow()))
    __obj.updateDynamic("AddFile")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => AddFile(t0, t1, t2).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("Remove")(js.Any.fromFunction1((t0: scala.Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ISourceObjectFiles]
  }
}

