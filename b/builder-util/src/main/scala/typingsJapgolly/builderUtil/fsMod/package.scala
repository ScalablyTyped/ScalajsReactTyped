package typingsJapgolly.builderUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type AfterCopyFileTransformer = js.Function1[/* file */ java.lang.String, js.Promise[scala.Unit]]
  type FileTransformer = js.Function1[
    /* file */ java.lang.String, 
    (js.Promise[
      scala.Null | java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.builderUtil.fsMod.CopyFileTransformer
    ]) | scala.Null | java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.builderUtil.fsMod.CopyFileTransformer
  ]
  type Filter = js.Function2[
    /* file */ java.lang.String, 
    /* stat */ typingsJapgolly.fsExtra.mod.Stats, 
    scala.Boolean
  ]
}
