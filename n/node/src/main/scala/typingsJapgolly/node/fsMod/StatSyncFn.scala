package typingsJapgolly.node.fsMod

import typingsJapgolly.node.anon.StatSyncOptionsbigintbool
import typingsJapgolly.node.anon.StatSyncOptionsbigintfals
import typingsJapgolly.node.anon.StatSyncOptionsbigintfalsBigint
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrue
import typingsJapgolly.node.anon.StatSyncOptionsbiginttrueBigint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSyncFn
  extends js.Function {
  
  def apply(path: PathLike): Stats = js.native
  def apply(path: PathLike, options: Unit): Stats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
  def apply(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
  def apply(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
  def apply(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
  def apply(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
}
