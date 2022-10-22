package typingsJapgolly.amapJsSdk.AMap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapType
  extends StObject
     with MapControl
object MapType {
  
  inline def apply(hide: Callback, show: Callback): MapType = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[MapType]
  }
}
