package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemovedFiles extends js.Object {
  var removedFiles: js.Array[String]
  var results: js.Array[Diagnostic]
  var updatedFiles: js.Array[String]
}

object AnonRemovedFiles {
  @scala.inline
  def apply(removedFiles: js.Array[String], results: js.Array[Diagnostic], updatedFiles: js.Array[String]): AnonRemovedFiles = {
    val __obj = js.Dynamic.literal(removedFiles = removedFiles.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], updatedFiles = updatedFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRemovedFiles]
  }
}

