package typingsJapgolly.videoReact.mod

import typingsJapgolly.videoReact.videoReactInts.`10`
import typingsJapgolly.videoReact.videoReactInts.`30`
import typingsJapgolly.videoReact.videoReactInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardControlProps extends StObject {
  
  /**
    * How many seconds to go forward, default: `10`
    */
  var seconds: js.UndefOr[`5` | `10` | `30`] = js.undefined
}
object ForwardControlProps {
  
  inline def apply(): ForwardControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardControlProps]
  }
  
  extension [Self <: ForwardControlProps](x: Self) {
    
    inline def setSeconds(value: `5` | `10` | `30`): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
