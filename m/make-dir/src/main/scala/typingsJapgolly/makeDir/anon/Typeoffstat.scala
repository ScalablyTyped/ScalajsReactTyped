package typingsJapgolly.makeDir.anon

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.anon.StatOptionsbigintfalseund
import typingsJapgolly.node.anon.StatOptionsbiginttrue
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.StatOptions
import typingsJapgolly.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffstat extends StObject {
  
  def apply(fd: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def apply(
    fd: Double,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, BigIntStats | Stats, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    options: StatOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
  ): Unit = js.native
}
