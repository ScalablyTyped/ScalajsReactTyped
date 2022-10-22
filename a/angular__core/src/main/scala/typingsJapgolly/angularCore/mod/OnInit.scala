package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  def ngOnInit(): Unit
}
object OnInit {
  
  inline def apply(ngOnInit: Callback): OnInit = {
    val __obj = js.Dynamic.literal(ngOnInit = ngOnInit.toJsFn)
    __obj.asInstanceOf[OnInit]
  }
  
  extension [Self <: OnInit](x: Self) {
    
    inline def setNgOnInit(value: Callback): Self = StObject.set(x, "ngOnInit", value.toJsFn)
  }
}
