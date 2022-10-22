package typingsJapgolly.babylonjs.miscIndexMod

import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "LoadFileError")
@js.native
open class LoadFileError protected ()
  extends typingsJapgolly.babylonjs.miscFileToolsMod.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param object defines the optional web request
    */
  def this(message: String) = this()
  def this(message: String, `object`: File) = this()
  def this(message: String, `object`: typingsJapgolly.babylonjs.miscWebRequestMod.WebRequest) = this()
}
