package typingsJapgolly.enhancedResolve.syncAsyncFileSystemDecoratorMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncAsyncFileSystemDecorator extends js.Object {
  var fs: AbstractInputFileSystem
  var readFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]
  ] = js.undefined
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit], 
      Unit
    ]
  ] = js.undefined
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
  var stat: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit], 
      Unit
    ]
  ] = js.undefined
}

object SyncAsyncFileSystemDecorator {
  @scala.inline
  def apply(
    fs: AbstractInputFileSystem,
    readFile: (/* filename */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit]) => Callback = null,
    readJson: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit]) => Callback = null,
    readdir: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit]) => Callback = null,
    readlink: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit]) => Callback = null,
    stat: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]) => Callback = null
  ): SyncAsyncFileSystemDecorator = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction2((t0: /* filename */ java.lang.String, t1: /* callback */ js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* data */ js.UndefOr[typingsJapgolly.node.Buffer], 
  scala.Unit]) => readFile(t0, t1).runNow()))
    if (readJson != null) __obj.updateDynamic("readJson")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* data */ js.UndefOr[js.Any], 
  scala.Unit]) => readJson(t0, t1).runNow()))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* files */ js.UndefOr[js.Array[java.lang.String]], 
  scala.Unit]) => readdir(t0, t1).runNow()))
    if (readlink != null) __obj.updateDynamic("readlink")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* linkString */ js.UndefOr[java.lang.String], 
  scala.Unit]) => readlink(t0, t1).runNow()))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* stats */ js.UndefOr[typingsJapgolly.node.fsMod.Stats], 
  scala.Unit]) => stat(t0, t1).runNow()))
    __obj.asInstanceOf[SyncAsyncFileSystemDecorator]
  }
}

