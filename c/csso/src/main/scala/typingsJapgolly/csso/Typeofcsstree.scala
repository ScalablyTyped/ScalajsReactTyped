package typingsJapgolly.csso

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.cssTree.mod.CssNode
import typingsJapgolly.cssTree.mod.CssNodePlain
import typingsJapgolly.cssTree.mod.EnterOrLeaveFn
import typingsJapgolly.cssTree.mod.FindFn
import typingsJapgolly.cssTree.mod.GenerateOptions
import typingsJapgolly.cssTree.mod.Keyword_
import typingsJapgolly.cssTree.mod.ParseOptions
import typingsJapgolly.cssTree.mod.Property_
import typingsJapgolly.cssTree.mod.WalkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcsstree extends js.Object {
  var List: Instantiable0[typingsJapgolly.cssTree.mod.List[js.Object]] = js.native
  def clone(node: CssNode): CssNode = js.native
  def find(ast: CssNode, fn: FindFn): CssNode = js.native
  def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = js.native
  def findLast(ast: CssNode, fn: FindFn): CssNode = js.native
  def fromPlainObject(node: CssNodePlain): CssNode = js.native
  def generate(ast: CssNode): String = js.native
  def generate(ast: CssNode, options: GenerateOptions): String = js.native
  def keyword(value: String): Keyword_ = js.native
  def parse(text: String): CssNode = js.native
  def parse(text: String, options: ParseOptions): CssNode = js.native
  def property(value: String): Property_ = js.native
  def toPlainObject(node: CssNode): CssNodePlain = js.native
  def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = js.native
  def walk(ast: CssNode, options: WalkOptions): Unit = js.native
}

