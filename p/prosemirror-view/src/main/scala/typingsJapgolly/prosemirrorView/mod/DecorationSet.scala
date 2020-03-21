package typingsJapgolly.prosemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorTransform.mod.Mapping
import typingsJapgolly.prosemirrorView.AnonOnRemove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-view", "DecorationSet")
@js.native
class DecorationSet[S /* <: Schema[_, _] */] () extends js.Object {
  /**
    * Add the given array of decorations to the ones in the set,
    * producing a new set. Needs access to the current document to
    * create the appropriate tree structure.
    */
  def add(doc: Node[S], decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
  /**
    * Find all decorations in this set which touch the given range
    * (including decorations that start or end directly at the
    * boundaries) and match the given predicate on their spec. When
    * `start` and `end` are omitted, all decorations in the set are
    * considered. When `predicate` isn't given, all decorations are
    * assumed to match.
    */
  def find(): js.Array[Decoration[StringDictionary[_]]] = js.native
  def find(start: Double): js.Array[Decoration[StringDictionary[_]]] = js.native
  def find(start: Double, end: Double): js.Array[Decoration[StringDictionary[_]]] = js.native
  def find(start: Double, end: Double, predicate: js.Function1[/* spec */ StringDictionary[js.Any], Boolean]): js.Array[Decoration[StringDictionary[_]]] = js.native
  /**
    * Map the set of decorations in response to a change in the
    * document.
    */
  def map(mapping: Mapping, doc: Node[S]): DecorationSet[S] = js.native
  def map(mapping: Mapping, doc: Node[S], options: AnonOnRemove): DecorationSet[S] = js.native
  /**
    * Create a new set that contains the decorations in this set, minus
    * the ones in the given array.
    */
  def remove(decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
}

/* static members */
@JSImport("prosemirror-view", "DecorationSet")
@js.native
object DecorationSet extends js.Object {
  /**
    * The empty set of decorations.
    */
  var empty: DecorationSet[_] = js.native
  /**
    * Create a set of decorations, using the structure of the given
    * document.
    */
  def create[S /* <: Schema[_, _] */](doc: Node[S], decorations: js.Array[Decoration[StringDictionary[_]]]): DecorationSet[S] = js.native
}

