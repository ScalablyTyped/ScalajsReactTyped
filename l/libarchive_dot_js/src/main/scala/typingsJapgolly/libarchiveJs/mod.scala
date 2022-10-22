package typingsJapgolly.libarchiveJs

import org.scalajs.dom.File
import typingsJapgolly.libarchiveJs.anon.WorkerUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("libarchive.js", "Archive")
  @js.native
  open class Archive protected ()
    extends typingsJapgolly.libarchiveJs.mainMod.Archive {
    def this(file: File, options: WorkerUrl) = this()
  }
  /* static members */
  object Archive {
    
    @JSImport("libarchive.js", "Archive")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[WorkerUrl]
    inline def init(options: WorkerUrl): WorkerUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[WorkerUrl]
    
    inline def open(file: File): js.Promise[typingsJapgolly.libarchiveJs.srcLibarchiveMod.Archive] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.libarchiveJs.srcLibarchiveMod.Archive]]
    inline def open(file: File, options: WorkerUrl): js.Promise[typingsJapgolly.libarchiveJs.srcLibarchiveMod.Archive] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.libarchiveJs.srcLibarchiveMod.Archive]]
  }
}
