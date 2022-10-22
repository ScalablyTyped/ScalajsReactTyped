package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.accessor
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

trait PropertyPreview extends StObject {
  
  /**
    * Property name.
    */
  var name: String
  
  /**
    * Object subtype hint. Specified for `object` type values only. (PropertyPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
  ] = js.undefined
  
  /**
    * Object type. Accessor means that the property itself is an accessor property. (PropertyPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint
  
  /**
    * User-friendly property value string.
    */
  var value: js.UndefOr[String] = js.undefined
  
  /**
    * Nested value preview.
    */
  var valuePreview: js.UndefOr[ObjectPreview] = js.undefined
}
object PropertyPreview {
  
  inline def apply(
    name: String,
    `type`: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint
  ): PropertyPreview = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyPreview]
  }
  
  extension [Self <: PropertyPreview](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: `object` | function | undefined | string | number | boolean | symbol | accessor | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValuePreview(value: ObjectPreview): Self = StObject.set(x, "valuePreview", value.asInstanceOf[js.Any])
    
    inline def setValuePreviewUndefined: Self = StObject.set(x, "valuePreview", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
