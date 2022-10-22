package typingsJapgolly.tsconfigPathsWebpackPlugin.anon

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.anon.StatOptionsbigintfalseund
import typingsJapgolly.node.anon.StatOptionsbiginttrue
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StatOptions
import typingsJapgolly.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofstat extends StObject {
  
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, BigIntStats | Stats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
  ): Unit = js.native
}
