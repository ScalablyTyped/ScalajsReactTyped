package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.dataview
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.function
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.generator
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.iterator
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.map
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.node
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.promise
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.proxy_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.set
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.string
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.typedarray
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.wasmvalue
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.weakset
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.webassemblymemory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPreview extends StObject {
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * List of the entries. Specified for `map` and `set` subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.undefined
  
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean
  
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview]
  
  /**
    * Object subtype hint. Specified for `object` type values only. (ObjectPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
  ] = js.undefined
  
  /**
    * Object type. (ObjectPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
}
object ObjectPreview {
  
  inline def apply(
    overflow: Boolean,
    properties: js.Array[PropertyPreview],
    `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
  ): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
  
  extension [Self <: ObjectPreview](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntries(value: js.Array[EntryPreview]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: EntryPreview*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[PropertyPreview]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: PropertyPreview*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
