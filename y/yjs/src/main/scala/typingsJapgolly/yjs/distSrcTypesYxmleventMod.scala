package typingsJapgolly.yjs

import typingsJapgolly.std.Set
import typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement
import typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment
import typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText
import typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
import typingsJapgolly.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmleventMod {
  
  @JSImport("yjs/dist/src/types/YXmlEvent", "YXmlEvent")
  @js.native
  open class YXmlEvent protected () extends YEvent[YXmlFragment | YXmlElement | YXmlText] {
    /**
      * @param {YXmlElement|YXmlText|YXmlFragment} target The target on which the event is created.
      * @param {Set<string|null>} subs The set of changed attributes. `null` is included if the
      *                   child list changed.
      * @param {Transaction} transaction The transaction instance with wich the
      *                                  change was created.
      */
    def this(target: YXmlElement, subs: Set[String | Null], transaction: Transaction) = this()
    def this(target: YXmlFragment, subs: Set[String | Null], transaction: Transaction) = this()
    def this(target: YXmlText, subs: Set[String | Null], transaction: Transaction) = this()
    
    /**
      * Set of all changed attributes.
      * @type {Set<string>}
      */
    var attributesChanged: Set[String] = js.native
    
    /**
      * Whether the children changed.
      * @type {Boolean}
      * @private
      */
    /* private */ var childListChanged: Any = js.native
  }
}
