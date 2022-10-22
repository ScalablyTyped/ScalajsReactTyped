package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.function
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
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.weakset
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebDriverValue extends StObject {
  
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    *  (WebDriverValueType enum)
    */
  var `type`: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
  
  var value: js.UndefOr[Any] = js.undefined
}
object WebDriverValue {
  
  inline def apply(
    `type`: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
  ): WebDriverValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebDriverValue]
  }
  
  extension [Self <: WebDriverValue](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setType(
      value: undefined | `null` | string | number | boolean | bigint | regexp | date | symbol | array | `object` | function | map | set | weakmap | weakset | error | proxy_ | promise | typedarray | arraybuffer | node | window
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
