package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.packagerMod.Packager
import typingsJapgolly.builderUtil.fsMod.Filter
import typingsJapgolly.fsExtra.mod.Stats
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/AppFileWalker", JSImport.Namespace)
@js.native
object appFileWalkerMod extends js.Object {
  @js.native
  abstract class FileCopyHelper protected () extends js.Object {
    protected def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any,
      filter: Null,
      packager: Packager
    ) = this()
    protected def this(
      matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any,
      filter: Filter,
      packager: Packager
    ) = this()
    val filter: Filter | Null = js.native
    var handleSymlink: js.Any = js.native
    val matcher: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileMatcher */ js.Any = js.native
    val metadata: Map[String, Stats] = js.native
    val packager: Packager = js.native
    /* protected */ def handleFile(file: String, parent: String, fileStat: Stats): (js.Promise[Stats | Null]) | Null = js.native
  }
  
}

