package typingsJapgolly.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Manages image data._
  * @see https://docs.scriptable.app/image
  */
@JSGlobal("Image")
@js.native
open class Image ()
  extends StObject
     with typingsJapgolly.scriptableIos.Image {
  
  /**
    * _Size of the image in pixels._
    * @see https://docs.scriptable.app/image/#size
    */
  /* CompleteClass */
  var size: typingsJapgolly.scriptableIos.Size = js.native
}
object Image {
  
  @JSGlobal("Image")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Creates an image from raw data._
    *
    * Loads an image from the raw data. If the image could not be read, the function will return null.
    * @param data - Data to read image from.
    * @see https://docs.scriptable.app/image/#fromdata
    */
  /* static member */
  inline def fromData(data: typingsJapgolly.scriptableIos.Data): typingsJapgolly.scriptableIos.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.scriptableIos.Image]
  
  /**
    * _Creates an image from file._
    *
    * Loads an image from the specified file path. If the image could not be read, the function will return null.
    * @param filePath - File path to read image from.
    * @see https://docs.scriptable.app/image/#fromfile
    */
  /* static member */
  inline def fromFile(filePath: String): typingsJapgolly.scriptableIos.Image = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.scriptableIos.Image]
}
