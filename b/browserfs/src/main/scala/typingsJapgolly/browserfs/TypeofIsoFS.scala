package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.isoFSMod.IsoFS
import typingsJapgolly.browserfs.isoFSMod.IsoFSOptions
import typingsJapgolly.browserfs.isoFSMod.default
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofIsoFS
  extends Instantiable1[/* data */ Buffer, default]
     with Instantiable2[/* data */ Buffer, /* name */ String, default]
     with Instantiable3[/* data */ Buffer, /* name */ String, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

