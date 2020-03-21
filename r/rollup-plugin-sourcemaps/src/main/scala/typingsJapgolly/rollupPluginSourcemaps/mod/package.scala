package typingsJapgolly.rollupPluginSourcemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ReadFileCallback = js.Function2[
    /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
    /* data */ java.lang.String, 
    scala.Unit
  ]
  type ReadFileFunction = js.Function3[
    /* file */ java.lang.String | typingsJapgolly.node.Buffer | scala.Double, 
    /* encoding */ java.lang.String, 
    /* callback */ typingsJapgolly.rollupPluginSourcemaps.mod.ReadFileCallback, 
    scala.Unit
  ]
}
