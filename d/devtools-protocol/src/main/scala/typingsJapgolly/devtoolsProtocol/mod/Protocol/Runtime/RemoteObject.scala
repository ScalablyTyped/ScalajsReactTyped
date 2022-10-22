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

trait RemoteObject extends StObject {
  
  /**
    * Object class (constructor) name. Specified for `object` type values only.
    */
  var className: js.UndefOr[String] = js.undefined
  
  var customPreview: js.UndefOr[CustomPreview] = js.undefined
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Preview containing abbreviated property values. Specified for `object` type values only.
    */
  var preview: js.UndefOr[ObjectPreview] = js.undefined
  
  /**
    * Object subtype hint. Specified for `object` type values only.
    * NOTE: If you change anything here, make sure to also update
    * `subtype` in `ObjectPreview` and `PropertyPreview` below. (RemoteObjectSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
  ] = js.undefined
  
  /**
    * Object type. (RemoteObjectType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
  
  /**
    * Primitive value which can not be JSON-stringified does not have `value`, but gets this
    * property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * WebDriver BiDi representation of the value.
    */
  var webDriverValue: js.UndefOr[WebDriverValue] = js.undefined
}
object RemoteObject {
  
  inline def apply(`type`: `object` | function | undefined | string | number | boolean | symbol | bigint): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
  
  extension [Self <: RemoteObject](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCustomPreview(value: CustomPreview): Self = StObject.set(x, "customPreview", value.asInstanceOf[js.Any])
    
    inline def setCustomPreviewUndefined: Self = StObject.set(x, "customPreview", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPreview(value: ObjectPreview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | webassemblymemory | wasmvalue
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnserializableValue(value: UnserializableValue): Self = StObject.set(x, "unserializableValue", value.asInstanceOf[js.Any])
    
    inline def setUnserializableValueUndefined: Self = StObject.set(x, "unserializableValue", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWebDriverValue(value: WebDriverValue): Self = StObject.set(x, "webDriverValue", value.asInstanceOf[js.Any])
    
    inline def setWebDriverValueUndefined: Self = StObject.set(x, "webDriverValue", js.undefined)
  }
}
