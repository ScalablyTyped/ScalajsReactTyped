package typingsJapgolly.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CommandRegistryListener[TargetType /* <: org.scalajs.dom.raw.EventTarget */] = typingsJapgolly.atom.AnonDescription[TargetType] | (js.Function1[
    /* event */ typingsJapgolly.atom.mod.CommandEvent[TargetType], 
    scala.Unit | js.Promise[scala.Unit]
  ])
  type FilesystemChange = (typingsJapgolly.atom.mod.FilesystemChangeBasic[
    typingsJapgolly.atom.atomStrings.created | typingsJapgolly.atom.atomStrings.modified | typingsJapgolly.atom.atomStrings.deleted
  ]) | typingsJapgolly.atom.mod.FilesystemChangeRename
  type FilesystemChangeEvent = js.Array[typingsJapgolly.atom.mod.FilesystemChange]
  type FocusableHTMLElement = org.scalajs.dom.raw.HTMLElement | java.lang.String | js.Function0[org.scalajs.dom.raw.HTMLElement]
  type PointCompatible = typingsJapgolly.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  type RangeCompatible = typingsJapgolly.atom.mod.RangeLike | (js.Tuple2[
    typingsJapgolly.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typingsJapgolly.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
  type TestRunner = js.Function1[/* params */ typingsJapgolly.atom.mod.TestRunnerParams, js.Promise[scala.Double]]
}
