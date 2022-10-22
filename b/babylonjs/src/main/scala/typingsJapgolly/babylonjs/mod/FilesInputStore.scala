package typingsJapgolly.babylonjs.mod

import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FilesInputStore")
@js.native
open class FilesInputStore ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.FilesInputStore
/* static members */
object FilesInputStore {
  
  @JSImport("babylonjs", "FilesInputStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of files ready to be loaded
    */
  @JSImport("babylonjs", "FilesInputStore.FilesToLoad")
  @js.native
  def FilesToLoad: org.scalablytyped.runtime.StringDictionary[File] = js.native
  inline def FilesToLoad_=(x: org.scalablytyped.runtime.StringDictionary[File]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FilesToLoad")(x.asInstanceOf[js.Any])
}
