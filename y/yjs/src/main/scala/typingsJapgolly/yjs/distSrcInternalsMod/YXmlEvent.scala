package typingsJapgolly.yjs.distSrcInternalsMod

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "YXmlEvent")
@js.native
open class YXmlEvent protected ()
  extends typingsJapgolly.yjs.distSrcTypesYxmleventMod.YXmlEvent {
  /**
    * @param {YXmlElement|YXmlText|YXmlFragment} target The target on which the event is created.
    * @param {Set<string|null>} subs The set of changed attributes. `null` is included if the
    *                   child list changed.
    * @param {Transaction} transaction The transaction instance with wich the
    *                                  change was created.
    */
  def this(
    target: typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement,
    subs: Set[String | Null],
    transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
  def this(
    target: typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment,
    subs: Set[String | Null],
    transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
  def this(
    target: typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText,
    subs: Set[String | Null],
    transaction: typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
  ) = this()
}
