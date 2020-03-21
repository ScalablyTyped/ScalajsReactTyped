package typingsJapgolly.kurentoClient.mod.KurentoClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaObject extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var tags: js.Object = js.native
  def addTag(key: String, value: String): js.Promise[Unit] = js.native
  def addTag(key: String, value: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def getChildren(): js.Promise[js.Array[MediaObject]] = js.native
  def getChildren(callback: Callback[js.Array[MediaObject]]): js.Promise[js.Array[MediaObject]] = js.native
  def getCreationTime(): js.Promise[Double] = js.native
  def getCreationTime(callback: Callback[Double]): js.Promise[Double] = js.native
  def getMediaPipeline(): js.Promise[MediaPipeline] = js.native
  def getMediaPipeline(callback: Callback[MediaPipeline]): js.Promise[MediaPipeline] = js.native
  def getName(): js.Promise[String] = js.native
  def getName(callback: Callback[String]): js.Promise[String] = js.native
  def getParent(): js.Promise[MediaObject] = js.native
  def getParent(callback: Callback[MediaObject]): js.Promise[MediaObject] = js.native
  def getTag(key: String): js.Promise[String] = js.native
  def getTag(key: String, callback: Callback[String]): js.Promise[String] = js.native
  def getTags(): js.Promise[js.Array[Tag]] = js.native
  def getTags(callback: Callback[js.Array[Tag]]): js.Promise[js.Array[Tag]] = js.native
  def removeTag(key: String): js.Promise[Unit] = js.native
  def removeTag(key: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  def setName(name: String): js.Promise[Unit] = js.native
  def setName(name: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
}

