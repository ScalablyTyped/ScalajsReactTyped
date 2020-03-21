package typingsJapgolly.webpackWatchedGlobEntriesPlugin.mod

import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.std.Record
import typingsJapgolly.webpack.mod.EntryFunc
import typingsJapgolly.webpack.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
class ^ () extends Plugin

@JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getEntries(globs: js.Array[String]): EntryFunc = js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions): EntryFunc = js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions, pluginOptions: PluginOptions): EntryFunc = js.native
  def getFiles(globString: String): Record[String, String] = js.native
  def getFiles(globString: String, globOptions: IOptions): Record[String, String] = js.native
  def getFiles(globString: String, globOptions: IOptions, basename_as_entry_name: Boolean): Record[String, String] = js.native
}

