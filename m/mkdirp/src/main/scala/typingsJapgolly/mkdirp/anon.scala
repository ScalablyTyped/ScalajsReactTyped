package typingsJapgolly.mkdirp

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecur
import typingsJapgolly.node.anon.MakeDirectoryOptionsrecurMode
import typingsJapgolly.node.anon.StatOptionsbigintfalseund
import typingsJapgolly.node.anon.StatOptionsbiginttrue
import typingsJapgolly.node.fsMod.BigIntStats
import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.Mode
import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.StatOptions
import typingsJapgolly.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait Typeofmkdir extends StObject {
    
    def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Null,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Unit, callback: NoParamCallback): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptionsrecur,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: MakeDirectoryOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: Mode,
      callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
    ): Unit = js.native
    def apply(path: PathLike, options: Mode, callback: NoParamCallback): Unit = js.native
  }
  
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
}
