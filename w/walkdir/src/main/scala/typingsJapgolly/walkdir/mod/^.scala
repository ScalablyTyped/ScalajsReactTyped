package typingsJapgolly.walkdir.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.walkdir.syncfalseWalkOptions
import typingsJapgolly.walkdir.synctruereturnobjectfalse
import typingsJapgolly.walkdir.synctruereturnobjecttrueW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walkdir/walkdir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(path: String): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkEventListener, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: WalkOptions): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: WalkOptions, eventListener: WalkEventListener): WalkEmitter | js.Array[String] | StringDictionary[Stats] = js.native
  def apply(path: String, options: syncfalseWalkOptions): WalkEmitter = js.native
  def apply(path: String, options: syncfalseWalkOptions, eventListener: WalkEventListener): WalkEmitter = js.native
  def apply(path: String, options: synctruereturnobjectfalse): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjectfalse, eventListener: WalkEventListener): js.Array[String] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW): StringDictionary[Stats] = js.native
  def apply(path: String, options: synctruereturnobjecttrueW, eventListener: WalkEventListener): StringDictionary[Stats] = js.native
}

