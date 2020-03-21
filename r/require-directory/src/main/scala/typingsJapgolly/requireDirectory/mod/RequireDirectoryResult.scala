package typingsJapgolly.requireDirectory.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequireDirectoryResult[T] extends /**
  * @description module itself or hash of modules in subdirectory with name of this directory
  */
/* index */ StringDictionary[RequireDirectoryResult[T] | T]

object RequireDirectoryResult {
  @scala.inline
  def apply[T](
    StringDictionary: /**
    * @description module itself or hash of modules in subdirectory with name of this directory
    */
  /* index */ StringDictionary[RequireDirectoryResult[T] | T] = null
  ): RequireDirectoryResult[T] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequireDirectoryResult[T]]
  }
}

