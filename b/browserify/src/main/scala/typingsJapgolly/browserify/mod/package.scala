package typingsJapgolly.browserify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
  // for each file in a bundle.
  type InputFile = java.lang.String | typingsJapgolly.node.NodeJS.ReadableStream | typingsJapgolly.browserify.mod.FileOptions
}
