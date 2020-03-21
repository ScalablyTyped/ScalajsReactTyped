package typingsJapgolly.rdfExt.prefixMapMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.NamedNode
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.Stream
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefixMap extends js.Object {
  var factory: DataFactory[Quad]
  var map: Record[String, NamedNode]
  def addAll(prefixes: PrefixesRecord): this.type
  def export(stream: Stream[Quad]): this.type
  def `import`(stream: Stream[Quad]): js.Promise[this.type]
  def resolve(curie: String): NamedNode
  def shrink(iri: String): NamedNode
}

object PrefixMap {
  @scala.inline
  def apply(
    addAll: PrefixesRecord => CallbackTo[PrefixMap],
    export: Stream[Quad] => CallbackTo[PrefixMap],
    factory: DataFactory[Quad],
    `import`: Stream[Quad] => CallbackTo[js.Promise[PrefixMap]],
    map: Record[String, NamedNode],
    resolve: String => CallbackTo[NamedNode],
    shrink: String => CallbackTo[NamedNode]
  ): PrefixMap = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.updateDynamic("addAll")(js.Any.fromFunction1((t0: typingsJapgolly.rdfExt.prefixMapMod.PrefixesRecord) => addAll(t0).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction1((t0: typingsJapgolly.rdfJs.mod.Stream[typingsJapgolly.rdfJs.mod.Quad]) => export(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: typingsJapgolly.rdfJs.mod.Stream[typingsJapgolly.rdfJs.mod.Quad]) => `import`(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: java.lang.String) => resolve(t0).runNow()))
    __obj.updateDynamic("shrink")(js.Any.fromFunction1((t0: java.lang.String) => shrink(t0).runNow()))
    __obj.asInstanceOf[PrefixMap]
  }
}

