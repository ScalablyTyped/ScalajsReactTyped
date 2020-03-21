package typingsJapgolly.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import typingsJapgolly.ecmarkup.biblioMod.BiblioEntry
import typingsJapgolly.ecmarkup.specMod.Spec
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/autolinker", JSImport.Namespace)
@js.native
object autolinkerMod extends js.Object {
  val NO_CLAUSE_AUTOLINK: Set[String] = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ js.Any,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: String,
    allowSameId: Boolean
  ): Unit = js.native
  def autolink(
    node: Node,
    replacer: js.RegExp,
    autolinkmap: AutoLinkMap,
    clause: Spec,
    currentId: Null,
    allowSameId: Boolean
  ): Unit = js.native
  def replacerForNamespace(
    namespace: String,
    biblio: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Biblio */ js.Any
  ): js.Tuple2[js.RegExp, AutoLinkMap] = js.native
  type AutoLinkMap = StringDictionary[BiblioEntry]
}

