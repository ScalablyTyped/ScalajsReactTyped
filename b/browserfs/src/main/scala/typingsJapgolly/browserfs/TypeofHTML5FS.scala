package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.html5fsMod.HTML5FS
import typingsJapgolly.browserfs.html5fsMod.HTML5FSOptions
import typingsJapgolly.browserfs.html5fsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHTML5FS
  extends Instantiable0[default]
     with Instantiable1[/* size */ Double, default]
     with Instantiable2[/* size */ Double, /* type */ Double, default]
     with Instantiable3[/* size */ Double, /* type */ Double, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an HTML5FS instance with the given options.
    */
  def Create(opts: HTML5FSOptions, cb: BFSCallback[HTML5FS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

