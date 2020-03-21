package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IObjectFile
import typingsJapgolly.mfiles.IObjectFileComparer
import typingsJapgolly.mfiles.IObjectFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectFiles")
@js.native
class ObjectFiles () extends IObjectFiles {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile = js.native
  /* CompleteClass */
  override def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IObjectFile = js.native
  /* CompleteClass */
  override def Sort(ObjectFileComparer: IObjectFileComparer): Unit = js.native
  /* CompleteClass */
  override def ToJSON(): String = js.native
}

@JSGlobal("MFiles.ObjectFiles")
@js.native
object ObjectFiles extends Instantiable0[IObjectFiles]

