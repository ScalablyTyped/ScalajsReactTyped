package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectComparer
import typingsJapgolly.mfiles.IObjectSearchResults
import typingsJapgolly.mfiles.IObjectVersion
import typingsJapgolly.mfiles.IObjectVersions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectSearchResults")
@js.native
class ObjectSearchResults () extends IObjectSearchResults {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val MoreResults: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IObjectSearchResults = js.native
  /* CompleteClass */
  override def GetAsObjectVersions(): IObjectVersions = js.native
  /* CompleteClass */
  override def GetScoreOfObject(ObjVer: IObjVer): Double = js.native
  /* CompleteClass */
  override def Item(Index: Double): IObjectVersion = js.native
  /* CompleteClass */
  override def ScoreAt(Index: Double): Double = js.native
  /* CompleteClass */
  override def Sort(ObjectComparer: IObjectComparer): Unit = js.native
  /* CompleteClass */
  override def SortByScore(Ascending: Boolean): Unit = js.native
}

@JSGlobal("MFiles.ObjectSearchResults")
@js.native
object ObjectSearchResults extends Instantiable0[IObjectSearchResults]

