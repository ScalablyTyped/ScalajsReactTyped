package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChanges extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  def ngOnChanges(changes: SimpleChanges): Unit
}
object OnChanges {
  
  inline def apply(ngOnChanges: SimpleChanges => Callback): OnChanges = {
    val __obj = js.Dynamic.literal(ngOnChanges = js.Any.fromFunction1((t0: SimpleChanges) => ngOnChanges(t0).runNow()))
    __obj.asInstanceOf[OnChanges]
  }
  
  extension [Self <: OnChanges](x: Self) {
    
    inline def setNgOnChanges(value: SimpleChanges => Callback): Self = StObject.set(x, "ngOnChanges", js.Any.fromFunction1((t0: SimpleChanges) => value(t0).runNow()))
  }
}
