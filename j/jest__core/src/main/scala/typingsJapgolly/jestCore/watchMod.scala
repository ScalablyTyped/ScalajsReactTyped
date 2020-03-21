package typingsJapgolly.jestCore

import typingsJapgolly.jestCore.typesMod.Filter
import typingsJapgolly.jestHasteMap.mod.^
import typingsJapgolly.jestRuntime.mod.Context
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import typingsJapgolly.node.processMod._Global_.NodeJS.ReadStream
import typingsJapgolly.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/watch", JSImport.Namespace)
@js.native
object watchMod extends js.Object {
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^]
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any,
    filter: Filter
  ): js.Promise[Unit] = js.native
}

