package typingsJapgolly.yeomanEnvironment.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.memFs.mod.Store
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Error
import typingsJapgolly.std.RegExp
import typingsJapgolly.yeomanEnvironment.TypeofGenerator
import typingsJapgolly.yeomanGenerator.mod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment[O /* <: Options */] extends EventEmitter {
  var aliases: js.Array[Alias] = js.native
  var arguments: js.Array[String] = js.native
  var cwd: String = js.native
  var lookups: js.Array[String] = js.native
  var options: O = js.native
  var sharedFs: Store = js.native
  var store: Storage = js.native
  /* private */ def _tryRegistering(generatorReference: String): Unit = js.native
  def alias(`match`: String, value: String): Unit = js.native
  def alias(`match`: RegExp, value: String): Unit = js.native
  def create(name: String, options: js.Object): Unit = js.native
  def error(err: js.Object): js.Error = js.native
  def error(err: Error): js.Error = js.native
  def findGeneratorsIn(list: js.Array[String]): js.Array[String] = js.native
  def get(namespace: String): typingsJapgolly.yeomanGenerator.mod.^  | Null = js.native
  def getByPath(path: String): typingsJapgolly.yeomanGenerator.mod.^  | Null = js.native
  def getGeneratorNames(): js.Array[String] = js.native
  def getGeneratorsMeta(): StringDictionary[GeneratorMeta] = js.native
  def getNpmPaths(): js.Array[String] = js.native
  def help(name: String): String = js.native
  def instantiate(name: String, options: InstantiateOptions): typingsJapgolly.yeomanGenerator.mod.^ = js.native
  def lookup(): Unit = js.native
  def lookup(cb: js.Function1[/* err */ Null | js.Error, Unit]): Unit = js.native
  def namespace(filepath: String): String = js.native
  def namespaces(): js.Array[String] = js.native
  def register(name: String): String = js.native
  def register(name: String, namespace: String): String = js.native
  def registerStub(
    generator: (Instantiable2[/* args */ String, /* options */ js.Object, typingsJapgolly.yeomanGenerator.mod.^]) with TypeofGenerator,
    namespace: String
  ): this.type = js.native
  def resolveModulePath(moduleId: String): String = js.native
  def run(args: String, done: RunDone): Unit = js.native
  def run(args: String, options: js.Object, done: RunDone): Unit = js.native
  def run(args: js.Array[String], done: RunDone): Unit = js.native
  def run(args: js.Array[String], options: js.Object, done: RunDone): Unit = js.native
  def run(done: RunDone): Unit = js.native
}

