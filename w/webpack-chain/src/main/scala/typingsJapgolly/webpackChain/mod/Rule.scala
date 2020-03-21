package typingsJapgolly.webpackChain.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.webpack.mod.Condition
import typingsJapgolly.webpackChain.webpackChainStrings.javascriptSlashauto
import typingsJapgolly.webpackChain.webpackChainStrings.javascriptSlashdynamic
import typingsJapgolly.webpackChain.webpackChainStrings.javascriptSlashesm
import typingsJapgolly.webpackChain.webpackChainStrings.json
import typingsJapgolly.webpackChain.webpackChainStrings.post
import typingsJapgolly.webpackChain.webpackChainStrings.pre
import typingsJapgolly.webpackChain.webpackChainStrings.webassemblySlashexperimental
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-chain", "Rule")
@js.native
class Rule[T] ()
  extends typingsJapgolly.webpackChain.mod._Config.TypedChainedMap[T, js.Any]
     with Orderable {
  var exclude: TypedChainedSet[this.type, Condition] = js.native
  var include: TypedChainedSet[this.type, Condition] = js.native
  var oneOfs: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
  var rules: TypedChainedMap[this.type, Rule[Rule[Module]]] = js.native
  var uses: TypedChainedMap[this.type, Use[Rule[Module]]] = js.native
  /* CompleteClass */
  override def after(name: String): this.type = js.native
  /* CompleteClass */
  override def before(name: String): this.type = js.native
  /* CompleteClass */
  override def end(): T = js.native
  @JSName("enforce")
  def enforce_post(value: post): this.type = js.native
  @JSName("enforce")
  def enforce_pre(value: pre): this.type = js.native
  def oneOf(name: String): Rule[Rule[Module]] = js.native
  def parser(value: StringDictionary[js.Any]): this.type = js.native
  def post(): this.type = js.native
  def pre(): this.type = js.native
  def resourceQuery(value: js.Array[Condition]): this.type = js.native
  def resourceQuery(value: Condition): this.type = js.native
  def rule(name: String): Rule[Rule[Module]] = js.native
  def test(value: js.Array[Condition]): this.type = js.native
  def test(value: Condition): this.type = js.native
  @JSName("type")
  def type_javascriptauto(value: javascriptSlashauto): this.type = js.native
  @JSName("type")
  def type_javascriptdynamic(value: javascriptSlashdynamic): this.type = js.native
  @JSName("type")
  def type_javascriptesm(value: javascriptSlashesm): this.type = js.native
  @JSName("type")
  def type_json(value: json): this.type = js.native
  @JSName("type")
  def type_webassemblyexperimental(value: webassemblySlashexperimental): this.type = js.native
  def use(name: String): Use[this.type] = js.native
}

