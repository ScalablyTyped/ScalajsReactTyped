package typingsJapgolly.resolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Callback invoked when checking if a file or directory exists
    *
    * @param error
    * @param exists If the given file or directory exists
    */
  type existsCallback = js.Function2[/* err */ js.Error | scala.Null, /* isFile */ js.UndefOr[scala.Boolean], scala.Unit]
  /**
    * Callback invoked when reading a file
    *
    * @param error
    * @param isFile If the given file exists
    */
  type readFileCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsJapgolly.node.Buffer], 
    scala.Unit
  ]
  /**
    * Callback invoked when resolving asynchronously
    *
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type resolveCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    /* pkg */ js.UndefOr[typingsJapgolly.resolve.mod.PackageMeta], 
    scala.Unit
  ]
}
