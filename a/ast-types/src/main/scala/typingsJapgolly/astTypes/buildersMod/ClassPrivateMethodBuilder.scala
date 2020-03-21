package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonAbstractAccess
import typingsJapgolly.astTypes.astTypesStrings.constructor
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrivateNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPrivateMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPrivateMethodBuilder extends js.Object {
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: constructor): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: constructor,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: get): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: get,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: method): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: method,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def apply(key: PrivateNameKind, params: js.Array[PatternKind], body: BlockStatementKind, kind: set): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean
  ): ClassPrivateMethod = js.native
  def apply(
    key: PrivateNameKind,
    params: js.Array[PatternKind],
    body: BlockStatementKind,
    kind: set,
    computed: Boolean,
    staticParam: Boolean
  ): ClassPrivateMethod = js.native
  def from(params: AnonAbstractAccess): ClassPrivateMethod = js.native
}

