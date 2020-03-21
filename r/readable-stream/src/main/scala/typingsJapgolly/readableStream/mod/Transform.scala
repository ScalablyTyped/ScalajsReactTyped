package typingsJapgolly.readableStream.mod

import typingsJapgolly.node.streamMod.TransformCallback
import typingsJapgolly.readableStream.AnonAfterTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
- typingsJapgolly.node.eventsMod.EventEmitter because Already inherited
- typingsJapgolly.node.NodeJS.EventEmitter because Already inherited
- typingsJapgolly.node.childProcessMod.StdioNull because Already inherited
- typingsJapgolly.node.streamMod.internal because Already inherited
- typingsJapgolly.node.NodeJS.ReadableStream because Already inherited
- typingsJapgolly.node.streamMod.Stream because Already inherited
- typingsJapgolly.node.streamMod.Readable because Already inherited
- typingsJapgolly.node.streamMod.Duplex because Already inherited
- typingsJapgolly.node.streamMod.Transform because Inheritance from two classes. Inlined _flush, _transform */ @JSImport("readable-stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(options: TransformOptions) = this()
  var _transformState: AnonAfterTransform = js.native
  def _flush(
    callback: (js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  def _transform(
    chunk: js.Any,
    encoding: String,
    callback: (js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
}

