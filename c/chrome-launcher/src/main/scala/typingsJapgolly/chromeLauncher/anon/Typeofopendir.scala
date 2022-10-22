package typingsJapgolly.chromeLauncher.anon

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Dir
import typingsJapgolly.node.fsMod.OpenDirOptions
import typingsJapgolly.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofopendir extends StObject {
  
  def apply(path: PathLike, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
  ): Unit = js.native
}
