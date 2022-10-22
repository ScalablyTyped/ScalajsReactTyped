package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.vegaLiteStrings.mid
import typingsJapgolly.vegaLite.vegaLiteStrings.x
import typingsJapgolly.vegaLite.vegaLiteStrings.xc
import typingsJapgolly.vegaLite.vegaLiteStrings.y
import typingsJapgolly.vegaLite.vegaLiteStrings.yc
import typingsJapgolly.vegaLite.vegaLiteStrings.zeroOrMax
import typingsJapgolly.vegaLite.vegaLiteStrings.zeroOrMin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPosVgChannel extends StObject {
  
  var defaultPos: mid | zeroOrMin | zeroOrMax | Null
  
  var vgChannel: js.UndefOr[x | y | xc | yc] = js.undefined
}
object DefaultPosVgChannel {
  
  inline def apply(): DefaultPosVgChannel = {
    val __obj = js.Dynamic.literal(defaultPos = null)
    __obj.asInstanceOf[DefaultPosVgChannel]
  }
  
  extension [Self <: DefaultPosVgChannel](x: Self) {
    
    inline def setDefaultPos(value: mid | zeroOrMin | zeroOrMax): Self = StObject.set(x, "defaultPos", value.asInstanceOf[js.Any])
    
    inline def setDefaultPosNull: Self = StObject.set(x, "defaultPos", null)
    
    inline def setVgChannel(value: typingsJapgolly.vegaLite.vegaLiteStrings.x | y | xc | yc): Self = StObject.set(x, "vgChannel", value.asInstanceOf[js.Any])
    
    inline def setVgChannelUndefined: Self = StObject.set(x, "vgChannel", js.undefined)
  }
}
