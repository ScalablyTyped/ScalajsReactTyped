package typingsJapgolly.yjs.distSrcInternalsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yjs/dist/src/internals", "Item")
@js.native
open class Item protected ()
  extends typingsJapgolly.yjs.distSrcStructsItemMod.Item {
  /**
    * @param {ID} id
    * @param {Item | null} left
    * @param {ID | null} origin
    * @param {Item | null} right
    * @param {ID | null} rightOrigin
    * @param {AbstractType<any>|ID|null} parent Is a type if integrated, is null if it is possible to copy parent from left or right, is ID before integration to search for it.
    * @param {string | null} parentSub
    * @param {AbstractContent} content
    */
  def this(
    id: typingsJapgolly.yjs.distSrcUtilsIDMod.ID,
    left: typingsJapgolly.yjs.distSrcStructsItemMod.Item | Null,
    origin: typingsJapgolly.yjs.distSrcUtilsIDMod.ID | Null,
    right: typingsJapgolly.yjs.distSrcStructsItemMod.Item | Null,
    rightOrigin: typingsJapgolly.yjs.distSrcUtilsIDMod.ID | Null,
    parent: typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType[Any] | typingsJapgolly.yjs.distSrcUtilsIDMod.ID | Null,
    parentSub: String | Null,
    content: typingsJapgolly.yjs.distSrcStructsItemMod.AbstractContent
  ) = this()
}
